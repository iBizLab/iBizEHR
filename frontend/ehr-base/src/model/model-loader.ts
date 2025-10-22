import {
  IAppBICube,
  IAppBIReport,
  IAppBIScheme,
  IAppDataEntity,
  IAppView,
  IApplication,
  ISubAppRef,
} from '@ibiz/model-core';
import { calcUniqueTag, DSLHelper } from '@ibiz/rt-model-api';
import { MergeSubModelHelper } from '@ibiz-template/model-helper';
import {
  IAppService,
  IMicroAppConfig,
  ModelLoaderProvider,
} from '@ibiz-template/runtime';
import { kebabCase } from 'lodash-es';
import { clone } from 'ramda';
import {
  getAppDataEntityModel,
  getAppViewModel,
  getAppModel,
  registerCodeList,
} from '@/publish/model';
import { mergeUIActions } from './merge-ui-action';

/**
 * 模型加载适配器
 *
 * @author chitanda
 * @date 2023-04-17 23:04:44
 * @export
 * @class ModelLoader
 * @implements {ModelLoaderProvider}
 */
export class ModelLoader implements ModelLoaderProvider {
  /**
   * @description dsl解析包
   * @protected
   * @memberof ModelLoader
   */
  protected dsl = new DSLHelper();

  /**
   * @description 子应用模型合并对象
   * @protected
   * @memberof ModelLoader
   */
  protected merge = new MergeSubModelHelper();

  /**
   * @description 子应用清单
   * @protected
   * @type {ISubAppRef[]}
   * @memberof ModelLoader
   */
  protected subAppRefs: ISubAppRef[] = [];

  async getSubAppRef(appId: string): Promise<ISubAppRef | undefined> {
    return this.subAppRefs.find(subApp => {
      return subApp.appId === appId;
    });
  }

  /**
   * @description 初始化应用
   * @param {string} [appId]
   * @returns {*}  {Promise<boolean>}
   * @memberof ModelLoader
   */
  async initApp(appId?: string): Promise<boolean> {
    const app = await getAppModel();
    const appService = ibiz.hub.getApp(appId);
    let appSourceModel: IModel | undefined;
    // 加载当前应用所需应用模型数据
    if (appId && appId !== ibiz.env.appId) {
      const microAppConfig = ibiz.hub.microAppConfigCenter.getMicroApp(appId!);
      const res = await ibiz.net.axios({
        method: 'get',
        headers: { 'Access-Control-Allow-Origin': '*' },
        url: `${microAppConfig!.entry}/static/app/app.json`,
      });
      if (res.status === 200 && res.data) {
        appSourceModel = res.data;
      }
    } else {
      const res = await ibiz.net.axios({
        method: 'get',
        headers: { 'Access-Control-Allow-Origin': '*' },
        url: `./static/app/app.json`,
      });
      if (res.status === 200 && res.data) {
        appSourceModel = res.data;
      }
    }
    // 将引用的视图注册到 hub 清单中，只有主应用才会注册。子应用的注册由主应用在初始化子应用时搞定
    if (!appId || appId === ibiz.env.appId) {
      if (appSourceModel && appSourceModel.allPSAppViews.length > 0) {
        appSourceModel.allPSAppViews.forEach((appView: IModel) => {
          ibiz.hub.setAppView(appView.id, ibiz.env.appId, appView.priority);
        });
      }
    }
    // 将引用插件注册到 hub 清单中
    if (!appId || appId === ibiz.env.appId) {
      const { appPFPluginRefs } = app;
      if (appPFPluginRefs && appPFPluginRefs.length > 0) {
        appPFPluginRefs.forEach(appPFPluginRef => {
          ibiz.hub.setPlugin(appPFPluginRef);
        });
      }
    }
    // 当前主应用的默认首页作为应用首页
    if ((!appId || appId === ibiz.env.appId) && !ibiz.env.AppTitle) {
      if (app.caption) {
        ibiz.env.AppTitle = app.caption;
      }
    }
    // 注册代码表
    if (appId && appId !== ibiz.env.appId) {
      const microAppConfig = ibiz.hub.microAppConfigCenter.getMicroApp(appId!);
      if (appSourceModel && appSourceModel.allPSAppCodeLists.length > 0) {
        for (let i = 0; i < appSourceModel.allPSAppCodeLists.length; i++) {
          const tempCodeList = appSourceModel.allPSAppCodeLists[i];
          // eslint-disable-next-line no-await-in-loop
          const module = await System.import(
            `${microAppConfig!.entry}/static/js/model/code-list/${kebabCase(
              tempCodeList.id,
            ).toLowerCase()}-legacy.js`,
          );
          if (module && module.default) {
            this.deepFillSubAppId(module.default, appId);
            appService.codeList.setCodeList(module.default);
          }
        }
      }
    } else {
      await registerCodeList(appService.codeList);
    }
    // 注册应用实体名隐射
    if (appSourceModel && appSourceModel.allPSAppDataEntities) {
      const dataEntities = appSourceModel.allPSAppDataEntities as IModel[];
      dataEntities.forEach(dataEntity => {
        appService.deName2DeCodeName.set(dataEntity.name, dataEntity.codeName);
      });
    }
    // 模型扩展标准视图布局面板
    const subViewRefs = app.appSubViewTypeRefs || [];
    subViewRefs.forEach(item => {
      if (item.replaceDefault) {
        ibiz.util.layoutPanel.register(
          `${item.viewType}_DEFAULT`,
          item.viewLayoutPanel!,
        );
      }
    });
    // 子应用模型相关处理
    if (!appId || appId === ibiz.env.appId) {
      const microApps = ibiz.hub.microAppConfigCenter.getMicroApps();
      if (microApps && microApps.length > 0) {
        for (let i = 0; i < microApps.length; i++) {
          const microApp = microApps[i];
          // eslint-disable-next-line no-await-in-loop
          await this.initSubApp(appService, microApp);
        }
      }
    }
    return true;
  }

