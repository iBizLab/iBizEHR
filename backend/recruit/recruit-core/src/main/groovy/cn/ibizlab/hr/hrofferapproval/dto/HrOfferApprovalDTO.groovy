package cn.ibizlab.hr.hrofferapproval.dto

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
class HrOfferApprovalDTO extends GroovyDTO<HrOfferApprovalDTO> {

    /**
     * 「候选人名称」
     */
    @JsonProperty("candidate_display_name")
    String candidateDisplayName
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
     * 「审核结果状态」
     * 字典[offer审核结果状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「应聘职位」
     */
    @JsonProperty("job_name")
    String jobName
    /**
     * 「入职部门」
     */
    @JsonProperty("res_company_name")
    String resCompanyName
    /**
     * 「审批状态」
     * 字典[offer审核状态]
     */
    @JsonProperty("period")
    String period
    /**
     * 「审核信息」
     */
    @JsonProperty("wfmemo")
    String wfmemo
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
     * 「offer标识」
     */
    @JsonProperty("hr_offer_id")
    String hrOfferId
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
     * 设置「候选人名称」值
     * @param val
     */
    HrOfferApprovalDTO setCandidateDisplayName(String candidateDisplayName) {
        this.candidateDisplayName = candidateDisplayName
        return this
    }


    /**
     * 设置「平台名称」值
     * @param val
     */
    HrOfferApprovalDTO setJobPlatformName(String jobPlatformName) {
        this.jobPlatformName = jobPlatformName
        return this
    }


    /**
     * 设置「手机号」值
     * @param val
     */
    HrOfferApprovalDTO setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone
        return this
    }


    /**
     * 设置「邮箱」值
     * @param val
     */
    HrOfferApprovalDTO setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom
        return this
    }


    /**
     * 设置「工作经验」值
     * 字典[工作经验]
     * @param val
     */
    HrOfferApprovalDTO setExperience(String experience) {
        this.experience = experience
        return this
    }


    /**
     * 设置「教育程度」值
     * 字典[教育程度]
     * @param val
     */
    HrOfferApprovalDTO setEducation(String education) {
        this.education = education
        return this
    }


    /**
     * 设置「所在地」值
     * @param val
     */
    HrOfferApprovalDTO setAddress(String address) {
        this.address = address
        return this
    }


    /**
     * 设置「审核结果状态」值
     * 字典[offer审核结果状态]
     * @param val
     */
    HrOfferApprovalDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「应聘职位」值
     * @param val
     */
    HrOfferApprovalDTO setJobName(String jobName) {
        this.jobName = jobName
        return this
    }


    /**
     * 设置「入职部门」值
     * @param val
     */
    HrOfferApprovalDTO setResCompanyName(String resCompanyName) {
        this.resCompanyName = resCompanyName
        return this
    }


    /**
     * 设置「审批状态」值
     * 字典[offer审核状态]
     * @param val
     */
    HrOfferApprovalDTO setPeriod(String period) {
        this.period = period
        return this
    }


    /**
     * 设置「审核信息」值
     * @param val
     */
    HrOfferApprovalDTO setWfmemo(String wfmemo) {
        this.wfmemo = wfmemo
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrOfferApprovalDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrOfferApprovalDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「offer标识」值
     * @param val
     */
    HrOfferApprovalDTO setHrOfferId(String hrOfferId) {
        this.hrOfferId = hrOfferId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrOfferApprovalDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrOfferApprovalDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrOfferApprovalDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrOfferApprovalDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
