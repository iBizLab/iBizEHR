import { getEditorProvider } from '@ibiz-template/runtime';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class ModelTreeNodeController {
  /**
   * Creates an instance of ModelTreeRowState.
   * @param {IModelTreeNodeData} data
   * @memberof ModelTreeNodeController
   */
  constructor(data, context, params) {
    this.data = data;
    this.context = context;
    this.params = params;
    /**
     * 禁用
     *
     * @type {boolean}
     * @memberof ModelTreeNodeController
     */
    __publicField(this, "disabled", false);
    /**
     * 只读
     *
     * @type {boolean}
     * @memberof ModelTreeNodeController
     */
    __publicField(this, "readonly", false);
    /**
     * 编辑器控制器
     *
     * @type {IEditorController}
     * @memberof ModelTreeNodeController
     */
    __publicField(this, "editor");
    /**
     * 编辑器适配器
     *
     * @type {IEditorProvider}
     * @memberof ModelTreeNodeController
     */
    __publicField(this, "editorProvider");
    this.readonly = data._nodeType === "STATIC";
  }
  /**
   * 单位名称
   *
   * @readonly
   * @type {(string | undefined)}
   * @memberof ModelTreeNodeController
   */
  get unitName() {
    var _a;
    return (_a = this.data._model) == null ? void 0 : _a.unitName;
  }
  /**
   * 值格式化
   *
   * @readonly
   * @type {(string | undefined)}
   * @memberof ModelTreeNodeController
   */
  get valueFormat() {
    var _a;
    return (_a = this.data._model) == null ? void 0 : _a.valueFormat;
  }
  /**
   * 数据类型
   *
   * @readonly
   * @type {(number | undefined)}
   * @memberof ModelTreeNodeController
   */
  get dataType() {
    var _a;
    return (_a = this.data._model) == null ? void 0 : _a.dataType;
  }
  /**
   * 初始化
   *
   * @memberof ModelTreeNodeController
   */
  async init() {
    var _a, _b;
    if (((_a = this.data._model) == null ? void 0 : _a.editor) && ((_b = this.data._model) == null ? void 0 : _b.editor.editorType) !== "HIDDEN") {
      this.editorProvider = await getEditorProvider(this.data._model.editor);
      if (this.editorProvider) {
        this.editor = await this.editorProvider.createController(
          this.data._model.editor,
          this
        );
      }
    }
  }
}

export { ModelTreeNodeController };
