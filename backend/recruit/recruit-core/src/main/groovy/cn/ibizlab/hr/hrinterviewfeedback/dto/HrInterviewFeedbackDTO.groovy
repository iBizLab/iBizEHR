package cn.ibizlab.hr.hrinterviewfeedback.dto

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
class HrInterviewFeedbackDTO extends GroovyDTO<HrInterviewFeedbackDTO> {

    /**
     * 「面试结果」
     * 字典[面试结果]
     */
    @JsonProperty("result_type")
    String resultType
    /**
     * 「是否可进入下轮面试」
     * 字典[是否]
     */
    @JsonProperty("is_next_round")
    Integer isNextRound
    /**
     * 「会议链接」
     */
    @JsonProperty("video_url")
    String videoUrl
    /**
     * 「应聘职位」
     */
    @JsonProperty("job_id")
    String jobId
    /**
     * 「面试负责人」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「面试类型」
     * 字典[面试类型]
     */
    @JsonProperty("interview_type")
    String interviewType
    /**
     * 「面试地点」
     */
    @JsonProperty("address_id")
    String addressId
    /**
     * 「候选人名称」
     */
    @JsonProperty("candidate_display_name")
    String candidateDisplayName
    /**
     * 「联系方式」
     */
    @JsonProperty("mobile_phone")
    String mobilePhone
    /**
     * 「应聘职位」
     */
    @JsonProperty("job_name")
    String jobName
    /**
     * 「面试负责人」
     */
    @JsonProperty("owner_name")
    String ownerName
    /**
     * 「面试日期」
     */
    @JsonProperty("start_date")
    Timestamp startDate
    /**
     * 「面试阶段」
     * 字典[面试阶段]
     */
    @JsonProperty("stage_id")
    String stageId
    /**
     * 「申请与面试关系」
     */
    @JsonProperty("applicant_interview_id")
    String applicantInterviewId
    /**
     * 「面试时间」
     * 字典[面试开始时间]
     */
    @JsonProperty("start_time")
    String startTime
    /**
     * 「平台名称」
     */
    @JsonProperty("job_platform_name")
    String jobPlatformName
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
     * 「最高学位」
     * 字典[教育程度]
     */
    @JsonProperty("last_edu_academic_degree")
    String lastEduAcademicDegree
    /**
     * 「所在地」
     */
    @JsonProperty("address")
    String address
    /**
     * 「备注」
     */
    @JsonProperty("description")
    String description
    /**
     * 「面试状态」
     * 字典[面试状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「距今」
     */
    @JsonProperty("daycalc")
    Integer daycalc
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
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「面试」
     */
    @JsonProperty("interview_id")
    String interviewId
    /**
     * 「面试官」
     */
    @JsonProperty("interview_user_id")
    String interviewUserId
    /**
     * 「面试官」
     */
    @JsonProperty("interviewer_id")
    String interviewerId
    /**
     * 「面试官」
     */
    @JsonProperty("interviewer_name")
    String interviewerName
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
     * 设置「面试结果」值
     * 字典[面试结果]
     * @param val
     */
    HrInterviewFeedbackDTO setResultType(String resultType) {
        this.resultType = resultType
        return this
    }


    /**
     * 设置「是否可进入下轮面试」值
     * 字典[是否]
     * @param val
     */
    HrInterviewFeedbackDTO setIsNextRound(Integer isNextRound) {
        this.isNextRound = isNextRound
        return this
    }


