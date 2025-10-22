import IBizModelClipboard from './model-clipboard/model-clipboard.mjs';
import IBizModelClipboardItem from './model-clipboard-item/model-clipboard-item.mjs';
import IBizModelClipboardImportView from './model-clipboard-import-view/model-clipboard-import-view.mjs';
import IBizModelClipboardPasteView from './model-clipboard-paste-view/model-clipboard-paste-view.mjs';
import IBizDesignCodeEditor from './design-code-editor/design-code-editor.mjs';
import IBizModelEditView from './model-edit-view/model-edit-view.mjs';
import IBizModelTree from './model-tree/model-tree.mjs';
import IBizModelRuntime from './model-runtime/model-runtime.mjs';
import IBizModelClone from './model-clone/model-clone.mjs';
import IBizDSLModelClipboardImportView from './dsl-model-clipboard-import-view/dsl-model-clipboard-import-view.mjs';
import IBizDSLModelEditView from './dsl-model-edit-view/dsl-model-edit-view.mjs';
import IBizDSLModelClipboard from './dsl-model-clipboard/dsl-model-clipboard.mjs';

"use strict";
var Components = {
  install(app) {
    app.component("IBizModelClipboard", IBizModelClipboard);
    app.component("IBizModelClipboardItem", IBizModelClipboardItem);
    app.component("IBizModelClipboardImportView", IBizModelClipboardImportView);
    app.component("IBizModelClipboardPasteView", IBizModelClipboardPasteView);
    app.component("IBizDesignCodeEditor", IBizDesignCodeEditor);
    app.component("IBizModelEditView", IBizModelEditView);
    app.component("IBizModelTree", IBizModelTree);
    app.component("IBizModelRuntime", IBizModelRuntime);
    app.component("IBizModelClone", IBizModelClone);
    app.component("IBizDSLModelClipboard", IBizDSLModelClipboard);
    app.component(
      "IBizDSLModelClipboardImportView",
      IBizDSLModelClipboardImportView
    );
    app.component("IBizDSLModelEditView", IBizDSLModelEditView);
  }
};

export { Components as default };