  /**
   * 递归填充指定应用标识
   *
   * @author tony001
   * @date 2024-09-09 15:09:20
   * @protected
   * @param {IModel} model
   * @param {string} appId
   */
  protected deepFillSubAppId(model: IModel, appId: string): void {
    // eslint-disable-next-line no-param-reassign
    model.appId = appId;
    const keys = Object.keys(model);
    keys.forEach(key => {
      const value = model[key];
      if (value && typeof value === 'object') {
        if (Array.isArray(value)) {
          value.forEach(item => {
            if (item && typeof item === 'object') {
              this.deepFillSubAppId(item, appId);
            }
          });
        } else {
          this.deepFillSubAppId(value, appId);
        }
      }
    });
  }

  /**
   * @description 初始化子应用
   * @param {IAppService} app
   * @param {IMicroAppConfig} microAppConfig
   * @returns {*}  {Promise<void>}
   * @memberof ModelLoader
   */
  async initSubApp(
    app: IAppService,
    microAppConfig: IMicroAppConfig,
  ): Promise<void> {
    const targetSubAppRef = await this.getSubAppRef(microAppConfig.name);
    if (targetSubAppRef) return;
    const res = await ibiz.net.axios({
      method: 'get',
      headers: { 'Access-Control-Allow-Origin': '*' },
      url: `${microAppConfig.entry}/static/app/sub-app.json`,
    });
    if (res.status === 200 && res.data) {
      const sourceSubApp = res.data;
      const subApp = this.dsl.subAppRef(sourceSubApp);
      subApp.appId = microAppConfig.name;
      subApp.serviceId = microAppConfig?.baseUrl;
      if (subApp.appMenuModel) {
        this.deepFillSubAppId(subApp.appMenuModel, microAppConfig.name);
      }
      if (!targetSubAppRef) {
        this.subAppRefs.push(subApp as ISubAppRef);
      }
      // 设置视图到hub中
      const views = sourceSubApp.getAllPSAppViews || [];
      views.forEach((view: IModel) => {
        const id = calcUniqueTag(view)!;
        ibiz.hub.setAppView(id, microAppConfig.name, view.priority);
      });
      // 子应用插件引用注册到hub中
      const appPFPluginRefs = sourceSubApp.getAllPSAppPFPluginRefs || [];
      appPFPluginRefs.forEach((appPFPluginRef: IModel) => {
        const appPluginRef = this.dsl.appPFPluginRef(appPFPluginRef);
        appPluginRef.appId = microAppConfig.name;
        ibiz.hub.setPlugin(appPluginRef, microAppConfig.name);
      });
      // 设置DrCtrl到hub中
      const drCtrls = this.dsl.controls(
        sourceSubApp.getAllPSDEDRControls || [],
      );
      drCtrls.forEach((drCtrl: IModel) => {
        this.deepFillSubAppId(drCtrl, microAppConfig.name);
        ibiz.hub.registerSubAppDrControls(
          microAppConfig.name || ibiz.env.appId,
          drCtrl,
        );
      });
      // 设置界面行为组到hub中
      const appDEUIActionGroups =
        sourceSubApp.getAllPSAppDEUIActionGroups || [];
      appDEUIActionGroups.forEach((appDEUIActionGroup: IModel) => {
        this.deepFillSubAppId(appDEUIActionGroup, microAppConfig.name);
        ibiz.hub.registerSubAppDEUIActionGroups(
          microAppConfig.name || ibiz.env.appId,
          this.dsl.uiActionGroups(appDEUIActionGroup),
        );
      });

      // 设置菜单模型到hub中
      const appMenuModels = sourceSubApp.getAllPSAppMenuModels || [];
      appMenuModels.forEach((appMenuModel: IModel) => {
        this.deepFillSubAppId(appMenuModel, microAppConfig.name);
        ibiz.hub.registerSubAppMenuModels(
          microAppConfig.name || ibiz.env.appId,
          this.dsl.control(appMenuModel),
        );
      });
      // 设置部件模型到hub中
      const appControls = sourceSubApp.getAllPSControls || [];
      appControls.forEach((appControl: IModel) => {
        this.deepFillSubAppId(appControl, microAppConfig.name as string);
        ibiz.hub.registerSubAppControls(
          microAppConfig.name || ibiz.env.appId,
          this.dsl.control(appControl),
        );
      });
    }
  }

