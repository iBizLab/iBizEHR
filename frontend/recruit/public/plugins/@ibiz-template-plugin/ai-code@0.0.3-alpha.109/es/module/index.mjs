import { InlineCompletions } from './inline-completions/inline-completions.mjs';
import { CompletionItem } from './completion-item/completion-item.mjs';
import { CustomLanguageTheme } from './custom-language-theme/custom-language-theme.mjs';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class CodeModuleCenter {
  constructor(monaco, config) {
    this.monaco = monaco;
    this.config = config;
    /**
     * 模块
     *
     * @private
     * @type {IData[]}
     * @memberof CodeModuleCenter
     */
    __publicField(this, "modules", []);
    /**
     * 主题
     *
     * @type {CustomLanguageTheme}
     * @memberof CodeModuleCenter
     */
    __publicField(this, "theme");
    this.theme = new CustomLanguageTheme(monaco, config);
  }
  /**
   * 初始化代码编辑器模块
   *
   * @param {IMonaco.editor.IStandaloneCodeEditor} editor 代码编辑器实例
   * @memberof CodeModuleCenter
   */
  initModules(editor) {
    this.modules.push(new InlineCompletions(this.monaco, editor, this.config));
    this.modules.push(new CompletionItem(this.monaco, editor, this.config));
  }
}

export { CodeModuleCenter };
