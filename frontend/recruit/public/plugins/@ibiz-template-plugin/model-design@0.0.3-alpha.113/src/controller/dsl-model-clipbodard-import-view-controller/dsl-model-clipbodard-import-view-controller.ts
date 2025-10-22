import { DSLModelClipboardImportViewState } from './dsl-model-clipbodard-import-view-state';

/**
 * DSL模型粘贴板导出视图控制器
 *
 * @export
 * @class DSLModelClipboardImportViewController
 */
export class DSLModelClipboardImportViewController {
  /**
   * 模型导入视图状态
   *
   * @memberof DSLModelClipboardImportViewController
   */
  state = new DSLModelClipboardImportViewState();

  /**
   * 更新参数
   *
   * @param {IParams} params
   * @memberof DSLModelClipboardImportViewController
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
   * @memberof DSLModelClipboardImportViewController
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

export const dslModelClipboardImportViewController =
  new DSLModelClipboardImportViewController();
