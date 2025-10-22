package cn.ibizlab.hr.hroffer.dto

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
class HrOfferDTO extends GroovyDTO<HrOfferDTO> {

    /**
     * 「应聘岗位」
     */
    @JsonProperty("job_name")
    String jobName
    /**
     * 「职位级别」
     */
    @JsonProperty("job_rank_id")
    String jobRankId
    /**
     * 「工作地-市」
     */
    @JsonProperty("location_city")
    String locationCity
    /**
     * 「入职地点」
     */
    @JsonProperty("location_id")
    String locationId
    /**
     * 「招聘需求」
     */
    @JsonProperty("hr_idea_name")
    String hrIdeaName
    /**
     * 「预计入职日期」
     */
    @JsonProperty("checkindate")
    Timestamp checkindate
    /**
     * 「offer类型」
     */
    @JsonProperty("offer_type")
    String offerType
    /**
     * 「餐补」
     */
    @JsonProperty("meal_allowance")
    BigDecimal mealAllowance
    /**
     * 「餐补单位」
     */
    @JsonProperty("ma_currency")
    String maCurrency
    /**
     * 「薪资类型」
     */
    @JsonProperty("salary_type")
    String salaryType
    /**
     * 「候选人姓名」
     */
    @JsonProperty("candidate_display_name")
    String candidateDisplayName
    /**
     * 「审批附件」
     */
    @JsonProperty("approval_attachment")
    String approvalAttachment
    /**
     * 「薪酬分配方式」
     */
    @JsonProperty("salary_method")
    String salaryMethod
    /**
     * 「转正基本工资」
     */
    @JsonProperty("salary1")
    BigDecimal salary1
    /**
     * 「实习生绩效工资」
     */
    @JsonProperty("salary2")
    BigDecimal salary2
    /**
     * 「转正绩效工资」
     */
    @JsonProperty("salary3")
    BigDecimal salary3
    /**
     * 「试用期基本工资」
     */
    @JsonProperty("salary4")
    BigDecimal salary4
    /**
     * 「试用期绩效工资」
     */
    @JsonProperty("salary5")
    BigDecimal salary5
    /**
     * 「年度绩效奖金」
     */
    @JsonProperty("annual_performance_bonus")
    BigDecimal annualPerformanceBonus
    /**
     * 「实习期薪酬」
     */
    @JsonProperty("salary6")
    BigDecimal salary6
    /**
     * 「交通补贴」
     */
    @JsonProperty("transportation_allowance")
    BigDecimal transportationAllowance
    /**
     * 「通讯补贴」
     */
    @JsonProperty("communication_allowance")
    BigDecimal communicationAllowance
    /**
     * 「应聘人员所属公司」
     */
    @JsonProperty("current_employer")
    String currentEmployer
    /**
     * 「合同期限（年）」
     */
    @JsonProperty("contract_term")
    String contractTerm
    /**
     * 「工作时间（上午）」
     */
    @JsonProperty("working_hours_am")
    String workingHoursAm
    /**
     * 「工作时间（下午）」
     */
    @JsonProperty("working_hours_pm")
    String workingHoursPm
    /**
     * 「邮件模板」
     */
    @JsonProperty("email_template")
    String emailTemplate
    /**
     * 「邮件模版内容」
     */
    @JsonProperty("email_content")
    String emailContent
    /**
     * 「短信模板」
     */
    @JsonProperty("sms_template")
    String smsTemplate
    /**
     * 「短信模板内容」
     */
    @JsonProperty("sms_content")
    String smsContent
    /**
     * 「银行卡信息」
     */
    @JsonProperty("bank_card_info")
    String bankCardInfo
    /**
     * 「附件模版」
     */
    @JsonProperty("offer_attachment_template")
    String offerAttachmentTemplate
    /**
     * 「生成offer附件」
     * 字典[是否]
     */
    @JsonProperty("is_generate_attachment")
    Integer isGenerateAttachment
    /**
     * 「是否加密」
     * 字典[是否]
     */
    @JsonProperty("is_encrypted")
    Integer isEncrypted
    /**
     * 「附件密码」
     */
    @JsonProperty("attachment_password")
    String attachmentPassword
    /**
     * 「平台名称」
     */
    @JsonProperty("job_platform_name")
    String jobPlatformName
    /**
     * 「手机号」
     */
    @JsonProperty("mobile_phone")
    String mobilePhone
    /**
     * 「邮箱」
     */
    @JsonProperty("email_from")
    String emailFrom
    /**
     * 「工作经验」
     * 字典[工作经验]
     */
    @JsonProperty("experience")
    String experience
    /**
     * 「教育程度」
     * 字典[教育程度]
     */
    @JsonProperty("education")
    String education
    /**
     * 「所在地」
     */
    @JsonProperty("address")
    String address
    /**
     * 「候选人申请」
     */
    @JsonProperty("applicant_id")
    String applicantId
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
     * 「招聘需求标识」
     */
    @JsonProperty("hr_idea_id")
    String hrIdeaId
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
     * 「入职部门标识」
     */
    @JsonProperty("res_company_id")
    String resCompanyId
    /**
     * 「入职部门」
     */
    @JsonProperty("res_company_name")
    String resCompanyName
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
     * 设置「应聘岗位」值
     * @param val
     */
    HrOfferDTO setJobName(String jobName) {
        this.jobName = jobName
        return this
    }


