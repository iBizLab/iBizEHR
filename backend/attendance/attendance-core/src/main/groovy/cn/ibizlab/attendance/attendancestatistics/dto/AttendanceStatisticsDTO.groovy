package cn.ibizlab.attendance.attendancestatistics.dto

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
class AttendanceStatisticsDTO extends GroovyDTO<AttendanceStatisticsDTO> {

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
     * 「需求使用人」
     */
    @JsonProperty("xqsyr")
    String xqsyr
    /**
     * 「需求使用人标识」
     */
    @JsonProperty("xqsyrid")
    String xqsyrid
    /**
     * 「供应商ID」
     */
    @JsonProperty("gys_infoid")
    String gysInfoid
    /**
     * 「供应商名称」
     */
    @JsonProperty("gys_infoname")
    String gysInfoname
    /**
     * 「年假」
     */
    @JsonProperty("annual_leave")
    Double annualLeave
    /**
     * 「调休假」
     */
    @JsonProperty("vacation_leave")
    Double vacationLeave
    /**
     * 「病假」
     */
    @JsonProperty("sick_leave")
    Double sickLeave
    /**
     * 「育儿假」
     */
    @JsonProperty("parental_leave")
    Double parentalLeave
    /**
     * 「陪产假」
     */
    @JsonProperty("paternity_leave")
    Double paternityLeave
    /**
     * 「婚假」
     */
    @JsonProperty("marriage_holiday")
    Double marriageHoliday
    /**
     * 「丧假」
     */
    @JsonProperty("funeral_leave")
    Double funeralLeave
    /**
     * 「产假」
     */
    @JsonProperty("maternity_leave")
    Double maternityLeave
    /**
     * 「上班卡缺卡」
     */
    @JsonProperty("on_missing")
    Integer onMissing
    /**
     * 「下班卡缺卡」
     */
    @JsonProperty("off_missing")
    Integer offMissing
    /**
     * 「事假」
     */
    @JsonProperty("compassionate_leave")
    Double compassionateLeave
    /**
     * 「实际出勤时长」
     */
    @JsonProperty("working_hours")
    Double workingHours
    /**
     * 「请假时长」
     */
    @JsonProperty("leave_duration")
    Double leaveDuration
    /**
     * 「部门ID」
     */
    @JsonProperty("dept_id")
    String deptId
    /**
     * 「缺勤天数」
     */
    @JsonProperty("absent_days")
    Double absentDays
    /**
     * 「实际出勤天数」
     */
    @JsonProperty("actual_attendance_days")
    Double actualAttendanceDays
    /**
     * 「计薪时长」
     */
    @JsonProperty("billable_time")
    Double billableTime
    /**
     * 「缺卡次数」
     */
    @JsonProperty("checkin_missing_times")
    Integer checkinMissingTimes
    /**
     * 「缺退次数」
     */
    @JsonProperty("checkout_missing_times")
    Integer checkoutMissingTimes
    /**
     * 「部门名称」
     */
    @JsonProperty("dept_name")
    String deptName
    /**
     * 「员工编号」
     */
    @JsonProperty("employee_num")
    String employeeNum
    /**
     * 「迟到总时长」
     */
    @JsonProperty("late_time")
    Double lateTime
    /**
     * 「迟到次数」
     */
    @JsonProperty("late_times")
    Integer lateTimes
    /**
     * 「早退总时长」
     */
    @JsonProperty("leave_early_time")
    Double leaveEarlyTime
    /**
     * 「早退次数」
     */
    @JsonProperty("leave_early_times")
    Integer leaveEarlyTimes
    /**
     * 「补卡次数」
     */
    @JsonProperty("make_card_times")
    Integer makeCardTimes
    /**
     * 「成员ID」
     */
    @JsonProperty("member_id")
    String memberId
    /**
     * 「成员姓名」
     */
    @JsonProperty("member_name")
    String memberName
    /**
     * 「调休时长」
     */
    @JsonProperty("off_hours")
    Double offHours
    /**
     * 「出差天数」
     */
    @JsonProperty("on_business_days")
    Double onBusinessDays
    /**
     * 「外出时长」
     */
    @JsonProperty("out_time")
    Double outTime
    /**
     * 「外勤次数」
     */
    @JsonProperty("out_work_times")
    Integer outWorkTimes
    /**
     * 「加班时长(计加班费)」
     */
    @JsonProperty("pay_overtime_time")
    Double payOvertimeTime
    /**
     * 「加班时长(计调休假)」
     */
    @JsonProperty("rest_overtime_time")
    Double restOvertimeTime
    /**
     * 「排班类型」
     */
    @JsonProperty("schedule_type")
    String scheduleType
    /**
     * 「应出勤天数」
     */
    @JsonProperty("should_attendance_days")
    Double shouldAttendanceDays
    /**
     * 「应出勤时长」
     */
    @JsonProperty("should_attendance_time")
    Double shouldAttendanceTime
    /**
     * 「职位」
     */
    @JsonProperty("title")
    String title
    /**
     * 「工作时长」
     */
    @JsonProperty("working_time")
    Double workingTime

