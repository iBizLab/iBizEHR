import { AuthGuard } from '@ibiz-template/vue3-components';
import { AppHooks } from '@ibiz-template/vue3-util';
import { ModelLoader } from '@/model/model-loader';
import { initViewConfig } from '@/publish/model/view-config';

export class StaticAuthGuard extends AuthGuard {
  hasModelInit: boolean = false;

  noPermissionModel: boolean = false;

  /**
   * @description 初始化模型
   * @param {IParams} context
   * @param {boolean} [permission=true]
   * @returns {*}  {Promise<void>}
   * @memberof StaticAuthGuard
   */
  async initModel(context: IParams, permission: boolean = true): Promise<void> {
    // 没初始化或者初始化了但是切换模型
    if (
      !this.hasModelInit ||
      (this.hasModelInit && this.noPermissionModel !== permission)
    ) {
      // 清空重置基座
      ibiz.hub.reset();
      ibiz.hub.registerModelLoaderProvider(new ModelLoader());
      await initViewConfig();
      const app = await ibiz.hub.getAppAsync(ibiz.env.appId);
      await AppHooks.initedApp.call({ context, app });
      const appModel = app.model;
      await this.initEnvironment(appModel);
      ibiz.env.isMob = appModel.mobileApp === true;
      await this.initTheme(appModel);
    }
    this.noPermissionModel = permission;
    this.hasModelInit = true;
  }
}
