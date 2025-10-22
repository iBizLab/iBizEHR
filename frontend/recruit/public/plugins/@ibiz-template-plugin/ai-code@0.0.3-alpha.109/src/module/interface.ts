import * as monacoEditor from 'monaco-editor/esm/vs/editor/editor.api';

export type Monaco = typeof monacoEditor;

/**
 * 配置
 *
 * @export
 * @interface IConfig
 */
export interface IConfig {
  /**
   * 编辑器标识
   *
   * @type {string}
   * @memberof IConfig
   */
  id: string;
  /**
   * 数据
   *
   * @type {IData}
   * @memberof IConfig
   */
  data: IData;
  /**
   * 上下文
   *
   * @type {IContext}
   * @memberof IConfig
   */
  context: IContext;
  /**
   * 视图
   *
   * @type {IParams}
   * @memberof IConfig
   */
  params: IParams;
  /**
   * 语言
   *
   * @type {string}
   * @memberof IConfig
   */
  language: string;
  /**
   * 额外库文件名称
   *
   * @type {string}
   * @memberof IConfig
   */
  libName: string;
  /**
   * 全局变量映射
   *
   * @type {string}
   * @memberof IConfig
   */
  globalVariable?: string;
}
