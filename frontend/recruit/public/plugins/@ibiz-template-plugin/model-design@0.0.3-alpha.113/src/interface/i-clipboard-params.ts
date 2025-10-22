import { IModelData } from './i-model-data';

/**
 * 剪切板参数
 *
 * @export
 * @interface IClipboardParams
 */
export interface IClipboardParams {
  /**
   * 剪切板标题
   *
   * @type {string}
   * @memberof IClipboardParams
   */
  title: string;

  /**
   * 实体codeName
   *
   * @type {string}
   * @memberof IClipboardParams
   */
  codeName: string;

  /**
   * 剪切板源数据
   * - 数据项必须包含srfkey字段
   * - 没有传models时，会根据实体标识加载对应数据的模型
   * @type {IData[]}
   * @memberof IClipboardParams
   */
  items?: IData[];

  /**
   * 剪切板模型
   * - 手动传入的剪切项的模型，该模型集合数据格式必须和加载回来的数据模型数据格式一致
   * @type {IModelData[]}
   * @memberof IClipboardParams
   */
  models?: IModelData[];

  /**
   * 数据剪切类型
   *
   * @type {('default' | 'advanced' | 'dsl')} （默认模型） | （高级模型） | （dsl模型）
   * @memberof IClipboardParams
   */
  type?: 'default' | 'advanced' | 'dsl';

  /**
   * 是否合并模型
   *
   * @type {boolean}
   * @memberof IClipboardParams
   */
  isMerge?: boolean;
}