    /**
     * 设置「会议链接」值
     * @param val
     */
    HrInterviewFeedbackDTO setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl
        return this
    }


    /**
     * 设置「应聘职位」值
     * @param val
     */
    HrInterviewFeedbackDTO setJobId(String jobId) {
        this.jobId = jobId
        return this
    }


    /**
     * 设置「面试负责人」值
     * @param val
     */
    HrInterviewFeedbackDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「面试类型」值
     * 字典[面试类型]
     * @param val
     */
    HrInterviewFeedbackDTO setInterviewType(String interviewType) {
        this.interviewType = interviewType
        return this
    }


    /**
     * 设置「面试地点」值
     * @param val
     */
    HrInterviewFeedbackDTO setAddressId(String addressId) {
        this.addressId = addressId
        return this
    }


    /**
     * 设置「候选人名称」值
     * @param val
     */
    HrInterviewFeedbackDTO setCandidateDisplayName(String candidateDisplayName) {
        this.candidateDisplayName = candidateDisplayName
        return this
    }


    /**
     * 设置「联系方式」值
     * @param val
     */
    HrInterviewFeedbackDTO setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone
        return this
    }


    /**
     * 设置「应聘职位」值
     * @param val
     */
    HrInterviewFeedbackDTO setJobName(String jobName) {
        this.jobName = jobName
        return this
    }


    /**
     * 设置「面试负责人」值
     * @param val
     */
    HrInterviewFeedbackDTO setOwnerName(String ownerName) {
        this.ownerName = ownerName
        return this
    }


    /**
     * 设置「面试日期」值
     * @param val
     */
    HrInterviewFeedbackDTO setStartDate(Timestamp startDate) {
        this.startDate = startDate
        return this
    }


    /**
     * 设置「面试阶段」值
     * 字典[面试阶段]
     * @param val
     */
    HrInterviewFeedbackDTO setStageId(String stageId) {
        this.stageId = stageId
        return this
    }


    /**
     * 设置「申请与面试关系」值
     * @param val
     */
    HrInterviewFeedbackDTO setApplicantInterviewId(String applicantInterviewId) {
        this.applicantInterviewId = applicantInterviewId
        return this
    }


    /**
     * 设置「面试时间」值
     * 字典[面试开始时间]
     * @param val
     */
    HrInterviewFeedbackDTO setStartTime(String startTime) {
        this.startTime = startTime
        return this
    }


    /**
     * 设置「平台名称」值
     * @param val
     */
    HrInterviewFeedbackDTO setJobPlatformName(String jobPlatformName) {
        this.jobPlatformName = jobPlatformName
        return this
    }


    /**
     * 设置「邮箱」值
     * @param val
     */
    HrInterviewFeedbackDTO setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom
        return this
    }


    /**
     * 设置「工作经验」值
     * 字典[工作经验]
     * @param val
     */
    HrInterviewFeedbackDTO setExperience(String experience) {
        this.experience = experience
        return this
    }


    /**
     * 设置「最高学位」值
     * 字典[教育程度]
     * @param val
     */
    HrInterviewFeedbackDTO setLastEduAcademicDegree(String lastEduAcademicDegree) {
        this.lastEduAcademicDegree = lastEduAcademicDegree
        return this
    }


    /**
     * 设置「所在地」值
     * @param val
     */
    HrInterviewFeedbackDTO setAddress(String address) {
        this.address = address
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    HrInterviewFeedbackDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「面试状态」值
     * 字典[面试状态]
     * @param val
     */
    HrInterviewFeedbackDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「距今」值
     * @param val
     */
    HrInterviewFeedbackDTO setDaycalc(Integer daycalc) {
        this.daycalc = daycalc
        return this
    }


    /**
     * 设置「候选人申请」值
     * @param val
     */
    HrInterviewFeedbackDTO setApplicantId(String applicantId) {
        this.applicantId = applicantId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrInterviewFeedbackDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrInterviewFeedbackDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrInterviewFeedbackDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「面试」值
     * @param val
     */
    HrInterviewFeedbackDTO setInterviewId(String interviewId) {
        this.interviewId = interviewId
        return this
    }


    /**
     * 设置「面试官」值
     * @param val
     */
    HrInterviewFeedbackDTO setInterviewUserId(String interviewUserId) {
        this.interviewUserId = interviewUserId
        return this
    }


    /**
     * 设置「面试官」值
     * @param val
     */
    HrInterviewFeedbackDTO setInterviewerId(String interviewerId) {
        this.interviewerId = interviewerId
        return this
    }


    /**
     * 设置「面试官」值
     * @param val
     */
    HrInterviewFeedbackDTO setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrInterviewFeedbackDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrInterviewFeedbackDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrInterviewFeedbackDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
