package cn.ibizlab.hr.hrjob.dto

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
class HrJobDTO extends GroovyDTO<HrJobDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「基于活动的状态 
 逾期：已经超过截止日期 
 现今：活动日期是当天 
 计划：未来活动。」
     */
    @JsonProperty("activities_overdue")
    Integer activitiesOverdue
    /**
     * 「今天的活动」
     */
    @JsonProperty("activities_today")
    Integer activitiesToday
    /**
     * 「工作地点」
     */
    @JsonProperty("address_id")
    String addressId
    /**
     * 「电子邮箱别名」
     */
    @JsonProperty("alias_email")
    String aliasEmail
    /**
     * 「所有申请计计数」
     */
    @JsonProperty("all_application_count")
    Integer allApplicationCount
    /**
     * 「聘用的申请人」
     */
    @JsonProperty("applicant_hired")
    Integer applicantHired
    /**
     * 「申请人物业」
     */
    @JsonProperty("applicant_properties_definition")
    String applicantPropertiesDefinition
    /**
     * 「应用计数」
     */
    @JsonProperty("application_count")
    Integer applicationCount
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
     * 「雇佣类型」
     */
    @JsonProperty("contract_type_id")
    String contractTypeId
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
     * 「部门」
     */
    @JsonProperty("department_id")
    String departmentId
    /**
     * 「工作说明」
     */
    @JsonProperty("description")
    String description
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「文档数」
     */
    @JsonProperty("documents_count")
    Integer documentsCount
    /**
     * 「预计员工数合计」
     */
    @JsonProperty("expected_employees")
    Integer expectedEmployees
    /**
     * 「有消息」
     * 字典[是否]
     */
    @JsonProperty("has_message")
    Integer hasMessage
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「行业」
     */
    @JsonProperty("industry_id")
    String industryId
    /**
     * 「是喜好的」
     * 字典[是否]
     */
    @JsonProperty("is_favorite")
    Integer isFavorite
    /**
     * 「部门经理」
     */
    @JsonProperty("manager_id")
    String managerId
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
     * 「新的申请」
     */
    @JsonProperty("new_application_count")
    Integer newApplicationCount
    /**
     * 「当前员工数量」
     */
    @JsonProperty("no_of_employee")
    Integer noOfEmployee
    /**
     * 「被雇佣的」
     */
    @JsonProperty("no_of_hired_employee")
    Integer noOfHiredEmployee
    /**
     * 「目标」
     */
    @JsonProperty("no_of_recruitment")
    Integer noOfRecruitment
    /**
     * 「旧申请」
     */
    @JsonProperty("old_application_count")
    Integer oldApplicationCount
    /**
     * 「要求」
     */
    @JsonProperty("requirements")
    String requirements
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「招聘人员」
     */
    @JsonProperty("user_id")
    String userId
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
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    HrJobDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「基于活动的状态 
 逾期：已经超过截止日期 
 现今：活动日期是当天 
 计划：未来活动。」值
     * @param val
     */
    HrJobDTO setActivitiesOverdue(Integer activitiesOverdue) {
        this.activitiesOverdue = activitiesOverdue
        return this
    }


    /**
     * 设置「今天的活动」值
     * @param val
     */
    HrJobDTO setActivitiesToday(Integer activitiesToday) {
        this.activitiesToday = activitiesToday
        return this
    }


    /**
     * 设置「工作地点」值
     * @param val
     */
    HrJobDTO setAddressId(String addressId) {
        this.addressId = addressId
        return this
    }


    /**
     * 设置「电子邮箱别名」值
     * @param val
     */
    HrJobDTO setAliasEmail(String aliasEmail) {
        this.aliasEmail = aliasEmail
        return this
    }


    /**
     * 设置「所有申请计计数」值
     * @param val
     */
    HrJobDTO setAllApplicationCount(Integer allApplicationCount) {
        this.allApplicationCount = allApplicationCount
        return this
    }


    /**
     * 设置「聘用的申请人」值
     * @param val
     */
    HrJobDTO setApplicantHired(Integer applicantHired) {
        this.applicantHired = applicantHired
        return this
    }


    /**
     * 设置「申请人物业」值
     * @param val
     */
    HrJobDTO setApplicantPropertiesDefinition(String applicantPropertiesDefinition) {
        this.applicantPropertiesDefinition = applicantPropertiesDefinition
        return this
    }


    /**
     * 设置「应用计数」值
     * @param val
     */
    HrJobDTO setApplicationCount(Integer applicationCount) {
        this.applicationCount = applicationCount
        return this
    }


    /**
     * 设置「颜色指标」值
     * @param val
     */
    HrJobDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrJobDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「雇佣类型」值
     * @param val
     */
    HrJobDTO setContractTypeId(String contractTypeId) {
        this.contractTypeId = contractTypeId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrJobDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrJobDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「起始日期」值
     * @param val
     */
    HrJobDTO setDateFrom(Timestamp dateFrom) {
        this.dateFrom = dateFrom
        return this
    }


    /**
     * 设置「结束日期」值
     * @param val
     */
    HrJobDTO setDateTo(Timestamp dateTo) {
        this.dateTo = dateTo
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrJobDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「工作说明」值
     * @param val
     */
    HrJobDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrJobDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「文档数」值
     * @param val
     */
    HrJobDTO setDocumentsCount(Integer documentsCount) {
        this.documentsCount = documentsCount
        return this
    }


    /**
     * 设置「预计员工数合计」值
     * @param val
     */
    HrJobDTO setExpectedEmployees(Integer expectedEmployees) {
        this.expectedEmployees = expectedEmployees
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    HrJobDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrJobDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「行业」值
     * @param val
     */
    HrJobDTO setIndustryId(String industryId) {
        this.industryId = industryId
        return this
    }


    /**
     * 设置「是喜好的」值
     * 字典[是否]
     * @param val
     */
    HrJobDTO setIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite
        return this
    }


    /**
     * 设置「部门经理」值
     * @param val
     */
    HrJobDTO setManagerId(String managerId) {
        this.managerId = managerId
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    HrJobDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    HrJobDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    HrJobDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    HrJobDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    HrJobDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「所需操作」值
     * 字典[是否]
     * @param val
     */
    HrJobDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    HrJobDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrJobDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「新的申请」值
     * @param val
     */
    HrJobDTO setNewApplicationCount(Integer newApplicationCount) {
        this.newApplicationCount = newApplicationCount
        return this
    }


    /**
     * 设置「当前员工数量」值
     * @param val
     */
    HrJobDTO setNoOfEmployee(Integer noOfEmployee) {
        this.noOfEmployee = noOfEmployee
        return this
    }


    /**
     * 设置「被雇佣的」值
     * @param val
     */
    HrJobDTO setNoOfHiredEmployee(Integer noOfHiredEmployee) {
        this.noOfHiredEmployee = noOfHiredEmployee
        return this
    }


    /**
     * 设置「目标」值
     * @param val
     */
    HrJobDTO setNoOfRecruitment(Integer noOfRecruitment) {
        this.noOfRecruitment = noOfRecruitment
        return this
    }


    /**
     * 设置「旧申请」值
     * @param val
     */
    HrJobDTO setOldApplicationCount(Integer oldApplicationCount) {
        this.oldApplicationCount = oldApplicationCount
        return this
    }


    /**
     * 设置「要求」值
     * @param val
     */
    HrJobDTO setRequirements(String requirements) {
        this.requirements = requirements
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    HrJobDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「招聘人员」值
     * @param val
     */
    HrJobDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrJobDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrJobDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
