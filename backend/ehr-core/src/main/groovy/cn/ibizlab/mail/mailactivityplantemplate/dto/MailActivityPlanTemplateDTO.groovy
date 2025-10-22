package cn.ibizlab.mail.mailactivityplantemplate.dto

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
class MailActivityPlanTemplateDTO extends GroovyDTO<MailActivityPlanTemplateDTO> {

    /**
     * 「活动类型」
     */
    @JsonProperty("activity_type_id")
    String activityTypeId
    /**
     * 「活动类型」
     */
    @JsonProperty("activity_type_name")
    String activityTypeName
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
     * 「间隔」
     */
    @JsonProperty("delay_count")
    Integer delayCount
    /**
     * 「触发方式」
     * 字典[触发方式]
     */
    @JsonProperty("delay_from")
    String delayFrom
    /**
     * 「延迟单位」
     * 字典[延迟单位]
     */
    @JsonProperty("delay_unit")
    String delayUnit
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「备注」
     */
    @JsonProperty("note")
    String note
    /**
     * 「计划」
     */
    @JsonProperty("plan_id")
    String planId
    /**
     * 「计划」
     */
    @JsonProperty("plan_name")
    String planName
    /**
     * 「分派给」
     */
    @JsonProperty("responsible_id")
    String responsibleId
    /**
     * 「分派给」
     */
    @JsonProperty("responsible_name")
    String responsibleName
    /**
     * 「指派」
     * 字典[指派]
     */
    @JsonProperty("responsible_type")
    String responsibleType
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
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
     * 设置「活动类型」值
     * @param val
     */
    MailActivityPlanTemplateDTO setActivityTypeId(String activityTypeId) {
        this.activityTypeId = activityTypeId
        return this
    }


    /**
     * 设置「活动类型」值
     * @param val
     */
    MailActivityPlanTemplateDTO setActivityTypeName(String activityTypeName) {
        this.activityTypeName = activityTypeName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailActivityPlanTemplateDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    MailActivityPlanTemplateDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「间隔」值
     * @param val
     */
    MailActivityPlanTemplateDTO setDelayCount(Integer delayCount) {
        this.delayCount = delayCount
        return this
    }


    /**
     * 设置「触发方式」值
     * 字典[触发方式]
     * @param val
     */
    MailActivityPlanTemplateDTO setDelayFrom(String delayFrom) {
        this.delayFrom = delayFrom
        return this
    }


    /**
     * 设置「延迟单位」值
     * 字典[延迟单位]
     * @param val
     */
    MailActivityPlanTemplateDTO setDelayUnit(String delayUnit) {
        this.delayUnit = delayUnit
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailActivityPlanTemplateDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailActivityPlanTemplateDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    MailActivityPlanTemplateDTO setNote(String note) {
        this.note = note
        return this
    }


    /**
     * 设置「计划」值
     * @param val
     */
    MailActivityPlanTemplateDTO setPlanId(String planId) {
        this.planId = planId
        return this
    }


    /**
     * 设置「计划」值
     * @param val
     */
    MailActivityPlanTemplateDTO setPlanName(String planName) {
        this.planName = planName
        return this
    }


    /**
     * 设置「分派给」值
     * @param val
     */
    MailActivityPlanTemplateDTO setResponsibleId(String responsibleId) {
        this.responsibleId = responsibleId
        return this
    }


    /**
     * 设置「分派给」值
     * @param val
     */
    MailActivityPlanTemplateDTO setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName
        return this
    }


    /**
     * 设置「指派」值
     * 字典[指派]
     * @param val
     */
    MailActivityPlanTemplateDTO setResponsibleType(String responsibleType) {
        this.responsibleType = responsibleType
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    MailActivityPlanTemplateDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「摘要」值
     * @param val
     */
    MailActivityPlanTemplateDTO setSummary(String summary) {
        this.summary = summary
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailActivityPlanTemplateDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    MailActivityPlanTemplateDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
