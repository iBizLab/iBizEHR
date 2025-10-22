import { IEditorContainerController, IEditorProvider } from '@ibiz-template/runtime';
import { ISpan } from '@ibiz/model-core';
import { StepCodelistController } from './step-codelist.controller';
export declare class StepCodeListProvider implements IEditorProvider {
    formEditor: string;
    gridEditor: string;
    createController(editorModel: ISpan, parentController: IEditorContainerController): Promise<StepCodelistController>;
}
