/* eslint-disable no-unreachable */
/* eslint-disable @typescript-eslint/no-unused-vars */
import { IAppDataEntity } from '@ibiz/model-core';
import { defaultType, QXEventEx, ViewController } from '@ibiz-template/runtime';
import { DBEntity } from '../entity';
import { IDBEntity, IVersionControlController } from '../interface';
import { DBStorageService } from '../service';
import { LOCAL_VERSION_OVERUP_ISCLEAN } from '../constant';

/**
 * 版本控制控制器
 *
 * @author tony001
 * @date 2025-03-04 14:03:29
 * @export
 * @class VersionControlController
 * @implements {IVersionControlController}
 */
export class VersionControlController implements IVersionControlController {
  /**
   * db存储服务
   *
   * @author tony001
   * @date 2025-03-04 18:03:17
   * @private
   * @type {DBStorageService}
   */
  private db: DBStorageService;

  /**
   * 事件对象
   *
   * @author tony001
   * @date 2025-03-06 16:03:46
   */
  readonly evt = new QXEventEx<defaultType>();

  /**
   * 激活项标识
   *
   * @author tony001
   * @date 2025-03-07 17:03:39
   * @type {string}
   */
  activeItemId!: string;

  /**
   * 数据是否修改
   *
   * @author tony001
   * @date 2025-03-07 18:03:09
   * @type {boolean}
   */
  isDirty: boolean = false;

  /**
   * 上限值
   *
   * @author tony001
   * @date 2025-03-07 15:03:12
   * @private
   * @type {number}
   */
  private overUpNumber: number = 0;

  /**
   * 超出上限时是否清除
   *
   * @author tony001
   * @date 2025-03-07 15:03:26
   * @private
   * @type {boolean}
   */
  private overUpIsClean: boolean = true;

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
  constructor(
    private view: ViewController,
    private appDataEntity: IAppDataEntity,
    dbName: string,
    storeName: string,
    storeConfig: IDBObjectStoreParameters,
    maxRecords: number,
    dbVersion: number,
  ) {
    // 初始化数据库服务
    this.db = new DBStorageService(
      dbName,
      storeName,
      storeConfig,
      maxRecords,
      dbVersion,
    );
    // 初始化超出上限关联状态
    this.overUpNumber = maxRecords;
  }

  /**
   * 获取超出上限关联状态
   *
   * @author tony001
   * @date 2025-03-07 15:03:01
   * @return {*}  {IData}
   */
  public getOverUpState(): IData {
    const overUpIsClean = localStorage.getItem(LOCAL_VERSION_OVERUP_ISCLEAN);
    this.overUpIsClean = overUpIsClean ? overUpIsClean === 'true' : true;
    return {
      overUpNumber: this.overUpNumber,
      overUpIsClean: this.overUpIsClean,
    };
  }

  /**
   * 设置超出上限关联状态
   *
   * @author tony001
   * @date 2025-03-07 15:03:28
   * @param {boolean} overUpIsClean
   */
  public setOverUpState(overUpIsClean: boolean): void {
    this.overUpIsClean = overUpIsClean;
    localStorage.setItem(
      LOCAL_VERSION_OVERUP_ISCLEAN,
      overUpIsClean ? 'true' : 'false',
    );
  }

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
  protected getLocalVersionKey(data: IData, timestamp: number): string {
    return `${
      this.view.context.psdevslnsys
    }@${this.appDataEntity.codeName?.toLowerCase()}@${
      data[this.appDataEntity.keyAppDEFieldId!]
    }@${timestamp}`;
  }

  /**
   * 获取本地版本数据域
   *
   * @author tony001
   * @date 2025-03-06 10:03:02
   * @protected
   * @return {*}  {string}
   */
  protected getLocalVersionDomain(): string {
    return `${
      this.view.context.psdevslnsys
    }@${this.appDataEntity.codeName?.toLowerCase()}@${
      this.view.context[this.appDataEntity.codeName?.toLowerCase()!]
    }`;
  }

