package cn.ibizlab.base.irmodelfields.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class IrModelFieldsDTO extends GroovyDTO<IrModelFieldsDTO> {

    /**
     * 「列 1」
     */
    @JsonProperty("column1")
    String column1
    /**
     * 「列 2」
     */
    @JsonProperty("column2")
    String column2
    /**
     * 「公司依赖」
     * 字典[是否]
     */
    @JsonProperty("company_dependent")
    Integer companyDependent
    /**
     * 「全名」
     */
    @JsonProperty("complete_name")
    String completeName
    /**
     * 「计算」
     */
    @JsonProperty("compute")
    String compute
    /**
     * 「可复制」
     * 字典[是否]
     */
    @JsonProperty("copied")
    Integer copied
    /**
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「建立人」
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「币别字段」
     */
    @JsonProperty("currency_field")
    String currencyField
    /**
     * 「依赖于」
     */
    @JsonProperty("depends")
    String depends
    /**
     * 「域名」
     */
    @JsonProperty("domain")
    String domain
    /**
     * 「字段标签」
     */
    @JsonProperty("field_description")
    String fieldDescription
    /**
     * 「扩展组别」
     * 字典[是否]
     */
    @JsonProperty("group_expand")
    Integer groupExpand
    /**
     * 「字段帮助」
     */
    @JsonProperty("help")
    String help
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「索引」
     * 字典[是否]
     */
    @JsonProperty("index")
    Integer index
    /**
     * 「模型名称」
     */
    @JsonProperty("model")
    String model
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「关于删除」
     * 字典[关于删除]
     */
    @JsonProperty("on_delete")
    String onDelete
    /**
     * 「只读」
     * 字典[是否]
     */
    @JsonProperty("readonly")
    Integer readonly
    /**
     * 「关联的字段」
     */
    @JsonProperty("related")
    String related
    /**
     * 「关联的模型」
     */
    @JsonProperty("relation")
    String relation
    /**
     * 「关联字段」
     */
    @JsonProperty("relation_field")
    String relationField
    /**
     * 「关系表」
     */
    @JsonProperty("relation_table")
    String relationTable
    /**
     * 「必填」
     * 字典[是否]
     */
    @JsonProperty("required")
    Integer required
    /**
     * 「净化 HTML」
     * 字典[是否]
     */
    @JsonProperty("sanitize")
    Integer sanitize
    /**
     * 「净化 HTML 属性」
     * 字典[是否]
     */
    @JsonProperty("sanitize_attributes")
    Integer sanitizeAttributes
    /**
     * 「净化 HTML 表格」
     * 字典[是否]
     */
    @JsonProperty("sanitize_form")
    Integer sanitizeForm
    /**
     * 「可重写消毒 HTML」
     * 字典[是否]
     */
    @JsonProperty("sanitize_overridable")
    Integer sanitizeOverridable
    /**
     * 「净化 HTML 样式」
     * 字典[是否]
     */
    @JsonProperty("sanitize_style")
    Integer sanitizeStyle
    /**
     * 「清除 HTML 标记」
     * 字典[是否]
     */
    @JsonProperty("sanitize_tags")
    Integer sanitizeTags
    /**
     * 「可选择」
     * 字典[是否]
     */
    @JsonProperty("selectable")
    Integer selectable
    /**
     * 「大小」
     */
    @JsonProperty("size")
    Integer size
    /**
     * 「类型」
     * 字典[类型]
     */
    @JsonProperty("state")
    String state
    /**
     * 「存储」
     * 字典[是否]
     */
    @JsonProperty("store")
    Integer store
    /**
     * 「剥离类属性」
     * 字典[是否]
     */
    @JsonProperty("strip_classes")
    Integer stripClasses
    /**
     * 「带状样式属性」
     * 字典[是否]
     */
    @JsonProperty("strip_style")
    Integer stripStyle
    /**
     * 「启用跟踪」
     */
    @JsonProperty("tracking")
    Integer tracking
    /**
     * 「可翻译」
     * 字典[是否]
     */
    @JsonProperty("translate")
    Integer translate
    /**
     * 「字段类型」
     * 字典[字段类型]
     */
    @JsonProperty("ttype")
    String ttype
    /**
     * 「更新时间」
     */
    @JsonProperty("write_date")
    Timestamp writeDate
    /**
     * 「更新人」
     */
    @JsonProperty("write_uid")
    String writeUid

    /**
     * 设置「列 1」值
     * @param val
     */
    IrModelFieldsDTO setColumn1(String column1) {
        this.column1 = column1
        return this
    }


    /**
     * 设置「列 2」值
     * @param val
     */
    IrModelFieldsDTO setColumn2(String column2) {
        this.column2 = column2
        return this
    }


    /**
     * 设置「公司依赖」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setCompanyDependent(Integer companyDependent) {
        this.companyDependent = companyDependent
        return this
    }


    /**
     * 设置「全名」值
     * @param val
     */
    IrModelFieldsDTO setCompleteName(String completeName) {
        this.completeName = completeName
        return this
    }


    /**
     * 设置「计算」值
     * @param val
     */
    IrModelFieldsDTO setCompute(String compute) {
        this.compute = compute
        return this
    }


    /**
     * 设置「可复制」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setCopied(Integer copied) {
        this.copied = copied
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    IrModelFieldsDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    IrModelFieldsDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「币别字段」值
     * @param val
     */
    IrModelFieldsDTO setCurrencyField(String currencyField) {
        this.currencyField = currencyField
        return this
    }


    /**
     * 设置「依赖于」值
     * @param val
     */
    IrModelFieldsDTO setDepends(String depends) {
        this.depends = depends
        return this
    }


    /**
     * 设置「域名」值
     * @param val
     */
    IrModelFieldsDTO setDomain(String domain) {
        this.domain = domain
        return this
    }


    /**
     * 设置「字段标签」值
     * @param val
     */
    IrModelFieldsDTO setFieldDescription(String fieldDescription) {
        this.fieldDescription = fieldDescription
        return this
    }


    /**
     * 设置「扩展组别」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setGroupExpand(Integer groupExpand) {
        this.groupExpand = groupExpand
        return this
    }


    /**
     * 设置「字段帮助」值
     * @param val
     */
    IrModelFieldsDTO setHelp(String help) {
        this.help = help
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrModelFieldsDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「索引」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setIndex(Integer index) {
        this.index = index
        return this
    }


    /**
     * 设置「模型名称」值
     * @param val
     */
    IrModelFieldsDTO setModel(String model) {
        this.model = model
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IrModelFieldsDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「关于删除」值
     * 字典[关于删除]
     * @param val
     */
    IrModelFieldsDTO setOnDelete(String onDelete) {
        this.onDelete = onDelete
        return this
    }


    /**
     * 设置「只读」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setReadonly(Integer readonly) {
        this.readonly = readonly
        return this
    }


    /**
     * 设置「关联的字段」值
     * @param val
     */
    IrModelFieldsDTO setRelated(String related) {
        this.related = related
        return this
    }


    /**
     * 设置「关联的模型」值
     * @param val
     */
    IrModelFieldsDTO setRelation(String relation) {
        this.relation = relation
        return this
    }


    /**
     * 设置「关联字段」值
     * @param val
     */
    IrModelFieldsDTO setRelationField(String relationField) {
        this.relationField = relationField
        return this
    }


    /**
     * 设置「关系表」值
     * @param val
     */
    IrModelFieldsDTO setRelationTable(String relationTable) {
        this.relationTable = relationTable
        return this
    }


    /**
     * 设置「必填」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setRequired(Integer required) {
        this.required = required
        return this
    }


    /**
     * 设置「净化 HTML」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setSanitize(Integer sanitize) {
        this.sanitize = sanitize
        return this
    }


    /**
     * 设置「净化 HTML 属性」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setSanitizeAttributes(Integer sanitizeAttributes) {
        this.sanitizeAttributes = sanitizeAttributes
        return this
    }


    /**
     * 设置「净化 HTML 表格」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setSanitizeForm(Integer sanitizeForm) {
        this.sanitizeForm = sanitizeForm
        return this
    }


    /**
     * 设置「可重写消毒 HTML」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setSanitizeOverridable(Integer sanitizeOverridable) {
        this.sanitizeOverridable = sanitizeOverridable
        return this
    }


    /**
     * 设置「净化 HTML 样式」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setSanitizeStyle(Integer sanitizeStyle) {
        this.sanitizeStyle = sanitizeStyle
        return this
    }


    /**
     * 设置「清除 HTML 标记」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setSanitizeTags(Integer sanitizeTags) {
        this.sanitizeTags = sanitizeTags
        return this
    }


    /**
     * 设置「可选择」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setSelectable(Integer selectable) {
        this.selectable = selectable
        return this
    }


    /**
     * 设置「大小」值
     * @param val
     */
    IrModelFieldsDTO setSize(Integer size) {
        this.size = size
        return this
    }


    /**
     * 设置「类型」值
     * 字典[类型]
     * @param val
     */
    IrModelFieldsDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「存储」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setStore(Integer store) {
        this.store = store
        return this
    }


    /**
     * 设置「剥离类属性」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setStripClasses(Integer stripClasses) {
        this.stripClasses = stripClasses
        return this
    }


    /**
     * 设置「带状样式属性」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setStripStyle(Integer stripStyle) {
        this.stripStyle = stripStyle
        return this
    }


    /**
     * 设置「启用跟踪」值
     * @param val
     */
    IrModelFieldsDTO setTracking(Integer tracking) {
        this.tracking = tracking
        return this
    }


    /**
     * 设置「可翻译」值
     * 字典[是否]
     * @param val
     */
    IrModelFieldsDTO setTranslate(Integer translate) {
        this.translate = translate
        return this
    }


    /**
     * 设置「字段类型」值
     * 字典[字段类型]
     * @param val
     */
    IrModelFieldsDTO setTtype(String ttype) {
        this.ttype = ttype
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrModelFieldsDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    IrModelFieldsDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
