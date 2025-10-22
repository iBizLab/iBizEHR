/* eslint-disable @typescript-eslint/no-explicit-any */
import { Node, Shape } from '@antv/x6';
import { Namespace } from '@ibiz-template/core';

/**
 * @description 备注节点
 * @export
 * @class RemarkNode
 * @extends {Shape.HTML}
 */
export class RemarkNode extends Shape.HTML {
  /**
   * 输入数量
   *
   * @type {(number)}
   * @memberof RemarkNode
   */
  inputNum: number = 0;

  /**
   * 输出数量
   *
   * @type {(number)}
   * @memberof RemarkNode
   */
  outputNum: number = 0;

  constructor(metadata: Node.Metadata = {}) {
    const data = metadata.data || {};
    const nodeSize = {
      width: data.width || 240,
      height: data.height || 120,
    };
    super({
      ...nodeSize,
      // 初始数据
      data: {
        ...data,
      },
      attrs: {
        foreignObject: nodeSize,
      },
      // 标记为备注节点
      shape: 'remark-node',
      ...metadata,
    });

    this.setupEvents();
  }

  /**
   * @description 初始化事件监听
   * @private
   * @memberof RemarkNode
   */
  private setupEvents() {
    this.on('selected', (): void => {
      // 选中时使内容可编辑
      this.setNodeEditable(true);
    });
    this.on('unselected', (): void => {
      // 取消选中时使内容不可编辑
      this.setNodeEditable(false);
    });
    this.on('resizing', (size: { width: number; height: number }): void => {
      this.setAttrs({
        foreignObject: size,
      });
    });
  }

  get markup() {
    const ns = new Namespace('logic-node');
    const data = this.getData();

    return {
      tagName: 'foreignObject',
      selector: 'foreignObject',
      children: [
        {
          ns: 'http://www.w3.org/1999/xhtml',
          tagName: 'div',
          className: `${ns.b('text-container')}`,
          selector: 'container',
          style: { width: '100%', height: '100%' },
          children: [
            {
              tagName: 'div',
              className: ns.b('remark'),
              textContent: data.memo,
              attrs: {
                id: this.id, // 添加唯一ID
                contenteditable: 'false',
              },
            },
          ],
        },
      ],
    };
  }

  /**
   * @description 保存备注
   * @private
   * @memberof RemarkNode
   */
  private saveMome() {
    const contentEl = document.getElementById(this.id);
    if (contentEl) {
      this.setData(
        {
          ...this.getData(),
          memo: contentEl.innerText,
        },
        { silent: true },
      );
      this.model?.graph.trigger('node:change:mome', { node: this });
    }
  }

  /**
   * @description 禁用键盘
   * - 禁止复制，粘贴，剪切，回车换行
   * @private
   * @param {KeyboardEvent} e
   * @memberof RemarkNode
   */
  private disableKeyboardEvent(e: KeyboardEvent): void {
    if (
      e.key === 'Enter' ||
      ((e.ctrlKey || e.metaKey) &&
        (e.key === 'c' || e.key === 'v' || e.key === 'x'))
    ) {
      e.preventDefault();
      e.stopPropagation();
    }
  }

  /**
   * @description 设置节点编辑状态
   * @private
   * @param {boolean} editable
   * @memberof RemarkNode
   */
  private setNodeEditable(editable: boolean): void {
    const contentEl = document.getElementById(this.id);
    if (contentEl && contentEl.contentEditable !== editable.toString()) {
      contentEl.contentEditable = editable.toString();
      if (editable) {
        // 可编辑时添加事件监听
        contentEl.focus();
        contentEl.addEventListener('blur', this.saveMome.bind(this));
        contentEl.addEventListener(
          'keydown',
          this.disableKeyboardEvent.bind(this),
        );
      } else {
        // 不可编辑时移除事件监听
        contentEl.removeEventListener('blur', this.saveMome.bind(this));
        contentEl.removeEventListener(
          'keydown',
          this.disableKeyboardEvent.bind(this),
        );
      }
    }
  }
}
