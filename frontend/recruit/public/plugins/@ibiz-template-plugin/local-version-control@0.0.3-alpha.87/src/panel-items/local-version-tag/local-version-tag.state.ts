import { PanelItemState } from '@ibiz-template/runtime';
/**
 * 本地版本标签状态
 *
 * @author tony001
 * @date 2025-03-04 14:03:30
 * @export
 * @class LocalVersionTagState
 * @extends {PanelItemState}
 */
export class LocalVersionTagState extends PanelItemState {
  /**
   * 当前显示时间戳
   *
   * @author tony001
   * @date 2025-03-04 14:03:17
   * @type {number}
   */
  timestamp: number = Date.now();

  /**
   * 是否在保存中
   *
   * @author tony001
   * @date 2025-03-04 14:03:22
   * @type {boolean}
   */
  isSaveing: boolean = false;

  /**
   * 是否有修改
   *
   * @author tony001
   * @date 2025-03-07 17:03:35
   * @type {boolean}
   */
  isDirty: boolean = false;
}
