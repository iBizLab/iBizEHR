/* eslint-disable no-unused-expressions */
/* eslint-disable @typescript-eslint/no-explicit-any */
/* eslint-disable no-restricted-syntax */
import {
  DEMainViewEngine,
  EditFormService,
  IDataEntity,
  OpenAppViewCommand,
  SysUIActionTag,
  ViewController,
  ViewMode,
  convertNavData,
  findModelChild,
  getControl,
} from '@ibiz-template/runtime';
import { IAppDEField, IDEEditForm } from '@ibiz/model-core';
import { RuntimeModelError } from '@ibiz-template/core';
import { NavPosController } from '@ibiz-template/vue3-util';
import { createUUID } from 'qx-util';
import { X6DesignViewController } from './x6-design-view.controller';
import { X6PanelItemController } from '../../panel-items/x6-panel-item/x6-panel-item.controller'; // 此导入只做类型声明用，不会被打包进来
import { X6CellDataProvider } from '../../interface';

/**
 * x6 设计视图引擎
 *
 * @author chitanda
 * @date 2023-11-11 17:11:39
 * @export
 * @class X6DesignViewEngine
 * @extends {ViewEngineBase}
 */
export class X6DesignViewEngine extends DEMainViewEngine {
  protected declare view: X6DesignViewController;

  /**
   * 主数据表单(主要用于主数据加载相关接口模型)
   *
   * @author chitanda
   * @date 2023-11-16 17:11:08
   * @protected
   * @type {IDEEditForm}
   */
  protected form!: IDEEditForm;

  /**
   * X6 设计主内容区组件控制器
   *
   * @author chitanda
   * @date 2023-11-20 11:11:07
   * @protected
   * @type {X6PanelItemController}
   */
  protected x6!: X6PanelItemController;

  /**
   * 属性区导航占位控制器
   *
   * @author chitanda
   * @date 2023-11-22 12:11:07
   * @protected
   * @type {NavPosController}
   */
  protected navPos!: NavPosController;

  /**
   * 主数据表单服务
   *
   * @author chitanda
   * @date 2023-11-16 17:11:13
   * @protected
   * @type {EditFormService}
   */
  protected service!: EditFormService;

  /**
   * 当前激活属性视图
   *
   * @author zhanghengfeng
   * @date 2025-02-27 21:02:33
   * @protected
   * @type {ViewController}
   */
  protected activePropertyView?: ViewController;

  /**
   * 是否正在等待计时器
   *
   * @author zhanghengfeng
   * @date 2025-02-27 21:02:37
   * @protected
   * @type {boolean}
   */
  protected isWait: boolean = false;

  /**
   * 获取数据
   *
   * @author zhanghengfeng
   * @date 2025-02-27 21:02:15
   * @return {*}  {IData[]}
   */
  getData(): IData[] {
    return [this.view.state.data];
  }

  /**
   * 初始化标记打开数据相关逻辑
   *
   * @author zhanghengfeng
   * @date 2025-02-27 21:02:48
   * @protected
   * @return {*}  {void}
   */
  protected initMarkOpenData(): void {
    if (
      !this.coopPos ||
      ![ViewMode.ROUTE, ViewMode.ROUTE_MODAL].includes(this.view.modal.mode)
    ) {
      return;
    }
    this.markModes = [
      'OPENDATA',
      'EDITDATA',
      'DISPLAYOPPERSON',
      'NOTICERELOAD',
    ];
    this.coopPos.initMessageModes(this.markModes);
    this.doActions = [];
    this.doActions.push('EDIT', 'VIEW', 'UPDATE', 'CLOSE');
    this.view.evt.on('onUpdateAccessState', async () => {
      this.sendViewDataAction();
    });
    this.doMarkDataAction();
  }

  /**
   * 发送编辑行为
   *
   * @author zhanghengfeng
   * @date 2025-02-27 21:02:06
   * @protected
   * @return {*}  {void}
   */
  protected sendEditAction(): void {
    if (this.isWait) {
      return;
    }
    const data = this.getData()[0];
    if (!data) {
      return;
    }
    this.isWait = true;
    this.sendMarkDataAction('EDIT', data.srfkey);
    setTimeout(
      () => {
        this.isWait = false;
      },
      1000 * 60 * 5,
    );
  }

