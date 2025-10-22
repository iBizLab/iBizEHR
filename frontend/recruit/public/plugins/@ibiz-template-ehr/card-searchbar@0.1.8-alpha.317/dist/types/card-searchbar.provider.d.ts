import { CTX, IControlController, IControlProvider } from '@ibiz-template/runtime';
import { IControl } from '@ibiz/model-core';
export declare class CardSearchbarProvider implements IControlProvider {
    component: string;
    createController(model: IControl, context: IContext, params: IParams, ctx: CTX): IControlController;
}