  /**
   * 检查是否允许添加(最后保存的数据与当前数据一致，不需要再次保存)
   *
   * @author tony001
   * @date 2025-03-05 16:03:35
   * @param {IData} data
   * @return {*}  {Promise<{ ret:  boolean; data: IDBEntity | undefined }>}
   */
  async checkEnableAdd(
    data: IData,
  ): Promise<{ ret: boolean; data: IDBEntity | undefined }> {
    let ret = true;
    const oldDBEntity = await this.db.getLastByTimestamp(
      this.getLocalVersionDomain(),
    );
    if (oldDBEntity) {
      const oldData = oldDBEntity.data;
      if (JSON.stringify(oldData) === JSON.stringify(data)) {
        ret = false;
      }
    }
    return { ret, data: oldDBEntity };
  }

  /**
   * 添加数据
   *
   * @author tony001
   * @date 2025-03-07 20:03:35
   * @param {IData} data
   * @param {boolean} [isShowOverUp=true] 是否显示超出上限提醒
   * @return {*}  {(Promise<IDBEntity | undefined>)}
   */
  async add(
    data: IData,
    isShowOverUp: boolean = true,
  ): Promise<IDBEntity | undefined> {
    const { ret, data: oldDBEntity } = await this.checkEnableAdd(data);
    if (!ret) {
      this.activeItemId = oldDBEntity!.id;
      return oldDBEntity!;
    }
    const { overUpIsClean } = this.getOverUpState();
    // 不自动清除超出后需要提醒用户
    if (!overUpIsClean && isShowOverUp) {
      const count = await this.db.count(this.getLocalVersionDomain());
      if (count >= this.overUpNumber) {
        const del = await ibiz.confirm.warning({
          title: '超出上限',
          desc: `当前数据量超出上限${this.overUpNumber}条，是否清除超出数据并继续保存？`,
        });
        if (!del) {
          this.activeItemId = oldDBEntity!.id;
          return;
        }
      }
    }
    const timeStamp = Date.now();
    // 索引用于计算标题
    let localVersionIndex: number = 0;
    if (oldDBEntity && oldDBEntity.index !== undefined) {
      localVersionIndex = oldDBEntity.index + 1;
    }
    const dbEntity = new DBEntity(
      localVersionIndex,
      this.getLocalVersionKey(data, timeStamp),
      `${data[this.appDataEntity.majorAppDEFieldId!]}_V${
        localVersionIndex + 1
      }`,
      this.view.context.srfusername,
      timeStamp,
      data,
    );
    await this.db.add(dbEntity);
    this.activeItemId = dbEntity.id;
    return dbEntity;
  }

  /**
   * 手动添加数据
   *
   * @author tony001
   * @date 2025-03-12 11:03:43
   * @param {IData} data
   * @param {string} [caption]
   * @return {*}  {(Promise<IDBEntity | undefined>)}
   */
  async manualAdd(
    data: IData,
    caption?: string,
  ): Promise<IDBEntity | undefined> {
    const { ret, data: oldDBEntity } = await this.checkEnableAdd(data);
    if (!ret) {
      ibiz.log.warn('传入数据和最近版本数据一致，忽略处理');
      return oldDBEntity!;
    }
    const { overUpIsClean } = this.getOverUpState();
    // 不自动清除超出后需要提醒用户
    if (!overUpIsClean) {
      const count = await this.db.count(this.getLocalVersionDomain());
      if (count >= this.overUpNumber) {
        const del = await ibiz.confirm.warning({
          title: '超出上限',
          desc: `当前数据量超出上限${this.overUpNumber}条，是否清除超出数据并继续保存？`,
        });
        if (!del) {
          return;
        }
      }
    }
    const timeStamp = Date.now();
    // 索引用于计算标题
    let localVersionIndex: number = 0;
    if (oldDBEntity && oldDBEntity.index !== undefined) {
      localVersionIndex = oldDBEntity.index + 1;
    }
    const dbEntity = new DBEntity(
      localVersionIndex,
      this.getLocalVersionKey(data, timeStamp),
      caption ||
        `${data[this.appDataEntity.majorAppDEFieldId!]}_V${
          localVersionIndex + 1
        }`,
      this.view.context.srfusername,
      timeStamp,
      data,
    );
    await this.db.add(dbEntity);
    return dbEntity;
  }

  /**
   * 获取所有数据
   *
   * @author tony001
   * @date 2025-03-09 17:03:43
   * @param {string} [query]
   * @return {*}  {Promise<IDBEntity[]>}
   */
  async fetchAll(query?: string): Promise<IDBEntity[]> {
    try {
      const result = await this.db.getAll(this.getLocalVersionDomain(), query);
      return result;
    } catch (error) {
      ibiz.log.error(error);
      return [];
    }
  }

