import { IUIActionResult, IUILogicParams, UIActionProviderBase } from '@ibiz-template/runtime';
import { IAppDEUIAction } from '@ibiz/model-core';
/**
 * dsl模型编辑
 *
 * @export
 * @class DSLModelEditProvider
 * @extends {UIActionProviderBase}
 */
export declare class DSLModelEditProvider extends UIActionProviderBase {
    execAction(action: IAppDEUIAction, args: IUILogicParams): Promise<IUIActionResult>;
}
