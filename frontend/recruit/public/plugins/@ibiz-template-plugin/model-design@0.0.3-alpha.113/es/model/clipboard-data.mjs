import { createUUID } from 'qx-util';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class ClipboardData {
  /**
   * Creates an instance of ModelData.
   * @param {IClipboardParams} data
   * @memberof ModelData
   */
  constructor(data) {
    /**
     * 唯一标识
     *
     * @type {string}
     * @memberof ClipboardData
     */
    __publicField(this, "uuid", createUUID());
    /**
     * 创建时间
     *
     * @type {string}
     * @memberof ClipboardData
     */
    __publicField(this, "createdDate", (/* @__PURE__ */ new Date()).toLocaleString(void 0, { hour12: false }));
    /**
     * 呈现标题
     *
     * @type {string}
     * @memberof ClipboardData
     */
    __publicField(this, "title", "");
    /**
     * 是否已经导出模型至当前数据
     *
     * @type {boolean}
     * @memberof ClipboardData
     */
    __publicField(this, "isExport", false);
    /**
     * 是否导出报错
     *
     * @type {boolean}
     * @memberof ClipboardData
     */
    __publicField(this, "isError", false);
    /**
     * 导出异常时的错误信息
     *
     * @type {string}
     * @memberof ClipboardData
     */
    __publicField(this, "errorInfo");
    /**
     * 实体codeName
     *
     * @type {string}
     * @memberof ClipboardData
     */
    __publicField(this, "codeName");
    /**
     * 剪切板源数据
     *
     * @type {IData[]}
     * @memberof ClipboardData
     */
    __publicField(this, "items", []);
    /**
     * 模型数据
     *
     * @type {IModelData[]}
     * @memberof ClipboardData
     */
    __publicField(this, "models", []);
    /**
     * 模型类型
     *
     * @type {('default' | 'advanced' | 'dsl')} （默认模型） | （高级模型） | （dsl模型）
     * @memberof ClipboardData
     */
    __publicField(this, "type", "default");
    /**
     * 是否选中
     *
     * @type {boolean}
     * @memberof ClipboardData
     */
    __publicField(this, "isSelected", false);
    /**
     * 是否合并模型
     *
     * @type {boolean}
     * @memberof ClipboardData
     */
    __publicField(this, "isMerge", false);
    var _a, _b;
    this.title = data.title;
    this.codeName = data.codeName;
    this.type = data.type || "default";
    this.isMerge = data.isMerge || false;
    if ((_a = data.items) == null ? void 0 : _a.length)
      this.items = data.items;
    if ((_b = data.models) == null ? void 0 : _b.length) {
      if (!this.isMerge)
        this.isExport = true;
      this.models = data.models;
    }
  }
}

export { ClipboardData };