    /**
     * 设置「职位级别」值
     * @param val
     */
    HrOfferDTO setJobRankId(String jobRankId) {
        this.jobRankId = jobRankId
        return this
    }


    /**
     * 设置「工作地-市」值
     * @param val
     */
    HrOfferDTO setLocationCity(String locationCity) {
        this.locationCity = locationCity
        return this
    }


    /**
     * 设置「入职地点」值
     * @param val
     */
    HrOfferDTO setLocationId(String locationId) {
        this.locationId = locationId
        return this
    }


    /**
     * 设置「招聘需求」值
     * @param val
     */
    HrOfferDTO setHrIdeaName(String hrIdeaName) {
        this.hrIdeaName = hrIdeaName
        return this
    }


    /**
     * 设置「预计入职日期」值
     * @param val
     */
    HrOfferDTO setCheckindate(Timestamp checkindate) {
        this.checkindate = checkindate
        return this
    }


    /**
     * 设置「offer类型」值
     * @param val
     */
    HrOfferDTO setOfferType(String offerType) {
        this.offerType = offerType
        return this
    }


    /**
     * 设置「餐补」值
     * @param val
     */
    HrOfferDTO setMealAllowance(BigDecimal mealAllowance) {
        this.mealAllowance = mealAllowance
        return this
    }


    /**
     * 设置「餐补单位」值
     * @param val
     */
    HrOfferDTO setMaCurrency(String maCurrency) {
        this.maCurrency = maCurrency
        return this
    }


    /**
     * 设置「薪资类型」值
     * @param val
     */
    HrOfferDTO setSalaryType(String salaryType) {
        this.salaryType = salaryType
        return this
    }


    /**
     * 设置「候选人姓名」值
     * @param val
     */
    HrOfferDTO setCandidateDisplayName(String candidateDisplayName) {
        this.candidateDisplayName = candidateDisplayName
        return this
    }


    /**
     * 设置「审批附件」值
     * @param val
     */
    HrOfferDTO setApprovalAttachment(String approvalAttachment) {
        this.approvalAttachment = approvalAttachment
        return this
    }


    /**
     * 设置「薪酬分配方式」值
     * @param val
     */
    HrOfferDTO setSalaryMethod(String salaryMethod) {
        this.salaryMethod = salaryMethod
        return this
    }


    /**
     * 设置「转正基本工资」值
     * @param val
     */
    HrOfferDTO setSalary1(BigDecimal salary1) {
        this.salary1 = salary1
        return this
    }


    /**
     * 设置「实习生绩效工资」值
     * @param val
     */
    HrOfferDTO setSalary2(BigDecimal salary2) {
        this.salary2 = salary2
        return this
    }


    /**
     * 设置「转正绩效工资」值
     * @param val
     */
    HrOfferDTO setSalary3(BigDecimal salary3) {
        this.salary3 = salary3
        return this
    }


    /**
     * 设置「试用期基本工资」值
     * @param val
     */
    HrOfferDTO setSalary4(BigDecimal salary4) {
        this.salary4 = salary4
        return this
    }


    /**
     * 设置「试用期绩效工资」值
     * @param val
     */
    HrOfferDTO setSalary5(BigDecimal salary5) {
        this.salary5 = salary5
        return this
    }


    /**
     * 设置「年度绩效奖金」值
     * @param val
     */
    HrOfferDTO setAnnualPerformanceBonus(BigDecimal annualPerformanceBonus) {
        this.annualPerformanceBonus = annualPerformanceBonus
        return this
    }


    /**
     * 设置「实习期薪酬」值
     * @param val
     */
    HrOfferDTO setSalary6(BigDecimal salary6) {
        this.salary6 = salary6
        return this
    }


    /**
     * 设置「交通补贴」值
     * @param val
     */
    HrOfferDTO setTransportationAllowance(BigDecimal transportationAllowance) {
        this.transportationAllowance = transportationAllowance
        return this
    }


