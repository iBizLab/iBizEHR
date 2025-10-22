package cn.ibizlab.hr.hrleavetype.dto

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
class HrLeaveTypeDTO extends GroovyDTO<HrLeaveTypeDTO> {

    /**
     * 「应计数量」
     */
    @JsonProperty("accrual_count")
    Double accrualCount
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「分配」
     */
    @JsonProperty("allocation_count")
    Integer allocationCount
    /**
     * 「分配通知子类型」
     */
    @JsonProperty("allocation_notif_subtype_id")
    String allocationNotifSubtypeId
    /**
     * 「审批」
     * 字典[审批]
     */
    @JsonProperty("allocation_validation_type")
    String allocationValidationType
    /**
     * 「允许负上限」
     * 字典[是否]
     */
    @JsonProperty("allows_negative")
    Integer allowsNegative
    /**
     * 「颜色」
     */
    @JsonProperty("color")
    Integer color
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「在日历中显示休假」
     * 字典[是否]
     */
    @JsonProperty("create_calendar_meeting")
    Integer createCalendarMeeting
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
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「员工要求」
     * 字典[员工要求]
     */
    @JsonProperty("employee_requests")
    String employeeRequests
    /**
     * 「休假分组」
     */
    @JsonProperty("group_days_leave")
    Double groupDaysLeave
    /**
     * 「拥有有效的分配」
     * 字典[是否]
     */
    @JsonProperty("has_valid_allocation")
    Integer hasValidAllocation
    /**
     * 「封面图片」
     */
    @JsonProperty("icon_id")
    String iconId
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「包括公众假期」
     * 字典[是否]
     */
    @JsonProperty("include_public_holidays_in_duration")
    Integer includePublicHolidaysInDuration
    /**
     * 「休假通知子类型」
     */
    @JsonProperty("leave_notif_subtype_id")
    String leaveNotifSubtypeId
    /**
     * 「休假验证」
     * 字典[休假验证]
     */
    @JsonProperty("leave_validation_type")
    String leaveValidationType
    /**
     * 「已休假」
     */
    @JsonProperty("leaves_taken")
    Double leavesTaken
    /**
     * 「最大超量」
     */
    @JsonProperty("max_allowed_negative")
    Integer maxAllowedNegative
    /**
     * 「最大允许」
     */
    @JsonProperty("max_leaves")
    Double maxLeaves
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「调休申请」
     * 字典[是否]
     */
    @JsonProperty("overtime_deductible")
    Integer overtimeDeductible
    /**
     * 「休假最小单位」
     * 字典[休假最小单位]
     */
    @JsonProperty("request_unit")
    String requestUnit
    /**
     * 「需要分配」
     * 字典[需要分配]
     */
    @JsonProperty("requires_allocation")
    String requiresAllocation
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「在仪表板显示」
     * 字典[是否]
     */
    @JsonProperty("show_on_dashboard")
    Integer showOnDashboard
    /**
     * 「支持性文件」
     * 字典[是否]
     */
    @JsonProperty("support_document")
    Integer supportDocument
    /**
     * 「休假种类」
     * 字典[休假种类]
     */
    @JsonProperty("time_type")
    String timeType
    /**
     * 「没付款」
     * 字典[是否]
     */
    @JsonProperty("unpaid")
    Integer unpaid
    /**
     * 「有效的剩余休假」
     */
    @JsonProperty("virtual_remaining_leaves")
    Double virtualRemainingLeaves
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
     * 设置「应计数量」值
     * @param val
     */
    HrLeaveTypeDTO setAccrualCount(Double accrualCount) {
        this.accrualCount = accrualCount
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    HrLeaveTypeDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「分配」值
     * @param val
     */
    HrLeaveTypeDTO setAllocationCount(Integer allocationCount) {
        this.allocationCount = allocationCount
        return this
    }


    /**
     * 设置「分配通知子类型」值
     * @param val
     */
    HrLeaveTypeDTO setAllocationNotifSubtypeId(String allocationNotifSubtypeId) {
        this.allocationNotifSubtypeId = allocationNotifSubtypeId
        return this
    }


    /**
     * 设置「审批」值
     * 字典[审批]
     * @param val
     */
    HrLeaveTypeDTO setAllocationValidationType(String allocationValidationType) {
        this.allocationValidationType = allocationValidationType
        return this
    }


    /**
     * 设置「允许负上限」值
     * 字典[是否]
     * @param val
     */
    HrLeaveTypeDTO setAllowsNegative(Integer allowsNegative) {
        this.allowsNegative = allowsNegative
        return this
    }


    /**
     * 设置「颜色」值
     * @param val
     */
    HrLeaveTypeDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrLeaveTypeDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「在日历中显示休假」值
     * 字典[是否]
     * @param val
     */
    HrLeaveTypeDTO setCreateCalendarMeeting(Integer createCalendarMeeting) {
        this.createCalendarMeeting = createCalendarMeeting
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrLeaveTypeDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrLeaveTypeDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrLeaveTypeDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「员工要求」值
     * 字典[员工要求]
     * @param val
     */
    HrLeaveTypeDTO setEmployeeRequests(String employeeRequests) {
        this.employeeRequests = employeeRequests
        return this
    }


    /**
     * 设置「休假分组」值
     * @param val
     */
    HrLeaveTypeDTO setGroupDaysLeave(Double groupDaysLeave) {
        this.groupDaysLeave = groupDaysLeave
        return this
    }


    /**
     * 设置「拥有有效的分配」值
     * 字典[是否]
     * @param val
     */
    HrLeaveTypeDTO setHasValidAllocation(Integer hasValidAllocation) {
        this.hasValidAllocation = hasValidAllocation
        return this
    }


    /**
     * 设置「封面图片」值
     * @param val
     */
    HrLeaveTypeDTO setIconId(String iconId) {
        this.iconId = iconId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrLeaveTypeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「包括公众假期」值
     * 字典[是否]
     * @param val
     */
    HrLeaveTypeDTO setIncludePublicHolidaysInDuration(Integer includePublicHolidaysInDuration) {
        this.includePublicHolidaysInDuration = includePublicHolidaysInDuration
        return this
    }


    /**
     * 设置「休假通知子类型」值
     * @param val
     */
    HrLeaveTypeDTO setLeaveNotifSubtypeId(String leaveNotifSubtypeId) {
        this.leaveNotifSubtypeId = leaveNotifSubtypeId
        return this
    }


    /**
     * 设置「休假验证」值
     * 字典[休假验证]
     * @param val
     */
    HrLeaveTypeDTO setLeaveValidationType(String leaveValidationType) {
        this.leaveValidationType = leaveValidationType
        return this
    }


    /**
     * 设置「已休假」值
     * @param val
     */
    HrLeaveTypeDTO setLeavesTaken(Double leavesTaken) {
        this.leavesTaken = leavesTaken
        return this
    }


    /**
     * 设置「最大超量」值
     * @param val
     */
    HrLeaveTypeDTO setMaxAllowedNegative(Integer maxAllowedNegative) {
        this.maxAllowedNegative = maxAllowedNegative
        return this
    }


    /**
     * 设置「最大允许」值
     * @param val
     */
    HrLeaveTypeDTO setMaxLeaves(Double maxLeaves) {
        this.maxLeaves = maxLeaves
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrLeaveTypeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「调休申请」值
     * 字典[是否]
     * @param val
     */
    HrLeaveTypeDTO setOvertimeDeductible(Integer overtimeDeductible) {
        this.overtimeDeductible = overtimeDeductible
        return this
    }


    /**
     * 设置「休假最小单位」值
     * 字典[休假最小单位]
     * @param val
     */
    HrLeaveTypeDTO setRequestUnit(String requestUnit) {
        this.requestUnit = requestUnit
        return this
    }


    /**
     * 设置「需要分配」值
     * 字典[需要分配]
     * @param val
     */
    HrLeaveTypeDTO setRequiresAllocation(String requiresAllocation) {
        this.requiresAllocation = requiresAllocation
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    HrLeaveTypeDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「在仪表板显示」值
     * 字典[是否]
     * @param val
     */
    HrLeaveTypeDTO setShowOnDashboard(Integer showOnDashboard) {
        this.showOnDashboard = showOnDashboard
        return this
    }


    /**
     * 设置「支持性文件」值
     * 字典[是否]
     * @param val
     */
    HrLeaveTypeDTO setSupportDocument(Integer supportDocument) {
        this.supportDocument = supportDocument
        return this
    }


    /**
     * 设置「休假种类」值
     * 字典[休假种类]
     * @param val
     */
    HrLeaveTypeDTO setTimeType(String timeType) {
        this.timeType = timeType
        return this
    }


    /**
     * 设置「没付款」值
     * 字典[是否]
     * @param val
     */
    HrLeaveTypeDTO setUnpaid(Integer unpaid) {
        this.unpaid = unpaid
        return this
    }


    /**
     * 设置「有效的剩余休假」值
     * @param val
     */
    HrLeaveTypeDTO setVirtualRemainingLeaves(Double virtualRemainingLeaves) {
        this.virtualRemainingLeaves = virtualRemainingLeaves
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrLeaveTypeDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrLeaveTypeDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
