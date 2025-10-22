import { IDEFormItem } from '@ibiz/model-core';
import { IModelTreeNodeData, IModelTreeNodeOpt } from '../interface';
/**
 * 模型树节点数据
 *
 * @export
 * @class ModelTreeNodeData
 * @implements {IModelTreeNodeData}
 */
export declare class ModelTreeNodeData implements IModelTreeNodeData {
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
    _nodeType: 'STATIC' | 'DE' | 'JSONSCHEMA';
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
    _leaf: boolean;
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
    constructor(data: IData | IData[], prentNodeData: IModelTreeNodeData | undefined, opts: IModelTreeNodeOpt);
    /**
     * 计算节点标签
     *
     * @protected
     * @return {*}  {string}
     * @memberof ModelTreeNodeData
     */
    protected calcLabel(_label?: string): string | undefined;
    /**
     * 计算节点数据类型
     *
     * @protected
     * @return {*}  {('VARIABLE' | 'ARRAY' | 'OBJECT')}
     * @memberof ModelTreeNodeData
     */
    protected calcIcon(): 'VARIABLE' | 'ARRAY' | 'OBJECT';
}
