import { IEditorController, IEditorProvider } from '@ibiz-template/runtime';
import { IModelTreeNodeData, IModelTreeNodeController } from './interface';
/**
 * 模型树节点控制器
 *
 * @export
 * @class ModelTreeNodeController
 * @implements {IModelTreeNodeController}
 */
export declare class ModelTreeNodeController implements IModelTreeNodeController {
    data: IModelTreeNodeData;
    context: IContext;
    params: IParams;
    /**
     * 禁用
     *
     * @type {boolean}
     * @memberof ModelTreeNodeController
     */
    disabled: boolean;
    /**
     * 只读
     *
     * @type {boolean}
     * @memberof ModelTreeNodeController
     */
    readonly: boolean;
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
    constructor(data: IModelTreeNodeData, context: IContext, params: IParams);
    /**
     * 单位名称
     *
     * @readonly
     * @type {(string | undefined)}
     * @memberof ModelTreeNodeController
     */
    get unitName(): string | undefined;
    /**
     * 值格式化
     *
     * @readonly
     * @type {(string | undefined)}
     * @memberof ModelTreeNodeController
     */
    get valueFormat(): string | undefined;
    /**
     * 数据类型
     *
     * @readonly
     * @type {(number | undefined)}
     * @memberof ModelTreeNodeController
     */
    get dataType(): number | undefined;
    /**
     * 初始化
     *
     * @memberof ModelTreeNodeController
     */
    init(): Promise<void>;
}
