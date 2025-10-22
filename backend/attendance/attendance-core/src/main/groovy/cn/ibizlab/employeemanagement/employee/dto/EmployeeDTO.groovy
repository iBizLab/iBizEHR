package cn.ibizlab.employeemanagement.employee.dto

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
class EmployeeDTO extends GroovyDTO<EmployeeDTO> {

    /**
     * 「手机号」
     */
    @JsonProperty("mobile")
    String mobile
    /**
     * 「创建时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「创建人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「部门ID」
     */
    @JsonProperty("dept_id")
    String deptId
    /**
     * 「部门名称」
     */
    @JsonProperty("dept_name")
    String deptName
    /**
     * 「工号」
     */
    @JsonProperty("employee_num")
    String employeeNum
    /**
     * 「主键」
     */
    @JsonProperty("id")
    String id
    /**
     * 「成员类型」
     */
    @JsonProperty("member_type")
    BigInteger memberType
    /**
     * 「员工姓名」
     */
    @JsonProperty("name")
    String name
    /**
     * 「员工状态」
     */
    @JsonProperty("status")
    String status
    /**
     * 「职位」
     */
    @JsonProperty("title")
    String title
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("write_uid")
    String writeUid

    /**
     * 设置「手机号」值
     * @param val
     */
    EmployeeDTO setMobile(String mobile) {
        this.mobile = mobile
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    EmployeeDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    EmployeeDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「部门ID」值
     * @param val
     */
    EmployeeDTO setDeptId(String deptId) {
        this.deptId = deptId
        return this
    }


    /**
     * 设置「部门名称」值
     * @param val
     */
    EmployeeDTO setDeptName(String deptName) {
        this.deptName = deptName
        return this
    }


    /**
     * 设置「工号」值
     * @param val
     */
    EmployeeDTO setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    EmployeeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「成员类型」值
     * @param val
     */
    EmployeeDTO setMemberType(BigInteger memberType) {
        this.memberType = memberType
        return this
    }


    /**
     * 设置「员工姓名」值
     * @param val
     */
    EmployeeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「员工状态」值
     * @param val
     */
    EmployeeDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「职位」值
     * @param val
     */
    EmployeeDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    EmployeeDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
