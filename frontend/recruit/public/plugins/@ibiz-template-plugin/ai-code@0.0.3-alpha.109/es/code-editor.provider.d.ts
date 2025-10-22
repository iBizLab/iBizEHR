import { IEditorContainerController, IEditorProvider } from '@ibiz-template/runtime';
import { ICode } from '@ibiz/model-core';
import { CodeEditorController } from './code-editor.controller';
/**
 * AI代码框编辑器适配器
 *
 * @export
 * @class CodeEditorProvider
 * @implements {IEditorProvider}
 */
export declare class CodeEditorProvider implements IEditorProvider {
    formEditor: string;
    gridEditor: string;
    createController(editorModel: ICode, parentController: IEditorContainerController): Promise<CodeEditorController>;
}
