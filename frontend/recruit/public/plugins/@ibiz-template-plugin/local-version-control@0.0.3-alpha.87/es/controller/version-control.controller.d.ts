import { IAppDataEntity } from '@ibiz/model-core';
import { defaultType, QXEventEx, ViewController } from '@ibiz-template/runtime';
import { IDBEntity, IVersionControlController } from '../interface';
/**
 * 版本控制控制器
 *
 * @author tony001
 * @date 2025-03-04 14:03:29
 * @export
 * @class VersionControlController
 * @implements {IVersionControlController}
 */
export declare class VersionControlController implements IVersionControlController {
    private view;
    private appDataEntity;
    /**
     * db存储服务
     *
     * @author tony001
     * @date 2025-03-04 18:03:17
     * @private
     * @type {DBStorageService}
     */
    private db;
    /**
     * 事件对象
     *
     * @author tony001
     * @date 2025-03-06 16:03:46
     */
    readonly evt: QXEventEx<defaultType>;
    /**
     * 激活项标识
     *
     * @author tony001
     * @date 2025-03-07 17:03:39
     * @type {string}
     */
    activeItemId: string;
    /**
     * 数据是否修改
     *
     * @author tony001
     * @date 2025-03-07 18:03:09
     * @type {boolean}
     */
    isDirty: boolean;
    /**
     * 上限值
     *
     * @author tony001
     * @date 2025-03-07 15:03:12
     * @private
     * @type {number}
     */
    private overUpNumber;
    /**
     * 超出上限时是否清除
     *
     * @author tony001
     * @date 2025-03-07 15:03:26
     * @private
     * @type {boolean}
     */
    private overUpIsClean;
    /**
     * Creates an instance of VersionControlController.
     * @author tony001
     * @date 2025-03-06 16:03:23
     * @param {ViewController} view
     * @param {IAppDataEntity} appDataEntity
     * @param {string} dbName
     * @param {string} storeName
     * @param {IDBObjectStoreParameters} storeConfig
     * @param {number} maxRecords
     * @param {number} dbVersion
     */
    constructor(view: ViewController, appDataEntity: IAppDataEntity, dbName: string, storeName: string, storeConfig: IDBObjectStoreParameters, maxRecords: number, dbVersion: number);
    /**
     * 获取超出上限关联状态
     *
     * @author tony001
     * @date 2025-03-07 15:03:01
     * @return {*}  {IData}
     */
    getOverUpState(): IData;
    /**
     * 设置超出上限关联状态
     *
     * @author tony001
     * @date 2025-03-07 15:03:28
     * @param {boolean} overUpIsClean
     */
    setOverUpState(overUpIsClean: boolean): void;
    /**
     * 获取本地版本存储主键
     *
     * @author tony001
     * @date 2025-03-05 14:03:58
     * @protected
     * @param {IData} data
     * @param {number} timestamp
     * @return {*}  {string}
     */
    protected getLocalVersionKey(data: IData, timestamp: number): string;
    /**
     * 获取本地版本数据域
     *
     * @author tony001
     * @date 2025-03-06 10:03:02
     * @protected
     * @return {*}  {string}
     */
    protected getLocalVersionDomain(): string;
    /**
     * 检查是否允许添加(最后保存的数据与当前数据一致，不需要再次保存)
     *
     * @author tony001
     * @date 2025-03-05 16:03:35
     * @param {IData} data
     * @return {*}  {Promise<{ ret:  boolean; data: IDBEntity | undefined }>}
     */
    checkEnableAdd(data: IData): Promise<{
        ret: boolean;
        data: IDBEntity | undefined;
    }>;
    /**
     * 添加数据
     *
     * @author tony001
     * @date 2025-03-07 20:03:35
     * @param {IData} data
     * @param {boolean} [isShowOverUp=true] 是否显示超出上限提醒
     * @return {*}  {(Promise<IDBEntity | undefined>)}
     */
    add(data: IData, isShowOverUp?: boolean): Promise<IDBEntity | undefined>;
    /**
     * 手动添加数据
     *
     * @author tony001
     * @date 2025-03-12 11:03:43
     * @param {IData} data
     * @param {string} [caption]
     * @return {*}  {(Promise<IDBEntity | undefined>)}
     */
    manualAdd(data: IData, caption?: string): Promise<IDBEntity | undefined>;
    /**
     * 获取所有数据
     *
     * @author tony001
     * @date 2025-03-09 17:03:43
     * @param {string} [query]
     * @return {*}  {Promise<IDBEntity[]>}
     */
    fetchAll(query?: string): Promise<IDBEntity[]>;
    /**
     * 应用数据
     *
     * @author tony001
     * @date 2025-03-06 10:03:34
     * @param {IDBEntity} data
     * @return {*}  {Promise<boolean>}
     */
    apply(data: IDBEntity): Promise<boolean>;
    /**
     * 删除数据
     *
     * @author tony001
     * @date 2025-03-06 10:03:35
     * @param {IDBEntity} data
     * @return {*}  {Promise<boolean>}
     */
    remove(data: IDBEntity): Promise<boolean>;
    /**
     * 比对数据
     *
     * @author tony001
     * @date 2025-03-06 10:03:46
     * @param {IDBEntity} data
     * @param {IDBEntity[]} datas
     * @return {*}  {Promise<IData>}
     */
    diff(data: IDBEntity, datas: IDBEntity[]): Promise<IData>;
    /**
     * 重命名
     *
     * @author tony001
     * @date 2025-03-06 17:03:43
     * @param {string} id
     * @param {string} caption
     * @return {*}  {Promise<boolean>}
     */
    updateCaption(id: string, caption: string): Promise<boolean>;
    /**
     * 清除所有数据
     *
     * @author tony001
     * @date 2025-03-12 13:03:30
     * @param {boolean} [isExcludeActivedItem] 是否排除激活项
     * @return {*}  {Promise<boolean>}
     */
    deleteAll(isExcludeActivedItem?: boolean): Promise<boolean>;
}
