/* eslint-disable @typescript-eslint/no-unused-vars */
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
export class DBStorageService implements IDBStorageService {
  /**
   * 数据库名称
   *
   * @author tony001
   * @date 2025-03-04 18:03:03
   * @private
   * @type {string}
   */
  private dbName: string;

  /**
   * 表名称
   *
   * @author tony001
   * @date 2025-03-04 18:03:13
   * @private
   * @type {string}
   */
  private storeName: string;

  /**
   * 数据库版本
   *
   * @author tony001
   * @date 2025-03-04 18:03:23
   * @private
   * @type {number}
   */
  private dbVersion: number;

  /**
   * 存储表结构配置
   *
   * @author tony001
   * @date 2025-03-04 18:03:33
   * @private
   * @type {IDBObjectStoreParameters}
   */
  private storeConfig: IDBObjectStoreParameters;

  /**
   * 最大存储条数（0表示无限制）
   *
   * @author tony001
   * @date 2025-03-04 18:03:47
   * @private
   * @type {number}
   */
  private maxRecords: number;

  /**
   * 构造函数
   * @param dbName 数据库名称
   * @param storeName 唯一表名称
   * @param storeConfig 表结构配置
   * @param maxRecords 最大存储条数
   * @param dbVersion 数据库版本（建议在表结构变化时递增）
   */
  constructor(
    dbName: string,
    storeName: string,
    storeConfig: IDBObjectStoreParameters,
    maxRecords: number,
    dbVersion: number,
  ) {
    this.dbName = dbName;
    this.storeName = storeName;
    this.storeConfig = storeConfig;
    this.maxRecords = maxRecords;
    this.dbVersion = dbVersion;
  }

  /**
   * 带自动升级的数据库连接
   *
   * @author tony001
   * @date 2025-03-04 18:03:34
   * @private
   * @return {*}  {Promise<IDBDatabase>}
   */
  private async openDatabase(): Promise<IDBDatabase> {
    return new Promise((resolve, reject) => {
      const request = indexedDB.open(this.dbName, this.dbVersion);

      request.onupgradeneeded = event => {
        const db = request.result;
        // 自动创建表（如果不存在）
        if (!db.objectStoreNames.contains(this.storeName)) {
          const store = db.createObjectStore(this.storeName, this.storeConfig);
          // 创建时间戳索引（允许重复）
          store.createIndex('timestamp_idx', 'timestamp', { unique: false });
        }
      };

      request.onsuccess = () => resolve(request.result);
      request.onerror = () => reject(request.error);
    });
  }

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
  private async enforceDomainMaxRecords(
    store: IDBObjectStore,
    domain?: string,
  ): Promise<void> {
    if (this.maxRecords <= 0) return;

    return new Promise((resolve, reject) => {
      // 构造域过滤条件
      const keyRange = domain
        ? IDBKeyRange.bound(domain, `${domain}\uffff`, false, false)
        : undefined;

      // 获取域内记录数
      const countRequest = store.count(keyRange);

      countRequest.onsuccess = () => {
        if (countRequest.result < this.maxRecords) {
          resolve();
          return;
        }

        // 使用时间索引删除最旧记录
        const index = store.index('timestamp_idx');
        const cursorRequest = index.openCursor(null, 'next'); // 正向遍历（从旧到新）
        cursorRequest.onsuccess = () => {
          const cursor = cursorRequest.result;
          if (cursor) {
            const data = cursor.value;
            if (domain) {
              if (data.id && data.id.startsWith(domain)) {
                cursor.delete().onsuccess = () => resolve();
              } else {
                cursor.continue();
              }
            } else {
              cursor.delete().onsuccess = () => resolve();
            }
          } else {
            resolve(undefined);
          }
        };

        cursorRequest.onerror = () => {
          reject(cursorRequest.error);
        };
      };

      countRequest.onerror = () => reject(countRequest.error);
    });
  }

  /**
   * 判断数据库是否存在
   *
   * @author tony001
   * @date 2025-03-04 18:03:42
   * @return {*}  {Promise<boolean>}
   */
  async databaseExists(): Promise<boolean> {
    const databases = await indexedDB.databases();
    return databases.some(db => db.name === this.dbName);
  }

