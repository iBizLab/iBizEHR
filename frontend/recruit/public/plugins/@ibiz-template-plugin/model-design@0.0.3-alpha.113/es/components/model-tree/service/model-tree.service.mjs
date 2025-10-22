import qs from 'qs';
import { getUIActionById } from '@ibiz-template/runtime';
import { recursiveIterate } from '@ibiz-template/core';
import { ModelTreeNodeData } from './model-tree-node-data.mjs';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class ModelTreeService {
  /**
   * Creates an instance of ModelTreeService.
   * @param {IModelData[]} data
   * @memberof ModelTreeService
   */
  constructor(context, data) {
    this.context = context;
    this.data = data;
    /**
     * 实体-属性信息 缓存map
     *
     * @private
     * @type {Map<string, IEntityField[]>}Map<实体标识, 实体属性信息>
     * @memberof ModelTreeService
     */
    __publicField(this, "entityFeildMap", /* @__PURE__ */ new Map());
    /**
     * 实体-属性表单项模型 缓存map
     *
     * @private
     * @type {Map<string, IDEFormItem[]>}Map<实体标识, 实体属性表单项模型>
     * @memberof ModelTreeService
     */
    __publicField(this, "entityFieldItemMap", /* @__PURE__ */ new Map());
  }
  /**
   * 获取子节点数据
   *
   * @return {*}  {(ITreeNode[])}
   * @memberof ModelTreeService
   */
  async fetchChildNodes(prentNodeData) {
    let nodes = [];
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
  async getRootNodeData() {
    return await Promise.all(
      this.data.value.map(
        (_item, index) => this.getModelTreeNodeData(index, this.data.value)
      )
    );
  }
  /**
   * 获取子项数据
   *
   * @param {IModelTreeNodeData} prentNodeData
   * @return {*}  {IModelTreeNodeData[]}
   * @memberof ModelTreeService
   */
  async getChildrenNodeData(prentNodeData) {
    const data = prentNodeData._value;
    let nodes = [];
    if (Array.isArray(data)) {
      nodes = await Promise.all(
        data.map(
          (_item, index) => this.getModelTreeNodeData(index, data, prentNodeData)
        )
      );
    } else if (data !== null && typeof data === "object") {
      nodes = await Promise.all(
        Object.keys(data).map(
          (key) => this.getModelTreeNodeData(key, data, prentNodeData)
        )
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
  async getModelTreeNodeData(key, data, prentNodeData) {
    let text = "".concat(key);
    let label = "";
    let refAppDataEntityId = prentNodeData ? prentNodeData._refAppDataEntityId : data[key].modeltype;
    const { fields } = await this.loadEntityModel(refAppDataEntityId);
    const item = prentNodeData ? data[key] : data[key].model;
    if (Array.isArray(data)) {
      const majorField = fields.find((f) => f.majorField);
      if (majorField) {
        text = item[majorField.appDEFieldId.toLowerCase()];
      }
    } else if ((prentNodeData == null ? void 0 : prentNodeData._nodeType) === "JSONSCHEMA" && !["modeltype", "model", "requires", "_children"].includes(text)) {
      const field = fields.find(
        (f) => f.appDEFieldId.toLowerCase() === text.toLowerCase()
      );
      if (field) {
        label = field.caption;
        refAppDataEntityId = field.refAppDataEntityId || refAppDataEntityId;
      }
    } else if ((prentNodeData == null ? void 0 : prentNodeData._nodeType) === "DE") {
      refAppDataEntityId = key;
      const { entity } = await this.loadEntityModel(refAppDataEntityId);
      label = (entity == null ? void 0 : entity.logicName) || "";
    }
    const formItems = await this.loadEnyityFormItem(refAppDataEntityId);
    const model = formItems.find(
      (formItem) => {
        var _a;
        return ((_a = formItem.appDEFieldId) == null ? void 0 : _a.toLowerCase()) === text.toLowerCase();
      }
    );
    const opt = {
      text,
      label,
      model,
      id: "".concat(key),
      refAppDataEntityId
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
  async loadEnyityFormItem(entityId, context = this.context) {
    let formItems = [];
    try {
      if (this.entityFieldItemMap.has(entityId)) {
        formItems = this.entityFieldItemMap.get(entityId);
      } else {
        const action = await getUIActionById(
          "".concat(entityId.toLowerCase(), "_copymodelform@").concat(entityId.toLowerCase()),
          context.srfappid
        );
        if (action && action.deeditForm) {
          recursiveIterate(
            action.deeditForm,
            (item) => {
              if (item.detailType === "FORMITEM") {
                formItems.push(item);
              }
            },
            {
              childrenFields: [
                "deformPages",
                "deformTabPages",
                "deformDetails"
              ]
            }
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
  async loadEntityModel(entityId, context = this.context) {
    var _a;
    let entity;
    let fields = [];
    try {
      entity = await ibiz.hub.getAppDataEntity(entityId, context.srfappid);
      if (this.entityFeildMap.has(entityId)) {
        fields = this.entityFeildMap.get(entityId);
      } else {
        (_a = entity.appDEMethodDTOs) == null ? void 0 : _a.forEach((item) => {
          var _a2;
          if (item.sourceType === "DE" && item.type === "DEFAULT") {
            (_a2 = item.appDEMethodDTOFields) == null ? void 0 : _a2.forEach((dto) => {
              var _a3, _b;
              fields.push({
                caption: dto.logicName,
                appDEFieldId: dto.codeName,
                refAppDataEntityId: dto.refAppDataEntityId,
                majorField: ((_a3 = dto.codeName) == null ? void 0 : _a3.toLowerCase()) === ((_b = entity.majorAppDEFieldId) == null ? void 0 : _b.toLowerCase())
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
      fields
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
  async loadJsonSchema(entityId, context = this.context, params = {}) {
    let entity;
    let fields = [];
    try {
      entity = await ibiz.hub.getAppDataEntity(entityId, context.srfappid);
      if (this.entityFeildMap.has(entityId)) {
        fields = this.entityFeildMap.get(entityId);
      } else {
        const strParams = qs.stringify(params);
        const app = ibiz.hub.getApp(context.srfappid);
        let url = "/jsonschema/".concat(entity.name);
        if (entity.dynaSysMode === 0 && ibiz.appData) {
          url += "?dynamodeltag=".concat(ibiz.appData.dynamodeltag).concat(strParams ? "&".concat(strParams) : "");
        } else {
          url += "".concat(strParams ? "?".concat(strParams) : "");
        }
        const res = await app.net.get(url);
        const { data } = res;
        if (!data.properties || !(Object.keys(data.properties).length > 0)) {
          return { entity, fields };
        }
        Object.keys(data.properties).forEach((key) => {
          var _a, _b, _c, _d;
          const item = data.properties[key];
          fields.push({
            appDEFieldId: key,
            caption: item.description,
            majorField: key.toLowerCase() === ((_a = entity == null ? void 0 : entity.majorAppDEFieldId) == null ? void 0 : _a.toLowerCase()),
            refAppDataEntityId: item.type === "array" ? (_c = (_b = item.items) == null ? void 0 : _b.$ref) == null ? void 0 : _c.split(".")[0] : (_d = item.$ref) == null ? void 0 : _d.split(".")[0]
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

export { ModelTreeService };