    /**
     * 设置「通讯补贴」值
     * @param val
     */
    HrOfferDTO setCommunicationAllowance(BigDecimal communicationAllowance) {
        this.communicationAllowance = communicationAllowance
        return this
    }


    /**
     * 设置「应聘人员所属公司」值
     * @param val
     */
    HrOfferDTO setCurrentEmployer(String currentEmployer) {
        this.currentEmployer = currentEmployer
        return this
    }


    /**
     * 设置「合同期限（年）」值
     * @param val
     */
    HrOfferDTO setContractTerm(String contractTerm) {
        this.contractTerm = contractTerm
        return this
    }


    /**
     * 设置「工作时间（上午）」值
     * @param val
     */
    HrOfferDTO setWorkingHoursAm(String workingHoursAm) {
        this.workingHoursAm = workingHoursAm
        return this
    }


    /**
     * 设置「工作时间（下午）」值
     * @param val
     */
    HrOfferDTO setWorkingHoursPm(String workingHoursPm) {
        this.workingHoursPm = workingHoursPm
        return this
    }


    /**
     * 设置「邮件模板」值
     * @param val
     */
    HrOfferDTO setEmailTemplate(String emailTemplate) {
        this.emailTemplate = emailTemplate
        return this
    }


    /**
     * 设置「邮件模版内容」值
     * @param val
     */
    HrOfferDTO setEmailContent(String emailContent) {
        this.emailContent = emailContent
        return this
    }


    /**
     * 设置「短信模板」值
     * @param val
     */
    HrOfferDTO setSmsTemplate(String smsTemplate) {
        this.smsTemplate = smsTemplate
        return this
    }


    /**
     * 设置「短信模板内容」值
     * @param val
     */
    HrOfferDTO setSmsContent(String smsContent) {
        this.smsContent = smsContent
        return this
    }


    /**
     * 设置「银行卡信息」值
     * @param val
     */
    HrOfferDTO setBankCardInfo(String bankCardInfo) {
        this.bankCardInfo = bankCardInfo
        return this
    }


    /**
     * 设置「附件模版」值
     * @param val
     */
    HrOfferDTO setOfferAttachmentTemplate(String offerAttachmentTemplate) {
        this.offerAttachmentTemplate = offerAttachmentTemplate
        return this
    }


    /**
     * 设置「生成offer附件」值
     * 字典[是否]
     * @param val
     */
    HrOfferDTO setIsGenerateAttachment(Integer isGenerateAttachment) {
        this.isGenerateAttachment = isGenerateAttachment
        return this
    }


    /**
     * 设置「是否加密」值
     * 字典[是否]
     * @param val
     */
    HrOfferDTO setIsEncrypted(Integer isEncrypted) {
        this.isEncrypted = isEncrypted
        return this
    }


    /**
     * 设置「附件密码」值
     * @param val
     */
    HrOfferDTO setAttachmentPassword(String attachmentPassword) {
        this.attachmentPassword = attachmentPassword
        return this
    }


    /**
     * 设置「平台名称」值
     * @param val
     */
    HrOfferDTO setJobPlatformName(String jobPlatformName) {
        this.jobPlatformName = jobPlatformName
        return this
    }


    /**
     * 设置「手机号」值
     * @param val
     */
    HrOfferDTO setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone
        return this
    }


    /**
     * 设置「邮箱」值
     * @param val
     */
    HrOfferDTO setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom
        return this
    }


    /**
     * 设置「工作经验」值
     * 字典[工作经验]
     * @param val
     */
    HrOfferDTO setExperience(String experience) {
        this.experience = experience
        return this
    }


    /**
     * 设置「教育程度」值
     * 字典[教育程度]
     * @param val
     */
    HrOfferDTO setEducation(String education) {
        this.education = education
        return this
    }


    /**
     * 设置「所在地」值
     * @param val
     */
    HrOfferDTO setAddress(String address) {
        this.address = address
        return this
    }


    /**
     * 设置「候选人申请」值
     * @param val
     */
    HrOfferDTO setApplicantId(String applicantId) {
        this.applicantId = applicantId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrOfferDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrOfferDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「招聘需求标识」值
     * @param val
     */
    HrOfferDTO setHrIdeaId(String hrIdeaId) {
        this.hrIdeaId = hrIdeaId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrOfferDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrOfferDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「入职部门标识」值
     * @param val
     */
    HrOfferDTO setResCompanyId(String resCompanyId) {
        this.resCompanyId = resCompanyId
        return this
    }


    /**
     * 设置「入职部门」值
     * @param val
     */
    HrOfferDTO setResCompanyName(String resCompanyName) {
        this.resCompanyName = resCompanyName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrOfferDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrOfferDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
