import { IControlState, IFilterNodeField, IFilterNodeGroup } from '@ibiz-template/runtime';
export interface IFilterItem {
    /**
     * @description 过滤项标识
     * @type {string}
     * @memberof IFilterItem
     */
    key: string;
    /**
     * @description 标题
     * @type {string}
     * @memberof IFilterItem
     */
    caption: string;
    /**
     * @description 选中状态
     * @type {boolean}
     * @memberof IFilterItem
     */
    selected: boolean;
}
export interface IFilterGroup {
    /**
     * @description 标题
     * @type {string}
     * @memberof IFilterGroup
     */
    caption: string;
    /**
     * @description 过滤项
     * @type {IFilterItem[]}
     * @memberof IFilterGroup
     */
    children: IFilterItem[];
}
export interface IFilter {
    /**
     * @description 唯一标识
     * @type {string}
     * @memberof IFilter
     */
    key: string;
    /**
     * @description 标题
     * @type {string}
     * @memberof IFilter
     */
    caption: string;
    /**
     * @description 过滤项
     * @type {IFilterNodeField[]}
     * @memberof IFilter
     */
    filterNodeFields: IFilterNodeField[];
}
export interface IEhrSearchBarState extends IControlState {
    /**
     * @description 过滤项节点集合
     * @type {IFilterNodeGroup[]}
     * @memberof IEhrSearchBarState
     */
    filterNodes: IFilterNodeGroup[];
    /**
     * @description 过滤分组
     * @type {IFilterGroup[]}
     * @memberof IEhrSearchBarState
     */
    filterGroups: IFilterGroup[];
    /**
     * @description 保存的过滤条件
     * @type {IFilter[]}
     * @memberof IEhrSearchBarState
     */
    filters: IFilter[];
    /**
     * @description 激活过滤项
     * @type {string}
     * @memberof IEhrSearchBarState
     */
    activeFilter: string;
}
