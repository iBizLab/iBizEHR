import { HttpResponse, IHttpResponse } from '@ibiz-template/core';
import { IDataEntity, Method } from '@ibiz-template/runtime';
import { IAppDEAction } from '@ibiz/model-core';
/**
 * 前端实时数据方法实现（本地版本管理使用）
 *
 * @author tony001
 * @date 2025-03-06 14:03:54
 * @export
 * @class RealTimeDataMethod
 * @extends {Method}
 */
export declare class RealTimeDataMethod extends Method {
    method: IAppDEAction;
    /**
     * 处理请求发送参数
     *
     * @author tony001
     * @date 2025-03-06 14:03:41
     * @param {IContext} context
     * @param {(IData | IData[])} data
     * @return {*}  {(Promise<IData | IData[]>)}
     */
    inputHandle(context: IContext, data: IData | IData[]): Promise<IData | IData[]>;
    /**
     * 格式化输入参数
     *
     * @author tony001
     * @date 2025-03-06 14:03:51
     * @param {IContext} context
     * @param {(IData | IData[])} data
     * @return {*}  {(Promise<IData | IData[]>)}
     */
    inputFormat(context: IContext, data: IData | IData[]): Promise<IData | IData[]>;
    /**
     * 获取方法
     *
     * @author tony001
     * @date 2025-03-06 15:03:10
     * @protected
     * @param {string} id
     * @param {boolean} [acMode=false]
     * @return {*}  {Promise<Method>}
     */
    protected getMethod(id: string, acMode?: boolean): Promise<Method>;
    /**
     * 执行行为
     *
     * @author tony001
     * @date 2025-03-06 15:03:34
     * @param {IContext} context
     * @param {(IData | IData[])} [data]
     * @param {IParams} [params]
     * @param {IData} [header]
     * @return {*}  {Promise<HttpResponse<IData>>}
     */
    exec(context: IContext, data?: IData | IData[], params?: IParams, header?: IData): Promise<HttpResponse<IData>>;
    /**
     * 获取临时实时数据
     *
     * @author tony001
     * @date 2025-03-06 15:03:52
     * @param {IContext} context
     * @param {IParams} [params]
     * @return {*}  {Promise<IHttpResponse<IDataEntity>>}
     */
    getTempRealTimeData(context: IContext, params?: IParams): Promise<IHttpResponse<IDataEntity>>;
    /**
     * 更新临时实时数据
     *
     * @author tony001
     * @date 2025-03-06 15:03:50
     * @param {IContext} context
     * @param {(IData | IData[])} [data]
     * @param {IParams} [params]
     * @return {*}  {Promise<IHttpResponse<IDataEntity>>}
     */
    updateTempRealTimeData(context: IContext, data?: IData | IData[], params?: IParams): Promise<IHttpResponse<IDataEntity>>;
}
