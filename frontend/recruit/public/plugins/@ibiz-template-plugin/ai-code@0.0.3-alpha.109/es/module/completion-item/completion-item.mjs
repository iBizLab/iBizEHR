import { createUUID } from 'qx-util';
import './variable/index.mjs';
import { resource } from '../../util.mjs';
import { cssVariableCode } from './variable/css.mjs';
import { TypeScriptVariable } from './variable/type-script.mjs';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class CompletionItem {
  /**
   * Creates an instance of CompletionItem.
   * @param {Monaco} monaco
   * @param {IMonaco.editor.IStandaloneCodeEditor} editor
   * @param {IConfig} config
   * @memberof CompletionItem
   */
  constructor(monaco, editor, config) {
    this.monaco = monaco;
    this.editor = editor;
    this.config = config;
    /**
     * 唯一标识
     *
     * @private
     * @type {string}
     * @memberof CompletionItem
     */
    __publicField(this, "UUID", createUUID());
    this.registerByLanguage();
  }
  /**
   * 根据语言类型注册
   *
   * @private
   * @return {*}  {Promise<void>}
   * @memberof CompletionItem
   */
  async registerByLanguage() {
    switch (this.config.language) {
      case "typescript":
        this.registerTypeScript();
        break;
      case "css":
        this.registerCss();
        break;
      default:
        break;
    }
  }
  /**
   * 注册Css完成项补全提示
   * - 通过额外库添加
   * @private
   * @return {*}  {void}
   * @memberof CompletionItem
   */
  registerCss() {
    this.editor.__inlineCompletionsId = this.UUID;
    const cssVariables = [];
    const initCssVariables = () => {
      try {
        if (cssVariableCode) {
          const _tempVar = /* @__PURE__ */ new Map();
          const lines = cssVariableCode.split("\n");
          let currentGroup = "";
          lines.forEach((_line) => {
            const groupMatch = _line.match(/\/\*\s*(.*?)\s*\*\//);
            const varMatch = _line.match(
              /--([\w-]+):\s*([^;]+);\s*\/\*\s*(.*?)\s*\*\//
            );
            if (groupMatch && !varMatch) {
              currentGroup = groupMatch[1].trim();
            }
            if (varMatch) {
              const name = varMatch[1].trim();
              const inlineComment = varMatch[3].trim();
              const cssVar = "--".concat(name);
              _tempVar.set(cssVar, {
                label: "--".concat(name),
                detail: currentGroup,
                documentation: inlineComment
              });
            }
          });
          cssVariables.push(..._tempVar.values());
        }
      } catch (error) {
        ibiz.log.error(error);
      }
    };
    initCssVariables();
    const isInVarFunction = (model, position) => {
      const lineContent = model.getLineContent(position.lineNumber);
      const beforeCursor = lineContent.substring(0, position.column - 1);
      const varStart = beforeCursor.lastIndexOf("var(");
      const closeParen = beforeCursor.indexOf(")", varStart);
      return varStart !== -1 && (closeParen === -1 || closeParen > position.column);
    };
    const disposable = this.monaco.languages.registerCompletionItemProvider(
      "css",
      {
        triggerCharacters: ["-", "--"],
        provideCompletionItems: (model, position) => {
          if (!this.validate(model))
            return { suggestions: [] };
          const insideVar = isInVarFunction(model, position);
          const suggestions = cssVariables.map((v) => ({
            label: v.label,
            kind: 4,
            detail: v.detail,
            documentation: v.documentation,
            insertText: insideVar ? v.label : "var(".concat(v.label, ")")
          }));
          return { suggestions };
        }
      }
    );
    this.editor.onDidDispose(() => {
      disposable == null ? void 0 : disposable.dispose();
    });
  }
  /**
   * 注册TypeScript完成项补全提示
   * - 通过额外库添加
   * @private
   * @return {*}  {Promise<void>}
   * @memberof CompletionItem
   */
  async registerTypeScript() {
    let disposable;
    this.editor.onDidFocusEditorText(() => {
      const content = this.getTypeScriptVariable();
      const libName2 = "ibiz-editor.d.ts";
      disposable = this.monaco.languages.typescript.typescriptDefaults.addExtraLib(
        content,
        libName2
      );
      const model = this.monaco.editor.getModel(this.monaco.Uri.parse(libName2));
      if (model) {
        model.setValue(content);
      } else {
        this.monaco.editor.createModel(
          content,
          // 内容
          this.config.language,
          // 语言
          this.monaco.Uri.parse(libName2)
          // 地址要跟上面 ExtraLib 的一致
        );
      }
    });
    this.editor.onDidBlurEditorText(() => {
      disposable == null ? void 0 : disposable.dispose();
    });
    const { libName } = this.config;
    const libs = this.monaco.languages.typescript.typescriptDefaults.getExtraLibs();
    if (libs[libName] || window.isTypeScriptLibInitialized)
      return;
    window.isTypeScriptLibInitialized = true;
    try {
      const response = await fetch(resource.dir("assets/type/types.txt"));
      if (response.status === 200) {
        const content = await response.text();
        if (content) {
          this.monaco.languages.typescript.typescriptDefaults.addExtraLib(
            "".concat(content),
            libName
          );
          this.monaco.editor.createModel(
            "".concat(content),
            // 内容
            this.config.language,
            // 语言
            this.monaco.Uri.parse(libName)
          );
          this.monaco.languages.registerDefinitionProvider(
            this.config.language,
            {
              provideDefinition: async (model, position) => {
                try {
                  const worker = await this.monaco.languages.typescript.getTypeScriptWorker();
                  const client = await worker(model.uri);
                  const offset = model.getOffsetAt(position);
                  const defs = await client.getDefinitionAtPosition(
                    model.uri.toString(),
                    offset
                  );
                  if (defs && defs.length > 0) {
                    const results = defs.map((item) => {
                      const libUri = this.monaco.Uri.parse(item.fileName);
                      const targetModel = this.monaco.editor.getModel(libUri);
                      if (targetModel) {
                        const startPos = targetModel.getPositionAt(
                          item.textSpan.start
                        );
                        const endPos = targetModel.getPositionAt(
                          item.textSpan.start + item.textSpan.length
                        );
                        return {
                          uri: libUri,
                          range: new this.monaco.Range(
                            startPos.lineNumber - 1,
                            startPos.column - 1,
                            endPos.lineNumber - 1,
                            endPos.column - 1
                          )
                        };
                      }
                      return "";
                    }).filter((_item) => !!_item);
                    return results;
                  }
                } catch (err) {
                  console.error(err);
                }
                return {
                  uri: model.uri,
                  // 跳转目标文件
                  range: new this.monaco.Range(1, 1, 1, 1)
                  // 跳转到 utils.js 文件的第 1 行第 1 列
                };
              }
            }
          );
        }
      }
    } catch (error) {
      ibiz.log.error(error);
    }
  }
  /**
   * 获取TypeScript当前全局变量
   *
   * @private
   * @return {*}  {string}
   * @memberof CompletionItem
   */
  getTypeScriptVariable() {
    const variables = [];
    const { globalVariable } = this.config;
    if (globalVariable) {
      const parts = globalVariable.split("|");
      parts.forEach((part) => {
        const [name, newInterface = ""] = part.split(":");
        const variable = TypeScriptVariable.get(name);
        if (variable) {
          const interfaceType = newInterface || variable.interface;
          const declare = variable.declare.replaceAll(
            variable.interface,
            interfaceType
          );
          variables.push({
            declare,
            interface: interfaceType
          });
        }
      });
    } else {
      variables.push(...Array.from(TypeScriptVariable.values()));
    }
    const interfaces = [];
    variables.forEach(
      (v) => v.interface.includes("&") ? interfaces.push(...v.interface.split("&")) : interfaces.push(v.interface)
    );
    const interfaceText = "import { ".concat(Array.from(
      new Set(interfaces)
    ).join(), " } from './ibiz-global'");
    const variableText = "declare global {".concat(variables.map((v) => v.declare).join(""), "}");
    return "".concat(interfaceText, "\n").concat(variableText);
  }
  /**
   * 检查模型是否属于当前编辑器实例
   *
   * @private
   * @param {IMonaco.editor.ITextModel} model
   * @return {*}  {boolean}
   * @memberof CompletionItem
   */
  validate(model) {
    const currentEditor = this.monaco.editor.getEditors().find((e) => e.getModel() === model);
    if (!currentEditor || currentEditor.__inlineCompletionsId !== this.UUID)
      return false;
    return true;
  }
}

export { CompletionItem };
