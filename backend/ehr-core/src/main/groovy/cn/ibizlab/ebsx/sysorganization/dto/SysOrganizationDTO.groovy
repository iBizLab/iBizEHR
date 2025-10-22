package cn.ibizlab.ebsx.sysorganization.dto

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
class SysOrganizationDTO extends GroovyDTO<SysOrganizationDTO> {

    /**
     * 「上级单位」
     */
    @JsonProperty("parentorgid")
    String parentOrgId
    /**
     * 「上级单位」
     */
    @JsonProperty("parentorgname")
    String parentOrgName
    /**
     * 「单位标识」
     */
    @JsonProperty("orgid")
    String orgId
    /**
     * 「属性」
     */
    @JsonProperty("updatedate")
    Timestamp updateDate
    /**
     * 「排序」
     */
    @JsonProperty("showorder")
    Integer showOrder
    /**
     * 「启用标识」
     * 字典[是否]
     */
    @JsonProperty("isvalid")
    Integer isValid
    /**
     * 「单位简称」
     */
    @JsonProperty("shortname")
    String shortName
    /**
     * 「名称」
     */
    @JsonProperty("orgname")
    String orgName
    /**
     * 「创建时间」
     */
    @JsonProperty("createdate")
    Timestamp createDate
    /**
     * 「单位编码」
     */
    @JsonProperty("orgcode")
    String orgCode

    /**
     * 设置「上级单位」值
     * @param val
     */
    SysOrganizationDTO setParentOrgId(String parentOrgId) {
        this.parentOrgId = parentOrgId
        return this
    }


    /**
     * 设置「上级单位」值
     * @param val
     */
    SysOrganizationDTO setParentOrgName(String parentOrgName) {
        this.parentOrgName = parentOrgName
        return this
    }


    /**
     * 设置「单位标识」值
     * @param val
     */
    SysOrganizationDTO setOrgId(String orgId) {
        this.orgId = orgId
        return this
    }


    /**
     * 设置「属性」值
     * @param val
     */
    SysOrganizationDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「排序」值
     * @param val
     */
    SysOrganizationDTO setShowOrder(Integer showOrder) {
        this.showOrder = showOrder
        return this
    }


    /**
     * 设置「启用标识」值
     * 字典[是否]
     * @param val
     */
    SysOrganizationDTO setIsValid(Integer isValid) {
        this.isValid = isValid
        return this
    }


    /**
     * 设置「单位简称」值
     * @param val
     */
    SysOrganizationDTO setShortName(String shortName) {
        this.shortName = shortName
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    SysOrganizationDTO setOrgName(String orgName) {
        this.orgName = orgName
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    SysOrganizationDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「单位编码」值
     * @param val
     */
    SysOrganizationDTO setOrgCode(String orgCode) {
        this.orgCode = orgCode
        return this
    }

}
