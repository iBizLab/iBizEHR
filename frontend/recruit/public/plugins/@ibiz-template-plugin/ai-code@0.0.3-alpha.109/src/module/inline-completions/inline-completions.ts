import * as IMonaco from 'monaco-editor';
import { createUUID } from 'qx-util';
import { getToken } from '@ibiz-template/core';
import { IConfig, Monaco } from '../interface';

interface ICompletionContext {
  /**
   * 单词
   *
   * @type {string}
   * @memberof ICompletionContext
   */
  word: string;
  /**
   * 语言ID
   *
   * @type {string}
   * @memberof ICompletionContext
   */
  languageId: string;
  /**
   * 时间戳
   *
   * @type {number}
   * @memberof ICompletionContext
   */
  timestamp: number;
  /**
   * 位置
   *
   * @type {IMonaco.Position}
   * @memberof ICompletionContext
   */
  position: IMonaco.Position;
  /**
   * 当前行
   *
   * @type {string}
   * @memberof ICompletionContext
   */
  currentLine: string;
  /**
   * 当前行上方数据
   *
   * @type {string}
   * @memberof ICompletionContext
   */
  aboveLines: string;
  /**
   * 当前行下方数据
   *
   * @type {string}
   * @memberof ICompletionContext
   */
  belowLines: string;
}

/**
 * 内联代码补全
 *
 * @export
 * @class InlineCompletions
 */
export class InlineCompletions {
  /**
   * 是否显示补全提示
   *
   * @private
   * @type {boolean}
   * @memberof InlineCompletions
   */
  private visible: boolean = false;

  /**
   * 唯一标识
   *
   * @private
   * @type {string}
   * @memberof InlineCompletions
   */
  private UUID: string = createUUID();

  /**
   * 防抖计时器
   *
   * @private
   * @type {(number | null)}
   * @memberof InlineCompletions
   */
  private debounceTimer: number | null = null;

  /**
   * 请求终止控制器
   *
   * @private
   * @type {(AbortController | null)}
   * @memberof InlineCompletions
   */
  private abortController: AbortController | null = null;

  /**
   * Creates an instance of InlineCompletions.
   * @param {Monaco} monaco
   * @param {IConfig} config
   * @param {monaco.editor.IStandaloneCodeEditor} editor
   * @memberof InlineCompletions
   */
  constructor(
    private monaco: Monaco,
    private editor: IMonaco.editor.IStandaloneCodeEditor,
    private config: IConfig,
  ) {
    this.registerInlineCompletions();
  }

  /**
   * 注册内联代码补全
   *
   * @private
   * @memberof InlineCompletions
   */
  private registerInlineCompletions(): void {
    (this.editor as IData).__inlineCompletionsId = this.UUID;
    const disposable = this.monaco.languages.registerInlineCompletionsProvider(
      this.config.language,
      {
        provideInlineCompletions: async (model, position) => {
          this.visible = false;
          const lineContent = model.getLineContent(position.lineNumber);
          // 排除空白行
          if (!this.validate(model) || !lineContent.trim())
            return { items: [] };

          // 清除之前的计时器
          if (this.debounceTimer) {
            clearTimeout(this.debounceTimer);
          }

          // 使用防抖
          return new Promise(resolve => {
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
                      position.column,
                    ),
                  },
                ],
              });
            }, 500);
          });
        },
        freeInlineCompletions(_completion) {},
      },
    );
    // Tab键处理
    this.editor.addCommand(this.monaco.KeyCode.Tab, async () => {
      // 如果当前显示行内代码补全则自动补全
      if (this.visible) {
        this.editor.trigger(null, 'editor.action.inlineSuggest.commit', {});
        this.visible = false;
      } else {
        // 否则执行默认tab
        this.editor.trigger(null, 'tab', {});
      }
    });
    // 编辑器销毁时清理资源
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
  private validate(model: IMonaco.editor.ITextModel): boolean {
    const currentEditor = this.monaco.editor
      .getEditors()
      .find(e => e.getModel() === model);

    if (
      !currentEditor ||
      (currentEditor as IData).__inlineCompletionsId !== this.UUID
    )
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
  private getLinesValue(
    type: 'Above' | 'Below',
    model: IMonaco.editor.ITextModel,
    position: IMonaco.Position,
    count: number,
  ): string {
    const totalLines = model.getLineCount();
    const startLine =
      type === 'Above'
        ? Math.max(1, position.lineNumber - count)
        : Math.min(totalLines, position.lineNumber + 1);
    const endLine =
      type === 'Above'
        ? Math.max(1, position.lineNumber - 1)
        : Math.min(totalLines, position.lineNumber + count);
    // 没有前一行或者没有后一行时返回空
    if (
      type === 'Above'
        ? position.lineNumber === 1
        : position.lineNumber === totalLines
    )
      return '';
    return model.getValueInRange({
      startLineNumber: startLine,
      startColumn: 1,
      endLineNumber: endLine,
      endColumn: model.getLineMaxColumn(endLine),
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
  private calcContext(
    model: IMonaco.editor.ITextModel,
    position: IMonaco.Position,
  ): ICompletionContext | undefined {
    const currentLine = model.getLineContent(position.lineNumber);
    const token =
      model.getWordAtPosition(position) || model.getWordUntilPosition(position);
    return {
      position,
      currentLine,
      word: token.word,
      timestamp: Date.now(),
      aboveLines: this.getLinesValue('Above', model, position, 5),
      belowLines: this.getLinesValue('Below', model, position, 3),
      languageId: model.getLanguageId(),
    };
  }

  /**
   * 获取请求头
   *
   * @return {*}  {HeadersInit}
   * @memberof InlineCompletions
   */
  getRequestHeaders(): HeadersInit {
    const headers: HeadersInit = {
      'Content-Type': 'application/json',
      srfsystemid: ibiz.env.dcSystem,
    };
    const token = getToken();
    if (token) {
      headers[`${ibiz.env.tokenHeader}Authorization`] = `${
        ibiz.env.tokenPrefix
      }Bearer ${getToken()}`;
    }
    const { orgData } = ibiz;
    if (orgData?.systemid) headers.srfsystemid = orgData.systemid;
    if (orgData?.orgid) headers.srforgid = orgData.orgid;
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
  private async getCompletion(
    _model: IMonaco.editor.ITextModel,
    _position: IMonaco.Position,
  ): Promise<string | undefined> {
    // const context = this.calcContext(model, position);
    return undefined;
    // if (this.abortController) this.abortController.abort();
    // this.abortController = new AbortController();
    // try {
    //   const response = await fetch('', {
    //     method: 'POST',
    //     body: JSON.stringify(context),
    //     headers: this.getRequestHeaders(),
    //     signal: this.abortController.signal,
    //   });
    //   this.abortController = null;
    //   if (response.status !== 200) return;
    //   const completion = await response.text();
    //   return completion;
    // } catch (err: any) {
    //   if (err.name !== 'AbortError') ibiz.log.error(err);
    // }
  }
}
