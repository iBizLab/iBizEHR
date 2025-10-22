import { ModelClipboardPasteViewState } from './model-clipboard-paste-view-state';
/**
 * 模型粘贴版粘贴视图控制器
 *
 * @export
 * @class ModelClipboardPasteViewController
 */
export declare class ModelClipboardPasteViewController {
    /**
     * 模型粘贴视图状态
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:00
     */
    state: ModelClipboardPasteViewState;
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
export declare const modelClipboardPasteViewController: ModelClipboardPasteViewController;
