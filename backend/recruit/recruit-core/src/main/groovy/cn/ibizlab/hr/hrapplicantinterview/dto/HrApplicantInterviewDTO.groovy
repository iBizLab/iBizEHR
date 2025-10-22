package cn.ibizlab.hr.hrapplicantinterview.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.hr.hrinterviewfeedback.dto.HrInterviewFeedbackDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class HrApplicantInterviewDTO extends GroovyDTO<HrApplicantInterviewDTO> {

    /**
     * 「面试阶段」
     * 字典[面试阶段]
     */
    @JsonProperty("stage_id")
    String stageId
    /**
     * 「面试时间」
     * 字典[面试开始时间]
     */
    @JsonProperty("start_time")
    String startTime
    /**
     * 「面试时长」
     * 字典[面试时长]
     */
    @JsonProperty("duration")
    String duration
    /**
     * 「候选人姓名」
     */
    @JsonProperty("candidate_display_name")
    String candidateDisplayName
    /**
     * 「应聘职位」
     */
    @JsonProperty("job_name")
    String jobName
    /**
     * 「候选人邮箱」
     */
    @JsonProperty("email_from")
    String emailFrom
    /**
     * 「招聘平台」
     */
    @JsonProperty("job_platform_id")
    String jobPlatformId
    /**
     * 「工作经验」
     * 字典[工作经验]
     */
    @JsonProperty("experience")
    String experience
    /**
     * 「所在地」
     */
    @JsonProperty("address")
    String address
    /**
     * 「教育程度」
     * 字典[教育程度]
     */
    @JsonProperty("education")
    String education
    /**
     * 「手机号」
     */
    @JsonProperty("mobile_phone")
    String mobilePhone
    /**
     * 「平台名称」
     */
    @JsonProperty("job_platform_name")
    String jobPlatformName
    /**
     * 「面试类型」
     * 字典[面试类型]
     */
    @JsonProperty("interview_type")
    String interviewType
    /**
     * 「面试时间」
     */
    @JsonProperty("start_date")
    Timestamp startDate
    /**
     * 「面试负责人」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「面试负责人」
     */
    @JsonProperty("owner_name")
    String ownerName
    /**
     * 「最高学位」
     * 字典[教育程度]
     */
    @JsonProperty("last_edu_academic_degree")
    String lastEduAcademicDegree
    /**
     * 「应聘职位」
     */
    @JsonProperty("job_id")
    String jobId
    /**
     * 「面试信息」
     */
    @JsonProperty("interview_info")
    String interviewInfo
    /**
     * 「备注」
     */
    @JsonProperty("description")
    String description
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
     * 「null」
     */
    @JsonProperty("interview_feedbacks")
    List<HrInterviewFeedbackDTO> interviewFeedbacks

    /**
     * 设置「面试阶段」值
     * 字典[面试阶段]
     * @param val
     */
    HrApplicantInterviewDTO setStageId(String stageId) {
        this.stageId = stageId
        return this
    }


    /**
     * 设置「面试时间」值
     * 字典[面试开始时间]
     * @param val
     */
    HrApplicantInterviewDTO setStartTime(String startTime) {
        this.startTime = startTime
        return this
    }


    /**
     * 设置「面试时长」值
     * 字典[面试时长]
     * @param val
     */
    HrApplicantInterviewDTO setDuration(String duration) {
        this.duration = duration
        return this
    }


    /**
     * 设置「候选人姓名」值
     * @param val
     */
    HrApplicantInterviewDTO setCandidateDisplayName(String candidateDisplayName) {
        this.candidateDisplayName = candidateDisplayName
        return this
    }


    /**
     * 设置「应聘职位」值
     * @param val
     */
    HrApplicantInterviewDTO setJobName(String jobName) {
        this.jobName = jobName
        return this
    }


    /**
     * 设置「候选人邮箱」值
     * @param val
     */
    HrApplicantInterviewDTO setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom
        return this
    }


    /**
     * 设置「招聘平台」值
     * @param val
     */
    HrApplicantInterviewDTO setJobPlatformId(String jobPlatformId) {
        this.jobPlatformId = jobPlatformId
        return this
    }


    /**
     * 设置「工作经验」值
     * 字典[工作经验]
     * @param val
     */
    HrApplicantInterviewDTO setExperience(String experience) {
        this.experience = experience
        return this
    }


    /**
     * 设置「所在地」值
     * @param val
     */
    HrApplicantInterviewDTO setAddress(String address) {
        this.address = address
        return this
    }


    /**
     * 设置「教育程度」值
     * 字典[教育程度]
     * @param val
     */
    HrApplicantInterviewDTO setEducation(String education) {
        this.education = education
        return this
    }


    /**
     * 设置「手机号」值
     * @param val
     */
    HrApplicantInterviewDTO setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone
        return this
    }


    /**
     * 设置「平台名称」值
     * @param val
     */
    HrApplicantInterviewDTO setJobPlatformName(String jobPlatformName) {
        this.jobPlatformName = jobPlatformName
        return this
    }


    /**
     * 设置「面试类型」值
     * 字典[面试类型]
     * @param val
     */
    HrApplicantInterviewDTO setInterviewType(String interviewType) {
        this.interviewType = interviewType
        return this
    }


    /**
     * 设置「面试时间」值
     * @param val
     */
    HrApplicantInterviewDTO setStartDate(Timestamp startDate) {
        this.startDate = startDate
        return this
    }


    /**
     * 设置「面试负责人」值
     * @param val
     */
    HrApplicantInterviewDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「面试负责人」值
     * @param val
     */
    HrApplicantInterviewDTO setOwnerName(String ownerName) {
        this.ownerName = ownerName
        return this
    }


    /**
     * 设置「最高学位」值
     * 字典[教育程度]
     * @param val
     */
    HrApplicantInterviewDTO setLastEduAcademicDegree(String lastEduAcademicDegree) {
        this.lastEduAcademicDegree = lastEduAcademicDegree
        return this
    }


    /**
     * 设置「应聘职位」值
     * @param val
     */
    HrApplicantInterviewDTO setJobId(String jobId) {
        this.jobId = jobId
        return this
    }


    /**
     * 设置「面试信息」值
     * @param val
     */
    HrApplicantInterviewDTO setInterviewInfo(String interviewInfo) {
        this.interviewInfo = interviewInfo
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    HrApplicantInterviewDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「候选人申请」值
     * @param val
     */
    HrApplicantInterviewDTO setApplicantId(String applicantId) {
        this.applicantId = applicantId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrApplicantInterviewDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrApplicantInterviewDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrApplicantInterviewDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「面试」值
     * @param val
     */
    HrApplicantInterviewDTO setInterviewId(String interviewId) {
        this.interviewId = interviewId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrApplicantInterviewDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrApplicantInterviewDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrApplicantInterviewDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    HrApplicantInterviewDTO setInterviewFeedbacks(List<HrInterviewFeedbackDTO> interviewFeedbacks) {
        this.interviewFeedbacks = interviewFeedbacks
        return this
    }

}
