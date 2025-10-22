import { IDBEntity } from '../interface';
/**
 * 数据库实体
 *
 * @author tony001
 * @date 2025-03-04 18:03:06
 * @export
 * @class DBEntity
 */
export declare class DBEntity implements IDBEntity {
    index: number;
    id: string;
    caption: string;
    username: string;
    timestamp: number;
    data: IData;
    /**
     * Creates an instance of DBEntity.
     * @author tony001
     * @date 2025-03-07 17:03:34
     * @param {number} index
     * @param {string} id
     * @param {string} caption
     * @param {string} username
     * @param {number} timestamp
     * @param {IData} data
     */
    constructor(index: number, id: string, caption: string, username: string, timestamp: number, data: IData);
}
