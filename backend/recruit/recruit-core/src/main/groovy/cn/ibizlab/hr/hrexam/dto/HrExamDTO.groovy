package cn.ibizlab.hr.hrexam.dto

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
class HrExamDTO extends GroovyDTO<HrExamDTO> {

    /**
     * 「类型」
     * 字典[考试评测类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「服务商」
     */
    @JsonProperty("source")
    String source
    /**
     * 「发给候选人的测评链接」
     */
    @JsonProperty("answer_link")
    String answerLink
    /**
     * 「完成时间」
     */
    @JsonProperty("finish_time")
    Timestamp finishTime
    /**
     * 「考试状态」
     * 字典[考试状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「考试测评结果」
     */
    @JsonProperty("result")
    String result
    /**
     * 「详细成绩」
     */
    @JsonProperty("detail_result")
    String detailResult
    /**
     * 「发起时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「职位」
     */
    @JsonProperty("job_name")
    String jobName
    /**
     * 「报告」
     */
    @JsonProperty("attachment")
    String attachment
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
     * 「教育程度」
     * 字典[教育程度]
     */
    @JsonProperty("last_edu_academic_degree")
    String lastEduAcademicDegree
    /**
     * 「备注」
     */
    @JsonProperty("description")
    String description
    /**
     * 「考试」
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
     * 设置「类型」值
     * 字典[考试评测类型]
     * @param val
     */
    HrExamDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「服务商」值
     * @param val
     */
    HrExamDTO setSource(String source) {
        this.source = source
        return this
    }


    /**
     * 设置「发给候选人的测评链接」值
     * @param val
     */
    HrExamDTO setAnswerLink(String answerLink) {
        this.answerLink = answerLink
        return this
    }


    /**
     * 设置「完成时间」值
     * @param val
     */
    HrExamDTO setFinishTime(Timestamp finishTime) {
        this.finishTime = finishTime
        return this
    }


    /**
     * 设置「考试状态」值
     * 字典[考试状态]
     * @param val
     */
    HrExamDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「考试测评结果」值
     * @param val
     */
    HrExamDTO setResult(String result) {
        this.result = result
        return this
    }


    /**
     * 设置「详细成绩」值
     * @param val
     */
    HrExamDTO setDetailResult(String detailResult) {
        this.detailResult = detailResult
        return this
    }


    /**
     * 设置「发起时间」值
     * @param val
     */
    HrExamDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「职位」值
     * @param val
     */
    HrExamDTO setJobName(String jobName) {
        this.jobName = jobName
        return this
    }


    /**
     * 设置「报告」值
     * @param val
     */
    HrExamDTO setAttachment(String attachment) {
        this.attachment = attachment
        return this
    }


    /**
     * 设置「候选人名称」值
     * @param val
     */
    HrExamDTO setCandidateDisplayName(String candidateDisplayName) {
        this.candidateDisplayName = candidateDisplayName
        return this
    }


    /**
     * 设置「平台名称」值
     * @param val
     */
    HrExamDTO setJobPlatformName(String jobPlatformName) {
        this.jobPlatformName = jobPlatformName
        return this
    }


    /**
     * 设置「手机号」值
     * @param val
     */
    HrExamDTO setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone
        return this
    }


    /**
     * 设置「邮箱」值
     * @param val
     */
    HrExamDTO setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom
        return this
    }


    /**
     * 设置「工作经验」值
     * 字典[工作经验]
     * @param val
     */
    HrExamDTO setExperience(String experience) {
        this.experience = experience
        return this
    }


    /**
     * 设置「教育程度」值
     * 字典[教育程度]
     * @param val
     */
    HrExamDTO setEducation(String education) {
        this.education = education
        return this
    }


    /**
     * 设置「所在地」值
     * @param val
     */
    HrExamDTO setAddress(String address) {
        this.address = address
        return this
    }


    /**
     * 设置「教育程度」值
     * 字典[教育程度]
     * @param val
     */
    HrExamDTO setLastEduAcademicDegree(String lastEduAcademicDegree) {
        this.lastEduAcademicDegree = lastEduAcademicDegree
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    HrExamDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「考试」值
     * @param val
     */
    HrExamDTO setApplicantId(String applicantId) {
        this.applicantId = applicantId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrExamDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrExamDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrExamDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrExamDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrExamDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrExamDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
