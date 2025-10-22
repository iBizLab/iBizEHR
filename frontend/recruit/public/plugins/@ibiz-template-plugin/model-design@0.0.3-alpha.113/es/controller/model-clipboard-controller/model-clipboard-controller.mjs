import '../../model/index.mjs';
import '../../service/index.mjs';
import { ModelClipboardState } from './model-clipboard-state.mjs';
import { modelClipboardService } from '../../service/model-clipboard-service.mjs';
import { ClipboardData } from '../../model/clipboard-data.mjs';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class ModelClipboardController {
  constructor() {
    /**
     * 粘贴板状态
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:29
     */
    __publicField(this, "state", new ModelClipboardState());
    this.state.items = modelClipboardService.getModelDataItems();
  }
  /**
   * 新建模型至粘贴板
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:44
   * @param {IClipboardDataParams} data
   */
  createItem(data) {
    this.state.items.splice(0, 0, new ClipboardData(data));
    this.saveToStore();
  }
  /**
   * 存储数据至缓存
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:11
   */
  saveToStore() {
    modelClipboardService.saveModelDataItems(this.state.items);
  }
  /**
   * 根据唯一标识删除数据
   *
   * @param {string} uuid
   * @memberof ModelClipboardController
   */
  removeById(uuid) {
    const index = this.state.items.findIndex((item) => item.uuid === uuid);
    this.state.items.splice(index, 1);
    this.saveToStore();
  }
  /**
   * 清除所有数据
   *
   * @param {string} [type] 粘贴板数据类型
   * @memberof ModelClipboardController
   */
  clearAll(type) {
    this.state.items = this.state.items.filter((item) => item.type !== type);
    if (!this.state.items.length) {
      modelClipboardService.clearModelDataItems();
    } else {
      this.saveToStore();
    }
  }
}
const modelClipboardController = new ModelClipboardController();

export { ModelClipboardController, modelClipboardController };
