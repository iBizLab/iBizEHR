import {
  IPanelItemController,
  IPanelItemProvider,
  IPanelController,
} from '@ibiz-template/runtime';
import { IPanelItem } from '@ibiz/model-core';
import { LocalVersionTagController } from './local-version-tag.controller';

export class LocalVersionTagProvider implements IPanelItemProvider {
  component = 'IBizLocalVersionTag';

  async createController(
    panelItem: IPanelItem,
    panel: IPanelController,
    parent?: IPanelItemController,
  ): Promise<IPanelItemController> {
    const c = new LocalVersionTagController(panelItem, panel, parent);
    await c.init();
    return c;
  }
}
