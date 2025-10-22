import { DSLModelClipboardImportViewState } from './dsl-model-clipbodard-import-view-state';
/**
 * DSL模型粘贴板导出视图控制器
 *
 * @export
 * @class DSLModelClipboardImportViewController
 */
export declare class DSLModelClipboardImportViewController {
    /**
     * 模型导入视图状态
     *
     * @memberof DSLModelClipboardImportViewController
     */
    state: DSLModelClipboardImportViewState;
    /**
     * 更新参数
     *
     * @param {IParams} params
     * @memberof DSLModelClipboardImportViewController
     */
    updateParams(params: IParams): void;
    /**
     * 清理数据
     *
     * @memberof DSLModelClipboardImportViewController
     */
    clearAllData(): void;
}
export declare const dslModelClipboardImportViewController: DSLModelClipboardImportViewController;
