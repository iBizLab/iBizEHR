import {
  IEditorController,
  IEditorProvider,
  getEditorProvider,
} from '@ibiz-template/runtime';
import { IModelTreeNodeData, IModelTreeNodeController } from './interface';

/**
 * 模型树节点控制器
 *
 * @export
 * @class ModelTreeNodeController
 * @implements {IModelTreeNodeController}
 */
export class ModelTreeNodeController implements IModelTreeNodeController {
  /**
   * 禁用
   *
   * @type {boolean}
   * @memberof ModelTreeNodeController
   */
  disabled: boolean = false;

  /**
   * 只读
   *
   * @type {boolean}
   * @memberof ModelTreeNodeController
   */
  readonly: boolean = false;

  /**
   * 编辑器控制器
   *
   * @type {IEditorController}
   * @memberof ModelTreeNodeController
   */
  editor?: IEditorController;

  /**
   * 编辑器适配器
   *
   * @type {IEditorProvider}
   * @memberof ModelTreeNodeController
   */
  editorProvider?: IEditorProvider;

  /**
   * Creates an instance of ModelTreeRowState.
   * @param {IModelTreeNodeData} data
   * @memberof ModelTreeNodeController
   */
  constructor(
    public data: IModelTreeNodeData,
    public context: IContext,
    public params: IParams,
  ) {
    this.readonly = data._nodeType === 'STATIC';
  }

  /**
   * 单位名称
   *
   * @readonly
   * @type {(string | undefined)}
   * @memberof ModelTreeNodeController
   */
  get unitName(): string | undefined {
    return this.data._model?.unitName;
  }

  /**
   * 值格式化
   *
   * @readonly
   * @type {(string | undefined)}
   * @memberof ModelTreeNodeController
   */
  get valueFormat(): string | undefined {
    return this.data._model?.valueFormat;
  }

  /**
   * 数据类型
   *
   * @readonly
   * @type {(number | undefined)}
   * @memberof ModelTreeNodeController
   */
  get dataType(): number | undefined {
    return this.data._model?.dataType;
  }

  /**
   * 初始化
   *
   * @memberof ModelTreeNodeController
   */
  async init(): Promise<void> {
    if (
      this.data._model?.editor &&
      this.data._model?.editor.editorType !== 'HIDDEN'
    ) {
      this.editorProvider = await getEditorProvider(this.data._model.editor);
      if (this.editorProvider) {
        this.editor = await this.editorProvider.createController(
          this.data._model.editor,
          this,
        );
      }
    }
  }
}
