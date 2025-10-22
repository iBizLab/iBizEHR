import { Node, Shape } from '@antv/x6';
import { Namespace } from '@ibiz-template/core';
export declare function generateMarkup(ns: Namespace, text: string, smallText: string, drag: boolean, special: boolean, showTitle?: boolean): {
    tagName: string;
    selector: string;
    children: {
        ns: string;
        tagName: string;
        className: string;
        selector: string;
        children: ({
            tagName: string;
            className: string;
            selector: string;
            children?: undefined;
        } | {
            tagName: string;
            className: string;
            children: ({
                tagName: string;
                className: string;
                textContent: string;
                attrs: {
                    title: string;
                };
            } | {
                tagName: string;
                className: string;
                textContent: string;
                attrs?: undefined;
            })[];
            selector?: undefined;
        })[];
    }[];
};
export declare const specialType: string[];
export declare class LogicNode extends Shape.Rect {
    /**
     * 输入数量
     *
     * @type {(number | undefined)}
     * @memberof LogicNode
     */
    inputNum: number | undefined;
    /**
     * 输出数量
     *
     * @type {(number | undefined)}
     * @memberof LogicNode
     */
    outputNum: number | undefined;
    constructor(metadata?: Node.Metadata);
}
