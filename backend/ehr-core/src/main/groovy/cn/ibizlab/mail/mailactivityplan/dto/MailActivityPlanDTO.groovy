package cn.ibizlab.mail.mailactivityplan.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.mail.mailactivityplantemplate.dto.MailActivityPlanTemplateDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class MailActivityPlanDTO extends GroovyDTO<MailActivityPlanDTO> {

    /**
     * 「活动计划模板」
     */
    @JsonProperty("templates")
    List<MailActivityPlanTemplateDTO> templates
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「公司」
     */
    @JsonProperty("company_name")
    String companyName
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
     * 「部门可指派」
     * 字典[是否]
     */
    @JsonProperty("department_assignable")
    Integer departmentAssignable
    /**
     * 「部门」
     */
    @JsonProperty("department_id")
    String departmentId
    /**
     * 「部门」
     */
    @JsonProperty("department_name")
    String departmentName
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「按需负责」
     * 字典[是否]
     */
    @JsonProperty("has_user_on_demand")
    Integer hasUserOnDemand
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
     * 「步数计数」
     */
    @JsonProperty("steps_count")
    Integer stepsCount
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
     * 设置「活动计划模板」值
     * @param val
     */
    MailActivityPlanDTO setTemplates(List<MailActivityPlanTemplateDTO> templates) {
        this.templates = templates
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    MailActivityPlanDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    MailActivityPlanDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    MailActivityPlanDTO setCompanyName(String companyName) {
        this.companyName = companyName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailActivityPlanDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    MailActivityPlanDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「部门可指派」值
     * 字典[是否]
     * @param val
     */
    MailActivityPlanDTO setDepartmentAssignable(Integer departmentAssignable) {
        this.departmentAssignable = departmentAssignable
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    MailActivityPlanDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    MailActivityPlanDTO setDepartmentName(String departmentName) {
        this.departmentName = departmentName
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailActivityPlanDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「按需负责」值
     * 字典[是否]
     * @param val
     */
    MailActivityPlanDTO setHasUserOnDemand(Integer hasUserOnDemand) {
        this.hasUserOnDemand = hasUserOnDemand
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailActivityPlanDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailActivityPlanDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「步数计数」值
     * @param val
     */
    MailActivityPlanDTO setStepsCount(Integer stepsCount) {
        this.stepsCount = stepsCount
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailActivityPlanDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    MailActivityPlanDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
