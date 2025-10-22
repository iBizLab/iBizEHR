package cn.ibizlab.hr.hrleave.dto

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
class HrLeaveDTO extends GroovyDTO<HrLeaveDTO> {

    /**
     * 「休假类型」
     */
    @JsonProperty("holiday_status_id")
    String holidayStatusId
    /**
     * 「下一活动截止日期」
     */
    @JsonProperty("activity_date_deadline")
    Timestamp activityDateDeadline
    /**
     * 「活动异常标示」
     * 字典[活动异常标示]
     */
    @JsonProperty("activity_exception_decoration")
    String activityExceptionDecoration
    /**
     * 「图标」
     */
    @JsonProperty("activity_exception_icon")
    String activityExceptionIcon
    /**
     * 「活动状态」
     * 字典[活动状态]
     */
    @JsonProperty("activity_state")
    String activityState
    /**
     * 「能批准」
     * 字典[是否]
     */
    @JsonProperty("can_approve")
    Integer canApprove
    /**
     * 「可以取消」
     * 字典[是否]
     */
    @JsonProperty("can_cancel")
    Integer canCancel
    /**
     * 「能重置」
     * 字典[是否]
     */
    @JsonProperty("can_reset")
    Integer canReset
    /**
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「开始日期」
     */
    @JsonProperty("date_from")
    Timestamp dateFrom
    /**
     * 「结束日期」
     */
    @JsonProperty("date_to")
    Timestamp dateTo
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「要求的（天/小时）」
     */
    @JsonProperty("duration_display")
    String durationDisplay
    /**
     * 「员工」
     */
    @JsonProperty("employee_id")
    String employeeId
    /**
     * 「有义务日」
     * 字典[是否]
     */
    @JsonProperty("has_mandatory_day")
    Integer hasMandatoryDay
    /**
     * 「有消息」
     * 字典[是否]
     */
    @JsonProperty("has_message")
    Integer hasMessage
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「已孵化」
     * 字典[是否]
     */
    @JsonProperty("is_hatched")
    Integer isHatched
    /**
     * 「罢工」
     * 字典[是否]
     */
    @JsonProperty("is_striked")
    Integer isStriked
    /**
     * 「全天」
     * 字典[是否]
     */
    @JsonProperty("last_several_days")
    Integer lastSeveralDays
    /**
     * 「假期类型 增加持续时间」
     * 字典[是否]
     */
    @JsonProperty("leave_type_increases_duration")
    Integer leaveTypeIncreasesDuration
    /**
     * 「附件数量」
     */
    @JsonProperty("message_attachment_count")
    Integer messageAttachmentCount
    /**
     * 「消息发送错误」
     * 字典[是否]
     */
    @JsonProperty("message_has_error")
    Integer messageHasError
    /**
     * 「错误数量」
     */
    @JsonProperty("message_has_error_counter")
    Integer messageHasErrorCounter
    /**
     * 「短信发送错误」
     * 字典[是否]
     */
    @JsonProperty("message_has_sms_error")
    Integer messageHasSmsError
    /**
     * 「是关注者」
     * 字典[是否]
     */
    @JsonProperty("message_is_follower")
    Integer messageIsFollower
    /**
     * 「所需操作」
     * 字典[是否]
     */
    @JsonProperty("message_needaction")
    Integer messageNeedaction
    /**
     * 「操作数量」
     */
    @JsonProperty("message_needaction_counter")
    Integer messageNeedactionCounter
    /**
     * 「我的活动截止时间」
     */
    @JsonProperty("my_activity_date_deadline")
    Timestamp myActivityDateDeadline
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「理由」
     */
    @JsonProperty("notes")
    String notes
    /**
     * 「持续时间（天）」
     */
    @JsonProperty("number_of_days")
    Double numberOfDays
    /**
     * 「持续时间(小时)」
     */
    @JsonProperty("number_of_hours")
    Double numberOfHours
    /**
     * 「加班费免赔额」
     * 字典[是否]
     */
    @JsonProperty("overtime_deductible")
    Integer overtimeDeductible
    /**
     * 「加班时间」
     */
    @JsonProperty("overtime_id")
    String overtimeId
    /**
     * 「休假描述」
     */
    @JsonProperty("private_name")
    String privateName
    /**
     * 「请假开始日期」
     */
    @JsonProperty("request_date_from")
    Timestamp requestDateFrom
    /**
     * 「日期开始」
     * 字典[日期开始]
     */
    @JsonProperty("request_date_from_period")
    String requestDateFromPeriod
    /**
     * 「请求结束日期」
     */
    @JsonProperty("request_date_to")
    Timestamp requestDateTo
    /**
     * 「时间从」
     */
    @JsonProperty("request_hour_from")
    Double requestHourFrom
    /**
     * 「时间到」
     */
    @JsonProperty("request_hour_to")
    Double requestHourTo
    /**
     * 「半天」
     * 字典[是否]
     */
    @JsonProperty("request_unit_half")
    Integer requestUnitHalf
    /**
     * 「自定义时间」
     * 字典[是否]
     */
    @JsonProperty("request_unit_hours")
    Integer requestUnitHours
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「支持的附件ID计数」
     */
    @JsonProperty("supported_attachment_ids_count")
    Integer supportedAttachmentIdsCount
    /**
     * 「时区不匹配」
     * 字典[是否]
     */
    @JsonProperty("tz_mismatch")
    Integer tzMismatch
    /**
     * 「更新时间」
     */
    @JsonProperty("write_date")
    Timestamp writeDate
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("write_uid")
    String writeUid

    /**
     * 设置「休假类型」值
     * @param val
     */
    HrLeaveDTO setHolidayStatusId(String holidayStatusId) {
        this.holidayStatusId = holidayStatusId
        return this
    }


