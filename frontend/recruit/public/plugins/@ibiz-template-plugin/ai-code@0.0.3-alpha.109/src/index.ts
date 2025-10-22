import { App } from 'vue';
import { registerEditorProvider } from '@ibiz-template/runtime';
import { IBizAICode } from './monaco-editor/monaco-editor';
import { CodeEditorProvider } from './code-editor.provider';

export default {
  install(app: App) {
    app.component('IBizAICode', IBizAICode);
    registerEditorProvider(
      'EDITOR_CUSTOMSTYLE_AI_CODE',
      () => new CodeEditorProvider(),
    );
  },
};