  /**
   * 执行标记数据行为
   *
   * @author zhanghengfeng
   * @date 2025-02-27 21:02:36
   * @protected
   */
  protected doMarkDataAction(): void {
    super.doMarkDataAction();
    if (this.doActions.includes('VIEW')) {
      this.view.evt.on('onMounted', () => this.sendViewDataAction());
    }
    if (this.doActions.includes('EDIT')) {
      const uiDomain = ibiz.uiDomainManager.get(this.view.context.srfsessionid);
      uiDomain?.evt?.on('stateChange', ({ state, isTrusted }) => {
        if (state && isTrusted) {
          this.sendEditAction();
        }
      });
    }
    if (this.doActions.includes('UPDATE')) {
      this.view.evt.on('onSaveSuccess', () => {
        const data = this.getData()[0];
        if (!data) {
          return;
        }
        this.sendMarkDataAction('UPDATE', data.srfkey);
      });
    }
  }

  /**
   * 刷新
   *
   * @author zhanghengfeng
   * @date 2025-02-27 21:02:00
   * @protected
   * @return {*}  {Promise<void>}
   */
  protected async refresh(): Promise<void> {
    await this.refreshView();
  }

  /**
   * 初始化属性视图
   *
   * @author zhanghengfeng
   * @date 2025-02-27 21:02:39
   * @protected
   */
  protected initPropertyView(): void {
    this.view.layoutPanel?.evt?.on('onPresetPanelItemEvent', (event: IData) => {
      if (!event) {
        return;
      }
      const { panelItemEventName, panelItemName, presetParams } = event;
      if (
        panelItemName === 'nav_pos' &&
        panelItemEventName === 'onViewCreated' &&
        presetParams
      ) {
        this.activePropertyView = presetParams.view;
      }
    });
  }

  /**
   * 初始化tab导航
   *
   * @author zhanghengfeng
   * @date 2025-02-11 18:02:32
   * @protected
   * @return {*}  {void}
   */
  protected initNavTab(): void {
    const parentView = this.view.parentView;
    if (!parentView) {
      return;
    }
    const panelItems = parentView.layoutPanel?.panelItems;
    if (!panelItems || !panelItems.nav_pos_index) {
      return;
    }
    const navPosIndex = panelItems.nav_pos_index as any;
    if (navPosIndex.navTabs && navPosIndex.state?.currentKey) {
      const key = navPosIndex.state.currentKey;
      const viewKey = `${this.view.model.codeName}-${this.view.id}`;
      navPosIndex.navTabs.updateViewInfo?.(key, {
        viewKey,
        caption: this.view.model.caption,
        sysImage: this.view.model.sysImage,
      });
    }
  }

  async onCreated(): Promise<void> {
    (this.view as IData).model = {
      ...(this.view as IData).model,
      showDataInfoBar: true,
    };
    await super.onCreated();
    this.initNavTab();
    // 初始化主表单相关
    {
      const form = getControl(this.view.model, 'form') as IDEEditForm;
      if (!form) {
        throw new RuntimeModelError(this.view, '未找到主数据表单模型');
      }
      this.form = form;
      this.service = new EditFormService(this.form);
      await this.service.init(this.view.context);
    }
    this.onSelect = this.onSelect.bind(this);
    // 订阅视图级选中事件
    this.view.select.on(this.onSelect);
    this.view.modal.hooks.shouldDismiss.tapPromise(async context => {
      const uiDomain = ibiz.uiDomainManager.get(this.view.context.srfsessionid);
      if (uiDomain?.dataModification === true && context.allowClose == null) {
        const isAllow = await ibiz.confirm.error({
          title: '关闭提醒',
          desc: '数据已经修改，确定要关闭？',
        });
        if (!isAllow) {
          context.allowClose = false;
        } else {
          context.allowClose = true;
        }
      }
    });
    await this.load();
  }

  protected onSelect(data: X6CellDataProvider | undefined | null): void {
    if (data) {
      this.view.context.designmode === 'STYLE2'
        ? this.onActiveByStyle2(data)
        : this.onActive(data);
    }
  }

