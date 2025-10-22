package cn.ibizlab.attendance.attendancedepartmentstatistics.dto

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
class AttendanceDepartmentStatisticsDTO extends GroovyDTO<AttendanceDepartmentStatisticsDTO> {

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
     * 「应出勤人数」
     */
    @JsonProperty("should_attendance_people_num")
    Integer shouldAttendancePeopleNum
    /**
     * 「正常出勤次数」
     */
    @JsonProperty("normal_attendance_days")
    Integer normalAttendanceDays
    /**
     * 「请假次数」
     */
    @JsonProperty("leave_times")
    Integer leaveTimes
    /**
     * 「外出次数」
     */
    @JsonProperty("go_out_times")
    Integer goOutTimes
    /**
     * 「加班时长(小时)」
     */
    @JsonProperty("overtime_hours")
    Double overtimeHours
    /**
     * 「考勤日期」
     */
    @JsonProperty("checkin_date")
    Timestamp checkinDate
    /**
     * 「部门ID」
     */
    @JsonProperty("dept_id")
    String deptId
    /**
     * 「缺卡次数」
     */
    @JsonProperty("checkin_missing_times")
    Double checkinMissingTimes
    /**
     * 「部门名称」
     */
    @JsonProperty("dept_name")
    String deptName
    /**
     * 「迟到次数」
     */
    @JsonProperty("late_times")
    Double lateTimes
    /**
     * 「早退次数」
     */
    @JsonProperty("leave_early_times")
    Double leaveEarlyTimes
    /**
     * 「外勤次数」
     */
    @JsonProperty("out_work_times")
    Double outWorkTimes

    /**
     * 设置「标识」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「应出勤人数」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setShouldAttendancePeopleNum(Integer shouldAttendancePeopleNum) {
        this.shouldAttendancePeopleNum = shouldAttendancePeopleNum
        return this
    }


    /**
     * 设置「正常出勤次数」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setNormalAttendanceDays(Integer normalAttendanceDays) {
        this.normalAttendanceDays = normalAttendanceDays
        return this
    }


    /**
     * 设置「请假次数」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setLeaveTimes(Integer leaveTimes) {
        this.leaveTimes = leaveTimes
        return this
    }


    /**
     * 设置「外出次数」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setGoOutTimes(Integer goOutTimes) {
        this.goOutTimes = goOutTimes
        return this
    }


    /**
     * 设置「加班时长(小时)」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setOvertimeHours(Double overtimeHours) {
        this.overtimeHours = overtimeHours
        return this
    }


    /**
     * 设置「考勤日期」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setCheckinDate(Timestamp checkinDate) {
        this.checkinDate = checkinDate
        return this
    }


    /**
     * 设置「部门ID」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setDeptId(String deptId) {
        this.deptId = deptId
        return this
    }


    /**
     * 设置「缺卡次数」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setCheckinMissingTimes(Double checkinMissingTimes) {
        this.checkinMissingTimes = checkinMissingTimes
        return this
    }


    /**
     * 设置「部门名称」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setDeptName(String deptName) {
        this.deptName = deptName
        return this
    }


    /**
     * 设置「迟到次数」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setLateTimes(Double lateTimes) {
        this.lateTimes = lateTimes
        return this
    }


    /**
     * 设置「早退次数」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setLeaveEarlyTimes(Double leaveEarlyTimes) {
        this.leaveEarlyTimes = leaveEarlyTimes
        return this
    }


    /**
     * 设置「外勤次数」值
     * @param val
     */
    AttendanceDepartmentStatisticsDTO setOutWorkTimes(Double outWorkTimes) {
        this.outWorkTimes = outWorkTimes
        return this
    }

}
