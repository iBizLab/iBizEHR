package cn.ibizlab.base.report.dto

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
class ReportDTO extends GroovyDTO<ReportDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「逻辑有效标识」
     */
    @JsonProperty("enable")
    Integer enable
    /**
     * 「创建人」
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「创建时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「更新人」
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「描述」
     */
    @JsonProperty("desc")
    String desc
    /**
     * 「是否系统类型」
     * 字典[是否]
     */
    @JsonProperty("is_system")
    Integer isSystem
    /**
     * 「图表类型」
     * 字典[BI图表类型]
     */
    @JsonProperty("chart_type")
    String chartType
    /**
     * 「组别」
     */
    @JsonProperty("group")
    String group
    /**
     * 「类别」
     */
    @JsonProperty("categories")
    String categories
    /**
     * 「类别」
     */
    @JsonProperty("categories_name")
    String categoriesName
    /**
     * 「模板模型」
     */
    @JsonProperty("template_model")
    String templateModel
    /**
     * 「分组数据」
     */
    @JsonProperty("group_data")
    IEntity groupData
    /**
     * 「报表部件标识」
     */
    @JsonProperty("ctrl_id")
    String ctrlId

    /**
     * 设置「标识」值
     * @param val
     */
    ReportDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ReportDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「逻辑有效标识」值
     * @param val
     */
    ReportDTO setEnable(Integer enable) {
        this.enable = enable
        return this
    }


    /**
     * 设置「创建人」值
     * @param val
     */
    ReportDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    ReportDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    ReportDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ReportDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ReportDTO setDesc(String desc) {
        this.desc = desc
        return this
    }


    /**
     * 设置「是否系统类型」值
     * 字典[是否]
     * @param val
     */
    ReportDTO setIsSystem(Integer isSystem) {
        this.isSystem = isSystem
        return this
    }


    /**
     * 设置「图表类型」值
     * 字典[BI图表类型]
     * @param val
     */
    ReportDTO setChartType(String chartType) {
        this.chartType = chartType
        return this
    }


    /**
     * 设置「组别」值
     * @param val
     */
    ReportDTO setGroup(String group) {
        this.group = group
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    ReportDTO setCategories(String categories) {
        this.categories = categories
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    ReportDTO setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName
        return this
    }


    /**
     * 设置「模板模型」值
     * @param val
     */
    ReportDTO setTemplateModel(String templateModel) {
        this.templateModel = templateModel
        return this
    }


    /**
     * 设置「分组数据」值
     * @param val
     */
    ReportDTO setGroupData(IEntity groupData) {
        this.groupData = groupData
        return this
    }


    /**
     * 设置「报表部件标识」值
     * @param val
     */
    ReportDTO setCtrlId(String ctrlId) {
        this.ctrlId = ctrlId
        return this
    }

}