  async onMounted(): Promise<void> {
    await super.onMounted();
    // 初始化工具栏状态
    this.toolbar?.calcButtonState(
      this.view.state.data,
      this.form.appDataEntityId,
    );
    this.navPos = this.view.layoutPanel!.panelItems.nav_pos as NavPosController;
    this.x6 = this.view.layoutPanel!.panelItems
      .x6_panel_item as X6PanelItemController;
    this.activeRoot();
    this.initPropertyView();
    this.view.evt.emit('onViewInfoChange', {
      dataInfo: this.view.state.data.srfmajortext || '',
    });
    await this.x6.load();
  }

  /**
   * 激活根节点
   *
   * @author zhanghengfeng
   * @date 2025-01-09 19:01:57
   * @protected
   * @param {boolean} [forceRefresh=false]
   */
  protected activeRoot(forceRefresh: boolean = false): void {
    this.view.select.set({
      id: this.view.state.data.srfkey!,
      label: this.view.state.data.srfmajortext!,
      type: '',
      data: this.view.state.data,
      forceRefresh,
    } as any);
  }

  protected async load(): Promise<IData | null> {
    try {
      this.view.startLoading();
      const uiDomain = ibiz.uiDomainManager.get(this.view.context.srfsessionid);
      if (uiDomain && uiDomain.state.rsInit) {
        uiDomain.state.rsInit = false;
      }
      const res = await this.service.get(this.view.context, this.view.params);
      const app = ibiz.hub.getApp(this.view.model.appId);
      const service = await app.deService.getService(
        this.view.context,
        this.form.appDataEntityId!,
      );
      service.local.add(this.view.context, res.data.getOrigin() as IDataEntity);
      this.view.state.data = res.data.getOrigin() as IDataEntity;
      this.view.evt.emit('onLoadSuccess', undefined);
      return res.data;
    } finally {
      this.view.endLoading();
    }
  }

  protected async save(): Promise<IData | null> {
    try {
      this.view.startLoading();
      const app = ibiz.hub.getApp(this.view.model.appId);
      const service = await app.deService.getService(
        this.view.context,
        this.form.appDataEntityId!,
      );
      const appEntity = await ibiz.hub.getAppDataEntity(
        this.form.appDataEntityId!,
        this.view.model.appId,
      );
      const appEntityKeyName = (
        findModelChild(
          appEntity.appDEFields as IAppDEField[],
          appEntity.keyAppDEFieldId!,
        ) as IModel
      ).codeName.toLowerCase();
      const res1 = await service.getTemp(this.view.context, {
        [appEntityKeyName]: this.view.state.data.srfkey,
      })!;
      if (!res1.ok || !res1.data) {
        this.view.endLoading();
        return null;
      }
      const majorData = res1.data;
      for (const key in majorData) {
        if (Object.prototype.hasOwnProperty.call(majorData, key)) {
          const val = majorData[key];
          if (typeof val === 'object' && val !== null) {
            majorData[key] = undefined;
          }
        }
      }
      const res2 = await service.update(this.view.context, res1.data);
      service.local.add(this.view.context, res2.data as IDataEntity);
      this.view.state.data = res2.data as IDataEntity;
      await this.view.evt.emit('onSaveSuccess', undefined);
      this.activeRoot();
      this.view.evt.emit('onViewInfoChange', {
        dataInfo: this.view.state.data.srfmajortext || '',
      });
      this.toolbar?.calcButtonState(
        this.view.state.data,
        this.form.appDataEntityId,
      );
      return res2.data;
    } finally {
      this.view.endLoading();
    }
  }

  async call(key: string, args?: IData): Promise<IData | null | undefined> {
    if (key === SysUIActionTag.SAVE) {
      return this.save();
    }
    if (key === 'onActive') {
      this.view.select.set(args as X6CellDataProvider);
      return undefined;
    }
    if (key === 'onActiveRoot') {
      this.activeRoot();
      return undefined;
    }
    if (key === 'Refresh') {
      this.refreshView(args);
      return undefined;
    }
    return super.call(key, args);
  }