  /**
   * @description 计算应用视图需要合并的子应用模型
   * @protected
   * @param {IAppView} view
   * @memberof ModelLoader
   */
  protected calcAppViewSubAppModel(view: IAppView): void {
    const controls = view.controls
      ? view.controls
      : view.viewLayoutPanel?.controls;

    // 合并主菜单
    this.merge.mergeAppMainMenu(view, controls, this.subAppRefs);
    // 合并扩展菜单
    this.merge.mergeSubAppExtendedMenu(view, controls, this.subAppRefs);
    // 合并DrCtrl
    this.merge.mergeSubAppDRCtrl(view, controls, this.subAppRefs);
    // 合并工具栏界面行为组
    this.merge.mergeSubAppToolbarActionGroup(view, controls, this.subAppRefs);
    // 合并上下文菜单（树视图部件）
    this.merge.mergeSubAppTreeContextMenuActionGroup(
      view,
      controls,
      this.subAppRefs,
    );
    // 合并表单界面行为组（按钮组）
    this.merge.mergeSubAppFormActionGroup(view, controls, this.subAppRefs);
    // 合并表格列界面行为组
    this.merge.mergeSubAppGridCloumnActionGroup(
      view,
      controls,
      this.subAppRefs,
    );
    // 合并树视图部件
    this.merge.mergeSubAppTreeView(view, controls, this.subAppRefs);
  }

  /**
   * @description 加载视图
   * @param {string} _appId
   * @param {string} _viewId
   * @param {IParams} _params
   * @returns {*}  {Promise<IAppView>}
   * @memberof ModelLoader
   */
  loadAppView(
    _appId: string,
    _viewId: string,
    _params: IParams,
  ): Promise<IAppView> {
    throw new Error('Method not implemented.');
  }

