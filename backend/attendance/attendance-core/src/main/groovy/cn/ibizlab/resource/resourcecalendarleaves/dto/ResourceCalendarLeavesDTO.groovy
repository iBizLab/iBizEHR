package cn.ibizlab.resource.resourcecalendarleaves.dto

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
class ResourceCalendarLeavesDTO extends GroovyDTO<ResourceCalendarLeavesDTO> {

    /**
     * 「节假日类型」
     * 字典[节假日]
     */
    @JsonProperty("holiday_type")
    String holidayType
    /**
     * 「工作时间」
     */
    @JsonProperty("calendar_id")
    String calendarId
    /**
     * 「工作时间名称」
     */
    @JsonProperty("calendar_name")
    String calendarName
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
     * 「开始日期」
     */
    @JsonProperty("date_from")
    Timestamp dateFrom
    /**
     * 「结束日期」
     */
    @JsonProperty("date_to")
    Timestamp dateTo
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「休假要求」
     */
    @JsonProperty("holiday_id")
    String holidayId
    /**
     * 「休假要求」
     */
    @JsonProperty("holnameay_name")
    String holnameayName
    /**
     * 「主键」
     */
    @JsonProperty("id")
    String id
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「时间类型」
     * 字典[时间类型]
     */
    @JsonProperty("time_type")
    String timeType
    /**
     * 「主键」
     */
    @JsonProperty("type_id")
    String typeId
    /**
     * 「名称」
     */
    @JsonProperty("type_name")
    String typeName
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
     * 设置「节假日类型」值
     * 字典[节假日]
     * @param val
     */
    ResourceCalendarLeavesDTO setHolidayType(String holidayType) {
        this.holidayType = holidayType
        return this
    }


    /**
     * 设置「工作时间」值
     * @param val
     */
    ResourceCalendarLeavesDTO setCalendarId(String calendarId) {
        this.calendarId = calendarId
        return this
    }


    /**
     * 设置「工作时间名称」值
     * @param val
     */
    ResourceCalendarLeavesDTO setCalendarName(String calendarName) {
        this.calendarName = calendarName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResourceCalendarLeavesDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResourceCalendarLeavesDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「开始日期」值
     * @param val
     */
    ResourceCalendarLeavesDTO setDateFrom(Timestamp dateFrom) {
        this.dateFrom = dateFrom
        return this
    }


    /**
     * 设置「结束日期」值
     * @param val
     */
    ResourceCalendarLeavesDTO setDateTo(Timestamp dateTo) {
        this.dateTo = dateTo
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResourceCalendarLeavesDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「休假要求」值
     * @param val
     */
    ResourceCalendarLeavesDTO setHolidayId(String holidayId) {
        this.holidayId = holidayId
        return this
    }


    /**
     * 设置「休假要求」值
     * @param val
     */
    ResourceCalendarLeavesDTO setHolnameayName(String holnameayName) {
        this.holnameayName = holnameayName
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    ResourceCalendarLeavesDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResourceCalendarLeavesDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「时间类型」值
     * 字典[时间类型]
     * @param val
     */
    ResourceCalendarLeavesDTO setTimeType(String timeType) {
        this.timeType = timeType
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    ResourceCalendarLeavesDTO setTypeId(String typeId) {
        this.typeId = typeId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResourceCalendarLeavesDTO setTypeName(String typeName) {
        this.typeName = typeName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResourceCalendarLeavesDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResourceCalendarLeavesDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
