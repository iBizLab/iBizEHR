"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class ModelClipboardService {
  constructor() {
    /**
     * 缓存识别码
     *
     * @author zhanghengfeng
     * @date 2024-10-25 19:10:21
     * @private
     * @type {string}
     */
    __publicField(this, "localStorageKey", "ModelClipboardCache");
  }
  /**
   * 获取缓存模型数据项
   *
   * @author zhanghengfeng
   * @date 2024-10-25 19:10:36
   * @return {*}  {ClipboardData[]}
   */
  getModelDataItems() {
    const items = window.localStorage.getItem(this.localStorageKey);
    try {
      if (items) {
        const modelDataItems = JSON.parse(items);
        if (Array.isArray(modelDataItems)) {
          return modelDataItems;
        }
        return [];
      }
    } catch (err) {
      ibiz.log.error(err);
    }
    return [];
  }
  /**
   * 设置缓存模型数据项
   *
   * @author zhanghengfeng
   * @date 2024-10-25 19:10:23
   * @param {ClipboardData[]} items
   */
  saveModelDataItems(items) {
    localStorage.setItem(this.localStorageKey, JSON.stringify(items));
  }
  /**
   * 清空缓存模型数据项
   *
   * @author zhanghengfeng
   * @date 2024-10-25 19:10:46
   */
  clearModelDataItems() {
    localStorage.removeItem(this.localStorageKey);
  }
}
const modelClipboardService = new ModelClipboardService();

export { ModelClipboardService, modelClipboardService };
