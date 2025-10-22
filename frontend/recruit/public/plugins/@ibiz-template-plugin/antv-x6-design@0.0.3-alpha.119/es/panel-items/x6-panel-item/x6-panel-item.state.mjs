import { PanelItemState } from '@ibiz-template/runtime';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class X6PanelItemState extends PanelItemState {
  constructor() {
    super(...arguments);
    /**
     * 是否已经准备好
     *
     * @description 准备好时，已经有了x6的实例
     * @author chitanda
     * @date 2023-11-11 13:11:11
     * @type {boolean}
     */
    __publicField(this, "isReady", false);
    /**
     * @description 是否loading
     * @type {boolean}
     * @memberof X6PanelItemState
     */
    __publicField(this, "loading", false);
    /**
     * 逻辑所有者
     *
     * @author zhanghengfeng
     * @date 2025-03-17 19:03:54
     * @type {number}
     */
    __publicField(this, "logicHolder", 3);
  }
}

export { X6PanelItemState };
