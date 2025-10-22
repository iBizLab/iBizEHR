import { EditorController, getDeACMode } from '@ibiz-template/runtime';
import { IAppDEACMode, ICode } from '@ibiz/model-core';

/**
 * 代码框编辑器控制器
 *
 * @export
 * @class CodeEditorController
 * @extends {EditorController}
 */
export class CodeEditorController extends EditorController<ICode> {
  /**
   * 自填模式
   *
   * @type {IAppDEACMode}
   * @memberof CodeEditorController
   */
  deACMode?: IAppDEACMode;

  /**
   * 语言类型
   * @author lxm
   * @date 2023-07-21 04:52:16
   * @readonly
   */
  get language(): string {
    return (
      this.editorParams.codeType || this.editorParams.language || 'typescript'
    );
  }

  /**
   * 主题
   * @author lxm
   * @date 2023-07-21 04:53:37
   * @readonly
   */
  get theme(): string {
    return this.editorParams.theme || 'vs-dark';
  }

  /**
   * 初始化
   *
   * @protected
   * @return {*}  {Promise<void>}
   * @memberof CodeEditorController
   */
  protected async onInit(): Promise<void> {
    await super.onInit();
    const { appDEACModeId, appDataEntityId } = this.model;
    if (appDEACModeId)
      this.deACMode = await getDeACMode(
        appDEACModeId,
        appDataEntityId!,
        this.context.srfappid,
      );
  }
}
