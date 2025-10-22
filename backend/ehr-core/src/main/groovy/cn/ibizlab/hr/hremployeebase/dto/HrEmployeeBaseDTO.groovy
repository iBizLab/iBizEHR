package cn.ibizlab.hr.hremployeebase.dto

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
class HrEmployeeBaseDTO extends GroovyDTO<HrEmployeeBaseDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「工作地址」
     */
    @JsonProperty("address_id")
    String addressId
    /**
     * 「分配的总天数。」
     */
    @JsonProperty("allocation_count")
    Double allocationCount
    /**
     * 「分配显示」
     */
    @JsonProperty("allocation_display")
    String allocationDisplay
    /**
     * 「剩余的分配显示」
     */
    @JsonProperty("allocation_remaining_display")
    String allocationRemainingDisplay
    /**
     * 「分配总数量」
     */
    @JsonProperty("allocations_count")
    Integer allocationsCount
    /**
     * 「间接下属统计」
     */
    @JsonProperty("child_all_count")
    Integer childAllCount
    /**
     * 「直接下属人数」
     */
    @JsonProperty("child_count")
    Integer childCount
    /**
     * 「教练」
     */
    @JsonProperty("coach_id")
    String coachId
    /**
     * 「颜色指标」
     */
    @JsonProperty("color")
    Integer color
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「当前休假状态」
     * 字典[当前休假状态]
     */
    @JsonProperty("current_leave_state")
    String currentLeaveState
    /**
     * 「部门」
     */
    @JsonProperty("department_id")
    String departmentId
    /**
     * 「费用筛选」
     * 字典[是否]
     */
    @JsonProperty("filter_for_expense")
    Integer filterForExpense
    /**
     * 「有徽章」
     * 字典[是否]
     */
    @JsonProperty("has_badges")
    Integer hasBadges
    /**
     * 「人力资源显示的图标」
     * 字典[人力资源显示的图标]
     */
    @JsonProperty("hr_icon_display")
    String hrIconDisplay
    /**
     * 「人力资源出席状态」
     * 字典[人力资源出席状态]
     */
    @JsonProperty("hr_presence_state")
    String hrPresenceState
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「今日缺勤」
     * 字典[是否]
     */
    @JsonProperty("is_absent")
    Integer isAbsent
    /**
     * 「灵活可变」
     * 字典[是否]
     */
    @JsonProperty("is_flexible")
    Integer isFlexible
    /**
     * 「完全灵活」
     * 字典[是否]
     */
    @JsonProperty("is_fully_flexible")
    Integer isFullyFlexible
    /**
     * 「工作岗位」
     */
    @JsonProperty("job_id")
    String jobId
    /**
     * 「工作头衔」
     */
    @JsonProperty("job_title")
    String jobTitle
    /**
     * 「上个活动」
     */
    @JsonProperty("last_activity")
    Timestamp lastActivity
    /**
     * 「上个活动时间」
     */
    @JsonProperty("last_activity_time")
    String lastActivityTime
    /**
     * 「起始日期」
     */
    @JsonProperty("leave_date_from")
    Timestamp leaveDateFrom
    /**
     * 「至日期」
     */
    @JsonProperty("leave_date_to")
    Timestamp leaveDateTo
    /**
     * 「休假」
     */
    @JsonProperty("leave_manager_id")
    String leaveManagerId
    /**
     * 「休假次数」
     */
    @JsonProperty("leaves_count")
    Double leavesCount
    /**
     * 「部门数量」
     * 字典[是否]
     */
    @JsonProperty("member_of_department")
    Integer memberOfDepartment
    /**
     * 「办公手机」
     */
    @JsonProperty("mobile_phone")
    String mobilePhone
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「最近聘用的」
     * 字典[是否]
     */
    @JsonProperty("newly_hired")
    Integer newlyHired
    /**
     * 「管理员」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「可用休假天数」
     */
    @JsonProperty("remaining_leaves")
    Double remainingLeaves
    /**
     * 「资源日历」
     */
    @JsonProperty("resource_calendar_id")
    String resourceCalendarId
    /**
     * 「资源」
     */
    @JsonProperty("resource_id")
    String resourceId
    /**
     * 「显示HR图标」
     * 字典[是否]
     */
    @JsonProperty("show_hr_icon_display")
    Integer showHrIconDisplay
    /**
     * 「能够查看到剩余休假」
     * 字典[是否]
     */
    @JsonProperty("show_leaves")
    Integer showLeaves
    /**
     * 「用户」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「工作联系人」
     */
    @JsonProperty("work_contact_id")
    String workContactId
    /**
     * 「工作电子邮件」
     */
    @JsonProperty("work_email")
    String workEmail
    /**
     * 「工作地点」
     */
    @JsonProperty("work_location_id")
    String workLocationId
    /**
     * 「工作位置名称」
     */
    @JsonProperty("work_location_name")
    String workLocationName
    /**
     * 「工作位置类型」
     * 字典[工作位置类型]
     */
    @JsonProperty("work_location_type")
    String workLocationType
    /**
     * 「办公电话」
     */
    @JsonProperty("work_phone")
    String workPhone

    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeBaseDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「工作地址」值
     * @param val
     */
    HrEmployeeBaseDTO setAddressId(String addressId) {
        this.addressId = addressId
        return this
    }


    /**
     * 设置「分配的总天数。」值
     * @param val
     */
    HrEmployeeBaseDTO setAllocationCount(Double allocationCount) {
        this.allocationCount = allocationCount
        return this
    }


    /**
     * 设置「分配显示」值
     * @param val
     */
    HrEmployeeBaseDTO setAllocationDisplay(String allocationDisplay) {
        this.allocationDisplay = allocationDisplay
        return this
    }


    /**
     * 设置「剩余的分配显示」值
     * @param val
     */
    HrEmployeeBaseDTO setAllocationRemainingDisplay(String allocationRemainingDisplay) {
        this.allocationRemainingDisplay = allocationRemainingDisplay
        return this
    }


    /**
     * 设置「分配总数量」值
     * @param val
     */
    HrEmployeeBaseDTO setAllocationsCount(Integer allocationsCount) {
        this.allocationsCount = allocationsCount
        return this
    }


    /**
     * 设置「间接下属统计」值
     * @param val
     */
    HrEmployeeBaseDTO setChildAllCount(Integer childAllCount) {
        this.childAllCount = childAllCount
        return this
    }


    /**
     * 设置「直接下属人数」值
     * @param val
     */
    HrEmployeeBaseDTO setChildCount(Integer childCount) {
        this.childCount = childCount
        return this
    }


    /**
     * 设置「教练」值
     * @param val
     */
    HrEmployeeBaseDTO setCoachId(String coachId) {
        this.coachId = coachId
        return this
    }


    /**
     * 设置「颜色指标」值
     * @param val
     */
    HrEmployeeBaseDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrEmployeeBaseDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「当前休假状态」值
     * 字典[当前休假状态]
     * @param val
     */
    HrEmployeeBaseDTO setCurrentLeaveState(String currentLeaveState) {
        this.currentLeaveState = currentLeaveState
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrEmployeeBaseDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「费用筛选」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeBaseDTO setFilterForExpense(Integer filterForExpense) {
        this.filterForExpense = filterForExpense
        return this
    }


    /**
     * 设置「有徽章」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeBaseDTO setHasBadges(Integer hasBadges) {
        this.hasBadges = hasBadges
        return this
    }


    /**
     * 设置「人力资源显示的图标」值
     * 字典[人力资源显示的图标]
     * @param val
     */
    HrEmployeeBaseDTO setHrIconDisplay(String hrIconDisplay) {
        this.hrIconDisplay = hrIconDisplay
        return this
    }


    /**
     * 设置「人力资源出席状态」值
     * 字典[人力资源出席状态]
     * @param val
     */
    HrEmployeeBaseDTO setHrPresenceState(String hrPresenceState) {
        this.hrPresenceState = hrPresenceState
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrEmployeeBaseDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「今日缺勤」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeBaseDTO setIsAbsent(Integer isAbsent) {
        this.isAbsent = isAbsent
        return this
    }


    /**
     * 设置「灵活可变」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeBaseDTO setIsFlexible(Integer isFlexible) {
        this.isFlexible = isFlexible
        return this
    }


    /**
     * 设置「完全灵活」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeBaseDTO setIsFullyFlexible(Integer isFullyFlexible) {
        this.isFullyFlexible = isFullyFlexible
        return this
    }


    /**
     * 设置「工作岗位」值
     * @param val
     */
    HrEmployeeBaseDTO setJobId(String jobId) {
        this.jobId = jobId
        return this
    }


    /**
     * 设置「工作头衔」值
     * @param val
     */
    HrEmployeeBaseDTO setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle
        return this
    }


    /**
     * 设置「上个活动」值
     * @param val
     */
    HrEmployeeBaseDTO setLastActivity(Timestamp lastActivity) {
        this.lastActivity = lastActivity
        return this
    }


    /**
     * 设置「上个活动时间」值
     * @param val
     */
    HrEmployeeBaseDTO setLastActivityTime(String lastActivityTime) {
        this.lastActivityTime = lastActivityTime
        return this
    }


    /**
     * 设置「起始日期」值
     * @param val
     */
    HrEmployeeBaseDTO setLeaveDateFrom(Timestamp leaveDateFrom) {
        this.leaveDateFrom = leaveDateFrom
        return this
    }


    /**
     * 设置「至日期」值
     * @param val
     */
    HrEmployeeBaseDTO setLeaveDateTo(Timestamp leaveDateTo) {
        this.leaveDateTo = leaveDateTo
        return this
    }


    /**
     * 设置「休假」值
     * @param val
     */
    HrEmployeeBaseDTO setLeaveManagerId(String leaveManagerId) {
        this.leaveManagerId = leaveManagerId
        return this
    }


    /**
     * 设置「休假次数」值
     * @param val
     */
    HrEmployeeBaseDTO setLeavesCount(Double leavesCount) {
        this.leavesCount = leavesCount
        return this
    }


    /**
     * 设置「部门数量」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeBaseDTO setMemberOfDepartment(Integer memberOfDepartment) {
        this.memberOfDepartment = memberOfDepartment
        return this
    }


    /**
     * 设置「办公手机」值
     * @param val
     */
    HrEmployeeBaseDTO setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrEmployeeBaseDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「最近聘用的」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeBaseDTO setNewlyHired(Integer newlyHired) {
        this.newlyHired = newlyHired
        return this
    }


    /**
     * 设置「管理员」值
     * @param val
     */
    HrEmployeeBaseDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「可用休假天数」值
     * @param val
     */
    HrEmployeeBaseDTO setRemainingLeaves(Double remainingLeaves) {
        this.remainingLeaves = remainingLeaves
        return this
    }


    /**
     * 设置「资源日历」值
     * @param val
     */
    HrEmployeeBaseDTO setResourceCalendarId(String resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId
        return this
    }


    /**
     * 设置「资源」值
     * @param val
     */
    HrEmployeeBaseDTO setResourceId(String resourceId) {
        this.resourceId = resourceId
        return this
    }


    /**
     * 设置「显示HR图标」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeBaseDTO setShowHrIconDisplay(Integer showHrIconDisplay) {
        this.showHrIconDisplay = showHrIconDisplay
        return this
    }


    /**
     * 设置「能够查看到剩余休假」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeBaseDTO setShowLeaves(Integer showLeaves) {
        this.showLeaves = showLeaves
        return this
    }


    /**
     * 设置「用户」值
     * @param val
     */
    HrEmployeeBaseDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「工作联系人」值
     * @param val
     */
    HrEmployeeBaseDTO setWorkContactId(String workContactId) {
        this.workContactId = workContactId
        return this
    }


    /**
     * 设置「工作电子邮件」值
     * @param val
     */
    HrEmployeeBaseDTO setWorkEmail(String workEmail) {
        this.workEmail = workEmail
        return this
    }


    /**
     * 设置「工作地点」值
     * @param val
     */
    HrEmployeeBaseDTO setWorkLocationId(String workLocationId) {
        this.workLocationId = workLocationId
        return this
    }


    /**
     * 设置「工作位置名称」值
     * @param val
     */
    HrEmployeeBaseDTO setWorkLocationName(String workLocationName) {
        this.workLocationName = workLocationName
        return this
    }


    /**
     * 设置「工作位置类型」值
     * 字典[工作位置类型]
     * @param val
     */
    HrEmployeeBaseDTO setWorkLocationType(String workLocationType) {
        this.workLocationType = workLocationType
        return this
    }


    /**
     * 设置「办公电话」值
     * @param val
     */
    HrEmployeeBaseDTO setWorkPhone(String workPhone) {
        this.workPhone = workPhone
        return this
    }

}
