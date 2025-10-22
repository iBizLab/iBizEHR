/* eslint-disable no-constructor-return */
import { IDEFormItem } from '@ibiz/model-core';
import { IModelTreeNodeData, IModelTreeNodeOpt } from '../interface';

/**
 * 模型树节点数据
 *
 * @export
 * @class ModelTreeNodeData
 * @implements {IModelTreeNodeData}
 */
export class ModelTreeNodeData implements IModelTreeNodeData {
  /**
   * 数据唯一标识
   *
   * @type {string}
   * @memberof ModelTreeNodeData
   */
  _id: string;

  /**
   * 节点显示名称
   *
   * @type {string}
   * @memberof ModelTreeNodeData
   */
  _text: string;

  /**
   * 节点类型
   *
   * @type {('STATIC' | 'DE' | 'JSONSCHEMA')}
   * @memberof ModelTreeNodeData
   */
  _nodeType!: 'STATIC' | 'DE' | 'JSONSCHEMA';

  /**
   * 节点标识
   *
   * @type {string}
   * @memberof ModelTreeNodeData
   */
  _nodeId: string;

  /**
   * 是否为叶子节点
   *
   * @type {boolean}
   * @memberof ModelTreeNodeData
   */
  _leaf!: boolean;

  /**
   * 原始数据
   *
   * @type {(IData | IData[])}
   * @memberof ModelTreeNodeData
   */
  _data: IData | IData[];

  /**
   * 节点图标
   *
   * @type {('VARIABLE' | 'ARRAY' | 'OBJECT')}
   * @memberof ModelTreeNodeData
   */
  _icon: 'VARIABLE' | 'ARRAY' | 'OBJECT';

  /**
   * 引用应用实体标识
   *
   * @type {string}
   * @memberof ModelTreeNodeData
   */
  _refAppDataEntityId: string;

  /**
   * 节点标签
   *
   * @type {string}
   * @memberof ModelTreeNodeData
   */
  _label?: string;

  /**
   * 节点的值
   *
   * @type {(string | IData | IData[])}
   * @memberof ModelTreeNodeData
   */
  _value?: string | IData | IData[];

  /**
   * 表单项模型
   *
   * @type {IEditor}
   * @memberof ModelTreeNodeData
   */
  _model?: IDEFormItem;

  /**
   * 父节点
   *
   * @type {IModelTreeNodeData}
   * @memberof ModelTreeNodeData
   */
  _parent?: IModelTreeNodeData;

  /**
   * 子节点集合
   *
   * @type {IModelTreeNodeData[]}
   * @memberof ModelTreeNodeData
   */
  _children?: IModelTreeNodeData[];

  /**
   * Creates an instance of ModelTreeNodeData.
   * @param {(IData | IData[])} data
   * @param {(IModelTreeNodeData | undefined)} prentNodeData
   * @param {IModelTreeNodeOpt} opts
   * @memberof ModelTreeNodeData
   */
  constructor(
    data: IData | IData[],
    prentNodeData: IModelTreeNodeData | undefined,
    opts: IModelTreeNodeOpt,
  ) {
    const { id, model, text, label, refAppDataEntityId } = opts;
    this._nodeId = id;
    this._data = data;
    this._model = model;
    this._parent = prentNodeData;
    this._id = this._parent ? `${this._parent._id}.${id}` : `ROOT.${id}`;

    // value值
    Object.defineProperty(this, '_value', {
      get() {
        return this._data[this._nodeId];
      },
      set(v) {
        this._data[this._nodeId] = v;
      },
      enumerable: true,
      configurable: true,
    });

    // leaf
    Object.defineProperty(this, '_leaf', {
      get() {
        let isLeaf: boolean = true;
        if (
          Array.isArray(this._value) ||
          (this._value !== null && typeof this._value === 'object')
        ) {
          isLeaf = false;
        }
        return isLeaf;
      },
      set(_v) {},
      enumerable: true,
      configurable: true,
    });

    // nodeType
    Object.defineProperty(this, '_nodeType', {
      get() {
        let nodeType: 'STATIC' | 'DE' | 'JSONSCHEMA' = 'STATIC';
        switch (this._nodeId) {
          case 'model':
            nodeType = 'JSONSCHEMA';
            break;
          case 'requires':
          case '_children':
            nodeType = 'DE';
            break;
          default:
            if (
              this._parent?._nodeType === 'DE' ||
              this._parent?._nodeType === 'JSONSCHEMA'
            ) {
              nodeType = 'JSONSCHEMA';
            }
            break;
        }
        return nodeType;
      },
      set(_v) {},
      enumerable: true,
      configurable: true,
    });
    this._text = text;
    this._label = this.calcLabel(label);
    this._icon = this.calcIcon();
    this._refAppDataEntityId =
      refAppDataEntityId || this._parent?._refAppDataEntityId!;

    return new Proxy<ModelTreeNodeData>(this, {
      set(target, p, value): boolean {
        target[p] = value;
        return true;
      },
      get(target, p, _receiver): unknown {
        return target[p];
      },
    });
  }

  /**
   * 计算节点标签
   *
   * @protected
   * @return {*}  {string}
   * @memberof ModelTreeNodeData
   */
  protected calcLabel(_label?: string): string | undefined {
    let label: string | undefined = '';
    switch (this._nodeId) {
      case 'modeltype':
        label = '模型类型';
        break;
      case 'model':
        label = '当前模型';
        break;
      case 'requires':
        label = '关联模型';
        break;
      case '_children':
        label = '子模型';
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
  protected calcIcon(): 'VARIABLE' | 'ARRAY' | 'OBJECT' {
    let icon: 'VARIABLE' | 'ARRAY' | 'OBJECT' = 'VARIABLE';
    if (Array.isArray(this._value)) {
      icon = 'ARRAY';
    } else if (this._value !== null && typeof this._value === 'object') {
      icon = 'OBJECT';
    }
    return icon;
  }
}