  /**
   * 判断数据表是否存在
   *
   * @author tony001
   * @date 2025-03-04 18:03:53
   * @return {*}  {Promise<boolean>}
   */
  async storeExists(): Promise<boolean> {
    const db = await this.openDatabase();
    const exists = db.objectStoreNames.contains(this.storeName);
    db.close();
    return exists;
  }

  /**
   * 添加数据（自动维护数量限制）
   *
   * @author tony001
   * @date 2025-03-04 19:03:38
   * @param {IDBEntity} data
   * @return {*}  {Promise<IDBValidKey>}
   */
  async add(data: IDBEntity): Promise<IDBValidKey> {
    const db = await this.openDatabase();
    return new Promise((resolve, reject) => {
      const transaction = db.transaction(this.storeName, 'readwrite');
      const store = transaction.objectStore(this.storeName);
      const domain = data.id.slice(0, data.id.lastIndexOf('@'));
      // 前置清理
      this.enforceDomainMaxRecords(store, domain)
        .then(() => {
          const request = store.add(data);
          request.onsuccess = () => resolve(request.result);
          request.onerror = () => reject(request.error);
        })
        .catch(reject);

      transaction.oncomplete = () => db.close();
      transaction.onerror = () => {
        db.close();
        reject(transaction.error);
      };
    });
  }

  /**
   * 删除数据
   *
   * @author tony001
   * @date 2025-03-04 18:03:50
   * @param {IDBValidKey} key
   * @return {*}  {Promise<void>}
   */
  async delete(key: IDBValidKey): Promise<void> {
    const db = await this.openDatabase();
    return new Promise((resolve, reject) => {
      const transaction = db.transaction(this.storeName, 'readwrite');
      const store = transaction.objectStore(this.storeName);
      store.delete(key);
      transaction.oncomplete = () => {
        db.close();
        resolve();
      };
      transaction.onerror = () => {
        db.close();
        reject(transaction.error);
      };
    });
  }

  /**
   * 删除指定域的数据
   *
   * @author tony001
   * @date 2025-03-12 13:03:34
   * @param {string} domain 域标识
   * @param {IDBValidKey} [excludeKey] 排除的键（可选）
   * @return {*}  {Promise<void>}
   */
  async deleteAll(domain: string, excludeKey?: IDBValidKey): Promise<void> {
    const db = await this.openDatabase();
    return new Promise((resolve, reject) => {
      const transaction = db.transaction(this.storeName, 'readwrite');
      const store = transaction.objectStore(this.storeName);

      // 构造域范围查询
      const keyRange = IDBKeyRange.bound(
        domain,
        `${domain}\uffff`,
        false,
        false,
      );
      const request = store.openCursor(keyRange);

      request.onsuccess = event => {
        const cursor = (event.target as IDBRequest<IDBCursorWithValue>).result;
        if (cursor) {
          const data = cursor.value;
          if (excludeKey) {
            if (data.id !== excludeKey) {
              cursor.delete();
            }
          } else {
            cursor.delete();
          }
          cursor.continue();
        }
      };

      transaction.oncomplete = () => {
        db.close();
        resolve();
      };

      transaction.onerror = () => {
        db.close();
        reject(transaction.error);
      };
    });
  }

  /**
   * 更新数据
   *
   * @author tony001
   * @date 2025-03-04 19:03:01
   * @param {IDBValidKey} key
   * @param {IDBEntity} data
   * @return {*}  {Promise<void>}
   */
  async update(key: IDBValidKey, data: IDBEntity): Promise<void> {
    const db = await this.openDatabase();
    return new Promise((resolve, reject) => {
      const transaction = db.transaction(this.storeName, 'readwrite');
      const store = transaction.objectStore(this.storeName);
      store.put(data);
      transaction.oncomplete = () => {
        db.close();
        resolve();
      };
      transaction.onerror = () => {
        db.close();
        reject(transaction.error);
      };
    });
  }

