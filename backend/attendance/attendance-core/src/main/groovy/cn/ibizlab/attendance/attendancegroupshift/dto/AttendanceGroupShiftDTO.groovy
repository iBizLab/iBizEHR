package cn.ibizlab.attendance.attendancegroupshift.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.attendance.attendancegroupshiftmember.dto.AttendanceGroupShiftMemberDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class AttendanceGroupShiftDTO extends GroovyDTO<AttendanceGroupShiftDTO> {

    /**
     * 「考勤人员类型」
     * 字典[考勤人员类型]
     */
    @JsonProperty("all_company")
    String allCompany
    /**
     * 「组成员」
     */
    @JsonProperty("members")
    List<AttendanceGroupShiftMemberDTO> members
    /**
     * 「工作日」
     */
    @JsonProperty("workdays")
    List<IEntity> workdays
    /**
     * 「规则类型」
     * 字典[班次类型]
     */
    @JsonProperty("schedule_type")
    String scheduleType
    /**
     * 「组数」
     */
    @JsonProperty("order_num")
    Integer orderNum
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
     * 「组名称」
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
     * 设置「考勤人员类型」值
     * 字典[考勤人员类型]
     * @param val
     */
    AttendanceGroupShiftDTO setAllCompany(String allCompany) {
        this.allCompany = allCompany
        return this
    }


    /**
     * 设置「组成员」值
     * @param val
     */
    AttendanceGroupShiftDTO setMembers(List<AttendanceGroupShiftMemberDTO> members) {
        this.members = members
        return this
    }


    /**
     * 设置「工作日」值
     * @param val
     */
    AttendanceGroupShiftDTO setWorkdays(List<IEntity> workdays) {
        this.workdays = workdays
        return this
    }


    /**
     * 设置「规则类型」值
     * 字典[班次类型]
     * @param val
     */
    AttendanceGroupShiftDTO setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType
        return this
    }


    /**
     * 设置「组数」值
     * @param val
     */
    AttendanceGroupShiftDTO setOrderNum(Integer orderNum) {
        this.orderNum = orderNum
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AttendanceGroupShiftDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceGroupShiftDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    AttendanceGroupShiftDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「组名称」值
     * @param val
     */
    AttendanceGroupShiftDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「考勤规则ID」值
     * @param val
     */
    AttendanceGroupShiftDTO setRuleId(String ruleId) {
        this.ruleId = ruleId
        return this
    }


    /**
     * 设置「考勤规则名称」值
     * @param val
     */
    AttendanceGroupShiftDTO setRuleName(String ruleName) {
        this.ruleName = ruleName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceGroupShiftDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceGroupShiftDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
