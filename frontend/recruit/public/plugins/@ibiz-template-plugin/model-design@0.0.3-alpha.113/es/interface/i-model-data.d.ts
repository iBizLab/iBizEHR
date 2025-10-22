/**
 * 模型数据
 *
 * @export
 * @interface IModelData
 */
export interface IModelData {
    /**
     * 当前模型实体
     *
     * @type {string}
     * @memberof ICopyModel
     */
    modeltype: string;
    /**
     * 当前模型数据
     *
     * @type {IData}
     * @memberof ICopyModel
     */
    model: IData;
    /**
     * 当前模型关联数据
     *
     * @type {IData}
     * @memberof ICopyModel
     */
    requires: IData;
    /**
     * dsl模型(groovy代码)
     *
     * @type {IData}
     * @memberof IModelData
     */
    dsl: string;
}
