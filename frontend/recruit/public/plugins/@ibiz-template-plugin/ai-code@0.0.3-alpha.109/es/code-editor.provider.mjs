import { CodeEditorController } from './code-editor.controller.mjs';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class CodeEditorProvider {
  constructor() {
    __publicField(this, "formEditor", "IBizAICode");
    __publicField(this, "gridEditor", "IBizAICode");
  }
  async createController(editorModel, parentController) {
    const c = new CodeEditorController(editorModel, parentController);
    await c.init();
    return c;
  }
}

export { CodeEditorProvider };
