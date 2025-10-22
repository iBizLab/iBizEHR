import { ViewController, getPFPlugin } from '@ibiz-template/runtime';
import { IAppDECustomView } from '@ibiz/model-core';
import { X6DesignViewEngine } from './x6-design-view.engine';
import { X6DesignViewState } from './interface/x6-design-view.state';
import { X6DesignViewEvent } from './interface/x6-design-view.event';
import { SelectState } from '../../utils';
import { X6CellDataProvider } from '../../interface';

export class X6DesignViewController extends ViewController<
  IAppDECustomView,
  X6DesignViewState,
  X6DesignViewEvent
> {
  /**
   * 视图中的选中数据
   *
   * @author chitanda
   * @date 2023-12-21 18:12:25
   */
  readonly select = new SelectState<X6CellDataProvider>();

  /**
   * 生命周期-创建完成
   *
   * @protected
   * @return {*}  {Promise<void>}
   * @memberof X6DesignViewController
   */
  protected async onCreated(): Promise<void> {
    await super.onCreated();
    const { sysPFPluginId, appId } = this.model;
    const plugin = getPFPlugin(sysPFPluginId!, appId);
    if (plugin && plugin.pluginParams) {
      const params = plugin.pluginParams;
      Object.keys(params).forEach(key => {
        if (params[key] && key !== 'appId') {
          this.context[key.toLowerCase()] = params[key];
        }
      });
    }
  }

  protected initEngines(): void {
    this.engines.push(new X6DesignViewEngine(this));
  }
}
