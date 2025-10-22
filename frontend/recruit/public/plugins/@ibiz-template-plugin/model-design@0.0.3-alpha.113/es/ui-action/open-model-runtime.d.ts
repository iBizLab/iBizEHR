import { IUIActionResult, IUILogicParams, UIActionProviderBase } from '@ibiz-template/runtime';
import { IAppDEUIAction } from '@ibiz/model-core';
/**
 * 打开运行时模型
 *
 * @export
 * @class OpenModelRuntimeProvider
 * @extends {UIActionProviderBase}
 */
export declare class OpenModelRuntimeProvider extends UIActionProviderBase {
    execAction(action: IAppDEUIAction, args: IUILogicParams): Promise<IUIActionResult>;
}
