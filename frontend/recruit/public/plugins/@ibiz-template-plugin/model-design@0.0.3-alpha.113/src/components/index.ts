import { App } from 'vue';
import IBizModelClipboard from './model-clipboard/model-clipboard';
import IBizModelClipboardItem from './model-clipboard-item/model-clipboard-item';
import IBizModelClipboardImportView from './model-clipboard-import-view/model-clipboard-import-view';
import IBizModelClipboardPasteView from './model-clipboard-paste-view/model-clipboard-paste-view';
import IBizDesignCodeEditor from './design-code-editor/design-code-editor';
import IBizModelEditView from './model-edit-view/model-edit-view';
import IBizModelTree from './model-tree/model-tree';
import IBizModelRuntime from './model-runtime/model-runtime';
import IBizModelClone from './model-clone/model-clone';
import IBizDSLModelClipboardImportView from './dsl-model-clipboard-import-view/dsl-model-clipboard-import-view';
import IBizDSLModelEditView from './dsl-model-edit-view/dsl-model-edit-view';
import IBizDSLModelClipboard from './dsl-model-clipboard/dsl-model-clipboard';

export default {
  install(app: App) {
    app.component('IBizModelClipboard', IBizModelClipboard);
    app.component('IBizModelClipboardItem', IBizModelClipboardItem);
    app.component('IBizModelClipboardImportView', IBizModelClipboardImportView);
    app.component('IBizModelClipboardPasteView', IBizModelClipboardPasteView);
    app.component('IBizDesignCodeEditor', IBizDesignCodeEditor);
    app.component('IBizModelEditView', IBizModelEditView);
    app.component('IBizModelTree', IBizModelTree);
    app.component('IBizModelRuntime', IBizModelRuntime);
    app.component('IBizModelClone', IBizModelClone);
    app.component('IBizDSLModelClipboard', IBizDSLModelClipboard);
    app.component(
      'IBizDSLModelClipboardImportView',
      IBizDSLModelClipboardImportView,
    );
    app.component('IBizDSLModelEditView', IBizDSLModelEditView);
  },
};
