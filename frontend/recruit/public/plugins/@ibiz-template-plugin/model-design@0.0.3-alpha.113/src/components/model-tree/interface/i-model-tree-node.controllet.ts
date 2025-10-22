import {
  IEditorProvider,
  IEditorController,
  IEditorContainerController,
} from '@ibiz-template/runtime';
import { IModelTreeNodeData } from './i-model-tree-node-data';

/**
 * 模型树节点控制器接口
 *
 * @export
 * @interface IModelTreeNodeController
 */
export interface IModelTreeNodeController extends IEditorContainerController {
  /**
   * 模型树节点数据
   *
   * @type {IModelTreeNodeData}
   * @memberof IModelTreeNodeController
   */
  data: IModelTreeNodeData;

  /**
   * 禁用
   *
   * @type {boolean}
   * @memberof IModelTreeNodeController
   */
  disabled: boolean;

  /**
   * 只读
   *
   * @type {boolean}
   * @memberof IModelTreeNodeController
   */
  readonly: boolean;

  /**
   * 编辑器控制器
   *
   * @type {IEditorController}
   * @memberof IModelTreeNodeController
   */
  editor?: IEditorController;

  /**
   * 编辑器适配器
   *
   * @type {IEditorProvider}
   * @memberof IModelTreeNodeController
   */
  editorProvider?: IEditorProvider;

  /**
   * 初始化
   *
   * @return {*}  {Promise<void>}
   * @memberof IModelTreeNodeController
   */
  init(): Promise<void>;
}
