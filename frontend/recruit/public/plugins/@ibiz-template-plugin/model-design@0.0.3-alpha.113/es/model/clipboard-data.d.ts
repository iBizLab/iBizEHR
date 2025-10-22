import { IClipboardParams, IModelData } from '../interface';
/**
 * 剪切板数据
 *
 * @export
 * @class ClipboardData
 */
export declare class ClipboardData {
    /**
     * 唯一标识
     *
     * @type {string}
     * @memberof ClipboardData
     */
    uuid: string;
    /**
     * 创建时间
     *
     * @type {string}
     * @memberof ClipboardData
     */
    createdDate: string;
    /**
     * 呈现标题
     *
     * @type {string}
     * @memberof ClipboardData
     */
    title: string;
    /**
     * 是否已经导出模型至当前数据
     *
     * @type {boolean}
     * @memberof ClipboardData
     */
    isExport: boolean;
    /**
     * 是否导出报错
     *
     * @type {boolean}
     * @memberof ClipboardData
     */
    isError: boolean;
    /**
     * 导出异常时的错误信息
     *
     * @type {string}
     * @memberof ClipboardData
     */
    errorInfo?: string;
    /**
     * 实体codeName
     *
     * @type {string}
     * @memberof ClipboardData
     */
    codeName: string;
    /**
     * 剪切板源数据
     *
     * @type {IData[]}
     * @memberof ClipboardData
     */
    items: IData[];
    /**
     * 模型数据
     *
     * @type {IModelData[]}
     * @memberof ClipboardData
     */
    models: IModelData[];
    /**
     * 模型类型
     *
     * @type {('default' | 'advanced' | 'dsl')} （默认模型） | （高级模型） | （dsl模型）
     * @memberof ClipboardData
     */
    type: 'default' | 'advanced' | 'dsl';
    /**
     * 是否选中
     *
     * @type {boolean}
     * @memberof ClipboardData
     */
    isSelected: boolean;
    /**
     * 是否合并模型
     *
     * @type {boolean}
     * @memberof ClipboardData
     */
    isMerge: boolean;
    /**
     * Creates an instance of ModelData.
     * @param {IClipboardParams} data
     * @memberof ModelData
     */
    constructor(data: IClipboardParams);
}
