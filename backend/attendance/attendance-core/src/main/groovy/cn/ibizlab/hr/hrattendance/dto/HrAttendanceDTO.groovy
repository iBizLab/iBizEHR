package cn.ibizlab.hr.hrattendance.dto

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
class HrAttendanceDTO extends GroovyDTO<HrAttendanceDTO> {

    /**
     * 「关注者」
     */
    @JsonProperty("followers")
    List<IEntity> followers
    /**
     * 「附件集合」
     */
    @JsonProperty("attachments")
    List<IEntity> attachments
    /**
     * 「变更标记」
     */
    @JsonProperty("modified")
    Integer modified
    /**
     * 「签到」
     */
    @JsonProperty("check_in")
    Timestamp checkIn
    /**
     * 「签离」
     */
    @JsonProperty("check_out")
    Timestamp checkOut
    /**
     * 「颜色」
     */
    @JsonProperty("color")
    Integer color
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
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「员工」
     */
    @JsonProperty("employee_id")
    String employeeId
    /**
     * 「员工」
     */
    @JsonProperty("employee_name")
    String employeeName
    /**
     * 「预期工时」
     */
    @JsonProperty("expected_hours")
    Double expectedHours
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
     * 「浏览器」
     */
    @JsonProperty("in_browser")
    String inBrowser
    /**
     * 「城市」
     */
    @JsonProperty("in_city")
    String inCity
    /**
     * 「国家」
     */
    @JsonProperty("in_country_name")
    String inCountryName
    /**
     * 「IP地址」
     */
    @JsonProperty("in_ip_address")
    String inIpAddress
    /**
     * 「纬度」
     */
    @JsonProperty("in_latitude")
    Double inLatitude
    /**
     * 「经度」
     */
    @JsonProperty("in_longitude")
    Double inLongitude
    /**
     * 「模式」
     * 字典[模式]
     */
    @JsonProperty("in_mode")
    String inMode
    /**
     * 「附件数量」
     */
    @JsonProperty("message_attachment_count")
    Integer messageAttachmentCount
    /**
     * 「消息传递错误」
     * 字典[是否]
     */
    @JsonProperty("message_has_error")
    Integer messageHasError
    /**
     * 「错误数」
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
     * 「待处理」
     * 字典[是否]
     */
    @JsonProperty("message_needaction")
    Integer messageNeedaction
    /**
     * 「操作数」
     */
    @JsonProperty("message_needaction_counter")
    Integer messageNeedactionCounter
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「无有效加班时间」
     * 字典[是否]
     */
    @JsonProperty("no_validated_overtime_hours")
    Integer noValidatedOvertimeHours
    /**
     * 「退出浏览器」
     */
    @JsonProperty("out_browser")
    String outBrowser
    /**
     * 「出城」
     */
    @JsonProperty("out_city")
    String outCity
    /**
     * 「国家名称」
     */
    @JsonProperty("out_country_name")
    String outCountryName
    /**
     * 「出口IP 地址」
     */
    @JsonProperty("out_ip_address")
    String outIpAddress
    /**
     * 「纬度」
     */
    @JsonProperty("out_latitude")
    Double outLatitude
    /**
     * 「出经度」
     */
    @JsonProperty("out_longitude")
    Double outLongitude
    /**
     * 「输出模式」
     * 字典[输出模式]
     */
    @JsonProperty("out_mode")
    String outMode
    /**
     * 「随着时间的推移」
     */
    @JsonProperty("overtime_hours")
    Double overtimeHours
    /**
     * 「加班状态」
     * 字典[加班状态]
     */
    @JsonProperty("overtime_status")
    String overtimeStatus
    /**
     * 「加班时间」
     */
    @JsonProperty("validated_overtime_hours")
    Double validatedOvertimeHours
    /**
     * 「工作时数」
     */
    @JsonProperty("worked_hours")
    Double workedHours
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
     * 设置「关注者」值
     * @param val
     */
    HrAttendanceDTO setFollowers(List<IEntity> followers) {
        this.followers = followers
        return this
    }


