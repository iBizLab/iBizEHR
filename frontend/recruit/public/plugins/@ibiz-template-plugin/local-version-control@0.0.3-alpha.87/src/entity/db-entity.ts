/* eslint-disable no-useless-constructor */
/* eslint-disable no-empty-function */
import { IDBEntity } from '../interface';

/**
 * 数据库实体
 *
 * @author tony001
 * @date 2025-03-04 18:03:06
 * @export
 * @class DBEntity
 */
export class DBEntity implements IDBEntity {
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
  constructor(
    public index: number,
    public id: string,
    public caption: string,
    public username: string,
    public timestamp: number,
    public data: IData,
  ) {}
}
