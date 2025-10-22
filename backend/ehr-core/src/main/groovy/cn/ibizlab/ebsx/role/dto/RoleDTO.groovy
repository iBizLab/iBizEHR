package cn.ibizlab.ebsx.role.dto

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
class RoleDTO extends GroovyDTO<RoleDTO> {

    /**
     * 「角色标识」
     */
    @JsonProperty("roleid")
    String roleId
    /**
     * 「角色名称」
     */
    @JsonProperty("rolename")
    String roleName
    /**
     * 「备注」
     */
    @JsonProperty("memo")
    String memo
    /**
     * 「父角色标识」
     */
    @JsonProperty("proleid")
    String pRoleId
    /**
     * 「建立时间」
     */
    @JsonProperty("createdate")
    Timestamp createDate
    /**
     * 「更新时间」
     */
    @JsonProperty("updatedate")
    Timestamp updateDate
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("createman")
    String createMan
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("updateman")
    String updateMan
    /**
     * 「授权全部用户」
     * 字典[是否]
     */
    @JsonProperty("authorizeall")
    Integer authorizeAll
    /**
     * 「租户系统标识」
     */
    @JsonProperty("dcsystemid")
    String dCSystemId
    /**
     * 「全局标记」
     * 字典[是否]
     */
    @JsonProperty("globalflag")
    Integer globalFlag
    /**
     * 「角色标识」
     */
    @JsonProperty("roletag")
    String roleTag
    /**
     * 「系统标记」
     * 字典[是否]
     */
    @JsonProperty("systemflag")
    Integer systemFlag
    /**
     * 「用户模式」
     */
    @JsonProperty("usermode")
    String userMode

    /**
     * 设置「角色标识」值
     * @param val
     */
    RoleDTO setRoleId(String roleId) {
        this.roleId = roleId
        return this
    }


    /**
     * 设置「角色名称」值
     * @param val
     */
    RoleDTO setRoleName(String roleName) {
        this.roleName = roleName
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    RoleDTO setMemo(String memo) {
        this.memo = memo
        return this
    }


    /**
     * 设置「父角色标识」值
     * @param val
     */
    RoleDTO setPRoleId(String pRoleId) {
        this.pRoleId = pRoleId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    RoleDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    RoleDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    RoleDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    RoleDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「授权全部用户」值
     * 字典[是否]
     * @param val
     */
    RoleDTO setAuthorizeAll(Integer authorizeAll) {
        this.authorizeAll = authorizeAll
        return this
    }


    /**
     * 设置「租户系统标识」值
     * @param val
     */
    RoleDTO setDCSystemId(String dCSystemId) {
        this.dCSystemId = dCSystemId
        return this
    }


    /**
     * 设置「全局标记」值
     * 字典[是否]
     * @param val
     */
    RoleDTO setGlobalFlag(Integer globalFlag) {
        this.globalFlag = globalFlag
        return this
    }


    /**
     * 设置「角色标识」值
     * @param val
     */
    RoleDTO setRoleTag(String roleTag) {
        this.roleTag = roleTag
        return this
    }


    /**
     * 设置「系统标记」值
     * 字典[是否]
     * @param val
     */
    RoleDTO setSystemFlag(Integer systemFlag) {
        this.systemFlag = systemFlag
        return this
    }


    /**
     * 设置「用户模式」值
     * @param val
     */
    RoleDTO setUserMode(String userMode) {
        this.userMode = userMode
        return this
    }

}
