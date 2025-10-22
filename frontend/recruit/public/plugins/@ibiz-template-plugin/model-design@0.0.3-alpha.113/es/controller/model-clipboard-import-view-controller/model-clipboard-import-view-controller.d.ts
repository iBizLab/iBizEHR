import { ModelClipboardImportViewState } from './model-clipboard-import-view-state';
/**
 * 模型粘贴板导出视图控制器
 *
 * @export
 * @class ModelClipboardImportViewController
 */
export declare class ModelClipboardImportViewController {
    /**
     * 模型导入视图状态
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:00
     */
    state: ModelClipboardImportViewState;
    /**
     * 更新参数
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:30
     * @param {IParams} params
     */
    updateParams(params: IParams): void;
    /**
     * 清理数据
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:09
     */
    clearAllData(): void;
}
export declare const modelClipboardImportViewController: ModelClipboardImportViewController;
