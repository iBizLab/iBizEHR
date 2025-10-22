package cn.ibizlab.hr.hrapplicant.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.hr.hrcandidateeducation.dto.HrCandidateEducationDTO
import cn.ibizlab.hr.hrcandidateexperience.dto.HrCandidateExperienceDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class HrApplicantDTO extends GroovyDTO<HrApplicantDTO> {

    /**
     * 「是否星标」
     * 字典[是否]
     */
    @JsonProperty("is_favorite")
    String isFavorite
    /**
     * 「工作经验」
     * 字典[工作经验]
     */
    @JsonProperty("experience")
    String experience
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「候选人邮箱」
     */
    @JsonProperty("email_from")
    String emailFrom
    /**
     * 「候选人手机号」
     */
    @JsonProperty("mobile_phone")
    String mobilePhone
    /**
     * 「教育程度」
     * 字典[教育程度]
     */
    @JsonProperty("education")
    String education
    /**
     * 「候选人姓名」
     */
    @JsonProperty("candidate_display_name")
    String candidateDisplayName
    /**
     * 「候选人所在地」
     */
    @JsonProperty("address")
    String address
    /**
     * 「简历来源」
     * 字典[简历来源]
     */
    @JsonProperty("resume_source")
    String resumeSource
    /**
     * 「出生日期」
     */
    @JsonProperty("birthday")
    String birthday
    /**
     * 「性别」
     * 字典[候选人性别]
     */
    @JsonProperty("gender")
    String gender
    /**
     * 「最近工作公司」
     */
    @JsonProperty("last_exp_company")
    String lastExpCompany
    /**
     * 「最近工作岗位」
     */
    @JsonProperty("last_exp_job")
    String lastExpJob
    /**
     * 「最近工作时间」
     */
    @JsonProperty("last_exp_date")
    String lastExpDate
    /**
     * 「毕业院校」
     */
    @JsonProperty("last_edu_school")
    String lastEduSchool
    /**
     * 「所学专业」
     */
    @JsonProperty("last_edu_speciality")
    String lastEduSpeciality
    /**
     * 「最高学位」
     * 字典[教育程度]
     */
    @JsonProperty("last_edu_academic_degree")
    String lastEduAcademicDegree
    /**
     * 「毕业时间」
     */
    @JsonProperty("last_edu_date")
    String lastEduDate
    /**
     * 「职位优先级」
     * 字典[职位优先级]
     */
    @JsonProperty("priority_id")
    String priorityId
    /**
     * 「候选人标签」
     */
    @JsonProperty("tags")
    String tags
    /**
     * 「招聘流程」
     */
    @JsonProperty("progress_id")
    String progressId
    /**
     * 「候选人照片」
     */
    @JsonProperty("image")
    String image
    /**
     * 「候选人名称」
     */
    @JsonProperty("candidate_name")
    String candidateName
    /**
     * 「上传至人才库」
     * 字典[上传至人才库]
     */
    @JsonProperty("save_to_telent_pool")
    String saveToTelentPool
    /**
     * 「招聘阶段序号」
     */
    @JsonProperty("stage_sequence")
    Integer stageSequence
    /**
     * 「申请状态」
     * 字典[候选人申请状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「阶段名」
     */
    @JsonProperty("stage_name")
    String stageName
    /**
     * 「招聘流程类型」
     */
    @JsonProperty("flow_type")
    String flowType
    /**
     * 「已推荐」
     */
    @JsonProperty("is_recommended")
    String isRecommended
    /**
     * 「已发送offer」
     */
    @JsonProperty("is_offer")
    String isOffer
    /**
     * 「用人经理」
     */
    @JsonProperty("manager_uid")
    String managerUid
    /**
     * 「申请人备注」
     */
    @JsonProperty("applicant_notes")
    String applicantNotes
    /**
     * 「候选人」
     */
    @JsonProperty("candidate_id")
    String candidateId
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
     * 「求职岗位」
     */
    @JsonProperty("job_id")
    String jobId
    /**
     * 「求职岗位名称」
     */
    @JsonProperty("job_name")
    String jobName
    /**
     * 「招聘平台」
     */
    @JsonProperty("job_platform_id")
    String jobPlatformId
    /**
     * 「招聘平台名称」
     */
    @JsonProperty("job_platform_name")
    String jobPlatformName
    /**
     * 「招聘负责人」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「招聘负责人名称」
     */
    @JsonProperty("owner_name")
    String ownerName
    /**
     * 「期望薪资」
     */
    @JsonProperty("salary_expected")
    Double salaryExpected
    /**
     * 「建议薪资」
     */
    @JsonProperty("salary_proposed")
    Double salaryProposed
    /**
     * 「招聘阶段」
     * 字典[招聘阶段]
     */
    @JsonProperty("stage_id")
    String stageId
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
    @JsonProperty("hr_candidate_educations")
    List<HrCandidateEducationDTO> hrCandidateEducations
    /**
     * 「null」
     */
    @JsonProperty("hr_candidate_experiences")
    List<HrCandidateExperienceDTO> hrCandidateExperiences

    /**
     * 设置「是否星标」值
     * 字典[是否]
     * @param val
     */
    HrApplicantDTO setIsFavorite(String isFavorite) {
        this.isFavorite = isFavorite
        return this
    }


    /**
     * 设置「工作经验」值
     * 字典[工作经验]
     * @param val
     */
    HrApplicantDTO setExperience(String experience) {
        this.experience = experience
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    HrApplicantDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「候选人邮箱」值
     * @param val
     */
    HrApplicantDTO setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom
        return this
    }


    /**
     * 设置「候选人手机号」值
     * @param val
     */
    HrApplicantDTO setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone
        return this
    }


    /**
     * 设置「教育程度」值
     * 字典[教育程度]
     * @param val
     */
    HrApplicantDTO setEducation(String education) {
        this.education = education
        return this
    }


    /**
     * 设置「候选人姓名」值
     * @param val
     */
    HrApplicantDTO setCandidateDisplayName(String candidateDisplayName) {
        this.candidateDisplayName = candidateDisplayName
        return this
    }


    /**
     * 设置「候选人所在地」值
     * @param val
     */
    HrApplicantDTO setAddress(String address) {
        this.address = address
        return this
    }


    /**
     * 设置「简历来源」值
     * 字典[简历来源]
     * @param val
     */
    HrApplicantDTO setResumeSource(String resumeSource) {
        this.resumeSource = resumeSource
        return this
    }


    /**
     * 设置「出生日期」值
     * @param val
     */
    HrApplicantDTO setBirthday(String birthday) {
        this.birthday = birthday
        return this
    }


    /**
     * 设置「性别」值
     * 字典[候选人性别]
     * @param val
     */
    HrApplicantDTO setGender(String gender) {
        this.gender = gender
        return this
    }


    /**
     * 设置「最近工作公司」值
     * @param val
     */
    HrApplicantDTO setLastExpCompany(String lastExpCompany) {
        this.lastExpCompany = lastExpCompany
        return this
    }


    /**
     * 设置「最近工作岗位」值
     * @param val
     */
    HrApplicantDTO setLastExpJob(String lastExpJob) {
        this.lastExpJob = lastExpJob
        return this
    }


    /**
     * 设置「最近工作时间」值
     * @param val
     */
    HrApplicantDTO setLastExpDate(String lastExpDate) {
        this.lastExpDate = lastExpDate
        return this
    }


    /**
     * 设置「毕业院校」值
     * @param val
     */
    HrApplicantDTO setLastEduSchool(String lastEduSchool) {
        this.lastEduSchool = lastEduSchool
        return this
    }


    /**
     * 设置「所学专业」值
     * @param val
     */
    HrApplicantDTO setLastEduSpeciality(String lastEduSpeciality) {
        this.lastEduSpeciality = lastEduSpeciality
        return this
    }


    /**
     * 设置「最高学位」值
     * 字典[教育程度]
     * @param val
     */
    HrApplicantDTO setLastEduAcademicDegree(String lastEduAcademicDegree) {
        this.lastEduAcademicDegree = lastEduAcademicDegree
        return this
    }


    /**
     * 设置「毕业时间」值
     * @param val
     */
    HrApplicantDTO setLastEduDate(String lastEduDate) {
        this.lastEduDate = lastEduDate
        return this
    }


    /**
     * 设置「职位优先级」值
     * 字典[职位优先级]
     * @param val
     */
    HrApplicantDTO setPriorityId(String priorityId) {
        this.priorityId = priorityId
        return this
    }


    /**
     * 设置「候选人标签」值
     * @param val
     */
    HrApplicantDTO setTags(String tags) {
        this.tags = tags
        return this
    }


    /**
     * 设置「招聘流程」值
     * @param val
     */
    HrApplicantDTO setProgressId(String progressId) {
        this.progressId = progressId
        return this
    }


    /**
     * 设置「候选人照片」值
     * @param val
     */
    HrApplicantDTO setImage(String image) {
        this.image = image
        return this
    }


    /**
     * 设置「候选人名称」值
     * @param val
     */
    HrApplicantDTO setCandidateName(String candidateName) {
        this.candidateName = candidateName
        return this
    }


    /**
     * 设置「上传至人才库」值
     * 字典[上传至人才库]
     * @param val
     */
    HrApplicantDTO setSaveToTelentPool(String saveToTelentPool) {
        this.saveToTelentPool = saveToTelentPool
        return this
    }


    /**
     * 设置「招聘阶段序号」值
     * @param val
     */
    HrApplicantDTO setStageSequence(Integer stageSequence) {
        this.stageSequence = stageSequence
        return this
    }


    /**
     * 设置「申请状态」值
     * 字典[候选人申请状态]
     * @param val
     */
    HrApplicantDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「阶段名」值
     * @param val
     */
    HrApplicantDTO setStageName(String stageName) {
        this.stageName = stageName
        return this
    }


    /**
     * 设置「招聘流程类型」值
     * @param val
     */
    HrApplicantDTO setFlowType(String flowType) {
        this.flowType = flowType
        return this
    }


    /**
     * 设置「已推荐」值
     * @param val
     */
    HrApplicantDTO setIsRecommended(String isRecommended) {
        this.isRecommended = isRecommended
        return this
    }


    /**
     * 设置「已发送offer」值
     * @param val
     */
    HrApplicantDTO setIsOffer(String isOffer) {
        this.isOffer = isOffer
        return this
    }


    /**
     * 设置「用人经理」值
     * @param val
     */
    HrApplicantDTO setManagerUid(String managerUid) {
        this.managerUid = managerUid
        return this
    }


    /**
     * 设置「申请人备注」值
     * @param val
     */
    HrApplicantDTO setApplicantNotes(String applicantNotes) {
        this.applicantNotes = applicantNotes
        return this
    }


    /**
     * 设置「候选人」值
     * @param val
     */
    HrApplicantDTO setCandidateId(String candidateId) {
        this.candidateId = candidateId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrApplicantDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrApplicantDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrApplicantDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「求职岗位」值
     * @param val
     */
    HrApplicantDTO setJobId(String jobId) {
        this.jobId = jobId
        return this
    }


    /**
     * 设置「求职岗位名称」值
     * @param val
     */
    HrApplicantDTO setJobName(String jobName) {
        this.jobName = jobName
        return this
    }


    /**
     * 设置「招聘平台」值
     * @param val
     */
    HrApplicantDTO setJobPlatformId(String jobPlatformId) {
        this.jobPlatformId = jobPlatformId
        return this
    }


    /**
     * 设置「招聘平台名称」值
     * @param val
     */
    HrApplicantDTO setJobPlatformName(String jobPlatformName) {
        this.jobPlatformName = jobPlatformName
        return this
    }


    /**
     * 设置「招聘负责人」值
     * @param val
     */
    HrApplicantDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「招聘负责人名称」值
     * @param val
     */
    HrApplicantDTO setOwnerName(String ownerName) {
        this.ownerName = ownerName
        return this
    }


    /**
     * 设置「期望薪资」值
     * @param val
     */
    HrApplicantDTO setSalaryExpected(Double salaryExpected) {
        this.salaryExpected = salaryExpected
        return this
    }


    /**
     * 设置「建议薪资」值
     * @param val
     */
    HrApplicantDTO setSalaryProposed(Double salaryProposed) {
        this.salaryProposed = salaryProposed
        return this
    }


    /**
     * 设置「招聘阶段」值
     * 字典[招聘阶段]
     * @param val
     */
    HrApplicantDTO setStageId(String stageId) {
        this.stageId = stageId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrApplicantDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrApplicantDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    HrApplicantDTO setHrCandidateEducations(List<HrCandidateEducationDTO> hrCandidateEducations) {
        this.hrCandidateEducations = hrCandidateEducations
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    HrApplicantDTO setHrCandidateExperiences(List<HrCandidateExperienceDTO> hrCandidateExperiences) {
        this.hrCandidateExperiences = hrCandidateExperiences
        return this
    }

}
