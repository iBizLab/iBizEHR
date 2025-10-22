import { IAppDEService, IDEMethodCreateOptions, IDEMethodProvider, Method } from '@ibiz-template/runtime';
import { IAppDataEntity, IAppDEMethod } from '@ibiz/model-core';
/**
 * 前端实时数据方法适配器（本地版本管理使用）
 *
 * @author tony001
 * @date 2025-03-06 14:03:54
 * @export
 * @class RealTimeDataProvider
 * @implements {IDEMethodProvider}
 */
export declare class RealTimeDataProvider implements IDEMethodProvider {
    create(service: IAppDEService, entity: IAppDataEntity, method: IAppDEMethod, opts: IDEMethodCreateOptions): Method;
}
