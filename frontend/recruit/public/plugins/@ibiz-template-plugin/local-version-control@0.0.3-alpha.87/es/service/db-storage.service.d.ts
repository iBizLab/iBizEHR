import { IDBEntity, IDBStorageService } from '../interface';
/**
 * DBIndex 存储服务
 *
 * @author tony001
 * @date 2025-03-04 14:03:47
 * @export
 * @class DBStorageService
 * @implements {IDBStorageService}
 */
export declare class DBStorageService implements IDBStorageService {
    /**
     * 数据库名称
     *
     * @author tony001
     * @date 2025-03-04 18:03:03
     * @private
     * @type {string}
     */
    private dbName;
    /**
     * 表名称
     *
     * @author tony001
     * @date 2025-03-04 18:03:13
     * @private
     * @type {string}
     */
    private storeName;
    /**
     * 数据库版本
     *
     * @author tony001
     * @date 2025-03-04 18:03:23
     * @private
     * @type {number}
     */
    private dbVersion;
    /**
     * 存储表结构配置
     *
     * @author tony001
     * @date 2025-03-04 18:03:33
     * @private
     * @type {IDBObjectStoreParameters}
     */
    private storeConfig;
    /**
     * 最大存储条数（0表示无限制）
     *
     * @author tony001
     * @date 2025-03-04 18:03:47
     * @private
     * @type {number}
     */
    private maxRecords;
    /**
     * 构造函数
     * @param dbName 数据库名称
     * @param storeName 唯一表名称
     * @param storeConfig 表结构配置
     * @param maxRecords 最大存储条数
     * @param dbVersion 数据库版本（建议在表结构变化时递增）
     */
    constructor(dbName: string, storeName: string, storeConfig: IDBObjectStoreParameters, maxRecords: number, dbVersion: number);
    /**
     * 带自动升级的数据库连接
     *
     * @author tony001
     * @date 2025-03-04 18:03:34
     * @private
     * @return {*}  {Promise<IDBDatabase>}
     */
    private openDatabase;
    /**
     * 自动维护指定域的数据量限制
     *
     * @author tony001
     * @date 2025-03-07 15:03:30
     * @private
     * @param {IDBObjectStore} store 存储对象
     * @param {string} [domain] 域标识（可选）
     * @return {*}
     */
    private enforceDomainMaxRecords;
    /**
     * 判断数据库是否存在
     *
     * @author tony001
     * @date 2025-03-04 18:03:42
     * @return {*}  {Promise<boolean>}
     */
    databaseExists(): Promise<boolean>;
    /**
     * 判断数据表是否存在
     *
     * @author tony001
     * @date 2025-03-04 18:03:53
     * @return {*}  {Promise<boolean>}
     */
    storeExists(): Promise<boolean>;
    /**
     * 添加数据（自动维护数量限制）
     *
     * @author tony001
     * @date 2025-03-04 19:03:38
     * @param {IDBEntity} data
     * @return {*}  {Promise<IDBValidKey>}
     */
    add(data: IDBEntity): Promise<IDBValidKey>;
    /**
     * 删除数据
     *
     * @author tony001
     * @date 2025-03-04 18:03:50
     * @param {IDBValidKey} key
     * @return {*}  {Promise<void>}
     */
    delete(key: IDBValidKey): Promise<void>;
    /**
     * 删除指定域的数据
     *
     * @author tony001
     * @date 2025-03-12 13:03:34
     * @param {string} domain 域标识
     * @param {IDBValidKey} [excludeKey] 排除的键（可选）
     * @return {*}  {Promise<void>}
     */
    deleteAll(domain: string, excludeKey?: IDBValidKey): Promise<void>;
    /**
     * 更新数据
     *
     * @author tony001
     * @date 2025-03-04 19:03:01
     * @param {IDBValidKey} key
     * @param {IDBEntity} data
     * @return {*}  {Promise<void>}
     */
    update(key: IDBValidKey, data: IDBEntity): Promise<void>;
    /**
     * 根据主键获取单条数据
     *
     * @author tony001
     * @date 2025-03-07
     * @param {IDBValidKey} key 数据主键
     * @return {Promise<IDBEntity | undefined>} 存在返回实体，不存在返回undefined
     */
    get(key: IDBValidKey): Promise<IDBEntity | undefined>;
    /**
     * 查询全部数据
     *
     * @author tony001
     * @date 2025-03-06 11:03:23
     * @param {string} [domain]
     * @return {*}  {Promise<IDBEntity[]>}
     */
    getAll(domain?: string, query?: string): Promise<IDBEntity[]>;
    /**
     * 根据时间索引获取最新记录
     *
     * @author tony001
     * @date 2025-03-06 11:03:33
     * @param {string} [domain]
     * @return {*}  {(Promise<IDBEntity | undefined>)}
     */
    getLastByTimestamp(domain?: string): Promise<IDBEntity | undefined>;
    /**
     * 获取指定域数据记录数量
     *
     * @author tony001
     * @date 2025-03-07 11:03:09
     * @param {string} [domain] 域过滤条件（基于id前缀）
     * @return {*}  {Promise<number>} 数据条数
     */
    count(domain?: string): Promise<number>;
}
