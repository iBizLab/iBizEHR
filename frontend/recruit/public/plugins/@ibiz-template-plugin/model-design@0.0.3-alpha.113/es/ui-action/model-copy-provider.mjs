import { resolveComponent, h } from 'vue';
import { UIActionProviderBase, formatMultiData, convertNavData } from '@ibiz-template/runtime';
import { notNilEmpty } from 'qx-util';

"use strict";
class ModelCopyProvider extends UIActionProviderBase {
  async execAction(action, args) {
    const { context, params, data, view } = args;
    if (!ibiz.modelClipboard) {
      return {};
    }
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
    const entity = await ibiz.hub.getAppDataEntity(
      view.model.appDataEntityId,
      view.model.appId
    );
    ibiz.modelClipboard.createItem({
      type: "advanced",
      title: "".concat(entity.logicName, "-").concat(entity.codeName),
      codeName: entity.codeName,
      items: data
    });
    const overlay = ibiz.overlay.createDrawer(
      (modal) => {
        return h(resolveComponent("IBizModelClipboard"), {
          modal,
          type: "advanced",
          context: resultContext,
          params: resultParams
        });
      },
      void 0,
      { placement: "right", width: 500, showClose: false }
    );
    overlay.present();
    await overlay.onWillDismiss();
    return {};
  }
}

export { ModelCopyProvider };
