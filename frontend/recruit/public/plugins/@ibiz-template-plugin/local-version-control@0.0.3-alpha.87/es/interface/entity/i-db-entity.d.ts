/**
 * 数据库实体
 *
 * @author tony001
 * @date 2025-03-04 18:03:28
 * @export
 * @interface IDBEntity
 */
export interface IDBEntity {
    /**
     * 数据主键
     *
     * @author tony001
     * @date 2025-03-04 18:03:56
     * @type {string}
     */
    id: string;
    /**
     * 标题
     *
     * @author tony001
     * @date 2025-03-04 19:03:36
     * @type {string}
     */
    caption: string;
    /**
     * 操作人
     *
     * @author tony001
     * @date 2025-03-05 13:03:38
     * @type {string}
     */
    username: string;
    /**
     * 时间戳
     *
     * @author tony001
     * @date 2025-03-04 18:03:28
     * @type {number}
     */
    timestamp: number;
    /**
     * 业务数据
     *
     * @author tony001
     * @date 2025-03-04 18:03:54
     * @type {IData}
     */
    data: IData;
    /**
     * 索引值
     *
     * @author tony001
     * @date 2025-03-07 17:03:02
     * @type {number}
     */
    index: number;
}
