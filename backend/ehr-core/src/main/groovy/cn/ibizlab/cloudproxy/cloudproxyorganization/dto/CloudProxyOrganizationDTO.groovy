package cn.ibizlab.cloudproxy.cloudproxyorganization.dto

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
class CloudProxyOrganizationDTO extends GroovyDTO<CloudProxyOrganizationDTO> {

    /**
     * 「机构编号」
     */
    @JsonProperty("organization_number")
    String organizationNumber
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「简称」
     */
    @JsonProperty("short_name")
    String shortName
    /**
     * 「排序」
     */
    @JsonProperty("sort")
    BigInteger sort
    /**
     * 「父标识」
     */
    @JsonProperty("pid")
    String pid
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
     * 「名称」
     */
    @JsonProperty("pname")
    String pname

    /**
     * 设置「机构编号」值
     * @param val
     */
    CloudProxyOrganizationDTO setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    CloudProxyOrganizationDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「简称」值
     * @param val
     */
    CloudProxyOrganizationDTO setShortName(String shortName) {
        this.shortName = shortName
        return this
    }


    /**
     * 设置「排序」值
     * @param val
     */
    CloudProxyOrganizationDTO setSort(BigInteger sort) {
        this.sort = sort
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    CloudProxyOrganizationDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CloudProxyOrganizationDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CloudProxyOrganizationDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CloudProxyOrganizationDTO setPname(String pname) {
        this.pname = pname
        return this
    }

}
