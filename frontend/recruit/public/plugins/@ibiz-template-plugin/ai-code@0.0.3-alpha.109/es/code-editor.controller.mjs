import { EditorController, getDeACMode } from '@ibiz-template/runtime';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class CodeEditorController extends EditorController {
  constructor() {
    super(...arguments);
    /**
     * 自填模式
     *
     * @type {IAppDEACMode}
     * @memberof CodeEditorController
     */
    __publicField(this, "deACMode");
  }
  /**
   * 语言类型
   * @author lxm
   * @date 2023-07-21 04:52:16
   * @readonly
   */
  get language() {
    return this.editorParams.codeType || this.editorParams.language || "typescript";
  }
  /**
   * 主题
   * @author lxm
   * @date 2023-07-21 04:53:37
   * @readonly
   */
  get theme() {
    return this.editorParams.theme || "vs-dark";
  }
  /**
   * 初始化
   *
   * @protected
   * @return {*}  {Promise<void>}
   * @memberof CodeEditorController
   */
  async onInit() {
    await super.onInit();
    const { appDEACModeId, appDataEntityId } = this.model;
    if (appDEACModeId)
      this.deACMode = await getDeACMode(
        appDEACModeId,
        appDataEntityId,
        this.context.srfappid
      );
  }
}

export { CodeEditorController };
