import { h, resolveComponent } from 'vue';
import {
  IModal,
  IModalData,
  IUIActionResult,
  IUILogicParams,
  UIActionProviderBase,
  convertNavData,
  formatMultiData,
  getUIActionById,
} from '@ibiz-template/runtime';
import { IAppDEUIAction } from '@ibiz/model-core';
import { notNilEmpty } from 'qx-util';

export class ModelCloneProvider extends UIActionProviderBase {
  async execAction(
    action: IAppDEUIAction,
    args: IUILogicParams,
  ): Promise<IUIActionResult> {
    const { context, params, data } = args;
    if (!Array.isArray(data) || data.length === 0) {
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
    const deCodeName = data[0].srfdecodename;
    const result: IUIActionResult = { cancel: true };
    try {
      const cloneAction = await getUIActionById(
        `${deCodeName.toLowerCase()}_clonemodelform@${deCodeName.toLowerCase()}`,
        context.srfappid,
      );
      if (cloneAction && cloneAction.deeditForm) {
        const overlay = ibiz.overlay.createModal(
          (modal: IModal) => {
            return h(resolveComponent('IBizModelClone'), {
              modal,
              item: data[0],
              params: resultParams,
              context: resultContext,
              modelData: cloneAction.deeditForm,
            });
          },
          undefined,
          { width: '80%', height: '80%' },
        );
        overlay.present();
        const modalData: IModalData = await overlay.onWillDismiss();
        result.cancel = modalData.ok !== true;
      } else {
        ibiz.message.error(`[${deCodeName}] 实体未支持模型克隆！`);
      }
    } catch (error) {
      ibiz.log.error(error);
      ibiz.message.error(`[${deCodeName}] 实体未支持模型克隆！`);
    }
    return result;
  }
}
