import { resolveComponent, h } from 'vue';
import { UIActionProviderBase, formatMultiData, convertNavData, getUIActionById } from '@ibiz-template/runtime';
import { notNilEmpty } from 'qx-util';

"use strict";
class ModelCloneProvider extends UIActionProviderBase {
  async execAction(action, args) {
    const { context, params, data } = args;
    if (!Array.isArray(data) || data.length === 0) {
      return {};
    }
    const isMultiData = ["MULTIKEY", "MULTIDATA"].includes(action.actionTarget) && data.length > 0;
    const resultContext = context.clone();
    const navContexts = action.navigateContexts;
    if (notNilEmpty(navContexts)) {
      Object.assign(
        resultContext,
        convertNavData(
          navContexts,
          isMultiData ? formatMultiData(navContexts, data) : data[0] || {},
          params,
          context
        )
      );
    }
    const resultParams = {};
    const navParams = action.navigateParams;
    if (notNilEmpty(navParams)) {
      Object.assign(
        resultParams,
        convertNavData(
          navParams,
          isMultiData ? formatMultiData(navParams, data) : data[0] || {},
          params,
          context
        )
      );
    }
    const deCodeName = data[0].srfdecodename;
    const result = { cancel: true };
    try {
      const cloneAction = await getUIActionById(
        "".concat(deCodeName.toLowerCase(), "_clonemodelform@").concat(deCodeName.toLowerCase()),
        context.srfappid
      );
      if (cloneAction && cloneAction.deeditForm) {
        const overlay = ibiz.overlay.createModal(
          (modal) => {
            return h(resolveComponent("IBizModelClone"), {
              modal,
              item: data[0],
              params: resultParams,
              context: resultContext,
              modelData: cloneAction.deeditForm
            });
          },
          void 0,
          { width: "80%", height: "80%" }
        );
        overlay.present();
        const modalData = await overlay.onWillDismiss();
        result.cancel = modalData.ok !== true;
      } else {
        ibiz.message.error("[".concat(deCodeName, "] \u5B9E\u4F53\u672A\u652F\u6301\u6A21\u578B\u514B\u9686\uFF01"));
      }
    } catch (error) {
      ibiz.log.error(error);
      ibiz.message.error("[".concat(deCodeName, "] \u5B9E\u4F53\u672A\u652F\u6301\u6A21\u578B\u514B\u9686\uFF01"));
    }
    return result;
  }
}

export { ModelCloneProvider };
