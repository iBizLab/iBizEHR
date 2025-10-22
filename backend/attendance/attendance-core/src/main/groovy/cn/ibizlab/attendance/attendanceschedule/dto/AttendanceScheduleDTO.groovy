package cn.ibizlab.attendance.attendanceschedule.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.attendance.attendanceactivateshift.dto.AttendanceActivateShiftDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class AttendanceScheduleDTO extends GroovyDTO<AttendanceScheduleDTO> {

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
     * 「班次信息」
     */
    @JsonProperty("shifts")
    List<AttendanceActivateShiftDTO> shifts
    /**
     * 「工作时段」
     */
    @JsonProperty("work_time")
    List<IEntity> workTime
    /**
     * 「是否手动」
     * 字典[是否]
     */
    @JsonProperty("manual")
    Integer manual
    /**
     * 「员工ID」
     */
    @JsonProperty("member_id")
    String memberId
    /**
     * 「姓名」
     */
    @JsonProperty("member_name")
    String memberName
    /**
     * 「当前规则信息」
     */
    @JsonProperty("rule_data")
    IEntity ruleData
    /**
     * 「当前班次信息」
     */
    @JsonProperty("shift_data")
    IEntity shiftData
    /**
     * 「班次类型」
     * 字典[班次类型]
     */
    @JsonProperty("schedule_type")
    String scheduleType
    /**
     * 「工号」
     */
    @JsonProperty("member_num")
    String memberNum
    /**
     * 「职位」
     */
    @JsonProperty("title")
    String title
    /**
     * 「部门名称」
     */
    @JsonProperty("dept_name")
    String deptName
    /**
     * 「部门ID」
     */
    @JsonProperty("dept_id")
    String deptId
    /**
     * 「考勤日期」
     */
    @JsonProperty("checkin_date")
    Timestamp checkinDate
    /**
     * 「手动排班类型」
     * 字典[手动排班类型]
     */
    @JsonProperty("manual_type")
    Integer manualType
    /**
     * 「主键」
     */
    @JsonProperty("rule_id")
    String ruleId
    /**
     * 「规则名称」
     */
    @JsonProperty("rule_name")
    String ruleName
    /**
     * 「是否工作日」
     * 字典[是否]
     */
    @JsonProperty("workday")
    Integer workday

    /**
     * 设置「标识」值
     * @param val
     */
    AttendanceScheduleDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AttendanceScheduleDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceScheduleDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AttendanceScheduleDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceScheduleDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceScheduleDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「班次信息」值
     * @param val
     */
    AttendanceScheduleDTO setShifts(List<AttendanceActivateShiftDTO> shifts) {
        this.shifts = shifts
        return this
    }


    /**
     * 设置「工作时段」值
     * @param val
     */
    AttendanceScheduleDTO setWorkTime(List<IEntity> workTime) {
        this.workTime = workTime
        return this
    }


    /**
     * 设置「是否手动」值
     * 字典[是否]
     * @param val
     */
    AttendanceScheduleDTO setManual(Integer manual) {
        this.manual = manual
        return this
    }


    /**
     * 设置「员工ID」值
     * @param val
     */
    AttendanceScheduleDTO setMemberId(String memberId) {
        this.memberId = memberId
        return this
    }


    /**
     * 设置「姓名」值
     * @param val
     */
    AttendanceScheduleDTO setMemberName(String memberName) {
        this.memberName = memberName
        return this
    }


    /**
     * 设置「当前规则信息」值
     * @param val
     */
    AttendanceScheduleDTO setRuleData(IEntity ruleData) {
        this.ruleData = ruleData
        return this
    }


    /**
     * 设置「当前班次信息」值
     * @param val
     */
    AttendanceScheduleDTO setShiftData(IEntity shiftData) {
        this.shiftData = shiftData
        return this
    }


    /**
     * 设置「班次类型」值
     * 字典[班次类型]
     * @param val
     */
    AttendanceScheduleDTO setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType
        return this
    }


    /**
     * 设置「工号」值
     * @param val
     */
    AttendanceScheduleDTO setMemberNum(String memberNum) {
        this.memberNum = memberNum
        return this
    }


    /**
     * 设置「职位」值
     * @param val
     */
    AttendanceScheduleDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「部门名称」值
     * @param val
     */
    AttendanceScheduleDTO setDeptName(String deptName) {
        this.deptName = deptName
        return this
    }


    /**
     * 设置「部门ID」值
     * @param val
     */
    AttendanceScheduleDTO setDeptId(String deptId) {
        this.deptId = deptId
        return this
    }


    /**
     * 设置「考勤日期」值
     * @param val
     */
    AttendanceScheduleDTO setCheckinDate(Timestamp checkinDate) {
        this.checkinDate = checkinDate
        return this
    }


    /**
     * 设置「手动排班类型」值
     * 字典[手动排班类型]
     * @param val
     */
    AttendanceScheduleDTO setManualType(Integer manualType) {
        this.manualType = manualType
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    AttendanceScheduleDTO setRuleId(String ruleId) {
        this.ruleId = ruleId
        return this
    }


    /**
     * 设置「规则名称」值
     * @param val
     */
    AttendanceScheduleDTO setRuleName(String ruleName) {
        this.ruleName = ruleName
        return this
    }


    /**
     * 设置「是否工作日」值
     * 字典[是否]
     * @param val
     */
    AttendanceScheduleDTO setWorkday(Integer workday) {
        this.workday = workday
        return this
    }

}
