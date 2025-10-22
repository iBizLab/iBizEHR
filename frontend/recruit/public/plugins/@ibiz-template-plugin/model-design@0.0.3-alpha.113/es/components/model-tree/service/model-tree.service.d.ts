import { Ref } from 'vue';
import { IAppDataEntity, IDEFormItem } from '@ibiz/model-core';
import { IModelData } from '../../../interface';
import { IEntityField, IModelTreeNodeData } from '../interface';
import { ModelTreeNodeData } from './model-tree-node-data';
/**
 * 模型树服务
 *
 * @export
 * @class ModelTreeService
 */
export declare class ModelTreeService {
    private context;
    private data;
    /**
     * 实体-属性信息 缓存map
     *
     * @private
     * @type {Map<string, IEntityField[]>}Map<实体标识, 实体属性信息>
     * @memberof ModelTreeService
     */
    private entityFeildMap;
    /**
     * 实体-属性表单项模型 缓存map
     *
     * @private
     * @type {Map<string, IDEFormItem[]>}Map<实体标识, 实体属性表单项模型>
     * @memberof ModelTreeService
     */
    private entityFieldItemMap;
    /**
     * Creates an instance of ModelTreeService.
     * @param {IModelData[]} data
     * @memberof ModelTreeService
     */
    constructor(context: IContext, data: Ref<IModelData[]>);
    /**
     * 获取子节点数据
     *
     * @return {*}  {(ITreeNode[])}
     * @memberof ModelTreeService
     */
    fetchChildNodes(prentNodeData?: IModelTreeNodeData): Promise<IModelTreeNodeData[]>;
    /**
     * 获取根节点数据
     *
     * @return {*}  {ITreeNode[]}
     * @memberof ModelTreeService
     */
    protected getRootNodeData(): Promise<IModelTreeNodeData[]>;
    /**
     * 获取子项数据
     *
     * @param {IModelTreeNodeData} prentNodeData
     * @return {*}  {IModelTreeNodeData[]}
     * @memberof ModelTreeService
     */
    protected getChildrenNodeData(prentNodeData: IModelTreeNodeData): Promise<IModelTreeNodeData[]>;
    /**
     * 获取模型节点数据
     *
     * @protected
     * @param {(string | number)} key
     * @param {(IData | IData[])} data
     * @param {IModelTreeNodeData} [prentNodeData]
     * @return {*}  {Promise<ModelTreeNodeData>}
     * @memberof ModelTreeService
     */
    protected getModelTreeNodeData(key: string | number, data: IData | IData[], prentNodeData?: IModelTreeNodeData): Promise<ModelTreeNodeData>;
    /**
     * 加载实体表单属性项模型
     *
     * @param {string} entityId
     * @param {IContext} [context=this.context]
     * @memberof ModelTreeService
     */
    loadEnyityFormItem(entityId: string, context?: IContext): Promise<IDEFormItem[]>;
    /**
     * 加载实体模型
     *
     * @param {string} entityId
     * @param {IContext} [context=this.context]
     * @return {*}  {Promise<IEntityField[]>}
     * @memberof ModelTreeService
     */
    loadEntityModel(entityId: string, context?: IContext): Promise<{
        entity: IAppDataEntity | undefined;
        fields: IEntityField[];
    }>;
    /**
     * 加载JsonSchema
     *
     * @param {string} entityId
     * @param {IContext} [context=this.context]
     * @param {IParams} [params={}]
     * @return {*}  {(Promise<{
     *     entity: IAppDataEntity | undefined;
     *     fields: IEntityField[];
     *   }>)}
     * @memberof ModelTreeService
     */
    loadJsonSchema(entityId: string, context?: IContext, params?: IParams): Promise<{
        entity: IAppDataEntity | undefined;
        fields: IEntityField[];
    }>;
}