  /**
   * 刷新视图
   *
   * @author zhanghengfeng
   * @date 2025-01-09 19:01:18
   * @protected
   * @return {*}  {Promise<void>}
   */
  protected async refreshView(args?: IData): Promise<void> {
    const { ignoreLoad = false } = args || {};
    if (!ignoreLoad) {
      await this.load();
    } else {
      const app = ibiz.hub.getApp(this.view.model.appId);
      const service = await app.deService.getService(
        this.view.context,
        this.form.appDataEntityId!,
      );
      if (service) {
        const res = await service.getTemp(this.view.context);
        if (res.ok && res.data) {
          this.view.state.data = res.data as IDataEntity;
        }
      }
    }
    this.activeRoot(true);
    this.view.evt.emit('onRefreshView', undefined);
    this.view.evt.emit('onViewInfoChange', {
      dataInfo: this.view.state.data?.srfmajortext || '',
    });
  }

  /**
   * 设置激活数据
   *
   * @description 主要控制右侧属性视图的显示
   * @author chitanda
   * @date 2023-11-22 12:11:36
   * @protected
   * @param {X6CellDataProvider} data
   */
  protected onActive(data: X6CellDataProvider): void {
    const { forceRefresh } = data;
    const refs = this.view.model.appViewRefs;
    if (refs) {
      const type = data.type ? data.type.toUpperCase() : null;
      const ref = refs.find(
        item =>
          item.name ===
          `EDITDATA:${data.data.srfdecodename.toUpperCase()}${
            type ? `:${type}` : ''
          }`,
      );
      if (ref) {
        const context = this.view.context.clone();
        context[data.data.srfdecodename.toLowerCase()] = data.id;
        this.navPos.openView({
          key: forceRefresh ? createUUID() : data.id,
          viewId: ref.refAppViewId,
          context,
        });
      } else {
        throw new RuntimeModelError(
          this.view.model,
          data.type
            ? `未匹配到对应[${data.type}]的属性编辑视图`
            : '当前数据未指定类型，无法匹配到属性编辑视图',
        );
      }
    }
  }

  /**
   * 设置激活数据（样式2）
   *
   * @protected
   * @param {X6CellDataProvider} data
   * @return {*}  {void}
   * @memberof X6DesignViewEngine
   */
  protected onActiveByStyle2(data: X6CellDataProvider): void {
    const { forceRefresh } = data;
    const refs = this.view.model.appViewRefs;
    if (refs) {
      const type = data.type ? data.type.toUpperCase() : null;
      const ref = refs.find(
        item =>
          item.name ===
          `EDITDATA:${data.data.srfdecodename.toUpperCase()}${
            type ? `:${type}` : ''
          }`,
      );
      if (ref) {
        const context = this.view.context.clone();
        const params = {};
        context[data.data.srfdecodename.toLowerCase()] = data.id;
        // 处理导航上下文
        if (ref.navigateContexts) {
          const tempContext = convertNavData(
            ref.navigateContexts,
            data.data,
            params,
            context,
          );
          Object.assign(context, tempContext);
        }
        // 处理导航参数
        if (ref.navigateParams) {
          const tempParams = convertNavData(
            ref.navigateParams,
            data.data,
            params,
            context,
          );
          Object.assign(params, tempParams);
        }
        if (
          ref.openMode &&
          ![
            'INDEXVIEWTAB',
            'INDEXVIEWTAB_POPUP',
            'INDEXVIEWTAB_POPUPMODAL',
          ].includes(ref.openMode)
        ) {
          ibiz.commands.execute(
            OpenAppViewCommand.TAG,
            ref.refAppViewId,
            context,
            params,
            {
              ctx: this.view.getCtx(),
              openMode: ref.openMode,
            },
          );
          return;
        }
        this.navPos.openView({
          key: forceRefresh ? createUUID() : data.id,
          viewId: ref.refAppViewId,
          context,
        });
      } else {
        throw new RuntimeModelError(
          this.view.model,
          data.type
            ? `未匹配到对应[${data.type}]的属性编辑视图`
            : '当前数据未指定类型，无法匹配到属性编辑视图',
        );
      }
    }
  }
}
