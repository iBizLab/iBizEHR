import { registerPanelItemProvider } from '@ibiz-template/runtime';
import IBizLocalVersionTag from './local-version-tag.mjs';
import { LocalVersionTagProvider } from './local-version-tag.provider.mjs';

"use strict";
var LocalVersionTag = {
  install(_app) {
    _app.component("IBizLocalVersionTag", IBizLocalVersionTag);
    registerPanelItemProvider(
      "RAWITEM_LOCAL_VERSION_TAG",
      () => new LocalVersionTagProvider()
    );
  }
};

export { LocalVersionTag as default };
