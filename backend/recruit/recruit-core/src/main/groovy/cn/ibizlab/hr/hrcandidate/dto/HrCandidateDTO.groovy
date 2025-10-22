package cn.ibizlab.hr.hrcandidate.dto

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
class HrCandidateDTO extends GroovyDTO<HrCandidateDTO> {

    /**
     * 「工作经验」
     * 字典[工作经验]
     */
    @JsonProperty("experience")
    String experience
    /**
     * 「户籍地址」
     */
    @JsonProperty("address_id")
    String addressId
    /**
     * 「出生日期」
     */
    @JsonProperty("birthday")
    String birthday
    /**
     * 「手机号」
     */
    @JsonProperty("mobile_phone")
    String mobilePhone
    /**
     * 「教育程度」
     * 字典[学历要求]
     */
    @JsonProperty("education")
    String education
    /**
     * 「性别」
     * 字典[候选人性别]
     */
    @JsonProperty("gender")
    String gender
    /**
     * 「申请日期」
     */
    @JsonProperty("last_tp_applied_at")
    Timestamp lastTpAppliedAt
    /**
     * 「申请职位」
     */
    @JsonProperty("last_tp_job_name")
    String lastTpJobName
    /**
     * 「归档人才库」
     */
    @JsonProperty("last_tp_talent_pool")
    String lastTpTalentPool
    /**
     * 「归档日期」
     */
    @JsonProperty("last_tp_archived_at")
    Timestamp lastTpArchivedAt
    /**
     * 「归档原因」
     */
    @JsonProperty("last_tp_archive_reason")
    String lastTpArchiveReason
    /**
     * 「归档详细原因」
     */
    @JsonProperty("last_tp_archive_reason_detail")
    String lastTpArchiveReasonDetail
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
     * 「人才库候选人数量」
     */
    @JsonProperty("talent_pool_count")
    Integer talentPoolCount
    /**
     * 「最新标签」
     */
    @JsonProperty("last_tags")
    String lastTags
    /**
     * 「归档前阶段」
     */
    @JsonProperty("last_tp_stage_name")
    String lastTpStageName
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
     * 「邮箱」
     */
    @JsonProperty("email_from")
    String emailFrom
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「候选人姓名」
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
     * 设置「工作经验」值
     * 字典[工作经验]
     * @param val
     */
    HrCandidateDTO setExperience(String experience) {
        this.experience = experience
        return this
    }


    /**
     * 设置「户籍地址」值
     * @param val
     */
    HrCandidateDTO setAddressId(String addressId) {
        this.addressId = addressId
        return this
    }


    /**
     * 设置「出生日期」值
     * @param val
     */
    HrCandidateDTO setBirthday(String birthday) {
        this.birthday = birthday
        return this
    }


    /**
     * 设置「手机号」值
     * @param val
     */
    HrCandidateDTO setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone
        return this
    }


    /**
     * 设置「教育程度」值
     * 字典[学历要求]
     * @param val
     */
    HrCandidateDTO setEducation(String education) {
        this.education = education
        return this
    }


    /**
     * 设置「性别」值
     * 字典[候选人性别]
     * @param val
     */
    HrCandidateDTO setGender(String gender) {
        this.gender = gender
        return this
    }


    /**
     * 设置「申请日期」值
     * @param val
     */
    HrCandidateDTO setLastTpAppliedAt(Timestamp lastTpAppliedAt) {
        this.lastTpAppliedAt = lastTpAppliedAt
        return this
    }


    /**
     * 设置「申请职位」值
     * @param val
     */
    HrCandidateDTO setLastTpJobName(String lastTpJobName) {
        this.lastTpJobName = lastTpJobName
        return this
    }


    /**
     * 设置「归档人才库」值
     * @param val
     */
    HrCandidateDTO setLastTpTalentPool(String lastTpTalentPool) {
        this.lastTpTalentPool = lastTpTalentPool
        return this
    }


    /**
     * 设置「归档日期」值
     * @param val
     */
    HrCandidateDTO setLastTpArchivedAt(Timestamp lastTpArchivedAt) {
        this.lastTpArchivedAt = lastTpArchivedAt
        return this
    }


    /**
     * 设置「归档原因」值
     * @param val
     */
    HrCandidateDTO setLastTpArchiveReason(String lastTpArchiveReason) {
        this.lastTpArchiveReason = lastTpArchiveReason
        return this
    }


    /**
     * 设置「归档详细原因」值
     * @param val
     */
    HrCandidateDTO setLastTpArchiveReasonDetail(String lastTpArchiveReasonDetail) {
        this.lastTpArchiveReasonDetail = lastTpArchiveReasonDetail
        return this
    }


    /**
     * 设置「最近工作公司」值
     * @param val
     */
    HrCandidateDTO setLastExpCompany(String lastExpCompany) {
        this.lastExpCompany = lastExpCompany
        return this
    }


    /**
     * 设置「最近工作岗位」值
     * @param val
     */
    HrCandidateDTO setLastExpJob(String lastExpJob) {
        this.lastExpJob = lastExpJob
        return this
    }


    /**
     * 设置「最近工作时间」值
     * @param val
     */
    HrCandidateDTO setLastExpDate(String lastExpDate) {
        this.lastExpDate = lastExpDate
        return this
    }


    /**
     * 设置「毕业院校」值
     * @param val
     */
    HrCandidateDTO setLastEduSchool(String lastEduSchool) {
        this.lastEduSchool = lastEduSchool
        return this
    }


    /**
     * 设置「所学专业」值
     * @param val
     */
    HrCandidateDTO setLastEduSpeciality(String lastEduSpeciality) {
        this.lastEduSpeciality = lastEduSpeciality
        return this
    }


    /**
     * 设置「最高学位」值
     * 字典[教育程度]
     * @param val
     */
    HrCandidateDTO setLastEduAcademicDegree(String lastEduAcademicDegree) {
        this.lastEduAcademicDegree = lastEduAcademicDegree
        return this
    }


    /**
     * 设置「毕业时间」值
     * @param val
     */
    HrCandidateDTO setLastEduDate(String lastEduDate) {
        this.lastEduDate = lastEduDate
        return this
    }


    /**
     * 设置「人才库候选人数量」值
     * @param val
     */
    HrCandidateDTO setTalentPoolCount(Integer talentPoolCount) {
        this.talentPoolCount = talentPoolCount
        return this
    }


    /**
     * 设置「最新标签」值
     * @param val
     */
    HrCandidateDTO setLastTags(String lastTags) {
        this.lastTags = lastTags
        return this
    }


    /**
     * 设置「归档前阶段」值
     * @param val
     */
    HrCandidateDTO setLastTpStageName(String lastTpStageName) {
        this.lastTpStageName = lastTpStageName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrCandidateDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrCandidateDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「邮箱」值
     * @param val
     */
    HrCandidateDTO setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrCandidateDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「候选人姓名」值
     * @param val
     */
    HrCandidateDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「人员」值
     * @param val
     */
    HrCandidateDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrCandidateDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrCandidateDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
