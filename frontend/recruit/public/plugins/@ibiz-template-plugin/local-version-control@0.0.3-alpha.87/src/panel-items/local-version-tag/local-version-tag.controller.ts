import {
  IAppDEService,
  PanelItemController,
  ViewController,
} from '@ibiz-template/runtime';
import { IAppDataEntity, IPanelRawItem } from '@ibiz/model-core';
import { notNilEmpty } from 'qx-util';
import { IDBEntity, IVersionControlController } from '../../interface';
import {
  DEFAULT_DBVERSION,
  DEFAULT_INTERVALTIME,
  DEFAULT_MAXRECORDS,
  DEFAULT_STORENAME,
} from '../../constant';
import { LocalVersionTagState } from './local-version-tag.state';
import { VersionControlController } from '../../controller';

export class LocalVersionTagController extends PanelItemController<IPanelRawItem> {
  declare state: LocalVersionTagState;

  /**
   * 自定义补充参数
   *
   * @author tony001
   * @date 2025-03-04 18:03:13
   * @type {IData}
   */
  rawItemParams: IData = {};

  /**
   * 版本控制器
   *
   * @author tony001
   * @date 2025-03-04 19:03:03
   * @public
   * @type {(IVersionControlController | undefined)}
   */
  public versionControl: IVersionControlController | undefined;

  /**
   * 主数据实体
   *
   * @author tony001
   * @date 2025-03-05 16:03:29
   * @protected
   * @type {IAppDataEntity}
   */
  protected appDataEntity!: IAppDataEntity;

  /**
   * 主数据服务
   *
   * @author tony001
   * @date 2025-03-05 16:03:42
   * @protected
   * @type {IAppDEService}
   */
  protected service!: IAppDEService;

  /**
   * 定时器标识
   *
   * @author tony001
   * @date 2025-03-05 16:03:56
   * @protected
   * @type {(NodeJS.Timeout | undefined)}
   */
  protected intervaler: NodeJS.Timeout | undefined;

  /**
   * 视图编辑事件名称
   *
   * @author tony001
   * @date 2025-03-07 18:03:37
   * @protected
   * @type {string[]}
   */
  protected viewEditEventNames: string[] = [
    'onCreateSuccess',
    'onRemoveSuccess',
    'onUpdateSuccess',
    'onEditAction',
    'onRefreshPanel',
  ];

  /**
   * 创建状态
   *
   * @author tony001
   * @date 2025-03-04 14:03:13
   * @protected
   * @return {*}  {LocalVersionTagState}
   */
  protected createState(): LocalVersionTagState {
    return new LocalVersionTagState(this.parent?.state);
  }

  /**
   * 视图控制器
   *
   * @author tony001
   * @date 2025-03-04 14:03:53
   * @readonly
   * @type {(ViewController)}
   */
  get view(): ViewController {
    return this.panel.view as ViewController;
  }

  /**
   * 初始化
   *
   * @author tony001
   * @date 2025-03-04 14:03:59
   * @protected
   * @return {*}  {Promise<void>}
   */
  protected async onInit(): Promise<void> {
    await super.onInit();
    // 初始化基础参数
    await this.initBaseParams();
    // 初始化版本控制器
    await this.initVersionControl();
    // 定时保存
    await this.intervalSave();
    // 订阅用户操作
    await this.subscribeUserAction();
  }

