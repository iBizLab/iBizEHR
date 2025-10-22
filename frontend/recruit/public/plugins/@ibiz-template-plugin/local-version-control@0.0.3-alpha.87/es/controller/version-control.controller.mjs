import { QXEventEx } from '@ibiz-template/runtime';
import '../entity/index.mjs';
import '../service/index.mjs';
import { LOCAL_VERSION_OVERUP_ISCLEAN } from '../constant/index.mjs';
import { DBStorageService } from '../service/db-storage.service.mjs';
import { DBEntity } from '../entity/db-entity.mjs';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class VersionControlController {
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
  constructor(view, appDataEntity, dbName, storeName, storeConfig, maxRecords, dbVersion) {
    this.view = view;
    this.appDataEntity = appDataEntity;
    /**
     * db存储服务
     *
     * @author tony001
     * @date 2025-03-04 18:03:17
     * @private
     * @type {DBStorageService}
     */
    __publicField(this, "db");
    /**
     * 事件对象
     *
     * @author tony001
     * @date 2025-03-06 16:03:46
     */
    __publicField(this, "evt", new QXEventEx());
    /**
     * 激活项标识
     *
     * @author tony001
     * @date 2025-03-07 17:03:39
     * @type {string}
     */
    __publicField(this, "activeItemId");
    /**
     * 数据是否修改
     *
     * @author tony001
     * @date 2025-03-07 18:03:09
     * @type {boolean}
     */
    __publicField(this, "isDirty", false);
    /**
     * 上限值
     *
     * @author tony001
     * @date 2025-03-07 15:03:12
     * @private
     * @type {number}
     */
    __publicField(this, "overUpNumber", 0);
    /**
     * 超出上限时是否清除
     *
     * @author tony001
     * @date 2025-03-07 15:03:26
     * @private
     * @type {boolean}
     */
    __publicField(this, "overUpIsClean", true);
    this.db = new DBStorageService(
      dbName,
      storeName,
      storeConfig,
      maxRecords,
      dbVersion
    );
    this.overUpNumber = maxRecords;
  }
  /**
   * 获取超出上限关联状态
   *
   * @author tony001
   * @date 2025-03-07 15:03:01
   * @return {*}  {IData}
   */
  getOverUpState() {
    const overUpIsClean = localStorage.getItem(LOCAL_VERSION_OVERUP_ISCLEAN);
    this.overUpIsClean = overUpIsClean ? overUpIsClean === "true" : true;
    return {
      overUpNumber: this.overUpNumber,
      overUpIsClean: this.overUpIsClean
    };
  }
  /**
   * 设置超出上限关联状态
   *
   * @author tony001
   * @date 2025-03-07 15:03:28
   * @param {boolean} overUpIsClean
   */
  setOverUpState(overUpIsClean) {
    this.overUpIsClean = overUpIsClean;
    localStorage.setItem(
      LOCAL_VERSION_OVERUP_ISCLEAN,
      overUpIsClean ? "true" : "false"
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
  getLocalVersionKey(data, timestamp) {
    var _a;
    return "".concat(this.view.context.psdevslnsys, "@").concat((_a = this.appDataEntity.codeName) == null ? void 0 : _a.toLowerCase(), "@").concat(data[this.appDataEntity.keyAppDEFieldId], "@").concat(timestamp);
  }
  /**
   * 获取本地版本数据域
   *
   * @author tony001
   * @date 2025-03-06 10:03:02
   * @protected
   * @return {*}  {string}
   */
  getLocalVersionDomain() {
    var _a, _b;
    return "".concat(this.view.context.psdevslnsys, "@").concat((_a = this.appDataEntity.codeName) == null ? void 0 : _a.toLowerCase(), "@").concat(this.view.context[(_b = this.appDataEntity.codeName) == null ? void 0 : _b.toLowerCase()]);
  }
  /**
   * 检查是否允许添加(最后保存的数据与当前数据一致，不需要再次保存)
   *
   * @author tony001
   * @date 2025-03-05 16:03:35
   * @param {IData} data
   * @return {*}  {Promise<{ ret:  boolean; data: IDBEntity | undefined }>}
   */
  async checkEnableAdd(data) {
    let ret = true;
    const oldDBEntity = await this.db.getLastByTimestamp(
      this.getLocalVersionDomain()
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
  async add(data, isShowOverUp = true) {
    const { ret, data: oldDBEntity } = await this.checkEnableAdd(data);
    if (!ret) {
      this.activeItemId = oldDBEntity.id;
      return oldDBEntity;
    }
    const { overUpIsClean } = this.getOverUpState();
    if (!overUpIsClean && isShowOverUp) {
      const count = await this.db.count(this.getLocalVersionDomain());
      if (count >= this.overUpNumber) {
        const del = await ibiz.confirm.warning({
          title: "\u8D85\u51FA\u4E0A\u9650",
          desc: "\u5F53\u524D\u6570\u636E\u91CF\u8D85\u51FA\u4E0A\u9650".concat(this.overUpNumber, "\u6761\uFF0C\u662F\u5426\u6E05\u9664\u8D85\u51FA\u6570\u636E\u5E76\u7EE7\u7EED\u4FDD\u5B58\uFF1F")
        });
        if (!del) {
          this.activeItemId = oldDBEntity.id;
          return;
        }
      }
    }
    const timeStamp = Date.now();
    let localVersionIndex = 0;
    if (oldDBEntity && oldDBEntity.index !== void 0) {
      localVersionIndex = oldDBEntity.index + 1;
    }
    const dbEntity = new DBEntity(
      localVersionIndex,
      this.getLocalVersionKey(data, timeStamp),
      "".concat(data[this.appDataEntity.majorAppDEFieldId], "_V").concat(localVersionIndex + 1),
      this.view.context.srfusername,
      timeStamp,
      data
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
  async manualAdd(data, caption) {
    const { ret, data: oldDBEntity } = await this.checkEnableAdd(data);
    if (!ret) {
      ibiz.log.warn("\u4F20\u5165\u6570\u636E\u548C\u6700\u8FD1\u7248\u672C\u6570\u636E\u4E00\u81F4\uFF0C\u5FFD\u7565\u5904\u7406");
      return oldDBEntity;
    }
    const { overUpIsClean } = this.getOverUpState();
    if (!overUpIsClean) {
      const count = await this.db.count(this.getLocalVersionDomain());
      if (count >= this.overUpNumber) {
        const del = await ibiz.confirm.warning({
          title: "\u8D85\u51FA\u4E0A\u9650",
          desc: "\u5F53\u524D\u6570\u636E\u91CF\u8D85\u51FA\u4E0A\u9650".concat(this.overUpNumber, "\u6761\uFF0C\u662F\u5426\u6E05\u9664\u8D85\u51FA\u6570\u636E\u5E76\u7EE7\u7EED\u4FDD\u5B58\uFF1F")
        });
        if (!del) {
          return;
        }
      }
    }
    const timeStamp = Date.now();
    let localVersionIndex = 0;
    if (oldDBEntity && oldDBEntity.index !== void 0) {
      localVersionIndex = oldDBEntity.index + 1;
    }
    const dbEntity = new DBEntity(
      localVersionIndex,
      this.getLocalVersionKey(data, timeStamp),
      caption || "".concat(data[this.appDataEntity.majorAppDEFieldId], "_V").concat(localVersionIndex + 1),
      this.view.context.srfusername,
      timeStamp,
      data
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
  async fetchAll(query) {
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
  async apply(data) {
    const app = ibiz.hub.getApp(this.appDataEntity.appId);
    const service = await app.deService.getService(
      this.view.context,
      this.appDataEntity.id
    );
    if (this.isDirty) {
      const del = await ibiz.confirm.warning({
        title: "\u5E94\u7528\u5386\u53F2\u7248\u672C",
        desc: "\u68C0\u6D4B\u5230\u672A\u4FDD\u5B58\u7684\u4FEE\u6539\uFF0C\u5E94\u7528\u5386\u53F2\u7248\u672C\u524D\u5C06\u81EA\u52A8\u4FDD\u5B58\u5F53\u524D\u66F4\u6539\u3002\u6B64\u64CD\u4F5C\u4E0D\u53EF\u64A4\u9500\uFF0C\u662F\u5426\u7EE7\u7EED\uFF1F"
      });
      if (!del) {
        return false;
      }
      const res = await service.exec(
        "GetTempRealTimeData",
        this.view.context,
        this.view.params
      );
      if (res.ok && res.data) {
        const dbEntity = await this.add(res.data, false);
        if (dbEntity) {
          this.evt.emit("update", dbEntity);
        }
      }
    }
    try {
      const res = await service.exec(
        "UpdateTempRealTimeData",
        this.view.context,
        data.data,
        this.view.params
      );
      if (res.ok && res.data) {
        this.activeItemId = data.id;
        this.evt.emit("close");
        this.view.call("Refresh", { ignoreLoad: true });
        this.evt.emit("update", data);
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
  async remove(data) {
    const del = await ibiz.confirm.warning({
      title: "\u6570\u636E\u5220\u9664",
      desc: "\u786E\u8BA4\u5220\u9664\u6570\u636E\uFF1F"
    });
    if (!del) {
      return false;
    }
    try {
      await this.db.delete(data.id);
    } catch (error) {
      ibiz.message.error("\u5220\u9664\u6570\u636E\u5931\u8D25");
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
  async diff(data, datas) {
    const overlay = ibiz.overlay.createModal(
      "IBizLocalVersionDiff",
      {
        current: data,
        items: datas.filter((item) => item.id !== data.id)
      },
      {
        width: "80%",
        height: "80%",
        footerHide: true
      }
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
  async updateCaption(id, caption) {
    try {
      const data = await this.db.get(id);
      data.caption = caption;
      await this.db.update(id, data);
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
  async deleteAll(isExcludeActivedItem = true) {
    const del = await ibiz.confirm.warning({
      title: "\u6570\u636E\u5220\u9664",
      desc: "\u786E\u8BA4\u5220\u9664\u9664\u5F53\u524D\u6FC0\u6D3B\u9879\u5916\u7684\u6240\u6709\u5386\u53F2\u7248\u672C\u6570\u636E\uFF1F"
    });
    if (!del) {
      return false;
    }
    try {
      if (isExcludeActivedItem) {
        await this.db.deleteAll(
          this.getLocalVersionDomain(),
          this.activeItemId
        );
      } else {
        await this.db.deleteAll(this.getLocalVersionDomain());
      }
      this.evt.emit("deleteAll");
      return true;
    } catch (error) {
      ibiz.log.error("\u5220\u9664\u9664\u5F53\u524D\u6FC0\u6D3B\u9879\u5916\u7684\u6240\u6709\u5386\u53F2\u7248\u672C\u6570\u636E\u5F02\u5E38");
      return false;
    }
  }
}

export { VersionControlController };
