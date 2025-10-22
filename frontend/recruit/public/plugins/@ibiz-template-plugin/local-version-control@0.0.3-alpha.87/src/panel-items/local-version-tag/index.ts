import { App } from 'vue';
import { registerPanelItemProvider } from '@ibiz-template/runtime';
import IBizLocalVersionTag from './local-version-tag';
import { LocalVersionTagProvider } from './local-version-tag.provider';

export default {
  install(_app: App) {
    _app.component('IBizLocalVersionTag', IBizLocalVersionTag);
    registerPanelItemProvider(
      'RAWITEM_LOCAL_VERSION_TAG',
      () => new LocalVersionTagProvider(),
    );
  },
};
