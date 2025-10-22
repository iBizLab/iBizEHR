'use strict';

Object.defineProperty(exports, '__esModule', { value: true });

var vue = require('vue');
require('./node_modules/.pnpm/@ibiz-template-plugin_runtime-model@0.2.2_@stencil_store@2.0.16/node_modules/@ibiz-template-plugin/runtime-model/loader/index.cjs');
var index$2 = require('./components/index.cjs');
var index$3 = require('./ui-action/index.cjs');
require('./controller/index.cjs');
var loader = require('./node_modules/.pnpm/@ibiz-template-plugin_runtime-model@0.2.2_@stencil_store@2.0.16/node_modules/@ibiz-template-plugin/runtime-model/dist/esm/loader.cjs');
var index$1 = require('./node_modules/.pnpm/@ibiz-template-plugin_runtime-model@0.2.2_@stencil_store@2.0.16/node_modules/@ibiz-template-plugin/runtime-model/dist/esm/polyfills/index.cjs');
var modelClipboardController = require('./controller/model-clipboard-controller/model-clipboard-controller.cjs');
var modelClipboardImportViewController = require('./controller/model-clipboard-import-view-controller/model-clipboard-import-view-controller.cjs');
var modelClipboardPasteViewController = require('./controller/model-clipboard-paste-view-controller/model-clipboard-paste-view-controller.cjs');
var dslModelClipbodardImportViewController = require('./controller/dsl-model-clipbodard-import-view-controller/dsl-model-clipbodard-import-view-controller.cjs');

"use strict";
var index = {
  install(app) {
    index$1.applyPolyfills().then(() => {
      loader.defineCustomElements();
    });
    app.use(index$2.default);
    app.use(index$3.default);
    if (!ibiz.modelClipboard) {
      modelClipboardController.modelClipboardController.state = vue.reactive(modelClipboardController.modelClipboardController.state);
      ibiz.modelClipboard = modelClipboardController.modelClipboardController;
    }
    if (!ibiz.modelClipboardImportView) {
      modelClipboardImportViewController.modelClipboardImportViewController.state = vue.reactive(
        modelClipboardImportViewController.modelClipboardImportViewController.state
      );
      ibiz.modelClipboardImportView = modelClipboardImportViewController.modelClipboardImportViewController;
    }
    if (!ibiz.modelClipboardPasteView) {
      modelClipboardPasteViewController.modelClipboardPasteViewController.state = vue.reactive(
        modelClipboardPasteViewController.modelClipboardPasteViewController.state
      );
      ibiz.modelClipboardPasteView = modelClipboardPasteViewController.modelClipboardPasteViewController;
    }
    if (!ibiz.dslModelClipboardImportView) {
      dslModelClipbodardImportViewController.dslModelClipboardImportViewController.state = vue.reactive(
        dslModelClipbodardImportViewController.dslModelClipboardImportViewController.state
      );
      ibiz.dslModelClipboardImportView = dslModelClipbodardImportViewController.dslModelClipboardImportViewController;
    }
  }
};

exports.default = index;
