package cn.ibizlab.attendance.attendancerecord.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.attendance.attendancerecorddetail.dto.AttendanceRecordDetailDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class AttendanceRecordDTO extends GroovyDTO<AttendanceRecordDTO> {

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
     * 「考勤明细」
     */
    @JsonProperty("details")
    List<AttendanceRecordDetailDTO> details
    /**
     * 「工号」
     */
    @JsonProperty("member_num")
    String memberNum
    /**
     * 「部门ID」
     */
    @JsonProperty("dept_id")
    String deptId
    /**
     * 「请假时长」
     */
    @JsonProperty("leave_duration")
    Double leaveDuration
    /**
     * 「请假类型」
     * 字典[假期类型]
     */
    @JsonProperty("leave_type")
    String leaveType
    /**
     * 「缺卡次数」
     */
    @JsonProperty("checkin_missing_times")
    Integer checkinMissingTimes
    /**
     * 「早退次数」
     */
    @JsonProperty("leave_early_times")
    Integer leaveEarlyTimes
    /**
     * 「迟到次数」
     */
    @JsonProperty("late_times")
    Integer lateTimes
    /**
     * 「部门」
     */
    @JsonProperty("dept_name")
    String deptName
    /**
     * 「职位」
     */
    @JsonProperty("title")
    String title
    /**
     * 「实际出勤天数」
     */
    @JsonProperty("actual_attendance_days")
    Double actualAttendanceDays
    /**
     * 「应出勤天数」
     */
    @JsonProperty("should_attendance_days")
    Double shouldAttendanceDays
    /**
     * 「是否加班」
     */
    @JsonProperty("is_overtime")
    Integer isOvertime
    /**
     * 「计薪时长（小时）」
     */
    @JsonProperty("billable_hours")
    Double billableHours
    /**
     * 「计薪时长（分钟）」
     */
    @JsonProperty("billable_time")
    Integer billableTime
    /**
     * 「考勤日期」
     */
    @JsonProperty("checkin_date")
    Timestamp checkinDate
    /**
     * 「打卡状态信息」
     */
    @JsonProperty("checkin_message")
    String checkinMessage
    /**
     * 「考勤结果」
     * 字典[考勤结果]
     */
    @JsonProperty("checkin_result")
    String checkinResult
    /**
     * 「考勤记录ID」
     */
    @JsonProperty("id")
    String id
    /**
     * 「是否出差」
     */
    @JsonProperty("is_business_trip")
    Integer isBusinessTrip
    /**
     * 「是否外出」
     */
    @JsonProperty("is_go_out")
    Integer isGoOut
    /**
     * 「是否请假」
     */
    @JsonProperty("is_leave")
    Integer isLeave
    /**
     * 「是否外勤」
     */
    @JsonProperty("is_out_work")
    Integer isOutWork
    /**
     * 「是否计加班费」
     */
    @JsonProperty("is_pay_overtime")
    Integer isPayOvertime
    /**
     * 「是否计调休假」
     */
    @JsonProperty("is_rest_overtime")
    Integer isRestOvertime
    /**
     * 「迟到分钟数」
     */
    @JsonProperty("late_minutes")
    Integer lateMinutes
    /**
     * 「迟到时间」
     */
    @JsonProperty("late_time")
    Integer lateTime
    /**
     * 「早退分钟数」
     */
    @JsonProperty("leave_early_minutes")
    Integer leaveEarlyMinutes
    /**
     * 「早退时间」
     */
    @JsonProperty("leave_early_time")
    Integer leaveEarlyTime
    /**
     * 「员工ID」
     */
    @JsonProperty("member_id")
    String memberId
    /**
     * 「员工姓名」
     */
    @JsonProperty("member_name")
    String memberName
    /**
     * 「调休使用时长」
     */
    @JsonProperty("off_hours")
    Integer offHours
    /**
     * 「出差天数」
     */
    @JsonProperty("on_business_days")
    Integer onBusinessDays
    /**
     * 「外出小时数」
     */
    @JsonProperty("out_hours")
    Double outHours
    /**
     * 「外出时间」
     */
    @JsonProperty("out_time")
    Integer outTime
    /**
     * 「外勤小时数」
     */
    @JsonProperty("out_work_hours")
    Double outWorkHours
    /**
     * 「外勤时间」
     */
    @JsonProperty("out_work_time")
    Double outWorkTime
    /**
     * 「加班小时数」
     */
    @JsonProperty("overtime_hours")
    Double overtimeHours
    /**
     * 「加班时间」
     */
    @JsonProperty("overtime_time")
    Double overtimeTime
    /**
     * 「考勤规则ID」
     */
    @JsonProperty("rule_id")
    String ruleId
    /**
     * 「规则名称」
     */
    @JsonProperty("rule_name")
    String ruleName
    /**
     * 「排班类型」
     */
    @JsonProperty("schedule_type")
    String scheduleType
    /**
     * 「班次信息」
     */
    @JsonProperty("shift_message")
    String shiftMessage
    /**
     * 「应出勤时长（小时）」
     */
    @JsonProperty("should_attendance_hours")
    BigDecimal shouldAttendanceHours
    /**
     * 「应出勤时长（分钟）」
     */
    @JsonProperty("should_attendance_time")
    Integer shouldAttendanceTime
    /**
     * 「实际出勤时长（小时）」
     */
    @JsonProperty("working_hours")
    Double workingHours
    /**
     * 「实际出勤时长（分钟）」
     */
    @JsonProperty("working_time")
    Integer workingTime

    /**
     * 设置「名称」值
     * @param val
     */
    AttendanceRecordDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceRecordDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AttendanceRecordDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceRecordDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceRecordDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「考勤明细」值
     * @param val
     */
    AttendanceRecordDTO setDetails(List<AttendanceRecordDetailDTO> details) {
        this.details = details
        return this
    }


    /**
     * 设置「工号」值
     * @param val
     */
    AttendanceRecordDTO setMemberNum(String memberNum) {
        this.memberNum = memberNum
        return this
    }


    /**
     * 设置「部门ID」值
     * @param val
     */
    AttendanceRecordDTO setDeptId(String deptId) {
        this.deptId = deptId
        return this
    }


    /**
     * 设置「请假时长」值
     * @param val
     */
    AttendanceRecordDTO setLeaveDuration(Double leaveDuration) {
        this.leaveDuration = leaveDuration
        return this
    }


    /**
     * 设置「请假类型」值
     * 字典[假期类型]
     * @param val
     */
    AttendanceRecordDTO setLeaveType(String leaveType) {
        this.leaveType = leaveType
        return this
    }


    /**
     * 设置「缺卡次数」值
     * @param val
     */
    AttendanceRecordDTO setCheckinMissingTimes(Integer checkinMissingTimes) {
        this.checkinMissingTimes = checkinMissingTimes
        return this
    }


    /**
     * 设置「早退次数」值
     * @param val
     */
    AttendanceRecordDTO setLeaveEarlyTimes(Integer leaveEarlyTimes) {
        this.leaveEarlyTimes = leaveEarlyTimes
        return this
    }


    /**
     * 设置「迟到次数」值
     * @param val
     */
    AttendanceRecordDTO setLateTimes(Integer lateTimes) {
        this.lateTimes = lateTimes
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    AttendanceRecordDTO setDeptName(String deptName) {
        this.deptName = deptName
        return this
    }


    /**
     * 设置「职位」值
     * @param val
     */
    AttendanceRecordDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「实际出勤天数」值
     * @param val
     */
    AttendanceRecordDTO setActualAttendanceDays(Double actualAttendanceDays) {
        this.actualAttendanceDays = actualAttendanceDays
        return this
    }


    /**
     * 设置「应出勤天数」值
     * @param val
     */
    AttendanceRecordDTO setShouldAttendanceDays(Double shouldAttendanceDays) {
        this.shouldAttendanceDays = shouldAttendanceDays
        return this
    }


    /**
     * 设置「是否加班」值
     * @param val
     */
    AttendanceRecordDTO setIsOvertime(Integer isOvertime) {
        this.isOvertime = isOvertime
        return this
    }


    /**
     * 设置「计薪时长（小时）」值
     * @param val
     */
    AttendanceRecordDTO setBillableHours(Double billableHours) {
        this.billableHours = billableHours
        return this
    }


    /**
     * 设置「计薪时长（分钟）」值
     * @param val
     */
    AttendanceRecordDTO setBillableTime(Integer billableTime) {
        this.billableTime = billableTime
        return this
    }


    /**
     * 设置「考勤日期」值
     * @param val
     */
    AttendanceRecordDTO setCheckinDate(Timestamp checkinDate) {
        this.checkinDate = checkinDate
        return this
    }


    /**
     * 设置「打卡状态信息」值
     * @param val
     */
    AttendanceRecordDTO setCheckinMessage(String checkinMessage) {
        this.checkinMessage = checkinMessage
        return this
    }


    /**
     * 设置「考勤结果」值
     * 字典[考勤结果]
     * @param val
     */
    AttendanceRecordDTO setCheckinResult(String checkinResult) {
        this.checkinResult = checkinResult
        return this
    }


    /**
     * 设置「考勤记录ID」值
     * @param val
     */
    AttendanceRecordDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「是否出差」值
     * @param val
     */
    AttendanceRecordDTO setIsBusinessTrip(Integer isBusinessTrip) {
        this.isBusinessTrip = isBusinessTrip
        return this
    }


    /**
     * 设置「是否外出」值
     * @param val
     */
    AttendanceRecordDTO setIsGoOut(Integer isGoOut) {
        this.isGoOut = isGoOut
        return this
    }


    /**
     * 设置「是否请假」值
     * @param val
     */
    AttendanceRecordDTO setIsLeave(Integer isLeave) {
        this.isLeave = isLeave
        return this
    }


    /**
     * 设置「是否外勤」值
     * @param val
     */
    AttendanceRecordDTO setIsOutWork(Integer isOutWork) {
        this.isOutWork = isOutWork
        return this
    }


    /**
     * 设置「是否计加班费」值
     * @param val
     */
    AttendanceRecordDTO setIsPayOvertime(Integer isPayOvertime) {
        this.isPayOvertime = isPayOvertime
        return this
    }


    /**
     * 设置「是否计调休假」值
     * @param val
     */
    AttendanceRecordDTO setIsRestOvertime(Integer isRestOvertime) {
        this.isRestOvertime = isRestOvertime
        return this
    }


    /**
     * 设置「迟到分钟数」值
     * @param val
     */
    AttendanceRecordDTO setLateMinutes(Integer lateMinutes) {
        this.lateMinutes = lateMinutes
        return this
    }


    /**
     * 设置「迟到时间」值
     * @param val
     */
    AttendanceRecordDTO setLateTime(Integer lateTime) {
        this.lateTime = lateTime
        return this
    }


    /**
     * 设置「早退分钟数」值
     * @param val
     */
    AttendanceRecordDTO setLeaveEarlyMinutes(Integer leaveEarlyMinutes) {
        this.leaveEarlyMinutes = leaveEarlyMinutes
        return this
    }


    /**
     * 设置「早退时间」值
     * @param val
     */
    AttendanceRecordDTO setLeaveEarlyTime(Integer leaveEarlyTime) {
        this.leaveEarlyTime = leaveEarlyTime
        return this
    }


    /**
     * 设置「员工ID」值
     * @param val
     */
    AttendanceRecordDTO setMemberId(String memberId) {
        this.memberId = memberId
        return this
    }


    /**
     * 设置「员工姓名」值
     * @param val
     */
    AttendanceRecordDTO setMemberName(String memberName) {
        this.memberName = memberName
        return this
    }


    /**
     * 设置「调休使用时长」值
     * @param val
     */
    AttendanceRecordDTO setOffHours(Integer offHours) {
        this.offHours = offHours
        return this
    }


    /**
     * 设置「出差天数」值
     * @param val
     */
    AttendanceRecordDTO setOnBusinessDays(Integer onBusinessDays) {
        this.onBusinessDays = onBusinessDays
        return this
    }


    /**
     * 设置「外出小时数」值
     * @param val
     */
    AttendanceRecordDTO setOutHours(Double outHours) {
        this.outHours = outHours
        return this
    }


    /**
     * 设置「外出时间」值
     * @param val
     */
    AttendanceRecordDTO setOutTime(Integer outTime) {
        this.outTime = outTime
        return this
    }


    /**
     * 设置「外勤小时数」值
     * @param val
     */
    AttendanceRecordDTO setOutWorkHours(Double outWorkHours) {
        this.outWorkHours = outWorkHours
        return this
    }


    /**
     * 设置「外勤时间」值
     * @param val
     */
    AttendanceRecordDTO setOutWorkTime(Double outWorkTime) {
        this.outWorkTime = outWorkTime
        return this
    }


    /**
     * 设置「加班小时数」值
     * @param val
     */
    AttendanceRecordDTO setOvertimeHours(Double overtimeHours) {
        this.overtimeHours = overtimeHours
        return this
    }


    /**
     * 设置「加班时间」值
     * @param val
     */
    AttendanceRecordDTO setOvertimeTime(Double overtimeTime) {
        this.overtimeTime = overtimeTime
        return this
    }


    /**
     * 设置「考勤规则ID」值
     * @param val
     */
    AttendanceRecordDTO setRuleId(String ruleId) {
        this.ruleId = ruleId
        return this
    }


    /**
     * 设置「规则名称」值
     * @param val
     */
    AttendanceRecordDTO setRuleName(String ruleName) {
        this.ruleName = ruleName
        return this
    }


    /**
     * 设置「排班类型」值
     * @param val
     */
    AttendanceRecordDTO setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType
        return this
    }


    /**
     * 设置「班次信息」值
     * @param val
     */
    AttendanceRecordDTO setShiftMessage(String shiftMessage) {
        this.shiftMessage = shiftMessage
        return this
    }


    /**
     * 设置「应出勤时长（小时）」值
     * @param val
     */
    AttendanceRecordDTO setShouldAttendanceHours(BigDecimal shouldAttendanceHours) {
        this.shouldAttendanceHours = shouldAttendanceHours
        return this
    }


    /**
     * 设置「应出勤时长（分钟）」值
     * @param val
     */
    AttendanceRecordDTO setShouldAttendanceTime(Integer shouldAttendanceTime) {
        this.shouldAttendanceTime = shouldAttendanceTime
        return this
    }


    /**
     * 设置「实际出勤时长（小时）」值
     * @param val
     */
    AttendanceRecordDTO setWorkingHours(Double workingHours) {
        this.workingHours = workingHours
        return this
    }


    /**
     * 设置「实际出勤时长（分钟）」值
     * @param val
     */
    AttendanceRecordDTO setWorkingTime(Integer workingTime) {
        this.workingTime = workingTime
        return this
    }

}
