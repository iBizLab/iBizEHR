import { IModelData } from '../../interface';
import { ClipboardData } from '../../model';
export declare class ModelClipboardPasteViewState {
    /**
     * 是否正在加载
     *
     * @type {boolean}
     * @memberof ModelClipboardPasteViewState
     */
    isLoading: boolean;
    /**
     * 已拖入的剪切板数据
     *
     * @type {ClipboardData[]}
     * @memberof ModelClipboardPasteViewState
     */
    items: ClipboardData[];
    /**
     * 已导入的模型
     *
     * @type {IData[]}
     * @memberof ModelClipboardPasteViewState
     */
    importItems: IData[];
    /**
     * 当前编辑的模型
     *
     * @type {IModelData[]}
     * @memberof ModelClipboardPasteViewState
     */
    models: IModelData[];
    /**
     * 模型json
     *
     * @type {string}
     * @memberof ModelClipboardPasteViewState
     */
    modelStr: string;
    /**
     * 是否在代码编辑器更改过模型json
     *
     * @type {boolean}
     * @memberof ModelClipboardPasteViewState
     */
    isModelChange: boolean;
    /**
     * 参数
     *
     * @type {IData}
     * @memberof ModelClipboardPasteViewState
     */
    params: IData;
}
