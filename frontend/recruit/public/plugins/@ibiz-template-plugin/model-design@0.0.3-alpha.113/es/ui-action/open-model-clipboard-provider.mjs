import { resolveComponent, h } from 'vue';
import { UIActionProviderBase, formatMultiData, convertNavData } from '@ibiz-template/runtime';
import { notNilEmpty } from 'qx-util';

"use strict";
class OpenModelClipboardProvider extends UIActionProviderBase {
  async execAction(action, args) {
    const { context, params, data } = args;
    if (!ibiz.modelClipboard)
      return {};
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
    const overlay = ibiz.overlay.createDrawer(
      (modal) => {
        return h(
          resolveComponent(
            resultParams.type === "dsl" ? "IBizDSLModelClipboard" : "IBizModelClipboard"
          ),
          {
            modal,
            type: resultParams.type,
            context: resultContext,
            params: resultParams
          }
        );
      },
      void 0,
      { placement: "right", width: 500, showClose: false }
    );
    overlay.present();
    await overlay.onWillDismiss();
    return {};
  }
}

export { OpenModelClipboardProvider };
