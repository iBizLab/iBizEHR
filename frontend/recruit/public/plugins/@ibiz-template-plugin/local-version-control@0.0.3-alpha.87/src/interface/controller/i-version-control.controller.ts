import { defaultType, QXEventEx } from '@ibiz-template/runtime';
import { IDBEntity } from '../entity/i-db-entity';

/**
 * 版本控制控制器接口
 *
 * @author tony001
 * @date 2025-03-04 13:03:28
 * @export
 * @interface IVersionControlController
 */
export interface IVersionControlController {
  /**
   * 事件对象
   *
   * @author tony001
   * @date 2025-03-06 16:03:43
   * @type {QXEventEx<defaultType>}
   */
  evt: QXEventEx<defaultType>;

  /**
   * 激活项标识
   *
   * @author tony001
   * @date 2025-03-07 17:03:57
   * @type {string}
   */
  activeItemId: string;

  /**
   * 数据是否修改
   *
   * @author tony001
   * @date 2025-03-07 19:03:24
   * @type {boolean}
   */
  isDirty: boolean;

  /**
   * 获取超出上限关联状态
   *
   * @author tony001
   * @date 2025-03-07 15:03:37
   * @return {*}  {IData}
   */
  getOverUpState(): IData;

  /**
   * 设置超出上限关联状态
   *
   * @author tony001
   * @date 2025-03-07 15:03:48
   * @param {boolean} overUpIsClean
   */
  setOverUpState(overUpIsClean: boolean): void;

  /**
   * 检查能否添加指定数据
   *
   * @author tony001
   * @date 2025-03-05 16:03:05
   * @param {IData} data
   * @return {*}  {Promise<{ ret:  boolean; data: IDBEntity | undefined }>}
   */
  checkEnableAdd(
    data: IData,
  ): Promise<{ ret: boolean; data: IDBEntity | undefined }>;
  /**
   * 添加数据
   *
   * @author tony001
   * @date 2025-03-05 14:03:24
   * @param {IData} data
   * @return {*}  {Promise<IDBEntity | undefined>}
   */
  add(data: IData): Promise<IDBEntity | undefined>;

  /**
   * 手动添加数据
   *
   * @author tony001
   * @date 2025-03-12 11:03:23
   * @param {IData} data
   * @param {string} [caption]
   * @return {*}  {(Promise<IDBEntity | undefined>)}
   */
  manualAdd(data: IData, caption?: string): Promise<IDBEntity | undefined>;

  /**
   * 查询所有数据
   *
   * @author tony001
   * @date 2025-03-09 17:03:03
   * @param {string} [query]
   * @return {*}  {Promise<IDBEntity[]>}
   */
  fetchAll(query?: string): Promise<IDBEntity[]>;

  /**
   * 应用数据
   *
   * @author tony001
   * @date 2025-03-06 10:03:05
   * @param {IDBEntity} data
   * @return {*}  {Promise<boolean>}
   */
  apply(data: IDBEntity): Promise<boolean>;

  /**
   * 删除数据
   *
   * @author tony001
   * @date 2025-03-06 10:03:31
   * @param {IDBEntity} data
   * @return {*}  {Promise<boolean>}
   */
  remove(data: IDBEntity): Promise<boolean>;

  /**
   * 比较数据
   *
   * @author tony001
   * @date 2025-03-06 10:03:08
   * @param {IDBEntity} data
   * @param {IDBEntity[]} datas
   * @return {*}  {Promise<IData>}
   */
  diff(data: IDBEntity, datas: IDBEntity[]): Promise<IData>;

  /**
   * 更新标题
   *
   * @author tony001
   * @date 2025-03-06 17:03:12
   * @param {string} id
   * @param {string} caption
   * @return {*}  {Promise<boolean>}
   */
  updateCaption(id: string, caption: string): Promise<boolean>;

  /**
   * 删除所有数据
   *
   * @author tony001
   * @date 2025-03-12 13:03:15
   * @param {boolean} [isExcludeActivedItem] 是否排除激活项
   * @return {*}  {Promise<boolean>}
   */
  deleteAll(isExcludeActivedItem?: boolean): Promise<boolean>;
}