  /**
   * 应用数据
   *
   * @author tony001
   * @date 2025-03-06 10:03:34
   * @param {IDBEntity} data
   * @return {*}  {Promise<boolean>}
   */
  async apply(data: IDBEntity): Promise<boolean> {
    const app = ibiz.hub.getApp(this.appDataEntity.appId);
    const service = await app.deService.getService(
      this.view.context,
      this.appDataEntity.id!,
    );
    if (this.isDirty) {
      const del = await ibiz.confirm.warning({
        title: '应用历史版本',
        desc: '检测到未保存的修改，应用历史版本前将自动保存当前更改。此操作不可撤销，是否继续？',
      });
      if (!del) {
        return false;
      }
      // 保存未保存的修改
      const res = await service.exec(
        'GetTempRealTimeData',
        this.view.context,
        this.view.params,
      );
      if (res.ok && res.data) {
        const dbEntity = await this.add(res.data, false);
        if (dbEntity) {
          this.evt.emit('update', dbEntity);
        }
      }
    }
    try {
      const res = await service.exec(
        'UpdateTempRealTimeData',
        this.view.context,
        data.data,
        this.view.params,
      );
      if (res.ok && res.data) {
        // 更新当前激活项数据
        this.activeItemId = data.id;
        // 关闭当前抽屉
        this.evt.emit('close');
        // 调用视图刷新
        this.view.call('Refresh', { ignoreLoad: true });
        // 更新当前版本数据
        this.evt.emit('update', data);
        return true;
      }
      return false;
    } catch (error) {
      return false;
    }
  }

  /**
   * 删除数据
   *
   * @author tony001
   * @date 2025-03-06 10:03:35
   * @param {IDBEntity} data
   * @return {*}  {Promise<boolean>}
   */
  async remove(data: IDBEntity): Promise<boolean> {
    const del = await ibiz.confirm.warning({
      title: '数据删除',
      desc: '确认删除数据？',
    });
    if (!del) {
      return false;
    }
    try {
      await this.db.delete(data.id);
    } catch (error) {
      ibiz.message.error('删除数据失败');
      return false;
    }
    return true;
  }

  /**
   * 比对数据
   *
   * @author tony001
   * @date 2025-03-06 10:03:46
   * @param {IDBEntity} data
   * @param {IDBEntity[]} datas
   * @return {*}  {Promise<IData>}
   */
  async diff(data: IDBEntity, datas: IDBEntity[]): Promise<IData> {
    const overlay = ibiz.overlay.createModal(
      'IBizLocalVersionDiff',
      {
        current: data,
        items: datas.filter(item => item.id !== data.id),
      },
      {
        width: '80%',
        height: '80%',
        footerHide: true,
      },
    );
    overlay.present();
    await overlay.onWillDismiss();
    return data;
  }

  /**
   * 重命名
   *
   * @author tony001
   * @date 2025-03-06 17:03:43
   * @param {string} id
   * @param {string} caption
   * @return {*}  {Promise<boolean>}
   */
  async updateCaption(id: string, caption: string): Promise<boolean> {
    try {
      const data = await this.db.get(id);
      data!.caption = caption;
      await this.db.update(id, data!);
      return true;
    } catch (error) {
      return false;
    }
  }

  /**
   * 清除所有数据
   *
   * @author tony001
   * @date 2025-03-12 13:03:30
   * @param {boolean} [isExcludeActivedItem] 是否排除激活项
   * @return {*}  {Promise<boolean>}
   */
  async deleteAll(isExcludeActivedItem: boolean = true): Promise<boolean> {
    const del = await ibiz.confirm.warning({
      title: '数据删除',
      desc: '确认删除除当前激活项外的所有历史版本数据？',
    });
    if (!del) {
      return false;
    }
    try {
      if (isExcludeActivedItem) {
        await this.db.deleteAll(
          this.getLocalVersionDomain(),
          this.activeItemId,
        );
      } else {
        await this.db.deleteAll(this.getLocalVersionDomain());
      }
      this.evt.emit('deleteAll');
      return true;
    } catch (error) {
      ibiz.log.error('删除除当前激活项外的所有历史版本数据异常');
      return false;
    }
  }
}
