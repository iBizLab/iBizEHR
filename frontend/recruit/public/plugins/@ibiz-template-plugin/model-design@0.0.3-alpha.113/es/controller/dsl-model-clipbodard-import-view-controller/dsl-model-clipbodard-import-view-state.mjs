"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class DSLModelClipboardImportViewState {
  constructor() {
    /**
     * 是否正在加载
     *
     * @type {boolean}
     * @memberof ModelClipboardImportViewState
     */
    __publicField(this, "isLoading", false);
    /**
     * 已拖入的剪切板数据
     *
     * @type {ClipboardData[]}
     * @memberof ModelClipboardImportViewState
     */
    __publicField(this, "items", []);
    /**
     * 已导入的模型
     *
     * @type {IData[]}
     * @memberof ModelClipboardImportViewState
     */
    __publicField(this, "importItems", []);
    /**
     * 当前编辑的模型
     *
     * @type {IData[]}
     * @memberof ModelClipboardImportViewState
     */
    __publicField(this, "models", []);
    /**
     * 模型json
     *
     * @type {string}
     * @memberof ModelClipboardImportViewState
     */
    __publicField(this, "modelStr", "");
    /**
     * 是否在代码编辑器更改过模型json
     *
     * @type {boolean}
     * @memberof ModelClipboardImportViewState
     */
    __publicField(this, "isModelChange", false);
    /**
     * 参数
     *
     * @type {IData}
     * @memberof ModelClipboardImportViewState
     */
    __publicField(this, "params", {});
  }
}

export { DSLModelClipboardImportViewState };
