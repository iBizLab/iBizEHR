'use strict';

Object.defineProperty(exports, '__esModule', { value: true });

var runtime = require('@ibiz-template/runtime');
var monacoEditor = require('./monaco-editor/monaco-editor.cjs');
var codeEditor_provider = require('./code-editor.provider.cjs');

"use strict";
var index = {
  install(app) {
    app.component("IBizAICode", monacoEditor.IBizAICode);
    runtime.registerEditorProvider(
      "EDITOR_CUSTOMSTYLE_AI_CODE",
      () => new codeEditor_provider.CodeEditorProvider()
    );
  }
};

exports.default = index;
