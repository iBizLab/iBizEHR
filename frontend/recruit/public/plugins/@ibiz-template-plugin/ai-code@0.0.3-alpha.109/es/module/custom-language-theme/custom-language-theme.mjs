import './language/index.mjs';
import { TypeScriptLanguage } from './language/typescript.mjs';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class CustomLanguageTheme {
  /**
   * Creates an instance of CompletionItem.
   * @param {Monaco} monaco
   * @param {IMonaco.editor.IStandaloneCodeEditor} editor
   * @param {IConfig} config
   * @memberof CompletionItem
   */
  constructor(monaco, config) {
    this.monaco = monaco;
    this.config = config;
    /**
     * 主题名称
     *
     * @type {string}
     * @memberof CustomTheme
     */
    __publicField(this, "themeName", "vs-dark");
    this.registerByLanguage();
  }
  /**
   * 根据语言类型注册
   *
   * @private
   * @memberof CustomTheme
   */
  registerByLanguage() {
    switch (this.config.language) {
      case "typescript":
        this.registerTypeScriptTheme();
        break;
      default:
        break;
    }
  }
  /**
   * 注册并应用TS自定义主题
   *
   * @private
   * @memberof CustomTheme
   */
  registerTypeScriptTheme() {
    this.themeName = "ts-dark-plus";
    this.monaco.editor.defineTheme(this.themeName, {
      base: "vs-dark",
      inherit: true,
      rules: [
        // 对象名（蓝色）
        { token: "support.type.object.ts", foreground: "#4FC1FF" },
        // 方法名（浅黄）
        { token: "support.function.method.ts", foreground: "#DCDCAA" },
        // 属性名（天蓝）
        { token: "support.property.ts", foreground: "#9CDCFE" },
        // 点号和括号
        { token: "delimiter.method.ts", foreground: "#D4D4D4" }
      ],
      colors: {
        "editor.foreground": "#D4D4D4",
        "editor.background": "#1E1E1E"
      }
    });
    this.monaco.languages.setMonarchTokensProvider("typescript", {
      // 保留默认规则
      ...TypeScriptLanguage,
      tokenizer: {
        // 保留默认规则
        ...TypeScriptLanguage.tokenizer,
        root: [
          // 1：匹配对象方法 obj.method()
          [
            /([a-zA-Z_$][\w$]*)(\.)([a-zA-Z_$][\w$]*)(\()/,
            [
              "support.type.object.ts",
              // 对象名
              "delimiter.method.ts",
              // 点号
              "support.function.method.ts",
              // 方法名
              "delimiter.method.ts"
              // 括号
            ]
          ],
          // 2：匹配对象属性 obj.property
          [
            /([a-zA-Z_$][\w$]*)(\.)([a-zA-Z_$][\w$]*)/,
            [
              "support.type.object.ts",
              // 对象名
              "delimiter.method.ts",
              // 点号
              "support.property.ts"
              // 属性名
            ]
          ],
          // 保留默认规则
          ...TypeScriptLanguage.tokenizer.root
        ]
      }
    });
  }
}

export { CustomLanguageTheme };
