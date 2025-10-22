"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class ModelClipboardState {
  constructor() {
    /**
     * 粘贴板数据
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:59
     * @type {ModelData[]}
     */
    __publicField(this, "items", []);
  }
}

export { ModelClipboardState };
