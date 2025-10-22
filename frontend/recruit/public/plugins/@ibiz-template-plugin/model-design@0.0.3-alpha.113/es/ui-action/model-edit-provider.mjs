import { resolveComponent, h } from 'vue';
import { UIActionProviderBase, SysUIActionTag, calcDeCodeNameById, formatMultiData, convertNavData } from '@ibiz-template/runtime';
import { createUUID, notNilEmpty } from 'qx-util';

"use strict";
class ModelEditProvider extends UIActionProviderBase {
  async execAction(action, args) {
    var _a;
    const { context, params, view, data } = args;
    const readonly = ((_a = action.uiactionParamJO) == null ? void 0 : _a.readonly) === "true";
    if (!readonly) {
      const uiDomain = ibiz.uiDomainManager.get(view.context.srfsessionid);
      if (uiDomain == null ? void 0 : uiDomain.dataModification) {
        const res = await view.call(SysUIActionTag.SAVE);
        if (!res && res !== null) {
          return {};
        }
      }
    }
    const isMultiData = ["MULTIKEY", "MULTIDATA"].includes(action.actionTarget) && data.length > 0;
    const resultContext = context.clone();
    const id = createUUID();
    const domain = ibiz.uiDomainManager.create(id);
    resultContext.srfsessionid = domain.id;
    const navContexts = [...action.navigateContexts || []];
    const deName = calcDeCodeNameById(view.model.appDataEntityId);
    if (deName && action.actionTarget !== "NONE") {
      const key = deName;
      const valueKey = "srfkey";
      navContexts.unshift({
        appId: view.model.appId,
        key,
        value: valueKey,
        rawValue: false
      });
    }
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
    const appEntity = await ibiz.hub.getAppDataEntity(
      view.model.appDataEntityId,
      view.model.appId
    );
    const overlay = ibiz.overlay.createDrawer(
      (modal) => {
        return h(resolveComponent("IBizModelEditView"), {
          modal,
          context: resultContext,
          params: resultParams,
          caption: view.model.caption || action.caption,
          codeName: appEntity == null ? void 0 : appEntity.codeName,
          readonly
        });
      },
      void 0,
      { placement: "top", showClose: false }
    );
    overlay.present();
    const result = await overlay.onWillDismiss();
    ibiz.uiDomainManager.destroy(id);
    const actionResult = {};
    if (result.ok && result.params && result.params.isSave) {
      actionResult.refresh = true;
      actionResult.refreshMode = 1;
    }
    return actionResult;
  }
}

export { ModelEditProvider };
