import { IDBEntity } from '../entity/i-db-entity';
/**
 * DBIndex 存储服务接口
 *
 * @author tony001
 * @date 2025-03-04 14:03:04
 * @export
 * @interface IDBStorageService
 */
export interface IDBStorageService {
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
     * @date 2025-03-04 19:03:54
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
     * @date 2025-03-04 19:03:15
     * @param {IDBValidKey} key
     * @param {IDBEntity} data
     * @return {*}  {Promise<void>}
     */
    update(key: IDBValidKey, data: IDBEntity): Promise<void>;
    /**
     * 获取指定数据
     *
     * @author tony001
     * @date 2025-03-06 17:03:03
     * @param {IDBValidKey} key
     * @return {*}  {(Promise<IDBEntity | undefined>)}
     */
    get(key: IDBValidKey): Promise<IDBEntity | undefined>;
    /**
     * 查询全部数据
     *
     * @author tony001
     * @date 2025-03-09 17:03:29
     * @param {string} [domain]
     * @param {string} [query]
     * @return {*}  {Promise<IDBEntity[]>}
     */
    getAll(domain?: string, query?: string): Promise<IDBEntity[]>;
    /**
     * 根据时间索引获取最新记录
     *
     * @author tony001
     * @date 2025-03-06 11:03:58
     * @param {string} [domain]
     * @return {*}  {(Promise<IDBEntity | undefined>)}
     */
    getLastByTimestamp(domain?: string): Promise<IDBEntity | undefined>;
    /**
     * count(domain?: string): Promise<number>
     *
     * @author tony001
     * @date 2025-03-07 11:03:01
     * @param {string} [domain]
     * @return {*}  {Promise<number>}
     */
    count(domain?: string): Promise<number>;
}
