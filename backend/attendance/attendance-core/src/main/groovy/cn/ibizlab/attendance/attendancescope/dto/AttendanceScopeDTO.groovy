package cn.ibizlab.attendance.attendancescope.dto

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
class AttendanceScopeDTO extends GroovyDTO<AttendanceScopeDTO> {

    /**
     * 「缺勤判定阈值」
     */
    @JsonProperty("early_for_absenteeism")
    Integer earlyForAbsenteeism
    /**
     * 「早退判定阈值」
     */
    @JsonProperty("early_for_early")
    Integer earlyForEarly
    /**
     * 「最晚打卡时间」
     */
    @JsonProperty("latest_checkout")
    Integer latestCheckout
    /**
     * 「次日标记」
     */
    @JsonProperty("next_tag")
    String nextTag
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
     * 「最早打卡时间」
     */
    @JsonProperty("earliest_checkin")
    Integer earliestCheckin
    /**
     * 「结束基准时间（分钟）」
     */
    @JsonProperty("end_base_time")
    Timestamp endBaseTime
    /**
     * 「主键」
     */
    @JsonProperty("id")
    String id
    /**
     * 「缺勤判定阈值」
     */
    @JsonProperty("late_for_absenteeism")
    Integer lateForAbsenteeism
    /**
     * 「迟到判定阈值」
     */
    @JsonProperty("late_for_late")
    Integer lateForLate
    /**
     * 「范围名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「班次ID」
     */
    @JsonProperty("shift_id")
    String shiftId
    /**
     * 「班次名称」
     */
    @JsonProperty("shift_name")
    String shiftName
    /**
     * 「开始基准时间（分钟）」
     */
    @JsonProperty("start_base_time")
    Timestamp startBaseTime
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
     * 设置「缺勤判定阈值」值
     * @param val
     */
    AttendanceScopeDTO setEarlyForAbsenteeism(Integer earlyForAbsenteeism) {
        this.earlyForAbsenteeism = earlyForAbsenteeism
        return this
    }


    /**
     * 设置「早退判定阈值」值
     * @param val
     */
    AttendanceScopeDTO setEarlyForEarly(Integer earlyForEarly) {
        this.earlyForEarly = earlyForEarly
        return this
    }


    /**
     * 设置「最晚打卡时间」值
     * @param val
     */
    AttendanceScopeDTO setLatestCheckout(Integer latestCheckout) {
        this.latestCheckout = latestCheckout
        return this
    }


    /**
     * 设置「次日标记」值
     * @param val
     */
    AttendanceScopeDTO setNextTag(String nextTag) {
        this.nextTag = nextTag
        return this
    }


    /**
     * 设置「排序值」值
     * @param val
     */
    AttendanceScopeDTO setOrderValue(Integer orderValue) {
        this.orderValue = orderValue
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AttendanceScopeDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceScopeDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「最早打卡时间」值
     * @param val
     */
    AttendanceScopeDTO setEarliestCheckin(Integer earliestCheckin) {
        this.earliestCheckin = earliestCheckin
        return this
    }


    /**
     * 设置「结束基准时间（分钟）」值
     * @param val
     */
    AttendanceScopeDTO setEndBaseTime(Timestamp endBaseTime) {
        this.endBaseTime = endBaseTime
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    AttendanceScopeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「缺勤判定阈值」值
     * @param val
     */
    AttendanceScopeDTO setLateForAbsenteeism(Integer lateForAbsenteeism) {
        this.lateForAbsenteeism = lateForAbsenteeism
        return this
    }


    /**
     * 设置「迟到判定阈值」值
     * @param val
     */
    AttendanceScopeDTO setLateForLate(Integer lateForLate) {
        this.lateForLate = lateForLate
        return this
    }


    /**
     * 设置「范围名称」值
     * @param val
     */
    AttendanceScopeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「班次ID」值
     * @param val
     */
    AttendanceScopeDTO setShiftId(String shiftId) {
        this.shiftId = shiftId
        return this
    }


    /**
     * 设置「班次名称」值
     * @param val
     */
    AttendanceScopeDTO setShiftName(String shiftName) {
        this.shiftName = shiftName
        return this
    }


    /**
     * 设置「开始基准时间（分钟）」值
     * @param val
     */
    AttendanceScopeDTO setStartBaseTime(Timestamp startBaseTime) {
        this.startBaseTime = startBaseTime
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceScopeDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceScopeDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
