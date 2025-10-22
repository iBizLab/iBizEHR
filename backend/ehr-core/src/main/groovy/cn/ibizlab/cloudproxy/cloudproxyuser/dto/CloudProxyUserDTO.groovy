package cn.ibizlab.cloudproxy.cloudproxyuser.dto

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
class CloudProxyUserDTO extends GroovyDTO<CloudProxyUserDTO> {

    /**
     * 「姓名」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「邮箱」
     */
    @JsonProperty("email")
    String email
    /**
     * 「手机号」
     */
    @JsonProperty("mobile")
    String mobile
    /**
     * 「密码」
     */
    @JsonProperty("password")
    String password
    /**
     * 「工号」
     */
    @JsonProperty("employee_number")
    String employeeNumber
    /**
     * 「头像」
     */
    @JsonProperty("avatar")
    String avatar
    /**
     * 「状态」
     */
    @JsonProperty("status")
    String status
    /**
     * 「用户ID」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「职位」
     */
    @JsonProperty("title")
    String title
    /**
     * 「部门标识」
     */
    @JsonProperty("department_id")
    String departmentId
    /**
     * 「部门名称」
     */
    @JsonProperty("department_name")
    String departmentName
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「登录」
     */
    @JsonProperty("login")
    String login
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「组织标识」
     */
    @JsonProperty("organization_id")
    String organizationId
    /**
     * 「组织名称」
     */
    @JsonProperty("organization_name")
    String organizationName

    /**
     * 设置「姓名」值
     * @param val
     */
    CloudProxyUserDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「邮箱」值
     * @param val
     */
    CloudProxyUserDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「手机号」值
     * @param val
     */
    CloudProxyUserDTO setMobile(String mobile) {
        this.mobile = mobile
        return this
    }


    /**
     * 设置「密码」值
     * @param val
     */
    CloudProxyUserDTO setPassword(String password) {
        this.password = password
        return this
    }


    /**
     * 设置「工号」值
     * @param val
     */
    CloudProxyUserDTO setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber
        return this
    }


    /**
     * 设置「头像」值
     * @param val
     */
    CloudProxyUserDTO setAvatar(String avatar) {
        this.avatar = avatar
        return this
    }


    /**
     * 设置「状态」值
     * @param val
     */
    CloudProxyUserDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「用户ID」值
     * @param val
     */
    CloudProxyUserDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「职位」值
     * @param val
     */
    CloudProxyUserDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「部门标识」值
     * @param val
     */
    CloudProxyUserDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「部门名称」值
     * @param val
     */
    CloudProxyUserDTO setDepartmentName(String departmentName) {
        this.departmentName = departmentName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CloudProxyUserDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「登录」值
     * @param val
     */
    CloudProxyUserDTO setLogin(String login) {
        this.login = login
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CloudProxyUserDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「组织标识」值
     * @param val
     */
    CloudProxyUserDTO setOrganizationId(String organizationId) {
        this.organizationId = organizationId
        return this
    }


    /**
     * 设置「组织名称」值
     * @param val
     */
    CloudProxyUserDTO setOrganizationName(String organizationName) {
        this.organizationName = organizationName
        return this
    }

}
