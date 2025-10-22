import { Shape, Edge, Graph } from '@antv/x6';
import { IDataEntity } from '@ibiz-template/runtime';
import { Namespace } from '@ibiz-template/core';
import { X6LinkDataProvider } from '../../../interface';
/**
 * 逻辑连线
 * - 设计模式(DESIGNMODE)为样式2(STYLE2)时的连线
 * @export
 * @class LogicLink2
 * @extends {Shape.Edge}
 */
export declare class LogicLink2 extends Shape.Edge {
    protected ns: Namespace;
    protected shiftButtonStatus: boolean;
    protected logicType: string;
    protected g?: Graph;
    protected get isSelected(): boolean;
    protected getShiftButtonClassName(): {
        svg_shift_wrapper: string;
        svg_shift1: string;
        svg_shift2: string;
    };
    protected onShiftButtonClick(): void;
    protected getLogicDesignLabel(dataProvider: X6LinkDataProvider<IDataEntity>): {
        el: HTMLElement;
        width: number;
        height: number;
    };
    protected getLogicDesignLabelPosition(width: number): Edge.Label['position'];
    protected setLogicLinkLabel(): void;
    protected setLinkMode(): void;
    constructor(metadata?: Edge.Metadata);
}
