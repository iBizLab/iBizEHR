import { IClipboardParams } from '../../interface';
import { ModelClipboardState } from './model-clipboard-state';
export declare class ModelClipboardController {
    /**
     * 粘贴板状态
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:29
     */
    state: ModelClipboardState;
    constructor();
    /**
     * 新建模型至粘贴板
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:44
     * @param {IClipboardDataParams} data
     */
    createItem(data: IClipboardParams): void;
    /**
     * 存储数据至缓存
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:11
     */
    saveToStore(): void;
    /**
     * 根据唯一标识删除数据
     *
     * @param {string} uuid
     * @memberof ModelClipboardController
     */
    removeById(uuid: string): void;
    /**
     * 清除所有数据
     *
     * @param {string} [type] 粘贴板数据类型
     * @memberof ModelClipboardController
     */
    clearAll(type?: string): void;
}
export declare const modelClipboardController: ModelClipboardController;
