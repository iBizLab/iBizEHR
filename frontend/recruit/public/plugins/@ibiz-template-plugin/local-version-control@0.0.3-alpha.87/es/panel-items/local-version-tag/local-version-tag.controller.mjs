import { PanelItemController } from '@ibiz-template/runtime';
import { notNilEmpty } from 'qx-util';
import { DEFAULT_STORENAME, DEFAULT_MAXRECORDS, DEFAULT_DBVERSION, DEFAULT_INTERVALTIME } from '../../constant/index.mjs';
import { LocalVersionTagState } from './local-version-tag.state.mjs';
import '../../controller/index.mjs';
import { VersionControlController } from '../../controller/version-control.controller.mjs';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class LocalVersionTagController extends PanelItemController {
  constructor() {
    super(...arguments);
    /**
     * 自定义补充参数
     *
     * @author tony001
     * @date 2025-03-04 18:03:13
     * @type {IData}
     */
    __publicField(this, "rawItemParams", {});
    /**
     * 版本控制器
     *
     * @author tony001
     * @date 2025-03-04 19:03:03
     * @public
     * @type {(IVersionControlController | undefined)}
     */
    __publicField(this, "versionControl");
    /**
     * 主数据实体
     *
     * @author tony001
     * @date 2025-03-05 16:03:29
     * @protected
     * @type {IAppDataEntity}
     */
    __publicField(this, "appDataEntity");
    /**
     * 主数据服务
     *
     * @author tony001
     * @date 2025-03-05 16:03:42
     * @protected
     * @type {IAppDEService}
     */
    __publicField(this, "service");
    /**
     * 定时器标识
     *
     * @author tony001
     * @date 2025-03-05 16:03:56
     * @protected
     * @type {(NodeJS.Timeout | undefined)}
     */
    __publicField(this, "intervaler");
    /**
     * 视图编辑事件名称
     *
     * @author tony001
     * @date 2025-03-07 18:03:37
     * @protected
     * @type {string[]}
     */
    __publicField(this, "viewEditEventNames", [
      "onCreateSuccess",
      "onRemoveSuccess",
      "onUpdateSuccess",
      "onEditAction",
      "onRefreshPanel"
    ]);
    /**
     * 更新版本数据
     *
     * @author tony001
     * @date 2025-03-06 16:03:31
     * @protected
     * @param {IDBEntity} data
     */
    __publicField(this, "updateVersion", (data) => {
      this.state.timestamp = data.timestamp;
      this.updateDirty(false);
    });
    /**
     * 更新脏值装填
     *
     * @author tony001
     * @date 2025-03-07 19:03:36
     * @param {boolean} dirty
     */
    __publicField(this, "updateDirty", (dirty) => {
      this.state.isDirty = dirty;
      this.versionControl.isDirty = dirty;
    });
  }
  /**
   * 创建状态
   *
   * @author tony001
   * @date 2025-03-04 14:03:13
   * @protected
   * @return {*}  {LocalVersionTagState}
   */
  createState() {
    var _a;
    return new LocalVersionTagState((_a = this.parent) == null ? void 0 : _a.state);
  }
  /**
   * 视图控制器
   *
   * @author tony001
   * @date 2025-03-04 14:03:53
   * @readonly
   * @type {(ViewController)}
   */
  get view() {
    return this.panel.view;
  }
  /**
   * 初始化
   *
   * @author tony001
   * @date 2025-03-04 14:03:59
   * @protected
   * @return {*}  {Promise<void>}
   */
  async onInit() {
    await super.onInit();
    await this.initBaseParams();
    await this.initVersionControl();
    await this.intervalSave();
    await this.subscribeUserAction();
  }
  /**
   * 处理基础参数
   *
   * @author tony001
   * @date 2025-03-04 18:03:14
   * @protected
   */
  async initBaseParams() {
    var _a;
    const params = {};
    const rawItemParams = (_a = this.model.rawItem) == null ? void 0 : _a.rawItemParams;
    if (notNilEmpty(rawItemParams) && rawItemParams) {
      rawItemParams.forEach((item) => {
        params[item.key.toLowerCase()] = item.value;
      });
    }
    Object.assign(this.rawItemParams, params);
    this.appDataEntity = await ibiz.hub.getAppDataEntity(
      this.view.model.appDataEntityId,
      this.model.appId
    );
    const app = ibiz.hub.getApp(this.view.model.appId);
    this.service = await app.deService.getService(
      this.view.context,
      this.view.model.appDataEntityId
    );
  }
  /**
   * 初始化版本控制器
   *
   * @author tony001
   * @date 2025-03-05 14:03:30
   * @protected
   * @return {*}  {Promise<void>}
   */
  async initVersionControl() {
    var _a;
    this.versionControl = new VersionControlController(
      this.view,
      this.appDataEntity,
      this.rawItemParams.dbname || "ibiz-".concat((_a = this.appDataEntity.codeName) == null ? void 0 : _a.toLowerCase()),
      this.rawItemParams.storename || DEFAULT_STORENAME,
      this.rawItemParams.storeConfig || {
        keyPath: "id",
        autoIncrement: false
      },
      this.rawItemParams.maxrecords ? Number(this.rawItemParams.maxrecords) : DEFAULT_MAXRECORDS,
      this.rawItemParams.dbversion ? Number(this.rawItemParams.dbversion) : DEFAULT_DBVERSION
    );
    await this.saveLocalVersion();
  }
  /**
   * 定时报错
   *
   * @author tony001
   * @date 2025-03-05 16:03:52
   * @protected
   */
  async intervalSave() {
    this.intervaler = setInterval(
      async () => {
        await this.saveLocalVersion();
      },
      this.rawItemParams.INTERVALTIME ? Number(this.rawItemParams.INTERVALTIME) : DEFAULT_INTERVALTIME
    );
  }
  /**
   * 监听检查Ctrl+S组合键（Mac系统同时兼容Cmd+S），本地版本需保存
   *
   * @author tony001
   * @date 2025-03-06 13:03:57
   * @protected
   * @param {KeyboardEvent} event
   */
  handleKeyDown(event) {
    if ((event.ctrlKey || event.metaKey) && event.key.toLowerCase() === "s") {
      event.preventDefault();
      this.saveLocalVersion();
    }
  }
  /**
   * 订阅用户操作
   *
   * @author tony001
   * @date 2025-03-06 13:03:59
   * @protected
   * @return {*}  {Promise<void>}
   */
  async subscribeUserAction() {
    var _a, _b;
    this.saveLocalVersion = this.saveLocalVersion.bind(this);
    this.handleKeyDown = this.handleKeyDown.bind(this);
    this.updateVersion = this.updateVersion.bind(this);
    this.view.evt.on("onSaveSuccess", this.saveLocalVersion);
    window.addEventListener("keydown", this.handleKeyDown);
    (_a = this.versionControl) == null ? void 0 : _a.evt.on("update", this.updateVersion);
    const uiDomain = ibiz.uiDomainManager.get(this.view.context.srfsessionid);
    (_b = uiDomain == null ? void 0 : uiDomain.evt) == null ? void 0 : _b.on("stateChange", ({ state, isTrusted }) => {
      if (state && isTrusted) {
        this.updateDirty(true);
      }
    });
  }
  /**
   * 取消订阅用户操作
   *
   * @author tony001
   * @date 2025-03-06 13:03:38
   * @protected
   * @return {*}  {Promise<void>}
   */
  async unSubscribeUserAction() {
    var _a;
    this.view.evt.off("onSaveSuccess", this.saveLocalVersion);
    window.removeEventListener("keydown", this.handleKeyDown);
    (_a = this.versionControl) == null ? void 0 : _a.evt.off("update", this.updateVersion);
  }
  /**
   * 保存本地版本
   *
   * @author tony001
   * @date 2025-03-05 15:03:58
   * @protected
   * @return {*}  {Promise<void>}
   */
  async saveLocalVersion() {
    const res = await this.service.exec(
      "GetTempRealTimeData",
      this.view.context,
      this.view.params
    );
    if (res.ok && res.data) {
      this.state.isSaveing = true;
      const dbEntity = await this.versionControl.add(res.data);
      if (dbEntity) {
        this.state.timestamp = dbEntity.timestamp;
        this.updateDirty(false);
      }
      this.state.isSaveing = false;
    }
  }
  /**
   * 销毁
   *
   * @author tony001
   * @date 2025-03-04 14:03:24
   */
  destroy() {
    super.destroy();
    if (this.intervaler) {
      clearInterval(this.intervaler);
    }
    this.unSubscribeUserAction();
  }
}

export { LocalVersionTagController };
