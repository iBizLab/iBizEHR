import { resolveComponent, h } from 'vue';
import { UIActionProviderBase, formatMultiData, convertNavData } from '@ibiz-template/runtime';
import { notNilEmpty } from 'qx-util';

"use strict";
class ModelPasteProvider extends UIActionProviderBase {
  async execAction(action, args) {
    const { context, params, data, view } = args;
    if (!ibiz.modelClipboardImportView) {
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
    ibiz.modelClipboardPasteView.updateParams({
      codeName: entity.codeName,
      srfmodelv2scope: resultContext.srfmodelv2scope
    });
    const overlay = ibiz.overlay.createDrawer(
      (modal) => {
        return h(resolveComponent("IBizModelClipboardPasteView"), {
          modal,
          context: resultContext,
          params: resultParams
        });
      },
      void 0,
      { placement: "top", showClose: false }
    );
    overlay.present();
    await overlay.onWillDismiss();
    return { refresh: true, refreshMode: 1 };
  }
}

export { ModelPasteProvider };
