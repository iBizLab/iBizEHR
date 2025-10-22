import { IDEFormItem } from '@ibiz/model-core';

/**
 * 模型树节点数据接口
 *
 * @export
 * @interface IModelTreeNodeData
 */
export interface IModelTreeNodeData {
  /**
   * 数据唯一标识
   *
   * @type {string}
   * @memberof IModelTreeNodeData
   */
  _id: string;

  /**
   * 节点显示名称
   *
   * @type {string}
   * @memberof IModelTreeNodeData
   */
  _text: string;

  /**
   * 节点标签
   *
   * @type {string}
   * @memberof IModelTreeNodeData
   */
  _label?: string;

  /**
   * 节点类型
   *
   * @type {('STATIC' | 'DE' | 'JSONSCHEMA')} （静态 | 应用实体 | JSONSCHEMA）
   * @memberof IModelTreeNodeData
   */
  _nodeType: 'STATIC' | 'DE' | 'JSONSCHEMA';

  /**
   * 节点标识
   *
   * @type {string}
   * @memberof IModelTreeNodeData
   */
  _nodeId: string;

  /**
   * 节点图标
   *
   * @type {('VARIABLE' | 'ARRAY' | 'OBJECT')}（变量 | 数组 | 对象）
   * @memberof IModelTreeNodeData
   */
  _icon: 'VARIABLE' | 'ARRAY' | 'OBJECT';

  /**
   * 是否为叶子节点
   *
   * @type {boolean}
   * @memberof IModelTreeNodeData
   */
  _leaf: boolean;

  /**
   * 原始数据
   *
   * @type {IData | IData[]}
   * @memberof IModelTreeNodeData
   */
  _data: IData | IData[];

  /**
   * 引用应用实体标识
   *
   * @type {string}
   * @memberof IModelTreeNodeData
   */
  _refAppDataEntityId: string;

  /**
   * 节点的值
   *
   * @type {(string | IData | IData[])}
   * @memberof IModelTreeNodeData
   */
  _value?: string | IData | IData[];

  /**
   * 表单项模型
   *
   * @type {IDEFormItem}
   * @memberof IModelTreeNodeData
   */
  _model?: IDEFormItem;

  /**
   * 父节点数据
   *
   * @type {IModelTreeNodeData}
   * @memberof IModelTreeNodeData
   */
  _parent?: IModelTreeNodeData;

  /**
   * 子节点集合
   *
   * @type {IModelTreeNodeData[]}
   * @memberof IModelTreeNodeData
   */
  _children?: IModelTreeNodeData[];
}
