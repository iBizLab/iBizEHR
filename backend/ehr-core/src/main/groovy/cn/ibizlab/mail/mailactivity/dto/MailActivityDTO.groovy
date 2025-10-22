package cn.ibizlab.mail.mailactivity.dto

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
class MailActivityDTO extends GroovyDTO<MailActivityDTO> {

    /**
     * 「到期天数」
     */
    @JsonProperty("deadline_day")
    Integer deadlineDay
    /**
     * 「链接类型」
     * 字典[链接类型]
     */
    @JsonProperty("chaining_type")
    String chainingType
    /**
     * 「保持完成」
     * 字典[是否]
     */
    @JsonProperty("keep_done")
    Integer keepDone
    /**
     * 「资源标识」
     */
    @JsonProperty("res_id")
    String resId
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
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
     * 「自动活动」
     * 字典[是否]
     */
    @JsonProperty("automated")
    Integer automated
    /**
     * 「可写」
     * 字典[是否]
     */
    @JsonProperty("can_write")
    Integer canWrite
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
     * 「完成日期」
     */
    @JsonProperty("date_done")
    Timestamp dateDone
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「下一活动可用」
     * 字典[是否]
     */
    @JsonProperty("has_recommended_activities")
    Integer hasRecommendedActivities
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
     * 「上一个活动类型」
     */
    @JsonProperty("previous_activity_type_id")
    String previousActivityTypeId
    /**
     * 「推荐的活动类型」
     */
    @JsonProperty("recommended_activity_type_id")
    String recommendedActivityTypeId
    /**
     * 「请求伙伴」
     */
    @JsonProperty("request_partner_id")
    String requestPartnerId
    /**
     * 「资源模型」
     */
    @JsonProperty("res_model")
    String resModel
    /**
     * 「单据名称」
     */
    @JsonProperty("res_name")
    String resName
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「摘要」
     */
    @JsonProperty("summary")
    String summary
    /**
     * 「分派给」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「分派给_名称」
     */
    @JsonProperty("user_name")
    String userName
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
     * 设置「到期天数」值
     * @param val
     */
    MailActivityDTO setDeadlineDay(Integer deadlineDay) {
        this.deadlineDay = deadlineDay
        return this
    }


    /**
     * 设置「链接类型」值
     * 字典[链接类型]
     * @param val
     */
    MailActivityDTO setChainingType(String chainingType) {
        this.chainingType = chainingType
        return this
    }


    /**
     * 设置「保持完成」值
     * 字典[是否]
     * @param val
     */
    MailActivityDTO setKeepDone(Integer keepDone) {
        this.keepDone = keepDone
        return this
    }


    /**
     * 设置「资源标识」值
     * @param val
     */
    MailActivityDTO setResId(String resId) {
        this.resId = resId
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    MailActivityDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「活动类型」值
     * @param val
     */
    MailActivityDTO setActivityTypeId(String activityTypeId) {
        this.activityTypeId = activityTypeId
        return this
    }


    /**
     * 设置「活动类型」值
     * @param val
     */
    MailActivityDTO setActivityTypeName(String activityTypeName) {
        this.activityTypeName = activityTypeName
        return this
    }


    /**
     * 设置「自动活动」值
     * 字典[是否]
     * @param val
     */
    MailActivityDTO setAutomated(Integer automated) {
        this.automated = automated
        return this
    }


    /**
     * 设置「可写」值
     * 字典[是否]
     * @param val
     */
    MailActivityDTO setCanWrite(Integer canWrite) {
        this.canWrite = canWrite
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailActivityDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    MailActivityDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「到期日期」值
     * @param val
     */
    MailActivityDTO setDateDeadline(Timestamp dateDeadline) {
        this.dateDeadline = dateDeadline
        return this
    }


    /**
     * 设置「完成日期」值
     * @param val
     */
    MailActivityDTO setDateDone(Timestamp dateDone) {
        this.dateDone = dateDone
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailActivityDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「下一活动可用」值
     * 字典[是否]
     * @param val
     */
    MailActivityDTO setHasRecommendedActivities(Integer hasRecommendedActivities) {
        this.hasRecommendedActivities = hasRecommendedActivities
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailActivityDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    MailActivityDTO setNote(String note) {
        this.note = note
        return this
    }


    /**
     * 设置「上一个活动类型」值
     * @param val
     */
    MailActivityDTO setPreviousActivityTypeId(String previousActivityTypeId) {
        this.previousActivityTypeId = previousActivityTypeId
        return this
    }


    /**
     * 设置「推荐的活动类型」值
     * @param val
     */
    MailActivityDTO setRecommendedActivityTypeId(String recommendedActivityTypeId) {
        this.recommendedActivityTypeId = recommendedActivityTypeId
        return this
    }


    /**
     * 设置「请求伙伴」值
     * @param val
     */
    MailActivityDTO setRequestPartnerId(String requestPartnerId) {
        this.requestPartnerId = requestPartnerId
        return this
    }


    /**
     * 设置「资源模型」值
     * @param val
     */
    MailActivityDTO setResModel(String resModel) {
        this.resModel = resModel
        return this
    }


    /**
     * 设置「单据名称」值
     * @param val
     */
    MailActivityDTO setResName(String resName) {
        this.resName = resName
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    MailActivityDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「摘要」值
     * @param val
     */
    MailActivityDTO setSummary(String summary) {
        this.summary = summary
        return this
    }


    /**
     * 设置「分派给」值
     * @param val
     */
    MailActivityDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「分派给_名称」值
     * @param val
     */
    MailActivityDTO setUserName(String userName) {
        this.userName = userName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailActivityDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    MailActivityDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
