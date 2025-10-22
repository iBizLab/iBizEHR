package cn.ibizlab.attendance.attendanceactivaterule.dto

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
class AttendanceActivateRuleDTO extends GroovyDTO<AttendanceActivateRuleDTO> {

    /**
     * 「班次」
     */
    @JsonProperty("shifts")
    List<AttendanceActivateShiftDTO> shifts
    /**
     * 「班次类型」
     * 字典[班次类型]
     */
    @JsonProperty("schedule_type")
    String scheduleType
    /**
     * 「当前规则信息」
     */
    @JsonProperty("rule_data")
    IEntity ruleData
    /**
     * 「主键」
     */
    @JsonProperty("id")
    String id
    /**
     * 「规则名称」
     */
    @JsonProperty("name")
    String name

    /**
     * 设置「班次」值
     * @param val
     */
    AttendanceActivateRuleDTO setShifts(List<AttendanceActivateShiftDTO> shifts) {
        this.shifts = shifts
        return this
    }


    /**
     * 设置「班次类型」值
     * 字典[班次类型]
     * @param val
     */
    AttendanceActivateRuleDTO setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType
        return this
    }


    /**
     * 设置「当前规则信息」值
     * @param val
     */
    AttendanceActivateRuleDTO setRuleData(IEntity ruleData) {
        this.ruleData = ruleData
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    AttendanceActivateRuleDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「规则名称」值
     * @param val
     */
    AttendanceActivateRuleDTO setName(String name) {
        this.name = name
        return this
    }

}
