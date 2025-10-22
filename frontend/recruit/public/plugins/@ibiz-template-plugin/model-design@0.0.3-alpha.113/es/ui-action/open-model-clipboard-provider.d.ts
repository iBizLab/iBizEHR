import { IUIActionResult, IUILogicParams, UIActionProviderBase } from '@ibiz-template/runtime';
import { IAppDEUIAction } from '@ibiz/model-core';
/**
 * 打开模型粘贴版
 *
 * @export
 * @class OpenModelClipboardProvider
 * @extends {UIActionProviderBase}
 */
export declare class OpenModelClipboardProvider extends UIActionProviderBase {
    execAction(action: IAppDEUIAction, args: IUILogicParams): Promise<IUIActionResult>;
}
