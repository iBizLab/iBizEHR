package cn.ibizlab.resource.resourcecalendar.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.resource.resourcecalendarattendance.dto.ResourceCalendarAttendanceDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ResourceCalendarDTO extends GroovyDTO<ResourceCalendarDTO> {

    /**
     * 「做假计数」
     */
    @JsonProperty("associated_leaves_count")
    Integer associatedLeavesCount
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「# 使用它的合同」
     */
    @JsonProperty("contracts_count")
    Integer contractsCount
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
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「灵活时间」
     * 字典[是否]
     */
    @JsonProperty("flexible_hours")
    Integer flexibleHours
    /**
     * 「公司全职」
     */
    @JsonProperty("full_time_required_hours")
    Double fullTimeRequiredHours
    /**
     * 「每天平均小时数」
     */
    @JsonProperty("hours_per_day")
    Double hoursPerDay
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
     * 「双周模式下的日历」
     * 字典[是否]
     */
    @JsonProperty("two_weeks_calendar")
    Integer twoWeeksCalendar
    /**
     * 「解释」
     */
    @JsonProperty("two_weeks_explanation")
    String twoWeeksExplanation
    /**
     * 「时区偏移」
     */
    @JsonProperty("tz_offset")
    String tzOffset
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
     * 「null」
     */
    @JsonProperty("attendances")
    List<ResourceCalendarAttendanceDTO> attendances

    /**
     * 设置「做假计数」值
     * @param val
     */
    ResourceCalendarDTO setAssociatedLeavesCount(Integer associatedLeavesCount) {
        this.associatedLeavesCount = associatedLeavesCount
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    ResourceCalendarDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「# 使用它的合同」值
     * @param val
     */
    ResourceCalendarDTO setContractsCount(Integer contractsCount) {
        this.contractsCount = contractsCount
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResourceCalendarDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResourceCalendarDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResourceCalendarDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「灵活时间」值
     * 字典[是否]
     * @param val
     */
    ResourceCalendarDTO setFlexibleHours(Integer flexibleHours) {
        this.flexibleHours = flexibleHours
        return this
    }


    /**
     * 设置「公司全职」值
     * @param val
     */
    ResourceCalendarDTO setFullTimeRequiredHours(Double fullTimeRequiredHours) {
        this.fullTimeRequiredHours = fullTimeRequiredHours
        return this
    }


    /**
     * 设置「每天平均小时数」值
     * @param val
     */
    ResourceCalendarDTO setHoursPerDay(Double hoursPerDay) {
        this.hoursPerDay = hoursPerDay
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResourceCalendarDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResourceCalendarDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「双周模式下的日历」值
     * 字典[是否]
     * @param val
     */
    ResourceCalendarDTO setTwoWeeksCalendar(Integer twoWeeksCalendar) {
        this.twoWeeksCalendar = twoWeeksCalendar
        return this
    }


    /**
     * 设置「解释」值
     * @param val
     */
    ResourceCalendarDTO setTwoWeeksExplanation(String twoWeeksExplanation) {
        this.twoWeeksExplanation = twoWeeksExplanation
        return this
    }


    /**
     * 设置「时区偏移」值
     * @param val
     */
    ResourceCalendarDTO setTzOffset(String tzOffset) {
        this.tzOffset = tzOffset
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResourceCalendarDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResourceCalendarDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    ResourceCalendarDTO setAttendances(List<ResourceCalendarAttendanceDTO> attendances) {
        this.attendances = attendances
        return this
    }

}
