import { IUIActionResult, IUILogicParams, UIActionProviderBase } from '@ibiz-template/runtime';
import { IAppDEUIAction } from '@ibiz/model-core';
/**
 * DSL模型导出
 *
 * @export
 * @class DSLModelExportProvider
 * @extends {UIActionProviderBase}
 */
export declare class DSLModelExportProvider extends UIActionProviderBase {
    execAction(action: IAppDEUIAction, args: IUILogicParams): Promise<IUIActionResult>;
    /**
     * @description 将层级参数转化为对象参数
     * @param {IData} input
     * @returns {*}
     * @memberof DSLModelExportProvider
     */
    transformObject(input: IData): IData;
}
