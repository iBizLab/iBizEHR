package cn.ibizlab.attendance.attendanceleavetype.dto

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
class AttendanceLeaveTypeDTO extends GroovyDTO<AttendanceLeaveTypeDTO> {

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
     * 「假期余额换算」
     */
    @JsonProperty("day_to_hour")
    Double dayToHour
    /**
     * 「申请限制周期」
     * 字典[申请限制周期]
     */
    @JsonProperty("period_from")
    String periodFrom
    /**
     * 「天数/申请限制周期」
     */
    @JsonProperty("period_to")
    Integer periodTo
    /**
     * 「适用部门ID」
     */
    @JsonProperty("dept_id")
    Integer deptId
    /**
     * 「全公司适用」
     * 字典[假期适用范围]
     */
    @JsonProperty("all_company")
    String allCompany
    /**
     * 「申请单位」
     * 字典[申请单位类型]
     */
    @JsonProperty("ask_unit")
    String askUnit
    /**
     * 「计算方式」
     * 字典[假期计算方式]
     */
    @JsonProperty("calculate_way")
    String calculateWay
    /**
     * 「主键」
     */
    @JsonProperty("id")
    String id
    /**
     * 「是否默认」
     * 字典[是否]
     */
    @JsonProperty("is_default")
    Integer isDefault
    /**
     * 「是否限制最大申请天数」
     * 字典[是否]
     */
    @JsonProperty("max_apply_day")
    Integer maxApplyDay
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「状态」
     * 字典[假期状态]
     */
    @JsonProperty("status")
    Integer status
    /**
     * 「类型标识」
     * 字典[假期类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「单位」
     */
    @JsonProperty("unit")
    String unit
    /**
     * 「是否带薪」
     * 字典[带薪状态]
     */
    @JsonProperty("with_salary")
    Integer withSalary

    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceLeaveTypeDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AttendanceLeaveTypeDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceLeaveTypeDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceLeaveTypeDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「假期余额换算」值
     * @param val
     */
    AttendanceLeaveTypeDTO setDayToHour(Double dayToHour) {
        this.dayToHour = dayToHour
        return this
    }


    /**
     * 设置「申请限制周期」值
     * 字典[申请限制周期]
     * @param val
     */
    AttendanceLeaveTypeDTO setPeriodFrom(String periodFrom) {
        this.periodFrom = periodFrom
        return this
    }


    /**
     * 设置「天数/申请限制周期」值
     * @param val
     */
    AttendanceLeaveTypeDTO setPeriodTo(Integer periodTo) {
        this.periodTo = periodTo
        return this
    }


    /**
     * 设置「适用部门ID」值
     * @param val
     */
    AttendanceLeaveTypeDTO setDeptId(Integer deptId) {
        this.deptId = deptId
        return this
    }


    /**
     * 设置「全公司适用」值
     * 字典[假期适用范围]
     * @param val
     */
    AttendanceLeaveTypeDTO setAllCompany(String allCompany) {
        this.allCompany = allCompany
        return this
    }


    /**
     * 设置「申请单位」值
     * 字典[申请单位类型]
     * @param val
     */
    AttendanceLeaveTypeDTO setAskUnit(String askUnit) {
        this.askUnit = askUnit
        return this
    }


    /**
     * 设置「计算方式」值
     * 字典[假期计算方式]
     * @param val
     */
    AttendanceLeaveTypeDTO setCalculateWay(String calculateWay) {
        this.calculateWay = calculateWay
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    AttendanceLeaveTypeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「是否默认」值
     * 字典[是否]
     * @param val
     */
    AttendanceLeaveTypeDTO setIsDefault(Integer isDefault) {
        this.isDefault = isDefault
        return this
    }


    /**
     * 设置「是否限制最大申请天数」值
     * 字典[是否]
     * @param val
     */
    AttendanceLeaveTypeDTO setMaxApplyDay(Integer maxApplyDay) {
        this.maxApplyDay = maxApplyDay
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AttendanceLeaveTypeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「状态」值
     * 字典[假期状态]
     * @param val
     */
    AttendanceLeaveTypeDTO setStatus(Integer status) {
        this.status = status
        return this
    }


    /**
     * 设置「类型标识」值
     * 字典[假期类型]
     * @param val
     */
    AttendanceLeaveTypeDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「单位」值
     * @param val
     */
    AttendanceLeaveTypeDTO setUnit(String unit) {
        this.unit = unit
        return this
    }


    /**
     * 设置「是否带薪」值
     * 字典[带薪状态]
     * @param val
     */
    AttendanceLeaveTypeDTO setWithSalary(Integer withSalary) {
        this.withSalary = withSalary
        return this
    }

}
