import { DSLModelClipboardImportViewState } from './dsl-model-clipbodard-import-view-state.mjs';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class DSLModelClipboardImportViewController {
  constructor() {
    /**
     * 模型导入视图状态
     *
     * @memberof DSLModelClipboardImportViewController
     */
    __publicField(this, "state", new DSLModelClipboardImportViewState());
  }
  /**
   * 更新参数
   *
   * @param {IParams} params
   * @memberof DSLModelClipboardImportViewController
   */
  updateParams(params) {
    if (params && !Object.is(JSON.stringify(params), JSON.stringify(this.state.params))) {
      this.state.params = params;
      this.clearAllData();
    }
  }
  /**
   * 清理数据
   *
   * @memberof DSLModelClipboardImportViewController
   */
  clearAllData() {
    this.state.isLoading = false;
    this.state.items = [];
    this.state.importItems = [];
    this.state.models = [];
    this.state.modelStr = "";
    this.state.isModelChange = false;
  }
}
const dslModelClipboardImportViewController = new DSLModelClipboardImportViewController();

export { DSLModelClipboardImportViewController, dslModelClipboardImportViewController };
