import { IConfig, Monaco } from '../interface';
/**
 * 自定义语言主题
 *
 * @export
 * @class CustomTheme
 */
export declare class CustomLanguageTheme {
    private monaco;
    private config;
    /**
     * 主题名称
     *
     * @type {string}
     * @memberof CustomTheme
     */
    themeName: string;
    /**
     * Creates an instance of CompletionItem.
     * @param {Monaco} monaco
     * @param {IMonaco.editor.IStandaloneCodeEditor} editor
     * @param {IConfig} config
     * @memberof CompletionItem
     */
    constructor(monaco: Monaco, config: IConfig);
    /**
     * 根据语言类型注册
     *
     * @private
     * @memberof CustomTheme
     */
    private registerByLanguage;
    /**
     * 注册并应用TS自定义主题
     *
     * @private
     * @memberof CustomTheme
     */
    private registerTypeScriptTheme;
}
