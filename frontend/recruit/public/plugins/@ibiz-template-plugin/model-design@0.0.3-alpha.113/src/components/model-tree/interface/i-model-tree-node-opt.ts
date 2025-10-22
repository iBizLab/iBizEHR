import { IDEFormItem } from '@ibiz/model-core';

/**
 * 模型树节点配置
 *
 * @export
 * @interface IModelTreeNodeOpt
 */
export interface IModelTreeNodeOpt {
  /**
   * 节点标识
   *
   * @type {string}
   * @memberof IModelTreeNodeOpt
   */
  id: string;
  /**
   * 节点文本
   *
   * @type {string}
   * @memberof IModelTreeNodeOpt
   */
  text: string;
  /**
   * 引用应用实体标识
   *
   * @type {string}
   * @memberof IModelTreeNodeOpt
   */
  refAppDataEntityId: string;
  /**
   * 节点label
   *
   * @type {string}
   * @memberof IModelTreeNodeOpt
   */
  label?: string;
  /**
   * 表单项模型
   *
   * @type {IEditor}
   * @memberof IModelTreeNodeOpt
   */
  model?: IDEFormItem;
}