  /**
   * 根据主键获取单条数据
   *
   * @author tony001
   * @date 2025-03-07
   * @param {IDBValidKey} key 数据主键
   * @return {Promise<IDBEntity | undefined>} 存在返回实体，不存在返回undefined
   */
  async get(key: IDBValidKey): Promise<IDBEntity | undefined> {
    const db = await this.openDatabase();
    return new Promise((resolve, reject) => {
      const transaction = db.transaction(this.storeName, 'readonly');
      const store = transaction.objectStore(this.storeName);

      const request = store.get(key);

      request.onsuccess = () => {
        db.close();
        resolve(request.result ? request.result : undefined);
      };

      request.onerror = () => {
        db.close();
        reject(request.error);
      };
    });
  }

  /**
   * 查询全部数据
   *
   * @author tony001
   * @date 2025-03-06 11:03:23
   * @param {string} [domain]
   * @return {*}  {Promise<IDBEntity[]>}
   */
  async getAll(domain?: string, query?: string): Promise<IDBEntity[]> {
    const db = await this.openDatabase();
    return new Promise((resolve, reject) => {
      const transaction = db.transaction(this.storeName, 'readonly');
      const store = transaction.objectStore(this.storeName);
      const index = store.index('timestamp_idx'); // 使用时间戳索引
      const results: IDBEntity[] = [];

      // 反向遍历游标（从最新到最旧）
      const cursorRequest = index.openCursor(null, 'prev');

      cursorRequest.onsuccess = event => {
        const cursor = (event.target as IDBRequest<IDBCursorWithValue>).result;
        if (cursor) {
          const data = cursor.value;
          if (domain) {
            if (data.id && data.id.startsWith(domain)) {
              if (query) {
                if (data.caption?.toLowerCase().includes(query.toLowerCase())) {
                  results.push(data);
                }
              } else {
                results.push(data);
              }
            }
          } else {
            results.push(data);
          }
          cursor.continue();
        } else {
          db.close();
          resolve(results);
        }
      };

      cursorRequest.onerror = () => {
        db.close();
        reject(cursorRequest.error);
      };
    });
  }

  /**
   * 根据时间索引获取最新记录
   *
   * @author tony001
   * @date 2025-03-06 11:03:33
   * @param {string} [domain]
   * @return {*}  {(Promise<IDBEntity | undefined>)}
   */
  async getLastByTimestamp(domain?: string): Promise<IDBEntity | undefined> {
    const db = await this.openDatabase();
    return new Promise((resolve, reject) => {
      const transaction = db.transaction(this.storeName, 'readonly');
      const store = transaction.objectStore(this.storeName);
      const index = store.index('timestamp_idx');

      const cursorRequest = index.openCursor(null, 'prev');

      cursorRequest.onsuccess = () => {
        const cursor = cursorRequest.result;
        if (cursor) {
          const data = cursor.value;
          if (domain) {
            if (data.id && data.id.startsWith(domain)) {
              db.close();
              resolve(data);
            } else {
              cursor.continue();
            }
          } else {
            db.close();
            resolve(data);
          }
        } else {
          db.close();
          resolve(undefined);
        }
      };

      cursorRequest.onerror = () => {
        db.close();
        reject(cursorRequest.error);
      };
    });
  }

  /**
   * 获取指定域数据记录数量
   *
   * @author tony001
   * @date 2025-03-07 11:03:09
   * @param {string} [domain] 域过滤条件（基于id前缀）
   * @return {*}  {Promise<number>} 数据条数
   */
  async count(domain?: string): Promise<number> {
    const db = await this.openDatabase();
    return new Promise((resolve, reject) => {
      const transaction = db.transaction(this.storeName, 'readonly');
      const store = transaction.objectStore(this.storeName);

      // 构造范围查询（当有domain时）
      const keyRange = domain
        ? IDBKeyRange.bound(domain, `${domain}\uffff`, false, false)
        : undefined;

      const request = store.count(keyRange);

      request.onsuccess = () => {
        db.close();
        resolve(request.result);
      };

      request.onerror = () => {
        db.close();
        reject(request.error);
      };
    });
  }
}
