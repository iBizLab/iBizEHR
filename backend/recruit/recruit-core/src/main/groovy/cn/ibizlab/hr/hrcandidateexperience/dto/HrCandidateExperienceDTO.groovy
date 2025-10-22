package cn.ibizlab.hr.hrcandidateexperience.dto

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
class HrCandidateExperienceDTO extends GroovyDTO<HrCandidateExperienceDTO> {

    /**
     * 「开始时间」
     */
    @JsonProperty("start_date")
    Timestamp startDate
    /**
     * 「结束时间」
     */
    @JsonProperty("end_date")
    Timestamp endDate
    /**
     * 「公司」
     */
    @JsonProperty("company")
    String company
    /**
     * 「岗位」
     */
    @JsonProperty("job_name")
    String jobName
    /**
     * 「地点」
     */
    @JsonProperty("location")
    String location
    /**
     * 「行业」
     */
    @JsonProperty("industry")
    String industry
    /**
     * 「薪资」
     */
    @JsonProperty("salary")
    String salary
    /**
     * 「领导」
     */
    @JsonProperty("leader")
    String leader
    /**
     * 「部门」
     */
    @JsonProperty("department")
    String department
    /**
     * 「概述」
     */
    @JsonProperty("summary")
    String summary
    /**
     * 「离职原因」
     */
    @JsonProperty("reason_for_leaving")
    String reasonForLeaving
    /**
     * 「下属人数」
     */
    @JsonProperty("underling_number")
    String underlingNumber
    /**
     * 「至今」
     */
    @JsonProperty("now")
    Integer now
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
     * 设置「开始时间」值
     * @param val
     */
    HrCandidateExperienceDTO setStartDate(Timestamp startDate) {
        this.startDate = startDate
        return this
    }


    /**
     * 设置「结束时间」值
     * @param val
     */
    HrCandidateExperienceDTO setEndDate(Timestamp endDate) {
        this.endDate = endDate
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrCandidateExperienceDTO setCompany(String company) {
        this.company = company
        return this
    }


    /**
     * 设置「岗位」值
     * @param val
     */
    HrCandidateExperienceDTO setJobName(String jobName) {
        this.jobName = jobName
        return this
    }


    /**
     * 设置「地点」值
     * @param val
     */
    HrCandidateExperienceDTO setLocation(String location) {
        this.location = location
        return this
    }


    /**
     * 设置「行业」值
     * @param val
     */
    HrCandidateExperienceDTO setIndustry(String industry) {
        this.industry = industry
        return this
    }


    /**
     * 设置「薪资」值
     * @param val
     */
    HrCandidateExperienceDTO setSalary(String salary) {
        this.salary = salary
        return this
    }


    /**
     * 设置「领导」值
     * @param val
     */
    HrCandidateExperienceDTO setLeader(String leader) {
        this.leader = leader
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrCandidateExperienceDTO setDepartment(String department) {
        this.department = department
        return this
    }


    /**
     * 设置「概述」值
     * @param val
     */
    HrCandidateExperienceDTO setSummary(String summary) {
        this.summary = summary
        return this
    }


    /**
     * 设置「离职原因」值
     * @param val
     */
    HrCandidateExperienceDTO setReasonForLeaving(String reasonForLeaving) {
        this.reasonForLeaving = reasonForLeaving
        return this
    }


    /**
     * 设置「下属人数」值
     * @param val
     */
    HrCandidateExperienceDTO setUnderlingNumber(String underlingNumber) {
        this.underlingNumber = underlingNumber
        return this
    }


    /**
     * 设置「至今」值
     * @param val
     */
    HrCandidateExperienceDTO setNow(Integer now) {
        this.now = now
        return this
    }


    /**
     * 设置「候选人申请」值
     * @param val
     */
    HrCandidateExperienceDTO setApplicantId(String applicantId) {
        this.applicantId = applicantId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrCandidateExperienceDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrCandidateExperienceDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrCandidateExperienceDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrCandidateExperienceDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrCandidateExperienceDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrCandidateExperienceDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
