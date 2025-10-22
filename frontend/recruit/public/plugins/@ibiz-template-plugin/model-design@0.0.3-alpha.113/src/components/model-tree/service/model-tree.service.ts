/* eslint-disable no-empty-function */
/* eslint-disable no-useless-constructor */
/* eslint-disable no-return-await */
import qs from 'qs';
import { Ref } from 'vue';
import { IAppDataEntity, IDEFormItem } from '@ibiz/model-core';
import { getUIActionById } from '@ibiz-template/runtime';
import { recursiveIterate } from '@ibiz-template/core';
import { IModelData } from '../../../interface';
import {
  IEntityField,
  IModelTreeNodeData,
  IModelTreeNodeOpt,
} from '../interface';
import { ModelTreeNodeData } from './model-tree-node-data';

/**
 * 模型树服务
 *
 * @export
 * @class ModelTreeService
 */
export class ModelTreeService {
  /**
   * 实体-属性信息 缓存map
   *
   * @private
   * @type {Map<string, IEntityField[]>}Map<实体标识, 实体属性信息>
   * @memberof ModelTreeService
   */
  private entityFeildMap: Map<string, IEntityField[]> = new Map();

  /**
   * 实体-属性表单项模型 缓存map
   *
   * @private
   * @type {Map<string, IDEFormItem[]>}Map<实体标识, 实体属性表单项模型>
   * @memberof ModelTreeService
   */
  private entityFieldItemMap: Map<string, IDEFormItem[]> = new Map();

  /**
   * Creates an instance of ModelTreeService.
   * @param {IModelData[]} data
   * @memberof ModelTreeService
   */
  constructor(
    private context: IContext,
    private data: Ref<IModelData[]>,
  ) {}

  /**
   * 获取子节点数据
   *
   * @return {*}  {(ITreeNode[])}
   * @memberof ModelTreeService
   */
  async fetchChildNodes(
    prentNodeData?: IModelTreeNodeData,
  ): Promise<IModelTreeNodeData[]> {
    let nodes: IModelTreeNodeData[] = [];
    if (!prentNodeData) {
      nodes = await this.getRootNodeData();
    } else {
      nodes = await this.getChildrenNodeData(prentNodeData);
    }
    return nodes;
  }

  /**
   * 获取根节点数据
   *
   * @return {*}  {ITreeNode[]}
   * @memberof ModelTreeService
   */
  protected async getRootNodeData(): Promise<IModelTreeNodeData[]> {
    return await Promise.all(
      this.data.value.map((_item, index) =>
        this.getModelTreeNodeData(index, this.data.value),
      ),
    );
  }

  /**
   * 获取子项数据
   *
   * @param {IModelTreeNodeData} prentNodeData
   * @return {*}  {IModelTreeNodeData[]}
   * @memberof ModelTreeService
   */
  protected async getChildrenNodeData(
    prentNodeData: IModelTreeNodeData,
  ): Promise<IModelTreeNodeData[]> {
    const data = prentNodeData._value;
    let nodes: IModelTreeNodeData[] = [];
    if (Array.isArray(data)) {
      nodes = await Promise.all(
        data.map((_item, index) =>
          this.getModelTreeNodeData(index, data, prentNodeData),
        ),
      );
    } else if (data !== null && typeof data === 'object') {
      nodes = await Promise.all(
        Object.keys(data).map(key =>
          this.getModelTreeNodeData(key, data, prentNodeData),
        ),
      );
    }
    return nodes;
  }

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
  protected async getModelTreeNodeData(
    key: string | number,
    data: IData | IData[],
    prentNodeData?: IModelTreeNodeData,
  ): Promise<ModelTreeNodeData> {
    let text = `${key}`;
    let label = '';
    let refAppDataEntityId = prentNodeData
      ? prentNodeData._refAppDataEntityId
      : data[key].modeltype;
    // 根节点
    const { fields } = await this.loadEntityModel(refAppDataEntityId);
    const item = prentNodeData ? data[key] : data[key].model;
    if (Array.isArray(data)) {
      // 父节点是数组时，子节点使用实体的主信息属性显示
      const majorField = fields.find(f => f.majorField);
      if (majorField) {
        text = item[majorField.appDEFieldId.toLowerCase()];
      }
    } else if (
      prentNodeData?._nodeType === 'JSONSCHEMA' &&
      !['modeltype', 'model', 'requires', '_children'].includes(text)
    ) {
      // JSONSCHEMA节点为属性节点需从DTO中获取信息计算
      const field = fields.find(
        f => f.appDEFieldId.toLowerCase() === text.toLowerCase(),
      );
      if (field) {
        label = field.caption;
        refAppDataEntityId = field.refAppDataEntityId || refAppDataEntityId;
      }
    } else if (prentNodeData?._nodeType === 'DE') {
      // 父节点是实体时，子节点使用实体逻辑名称作为label
      refAppDataEntityId = key;
      const { entity } = await this.loadEntityModel(refAppDataEntityId);
      label = entity?.logicName || '';
    }

    // 获取对应属性的表单项模型
    const formItems = await this.loadEnyityFormItem(refAppDataEntityId);
    const model = formItems.find(
      formItem => formItem.appDEFieldId?.toLowerCase() === text.toLowerCase(),
    );
    const opt: IModelTreeNodeOpt = {
      text,
      label,
      model,
      id: `${key}`,
      refAppDataEntityId,
    };
    return new ModelTreeNodeData(data, prentNodeData, opt);
  }

