import { CodeListItem, PanelItemController } from '@ibiz-template/runtime';
import { IPanelField, IAppDEUIAction } from '@ibiz/model-core';
import { Stencil } from '@antv/x6-plugin-stencil';
import { X6PanelItemStencilState } from './x6-panel-item-stencil.state';
import { X6PanelItemController } from '../x6-panel-item/x6-panel-item.controller';
import { X6Controller } from '../../controller';
import { X6NodeServiceProvider } from '../../interface';
import { X6DesignViewController } from '../../views';
export declare class X6PanelItemStencilController extends PanelItemController<IPanelField> {
    protected get x6Controller(): X6PanelItemController;
    /**
     * 挂载容器
     *
     * @author chitanda
     * @date 2023-11-11 15:11:06
     * @protected
     * @type {HTMLDivElement}
     */
    protected container?: HTMLDivElement;
    /**
     * 节点适配器
     *
     * @author chitanda
     * @date 2023-11-16 18:11:29
     * @type {X6NodeServiceProvider}
     */
    get provider(): X6NodeServiceProvider;
    s?: Stencil;
    get x6(): X6Controller;
    /**
     * @description 行为参数
     * @type {IData}
     * @memberof X6PanelItemStencilController
     */
    actionParams: IData;
    /**
     * @description 行为模型集合
     * @type {IAppDEUIAction[]}
     * @memberof X6PanelItemStencilController
     */
    actionModels: IAppDEUIAction[];
    /**
     * @description 是否显示分组头
     * @type {boolean}
     * @memberof X6PanelItemStencilController
     */
    showGroupHeader: boolean;
    /**
     * @description 节点数组
     * @type {IData[]}
     * @memberof X6PanelItemStencilController
     */
    nodes: IData[];
    protected createState(): X6PanelItemStencilState;
    /**
     * 视图控制器
     *
     * @author zhanghengfeng
     * @date 2025-03-17 19:03:43
     * @readonly
     * @type {X6DesignViewController}
     */
    get view(): X6DesignViewController;
    /**
     * 是否显示逻辑所有者
     *
     * @author zhanghengfeng
     * @date 2025-03-17 19:03:08
     * @type {boolean}
     */
    showLogicHolder: boolean;
    /**
     * 逻辑所有者
     *
     * @author zhanghengfeng
     * @date 2025-03-17 19:03:23
     * @type {number}
     */
    logicHolder: number;
    /**
     * 前台代码表id
     *
     * @author zhanghengfeng
     * @date 2025-03-17 19:03:36
     * @type {string}
     */
    frontCodeListId?: string;
    /**
     * 初始化
     *
     * @author zhanghengfeng
     * @date 2025-03-17 19:03:09
     * @protected
     * @return {*}  {Promise<void>}
     */
    protected onInit(): Promise<void>;
    /**
     * 初始化代码表
     *
     * @author zhanghengfeng
     * @date 2025-03-17 19:03:16
     * @protected
     * @return {*}  {void}
     */
    protected initCodeList(): void;
    /**
     *  加载代码表
     *
     * @author fangZhiHao
     * @date 2024-07-24 09:07:24
     * @param {string} appCodeListId
     * @return {*}
     */
    loadCodeList(appCodeListId: string): Promise<CodeListItem[]>;
    /**
     * 填充界面行为
     *
     * @author fangZhiHao
     * @date 2024-07-24 19:07:45
     * @param {CodeListItem[]} codeListItems
     */
    fillAction(codeListItems: CodeListItem[]): void;
    /**
     * 挂载 stencil 节点
     *
     * @author fangZhiHao
     * @date 2024-07-24 09:07:35
     * @param {CodeListItem[]} codeListItems
     */
    loadNodes(codeListItems: CodeListItem[]): void;
    /**
     *  设置事件
     *
     * @author fangZhiHao
     * @date 2024-07-24 18:07:17
     * @param {IData} action
     * @param {CodeListItem[]} codeListItems
     */
    initEevnt(): void;
    /**
     *  注册节点事件
     *
     * @author fangZhiHao
     * @date 2024-07-24 19:07:15
     * @param {string} className
     * @param {IData} action
     * @param {string} key
     */
    registerNodeEvent(container: Element, cell: IData, className: string): Promise<void>;
    /**
     * 重新加载代码表
     *
     * @author fangZhiHao
     * @date 2024-07-24 20:07:19
     * @param {IData} action
     */
    refresh(): Promise<void>;
    /**
     * @description 初始化编辑器参数
     * @param {IData} editorParams
     * @memberof X6PanelItemStencilController
     */
    initEditorParams(editorParams: IData): Promise<void>;
    initStencil(container: HTMLDivElement, count?: number): Promise<void>;
}
