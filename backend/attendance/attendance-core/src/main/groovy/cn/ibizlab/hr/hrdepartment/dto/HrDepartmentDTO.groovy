package cn.ibizlab.hr.hrdepartment.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.hr.hremployee.dto.HrEmployeeDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class HrDepartmentDTO extends GroovyDTO<HrDepartmentDTO> {

    /**
     * 「今日缺勤」
     */
    @JsonProperty("absence_of_today")
    Integer absenceOfToday
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「图标」
     */
    @JsonProperty("activity_exception_icon")
    String activityExceptionIcon
    /**
     * 「待批准的分配」
     */
    @JsonProperty("allocation_to_approve_count")
    Integer allocationToApproveCount
    /**
     * 「颜色指标」
     */
    @JsonProperty("color")
    String color
    /**
     * 「完整名称」
     */
    @JsonProperty("complete_name")
    String completeName
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
     * 「预期的员工」
     */
    @JsonProperty("expected_employee")
    Integer expectedEmployee
    /**
     * 「待批准的费用报表」
     */
    @JsonProperty("expense_sheets_to_approve_count")
    Integer expenseSheetsToApproveCount
    /**
     * 「有消息」
     * 字典[是否]
     */
    @JsonProperty("has_message")
    Integer hasMessage
    /**
     * 「Has Read Access」
     * 字典[是否]
     */
    @JsonProperty("has_read_access")
    Integer hasReadAccess
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「待批准的休假」
     */
    @JsonProperty("leave_to_approve_count")
    Integer leaveToApproveCount
    /**
     * 「管理员」
     */
    @JsonProperty("manager_id")
    String managerId
    /**
     * 「管理员」
     */
    @JsonProperty("manager_name")
    String managerName
    /**
     * 「主部门」
     */
    @JsonProperty("master_department_id")
    String masterDepartmentId
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
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「新申请」
     */
    @JsonProperty("new_applicant_count")
    Integer newApplicantCount
    /**
     * 「新雇用的员工」
     */
    @JsonProperty("new_hired_employee")
    Integer newHiredEmployee
    /**
     * 「备注」
     */
    @JsonProperty("note")
    String note
    /**
     * 「上级部门」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「上级部门」
     */
    @JsonProperty("parent_name")
    String parentName
    /**
     * 「父级路径」
     */
    @JsonProperty("parent_path")
    String parentPath
    /**
     * 「计划数量」
     */
    @JsonProperty("plans_count")
    Integer plansCount
    /**
     * 「Total Employee」
     */
    @JsonProperty("total_employee")
    Integer totalEmployee
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
    @JsonProperty("employees")
    List<HrEmployeeDTO> employees

    /**
     * 设置「今日缺勤」值
     * @param val
     */
    HrDepartmentDTO setAbsenceOfToday(Integer absenceOfToday) {
        this.absenceOfToday = absenceOfToday
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    HrDepartmentDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    HrDepartmentDTO setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon
        return this
    }


    /**
     * 设置「待批准的分配」值
     * @param val
     */
    HrDepartmentDTO setAllocationToApproveCount(Integer allocationToApproveCount) {
        this.allocationToApproveCount = allocationToApproveCount
        return this
    }


    /**
     * 设置「颜色指标」值
     * @param val
     */
    HrDepartmentDTO setColor(String color) {
        this.color = color
        return this
    }


    /**
     * 设置「完整名称」值
     * @param val
     */
    HrDepartmentDTO setCompleteName(String completeName) {
        this.completeName = completeName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrDepartmentDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrDepartmentDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrDepartmentDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「预期的员工」值
     * @param val
     */
    HrDepartmentDTO setExpectedEmployee(Integer expectedEmployee) {
        this.expectedEmployee = expectedEmployee
        return this
    }


    /**
     * 设置「待批准的费用报表」值
     * @param val
     */
    HrDepartmentDTO setExpenseSheetsToApproveCount(Integer expenseSheetsToApproveCount) {
        this.expenseSheetsToApproveCount = expenseSheetsToApproveCount
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    HrDepartmentDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「Has Read Access」值
     * 字典[是否]
     * @param val
     */
    HrDepartmentDTO setHasReadAccess(Integer hasReadAccess) {
        this.hasReadAccess = hasReadAccess
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrDepartmentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「待批准的休假」值
     * @param val
     */
    HrDepartmentDTO setLeaveToApproveCount(Integer leaveToApproveCount) {
        this.leaveToApproveCount = leaveToApproveCount
        return this
    }


    /**
     * 设置「管理员」值
     * @param val
     */
    HrDepartmentDTO setManagerId(String managerId) {
        this.managerId = managerId
        return this
    }


    /**
     * 设置「管理员」值
     * @param val
     */
    HrDepartmentDTO setManagerName(String managerName) {
        this.managerName = managerName
        return this
    }


    /**
     * 设置「主部门」值
     * @param val
     */
    HrDepartmentDTO setMasterDepartmentId(String masterDepartmentId) {
        this.masterDepartmentId = masterDepartmentId
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    HrDepartmentDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    HrDepartmentDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    HrDepartmentDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    HrDepartmentDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    HrDepartmentDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「所需操作」值
     * 字典[是否]
     * @param val
     */
    HrDepartmentDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    HrDepartmentDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrDepartmentDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「新申请」值
     * @param val
     */
    HrDepartmentDTO setNewApplicantCount(Integer newApplicantCount) {
        this.newApplicantCount = newApplicantCount
        return this
    }


    /**
     * 设置「新雇用的员工」值
     * @param val
     */
    HrDepartmentDTO setNewHiredEmployee(Integer newHiredEmployee) {
        this.newHiredEmployee = newHiredEmployee
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    HrDepartmentDTO setNote(String note) {
        this.note = note
        return this
    }


    /**
     * 设置「上级部门」值
     * @param val
     */
    HrDepartmentDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「上级部门」值
     * @param val
     */
    HrDepartmentDTO setParentName(String parentName) {
        this.parentName = parentName
        return this
    }


    /**
     * 设置「父级路径」值
     * @param val
     */
    HrDepartmentDTO setParentPath(String parentPath) {
        this.parentPath = parentPath
        return this
    }


    /**
     * 设置「计划数量」值
     * @param val
     */
    HrDepartmentDTO setPlansCount(Integer plansCount) {
        this.plansCount = plansCount
        return this
    }


    /**
     * 设置「Total Employee」值
     * @param val
     */
    HrDepartmentDTO setTotalEmployee(Integer totalEmployee) {
        this.totalEmployee = totalEmployee
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrDepartmentDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    HrDepartmentDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    HrDepartmentDTO setEmployees(List<HrEmployeeDTO> employees) {
        this.employees = employees
        return this
    }

}
