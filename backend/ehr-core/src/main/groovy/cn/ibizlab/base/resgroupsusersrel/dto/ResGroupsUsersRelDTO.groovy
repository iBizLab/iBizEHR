package cn.ibizlab.base.resgroupsusersrel.dto

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
class ResGroupsUsersRelDTO extends GroovyDTO<ResGroupsUsersRelDTO> {

    /**
     * 「登录」
     */
    @JsonProperty("login")
    String login
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「公司」
     */
    @JsonProperty("company_name")
    String companyName
    /**
     * 「应用」
     */
    @JsonProperty("category_id")
    String categoryId
    /**
     * 「应用」
     */
    @JsonProperty("category_name")
    String categoryName
    /**
     * 「标识」
     */
    @JsonProperty("gid")
    String gid
    /**
     * 「组名称」
     */
    @JsonProperty("group_name")
    String groupName
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
     * 「用户」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「用户」
     */
    @JsonProperty("user_name")
    String userName

    /**
     * 设置「登录」值
     * @param val
     */
    ResGroupsUsersRelDTO setLogin(String login) {
        this.login = login
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    ResGroupsUsersRelDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    ResGroupsUsersRelDTO setCompanyName(String companyName) {
        this.companyName = companyName
        return this
    }


    /**
     * 设置「应用」值
     * @param val
     */
    ResGroupsUsersRelDTO setCategoryId(String categoryId) {
        this.categoryId = categoryId
        return this
    }


    /**
     * 设置「应用」值
     * @param val
     */
    ResGroupsUsersRelDTO setCategoryName(String categoryName) {
        this.categoryName = categoryName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResGroupsUsersRelDTO setGid(String gid) {
        this.gid = gid
        return this
    }


    /**
     * 设置「组名称」值
     * @param val
     */
    ResGroupsUsersRelDTO setGroupName(String groupName) {
        this.groupName = groupName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResGroupsUsersRelDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResGroupsUsersRelDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「用户」值
     * @param val
     */
    ResGroupsUsersRelDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「用户」值
     * @param val
     */
    ResGroupsUsersRelDTO setUserName(String userName) {
        this.userName = userName
        return this
    }

}