  /**
   * @description 获取应用样式
   * @param {string} appId
   * @returns {*}  {(Promise<string | null>)}
   * @memberof ModelLoader
   */
  async getAppStyle(appId: string): Promise<string | null> {
    let style: string = '';
    if (appId && appId !== ibiz.env.appId) {
      const microAppConfig = ibiz.hub.microAppConfigCenter.getMicroApp(appId);
      const res = await ibiz.net.axios({
        method: 'get',
        headers: { 'Access-Control-Allow-Origin': '*' },
        url: `${microAppConfig!.entry}/static/css/index.css`,
      });
      if (res.status === 200 && res.data) {
        style = res.data;
      }
    }
    return style;
  }

  /**
   * @description 获取应用模型
   * @param {string} appId
   * @returns {*}  {Promise<IApplication>}
   * @memberof ModelLoader
   */
  async getApp(appId: string): Promise<IApplication> {
    if (!appId || appId === ibiz.env.appId) {
      const app = await getAppModel();
      return mergeUIActions(app);
    }
    const microAppConfig = ibiz.hub.microAppConfigCenter.getMicroApp(appId);
    const module = await System.import(
      `${microAppConfig!.entry}/static/js/model/app/app-legacy.js`,
    );
    this.deepFillSubAppId(module.default, appId);
    return module.default;
  }

  /**
   * @description 获取视图模型
   * @param {string} appId
   * @param {string} codeName
   * @returns {*}  {Promise<IAppView>}
   * @memberof ModelLoader
   */
  async getAppView(appId: string, codeName: string): Promise<IAppView> {
    if (appId === ibiz.env.appId) {
      const viewModel = await getAppViewModel(codeName);
      const dsl = clone(viewModel);
      this.deepFillSubAppId(dsl, appId);
      this.calcAppViewSubAppModel(dsl);
      return dsl;
    }
    const microAppConfig = ibiz.hub.microAppConfigCenter.getMicroApp(appId);
    const module = await System.import(
      `${microAppConfig!.entry}/static/js/model/views/${kebabCase(
        codeName,
      ).toLowerCase()}-legacy.js`,
    );
    this.deepFillSubAppId(module.default, appId);
    return module.default;
  }

  /**
   * @description 获取应用实体模型
   * @param {string} appId
   * @param {string} id
   * @returns {*}  {Promise<IAppDataEntity>}
   * @memberof ModelLoader
   */
  async getAppDataEntity(appId: string, id: string): Promise<IAppDataEntity> {
    if (!appId || appId === ibiz.env.appId) {
      return getAppDataEntityModel(id);
    }
    const microAppConfig = ibiz.hub.microAppConfigCenter.getMicroApp(appId);
    const module = await System.import(
      `${microAppConfig!.entry}/static/js/model/entities/${
        id.indexOf('.') !== -1 ? kebabCase(id.split('.')[1]).toLowerCase() : id
      }-legacy.js`,
    );
    this.deepFillSubAppId(module.default, appId);
    return module.default;
  }

  /**
   * @description 通过名字获取应用实体
   * @param {string} appId
   * @param {string} codeName
   * @returns {*}  {Promise<IAppDataEntity>}
   * @memberof ModelLoader
   */
  async getAppDataEntityByCodeName(
    appId: string,
    codeName: string,
  ): Promise<IAppDataEntity> {
    return this.getAppDataEntity(appId, codeName);
  }

  getAppBISchemes(appId: string, ids: string[]): Promise<IAppBIScheme[]> {
    throw new Error('Method not implemented.');
  }

  getAppAppBICubes(appId: string, ids: string[]): Promise<IAppBICube[]> {
    throw new Error('Method not implemented.');
  }

  getAppBIReports(appId: string, ids: string[]): Promise<IAppBIReport[]> {
    throw new Error('Method not implemented.');
  }

  async translationModelToDsl(
    data: IData,
    type: 'APP' | 'VIEW' | 'CTRL' | 'APPENTITY' | 'APPBIREPORT',
  ): Promise<IModel | undefined> {
    switch (type) {
      case 'APP':
        return this.dsl.application(data);
      case 'VIEW':
        return this.dsl.appView(data);
      case 'CTRL':
        return this.dsl.control(data);
      case 'APPENTITY':
        return this.dsl.appDataEntity(data);
      case 'APPBIREPORT':
        return this.dsl.appBIReport(data);
      default:
        break;
    }
  }
}