  /**
   * 加载实体表单属性项模型
   *
   * @param {string} entityId
   * @param {IContext} [context=this.context]
   * @memberof ModelTreeService
   */
  async loadEnyityFormItem(
    entityId: string,
    context: IContext = this.context,
  ): Promise<IDEFormItem[]> {
    let formItems: IDEFormItem[] = [];
    try {
      if (this.entityFieldItemMap.has(entityId)) {
        formItems = this.entityFieldItemMap.get(entityId)!;
      } else {
        const action = await getUIActionById(
          `${entityId.toLowerCase()}_copymodelform@${entityId.toLowerCase()}`,
          context.srfappid,
        );
        if (action && action.deeditForm) {
          recursiveIterate(
            action.deeditForm,
            (item: IDEFormItem) => {
              if (item.detailType === 'FORMITEM') {
                formItems.push(item);
              }
            },
            {
              childrenFields: [
                'deformPages',
                'deformTabPages',
                'deformDetails',
              ],
            },
          );
          this.entityFieldItemMap.set(entityId, formItems);
        }
      }
    } catch (error) {
      ibiz.log.error(error);
    }
    return formItems;
  }

  /**
   * 加载实体模型
   *
   * @param {string} entityId
   * @param {IContext} [context=this.context]
   * @return {*}  {Promise<IEntityField[]>}
   * @memberof ModelTreeService
   */
  async loadEntityModel(
    entityId: string,
    context: IContext = this.context,
  ): Promise<{
    entity: IAppDataEntity | undefined;
    fields: IEntityField[];
  }> {
    let entity: IAppDataEntity | undefined;
    let fields: IEntityField[] = [];
    try {
      entity = await ibiz.hub.getAppDataEntity(entityId, context.srfappid);
      if (this.entityFeildMap.has(entityId)) {
        fields = this.entityFeildMap.get(entityId)!;
      } else {
        entity.appDEMethodDTOs?.forEach(item => {
          if (item.sourceType === 'DE' && item.type === 'DEFAULT') {
            item.appDEMethodDTOFields?.forEach(dto => {
              fields.push({
                caption: dto.logicName!,
                appDEFieldId: dto.codeName!,
                refAppDataEntityId: dto.refAppDataEntityId,
                majorField:
                  dto.codeName?.toLowerCase() ===
                  entity!.majorAppDEFieldId?.toLowerCase(),
              });
            });
          }
        });
        this.entityFeildMap.set(entityId, fields);
      }
    } catch (error) {
      ibiz.log.error(error);
    }
    return {
      entity,
      fields,
    };
  }

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
  async loadJsonSchema(
    entityId: string,
    context: IContext = this.context,
    params: IParams = {},
  ): Promise<{
    entity: IAppDataEntity | undefined;
    fields: IEntityField[];
  }> {
    let entity: IAppDataEntity | undefined;
    let fields: IEntityField[] = [];
    try {
      entity = await ibiz.hub.getAppDataEntity(entityId, context.srfappid);
      if (this.entityFeildMap.has(entityId)) {
        fields = this.entityFeildMap.get(entityId)!;
      } else {
        const strParams = qs.stringify(params);
        const app = ibiz.hub.getApp(context.srfappid);
        let url = `/jsonschema/${entity.name}`;
        if (entity.dynaSysMode === 0 && ibiz.appData) {
          url += `?dynamodeltag=${ibiz.appData.dynamodeltag}${
            strParams ? `&${strParams}` : ''
          }`;
        } else {
          url += `${strParams ? `?${strParams}` : ''}`;
        }
        const res = await app.net.get(url);
        const { data } = res;
        if (!data.properties || !(Object.keys(data.properties).length > 0)) {
          return { entity, fields };
        }
        Object.keys(data.properties).forEach(key => {
          const item = data.properties[key];
          fields.push({
            appDEFieldId: key,
            caption: item.description,
            majorField:
              key.toLowerCase() === entity?.majorAppDEFieldId?.toLowerCase(),
            refAppDataEntityId:
              item.type === 'array'
                ? item.items?.$ref?.split('.')[0]
                : item.$ref?.split('.')[0],
          });
        });
        this.entityFeildMap.set(entityId, fields);
      }
    } catch (error) {
      ibiz.log.error(error);
    }
    return { entity, fields };
  }
}
