package cn.ibizlab.attendance.attendanceshift.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.attendance.attendancescope.dto.AttendanceScopeDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class AttendanceShiftDTO extends GroovyDTO<AttendanceShiftDTO> {

    /**
     * 「出勤比率」
     */
    @JsonProperty("attendance_ratio")
    Double attendanceRatio
    /**
     * 「上下班次数」
     * 字典[上下班次数]
     */
    @JsonProperty("working_number")
    Integer workingNumber
    /**
     * 「时间范围」
     */
    @JsonProperty("scopes")
    List<AttendanceScopeDTO> scopes
    /**
     * 「工时」
     */
    @JsonProperty("work_load")
    String workLoad
    /**
     * 「默认标识」
     * 字典[是否]
     */
    @JsonProperty("default_flag")
    Integer defaultFlag
    /**
     * 「公共」
     * 字典[是否]
     */
    @JsonProperty("public_flag")
    Integer publicFlag
    /**
     * 「工作时间」
     */
    @JsonProperty("work_time")
    String workTime
    /**
     * 「班次类型」
     */
    @JsonProperty("schedule_type")
    String scheduleType
    /**
     * 「工作日标识」
     */
    @JsonProperty("workday_id")
    String workdayId
    /**
     * 「加班有效」
     * 字典[是否]
     */
    @JsonProperty("overtime_valid")
    Integer overtimeValid
    /**
     * 「休息配置启用」
     * 字典[是否]
     */
    @JsonProperty("rest_enable")
    Integer restEnable
    /**
     * 「不计入加班的分钟阈值」
     */
    @JsonProperty("invalid_overtime")
    Integer invalidOvertime
    /**
     * 「计入加班的分钟起」
     */
    @JsonProperty("start_overtime")
    Integer startOvertime
    /**
     * 「休息结束时间」
     */
    @JsonProperty("end_start")
    Timestamp endStart
    /**
     * 「休息开始时间」
     */
    @JsonProperty("rest_start")
    Timestamp restStart
    /**
     * 「排序值」
     */
    @JsonProperty("order_value")
    Integer orderValue
    /**
     * 「创建时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「创建人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「主键」
     */
    @JsonProperty("id")
    String id
    /**
     * 「班次名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「考勤规则ID」
     */
    @JsonProperty("rule_id")
    String ruleId
    /**
     * 「考勤规则名称」
     */
    @JsonProperty("rule_name")
    String ruleName
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
     * 设置「出勤比率」值
     * @param val
     */
    AttendanceShiftDTO setAttendanceRatio(Double attendanceRatio) {
        this.attendanceRatio = attendanceRatio
        return this
    }


    /**
     * 设置「上下班次数」值
     * 字典[上下班次数]
     * @param val
     */
    AttendanceShiftDTO setWorkingNumber(Integer workingNumber) {
        this.workingNumber = workingNumber
        return this
    }


    /**
     * 设置「时间范围」值
     * @param val
     */
    AttendanceShiftDTO setScopes(List<AttendanceScopeDTO> scopes) {
        this.scopes = scopes
        return this
    }


    /**
     * 设置「工时」值
     * @param val
     */
    AttendanceShiftDTO setWorkLoad(String workLoad) {
        this.workLoad = workLoad
        return this
    }


    /**
     * 设置「默认标识」值
     * 字典[是否]
     * @param val
     */
    AttendanceShiftDTO setDefaultFlag(Integer defaultFlag) {
        this.defaultFlag = defaultFlag
        return this
    }


    /**
     * 设置「公共」值
     * 字典[是否]
     * @param val
     */
    AttendanceShiftDTO setPublicFlag(Integer publicFlag) {
        this.publicFlag = publicFlag
        return this
    }


    /**
     * 设置「工作时间」值
     * @param val
     */
    AttendanceShiftDTO setWorkTime(String workTime) {
        this.workTime = workTime
        return this
    }


    /**
     * 设置「班次类型」值
     * @param val
     */
    AttendanceShiftDTO setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType
        return this
    }


    /**
     * 设置「工作日标识」值
     * @param val
     */
    AttendanceShiftDTO setWorkdayId(String workdayId) {
        this.workdayId = workdayId
        return this
    }


    /**
     * 设置「加班有效」值
     * 字典[是否]
     * @param val
     */
    AttendanceShiftDTO setOvertimeValid(Integer overtimeValid) {
        this.overtimeValid = overtimeValid
        return this
    }


    /**
     * 设置「休息配置启用」值
     * 字典[是否]
     * @param val
     */
    AttendanceShiftDTO setRestEnable(Integer restEnable) {
        this.restEnable = restEnable
        return this
    }


    /**
     * 设置「不计入加班的分钟阈值」值
     * @param val
     */
    AttendanceShiftDTO setInvalidOvertime(Integer invalidOvertime) {
        this.invalidOvertime = invalidOvertime
        return this
    }


    /**
     * 设置「计入加班的分钟起」值
     * @param val
     */
    AttendanceShiftDTO setStartOvertime(Integer startOvertime) {
        this.startOvertime = startOvertime
        return this
    }


    /**
     * 设置「休息结束时间」值
     * @param val
     */
    AttendanceShiftDTO setEndStart(Timestamp endStart) {
        this.endStart = endStart
        return this
    }


    /**
     * 设置「休息开始时间」值
     * @param val
     */
    AttendanceShiftDTO setRestStart(Timestamp restStart) {
        this.restStart = restStart
        return this
    }


    /**
     * 设置「排序值」值
     * @param val
     */
    AttendanceShiftDTO setOrderValue(Integer orderValue) {
        this.orderValue = orderValue
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AttendanceShiftDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceShiftDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    AttendanceShiftDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「班次名称」值
     * @param val
     */
    AttendanceShiftDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「考勤规则ID」值
     * @param val
     */
    AttendanceShiftDTO setRuleId(String ruleId) {
        this.ruleId = ruleId
        return this
    }


    /**
     * 设置「考勤规则名称」值
     * @param val
     */
    AttendanceShiftDTO setRuleName(String ruleName) {
        this.ruleName = ruleName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceShiftDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceShiftDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
