package cn.ibizlab.hr.hridea.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.hr.hrideajob.dto.HrIdeaJobDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class HrIdeaDTO extends GroovyDTO<HrIdeaDTO> {

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
     * 「需求编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「需求人数」
     */
    @JsonProperty("need_number")
    Integer needNumber
    /**
     * 「职位名称」
     */
    @JsonProperty("job_name")
    String jobName
    /**
     * 「需求部门」
     */
    @JsonProperty("department_code")
    String departmentCode
    /**
     * 「负责人工号」
     */
    @JsonProperty("manager_employee_ids")
    String managerEmployeeIds
    /**
     * 「管理职级」
     */
    @JsonProperty("management_rank_ids")
    String managementRankIds
    /**
     * 「专业职级」
     */
    @JsonProperty("professional_rank_ids")
    String professionalRankIds
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
     * 「薪资单位」
     * 字典[薪资单位]
     */
    @JsonProperty("salary_unit")
    Integer salaryUnit
    /**
     * 「需求描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「工作地点」
     */
    @JsonProperty("address_id")
    String addressId
    /**
     * 「学历要求」
     * 字典[学历要求]
     */
    @JsonProperty("education")
    String education
    /**
     * 「发薪月数」
     */
    @JsonProperty("pay_period")
    Integer payPeriod
    /**
     * 「发薪方式」
     * 字典[发薪方式]
     */
    @JsonProperty("payment_method")
    Integer paymentMethod
    /**
     * 「关联职位」
     */
    @JsonProperty("connected_jobs")
    List<HrIdeaJobDTO> connectedJobs
    /**
     * 「职位性质」
     * 字典[岗位性质]
     */
    @JsonProperty("job_type")
    String jobType
    /**
     * 「需求状态」
     * 字典[需求状态]
     */
    @JsonProperty("status")
    String status
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
     * 设置「标识」值
     * @param val
     */
    HrIdeaDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrIdeaDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「需求编号」值
     * @param val
     */
    HrIdeaDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「需求人数」值
     * @param val
     */
    HrIdeaDTO setNeedNumber(Integer needNumber) {
        this.needNumber = needNumber
        return this
    }


    /**
     * 设置「职位名称」值
     * @param val
     */
    HrIdeaDTO setJobName(String jobName) {
        this.jobName = jobName
        return this
    }


    /**
     * 设置「需求部门」值
     * @param val
     */
    HrIdeaDTO setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode
        return this
    }


    /**
     * 设置「负责人工号」值
     * @param val
     */
    HrIdeaDTO setManagerEmployeeIds(String managerEmployeeIds) {
        this.managerEmployeeIds = managerEmployeeIds
        return this
    }


    /**
     * 设置「管理职级」值
     * @param val
     */
    HrIdeaDTO setManagementRankIds(String managementRankIds) {
        this.managementRankIds = managementRankIds
        return this
    }


    /**
     * 设置「专业职级」值
     * @param val
     */
    HrIdeaDTO setProfessionalRankIds(String professionalRankIds) {
        this.professionalRankIds = professionalRankIds
        return this
    }


    /**
     * 设置「最低薪资」值
     * @param val
     */
    HrIdeaDTO setMinSalary(Integer minSalary) {
        this.minSalary = minSalary
        return this
    }


    /**
     * 设置「最高薪资」值
     * @param val
     */
    HrIdeaDTO setMaxSalary(Integer maxSalary) {
        this.maxSalary = maxSalary
        return this
    }


    /**
     * 设置「薪资单位」值
     * 字典[薪资单位]
     * @param val
     */
    HrIdeaDTO setSalaryUnit(Integer salaryUnit) {
        this.salaryUnit = salaryUnit
        return this
    }


    /**
     * 设置「需求描述」值
     * @param val
     */
    HrIdeaDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「工作地点」值
     * @param val
     */
    HrIdeaDTO setAddressId(String addressId) {
        this.addressId = addressId
        return this
    }


    /**
     * 设置「学历要求」值
     * 字典[学历要求]
     * @param val
     */
    HrIdeaDTO setEducation(String education) {
        this.education = education
        return this
    }


    /**
     * 设置「发薪月数」值
     * @param val
     */
    HrIdeaDTO setPayPeriod(Integer payPeriod) {
        this.payPeriod = payPeriod
        return this
    }


    /**
     * 设置「发薪方式」值
     * 字典[发薪方式]
     * @param val
     */
    HrIdeaDTO setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod
        return this
    }


    /**
     * 设置「关联职位」值
     * @param val
     */
    HrIdeaDTO setConnectedJobs(List<HrIdeaJobDTO> connectedJobs) {
        this.connectedJobs = connectedJobs
        return this
    }


    /**
     * 设置「职位性质」值
     * 字典[岗位性质]
     * @param val
     */
    HrIdeaDTO setJobType(String jobType) {
        this.jobType = jobType
        return this
    }


    /**
     * 设置「需求状态」值
     * 字典[需求状态]
     * @param val
     */
    HrIdeaDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrIdeaDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrIdeaDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「招聘开始时间」值
     * @param val
     */
    HrIdeaDTO setDateFrom(Timestamp dateFrom) {
        this.dateFrom = dateFrom
        return this
    }


    /**
     * 设置「招聘结束时间」值
     * @param val
     */
    HrIdeaDTO setDateTo(Timestamp dateTo) {
        this.dateTo = dateTo
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrIdeaDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrIdeaDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
