/* eslint-disable @typescript-eslint/no-explicit-any */
import * as IMonaco from 'monaco-editor';
import { createUUID } from 'qx-util';
import { IConfig, Monaco } from '../interface';
import { cssVariableCode, TypeScriptVariable } from './variable';
import { resource } from '../../util';
/**
 * 完成项补全
 *
 * @export
 * @class CompletionItem
 */
export class CompletionItem {
  /**
   * 唯一标识
   *
   * @private
   * @type {string}
   * @memberof CompletionItem
   */
  private UUID: string = createUUID();

  /**
   * Creates an instance of CompletionItem.
   * @param {Monaco} monaco
   * @param {IMonaco.editor.IStandaloneCodeEditor} editor
   * @param {IConfig} config
   * @memberof CompletionItem
   */
  constructor(
    private monaco: Monaco,
    private editor: IMonaco.editor.IStandaloneCodeEditor,
    private config: IConfig,
  ) {
    this.registerByLanguage();
  }

  /**
   * 根据语言类型注册
   *
   * @private
   * @return {*}  {Promise<void>}
   * @memberof CompletionItem
   */
  private async registerByLanguage(): Promise<void> {
    switch (this.config.language) {
      case 'typescript':
        this.registerTypeScript();
        break;
      case 'css':
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
  private registerCss(): void {
    (this.editor as IData).__inlineCompletionsId = this.UUID;
    /** 初始化css变量，用于智能补全 */
    const cssVariables: IData[] = [];
    const initCssVariables = () => {
      try {
        if (cssVariableCode) {
          const _tempVar = new Map();
          const lines = cssVariableCode.split('\n');
          let currentGroup = '';

          lines.forEach(_line => {
            const groupMatch = _line.match(/\/\*\s*(.*?)\s*\*\//);
            const varMatch = _line.match(
              /--([\w-]+):\s*([^;]+);\s*\/\*\s*(.*?)\s*\*\//,
            );

            if (groupMatch && !varMatch) {
              // 这是分组注释
              currentGroup = groupMatch[1].trim();
            }

            if (varMatch) {
              const name = varMatch[1].trim();
              const inlineComment = varMatch[3].trim();
              const cssVar = `--${name}`;
              _tempVar.set(cssVar, {
                label: `--${name}`,
                detail: currentGroup,
                documentation: inlineComment,
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

    /** 判断是否在var()中输入 */
    const isInVarFunction = (model: IParams, position: IParams) => {
      const lineContent = model.getLineContent(position.lineNumber);
      const beforeCursor = lineContent.substring(0, position.column - 1);
      const varStart = beforeCursor.lastIndexOf('var(');
      const closeParen = beforeCursor.indexOf(')', varStart);
      return (
        varStart !== -1 && (closeParen === -1 || closeParen > position.column)
      );
    };
    const disposable = this.monaco.languages.registerCompletionItemProvider(
      'css',
      {
        triggerCharacters: ['-', '--'],
        provideCompletionItems: (model, position): any => {
          if (!this.validate(model)) return { suggestions: [] };
          const insideVar = isInVarFunction(model, position);
          const suggestions = cssVariables.map(v => ({
            label: v.label,
            kind: 4,
            detail: v.detail,
            documentation: v.documentation,
            insertText: insideVar ? v.label : `var(${v.label})`,
          }));
          return { suggestions };
        },
      },
    );

    // 编辑器销毁时清理资源
    this.editor.onDidDispose(() => {
      disposable?.dispose();
    });
  }

  /**
   * 注册TypeScript完成项补全提示
   * - 通过额外库添加
   * @private
   * @return {*}  {Promise<void>}
   * @memberof CompletionItem
   */
  private async registerTypeScript(): Promise<void> {
    let disposable: IMonaco.IDisposable | undefined;

    // 聚焦时注册当前全局变量
    this.editor.onDidFocusEditorText(() => {
      const content = this.getTypeScriptVariable();
      const libName = `ibiz-editor.d.ts`;
      disposable =
        this.monaco.languages.typescript.typescriptDefaults.addExtraLib(
          content,
          libName,
        );

      const model = this.monaco.editor.getModel(this.monaco.Uri.parse(libName));
      if (model) {
        model.setValue(content);
      } else {
        this.monaco.editor.createModel(
          content, // 内容
          this.config.language, // 语言
          this.monaco.Uri.parse(libName), // 地址要跟上面 ExtraLib 的一致
        );
      }
    });

    // 失去焦点移除当前全局变量
    this.editor.onDidBlurEditorText(() => {
      disposable?.dispose();
    });
    const { libName } = this.config;
    const libs =
      this.monaco.languages.typescript.typescriptDefaults.getExtraLibs();
    // 全局只注册一次
    if (libs[libName] || (window as any).isTypeScriptLibInitialized) return;
    (window as any).isTypeScriptLibInitialized = true;
    try {
      const response = await fetch(resource.dir('assets/type/types.txt'));
      if (response.status === 200) {
        const content = await response.text();
        if (content) {
          this.monaco.languages.typescript.typescriptDefaults.addExtraLib(
            `${content}`,
            libName,
          );

          // 创建模型，主要用于适配可通过ctrl + click跳转到定义的接口，查看接口参数
          this.monaco.editor.createModel(
            `${content}`, // 内容
            this.config.language, // 语言
            this.monaco.Uri.parse(libName),
          );

          // 注册跳转定义
          this.monaco.languages.registerDefinitionProvider(
            this.config.language,
            {
              provideDefinition: async (
                model,
                position,
              ): Promise<IMonaco.languages.Definition> => {
                try {
                  // 获取 TypeScript Worker
                  const worker =
                    await this.monaco.languages.typescript.getTypeScriptWorker();
                  const client = await worker(model.uri);
                  // 计算当前光标位置的 offset
                  const offset = model.getOffsetAt(position);
                  // 调用 TS Worker 内置方法获得定义信息
                  const defs = await client.getDefinitionAtPosition(
                    model.uri.toString(),
                    offset,
                  );

                  if (defs && defs.length > 0) {
                    const results = defs
                      .map(item => {
                        const libUri = this.monaco.Uri.parse(item.fileName);

                        const targetModel = this.monaco.editor.getModel(libUri);
                        if (targetModel) {
                          // 获取点击单词的开始下标位置
                          const startPos = targetModel.getPositionAt(
                            item.textSpan.start,
                          );

                          // 获取点击单词的结束下标位置
                          const endPos = targetModel.getPositionAt(
                            item.textSpan.start + item.textSpan.length,
                          );
                          return {
                            uri: libUri,
                            range: new this.monaco.Range(
                              startPos.lineNumber - 1,
                              startPos.column - 1,
                              endPos.lineNumber - 1,
                              endPos.column - 1,
                            ),
                          };
                        }
                        return '';
                      })
                      .filter(_item => !!_item);
                    return results as IMonaco.languages.Definition;
                  }
                } catch (err) {
                  console.error(err);
                }
                return {
                  uri: model.uri, // 跳转目标文件
                  range: new this.monaco.Range(1, 1, 1, 1), // 跳转到 utils.js 文件的第 1 行第 1 列
                };
              },
            },
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
  private getTypeScriptVariable(): string {
    const variables: Array<{ declare: string; interface: string }> = [];
    const { globalVariable } = this.config;
    // 如果配置了全局变量，以配置为准
    if (globalVariable) {
      const parts = globalVariable.split('|');
      parts.forEach(part => {
        const [name, newInterface = ''] = part.split(':');
        const variable = TypeScriptVariable.get(name);
        if (variable) {
          // 如果配置了接口，则替换默认申明的接口内容
          const interfaceType = newInterface || variable.interface;
          const declare = variable.declare.replaceAll(
            variable.interface,
            interfaceType,
          );
          variables.push({
            declare,
            interface: interfaceType,
          });
        }
      });
    } else {
      variables.push(...Array.from(TypeScriptVariable.values()));
    }
    // 获取全局对象接口
    const interfaces: string[] = [];
    variables.forEach(v =>
      v.interface.includes('&')
        ? interfaces.push(...v.interface.split('&'))
        : interfaces.push(v.interface),
    );
    // 计算全局变量所需接口
    const interfaceText = `import { ${Array.from(
      new Set(interfaces),
    ).join()} } from './ibiz-global'`;

    // 计算当前全局变量
    const variableText = `declare global {${variables
      .map(v => v.declare)
      .join('')}}`;
    return `${interfaceText}\n${variableText}`;
  }

  /**
   * 检查模型是否属于当前编辑器实例
   *
   * @private
   * @param {IMonaco.editor.ITextModel} model
   * @return {*}  {boolean}
   * @memberof CompletionItem
   */
  private validate(model: IMonaco.editor.ITextModel): boolean {
    const currentEditor = this.monaco.editor
      .getEditors()
      .find(e => e.getModel() === model);

    if (
      !currentEditor ||
      (currentEditor as IData).__inlineCompletionsId !== this.UUID
    )
      return false;
    return true;
  }
}
