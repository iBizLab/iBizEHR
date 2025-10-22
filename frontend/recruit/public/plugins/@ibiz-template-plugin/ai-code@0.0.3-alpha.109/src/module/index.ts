/* eslint-disable no-shadow */
import * as IMonaco from 'monaco-editor';
import { InlineCompletions } from './inline-completions/inline-completions';
import { IConfig, Monaco } from './interface';
import { CompletionItem } from './completion-item/completion-item';
import { CustomLanguageTheme } from './custom-language-theme/custom-language-theme';

/**
 * 代码编辑器模块中心
 *
 * @export
 * @class CodeModuleCenter
 */
export class CodeModuleCenter {
  /**
   * 模块
   *
   * @private
   * @type {IData[]}
   * @memberof CodeModuleCenter
   */
  private modules: IData[] = [];

  /**
   * 主题
   *
   * @type {CustomLanguageTheme}
   * @memberof CodeModuleCenter
   */
  theme: CustomLanguageTheme;

  constructor(
    private monaco: Monaco,
    private config: IConfig,
  ) {
    // 主题必须在代码编辑器实例创建完成之前创建
    this.theme = new CustomLanguageTheme(monaco, config);
  }

  /**
   * 初始化代码编辑器模块
   *
   * @param {IMonaco.editor.IStandaloneCodeEditor} editor 代码编辑器实例
   * @memberof CodeModuleCenter
   */
  initModules(editor: IMonaco.editor.IStandaloneCodeEditor): void {
    // 添加内联代码补全模块
    this.modules.push(new InlineCompletions(this.monaco, editor, this.config));
    // 添加完成项补全模块
    this.modules.push(new CompletionItem(this.monaco, editor, this.config));
  }
}