    /**
     * 设置「标识」值
     * @param val
     */
    AttendanceStatisticsDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AttendanceStatisticsDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceStatisticsDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AttendanceStatisticsDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceStatisticsDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceStatisticsDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「需求使用人」值
     * @param val
     */
    AttendanceStatisticsDTO setXqsyr(String xqsyr) {
        this.xqsyr = xqsyr
        return this
    }


    /**
     * 设置「需求使用人标识」值
     * @param val
     */
    AttendanceStatisticsDTO setXqsyrid(String xqsyrid) {
        this.xqsyrid = xqsyrid
        return this
    }


    /**
     * 设置「供应商ID」值
     * @param val
     */
    AttendanceStatisticsDTO setGysInfoid(String gysInfoid) {
        this.gysInfoid = gysInfoid
        return this
    }


    /**
     * 设置「供应商名称」值
     * @param val
     */
    AttendanceStatisticsDTO setGysInfoname(String gysInfoname) {
        this.gysInfoname = gysInfoname
        return this
    }


    /**
     * 设置「年假」值
     * @param val
     */
    AttendanceStatisticsDTO setAnnualLeave(Double annualLeave) {
        this.annualLeave = annualLeave
        return this
    }


    /**
     * 设置「调休假」值
     * @param val
     */
    AttendanceStatisticsDTO setVacationLeave(Double vacationLeave) {
        this.vacationLeave = vacationLeave
        return this
    }


    /**
     * 设置「病假」值
     * @param val
     */
    AttendanceStatisticsDTO setSickLeave(Double sickLeave) {
        this.sickLeave = sickLeave
        return this
    }


    /**
     * 设置「育儿假」值
     * @param val
     */
    AttendanceStatisticsDTO setParentalLeave(Double parentalLeave) {
        this.parentalLeave = parentalLeave
        return this
    }


    /**
     * 设置「陪产假」值
     * @param val
     */
    AttendanceStatisticsDTO setPaternityLeave(Double paternityLeave) {
        this.paternityLeave = paternityLeave
        return this
    }


    /**
     * 设置「婚假」值
     * @param val
     */
    AttendanceStatisticsDTO setMarriageHoliday(Double marriageHoliday) {
        this.marriageHoliday = marriageHoliday
        return this
    }


    /**
     * 设置「丧假」值
     * @param val
     */
    AttendanceStatisticsDTO setFuneralLeave(Double funeralLeave) {
        this.funeralLeave = funeralLeave
        return this
    }


    /**
     * 设置「产假」值
     * @param val
     */
    AttendanceStatisticsDTO setMaternityLeave(Double maternityLeave) {
        this.maternityLeave = maternityLeave
        return this
    }


    /**
     * 设置「上班卡缺卡」值
     * @param val
     */
    AttendanceStatisticsDTO setOnMissing(Integer onMissing) {
        this.onMissing = onMissing
        return this
    }


    /**
     * 设置「下班卡缺卡」值
     * @param val
     */
    AttendanceStatisticsDTO setOffMissing(Integer offMissing) {
        this.offMissing = offMissing
        return this
    }


    /**
     * 设置「事假」值
     * @param val
     */
    AttendanceStatisticsDTO setCompassionateLeave(Double compassionateLeave) {
        this.compassionateLeave = compassionateLeave
        return this
    }


    /**
     * 设置「实际出勤时长」值
     * @param val
     */
    AttendanceStatisticsDTO setWorkingHours(Double workingHours) {
        this.workingHours = workingHours
        return this
    }


    /**
     * 设置「请假时长」值
     * @param val
     */
    AttendanceStatisticsDTO setLeaveDuration(Double leaveDuration) {
        this.leaveDuration = leaveDuration
        return this
    }


    /**
     * 设置「部门ID」值
     * @param val
     */
    AttendanceStatisticsDTO setDeptId(String deptId) {
        this.deptId = deptId
        return this
    }


    /**
     * 设置「缺勤天数」值
     * @param val
     */
    AttendanceStatisticsDTO setAbsentDays(Double absentDays) {
        this.absentDays = absentDays
        return this
    }


    /**
     * 设置「实际出勤天数」值
     * @param val
     */
    AttendanceStatisticsDTO setActualAttendanceDays(Double actualAttendanceDays) {
        this.actualAttendanceDays = actualAttendanceDays
        return this
    }


