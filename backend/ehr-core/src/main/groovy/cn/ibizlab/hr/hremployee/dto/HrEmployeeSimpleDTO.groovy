package cn.ibizlab.hr.hremployee.dto

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
class HrEmployeeSimpleDTO extends GroovyDTO<HrEmployeeSimpleDTO> {

    /**
     * 「下一活动截止日期」
     */
    @JsonProperty("activity_date_deadline")
    Timestamp activityDateDeadline
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「公司」
     */
    @JsonProperty("company_name")
    String companyName
    /**
     * 「部门」
     */
    @JsonProperty("department_id")
    String departmentId
    /**
     * 「部门」
     */
    @JsonProperty("department_name")
    String departmentName
    /**
     * 「出席」
     * 字典[人力资源出席状态]
     */
    @JsonProperty("hr_presence_state")
    String hrPresenceState
    /**
     * 「工作岗位」
     */
    @JsonProperty("job_id")
    String jobId
    /**
     * 「工作岗位」
     */
    @JsonProperty("job_name")
    String jobName
    /**
     * 「员工姓名」
     */
    @JsonProperty("name")
    String name
    /**
     * 「管理员」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「管理员」
     */
    @JsonProperty("parent_name")
    String parentName
    /**
     * 「工作电子邮件」
     */
    @JsonProperty("work_email")
    String workEmail
    /**
     * 「办公电话」
     */
    @JsonProperty("work_phone")
    String workPhone
    /**
     * 「头像」
     */
    @JsonProperty("avatar")
    String avatar
    /**
     * 「头像」
     */
    @JsonProperty("image")
    String image

    /**
     * 设置「下一活动截止日期」值
     * @param val
     */
    HrEmployeeSimpleDTO setActivityDateDeadline(Timestamp activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrEmployeeSimpleDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrEmployeeSimpleDTO setCompanyName(String companyName) {
        this.companyName = companyName
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrEmployeeSimpleDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrEmployeeSimpleDTO setDepartmentName(String departmentName) {
        this.departmentName = departmentName
        return this
    }


    /**
     * 设置「出席」值
     * 字典[人力资源出席状态]
     * @param val
     */
    HrEmployeeSimpleDTO setHrPresenceState(String hrPresenceState) {
        this.hrPresenceState = hrPresenceState
        return this
    }


    /**
     * 设置「工作岗位」值
     * @param val
     */
    HrEmployeeSimpleDTO setJobId(String jobId) {
        this.jobId = jobId
        return this
    }


    /**
     * 设置「工作岗位」值
     * @param val
     */
    HrEmployeeSimpleDTO setJobName(String jobName) {
        this.jobName = jobName
        return this
    }


    /**
     * 设置「员工姓名」值
     * @param val
     */
    HrEmployeeSimpleDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「管理员」值
     * @param val
     */
    HrEmployeeSimpleDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「管理员」值
     * @param val
     */
    HrEmployeeSimpleDTO setParentName(String parentName) {
        this.parentName = parentName
        return this
    }


    /**
     * 设置「工作电子邮件」值
     * @param val
     */
    HrEmployeeSimpleDTO setWorkEmail(String workEmail) {
        this.workEmail = workEmail
        return this
    }


    /**
     * 设置「办公电话」值
     * @param val
     */
    HrEmployeeSimpleDTO setWorkPhone(String workPhone) {
        this.workPhone = workPhone
        return this
    }


    /**
     * 设置「头像」值
     * @param val
     */
    HrEmployeeSimpleDTO setAvatar(String avatar) {
        this.avatar = avatar
        return this
    }


    /**
     * 设置「头像」值
     * @param val
     */
    HrEmployeeSimpleDTO setImage(String image) {
        this.image = image
        return this
    }

}