    /**
     * 设置「附件集合」值
     * @param val
     */
    HrAttendanceDTO setAttachments(List<IEntity> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「变更标记」值
     * @param val
     */
    HrAttendanceDTO setModified(Integer modified) {
        this.modified = modified
        return this
    }


    /**
     * 设置「签到」值
     * @param val
     */
    HrAttendanceDTO setCheckIn(Timestamp checkIn) {
        this.checkIn = checkIn
        return this
    }


    /**
     * 设置「签离」值
     * @param val
     */
    HrAttendanceDTO setCheckOut(Timestamp checkOut) {
        this.checkOut = checkOut
        return this
    }


    /**
     * 设置「颜色」值
     * @param val
     */
    HrAttendanceDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrAttendanceDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrAttendanceDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrAttendanceDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrAttendanceDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrAttendanceDTO setEmployeeName(String employeeName) {
        this.employeeName = employeeName
        return this
    }


    /**
     * 设置「预期工时」值
     * @param val
     */
    HrAttendanceDTO setExpectedHours(Double expectedHours) {
        this.expectedHours = expectedHours
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    HrAttendanceDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrAttendanceDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「浏览器」值
     * @param val
     */
    HrAttendanceDTO setInBrowser(String inBrowser) {
        this.inBrowser = inBrowser
        return this
    }


    /**
     * 设置「城市」值
     * @param val
     */
    HrAttendanceDTO setInCity(String inCity) {
        this.inCity = inCity
        return this
    }


    /**
     * 设置「国家」值
     * @param val
     */
    HrAttendanceDTO setInCountryName(String inCountryName) {
        this.inCountryName = inCountryName
        return this
    }


    /**
     * 设置「IP地址」值
     * @param val
     */
    HrAttendanceDTO setInIpAddress(String inIpAddress) {
        this.inIpAddress = inIpAddress
        return this
    }


    /**
     * 设置「纬度」值
     * @param val
     */
    HrAttendanceDTO setInLatitude(Double inLatitude) {
        this.inLatitude = inLatitude
        return this
    }


    /**
     * 设置「经度」值
     * @param val
     */
    HrAttendanceDTO setInLongitude(Double inLongitude) {
        this.inLongitude = inLongitude
        return this
    }


    /**
     * 设置「模式」值
     * 字典[模式]
     * @param val
     */
    HrAttendanceDTO setInMode(String inMode) {
        this.inMode = inMode
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    HrAttendanceDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「消息传递错误」值
     * 字典[是否]
     * @param val
     */
    HrAttendanceDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数」值
     * @param val
     */
    HrAttendanceDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    HrAttendanceDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    HrAttendanceDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「待处理」值
     * 字典[是否]
     * @param val
     */
    HrAttendanceDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数」值
     * @param val
     */
    HrAttendanceDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrAttendanceDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「无有效加班时间」值
     * 字典[是否]
     * @param val
     */
    HrAttendanceDTO setNoValidatedOvertimeHours(Integer noValidatedOvertimeHours) {
        this.noValidatedOvertimeHours = noValidatedOvertimeHours
        return this
    }


    /**
     * 设置「退出浏览器」值
     * @param val
     */
    HrAttendanceDTO setOutBrowser(String outBrowser) {
        this.outBrowser = outBrowser
        return this
    }


    /**
     * 设置「出城」值
     * @param val
     */
    HrAttendanceDTO setOutCity(String outCity) {
        this.outCity = outCity
        return this
    }


    /**
     * 设置「国家名称」值
     * @param val
     */
    HrAttendanceDTO setOutCountryName(String outCountryName) {
        this.outCountryName = outCountryName
        return this
    }


    /**
     * 设置「出口IP 地址」值
     * @param val
     */
    HrAttendanceDTO setOutIpAddress(String outIpAddress) {
        this.outIpAddress = outIpAddress
        return this
    }


    /**
     * 设置「纬度」值
     * @param val
     */
    HrAttendanceDTO setOutLatitude(Double outLatitude) {
        this.outLatitude = outLatitude
        return this
    }


    /**
     * 设置「出经度」值
     * @param val
     */
    HrAttendanceDTO setOutLongitude(Double outLongitude) {
        this.outLongitude = outLongitude
        return this
    }


    /**
     * 设置「输出模式」值
     * 字典[输出模式]
     * @param val
     */
    HrAttendanceDTO setOutMode(String outMode) {
        this.outMode = outMode
        return this
    }


    /**
     * 设置「随着时间的推移」值
     * @param val
     */
    HrAttendanceDTO setOvertimeHours(Double overtimeHours) {
        this.overtimeHours = overtimeHours
        return this
    }


    /**
     * 设置「加班状态」值
     * 字典[加班状态]
     * @param val
     */
    HrAttendanceDTO setOvertimeStatus(String overtimeStatus) {
        this.overtimeStatus = overtimeStatus
        return this
    }


    /**
     * 设置「加班时间」值
     * @param val
     */
    HrAttendanceDTO setValidatedOvertimeHours(Double validatedOvertimeHours) {
        this.validatedOvertimeHours = validatedOvertimeHours
        return this
    }


    /**
     * 设置「工作时数」值
     * @param val
     */
    HrAttendanceDTO setWorkedHours(Double workedHours) {
        this.workedHours = workedHours
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrAttendanceDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrAttendanceDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
