package cn.ibizlab.attendance.attendanceworkday.dto

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
class AttendanceWorkdayDTO extends GroovyDTO<AttendanceWorkdayDTO> {

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
     * 「日序号」
     */
    @JsonProperty("day_number")
    Integer dayNumber
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「上下班时间」
     */
    @JsonProperty("work_time")
    String workTime
    /**
     * 「规则标识」
     */
    @JsonProperty("rule_id")
    String ruleId
    /**
     * 「班次标识」
     */
    @JsonProperty("shift_id")
    String shiftId

    /**
     * 设置「标识」值
     * @param val
     */
    AttendanceWorkdayDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AttendanceWorkdayDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceWorkdayDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AttendanceWorkdayDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceWorkdayDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceWorkdayDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「日序号」值
     * @param val
     */
    AttendanceWorkdayDTO setDayNumber(Integer dayNumber) {
        this.dayNumber = dayNumber
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    AttendanceWorkdayDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「上下班时间」值
     * @param val
     */
    AttendanceWorkdayDTO setWorkTime(String workTime) {
        this.workTime = workTime
        return this
    }


    /**
     * 设置「规则标识」值
     * @param val
     */
    AttendanceWorkdayDTO setRuleId(String ruleId) {
        this.ruleId = ruleId
        return this
    }


    /**
     * 设置「班次标识」值
     * @param val
     */
    AttendanceWorkdayDTO setShiftId(String shiftId) {
        this.shiftId = shiftId
        return this
    }

}
