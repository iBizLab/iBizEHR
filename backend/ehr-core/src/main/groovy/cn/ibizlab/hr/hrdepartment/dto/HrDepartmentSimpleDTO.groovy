package cn.ibizlab.hr.hrdepartment.dto

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
class HrDepartmentSimpleDTO extends GroovyDTO<HrDepartmentSimpleDTO> {

    /**
     * 「颜色」
     */
    @JsonProperty("color")
    String color
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
     * 「管理员」
     */
    @JsonProperty("manager_id")
    String managerId
    /**
     * 「管理员」
     */
    @JsonProperty("manager_name")
    String managerName
    /**
     * 「部门名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「上级部门」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「上级部门」
     */
    @JsonProperty("parent_name")
    String parentName
    /**
     * 「员工」
     */
    @JsonProperty("total_employee")
    Integer totalEmployee

    /**
     * 设置「颜色」值
     * @param val
     */
    HrDepartmentSimpleDTO setColor(String color) {
        this.color = color
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrDepartmentSimpleDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrDepartmentSimpleDTO setCompanyName(String companyName) {
        this.companyName = companyName
        return this
    }


    /**
     * 设置「管理员」值
     * @param val
     */
    HrDepartmentSimpleDTO setManagerId(String managerId) {
        this.managerId = managerId
        return this
    }


    /**
     * 设置「管理员」值
     * @param val
     */
    HrDepartmentSimpleDTO setManagerName(String managerName) {
        this.managerName = managerName
        return this
    }


    /**
     * 设置「部门名称」值
     * @param val
     */
    HrDepartmentSimpleDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「上级部门」值
     * @param val
     */
    HrDepartmentSimpleDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「上级部门」值
     * @param val
     */
    HrDepartmentSimpleDTO setParentName(String parentName) {
        this.parentName = parentName
        return this
    }


    /**
     * 设置「员工」值
     * @param val
     */
    HrDepartmentSimpleDTO setTotalEmployee(Integer totalEmployee) {
        this.totalEmployee = totalEmployee
        return this
    }

}