    /**
     * 设置「计薪时长」值
     * @param val
     */
    AttendanceStatisticsDTO setBillableTime(Double billableTime) {
        this.billableTime = billableTime
        return this
    }


    /**
     * 设置「缺卡次数」值
     * @param val
     */
    AttendanceStatisticsDTO setCheckinMissingTimes(Integer checkinMissingTimes) {
        this.checkinMissingTimes = checkinMissingTimes
        return this
    }


    /**
     * 设置「缺退次数」值
     * @param val
     */
    AttendanceStatisticsDTO setCheckoutMissingTimes(Integer checkoutMissingTimes) {
        this.checkoutMissingTimes = checkoutMissingTimes
        return this
    }


    /**
     * 设置「部门名称」值
     * @param val
     */
    AttendanceStatisticsDTO setDeptName(String deptName) {
        this.deptName = deptName
        return this
    }


    /**
     * 设置「员工编号」值
     * @param val
     */
    AttendanceStatisticsDTO setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum
        return this
    }


    /**
     * 设置「迟到总时长」值
     * @param val
     */
    AttendanceStatisticsDTO setLateTime(Double lateTime) {
        this.lateTime = lateTime
        return this
    }


    /**
     * 设置「迟到次数」值
     * @param val
     */
    AttendanceStatisticsDTO setLateTimes(Integer lateTimes) {
        this.lateTimes = lateTimes
        return this
    }


    /**
     * 设置「早退总时长」值
     * @param val
     */
    AttendanceStatisticsDTO setLeaveEarlyTime(Double leaveEarlyTime) {
        this.leaveEarlyTime = leaveEarlyTime
        return this
    }


    /**
     * 设置「早退次数」值
     * @param val
     */
    AttendanceStatisticsDTO setLeaveEarlyTimes(Integer leaveEarlyTimes) {
        this.leaveEarlyTimes = leaveEarlyTimes
        return this
    }


    /**
     * 设置「补卡次数」值
     * @param val
     */
    AttendanceStatisticsDTO setMakeCardTimes(Integer makeCardTimes) {
        this.makeCardTimes = makeCardTimes
        return this
    }


    /**
     * 设置「成员ID」值
     * @param val
     */
    AttendanceStatisticsDTO setMemberId(String memberId) {
        this.memberId = memberId
        return this
    }


    /**
     * 设置「成员姓名」值
     * @param val
     */
    AttendanceStatisticsDTO setMemberName(String memberName) {
        this.memberName = memberName
        return this
    }


    /**
     * 设置「调休时长」值
     * @param val
     */
    AttendanceStatisticsDTO setOffHours(Double offHours) {
        this.offHours = offHours
        return this
    }


    /**
     * 设置「出差天数」值
     * @param val
     */
    AttendanceStatisticsDTO setOnBusinessDays(Double onBusinessDays) {
        this.onBusinessDays = onBusinessDays
        return this
    }


    /**
     * 设置「外出时长」值
     * @param val
     */
    AttendanceStatisticsDTO setOutTime(Double outTime) {
        this.outTime = outTime
        return this
    }


    /**
     * 设置「外勤次数」值
     * @param val
     */
    AttendanceStatisticsDTO setOutWorkTimes(Integer outWorkTimes) {
        this.outWorkTimes = outWorkTimes
        return this
    }


    /**
     * 设置「加班时长(计加班费)」值
     * @param val
     */
    AttendanceStatisticsDTO setPayOvertimeTime(Double payOvertimeTime) {
        this.payOvertimeTime = payOvertimeTime
        return this
    }


    /**
     * 设置「加班时长(计调休假)」值
     * @param val
     */
    AttendanceStatisticsDTO setRestOvertimeTime(Double restOvertimeTime) {
        this.restOvertimeTime = restOvertimeTime
        return this
    }


    /**
     * 设置「排班类型」值
     * @param val
     */
    AttendanceStatisticsDTO setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType
        return this
    }


    /**
     * 设置「应出勤天数」值
     * @param val
     */
    AttendanceStatisticsDTO setShouldAttendanceDays(Double shouldAttendanceDays) {
        this.shouldAttendanceDays = shouldAttendanceDays
        return this
    }


    /**
     * 设置「应出勤时长」值
     * @param val
     */
    AttendanceStatisticsDTO setShouldAttendanceTime(Double shouldAttendanceTime) {
        this.shouldAttendanceTime = shouldAttendanceTime
        return this
    }


    /**
     * 设置「职位」值
     * @param val
     */
    AttendanceStatisticsDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「工作时长」值
     * @param val
     */
    AttendanceStatisticsDTO setWorkingTime(Double workingTime) {
        this.workingTime = workingTime
        return this
    }

}
