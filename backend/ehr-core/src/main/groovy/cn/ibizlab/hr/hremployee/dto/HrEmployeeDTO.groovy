package cn.ibizlab.hr.hremployee.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.mail.mailactivity.dto.MailActivityDTO
import cn.ibizlab.base.irattachment.dto.IrAttachmentDTO
import cn.ibizlab.mail.mailfollowers.dto.MailFollowersDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class HrEmployeeDTO extends GroovyDTO<HrEmployeeDTO> {

    /**
     * 「活动集合」
     */
    @JsonProperty("activities")
    List<MailActivityDTO> activities
    /**
     * 「附件集合」
     */
    @JsonProperty("attachments")
    List<IrAttachmentDTO> attachments
    /**
     * 「关注者」
     */
    @JsonProperty("followers")
    List<MailFollowersDTO> followers
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「下一活动截止日期」
     */
    @JsonProperty("activity_date_deadline")
    Timestamp activityDateDeadline
    /**
     * 「活动异常标示」
     * 字典[活动异常标示]
     */
    @JsonProperty("activity_exception_decoration")
    String activityExceptionDecoration
    /**
     * 「图标」
     */
    @JsonProperty("activity_exception_icon")
    String activityExceptionIcon
    /**
     * 「活动状态」
     * 字典[活动状态]
     */
    @JsonProperty("activity_state")
    String activityState
    /**
     * 「其它说明」
     */
    @JsonProperty("additional_note")
    String additionalNote
    /**
     * 「工作地址」
     */
    @JsonProperty("address_id")
    String addressId
    /**
     * 「工作地址」
     */
    @JsonProperty("address_name")
    String addressName
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
     * 「考勤管理员」
     */
    @JsonProperty("attendance_manager_id")
    String attendanceManagerId
    /**
     * 「考勤管理员」
     */
    @JsonProperty("attendance_manager_name")
    String attendanceManagerName
    /**
     * 「出勤状态」
     * 字典[出勤状态]
     */
    @JsonProperty("attendance_state")
    String attendanceState
    /**
     * 「银行账户」
     */
    @JsonProperty("bank_account_id")
    String bankAccountId
    /**
     * 「银行账户」
     */
    @JsonProperty("bank_account_name")
    String bankAccountName
    /**
     * 「徽标 ID」
     */
    @JsonProperty("barcode")
    String barcode
    /**
     * 「出生日期」
     */
    @JsonProperty("birthday")
    Timestamp birthday
    /**
     * 「证书等级」
     * 字典[证书等级]
     */
    @JsonProperty("certificate")
    String certificate
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
     * 「受抚养的子女数」
     */
    @JsonProperty("children")
    Integer children
    /**
     * 「教练」
     */
    @JsonProperty("coach_id")
    String coachId
    /**
     * 「教练」
     */
    @JsonProperty("coach_name")
    String coachName
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
     * 「公司名称」
     */
    @JsonProperty("company_name")
    String companyName
    /**
     * 「合同警告」
     * 字典[是否]
     */
    @JsonProperty("contract_warning")
    Integer contractWarning
    /**
     * 「合同统计」
     */
    @JsonProperty("contracts_count")
    Integer contractsCount
    /**
     * 「国籍(国家)」
     */
    @JsonProperty("country_id")
    String countryId
    /**
     * 「国籍(国家)」
     */
    @JsonProperty("country_name")
    String countryName
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
     * 「部门名称」
     */
    @JsonProperty("department_name")
    String departmentName
    /**
     * 「离职日期」
     */
    @JsonProperty("departure_date")
    Timestamp departureDate
    /**
     * 「其它信息」
     */
    @JsonProperty("departure_description")
    String departureDescription
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「通勤距离」
     */
    @JsonProperty("distance_home_work")
    Integer distanceHomeWork
    /**
     * 「通勤距离（单位）」
     * 字典[通勤距离（单位）]
     */
    @JsonProperty("distance_home_work_unit")
    String distanceHomeWorkUnit
    /**
     * 「联系人姓名」
     */
    @JsonProperty("emergency_contact")
    String emergencyContact
    /**
     * 「电话」
     */
    @JsonProperty("emergency_phone")
    String emergencyPhone
    /**
     * 「车辆」
     */
    @JsonProperty("employee_cars_count")
    Integer employeeCarsCount
    /**
     * 「员工类型」
     * 字典[员工类型]
     */
    @JsonProperty("employee_type")
    String employeeType
    /**
     * 「设备数量」
     */
    @JsonProperty("equipment_count")
    Integer equipmentCount
    /**
     * 「费用」
     */
    @JsonProperty("expense_manager_id")
    String expenseManagerId
    /**
     * 「费用筛选」
     * 字典[是否]
     */
    @JsonProperty("filter_for_expense")
    Integer filterForExpense
    /**
     * 「首次合同日期」
     */
    @JsonProperty("first_contract_date")
    Timestamp firstContractDate
    /**
     * 「性别」
     * 字典[性别]
     */
    @JsonProperty("gender")
    String gender
    /**
     * 「有徽章」
     * 字典[是否]
     */
    @JsonProperty("has_badges")
    Integer hasBadges
    /**
     * 「有消息」
     * 字典[是否]
     */
    @JsonProperty("has_message")
    Integer hasMessage
    /**
     * 「小时上月」
     */
    @JsonProperty("hours_last_month")
    Double hoursLastMonth
    /**
     * 「小时上月显示」
     */
    @JsonProperty("hours_last_month_display")
    String hoursLastMonthDisplay
    /**
     * 「今天之前的小时数」
     */
    @JsonProperty("hours_previously_today")
    Double hoursPreviouslyToday
    /**
     * 「小时今天」
     */
    @JsonProperty("hours_today")
    Double hoursToday
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
     * 「身份证号」
     */
    @JsonProperty("identification_id")
    String identificationId
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
     * 「是下属」
     * 字典[是否]
     */
    @JsonProperty("is_subordinate")
    Integer isSubordinate
    /**
     * 「工作岗位」
     */
    @JsonProperty("job_id")
    String jobId
    /**
     * 「工作岗位」
     */
    @JsonProperty("job_name")
    String jobName
    /**
     * 「工作头衔」
     */
    @JsonProperty("job_title")
    String jobTitle
    /**
     * 「通勤距离（公里）」
     */
    @JsonProperty("km_home_work")
    Integer kmHomeWork
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
     * 「最后一次出勤 工作时数」
     */
    @JsonProperty("last_attendance_worked_hours")
    Double lastAttendanceWorkedHours
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
     * 「休假」
     */
    @JsonProperty("leave_manager_name")
    String leaveManagerName
    /**
     * 「休假次数」
     */
    @JsonProperty("leaves_count")
    Double leavesCount
    /**
     * 「法定名称」
     */
    @JsonProperty("legal_name")
    String legalName
    /**
     * 「车辆牌照」
     */
    @JsonProperty("license_plate")
    String licensePlate
    /**
     * 「部门数量」
     * 字典[是否]
     */
    @JsonProperty("member_of_department")
    Integer memberOfDepartment
    /**
     * 「附件数量」
     */
    @JsonProperty("message_attachment_count")
    Integer messageAttachmentCount
    /**
     * 「消息发送错误」
     * 字典[是否]
     */
    @JsonProperty("message_has_error")
    Integer messageHasError
    /**
     * 「错误数量」
     */
    @JsonProperty("message_has_error_counter")
    Integer messageHasErrorCounter
    /**
     * 「短信发送错误」
     * 字典[是否]
     */
    @JsonProperty("message_has_sms_error")
    Integer messageHasSmsError
    /**
     * 「是关注者」
     * 字典[是否]
     */
    @JsonProperty("message_is_follower")
    Integer messageIsFollower
    /**
     * 「主要附件」
     */
    @JsonProperty("message_main_attachment_id")
    String messageMainAttachmentId
    /**
     * 「所需操作」
     * 字典[是否]
     */
    @JsonProperty("message_needaction")
    Integer messageNeedaction
    /**
     * 「操作数量」
     */
    @JsonProperty("message_needaction_counter")
    Integer messageNeedactionCounter
    /**
     * 「办公手机」
     */
    @JsonProperty("mobile_phone")
    String mobilePhone
    /**
     * 「调动卡」
     */
    @JsonProperty("mobility_card")
    String mobilityCard
    /**
     * 「我的活动截止时间」
     */
    @JsonProperty("my_activity_date_deadline")
    Timestamp myActivityDateDeadline
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
     * 「备注」
     */
    @JsonProperty("notes")
    String notes
    /**
     * 「管理员标识」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「管理员」
     */
    @JsonProperty("parent_name")
    String parentName
    /**
     * 「护照号」
     */
    @JsonProperty("passport_id")
    String passportId
    /**
     * 「工作证编号」
     */
    @JsonProperty("permit_no")
    String permitNo
    /**
     * 「PIN」
     */
    @JsonProperty("pin")
    String pin
    /**
     * 「出生地」
     */
    @JsonProperty("place_of_birth")
    String placeOfBirth
    /**
     * 「私人车辆车牌」
     */
    @JsonProperty("private_car_plate")
    String privateCarPlate
    /**
     * 「城市」
     */
    @JsonProperty("private_city")
    String privateCity
    /**
     * 「国家」
     */
    @JsonProperty("private_country_id")
    String privateCountryId
    /**
     * 「国家」
     */
    @JsonProperty("private_country_name")
    String privateCountryName
    /**
     * 「私人电子邮箱」
     */
    @JsonProperty("private_email")
    String privateEmail
    /**
     * 「私人电话」
     */
    @JsonProperty("private_phone")
    String privatePhone
    /**
     * 「私人省/州」
     */
    @JsonProperty("private_state_id")
    String privateStateId
    /**
     * 「私人省/州」
     */
    @JsonProperty("private_state_name")
    String privateStateName
    /**
     * 「街道」
     */
    @JsonProperty("private_street")
    String privateStreet
    /**
     * 「街道2」
     */
    @JsonProperty("private_street2")
    String privateStreet2
    /**
     * 「邮编」
     */
    @JsonProperty("private_zip")
    String privateZip
    /**
     * 「相关合作伙伴数量」
     */
    @JsonProperty("related_partners_count")
    Integer relatedPartnersCount
    /**
     * 「可用休假天数」
     */
    @JsonProperty("remaining_leaves")
    Double remainingLeaves
    /**
     * 「工作时间」
     */
    @JsonProperty("resource_calendar_id")
    String resourceCalendarId
    /**
     * 「工作时间」
     */
    @JsonProperty("resource_calendar_name")
    String resourceCalendarName
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
     * 「社会保险号SIN」
     */
    @JsonProperty("sinid")
    String sinid
    /**
     * 「配偶生日」
     */
    @JsonProperty("spouse_birthdate")
    Timestamp spouseBirthdate
    /**
     * 「配偶全名」
     */
    @JsonProperty("spouse_complete_name")
    String spouseCompleteName
    /**
     * 「社会保障号SSN」
     */
    @JsonProperty("ssnid")
    String ssnid
    /**
     * 「研究领域」
     */
    @JsonProperty("study_field")
    String studyField
    /**
     * 「毕业院校」
     */
    @JsonProperty("study_school")
    String studySchool
    /**
     * 「加班费总额」
     */
    @JsonProperty("total_overtime")
    Double totalOvertime
    /**
     * 「用户」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「用户」
     */
    @JsonProperty("user_name")
    String userName
    /**
     * 「公司汽车」
     */
    @JsonProperty("vehicle")
    String vehicle
    /**
     * 「签证有效期」
     */
    @JsonProperty("visa_expire")
    Timestamp visaExpire
    /**
     * 「签证号」
     */
    @JsonProperty("visa_no")
    String visaNo
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
     * 「工作地点」
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
     * 「工作许可证到期日期」
     */
    @JsonProperty("work_permit_expiration_date")
    Timestamp workPermitExpirationDate
    /**
     * 「工作许可名称」
     */
    @JsonProperty("work_permit_name")
    String workPermitName
    /**
     * 「工作许可的预定活动」
     * 字典[是否]
     */
    @JsonProperty("work_permit_scheduled_activity")
    Integer workPermitScheduledActivity
    /**
     * 「办公电话」
     */
    @JsonProperty("work_phone")
    String workPhone
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
     * 「管理链」
     */
    @JsonProperty("parent_path")
    String parentPath
    /**
     * 「头像128」
     */
    @JsonProperty("avatar128")
    String avatar128
    /**
     * 「图片128」
     */
    @JsonProperty("image128")
    String image128
    /**
     * 「头像512」
     */
    @JsonProperty("avatar512")
    String avatar512
    /**
     * 「图片512」
     */
    @JsonProperty("image512")
    String image512
    /**
     * 「头像256」
     */
    @JsonProperty("avatar256")
    String avatar256
    /**
     * 「图片256」
     */
    @JsonProperty("image256")
    String image256
    /**
     * 「头像1024」
     */
    @JsonProperty("avatar1024")
    String avatar1024
    /**
     * 「图片1024」
     */
    @JsonProperty("image1024")
    String image1024
    /**
     * 「头像」
     */
    @JsonProperty("avatar")
    String avatar
    /**
     * 「头像」
     */
    @JsonProperty("image")
    String image

    /**
     * 设置「活动集合」值
     * @param val
     */
    HrEmployeeDTO setActivities(List<MailActivityDTO> activities) {
        this.activities = activities
        return this
    }


    /**
     * 设置「附件集合」值
     * @param val
     */
    HrEmployeeDTO setAttachments(List<IrAttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「关注者」值
     * @param val
     */
    HrEmployeeDTO setFollowers(List<MailFollowersDTO> followers) {
        this.followers = followers
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「下一活动截止日期」值
     * @param val
     */
    HrEmployeeDTO setActivityDateDeadline(Timestamp activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline
        return this
    }


    /**
     * 设置「活动异常标示」值
     * 字典[活动异常标示]
     * @param val
     */
    HrEmployeeDTO setActivityExceptionDecoration(String activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    HrEmployeeDTO setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon
        return this
    }


    /**
     * 设置「活动状态」值
     * 字典[活动状态]
     * @param val
     */
    HrEmployeeDTO setActivityState(String activityState) {
        this.activityState = activityState
        return this
    }


    /**
     * 设置「其它说明」值
     * @param val
     */
    HrEmployeeDTO setAdditionalNote(String additionalNote) {
        this.additionalNote = additionalNote
        return this
    }


    /**
     * 设置「工作地址」值
     * @param val
     */
    HrEmployeeDTO setAddressId(String addressId) {
        this.addressId = addressId
        return this
    }


    /**
     * 设置「工作地址」值
     * @param val
     */
    HrEmployeeDTO setAddressName(String addressName) {
        this.addressName = addressName
        return this
    }


    /**
     * 设置「分配的总天数。」值
     * @param val
     */
    HrEmployeeDTO setAllocationCount(Double allocationCount) {
        this.allocationCount = allocationCount
        return this
    }


    /**
     * 设置「分配显示」值
     * @param val
     */
    HrEmployeeDTO setAllocationDisplay(String allocationDisplay) {
        this.allocationDisplay = allocationDisplay
        return this
    }


    /**
     * 设置「剩余的分配显示」值
     * @param val
     */
    HrEmployeeDTO setAllocationRemainingDisplay(String allocationRemainingDisplay) {
        this.allocationRemainingDisplay = allocationRemainingDisplay
        return this
    }


    /**
     * 设置「分配总数量」值
     * @param val
     */
    HrEmployeeDTO setAllocationsCount(Integer allocationsCount) {
        this.allocationsCount = allocationsCount
        return this
    }


    /**
     * 设置「考勤管理员」值
     * @param val
     */
    HrEmployeeDTO setAttendanceManagerId(String attendanceManagerId) {
        this.attendanceManagerId = attendanceManagerId
        return this
    }


    /**
     * 设置「考勤管理员」值
     * @param val
     */
    HrEmployeeDTO setAttendanceManagerName(String attendanceManagerName) {
        this.attendanceManagerName = attendanceManagerName
        return this
    }


    /**
     * 设置「出勤状态」值
     * 字典[出勤状态]
     * @param val
     */
    HrEmployeeDTO setAttendanceState(String attendanceState) {
        this.attendanceState = attendanceState
        return this
    }


    /**
     * 设置「银行账户」值
     * @param val
     */
    HrEmployeeDTO setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId
        return this
    }


    /**
     * 设置「银行账户」值
     * @param val
     */
    HrEmployeeDTO setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName
        return this
    }


    /**
     * 设置「徽标 ID」值
     * @param val
     */
    HrEmployeeDTO setBarcode(String barcode) {
        this.barcode = barcode
        return this
    }


    /**
     * 设置「出生日期」值
     * @param val
     */
    HrEmployeeDTO setBirthday(Timestamp birthday) {
        this.birthday = birthday
        return this
    }


    /**
     * 设置「证书等级」值
     * 字典[证书等级]
     * @param val
     */
    HrEmployeeDTO setCertificate(String certificate) {
        this.certificate = certificate
        return this
    }


    /**
     * 设置「间接下属统计」值
     * @param val
     */
    HrEmployeeDTO setChildAllCount(Integer childAllCount) {
        this.childAllCount = childAllCount
        return this
    }


    /**
     * 设置「直接下属人数」值
     * @param val
     */
    HrEmployeeDTO setChildCount(Integer childCount) {
        this.childCount = childCount
        return this
    }


    /**
     * 设置「受抚养的子女数」值
     * @param val
     */
    HrEmployeeDTO setChildren(Integer children) {
        this.children = children
        return this
    }


    /**
     * 设置「教练」值
     * @param val
     */
    HrEmployeeDTO setCoachId(String coachId) {
        this.coachId = coachId
        return this
    }


    /**
     * 设置「教练」值
     * @param val
     */
    HrEmployeeDTO setCoachName(String coachName) {
        this.coachName = coachName
        return this
    }


    /**
     * 设置「颜色指标」值
     * @param val
     */
    HrEmployeeDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrEmployeeDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「公司名称」值
     * @param val
     */
    HrEmployeeDTO setCompanyName(String companyName) {
        this.companyName = companyName
        return this
    }


    /**
     * 设置「合同警告」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setContractWarning(Integer contractWarning) {
        this.contractWarning = contractWarning
        return this
    }


    /**
     * 设置「合同统计」值
     * @param val
     */
    HrEmployeeDTO setContractsCount(Integer contractsCount) {
        this.contractsCount = contractsCount
        return this
    }


    /**
     * 设置「国籍(国家)」值
     * @param val
     */
    HrEmployeeDTO setCountryId(String countryId) {
        this.countryId = countryId
        return this
    }


    /**
     * 设置「国籍(国家)」值
     * @param val
     */
    HrEmployeeDTO setCountryName(String countryName) {
        this.countryName = countryName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrEmployeeDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrEmployeeDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「当前休假状态」值
     * 字典[当前休假状态]
     * @param val
     */
    HrEmployeeDTO setCurrentLeaveState(String currentLeaveState) {
        this.currentLeaveState = currentLeaveState
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrEmployeeDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「部门名称」值
     * @param val
     */
    HrEmployeeDTO setDepartmentName(String departmentName) {
        this.departmentName = departmentName
        return this
    }


    /**
     * 设置「离职日期」值
     * @param val
     */
    HrEmployeeDTO setDepartureDate(Timestamp departureDate) {
        this.departureDate = departureDate
        return this
    }


    /**
     * 设置「其它信息」值
     * @param val
     */
    HrEmployeeDTO setDepartureDescription(String departureDescription) {
        this.departureDescription = departureDescription
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrEmployeeDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「通勤距离」值
     * @param val
     */
    HrEmployeeDTO setDistanceHomeWork(Integer distanceHomeWork) {
        this.distanceHomeWork = distanceHomeWork
        return this
    }


    /**
     * 设置「通勤距离（单位）」值
     * 字典[通勤距离（单位）]
     * @param val
     */
    HrEmployeeDTO setDistanceHomeWorkUnit(String distanceHomeWorkUnit) {
        this.distanceHomeWorkUnit = distanceHomeWorkUnit
        return this
    }


    /**
     * 设置「联系人姓名」值
     * @param val
     */
    HrEmployeeDTO setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact
        return this
    }


    /**
     * 设置「电话」值
     * @param val
     */
    HrEmployeeDTO setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone
        return this
    }


    /**
     * 设置「车辆」值
     * @param val
     */
    HrEmployeeDTO setEmployeeCarsCount(Integer employeeCarsCount) {
        this.employeeCarsCount = employeeCarsCount
        return this
    }


    /**
     * 设置「员工类型」值
     * 字典[员工类型]
     * @param val
     */
    HrEmployeeDTO setEmployeeType(String employeeType) {
        this.employeeType = employeeType
        return this
    }


    /**
     * 设置「设备数量」值
     * @param val
     */
    HrEmployeeDTO setEquipmentCount(Integer equipmentCount) {
        this.equipmentCount = equipmentCount
        return this
    }


    /**
     * 设置「费用」值
     * @param val
     */
    HrEmployeeDTO setExpenseManagerId(String expenseManagerId) {
        this.expenseManagerId = expenseManagerId
        return this
    }


    /**
     * 设置「费用筛选」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setFilterForExpense(Integer filterForExpense) {
        this.filterForExpense = filterForExpense
        return this
    }


    /**
     * 设置「首次合同日期」值
     * @param val
     */
    HrEmployeeDTO setFirstContractDate(Timestamp firstContractDate) {
        this.firstContractDate = firstContractDate
        return this
    }


    /**
     * 设置「性别」值
     * 字典[性别]
     * @param val
     */
    HrEmployeeDTO setGender(String gender) {
        this.gender = gender
        return this
    }


    /**
     * 设置「有徽章」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setHasBadges(Integer hasBadges) {
        this.hasBadges = hasBadges
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「小时上月」值
     * @param val
     */
    HrEmployeeDTO setHoursLastMonth(Double hoursLastMonth) {
        this.hoursLastMonth = hoursLastMonth
        return this
    }


    /**
     * 设置「小时上月显示」值
     * @param val
     */
    HrEmployeeDTO setHoursLastMonthDisplay(String hoursLastMonthDisplay) {
        this.hoursLastMonthDisplay = hoursLastMonthDisplay
        return this
    }


    /**
     * 设置「今天之前的小时数」值
     * @param val
     */
    HrEmployeeDTO setHoursPreviouslyToday(Double hoursPreviouslyToday) {
        this.hoursPreviouslyToday = hoursPreviouslyToday
        return this
    }


    /**
     * 设置「小时今天」值
     * @param val
     */
    HrEmployeeDTO setHoursToday(Double hoursToday) {
        this.hoursToday = hoursToday
        return this
    }


    /**
     * 设置「人力资源显示的图标」值
     * 字典[人力资源显示的图标]
     * @param val
     */
    HrEmployeeDTO setHrIconDisplay(String hrIconDisplay) {
        this.hrIconDisplay = hrIconDisplay
        return this
    }


    /**
     * 设置「人力资源出席状态」值
     * 字典[人力资源出席状态]
     * @param val
     */
    HrEmployeeDTO setHrPresenceState(String hrPresenceState) {
        this.hrPresenceState = hrPresenceState
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrEmployeeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「身份证号」值
     * @param val
     */
    HrEmployeeDTO setIdentificationId(String identificationId) {
        this.identificationId = identificationId
        return this
    }


    /**
     * 设置「今日缺勤」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setIsAbsent(Integer isAbsent) {
        this.isAbsent = isAbsent
        return this
    }


    /**
     * 设置「灵活可变」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setIsFlexible(Integer isFlexible) {
        this.isFlexible = isFlexible
        return this
    }


    /**
     * 设置「完全灵活」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setIsFullyFlexible(Integer isFullyFlexible) {
        this.isFullyFlexible = isFullyFlexible
        return this
    }


    /**
     * 设置「是下属」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setIsSubordinate(Integer isSubordinate) {
        this.isSubordinate = isSubordinate
        return this
    }


    /**
     * 设置「工作岗位」值
     * @param val
     */
    HrEmployeeDTO setJobId(String jobId) {
        this.jobId = jobId
        return this
    }


    /**
     * 设置「工作岗位」值
     * @param val
     */
    HrEmployeeDTO setJobName(String jobName) {
        this.jobName = jobName
        return this
    }


    /**
     * 设置「工作头衔」值
     * @param val
     */
    HrEmployeeDTO setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle
        return this
    }


    /**
     * 设置「通勤距离（公里）」值
     * @param val
     */
    HrEmployeeDTO setKmHomeWork(Integer kmHomeWork) {
        this.kmHomeWork = kmHomeWork
        return this
    }


    /**
     * 设置「上个活动」值
     * @param val
     */
    HrEmployeeDTO setLastActivity(Timestamp lastActivity) {
        this.lastActivity = lastActivity
        return this
    }


    /**
     * 设置「上个活动时间」值
     * @param val
     */
    HrEmployeeDTO setLastActivityTime(String lastActivityTime) {
        this.lastActivityTime = lastActivityTime
        return this
    }


    /**
     * 设置「最后一次出勤 工作时数」值
     * @param val
     */
    HrEmployeeDTO setLastAttendanceWorkedHours(Double lastAttendanceWorkedHours) {
        this.lastAttendanceWorkedHours = lastAttendanceWorkedHours
        return this
    }


    /**
     * 设置「起始日期」值
     * @param val
     */
    HrEmployeeDTO setLeaveDateFrom(Timestamp leaveDateFrom) {
        this.leaveDateFrom = leaveDateFrom
        return this
    }


    /**
     * 设置「至日期」值
     * @param val
     */
    HrEmployeeDTO setLeaveDateTo(Timestamp leaveDateTo) {
        this.leaveDateTo = leaveDateTo
        return this
    }


    /**
     * 设置「休假」值
     * @param val
     */
    HrEmployeeDTO setLeaveManagerId(String leaveManagerId) {
        this.leaveManagerId = leaveManagerId
        return this
    }


    /**
     * 设置「休假」值
     * @param val
     */
    HrEmployeeDTO setLeaveManagerName(String leaveManagerName) {
        this.leaveManagerName = leaveManagerName
        return this
    }


    /**
     * 设置「休假次数」值
     * @param val
     */
    HrEmployeeDTO setLeavesCount(Double leavesCount) {
        this.leavesCount = leavesCount
        return this
    }


    /**
     * 设置「法定名称」值
     * @param val
     */
    HrEmployeeDTO setLegalName(String legalName) {
        this.legalName = legalName
        return this
    }


    /**
     * 设置「车辆牌照」值
     * @param val
     */
    HrEmployeeDTO setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate
        return this
    }


    /**
     * 设置「部门数量」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setMemberOfDepartment(Integer memberOfDepartment) {
        this.memberOfDepartment = memberOfDepartment
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    HrEmployeeDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    HrEmployeeDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「主要附件」值
     * @param val
     */
    HrEmployeeDTO setMessageMainAttachmentId(String messageMainAttachmentId) {
        this.messageMainAttachmentId = messageMainAttachmentId
        return this
    }


    /**
     * 设置「所需操作」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    HrEmployeeDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「办公手机」值
     * @param val
     */
    HrEmployeeDTO setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone
        return this
    }


    /**
     * 设置「调动卡」值
     * @param val
     */
    HrEmployeeDTO setMobilityCard(String mobilityCard) {
        this.mobilityCard = mobilityCard
        return this
    }


    /**
     * 设置「我的活动截止时间」值
     * @param val
     */
    HrEmployeeDTO setMyActivityDateDeadline(Timestamp myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrEmployeeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「最近聘用的」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setNewlyHired(Integer newlyHired) {
        this.newlyHired = newlyHired
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    HrEmployeeDTO setNotes(String notes) {
        this.notes = notes
        return this
    }


    /**
     * 设置「管理员标识」值
     * @param val
     */
    HrEmployeeDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「管理员」值
     * @param val
     */
    HrEmployeeDTO setParentName(String parentName) {
        this.parentName = parentName
        return this
    }


    /**
     * 设置「护照号」值
     * @param val
     */
    HrEmployeeDTO setPassportId(String passportId) {
        this.passportId = passportId
        return this
    }


    /**
     * 设置「工作证编号」值
     * @param val
     */
    HrEmployeeDTO setPermitNo(String permitNo) {
        this.permitNo = permitNo
        return this
    }


    /**
     * 设置「PIN」值
     * @param val
     */
    HrEmployeeDTO setPin(String pin) {
        this.pin = pin
        return this
    }


    /**
     * 设置「出生地」值
     * @param val
     */
    HrEmployeeDTO setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth
        return this
    }


    /**
     * 设置「私人车辆车牌」值
     * @param val
     */
    HrEmployeeDTO setPrivateCarPlate(String privateCarPlate) {
        this.privateCarPlate = privateCarPlate
        return this
    }


    /**
     * 设置「城市」值
     * @param val
     */
    HrEmployeeDTO setPrivateCity(String privateCity) {
        this.privateCity = privateCity
        return this
    }


    /**
     * 设置「国家」值
     * @param val
     */
    HrEmployeeDTO setPrivateCountryId(String privateCountryId) {
        this.privateCountryId = privateCountryId
        return this
    }


    /**
     * 设置「国家」值
     * @param val
     */
    HrEmployeeDTO setPrivateCountryName(String privateCountryName) {
        this.privateCountryName = privateCountryName
        return this
    }


    /**
     * 设置「私人电子邮箱」值
     * @param val
     */
    HrEmployeeDTO setPrivateEmail(String privateEmail) {
        this.privateEmail = privateEmail
        return this
    }


    /**
     * 设置「私人电话」值
     * @param val
     */
    HrEmployeeDTO setPrivatePhone(String privatePhone) {
        this.privatePhone = privatePhone
        return this
    }


    /**
     * 设置「私人省/州」值
     * @param val
     */
    HrEmployeeDTO setPrivateStateId(String privateStateId) {
        this.privateStateId = privateStateId
        return this
    }


    /**
     * 设置「私人省/州」值
     * @param val
     */
    HrEmployeeDTO setPrivateStateName(String privateStateName) {
        this.privateStateName = privateStateName
        return this
    }


    /**
     * 设置「街道」值
     * @param val
     */
    HrEmployeeDTO setPrivateStreet(String privateStreet) {
        this.privateStreet = privateStreet
        return this
    }


    /**
     * 设置「街道2」值
     * @param val
     */
    HrEmployeeDTO setPrivateStreet2(String privateStreet2) {
        this.privateStreet2 = privateStreet2
        return this
    }


    /**
     * 设置「邮编」值
     * @param val
     */
    HrEmployeeDTO setPrivateZip(String privateZip) {
        this.privateZip = privateZip
        return this
    }


    /**
     * 设置「相关合作伙伴数量」值
     * @param val
     */
    HrEmployeeDTO setRelatedPartnersCount(Integer relatedPartnersCount) {
        this.relatedPartnersCount = relatedPartnersCount
        return this
    }


    /**
     * 设置「可用休假天数」值
     * @param val
     */
    HrEmployeeDTO setRemainingLeaves(Double remainingLeaves) {
        this.remainingLeaves = remainingLeaves
        return this
    }


    /**
     * 设置「工作时间」值
     * @param val
     */
    HrEmployeeDTO setResourceCalendarId(String resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId
        return this
    }


    /**
     * 设置「工作时间」值
     * @param val
     */
    HrEmployeeDTO setResourceCalendarName(String resourceCalendarName) {
        this.resourceCalendarName = resourceCalendarName
        return this
    }


    /**
     * 设置「资源」值
     * @param val
     */
    HrEmployeeDTO setResourceId(String resourceId) {
        this.resourceId = resourceId
        return this
    }


    /**
     * 设置「显示HR图标」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setShowHrIconDisplay(Integer showHrIconDisplay) {
        this.showHrIconDisplay = showHrIconDisplay
        return this
    }


    /**
     * 设置「能够查看到剩余休假」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setShowLeaves(Integer showLeaves) {
        this.showLeaves = showLeaves
        return this
    }


    /**
     * 设置「社会保险号SIN」值
     * @param val
     */
    HrEmployeeDTO setSinid(String sinid) {
        this.sinid = sinid
        return this
    }


    /**
     * 设置「配偶生日」值
     * @param val
     */
    HrEmployeeDTO setSpouseBirthdate(Timestamp spouseBirthdate) {
        this.spouseBirthdate = spouseBirthdate
        return this
    }


    /**
     * 设置「配偶全名」值
     * @param val
     */
    HrEmployeeDTO setSpouseCompleteName(String spouseCompleteName) {
        this.spouseCompleteName = spouseCompleteName
        return this
    }


    /**
     * 设置「社会保障号SSN」值
     * @param val
     */
    HrEmployeeDTO setSsnid(String ssnid) {
        this.ssnid = ssnid
        return this
    }


    /**
     * 设置「研究领域」值
     * @param val
     */
    HrEmployeeDTO setStudyField(String studyField) {
        this.studyField = studyField
        return this
    }


    /**
     * 设置「毕业院校」值
     * @param val
     */
    HrEmployeeDTO setStudySchool(String studySchool) {
        this.studySchool = studySchool
        return this
    }


    /**
     * 设置「加班费总额」值
     * @param val
     */
    HrEmployeeDTO setTotalOvertime(Double totalOvertime) {
        this.totalOvertime = totalOvertime
        return this
    }


    /**
     * 设置「用户」值
     * @param val
     */
    HrEmployeeDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「用户」值
     * @param val
     */
    HrEmployeeDTO setUserName(String userName) {
        this.userName = userName
        return this
    }


    /**
     * 设置「公司汽车」值
     * @param val
     */
    HrEmployeeDTO setVehicle(String vehicle) {
        this.vehicle = vehicle
        return this
    }


    /**
     * 设置「签证有效期」值
     * @param val
     */
    HrEmployeeDTO setVisaExpire(Timestamp visaExpire) {
        this.visaExpire = visaExpire
        return this
    }


    /**
     * 设置「签证号」值
     * @param val
     */
    HrEmployeeDTO setVisaNo(String visaNo) {
        this.visaNo = visaNo
        return this
    }


    /**
     * 设置「工作联系人」值
     * @param val
     */
    HrEmployeeDTO setWorkContactId(String workContactId) {
        this.workContactId = workContactId
        return this
    }


    /**
     * 设置「工作电子邮件」值
     * @param val
     */
    HrEmployeeDTO setWorkEmail(String workEmail) {
        this.workEmail = workEmail
        return this
    }


    /**
     * 设置「工作地点」值
     * @param val
     */
    HrEmployeeDTO setWorkLocationId(String workLocationId) {
        this.workLocationId = workLocationId
        return this
    }


    /**
     * 设置「工作地点」值
     * @param val
     */
    HrEmployeeDTO setWorkLocationName(String workLocationName) {
        this.workLocationName = workLocationName
        return this
    }


    /**
     * 设置「工作位置类型」值
     * 字典[工作位置类型]
     * @param val
     */
    HrEmployeeDTO setWorkLocationType(String workLocationType) {
        this.workLocationType = workLocationType
        return this
    }


    /**
     * 设置「工作许可证到期日期」值
     * @param val
     */
    HrEmployeeDTO setWorkPermitExpirationDate(Timestamp workPermitExpirationDate) {
        this.workPermitExpirationDate = workPermitExpirationDate
        return this
    }


    /**
     * 设置「工作许可名称」值
     * @param val
     */
    HrEmployeeDTO setWorkPermitName(String workPermitName) {
        this.workPermitName = workPermitName
        return this
    }


    /**
     * 设置「工作许可的预定活动」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setWorkPermitScheduledActivity(Integer workPermitScheduledActivity) {
        this.workPermitScheduledActivity = workPermitScheduledActivity
        return this
    }


    /**
     * 设置「办公电话」值
     * @param val
     */
    HrEmployeeDTO setWorkPhone(String workPhone) {
        this.workPhone = workPhone
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrEmployeeDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrEmployeeDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「管理链」值
     * @param val
     */
    HrEmployeeDTO setParentPath(String parentPath) {
        this.parentPath = parentPath
        return this
    }


    /**
     * 设置「头像128」值
     * @param val
     */
    HrEmployeeDTO setAvatar128(String avatar128) {
        this.avatar128 = avatar128
        return this
    }


    /**
     * 设置「图片128」值
     * @param val
     */
    HrEmployeeDTO setImage128(String image128) {
        this.image128 = image128
        return this
    }


    /**
     * 设置「头像512」值
     * @param val
     */
    HrEmployeeDTO setAvatar512(String avatar512) {
        this.avatar512 = avatar512
        return this
    }


    /**
     * 设置「图片512」值
     * @param val
     */
    HrEmployeeDTO setImage512(String image512) {
        this.image512 = image512
        return this
    }


    /**
     * 设置「头像256」值
     * @param val
     */
    HrEmployeeDTO setAvatar256(String avatar256) {
        this.avatar256 = avatar256
        return this
    }


    /**
     * 设置「图片256」值
     * @param val
     */
    HrEmployeeDTO setImage256(String image256) {
        this.image256 = image256
        return this
    }


    /**
     * 设置「头像1024」值
     * @param val
     */
    HrEmployeeDTO setAvatar1024(String avatar1024) {
        this.avatar1024 = avatar1024
        return this
    }


    /**
     * 设置「图片1024」值
     * @param val
     */
    HrEmployeeDTO setImage1024(String image1024) {
        this.image1024 = image1024
        return this
    }


    /**
     * 设置「头像」值
     * @param val
     */
    HrEmployeeDTO setAvatar(String avatar) {
        this.avatar = avatar
        return this
    }


    /**
     * 设置「头像」值
     * @param val
     */
    HrEmployeeDTO setImage(String image) {
        this.image = image
        return this
    }

}
