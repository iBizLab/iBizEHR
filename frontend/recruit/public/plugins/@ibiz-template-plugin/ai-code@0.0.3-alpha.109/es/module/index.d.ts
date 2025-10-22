import * as IMonaco from 'monaco-editor';
import { IConfig, Monaco } from './interface';
import { CustomLanguageTheme } from './custom-language-theme/custom-language-theme';
/**
 * 代码编辑器模块中心
 *
 * @export
 * @class CodeModuleCenter
 */
export declare class CodeModuleCenter {
    private monaco;
    private config;
    /**
     * 模块
     *
     * @private
     * @type {IData[]}
     * @memberof CodeModuleCenter
     */
    private modules;
    /**
     * 主题
     *
     * @type {CustomLanguageTheme}
     * @memberof CodeModuleCenter
     */
    theme: CustomLanguageTheme;
    constructor(monaco: Monaco, config: IConfig);
    /**
     * 初始化代码编辑器模块
     *
     * @param {IMonaco.editor.IStandaloneCodeEditor} editor 代码编辑器实例
     * @memberof CodeModuleCenter
     */
    initModules(editor: IMonaco.editor.IStandaloneCodeEditor): void;
}
