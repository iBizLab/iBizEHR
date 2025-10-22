import { ISearchBar } from '@ibiz/model-core';
import { IFilter } from './ehr-search-bar.state';
/**
 * 搜索栏服务
 *
 * @export
 * @class EhrSearchBarService
 */
export declare class EhrSearchBarService {
    private readonly model;
    private context;
    /**
     * 应用配置服务
     *
     * @type {ConfigService}
     */
    private config;
    /**
     * Creates an instance of EhrSearchBarService.
     * @param {ISearchBar} model
     * @param {IContext} context
     * @memberof EhrSearchBarService
     */
    constructor(model: ISearchBar, context: IContext);
    /**
     * @description 保存
     * @param {{ filters: IFilter[] }} data
     * @returns {*}  {Promise<void>}
     * @memberof EhrSearchBarService
     */
    save(data: {
        filters: IFilter[];
    }): Promise<void>;
    /**
     * @description 加载
     * @returns {*}  {Promise<IData>}
     * @memberof EhrSearchBarService
     */
    load(): Promise<IData>;
}
