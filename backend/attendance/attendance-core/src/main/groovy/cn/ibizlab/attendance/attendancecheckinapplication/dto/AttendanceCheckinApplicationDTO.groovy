package cn.ibizlab.attendance.attendancecheckinapplication.dto

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
class AttendanceCheckinApplicationDTO extends GroovyDTO<AttendanceCheckinApplicationDTO> {

    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("write_uid")
    String writeUid
    /**
     * 「更新时间」
     */
    @JsonProperty("write_date")
    Timestamp writeDate
    /**
     * 「审批人ID」
     */
    @JsonProperty("approver_id")
    String approverId
    /**
     * 「审批人」
     */
    @JsonProperty("approver_name")
    String approverName
    /**
     * 「抄送人」
     */
    @JsonProperty("copy_give")
    String copyGive
    /**
     * 「抄送人名称」
     * 字典[抄送人]
     */
    @JsonProperty("copy_give_names")
    String copyGiveNames
    /**
     * 「申请说明」
     */
    @JsonProperty("reason")
    String reason
    /**
     * 「工号」
     */
    @JsonProperty("employee_num")
    String employeeNum
    /**
     * 「部门」
     */
    @JsonProperty("dept_name")
    String deptName
    /**
     * 「开始时间」
     */
    @JsonProperty("start_time")
    Timestamp startTime
    /**
     * 「结束时间」
     */
    @JsonProperty("end_time")
    Timestamp endTime
    /**
     * 「假期类型」
     * 字典[假期类型]
     */
    @JsonProperty("leave_type")
    String leaveType
    /**
     * 「出发城市」
     */
    @JsonProperty("departure_city")
    String departureCity
    /**
     * 「目的城市」
     */
    @JsonProperty("destination_city")
    String destinationCity
    /**
     * 「补卡日期」
     */
    @JsonProperty("reissue_date")
    Timestamp reissueDate
    /**
     * 「补卡时间」
     */
    @JsonProperty("reissue_time")
    Timestamp reissueTime
    /**
     * 「外出地」
     */
    @JsonProperty("go_out_place")
    String goOutPlace
    /**
     * 「小时数」
     */
    @JsonProperty("hours")
    Double hours
    /**
     * 「分钟数」
     */
    @JsonProperty("minutes")
    Double minutes
    /**
     * 「加班类型」
     * 字典[加班种类]
     */
    @JsonProperty("overtime_type")
    String overtimeType
    /**
     * 「部门ID」
     */
    @JsonProperty("dept_id")
    String deptId
    /**
     * 「天数」
     */
    @JsonProperty("days")
    Double days
    /**
     * 「申请人」
     */
    @JsonProperty("applicant_id")
    String applicantId
    /**
     * 「申请人姓名」
     */
    @JsonProperty("applicant_name")
    String applicantName
    /**
     * 「申请类型」
     * 字典[考勤申请类型]
     */
    @JsonProperty("apply_type")
    String applyType
    /**
     * 「主键」
     */
    @JsonProperty("id")
    String id
    /**
     * 「状态」
     * 字典[申请状态]
     */
    @JsonProperty("status")
    String status

    /**
     * 设置「名称」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceCheckinApplicationDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceCheckinApplicationDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「审批人ID」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setApproverId(String approverId) {
        this.approverId = approverId
        return this
    }


    /**
     * 设置「审批人」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setApproverName(String approverName) {
        this.approverName = approverName
        return this
    }


    /**
     * 设置「抄送人」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setCopyGive(String copyGive) {
        this.copyGive = copyGive
        return this
    }


    /**
     * 设置「抄送人名称」值
     * 字典[抄送人]
     * @param val
     */
    AttendanceCheckinApplicationDTO setCopyGiveNames(String copyGiveNames) {
        this.copyGiveNames = copyGiveNames
        return this
    }


    /**
     * 设置「申请说明」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setReason(String reason) {
        this.reason = reason
        return this
    }


    /**
     * 设置「工号」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setDeptName(String deptName) {
        this.deptName = deptName
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setStartTime(Timestamp startTime) {
        this.startTime = startTime
        return this
    }


    /**
     * 设置「结束时间」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setEndTime(Timestamp endTime) {
        this.endTime = endTime
        return this
    }


    /**
     * 设置「假期类型」值
     * 字典[假期类型]
     * @param val
     */
    AttendanceCheckinApplicationDTO setLeaveType(String leaveType) {
        this.leaveType = leaveType
        return this
    }


    /**
     * 设置「出发城市」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setDepartureCity(String departureCity) {
        this.departureCity = departureCity
        return this
    }


    /**
     * 设置「目的城市」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity
        return this
    }


    /**
     * 设置「补卡日期」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setReissueDate(Timestamp reissueDate) {
        this.reissueDate = reissueDate
        return this
    }


    /**
     * 设置「补卡时间」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setReissueTime(Timestamp reissueTime) {
        this.reissueTime = reissueTime
        return this
    }


    /**
     * 设置「外出地」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setGoOutPlace(String goOutPlace) {
        this.goOutPlace = goOutPlace
        return this
    }


    /**
     * 设置「小时数」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setHours(Double hours) {
        this.hours = hours
        return this
    }


    /**
     * 设置「分钟数」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setMinutes(Double minutes) {
        this.minutes = minutes
        return this
    }


    /**
     * 设置「加班类型」值
     * 字典[加班种类]
     * @param val
     */
    AttendanceCheckinApplicationDTO setOvertimeType(String overtimeType) {
        this.overtimeType = overtimeType
        return this
    }


    /**
     * 设置「部门ID」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setDeptId(String deptId) {
        this.deptId = deptId
        return this
    }


    /**
     * 设置「天数」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setDays(Double days) {
        this.days = days
        return this
    }


    /**
     * 设置「申请人」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setApplicantId(String applicantId) {
        this.applicantId = applicantId
        return this
    }


    /**
     * 设置「申请人姓名」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setApplicantName(String applicantName) {
        this.applicantName = applicantName
        return this
    }


    /**
     * 设置「申请类型」值
     * 字典[考勤申请类型]
     * @param val
     */
    AttendanceCheckinApplicationDTO setApplyType(String applyType) {
        this.applyType = applyType
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    AttendanceCheckinApplicationDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「状态」值
     * 字典[申请状态]
     * @param val
     */
    AttendanceCheckinApplicationDTO setStatus(String status) {
        this.status = status
        return this
    }

}
