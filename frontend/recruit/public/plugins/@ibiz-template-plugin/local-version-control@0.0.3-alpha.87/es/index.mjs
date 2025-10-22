import Components from './components/index.mjs';
import DEActions from './de-actions/index.mjs';
import PanelItems from './panel-items/index.mjs';

"use strict";
var index = {
  install(_app) {
    _app.use(Components);
    _app.use(DEActions);
    _app.use(PanelItems);
  }
};

export { index as default };
