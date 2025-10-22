"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class ModelClipboardImportViewState {
  constructor() {
    /**
     * 是否正在加载
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:11
     * @type {boolean}
     */
    __publicField(this, "isLoading", false);
    /**
     * 已拖入的剪切板数据
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:22
     * @type {ClipboardData[]}
     */
    __publicField(this, "items", []);
    /**
     * 已导入的模型
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:38
     * @type {IData[]}
     */
    __publicField(this, "importItems", []);
    /**
     * 当前编辑的模型
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:13
     * @type {IData[]}
     */
    __publicField(this, "models", []);
    /**
     * 模型json
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:58
     * @type {string}
     */
    __publicField(this, "modelStr", "");
    /**
     * 是否在代码编辑器更改过模型json
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:31
     * @type {boolean}
     */
    __publicField(this, "isModelChange", false);
    /**
     * 参数
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:45
     * @type {IData}
     */
    __publicField(this, "params", {});
  }
}

export { ModelClipboardImportViewState };
