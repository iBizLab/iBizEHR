package cn.ibizlab.hr.hrcandidatefilterdetail.dto

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
class HrCandidateFilterDetailDTO extends GroovyDTO<HrCandidateFilterDetailDTO> {

    /**
     * 「类型」
     * 字典[推荐类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「状态」
     * 字典[候选人筛选状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「内容」
     */
    @JsonProperty("content")
    String content
    /**
     * 「备注」
     */
    @JsonProperty("memo")
    String memo
    /**
     * 「申请标识」
     */
    @JsonProperty("applicant_id")
    String applicantId
    /**
     * 「用户姓名」
     */
    @JsonProperty("user_name")
    String userName
    /**
     * 「职位名称」
     */
    @JsonProperty("job_name")
    String jobName
    /**
     * 「职位优先级」
     * 字典[职位优先级]
     */
    @JsonProperty("priority_id")
    String priorityId
    /**
     * 「申请日期」
     */
    @JsonProperty("applicant_create_date")
    Timestamp applicantCreateDate
    /**
     * 「反馈信息」
     */
    @JsonProperty("feedback_information")
    String feedbackInformation
    /**
     * 「所在地」
     */
    @JsonProperty("address")
    String address
    /**
     * 「工作经验」
     * 字典[工作经验]
     */
    @JsonProperty("experience")
    String experience
    /**
     * 「毕业院校」
     */
    @JsonProperty("last_edu_school")
    String lastEduSchool
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
     * 「教育程度」
     * 字典[教育程度]
     */
    @JsonProperty("education")
    String education
    /**
     * 「招聘平台」
     */
    @JsonProperty("job_platform_name")
    String jobPlatformName
    /**
     * 「候选人」
     */
    @JsonProperty("candidate_name")
    String candidateName
    /**
     * 「备注」
     */
    @JsonProperty("description")
    String description
    /**
     * 「教育程度」
     * 字典[教育程度]
     */
    @JsonProperty("last_edu_academic_degree")
    String lastEduAcademicDegree
    /**
     * 「候选人名称」
     */
    @JsonProperty("candidate_display_name")
    String candidateDisplayName
    /**
     * 「阶段名」
     */
    @JsonProperty("stage_name")
    String stageName
    /**
     * 「筛选」
     */
    @JsonProperty("candidate_filter_id")
    String candidateFilterId
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
     * 「人员」
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
     * 设置「类型」值
     * 字典[推荐类型]
     * @param val
     */
    HrCandidateFilterDetailDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「状态」值
     * 字典[候选人筛选状态]
     * @param val
     */
    HrCandidateFilterDetailDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「内容」值
     * @param val
     */
    HrCandidateFilterDetailDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    HrCandidateFilterDetailDTO setMemo(String memo) {
        this.memo = memo
        return this
    }


    /**
     * 设置「申请标识」值
     * @param val
     */
    HrCandidateFilterDetailDTO setApplicantId(String applicantId) {
        this.applicantId = applicantId
        return this
    }


    /**
     * 设置「用户姓名」值
     * @param val
     */
    HrCandidateFilterDetailDTO setUserName(String userName) {
        this.userName = userName
        return this
    }


    /**
     * 设置「职位名称」值
     * @param val
     */
    HrCandidateFilterDetailDTO setJobName(String jobName) {
        this.jobName = jobName
        return this
    }


    /**
     * 设置「职位优先级」值
     * 字典[职位优先级]
     * @param val
     */
    HrCandidateFilterDetailDTO setPriorityId(String priorityId) {
        this.priorityId = priorityId
        return this
    }


    /**
     * 设置「申请日期」值
     * @param val
     */
    HrCandidateFilterDetailDTO setApplicantCreateDate(Timestamp applicantCreateDate) {
        this.applicantCreateDate = applicantCreateDate
        return this
    }


    /**
     * 设置「反馈信息」值
     * @param val
     */
    HrCandidateFilterDetailDTO setFeedbackInformation(String feedbackInformation) {
        this.feedbackInformation = feedbackInformation
        return this
    }


    /**
     * 设置「所在地」值
     * @param val
     */
    HrCandidateFilterDetailDTO setAddress(String address) {
        this.address = address
        return this
    }


    /**
     * 设置「工作经验」值
     * 字典[工作经验]
     * @param val
     */
    HrCandidateFilterDetailDTO setExperience(String experience) {
        this.experience = experience
        return this
    }


    /**
     * 设置「毕业院校」值
     * @param val
     */
    HrCandidateFilterDetailDTO setLastEduSchool(String lastEduSchool) {
        this.lastEduSchool = lastEduSchool
        return this
    }


    /**
     * 设置「手机号」值
     * @param val
     */
    HrCandidateFilterDetailDTO setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone
        return this
    }


    /**
     * 设置「邮箱」值
     * @param val
     */
    HrCandidateFilterDetailDTO setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom
        return this
    }


    /**
     * 设置「教育程度」值
     * 字典[教育程度]
     * @param val
     */
    HrCandidateFilterDetailDTO setEducation(String education) {
        this.education = education
        return this
    }


    /**
     * 设置「招聘平台」值
     * @param val
     */
    HrCandidateFilterDetailDTO setJobPlatformName(String jobPlatformName) {
        this.jobPlatformName = jobPlatformName
        return this
    }


    /**
     * 设置「候选人」值
     * @param val
     */
    HrCandidateFilterDetailDTO setCandidateName(String candidateName) {
        this.candidateName = candidateName
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    HrCandidateFilterDetailDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「教育程度」值
     * 字典[教育程度]
     * @param val
     */
    HrCandidateFilterDetailDTO setLastEduAcademicDegree(String lastEduAcademicDegree) {
        this.lastEduAcademicDegree = lastEduAcademicDegree
        return this
    }


    /**
     * 设置「候选人名称」值
     * @param val
     */
    HrCandidateFilterDetailDTO setCandidateDisplayName(String candidateDisplayName) {
        this.candidateDisplayName = candidateDisplayName
        return this
    }


    /**
     * 设置「阶段名」值
     * @param val
     */
    HrCandidateFilterDetailDTO setStageName(String stageName) {
        this.stageName = stageName
        return this
    }


    /**
     * 设置「筛选」值
     * @param val
     */
    HrCandidateFilterDetailDTO setCandidateFilterId(String candidateFilterId) {
        this.candidateFilterId = candidateFilterId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrCandidateFilterDetailDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrCandidateFilterDetailDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrCandidateFilterDetailDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrCandidateFilterDetailDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「人员」值
     * @param val
     */
    HrCandidateFilterDetailDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrCandidateFilterDetailDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrCandidateFilterDetailDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
