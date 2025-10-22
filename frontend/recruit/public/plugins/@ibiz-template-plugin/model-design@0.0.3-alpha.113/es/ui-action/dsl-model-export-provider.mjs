import { resolveComponent, h } from 'vue';
import { UIActionProviderBase, formatMultiData, convertNavData } from '@ibiz-template/runtime';
import { notNilEmpty } from 'qx-util';

"use strict";
class DSLModelExportProvider extends UIActionProviderBase {
  async execAction(action, args) {
    const { context, params, data, view } = args;
    if (!ibiz.modelClipboard)
      return {};
    if (!Array.isArray(data) || data.length === 0)
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
    let resultParams = {};
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
    if (Object.keys(resultParams).length) {
      Object.keys(resultParams).forEach((key) => {
        if (["true", "false"].includes(resultParams[key].toLowerCase())) {
          resultParams[key] = resultParams[key].toLowerCase() === "true";
        }
      });
      resultParams = this.transformObject(resultParams);
    }
    const entity = await ibiz.hub.getAppDataEntity(
      view.model.appDataEntityId,
      view.model.appId
    );
    ibiz.modelClipboard.createItem({
      type: "dsl",
      title: "".concat(entity.logicName, "-").concat(entity.codeName),
      codeName: entity.codeName,
      items: data
    });
    const overlay = ibiz.overlay.createDrawer(
      (modal) => {
        return h(resolveComponent("IBizDSLModelClipboard"), {
          modal,
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
  /**
   * @description 将层级参数转化为对象参数
   * @param {IData} input
   * @returns {*}
   * @memberof DSLModelExportProvider
   */
  transformObject(input) {
    return Object.entries(input).reduce((acc, [key, value]) => {
      const parts = key.split(".");
      const last = parts.pop();
      const nested = parts.reduce((obj, part) => {
        return obj[part] = obj[part] || {};
      }, acc);
      nested[last] = value;
      return acc;
    }, {});
  }
}

export { DSLModelExportProvider };
