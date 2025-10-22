import { createUUID } from 'qx-util';
import { getToken } from '@ibiz-template/core';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class InlineCompletions {
  /**
   * Creates an instance of InlineCompletions.
   * @param {Monaco} monaco
   * @param {IConfig} config
   * @param {monaco.editor.IStandaloneCodeEditor} editor
   * @memberof InlineCompletions
   */
  constructor(monaco, editor, config) {
    this.monaco = monaco;
    this.editor = editor;
    this.config = config;
    /**
     * 是否显示补全提示
     *
     * @private
     * @type {boolean}
     * @memberof InlineCompletions
     */
    __publicField(this, "visible", false);
    /**
     * 唯一标识
     *
     * @private
     * @type {string}
     * @memberof InlineCompletions
     */
    __publicField(this, "UUID", createUUID());
    /**
     * 防抖计时器
     *
     * @private
     * @type {(number | null)}
     * @memberof InlineCompletions
     */
    __publicField(this, "debounceTimer", null);
    /**
     * 请求终止控制器
     *
     * @private
     * @type {(AbortController | null)}
     * @memberof InlineCompletions
     */
    __publicField(this, "abortController", null);
    this.registerInlineCompletions();
  }
  /**
   * 注册内联代码补全
   *
   * @private
   * @memberof InlineCompletions
   */
  registerInlineCompletions() {
    this.editor.__inlineCompletionsId = this.UUID;
    const disposable = this.monaco.languages.registerInlineCompletionsProvider(
      this.config.language,
      {
        provideInlineCompletions: async (model, position) => {
          this.visible = false;
          const lineContent = model.getLineContent(position.lineNumber);
          if (!this.validate(model) || !lineContent.trim())
            return { items: [] };
          if (this.debounceTimer) {
            clearTimeout(this.debounceTimer);
          }
          return new Promise((resolve) => {
            this.debounceTimer = window.setTimeout(async () => {
              const completion = await this.getCompletion(model, position);
              if (!completion) {
                resolve({ items: [] });
                return;
              }
              this.visible = true;
              resolve({
                items: [
                  {
                    insertText: completion,
                    range: new this.monaco.Range(
                      position.lineNumber,
                      position.column,
                      position.lineNumber,
                      position.column
                    )
                  }
                ]
              });
            }, 500);
          });
        },
        freeInlineCompletions(_completion) {
        }
      }
    );
    this.editor.addCommand(this.monaco.KeyCode.Tab, async () => {
      if (this.visible) {
        this.editor.trigger(null, "editor.action.inlineSuggest.commit", {});
        this.visible = false;
      } else {
        this.editor.trigger(null, "tab", {});
      }
    });
    this.editor.onDidDispose(() => {
      disposable.dispose();
    });
  }
  /**
   * 检查模型是否属于当前编辑器实例
   *
   * @private
   * @param {IMonaco.editor.ITextModel} model
   * @return {*}  {boolean}
   * @memberof InlineCompletions
   */
  validate(model) {
    const currentEditor = this.monaco.editor.getEditors().find((e) => e.getModel() === model);
    if (!currentEditor || currentEditor.__inlineCompletionsId !== this.UUID)
      return false;
    return true;
  }
  /**
   * 获取指定位置前后行数据
   *
   * @private
   * @param {('Above' | 'Below')} type 获取数据类型（上方 | 下方）
   * @param {IMonaco.editor.ITextModel} model 编辑器模型
   * @param {IMonaco.Position} position 光标位置
   * @param {number} count 行数量
   * @return {*}  {string}
   * @memberof InlineCompletions
   */
  getLinesValue(type, model, position, count) {
    const totalLines = model.getLineCount();
    const startLine = type === "Above" ? Math.max(1, position.lineNumber - count) : Math.min(totalLines, position.lineNumber + 1);
    const endLine = type === "Above" ? Math.max(1, position.lineNumber - 1) : Math.min(totalLines, position.lineNumber + count);
    if (type === "Above" ? position.lineNumber === 1 : position.lineNumber === totalLines)
      return "";
    return model.getValueInRange({
      startLineNumber: startLine,
      startColumn: 1,
      endLineNumber: endLine,
      endColumn: model.getLineMaxColumn(endLine)
    });
  }
  /**
   * 计算上下文
   *
   * @param {IMonaco.editor.ITextModel} model
   * @param {IMonaco.Position} position
   * @return {*}  {(ICompletionContext | undefined)}
   * @memberof InlineCompletions
   */
  calcContext(model, position) {
    const currentLine = model.getLineContent(position.lineNumber);
    const token = model.getWordAtPosition(position) || model.getWordUntilPosition(position);
    return {
      position,
      currentLine,
      word: token.word,
      timestamp: Date.now(),
      aboveLines: this.getLinesValue("Above", model, position, 5),
      belowLines: this.getLinesValue("Below", model, position, 3),
      languageId: model.getLanguageId()
    };
  }
  /**
   * 获取请求头
   *
   * @return {*}  {HeadersInit}
   * @memberof InlineCompletions
   */
  getRequestHeaders() {
    const headers = {
      "Content-Type": "application/json",
      srfsystemid: ibiz.env.dcSystem
    };
    const token = getToken();
    if (token) {
      headers["".concat(ibiz.env.tokenHeader, "Authorization")] = "".concat(ibiz.env.tokenPrefix, "Bearer ").concat(getToken());
    }
    const { orgData } = ibiz;
    if (orgData == null ? void 0 : orgData.systemid)
      headers.srfsystemid = orgData.systemid;
    if (orgData == null ? void 0 : orgData.orgid)
      headers.srforgid = orgData.orgid;
    return headers;
  }
  /**
   * 获取补全
   *
   * @private
   * @param {IMonaco.editor.ITextModel} model
   * @param {IMonaco.Position} position
   * @return {*}  {Promise<string>}
   * @memberof InlineCompletions
   */
  async getCompletion(_model, _position) {
    return void 0;
  }
}

export { InlineCompletions };
