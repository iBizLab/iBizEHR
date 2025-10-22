import * as IMonaco from 'monaco-editor';
import { IConfig, Monaco } from '../interface';
/**
 * 内联代码补全
 *
 * @export
 * @class InlineCompletions
 */
export declare class InlineCompletions {
    private monaco;
    private editor;
    private config;
    /**
     * 是否显示补全提示
     *
     * @private
     * @type {boolean}
     * @memberof InlineCompletions
     */
    private visible;
    /**
     * 唯一标识
     *
     * @private
     * @type {string}
     * @memberof InlineCompletions
     */
    private UUID;
    /**
     * 防抖计时器
     *
     * @private
     * @type {(number | null)}
     * @memberof InlineCompletions
     */
    private debounceTimer;
    /**
     * 请求终止控制器
     *
     * @private
     * @type {(AbortController | null)}
     * @memberof InlineCompletions
     */
    private abortController;
    /**
     * Creates an instance of InlineCompletions.
     * @param {Monaco} monaco
     * @param {IConfig} config
     * @param {monaco.editor.IStandaloneCodeEditor} editor
     * @memberof InlineCompletions
     */
    constructor(monaco: Monaco, editor: IMonaco.editor.IStandaloneCodeEditor, config: IConfig);
    /**
     * 注册内联代码补全
     *
     * @private
     * @memberof InlineCompletions
     */
    private registerInlineCompletions;
    /**
     * 检查模型是否属于当前编辑器实例
     *
     * @private
     * @param {IMonaco.editor.ITextModel} model
     * @return {*}  {boolean}
     * @memberof InlineCompletions
     */
    private validate;
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
    private getLinesValue;
    /**
     * 计算上下文
     *
     * @param {IMonaco.editor.ITextModel} model
     * @param {IMonaco.Position} position
     * @return {*}  {(ICompletionContext | undefined)}
     * @memberof InlineCompletions
     */
    private calcContext;
    /**
     * 获取请求头
     *
     * @return {*}  {HeadersInit}
     * @memberof InlineCompletions
     */
    getRequestHeaders(): HeadersInit;
    /**
     * 获取补全
     *
     * @private
     * @param {IMonaco.editor.ITextModel} model
     * @param {IMonaco.Position} position
     * @return {*}  {Promise<string>}
     * @memberof InlineCompletions
     */
    private getCompletion;
}
