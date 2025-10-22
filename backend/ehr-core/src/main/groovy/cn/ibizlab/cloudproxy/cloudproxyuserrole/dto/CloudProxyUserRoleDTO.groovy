package cn.ibizlab.cloudproxy.cloudproxyuserrole.dto

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
class CloudProxyUserRoleDTO extends GroovyDTO<CloudProxyUserRoleDTO> {

    /**
     * 「角色代码标记」
     */
    @JsonProperty("authority")
    String authority
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
     * 设置「角色代码标记」值
     * @param val
     */
    CloudProxyUserRoleDTO setAuthority(String authority) {
        this.authority = authority
        return this
    }


    /**
     * 设置「租户系统标识」值
     * @param val
     */
    CloudProxyUserRoleDTO setDCSystemId(String dCSystemId) {
        this.dCSystemId = dCSystemId
        return this
    }


    /**
     * 设置「全局标记」值
     * 字典[是否]
     * @param val
     */
    CloudProxyUserRoleDTO setGlobalFlag(Integer globalFlag) {
        this.globalFlag = globalFlag
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CloudProxyUserRoleDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CloudProxyUserRoleDTO setName(String name) {
        this.name = name
        return this
    }

}
