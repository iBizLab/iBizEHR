import { resolveComponent, h } from 'vue';
import { UIActionProviderBase, formatMultiData, convertNavData } from '@ibiz-template/runtime';
import { notNilEmpty } from 'qx-util';

"use strict";
class OpenModelRuntimeProvider extends UIActionProviderBase {
  async execAction(action, args) {
    const { context, params, data, view } = args;
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
    const overlay = ibiz.overlay.createDrawer(
      (modal) => {
        return h(resolveComponent("IBizModelRuntime"), {
          modal,
          entity,
          context: resultContext,
          params: resultParams
        });
      },
      void 0,
      { placement: "top", showClose: false }
    );
    overlay.present();
    await overlay.onWillDismiss();
    return {};
  }
}

export { OpenModelRuntimeProvider };
