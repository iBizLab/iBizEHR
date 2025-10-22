import { PanelItemState } from '@ibiz-template/runtime';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class LocalVersionTagState extends PanelItemState {
  constructor() {
    super(...arguments);
    /**
     * 当前显示时间戳
     *
     * @author tony001
     * @date 2025-03-04 14:03:17
     * @type {number}
     */
    __publicField(this, "timestamp", Date.now());
    /**
     * 是否在保存中
     *
     * @author tony001
     * @date 2025-03-04 14:03:22
     * @type {boolean}
     */
    __publicField(this, "isSaveing", false);
    /**
     * 是否有修改
     *
     * @author tony001
     * @date 2025-03-07 17:03:35
     * @type {boolean}
     */
    __publicField(this, "isDirty", false);
  }
}

export { LocalVersionTagState };