  /**
   * 处理基础参数
   *
   * @author tony001
   * @date 2025-03-04 18:03:14
   * @protected
   */
  protected async initBaseParams(): Promise<void> {
    // 处理额外扩展参数
    const params = {};
    const rawItemParams = this.model.rawItem?.rawItemParams;
    if (notNilEmpty(rawItemParams) && rawItemParams) {
      rawItemParams.forEach(item => {
        params[item.key!.toLowerCase()] = item.value;
      });
    }
    Object.assign(this.rawItemParams, params);
    // 初始化数据服务相关内容
    this.appDataEntity = await ibiz.hub.getAppDataEntity(
      this.view.model.appDataEntityId!,
      this.model.appId,
    );
    const app = ibiz.hub.getApp(this.view.model.appId);
    this.service = await app.deService.getService(
      this.view.context,
      this.view.model.appDataEntityId!,
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
  protected async initVersionControl(): Promise<void> {
    this.versionControl = new VersionControlController(
      this.view,
      this.appDataEntity,
      this.rawItemParams.dbname ||
        `ibiz-${this.appDataEntity.codeName?.toLowerCase()}`,
      this.rawItemParams.storename || DEFAULT_STORENAME,
      this.rawItemParams.storeConfig || {
        keyPath: 'id',
        autoIncrement: false,
      },
      this.rawItemParams.maxrecords
        ? Number(this.rawItemParams.maxrecords)
        : DEFAULT_MAXRECORDS,
      this.rawItemParams.dbversion
        ? Number(this.rawItemParams.dbversion)
        : DEFAULT_DBVERSION,
    );
    // 添加数据
    await this.saveLocalVersion();
  }

  /**
   * 定时报错
   *
   * @author tony001
   * @date 2025-03-05 16:03:52
   * @protected
   */
  protected async intervalSave(): Promise<void> {
    this.intervaler = setInterval(
      async () => {
        await this.saveLocalVersion();
      },
      this.rawItemParams.INTERVALTIME
        ? Number(this.rawItemParams.INTERVALTIME)
        : DEFAULT_INTERVALTIME,
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
  protected handleKeyDown(event: KeyboardEvent): void {
    if ((event.ctrlKey || event.metaKey) && event.key.toLowerCase() === 's') {
      event.preventDefault(); // 阻止浏览器默认保存行为
      this.saveLocalVersion();
    }
  }

  /**
   * 更新版本数据
   *
   * @author tony001
   * @date 2025-03-06 16:03:31
   * @protected
   * @param {IDBEntity} data
   */
  updateVersion = (data: IDBEntity): void => {
    this.state.timestamp = data.timestamp;
    this.updateDirty(false);
  };

  /**
   * 更新脏值装填
   *
   * @author tony001
   * @date 2025-03-07 19:03:36
   * @param {boolean} dirty
   */
  updateDirty = (dirty: boolean): void => {
    this.state.isDirty = dirty;
    this.versionControl!.isDirty = dirty;
  };

  /**
   * 订阅用户操作
   *
   * @author tony001
   * @date 2025-03-06 13:03:59
   * @protected
   * @return {*}  {Promise<void>}
   */
  protected async subscribeUserAction(): Promise<void> {
    this.saveLocalVersion = this.saveLocalVersion.bind(this);
    this.handleKeyDown = this.handleKeyDown.bind(this);
    this.updateVersion = this.updateVersion.bind(this);
    // 主数据保存成功，本地版本需保存
    (this.view.evt as IData).on('onSaveSuccess', this.saveLocalVersion);
    // 监听检查Ctrl+S组合键，本地版本需保存
    window.addEventListener('keydown', this.handleKeyDown);
    // 监听更新呈现版本数据事件
    this.versionControl?.evt.on('update', this.updateVersion);
    // 监听用户编辑事件
    const uiDomain = ibiz.uiDomainManager.get(this.view.context.srfsessionid);
    uiDomain?.evt?.on('stateChange', ({ state, isTrusted }) => {
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
  protected async unSubscribeUserAction(): Promise<void> {
    // 取消订阅主数据保存成功
    (this.view.evt as IData).off('onSaveSuccess', this.saveLocalVersion);
    // 取消监听检查Ctrl+S组合键
    window.removeEventListener('keydown', this.handleKeyDown);
    // 取消监听更新呈现版本数据事件
    this.versionControl?.evt.off('update', this.updateVersion);
  }

  /**
   * 保存本地版本
   *
   * @author tony001
   * @date 2025-03-05 15:03:58
   * @protected
   * @return {*}  {Promise<void>}
   */
  protected async saveLocalVersion(): Promise<void> {
    const res = await this.service.exec(
      'GetTempRealTimeData',
      this.view.context,
      this.view.params,
    );
    if (res.ok && res.data) {
      this.state.isSaveing = true;
      const dbEntity = await this.versionControl!.add(res.data);
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
  destroy(): void {
    super.destroy();
    if (this.intervaler) {
      clearInterval(this.intervaler);
    }
    this.unSubscribeUserAction();
  }
}
