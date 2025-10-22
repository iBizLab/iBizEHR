import { CodeListEditorController } from '@ibiz-template/runtime';
import { IAppCodeList, ISpan } from '@ibiz/model-core';
export declare class StepCodelistController extends CodeListEditorController<ISpan> {
    /**
     *值项
     */
    valueItem: string;
    /**
     * 无值隐藏单位
     *
     * @type {boolean}
     * @memberof SpanEditorController
     */
    emptyHiddenUnit: boolean;
    /**
     * 代码表模型
     * @return {*}
     * @author: zhujiamin
     * @Date: 2023-05-24 10:55:50
     */
    codeList: IAppCodeList | undefined;
    protected onInit(): Promise<void>;
}
