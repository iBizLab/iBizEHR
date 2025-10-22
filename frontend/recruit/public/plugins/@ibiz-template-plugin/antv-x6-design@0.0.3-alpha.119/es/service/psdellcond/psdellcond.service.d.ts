import { DEService, IAppService, IDataEntity } from '@ibiz-template/runtime';
import { IAppDataEntity, ICodeItem } from '@ibiz/model-core';
import { IHttpResponse } from '@ibiz-template/core';
/**
 * 表单项服务对象
 *
 * @author chitanda
 * @date 2023-12-23 18:12:50
 * @export
 * @class PSDellCondService
 * @extends {DEService}
 */
export declare class PSDellCondService extends DEService {
    /**
     * 类型代码表
     * @author lxm
     * @date 2023-12-27 05:06:47
     * @protected
     * @type {ICodeItem[]}
     */
    protected typeCodeItems: ICodeItem[];
    protected app: IAppService;
    constructor(srfSessionId: string, model: IAppDataEntity);
    protected newEntity(data: IData | IDataEntity): IDataEntity;
    protected updateLogicLinkCount(context: IContext): Promise<void>;
    /**
     * @description 填充默认数据
     * @protected
     * @param {IContext} context
     * @param {(IData | IData[])} params
     * @returns {*}  {Promise<void>}
     * @memberof PSDellCondService
     */
    protected fillDefault(context: IContext, params: IData | IData[]): Promise<void>;
    exec(id: string, context: IContext, params?: IData | IData[], params2?: IParams): Promise<IHttpResponse<IData>>;
}
