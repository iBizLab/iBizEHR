import { ClipboardData } from '../../model';

export class ModelClipboardImportViewState {
  /**
   * 是否正在加载
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:11
   * @type {boolean}
   */
  isLoading: boolean = false;

  /**
   * 已拖入的剪切板数据
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:22
   * @type {ClipboardData[]}
   */
  items: ClipboardData[] = [];

  /**
   * 已导入的模型
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:38
   * @type {IData[]}
   */
  importItems: IData[] = [];

  /**
   * 当前编辑的模型
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:13
   * @type {IData[]}
   */
  models: IData[] = [];

  /**
   * 模型json
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:58
   * @type {string}
   */
  modelStr: string = '';

  /**
   * 是否在代码编辑器更改过模型json
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:31
   * @type {boolean}
   */
  isModelChange: boolean = false;

  /**
   * 参数
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:45
   * @type {IData}
   */
  params: IData = {};
}
