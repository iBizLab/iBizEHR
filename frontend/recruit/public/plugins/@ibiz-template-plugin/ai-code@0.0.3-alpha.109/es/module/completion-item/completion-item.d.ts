import * as IMonaco from 'monaco-editor';
import { IConfig, Monaco } from '../interface';
/**
 * 完成项补全
 *
 * @export
 * @class CompletionItem
 */
export declare class CompletionItem {
    private monaco;
    private editor;
    private config;
    /**
     * 唯一标识
     *
     * @private
     * @type {string}
     * @memberof CompletionItem
     */
    private UUID;
    /**
     * Creates an instance of CompletionItem.
     * @param {Monaco} monaco
     * @param {IMonaco.editor.IStandaloneCodeEditor} editor
     * @param {IConfig} config
     * @memberof CompletionItem
     */
    constructor(monaco: Monaco, editor: IMonaco.editor.IStandaloneCodeEditor, config: IConfig);
    /**
     * 根据语言类型注册
     *
     * @private
     * @return {*}  {Promise<void>}
     * @memberof CompletionItem
     */
    private registerByLanguage;
    /**
     * 注册Css完成项补全提示
     * - 通过额外库添加
     * @private
     * @return {*}  {void}
     * @memberof CompletionItem
     */
    private registerCss;
    /**
     * 注册TypeScript完成项补全提示
     * - 通过额外库添加
     * @private
     * @return {*}  {Promise<void>}
     * @memberof CompletionItem
     */
    private registerTypeScript;
    /**
     * 获取TypeScript当前全局变量
     *
     * @private
     * @return {*}  {string}
     * @memberof CompletionItem
     */
    private getTypeScriptVariable;
    /**
     * 检查模型是否属于当前编辑器实例
     *
     * @private
     * @param {IMonaco.editor.ITextModel} model
     * @return {*}  {boolean}
     * @memberof CompletionItem
     */
    private validate;
}
