/* eslint-disable @typescript-eslint/no-explicit-any */
import { h, resolveComponent } from 'vue';
import {
  IModal,
  IModalData,
  IUIActionResult,
  IUILogicParams,
  SysUIActionTag,
  UIActionProviderBase,
  calcDeCodeNameById,
  convertNavData,
  formatMultiData,
} from '@ibiz-template/runtime';
import { IAppDEUIAction } from '@ibiz/model-core';
import { createUUID, notNilEmpty } from 'qx-util';

/**
 * dsl模型编辑
 *
 * @export
 * @class DSLModelEditProvider
 * @extends {UIActionProviderBase}
 */
export class DSLModelEditProvider extends UIActionProviderBase {
  async execAction(
    action: IAppDEUIAction,
    args: IUILogicParams,
  ): Promise<IUIActionResult> {
    const { context, params, view, data } = args;
    const readonly = action.uiactionParamJO?.readonly === 'true';
    if (!readonly) {
      const uiDomain = ibiz.uiDomainManager.get(view.context.srfsessionid);
      if (uiDomain?.dataModification) {
        const res = await view.call(SysUIActionTag.SAVE);

        // 适配编辑视图保存成功后返回值为null
        if (!res && res !== null) {
          return {};
        }
      }
    }
    // 是否是多数据
    const isMultiData =
      ['MULTIKEY', 'MULTIDATA'].includes(action.actionTarget!) &&
      data.length > 0;
    // 处理自定义导航上下文
    const resultContext = context.clone();
    const id = createUUID();
    const domain = ibiz.uiDomainManager.create(id);
    resultContext.srfsessionid = domain.id;
    const navContexts = [...(action.navigateContexts || [])];
    const deName = calcDeCodeNameById(view.model.appDataEntityId!);
    if (deName && action.actionTarget !== 'NONE') {
      const key = deName;
      const valueKey = 'srfkey';
      navContexts.unshift({
        appId: view.model.appId,
        key,
        value: valueKey,
        rawValue: false,
      });
    }
    if (notNilEmpty(navContexts)) {
      Object.assign(
        resultContext,
        convertNavData(
          navContexts,
          isMultiData ? formatMultiData(navContexts, data) : data[0] || {},
          params,
          context,
        ),
      );
    }
    // 处理自定义导航参数
    const resultParams = {};
    const navParams = action.navigateParams;
    if (notNilEmpty(navParams)) {
      Object.assign(
        resultParams,
        convertNavData(
          navParams,
          isMultiData ? formatMultiData(navParams, data) : data[0] || {},
          params,
          context,
        ),
      );
    }
    const appEntity = await ibiz.hub.getAppDataEntity(
      view.model.appDataEntityId!,
      view.model.appId,
    );
    const overlay = ibiz.overlay.createDrawer(
      (modal: IModal) => {
        return h(resolveComponent('IBizDSLModelEditView'), {
          modal,
          context: resultContext,
          params: resultParams,
          caption: view.model.caption || action.caption,
          codeName: appEntity?.codeName,
          readonly,
        });
      },
      undefined,
      { placement: 'top', showClose: false } as any,
    );
    overlay.present();
    const result: IModalData = await overlay.onWillDismiss();
    ibiz.uiDomainManager.destroy(id);
    const actionResult: IUIActionResult = {};
    if (result.ok && result.params && result.params.isSave) {
      actionResult.refresh = true;
      actionResult.refreshMode = 1;
    }
    return actionResult;
  }
}
