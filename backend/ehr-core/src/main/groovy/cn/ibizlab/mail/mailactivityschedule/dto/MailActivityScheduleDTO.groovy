package cn.ibizlab.mail.mailactivityschedule.dto

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
class MailActivityScheduleDTO extends GroovyDTO<MailActivityScheduleDTO> {

    /**
     * 「链接类型」
     * 字典[链接类型]
     */
    @JsonProperty("chaining_type")
    String chainingType
    /**
     * 「活动类型」
     */
    @JsonProperty("activity_type_id")
    String activityTypeId
    /**
     * 「活动类型名称」
     */
    @JsonProperty("activity_type_name")
    String activityTypeName
    /**
     * 「分派给」
     */
    @JsonProperty("activity_user_id")
    String activityUserId
    /**
     * 「分派给名称」
     */
    @JsonProperty("activity_user_name")
    String activityUserName
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
     * 「到期日期」
     */
    @JsonProperty("date_deadline")
    Timestamp dateDeadline
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「错误」
     */
    @JsonProperty("error")
    String error
    /**
     * 「有错误」
     * 字典[是否]
     */
    @JsonProperty("has_error")
    Integer hasError
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「批量使用」
     * 字典[是否]
     */
    @JsonProperty("is_batch_mode")
    Integer isBatchMode
    /**
     * 「备注」
     */
    @JsonProperty("note")
    String note
    /**
     * 「计划日期」
     */
    @JsonProperty("plan_date")
    Timestamp planDate
    /**
     * 「计划部门可筛选」
     * 字典[是否]
     */
    @JsonProperty("plan_department_filterable")
    Integer planDepartmentFilterable
    /**
     * 「计划」
     */
    @JsonProperty("plan_id")
    String planId
    /**
     * 「分派给」
     */
    @JsonProperty("plan_on_demand_user_id")
    String planOnDemandUserId
    /**
     * 「计划概要」
     */
    @JsonProperty("plan_summary")
    String planSummary
    /**
     * 「文档 ID」
     */
    @JsonProperty("res_ids")
    String resIds
    /**
     * 「模型」
     */
    @JsonProperty("res_model")
    String resModel
    /**
     * 「摘要」
     */
    @JsonProperty("summary")
    String summary
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
     * 设置「链接类型」值
     * 字典[链接类型]
     * @param val
     */
    MailActivityScheduleDTO setChainingType(String chainingType) {
        this.chainingType = chainingType
        return this
    }


    /**
     * 设置「活动类型」值
     * @param val
     */
    MailActivityScheduleDTO setActivityTypeId(String activityTypeId) {
        this.activityTypeId = activityTypeId
        return this
    }


    /**
     * 设置「活动类型名称」值
     * @param val
     */
    MailActivityScheduleDTO setActivityTypeName(String activityTypeName) {
        this.activityTypeName = activityTypeName
        return this
    }


    /**
     * 设置「分派给」值
     * @param val
     */
    MailActivityScheduleDTO setActivityUserId(String activityUserId) {
        this.activityUserId = activityUserId
        return this
    }


    /**
     * 设置「分派给名称」值
     * @param val
     */
    MailActivityScheduleDTO setActivityUserName(String activityUserName) {
        this.activityUserName = activityUserName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailActivityScheduleDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    MailActivityScheduleDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「到期日期」值
     * @param val
     */
    MailActivityScheduleDTO setDateDeadline(Timestamp dateDeadline) {
        this.dateDeadline = dateDeadline
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailActivityScheduleDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「错误」值
     * @param val
     */
    MailActivityScheduleDTO setError(String error) {
        this.error = error
        return this
    }


    /**
     * 设置「有错误」值
     * 字典[是否]
     * @param val
     */
    MailActivityScheduleDTO setHasError(Integer hasError) {
        this.hasError = hasError
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailActivityScheduleDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「批量使用」值
     * 字典[是否]
     * @param val
     */
    MailActivityScheduleDTO setIsBatchMode(Integer isBatchMode) {
        this.isBatchMode = isBatchMode
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    MailActivityScheduleDTO setNote(String note) {
        this.note = note
        return this
    }


    /**
     * 设置「计划日期」值
     * @param val
     */
    MailActivityScheduleDTO setPlanDate(Timestamp planDate) {
        this.planDate = planDate
        return this
    }


    /**
     * 设置「计划部门可筛选」值
     * 字典[是否]
     * @param val
     */
    MailActivityScheduleDTO setPlanDepartmentFilterable(Integer planDepartmentFilterable) {
        this.planDepartmentFilterable = planDepartmentFilterable
        return this
    }


    /**
     * 设置「计划」值
     * @param val
     */
    MailActivityScheduleDTO setPlanId(String planId) {
        this.planId = planId
        return this
    }


    /**
     * 设置「分派给」值
     * @param val
     */
    MailActivityScheduleDTO setPlanOnDemandUserId(String planOnDemandUserId) {
        this.planOnDemandUserId = planOnDemandUserId
        return this
    }


    /**
     * 设置「计划概要」值
     * @param val
     */
    MailActivityScheduleDTO setPlanSummary(String planSummary) {
        this.planSummary = planSummary
        return this
    }


    /**
     * 设置「文档 ID」值
     * @param val
     */
    MailActivityScheduleDTO setResIds(String resIds) {
        this.resIds = resIds
        return this
    }


    /**
     * 设置「模型」值
     * @param val
     */
    MailActivityScheduleDTO setResModel(String resModel) {
        this.resModel = resModel
        return this
    }


    /**
     * 设置「摘要」值
     * @param val
     */
    MailActivityScheduleDTO setSummary(String summary) {
        this.summary = summary
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailActivityScheduleDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    MailActivityScheduleDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
