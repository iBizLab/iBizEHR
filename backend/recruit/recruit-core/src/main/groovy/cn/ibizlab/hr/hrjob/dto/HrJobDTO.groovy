package cn.ibizlab.hr.hrjob.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.hr.hrjobplatformrecord.dto.HrJobPlatformRecordDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class HrJobDTO extends GroovyDTO<HrJobDTO> {

    /**
     * 「最低薪资」
     */
    @JsonProperty("min_salary")
    Integer minSalary
    /**
     * 「最高薪资」
     */
    @JsonProperty("max_salary")
    Integer maxSalary
    /**
     * 「工作地点」
     */
    @JsonProperty("address_id")
    String addressId
    /**
     * 「是否为虚拟职位」
     * 字典[职位类型（实体/虚拟）]
     */
    @JsonProperty("is_virtual")
    String isVirtual
    /**
     * 「招聘负责人」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「部门经理」
     */
    @JsonProperty("manager_id")
    String managerId
    /**
     * 「职位来源」
     * 字典[职位来源]
     */
    @JsonProperty("source_type")
    String sourceType
    /**
     * 「职位类别」
     */
    @JsonProperty("category")
    String category
    /**
     * 「部门」
     */
    @JsonProperty("department_id")
    String departmentId
    /**
     * 「职位性质」
     * 字典[岗位性质]
     */
    @JsonProperty("job_type")
    String jobType
    /**
     * 「入职人数」
     */
    @JsonProperty("hired_employees")
    String hiredEmployees
    /**
     * 「工作经验」
     * 字典[工作经验]
     */
    @JsonProperty("experience")
    String experience
    /**
     * 「职位级别」
     */
    @JsonProperty("job_rank_ids")
    String jobRankIds
    /**
     * 「学历要求」
     * 字典[教育程度]
     */
    @JsonProperty("education")
    String education
    /**
     * 「职能类型」
     * 字典[职能类型]
     */
    @JsonProperty("function_type")
    String functionType
    /**
     * 「岗位状态」
     * 字典[岗位状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「招聘协助人」
     */
    @JsonProperty("assistant_uid")
    String assistantUid
    /**
     * 「用人经理」
     */
    @JsonProperty("manager_uid")
    String managerUid
    /**
     * 「面试官」
     */
    @JsonProperty("interviewer_uid")
    String interviewerUid
    /**
     * 「优先级」
     * 字典[职位优先级]
     */
    @JsonProperty("priority_id")
    String priorityId
    /**
     * 「候选人总数」
     */
    @JsonProperty("total_employees")
    String totalEmployees
    /**
     * 「招聘渠道」
     */
    @JsonProperty("job_platforms")
    String jobPlatforms
    /**
     * 「显示在社招官网」
     * 字典[是否]
     */
    @JsonProperty("is_publish_social")
    Integer isPublishSocial
    /**
     * 「显示在内推官网」
     * 字典[是否]
     */
    @JsonProperty("is_publish_referral")
    Integer isPublishReferral
    /**
     * 「发布到猎头」
     * 字典[是否]
     */
    @JsonProperty("is_publish_headhunter")
    Integer isPublishHeadhunter
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
     * 「招聘开始时间」
     */
    @JsonProperty("date_from")
    Timestamp dateFrom
    /**
     * 「招聘结束时间」
     */
    @JsonProperty("date_to")
    Timestamp dateTo
    /**
     * 「职位描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「招聘人数」
     */
    @JsonProperty("expected_employees")
    Integer expectedEmployees
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「职位名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「招聘流程」
     */
    @JsonProperty("progress_id")
    String progressId
    /**
     * 「招聘流程名称」
     */
    @JsonProperty("progress_name")
    String progressName
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
    @JsonProperty("hr_job_platform_records")
    List<HrJobPlatformRecordDTO> hrJobPlatformRecords

    /**
     * 设置「最低薪资」值
     * @param val
     */
    HrJobDTO setMinSalary(Integer minSalary) {
        this.minSalary = minSalary
        return this
    }


    /**
     * 设置「最高薪资」值
     * @param val
     */
    HrJobDTO setMaxSalary(Integer maxSalary) {
        this.maxSalary = maxSalary
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
     * 设置「是否为虚拟职位」值
     * 字典[职位类型（实体/虚拟）]
     * @param val
     */
    HrJobDTO setIsVirtual(String isVirtual) {
        this.isVirtual = isVirtual
        return this
    }


    /**
     * 设置「招聘负责人」值
     * @param val
     */
    HrJobDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
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
     * 设置「职位来源」值
     * 字典[职位来源]
     * @param val
     */
    HrJobDTO setSourceType(String sourceType) {
        this.sourceType = sourceType
        return this
    }


    /**
     * 设置「职位类别」值
     * @param val
     */
    HrJobDTO setCategory(String category) {
        this.category = category
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
     * 设置「职位性质」值
     * 字典[岗位性质]
     * @param val
     */
    HrJobDTO setJobType(String jobType) {
        this.jobType = jobType
        return this
    }


    /**
     * 设置「入职人数」值
     * @param val
     */
    HrJobDTO setHiredEmployees(String hiredEmployees) {
        this.hiredEmployees = hiredEmployees
        return this
    }


    /**
     * 设置「工作经验」值
     * 字典[工作经验]
     * @param val
     */
    HrJobDTO setExperience(String experience) {
        this.experience = experience
        return this
    }


    /**
     * 设置「职位级别」值
     * @param val
     */
    HrJobDTO setJobRankIds(String jobRankIds) {
        this.jobRankIds = jobRankIds
        return this
    }


    /**
     * 设置「学历要求」值
     * 字典[教育程度]
     * @param val
     */
    HrJobDTO setEducation(String education) {
        this.education = education
        return this
    }


    /**
     * 设置「职能类型」值
     * 字典[职能类型]
     * @param val
     */
    HrJobDTO setFunctionType(String functionType) {
        this.functionType = functionType
        return this
    }


    /**
     * 设置「岗位状态」值
     * 字典[岗位状态]
     * @param val
     */
    HrJobDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「招聘协助人」值
     * @param val
     */
    HrJobDTO setAssistantUid(String assistantUid) {
        this.assistantUid = assistantUid
        return this
    }


    /**
     * 设置「用人经理」值
     * @param val
     */
    HrJobDTO setManagerUid(String managerUid) {
        this.managerUid = managerUid
        return this
    }


    /**
     * 设置「面试官」值
     * @param val
     */
    HrJobDTO setInterviewerUid(String interviewerUid) {
        this.interviewerUid = interviewerUid
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[职位优先级]
     * @param val
     */
    HrJobDTO setPriorityId(String priorityId) {
        this.priorityId = priorityId
        return this
    }


    /**
     * 设置「候选人总数」值
     * @param val
     */
    HrJobDTO setTotalEmployees(String totalEmployees) {
        this.totalEmployees = totalEmployees
        return this
    }


    /**
     * 设置「招聘渠道」值
     * @param val
     */
    HrJobDTO setJobPlatforms(String jobPlatforms) {
        this.jobPlatforms = jobPlatforms
        return this
    }


    /**
     * 设置「显示在社招官网」值
     * 字典[是否]
     * @param val
     */
    HrJobDTO setIsPublishSocial(Integer isPublishSocial) {
        this.isPublishSocial = isPublishSocial
        return this
    }


    /**
     * 设置「显示在内推官网」值
     * 字典[是否]
     * @param val
     */
    HrJobDTO setIsPublishReferral(Integer isPublishReferral) {
        this.isPublishReferral = isPublishReferral
        return this
    }


    /**
     * 设置「发布到猎头」值
     * 字典[是否]
     * @param val
     */
    HrJobDTO setIsPublishHeadhunter(Integer isPublishHeadhunter) {
        this.isPublishHeadhunter = isPublishHeadhunter
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
     * 设置「招聘开始时间」值
     * @param val
     */
    HrJobDTO setDateFrom(Timestamp dateFrom) {
        this.dateFrom = dateFrom
        return this
    }


    /**
     * 设置「招聘结束时间」值
     * @param val
     */
    HrJobDTO setDateTo(Timestamp dateTo) {
        this.dateTo = dateTo
        return this
    }


    /**
     * 设置「职位描述」值
     * @param val
     */
    HrJobDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「招聘人数」值
     * @param val
     */
    HrJobDTO setExpectedEmployees(Integer expectedEmployees) {
        this.expectedEmployees = expectedEmployees
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
     * 设置「职位名称」值
     * @param val
     */
    HrJobDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「招聘流程」值
     * @param val
     */
    HrJobDTO setProgressId(String progressId) {
        this.progressId = progressId
        return this
    }


    /**
     * 设置「招聘流程名称」值
     * @param val
     */
    HrJobDTO setProgressName(String progressName) {
        this.progressName = progressName
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


    /**
     * 设置「null」值
     * @param val
     */
    HrJobDTO setHrJobPlatformRecords(List<HrJobPlatformRecordDTO> hrJobPlatformRecords) {
        this.hrJobPlatformRecords = hrJobPlatformRecords
        return this
    }

}
