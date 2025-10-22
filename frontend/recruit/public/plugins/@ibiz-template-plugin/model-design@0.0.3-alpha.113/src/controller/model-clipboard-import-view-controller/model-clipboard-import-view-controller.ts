import { ModelClipboardImportViewState } from './model-clipboard-import-view-state';

/**
 * 模型粘贴板导出视图控制器
 *
 * @export
 * @class ModelClipboardImportViewController
 */
export class ModelClipboardImportViewController {
  /**
   * 模型导入视图状态
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:00
   */
  state = new ModelClipboardImportViewState();

  /**
   * 更新参数
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:30
   * @param {IParams} params
   */
  updateParams(params: IParams): void {
    if (
      params &&
      !Object.is(JSON.stringify(params), JSON.stringify(this.state.params))
    ) {
      this.state.params = params;
      this.clearAllData();
    }
  }

  /**
   * 清理数据
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:09
   */
  clearAllData(): void {
    this.state.isLoading = false;
    this.state.items = [];
    this.state.importItems = [];
    this.state.models = [];
    this.state.modelStr = '';
    this.state.isModelChange = false;
  }
}

export const modelClipboardImportViewController =
  new ModelClipboardImportViewController();
