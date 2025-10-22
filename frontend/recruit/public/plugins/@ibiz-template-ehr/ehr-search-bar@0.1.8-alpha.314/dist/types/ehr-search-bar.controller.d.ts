import { IAppDataEntity, ISearchBar } from '@ibiz/model-core';
import { ISearchBarEvent, IFilterNodeField, ControlController, SearchBarFilterController } from '@ibiz-template/runtime';
import { IEhrSearchBarState } from './ehr-search-bar.state';
import { EhrSearchBarService } from './ehr-search-bar.service';
export declare class EhrSearchBarController extends ControlController<ISearchBar, IEhrSearchBarState, ISearchBarEvent> {
    /**
     * @description 搜索栏服务
     * @type {EhrSearchBarService}
     * @memberof EhrSearchBarController
     */
    service: EhrSearchBarService;
    /**
     * @description 应用实体
     * @type {IAppDataEntity}
     * @memberof EhrSearchBarController
     */
    appDataEntity: IAppDataEntity;
    /**
     * @description 过滤项控制器集合
     * @type {SearchBarFilterController[]}
     * @memberof EhrSearchBarController
     */
    filterControllers: SearchBarFilterController[];
    /**
     * @description 初始化state的属性
     * @protected
     * @memberof EhrSearchBarController
     */
    protected initState(): void;
    /**
     * @description 生命周期-创建完成
     * @protected
     * @returns {*}  {Promise<void>}
     * @memberof EhrSearchBarController
     */
    protected onCreated(): Promise<void>;
    /**
     * @description 获取过滤参数
     * @returns {*}  {IParams}
     * @memberof EhrSearchBarController
     */
    getFilterParams(): IParams;
    /**
     * @description 根据节点数据查找过滤项控制器
     * @param {(IFilterNodeField | IFilterNodeItems)} node
     * @returns {*}  {(SearchBarFilterController | undefined)}
     * @memberof EhrSearchBarController
     */
    findFilterControllerByNode(node: IFilterNodeField): SearchBarFilterController | undefined;
    /**
     * @description 初始化过滤项控制器
     * @protected
     * @returns {*}  {Promise<void>}
     * @memberof EhrSearchBarController
     */
    protected initSearchBarFilters(): Promise<void>;
    /**
     * @description 初始化过滤节点分组数据
     * @protected
     * @memberof EhrSearchBarController
     */
    protected initFilterNodes(): void;
    /**
     * @description 初始化过滤分组数据
     * @protected
     * @memberof EhrSearchBarController
     */
    protected initFilterGroup(): void;
    /**
     * @description 处理过滤改变
     * @param {string} key
     * @memberof EhrSearchBarController
     */
    handleFilterChange(key: string): void;
    /**
     * @description 处理过滤项改变
     * @param {string} key 过滤项标识
     * @param {boolean} state
     * @memberof EhrSearchBarController
     */
    handleFilterItemChange(key: string, state: boolean): void;
    /**
     * @description 搜索
     * @memberof EhrSearchBarController
     */
    onSearch(): void;
    /**
     * @description 重置
     * @memberof EhrSearchBarController
     */
    onReset(): void;
    /**
     * @description 保存过滤条件
     * @param {string} caption
     * @returns {*}  {Promise<void>}
     * @memberof EhrSearchBarController
     */
    onSaveFilter(caption: string): Promise<void>;
    /**
     * @description 删除过滤条件
     * @param {string} key
     * @returns {*}  {Promise<void>}
     * @memberof EhrSearchBarController
     */
    onRemoveFilter(key: string): Promise<void>;
}
