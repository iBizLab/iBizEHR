import { ClipboardData } from '../model';
/**
 * 模型剪切板服务
 *
 * @export
 * @class ModelClipboardService
 */
export declare class ModelClipboardService {
    /**
     * 缓存识别码
     *
     * @author zhanghengfeng
     * @date 2024-10-25 19:10:21
     * @private
     * @type {string}
     */
    private localStorageKey;
    /**
     * 获取缓存模型数据项
     *
     * @author zhanghengfeng
     * @date 2024-10-25 19:10:36
     * @return {*}  {ClipboardData[]}
     */
    getModelDataItems(): ClipboardData[];
    /**
     * 设置缓存模型数据项
     *
     * @author zhanghengfeng
     * @date 2024-10-25 19:10:23
     * @param {ClipboardData[]} items
     */
    saveModelDataItems(items: ClipboardData[]): void;
    /**
     * 清空缓存模型数据项
     *
     * @author zhanghengfeng
     * @date 2024-10-25 19:10:46
     */
    clearModelDataItems(): void;
}
export declare const modelClipboardService: ModelClipboardService;
