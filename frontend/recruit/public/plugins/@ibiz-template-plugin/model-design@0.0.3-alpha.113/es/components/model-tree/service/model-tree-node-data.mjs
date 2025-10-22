"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class ModelTreeNodeData {
  /**
   * Creates an instance of ModelTreeNodeData.
   * @param {(IData | IData[])} data
   * @param {(IModelTreeNodeData | undefined)} prentNodeData
   * @param {IModelTreeNodeOpt} opts
   * @memberof ModelTreeNodeData
   */
  constructor(data, prentNodeData, opts) {
    /**
     * 数据唯一标识
     *
     * @type {string}
     * @memberof ModelTreeNodeData
     */
    __publicField(this, "_id");
    /**
     * 节点显示名称
     *
     * @type {string}
     * @memberof ModelTreeNodeData
     */
    __publicField(this, "_text");
    /**
     * 节点类型
     *
     * @type {('STATIC' | 'DE' | 'JSONSCHEMA')}
     * @memberof ModelTreeNodeData
     */
    __publicField(this, "_nodeType");
    /**
     * 节点标识
     *
     * @type {string}
     * @memberof ModelTreeNodeData
     */
    __publicField(this, "_nodeId");
    /**
     * 是否为叶子节点
     *
     * @type {boolean}
     * @memberof ModelTreeNodeData
     */
    __publicField(this, "_leaf");
    /**
     * 原始数据
     *
     * @type {(IData | IData[])}
     * @memberof ModelTreeNodeData
     */
    __publicField(this, "_data");
    /**
     * 节点图标
     *
     * @type {('VARIABLE' | 'ARRAY' | 'OBJECT')}
     * @memberof ModelTreeNodeData
     */
    __publicField(this, "_icon");
    /**
     * 引用应用实体标识
     *
     * @type {string}
     * @memberof ModelTreeNodeData
     */
    __publicField(this, "_refAppDataEntityId");
    /**
     * 节点标签
     *
     * @type {string}
     * @memberof ModelTreeNodeData
     */
    __publicField(this, "_label");
    /**
     * 节点的值
     *
     * @type {(string | IData | IData[])}
     * @memberof ModelTreeNodeData
     */
    __publicField(this, "_value");
    /**
     * 表单项模型
     *
     * @type {IEditor}
     * @memberof ModelTreeNodeData
     */
    __publicField(this, "_model");
    /**
     * 父节点
     *
     * @type {IModelTreeNodeData}
     * @memberof ModelTreeNodeData
     */
    __publicField(this, "_parent");
    /**
     * 子节点集合
     *
     * @type {IModelTreeNodeData[]}
     * @memberof ModelTreeNodeData
     */
    __publicField(this, "_children");
    var _a;
    const { id, model, text, label, refAppDataEntityId } = opts;
    this._nodeId = id;
    this._data = data;
    this._model = model;
    this._parent = prentNodeData;
    this._id = this._parent ? "".concat(this._parent._id, ".").concat(id) : "ROOT.".concat(id);
    Object.defineProperty(this, "_value", {
      get() {
        return this._data[this._nodeId];
      },
      set(v) {
        this._data[this._nodeId] = v;
      },
      enumerable: true,
      configurable: true
    });
    Object.defineProperty(this, "_leaf", {
      get() {
        let isLeaf = true;
        if (Array.isArray(this._value) || this._value !== null && typeof this._value === "object") {
          isLeaf = false;
        }
        return isLeaf;
      },
      set(_v) {
      },
      enumerable: true,
      configurable: true
    });
    Object.defineProperty(this, "_nodeType", {
      get() {
        var _a2, _b;
        let nodeType = "STATIC";
        switch (this._nodeId) {
          case "model":
            nodeType = "JSONSCHEMA";
            break;
          case "requires":
          case "_children":
            nodeType = "DE";
            break;
          default:
            if (((_a2 = this._parent) == null ? void 0 : _a2._nodeType) === "DE" || ((_b = this._parent) == null ? void 0 : _b._nodeType) === "JSONSCHEMA") {
              nodeType = "JSONSCHEMA";
            }
            break;
        }
        return nodeType;
      },
      set(_v) {
      },
      enumerable: true,
      configurable: true
    });
    this._text = text;
    this._label = this.calcLabel(label);
    this._icon = this.calcIcon();
    this._refAppDataEntityId = refAppDataEntityId || ((_a = this._parent) == null ? void 0 : _a._refAppDataEntityId);
    return new Proxy(this, {
      set(target, p, value) {
        target[p] = value;
        return true;
      },
      get(target, p, _receiver) {
        return target[p];
      }
    });
  }
  /**
   * 计算节点标签
   *
   * @protected
   * @return {*}  {string}
   * @memberof ModelTreeNodeData
   */
  calcLabel(_label) {
    let label = "";
    switch (this._nodeId) {
      case "modeltype":
        label = "\u6A21\u578B\u7C7B\u578B";
        break;
      case "model":
        label = "\u5F53\u524D\u6A21\u578B";
        break;
      case "requires":
        label = "\u5173\u8054\u6A21\u578B";
        break;
      case "_children":
        label = "\u5B50\u6A21\u578B";
        break;
      default:
        label = _label;
        break;
    }
    return label;
  }
  /**
   * 计算节点数据类型
   *
   * @protected
   * @return {*}  {('VARIABLE' | 'ARRAY' | 'OBJECT')}
   * @memberof ModelTreeNodeData
   */
  calcIcon() {
    let icon = "VARIABLE";
    if (Array.isArray(this._value)) {
      icon = "ARRAY";
    } else if (this._value !== null && typeof this._value === "object") {
      icon = "OBJECT";
    }
    return icon;
  }
}

export { ModelTreeNodeData };