    /**
     * 设置「下一活动截止日期」值
     * @param val
     */
    HrLeaveDTO setActivityDateDeadline(Timestamp activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline
        return this
    }


    /**
     * 设置「活动异常标示」值
     * 字典[活动异常标示]
     * @param val
     */
    HrLeaveDTO setActivityExceptionDecoration(String activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    HrLeaveDTO setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon
        return this
    }


    /**
     * 设置「活动状态」值
     * 字典[活动状态]
     * @param val
     */
    HrLeaveDTO setActivityState(String activityState) {
        this.activityState = activityState
        return this
    }


    /**
     * 设置「能批准」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setCanApprove(Integer canApprove) {
        this.canApprove = canApprove
        return this
    }


    /**
     * 设置「可以取消」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setCanCancel(Integer canCancel) {
        this.canCancel = canCancel
        return this
    }


    /**
     * 设置「能重置」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setCanReset(Integer canReset) {
        this.canReset = canReset
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrLeaveDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrLeaveDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「开始日期」值
     * @param val
     */
    HrLeaveDTO setDateFrom(Timestamp dateFrom) {
        this.dateFrom = dateFrom
        return this
    }


    /**
     * 设置「结束日期」值
     * @param val
     */
    HrLeaveDTO setDateTo(Timestamp dateTo) {
        this.dateTo = dateTo
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrLeaveDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「要求的（天/小时）」值
     * @param val
     */
    HrLeaveDTO setDurationDisplay(String durationDisplay) {
        this.durationDisplay = durationDisplay
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrLeaveDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「有义务日」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setHasMandatoryDay(Integer hasMandatoryDay) {
        this.hasMandatoryDay = hasMandatoryDay
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrLeaveDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「已孵化」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setIsHatched(Integer isHatched) {
        this.isHatched = isHatched
        return this
    }


    /**
     * 设置「罢工」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setIsStriked(Integer isStriked) {
        this.isStriked = isStriked
        return this
    }


    /**
     * 设置「全天」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setLastSeveralDays(Integer lastSeveralDays) {
        this.lastSeveralDays = lastSeveralDays
        return this
    }


    /**
     * 设置「假期类型 增加持续时间」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setLeaveTypeIncreasesDuration(Integer leaveTypeIncreasesDuration) {
        this.leaveTypeIncreasesDuration = leaveTypeIncreasesDuration
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    HrLeaveDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    HrLeaveDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「所需操作」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    HrLeaveDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「我的活动截止时间」值
     * @param val
     */
    HrLeaveDTO setMyActivityDateDeadline(Timestamp myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrLeaveDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「理由」值
     * @param val
     */
    HrLeaveDTO setNotes(String notes) {
        this.notes = notes
        return this
    }


    /**
     * 设置「持续时间（天）」值
     * @param val
     */
    HrLeaveDTO setNumberOfDays(Double numberOfDays) {
        this.numberOfDays = numberOfDays
        return this
    }


    /**
     * 设置「持续时间(小时)」值
     * @param val
     */
    HrLeaveDTO setNumberOfHours(Double numberOfHours) {
        this.numberOfHours = numberOfHours
        return this
    }


    /**
     * 设置「加班费免赔额」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setOvertimeDeductible(Integer overtimeDeductible) {
        this.overtimeDeductible = overtimeDeductible
        return this
    }


    /**
     * 设置「加班时间」值
     * @param val
     */
    HrLeaveDTO setOvertimeId(String overtimeId) {
        this.overtimeId = overtimeId
        return this
    }


    /**
     * 设置「休假描述」值
     * @param val
     */
    HrLeaveDTO setPrivateName(String privateName) {
        this.privateName = privateName
        return this
    }


    /**
     * 设置「请假开始日期」值
     * @param val
     */
    HrLeaveDTO setRequestDateFrom(Timestamp requestDateFrom) {
        this.requestDateFrom = requestDateFrom
        return this
    }


    /**
     * 设置「日期开始」值
     * 字典[日期开始]
     * @param val
     */
    HrLeaveDTO setRequestDateFromPeriod(String requestDateFromPeriod) {
        this.requestDateFromPeriod = requestDateFromPeriod
        return this
    }


    /**
     * 设置「请求结束日期」值
     * @param val
     */
    HrLeaveDTO setRequestDateTo(Timestamp requestDateTo) {
        this.requestDateTo = requestDateTo
        return this
    }


    /**
     * 设置「时间从」值
     * @param val
     */
    HrLeaveDTO setRequestHourFrom(Double requestHourFrom) {
        this.requestHourFrom = requestHourFrom
        return this
    }


    /**
     * 设置「时间到」值
     * @param val
     */
    HrLeaveDTO setRequestHourTo(Double requestHourTo) {
        this.requestHourTo = requestHourTo
        return this
    }


    /**
     * 设置「半天」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setRequestUnitHalf(Integer requestUnitHalf) {
        this.requestUnitHalf = requestUnitHalf
        return this
    }


    /**
     * 设置「自定义时间」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setRequestUnitHours(Integer requestUnitHours) {
        this.requestUnitHours = requestUnitHours
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    HrLeaveDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「支持的附件ID计数」值
     * @param val
     */
    HrLeaveDTO setSupportedAttachmentIdsCount(Integer supportedAttachmentIdsCount) {
        this.supportedAttachmentIdsCount = supportedAttachmentIdsCount
        return this
    }


    /**
     * 设置「时区不匹配」值
     * 字典[是否]
     * @param val
     */
    HrLeaveDTO setTzMismatch(Integer tzMismatch) {
        this.tzMismatch = tzMismatch
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrLeaveDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrLeaveDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
