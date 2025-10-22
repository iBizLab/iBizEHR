import { ClipboardData } from '../../model';

export class DSLModelClipboardImportViewState {
  /**
   * 是否正在加载
   *
   * @type {boolean}
   * @memberof ModelClipboardImportViewState
   */
  isLoading: boolean = false;

  /**
   * 已拖入的剪切板数据
   *
   * @type {ClipboardData[]}
   * @memberof ModelClipboardImportViewState
   */
  items: ClipboardData[] = [];

  /**
   * 已导入的模型
   *
   * @type {IData[]}
   * @memberof ModelClipboardImportViewState
   */
  importItems: IData[] = [];

  /**
   * 当前编辑的模型
   *
   * @type {IData[]}
   * @memberof ModelClipboardImportViewState
   */
  models: string[] = [];

  /**
   * 模型json
   *
   * @type {string}
   * @memberof ModelClipboardImportViewState
   */
  modelStr: string = '';

  /**
   * 是否在代码编辑器更改过模型json
   *
   * @type {boolean}
   * @memberof ModelClipboardImportViewState
   */
  isModelChange: boolean = false;

  /**
   * 参数
   *
   * @type {IData}
   * @memberof ModelClipboardImportViewState
   */
  params: IData = {};
}
