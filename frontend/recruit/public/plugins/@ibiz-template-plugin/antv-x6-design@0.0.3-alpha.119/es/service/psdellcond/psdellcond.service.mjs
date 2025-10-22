import { DEService } from '@ibiz-template/runtime';
import { generateOrderValue } from 'qx-util';
import '../../entity/index.mjs';
import { PSDellCond } from '../../entity/psdellcond/pdellcond.mjs';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class PSDellCondService extends DEService {
  constructor(srfSessionId, model) {
    super(srfSessionId, model);
    /**
     * 类型代码表
     * @author lxm
     * @date 2023-12-27 05:06:47
     * @protected
     * @type {ICodeItem[]}
     */
    __publicField(this, "typeCodeItems");
    __publicField(this, "app");
    const app = ibiz.hub.getApp(model.appId);
    this.typeCodeItems = app.codeList.getCodeList(
      "Config__DELogicLinkCondType"
    ).codeItems;
    this.app = app;
  }
  newEntity(data) {
    if (data instanceof PSDellCond) {
      return data.clone();
    }
    return new PSDellCond(this.model, data, this.typeCodeItems);
  }
  async updateLogicLinkCount(context) {
    const service = await this.app.deService.getService(
      context,
      "logicdesign.psdelogiclink"
    );
    const res = await service.get(context);
    if (!res.ok || !res.data) {
      return;
    }
    const logicLink = res.data;
    const result = await this.exec("FetchCurLogicLink", {
      ...context,
      psdellcond: null
    });
    if (!result.ok) {
      return;
    }
    if (Array.isArray(result.data) && result.data.length > 0) {
      logicLink.linklogiccount = result.data.length;
      logicLink.psdellconds = result.data;
    } else {
      logicLink.linklogiccount = 0;
      logicLink.psdellconds = [];
    }
    const updateResult = await service.update(context, logicLink);
    if (updateResult.ok && updateResult.data) {
      const entity = updateResult.data;
      ibiz.mc.command.update.send(entity);
    }
  }
  /**
   * @description 填充默认数据
   * @protected
   * @param {IContext} context
   * @param {(IData | IData[])} params
   * @returns {*}  {Promise<void>}
   * @memberof PSDellCondService
   */
  async fillDefault(context, params) {
    const res = await this.fetchDefault(context);
    if (res && res.ok && Array.isArray(res.data)) {
      const orderValue = Math.max(
        ...res.data.map((item) => item.ordervalue || 0),
        0
      );
      const items = Array.isArray(params) ? params : [params];
      items.forEach((item, i) => {
        if (item.ordervalue == null) {
          item.ordervalue = orderValue + generateOrderValue(i);
        }
      });
    }
  }
  async exec(id, context, params, params2) {
    if (id === "create" && params) {
      await this.fillDefault(context, params);
    }
    const result = await super.exec(id, context, params, params2);
    if (id === "create" || id === "remove") {
      await this.updateLogicLinkCount(context);
    }
    return result;
  }
}

export { PSDellCondService };
