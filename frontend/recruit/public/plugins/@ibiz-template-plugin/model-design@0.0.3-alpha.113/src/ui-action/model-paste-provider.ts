/* eslint-disable @typescript-eslint/no-explicit-any */
import { h, resolveComponent } from 'vue';
import {
  IModal,
  IUIActionResult,
  IUILogicParams,
  UIActionProviderBase,
  convertNavData,
  formatMultiData,
} from '@ibiz-template/runtime';
import { IAppDEUIAction } from '@ibiz/model-core';
import { notNilEmpty } from 'qx-util';

export class ModelPasteProvider extends UIActionProviderBase {
  async execAction(
    action: IAppDEUIAction,
    args: IUILogicParams,
  ): Promise<IUIActionResult> {
    const { context, params, data, view } = args;
    if (!ibiz.modelClipboardImportView) {
      return {};
    }
    // 是否是多数据
    const isMultiData =
      ['MULTIKEY', 'MULTIDATA'].includes(action.actionTarget!) &&
      data.length > 0;
    // 处理自定义导航上下文
    const resultContext = context.clone();
    const navContexts = action.navigateContexts;
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
    const entity = await ibiz.hub.getAppDataEntity(
      view.model.appDataEntityId!,
      view.model.appId,
    );
    ibiz.modelClipboardPasteView.updateParams({
      codeName: entity.codeName,
      srfmodelv2scope: resultContext.srfmodelv2scope,
    });
    const overlay = ibiz.overlay.createDrawer(
      (modal: IModal) => {
        return h(resolveComponent('IBizModelClipboardPasteView'), {
          modal,
          context: resultContext,
          params: resultParams,
        });
      },
      undefined,
      { placement: 'top', showClose: false } as any,
    );
    overlay.present();
    await overlay.onWillDismiss();
    return { refresh: true, refreshMode: 1 };
  }
}
