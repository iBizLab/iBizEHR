import { ClipboardData } from '../model';

/**
 * 模型剪切板服务
 *
 * @export
 * @class ModelClipboardService
 */
export class ModelClipboardService {
  /**
   * 缓存识别码
   *
   * @author zhanghengfeng
   * @date 2024-10-25 19:10:21
   * @private
   * @type {string}
   */
  private localStorageKey: string = 'ModelClipboardCache';

  /**
   * 获取缓存模型数据项
   *
   * @author zhanghengfeng
   * @date 2024-10-25 19:10:36
   * @return {*}  {ClipboardData[]}
   */
  getModelDataItems(): ClipboardData[] {
    const items = window.localStorage.getItem(this.localStorageKey);
    try {
      if (items) {
        const modelDataItems = JSON.parse(items);
        if (Array.isArray(modelDataItems)) {
          return modelDataItems;
        }
        return [];
      }
    } catch (err) {
      ibiz.log.error(err);
    }

    return [];
  }

  /**
   * 设置缓存模型数据项
   *
   * @author zhanghengfeng
   * @date 2024-10-25 19:10:23
   * @param {ClipboardData[]} items
   */
  saveModelDataItems(items: ClipboardData[]): void {
    localStorage.setItem(this.localStorageKey, JSON.stringify(items));
  }

  /**
   * 清空缓存模型数据项
   *
   * @author zhanghengfeng
   * @date 2024-10-25 19:10:46
   */
  clearModelDataItems(): void {
    localStorage.removeItem(this.localStorageKey);
  }
}

export const modelClipboardService = new ModelClipboardService();
