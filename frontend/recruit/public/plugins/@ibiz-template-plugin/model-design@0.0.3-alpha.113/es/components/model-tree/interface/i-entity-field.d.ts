/**
 * 实体属性信息
 *
 * @export
 * @interface IEntityField
 */
export interface IEntityField {
    /**
     * 属性名称
     *
     * @type {string}
     * @memberof IEntityField
     */
    caption: string;
    /**
     * 实体属性标识
     *
     * @type {string}
     * @memberof IEntityField
     */
    appDEFieldId: string;
    /**
     * 是否为主信息属性
     *
     * @type {boolean}
     * @memberof IEntityField
     */
    majorField: boolean;
    /**
     * 引用应用实体标识
     *
     * @type {string}
     * @memberof IEntityField
     */
    refAppDataEntityId?: string;
}
