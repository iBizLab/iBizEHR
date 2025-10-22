import { Node, Shape } from '@antv/x6';
/**
 * @description 备注节点
 * @export
 * @class RemarkNode
 * @extends {Shape.HTML}
 */
export declare class RemarkNode extends Shape.HTML {
    /**
     * 输入数量
     *
     * @type {(number)}
     * @memberof RemarkNode
     */
    inputNum: number;
    /**
     * 输出数量
     *
     * @type {(number)}
     * @memberof RemarkNode
     */
    outputNum: number;
    constructor(metadata?: Node.Metadata);
    /**
     * @description 初始化事件监听
     * @private
     * @memberof RemarkNode
     */
    private setupEvents;
    get markup(): {
        tagName: string;
        selector: string;
        children: {
            ns: string;
            tagName: string;
            className: string;
            selector: string;
            style: {
                width: string;
                height: string;
            };
            children: {
                tagName: string;
                className: string;
                textContent: any;
                attrs: {
                    id: string;
                    contenteditable: string;
                };
            }[];
        }[];
    };
    /**
     * @description 保存备注
     * @private
     * @memberof RemarkNode
     */
    private saveMome;
    /**
     * @description 禁用键盘
     * - 禁止复制，粘贴，剪切，回车换行
     * @private
     * @param {KeyboardEvent} e
     * @memberof RemarkNode
     */
    private disableKeyboardEvent;
    /**
     * @description 设置节点编辑状态
     * @private
     * @param {boolean} editable
     * @memberof RemarkNode
     */
    private setNodeEditable;
}
