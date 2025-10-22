/// <reference types="node" />
import { IAppDEService, PanelItemController, ViewController } from '@ibiz-template/runtime';
import { IAppDataEntity, IPanelRawItem } from '@ibiz/model-core';
import { IDBEntity, IVersionControlController } from '../../interface';
import { LocalVersionTagState } from './local-version-tag.state';
export declare class LocalVersionTagController extends PanelItemController<IPanelRawItem> {
    state: LocalVersionTagState;
    /**
     * 自定义补充参数
     *
     * @author tony001
     * @date 2025-03-04 18:03:13
     * @type {IData}
     */
    rawItemParams: IData;
    /**
     * 版本控制器
     *
     * @author tony001
     * @date 2025-03-04 19:03:03
     * @public
     * @type {(IVersionControlController | undefined)}
     */
    versionControl: IVersionControlController | undefined;
    /**
     * 主数据实体
     *
     * @author tony001
     * @date 2025-03-05 16:03:29
     * @protected
     * @type {IAppDataEntity}
     */
    protected appDataEntity: IAppDataEntity;
    /**
     * 主数据服务
     *
     * @author tony001
     * @date 2025-03-05 16:03:42
     * @protected
     * @type {IAppDEService}
     */
    protected service: IAppDEService;
    /**
     * 定时器标识
     *
     * @author tony001
     * @date 2025-03-05 16:03:56
     * @protected
     * @type {(NodeJS.Timeout | undefined)}
     */
    protected intervaler: NodeJS.Timeout | undefined;
    /**
     * 视图编辑事件名称
     *
     * @author tony001
     * @date 2025-03-07 18:03:37
     * @protected
     * @type {string[]}
     */
    protected viewEditEventNames: string[];
    /**
     * 创建状态
     *
     * @author tony001
     * @date 2025-03-04 14:03:13
     * @protected
     * @return {*}  {LocalVersionTagState}
     */
    protected createState(): LocalVersionTagState;
    /**
     * 视图控制器
     *
     * @author tony001
     * @date 2025-03-04 14:03:53
     * @readonly
     * @type {(ViewController)}
     */
    get view(): ViewController;
    /**
     * 初始化
     *
     * @author tony001
     * @date 2025-03-04 14:03:59
     * @protected
     * @return {*}  {Promise<void>}
     */
    protected onInit(): Promise<void>;
    /**
     * 处理基础参数
     *
     * @author tony001
     * @date 2025-03-04 18:03:14
     * @protected
     */
    protected initBaseParams(): Promise<void>;
    /**
     * 初始化版本控制器
     *
     * @author tony001
     * @date 2025-03-05 14:03:30
     * @protected
     * @return {*}  {Promise<void>}
     */
    protected initVersionControl(): Promise<void>;
    /**
     * 定时报错
     *
     * @author tony001
     * @date 2025-03-05 16:03:52
     * @protected
     */
    protected intervalSave(): Promise<void>;
    /**
     * 监听检查Ctrl+S组合键（Mac系统同时兼容Cmd+S），本地版本需保存
     *
     * @author tony001
     * @date 2025-03-06 13:03:57
     * @protected
     * @param {KeyboardEvent} event
     */
    protected handleKeyDown(event: KeyboardEvent): void;
    /**
     * 更新版本数据
     *
     * @author tony001
     * @date 2025-03-06 16:03:31
     * @protected
     * @param {IDBEntity} data
     */
    updateVersion: (data: IDBEntity) => void;
    /**
     * 更新脏值装填
     *
     * @author tony001
     * @date 2025-03-07 19:03:36
     * @param {boolean} dirty
     */
    updateDirty: (dirty: boolean) => void;
    /**
     * 订阅用户操作
     *
     * @author tony001
     * @date 2025-03-06 13:03:59
     * @protected
     * @return {*}  {Promise<void>}
     */
    protected subscribeUserAction(): Promise<void>;
    /**
     * 取消订阅用户操作
     *
     * @author tony001
     * @date 2025-03-06 13:03:38
     * @protected
     * @return {*}  {Promise<void>}
     */
    protected unSubscribeUserAction(): Promise<void>;
    /**
     * 保存本地版本
     *
     * @author tony001
     * @date 2025-03-05 15:03:58
     * @protected
     * @return {*}  {Promise<void>}
     */
    protected saveLocalVersion(): Promise<void>;
    /**
     * 销毁
     *
     * @author tony001
     * @date 2025-03-04 14:03:24
     */
    destroy(): void;
}
