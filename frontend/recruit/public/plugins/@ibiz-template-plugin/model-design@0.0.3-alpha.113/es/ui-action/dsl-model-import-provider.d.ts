import { IUIActionResult, IUILogicParams, UIActionProviderBase } from '@ibiz-template/runtime';
import { IAppDEUIAction } from '@ibiz/model-core';
/**
 * DSL模型导入
 *
 * @export
 * @class DSLModelImportProvider
 * @extends {UIActionProviderBase}
 */
export declare class DSLModelImportProvider extends UIActionProviderBase {
    execAction(action: IAppDEUIAction, args: IUILogicParams): Promise<IUIActionResult>;
    /**
     * @description 将层级参数转化为对象参数
     * @param {IData} input
     * @returns {*}  {IData}
     * @memberof DSLModelImportProvider
     */
    transformObject(input: IData): IData;
}
