import LocalVersionTag from './local-version-tag/index.mjs';

"use strict";
var PanelItems = {
  install(_app) {
    _app.use(LocalVersionTag);
  }
};

export { PanelItems as default };
