package cn.ibizlab.resource.resourcecalendarattendance.dto

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
class ResourceCalendarAttendanceDTO extends GroovyDTO<ResourceCalendarAttendanceDTO> {

    /**
     * 「资源的日历」
     */
    @JsonProperty("calendar_id")
    String calendarId
    /**
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「建立人」
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「起始日期」
     */
    @JsonProperty("date_from")
    Timestamp dateFrom
    /**
     * 「结束日期」
     */
    @JsonProperty("date_to")
    Timestamp dateTo
    /**
     * 「日期」
     * 字典[日期]
     */
    @JsonProperty("day_period")
    String dayPeriod
    /**
     * 「星期」
     * 字典[星期]
     */
    @JsonProperty("dayofweek")
    String dayofweek
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「显示类型」
     * 字典[显示类型]
     */
    @JsonProperty("display_type")
    String displayType
    /**
     * 「持续时间 (天)」
     */
    @JsonProperty("duration_days")
    Double durationDays
    /**
     * 「时长 (小时)」
     */
    @JsonProperty("duration_hours")
    Double durationHours
    /**
     * 「工作起始」
     */
    @JsonProperty("hour_from")
    Double hourFrom
    /**
     * 「工作截止」
     */
    @JsonProperty("hour_to")
    Double hourTo
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
     * 「资源」
     */
    @JsonProperty("resource_id")
    String resourceId
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「周数」
     * 字典[周数]
     */
    @JsonProperty("week_type")
    String weekType
    /**
     * 「更新时间」
     */
    @JsonProperty("write_date")
    Timestamp writeDate
    /**
     * 「更新人」
     */
    @JsonProperty("write_uid")
    String writeUid

    /**
     * 设置「资源的日历」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setCalendarId(String calendarId) {
        this.calendarId = calendarId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「起始日期」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setDateFrom(Timestamp dateFrom) {
        this.dateFrom = dateFrom
        return this
    }


    /**
     * 设置「结束日期」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setDateTo(Timestamp dateTo) {
        this.dateTo = dateTo
        return this
    }


    /**
     * 设置「日期」值
     * 字典[日期]
     * @param val
     */
    ResourceCalendarAttendanceDTO setDayPeriod(String dayPeriod) {
        this.dayPeriod = dayPeriod
        return this
    }


    /**
     * 设置「星期」值
     * 字典[星期]
     * @param val
     */
    ResourceCalendarAttendanceDTO setDayofweek(String dayofweek) {
        this.dayofweek = dayofweek
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「显示类型」值
     * 字典[显示类型]
     * @param val
     */
    ResourceCalendarAttendanceDTO setDisplayType(String displayType) {
        this.displayType = displayType
        return this
    }


    /**
     * 设置「持续时间 (天)」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setDurationDays(Double durationDays) {
        this.durationDays = durationDays
        return this
    }


    /**
     * 设置「时长 (小时)」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setDurationHours(Double durationHours) {
        this.durationHours = durationHours
        return this
    }


    /**
     * 设置「工作起始」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setHourFrom(Double hourFrom) {
        this.hourFrom = hourFrom
        return this
    }


    /**
     * 设置「工作截止」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setHourTo(Double hourTo) {
        this.hourTo = hourTo
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「资源」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setResourceId(String resourceId) {
        this.resourceId = resourceId
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「周数」值
     * 字典[周数]
     * @param val
     */
    ResourceCalendarAttendanceDTO setWeekType(String weekType) {
        this.weekType = weekType
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    ResourceCalendarAttendanceDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
