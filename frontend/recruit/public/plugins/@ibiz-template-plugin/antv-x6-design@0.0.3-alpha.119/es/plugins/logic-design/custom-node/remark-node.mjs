import '../../../node_modules/.pnpm/@antv_x6@2.18.1/node_modules/@antv/x6/es/index.mjs';
import { Namespace } from '@ibiz-template/core';
import { HTML } from '../../../node_modules/.pnpm/@antv_x6@2.18.1/node_modules/@antv/x6/es/shape/html.mjs';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class RemarkNode extends HTML {
  constructor(metadata = {}) {
    const data = metadata.data || {};
    const nodeSize = {
      width: data.width || 240,
      height: data.height || 120
    };
    super({
      ...nodeSize,
      // 初始数据
      data: {
        ...data
      },
      attrs: {
        foreignObject: nodeSize
      },
      // 标记为备注节点
      shape: "remark-node",
      ...metadata
    });
    /**
     * 输入数量
     *
     * @type {(number)}
     * @memberof RemarkNode
     */
    __publicField(this, "inputNum", 0);
    /**
     * 输出数量
     *
     * @type {(number)}
     * @memberof RemarkNode
     */
    __publicField(this, "outputNum", 0);
    this.setupEvents();
  }
  /**
   * @description 初始化事件监听
   * @private
   * @memberof RemarkNode
   */
  setupEvents() {
    this.on("selected", () => {
      this.setNodeEditable(true);
    });
    this.on("unselected", () => {
      this.setNodeEditable(false);
    });
    this.on("resizing", (size) => {
      this.setAttrs({
        foreignObject: size
      });
    });
  }
  get markup() {
    const ns = new Namespace("logic-node");
    const data = this.getData();
    return {
      tagName: "foreignObject",
      selector: "foreignObject",
      children: [
        {
          ns: "http://www.w3.org/1999/xhtml",
          tagName: "div",
          className: "".concat(ns.b("text-container")),
          selector: "container",
          style: { width: "100%", height: "100%" },
          children: [
            {
              tagName: "div",
              className: ns.b("remark"),
              textContent: data.memo,
              attrs: {
                id: this.id,
                // 添加唯一ID
                contenteditable: "false"
              }
            }
          ]
        }
      ]
    };
  }
  /**
   * @description 保存备注
   * @private
   * @memberof RemarkNode
   */
  saveMome() {
    var _a;
    const contentEl = document.getElementById(this.id);
    if (contentEl) {
      this.setData(
        {
          ...this.getData(),
          memo: contentEl.innerText
        },
        { silent: true }
      );
      (_a = this.model) == null ? void 0 : _a.graph.trigger("node:change:mome", { node: this });
    }
  }
  /**
   * @description 禁用键盘
   * - 禁止复制，粘贴，剪切，回车换行
   * @private
   * @param {KeyboardEvent} e
   * @memberof RemarkNode
   */
  disableKeyboardEvent(e) {
    if (e.key === "Enter" || (e.ctrlKey || e.metaKey) && (e.key === "c" || e.key === "v" || e.key === "x")) {
      e.preventDefault();
      e.stopPropagation();
    }
  }
  /**
   * @description 设置节点编辑状态
   * @private
   * @param {boolean} editable
   * @memberof RemarkNode
   */
  setNodeEditable(editable) {
    const contentEl = document.getElementById(this.id);
    if (contentEl && contentEl.contentEditable !== editable.toString()) {
      contentEl.contentEditable = editable.toString();
      if (editable) {
        contentEl.focus();
        contentEl.addEventListener("blur", this.saveMome.bind(this));
        contentEl.addEventListener(
          "keydown",
          this.disableKeyboardEvent.bind(this)
        );
      } else {
        contentEl.removeEventListener("blur", this.saveMome.bind(this));
        contentEl.removeEventListener(
          "keydown",
          this.disableKeyboardEvent.bind(this)
        );
      }
    }
  }
}

export { RemarkNode };
