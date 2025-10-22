import { reactive } from 'vue';
import './node_modules/.pnpm/@ibiz-template-plugin_runtime-model@0.2.2_@stencil_store@2.0.16/node_modules/@ibiz-template-plugin/runtime-model/loader/index.mjs';
import Components from './components/index.mjs';
import UIAction from './ui-action/index.mjs';
import './controller/index.mjs';
import { defineCustomElements } from './node_modules/.pnpm/@ibiz-template-plugin_runtime-model@0.2.2_@stencil_store@2.0.16/node_modules/@ibiz-template-plugin/runtime-model/dist/esm/loader.mjs';
import { applyPolyfills } from './node_modules/.pnpm/@ibiz-template-plugin_runtime-model@0.2.2_@stencil_store@2.0.16/node_modules/@ibiz-template-plugin/runtime-model/dist/esm/polyfills/index.mjs';
import { modelClipboardController } from './controller/model-clipboard-controller/model-clipboard-controller.mjs';
import { modelClipboardImportViewController } from './controller/model-clipboard-import-view-controller/model-clipboard-import-view-controller.mjs';
import { modelClipboardPasteViewController } from './controller/model-clipboard-paste-view-controller/model-clipboard-paste-view-controller.mjs';
import { dslModelClipboardImportViewController } from './controller/dsl-model-clipbodard-import-view-controller/dsl-model-clipbodard-import-view-controller.mjs';

"use strict";
var index = {
  install(app) {
    applyPolyfills().then(() => {
      defineCustomElements();
    });
    app.use(Components);
    app.use(UIAction);
    if (!ibiz.modelClipboard) {
      modelClipboardController.state = reactive(modelClipboardController.state);
      ibiz.modelClipboard = modelClipboardController;
    }
    if (!ibiz.modelClipboardImportView) {
      modelClipboardImportViewController.state = reactive(
        modelClipboardImportViewController.state
      );
      ibiz.modelClipboardImportView = modelClipboardImportViewController;
    }
    if (!ibiz.modelClipboardPasteView) {
      modelClipboardPasteViewController.state = reactive(
        modelClipboardPasteViewController.state
      );
      ibiz.modelClipboardPasteView = modelClipboardPasteViewController;
    }
    if (!ibiz.dslModelClipboardImportView) {
      dslModelClipboardImportViewController.state = reactive(
        dslModelClipboardImportViewController.state
      );
      ibiz.dslModelClipboardImportView = dslModelClipboardImportViewController;
    }
  }
};

export { index as default };
