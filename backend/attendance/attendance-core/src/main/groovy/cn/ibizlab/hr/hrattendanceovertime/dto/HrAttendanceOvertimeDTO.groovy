package cn.ibizlab.hr.hrattendanceovertime.dto

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
class HrAttendanceOvertimeDTO extends GroovyDTO<HrAttendanceOvertimeDTO> {

    /**
     * 「调整」
     * 字典[是否]
     */
    @JsonProperty("adjustment")
    Integer adjustment
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
     * 「天」
     */
    @JsonProperty("date")
    Timestamp date
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「加班时间」
     */
    @JsonProperty("duration")
    Double duration
    /**
     * 「加班时间（真实）」
     */
    @JsonProperty("duration_real")
    Double durationReal
    /**
     * 「员工」
     */
    @JsonProperty("employee_id")
    String employeeId
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
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
     * 设置「调整」值
     * 字典[是否]
     * @param val
     */
    HrAttendanceOvertimeDTO setAdjustment(Integer adjustment) {
        this.adjustment = adjustment
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrAttendanceOvertimeDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrAttendanceOvertimeDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「天」值
     * @param val
     */
    HrAttendanceOvertimeDTO setDate(Timestamp date) {
        this.date = date
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrAttendanceOvertimeDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「加班时间」值
     * @param val
     */
    HrAttendanceOvertimeDTO setDuration(Double duration) {
        this.duration = duration
        return this
    }


    /**
     * 设置「加班时间（真实）」值
     * @param val
     */
    HrAttendanceOvertimeDTO setDurationReal(Double durationReal) {
        this.durationReal = durationReal
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrAttendanceOvertimeDTO setEmployeeId(String employeeId) {
        this.employeeId = employeeId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrAttendanceOvertimeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrAttendanceOvertimeDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrAttendanceOvertimeDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
