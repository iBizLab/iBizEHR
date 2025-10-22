import { ModelClipboardPasteViewState } from './model-clipboard-paste-view-state.mjs';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class ModelClipboardPasteViewController {
  constructor() {
    /**
     * 模型粘贴视图状态
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:00
     */
    __publicField(this, "state", new ModelClipboardPasteViewState());
  }
  /**
   * 更新参数
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:30
   * @param {IParams} params
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
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:09
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
const modelClipboardPasteViewController = new ModelClipboardPasteViewController();

export { ModelClipboardPasteViewController, modelClipboardPasteViewController };
