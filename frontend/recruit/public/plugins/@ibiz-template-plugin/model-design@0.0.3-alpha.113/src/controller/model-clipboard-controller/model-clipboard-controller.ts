import { IClipboardParams } from '../../interface';
import { ClipboardData } from '../../model';
import { modelClipboardService } from '../../service';
import { ModelClipboardState } from './model-clipboard-state';

export class ModelClipboardController {
  /**
   * 粘贴板状态
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:29
   */
  state = new ModelClipboardState();

  constructor() {
    this.state.items = modelClipboardService.getModelDataItems();
  }

  /**
   * 新建模型至粘贴板
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:44
   * @param {IClipboardDataParams} data
   */
  createItem(data: IClipboardParams): void {
    this.state.items.splice(0, 0, new ClipboardData(data));
    this.saveToStore();
  }

  /**
   * 存储数据至缓存
   *
   * @author zhanghengfeng
   * @date 2024-10-25 20:10:11
   */
  saveToStore(): void {
    modelClipboardService.saveModelDataItems(this.state.items);
  }

  /**
   * 根据唯一标识删除数据
   *
   * @param {string} uuid
   * @memberof ModelClipboardController
   */
  removeById(uuid: string): void {
    const index = this.state.items.findIndex(item => item.uuid === uuid);
    this.state.items.splice(index, 1);
    this.saveToStore();
  }

  /**
   * 清除所有数据
   *
   * @param {string} [type] 粘贴板数据类型
   * @memberof ModelClipboardController
   */
  clearAll(type?: string): void {
    this.state.items = this.state.items.filter(item => item.type !== type);
    if (!this.state.items.length) {
      modelClipboardService.clearModelDataItems();
    } else {
      this.saveToStore();
    }
  }
}

export const modelClipboardController = new ModelClipboardController();
