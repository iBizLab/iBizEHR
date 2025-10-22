package cn.ibizlab.base.rescompany.dto

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
class ResCompanyDTO extends GroovyDTO<ResCompanyDTO> {

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
     * 「编码」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「大类」
     * 字典[组织类型]
     */
    @JsonProperty("category")
    String category
    /**
     * 「类型」
     */
    @JsonProperty("type")
    String type
    /**
     * 「虚拟组织」
     * 字典[是否]
     */
    @JsonProperty("is_virtual")
    Integer isVirtual
    /**
     * 「层级」
     */
    @JsonProperty("level")
    String level
    /**
     * 「网址」
     */
    @JsonProperty("website")
    String website
    /**
     * 「电话」
     */
    @JsonProperty("telephone")
    String telephone
    /**
     * 「简称」
     */
    @JsonProperty("short_name")
    String shortName
    /**
     * 「设立日期」
     */
    @JsonProperty("company_createdate")
    Timestamp companyCreatedate
    /**
     * 「文号」
     */
    @JsonProperty("code")
    String code
    /**
     * 「行政维度序号」
     */
    @JsonProperty("management_sort")
    Integer managementSort
    /**
     * 「业务维度序号」
     */
    @JsonProperty("business_sort")
    Integer businessSort
    /**
     * 「业务维度上级」
     */
    @JsonProperty("business_parent_id")
    String businessParentId
    /**
     * 「所在地点」
     */
    @JsonProperty("city")
    String city
    /**
     * 「简介」
     */
    @JsonProperty("company_details")
    String companyDetails
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
     * 「hrbp」
     */
    @JsonProperty("hrbp_id")
    String hrbpId
    /**
     * 「行政维度上级」
     */
    @JsonProperty("management_parent_id")
    String managementParentId
    /**
     * 「负责人」
     */
    @JsonProperty("manager_id")
    String managerId
    /**
     * 「负责人」
     */
    @JsonProperty("manager_name")
    String managerName
    /**
     * 「地址」
     */
    @JsonProperty("street")
    String street
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
    ResCompanyDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResCompanyDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「编码」值
     * @param val
     */
    ResCompanyDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「大类」值
     * 字典[组织类型]
     * @param val
     */
    ResCompanyDTO setCategory(String category) {
        this.category = category
        return this
    }


    /**
     * 设置「类型」值
     * @param val
     */
    ResCompanyDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「虚拟组织」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setIsVirtual(Integer isVirtual) {
        this.isVirtual = isVirtual
        return this
    }


    /**
     * 设置「层级」值
     * @param val
     */
    ResCompanyDTO setLevel(String level) {
        this.level = level
        return this
    }


    /**
     * 设置「网址」值
     * @param val
     */
    ResCompanyDTO setWebsite(String website) {
        this.website = website
        return this
    }


    /**
     * 设置「电话」值
     * @param val
     */
    ResCompanyDTO setTelephone(String telephone) {
        this.telephone = telephone
        return this
    }


    /**
     * 设置「简称」值
     * @param val
     */
    ResCompanyDTO setShortName(String shortName) {
        this.shortName = shortName
        return this
    }


    /**
     * 设置「设立日期」值
     * @param val
     */
    ResCompanyDTO setCompanyCreatedate(Timestamp companyCreatedate) {
        this.companyCreatedate = companyCreatedate
        return this
    }


    /**
     * 设置「文号」值
     * @param val
     */
    ResCompanyDTO setCode(String code) {
        this.code = code
        return this
    }


    /**
     * 设置「行政维度序号」值
     * @param val
     */
    ResCompanyDTO setManagementSort(Integer managementSort) {
        this.managementSort = managementSort
        return this
    }


    /**
     * 设置「业务维度序号」值
     * @param val
     */
    ResCompanyDTO setBusinessSort(Integer businessSort) {
        this.businessSort = businessSort
        return this
    }


    /**
     * 设置「业务维度上级」值
     * @param val
     */
    ResCompanyDTO setBusinessParentId(String businessParentId) {
        this.businessParentId = businessParentId
        return this
    }


    /**
     * 设置「所在地点」值
     * @param val
     */
    ResCompanyDTO setCity(String city) {
        this.city = city
        return this
    }


    /**
     * 设置「简介」值
     * @param val
     */
    ResCompanyDTO setCompanyDetails(String companyDetails) {
        this.companyDetails = companyDetails
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResCompanyDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    ResCompanyDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「hrbp」值
     * @param val
     */
    ResCompanyDTO setHrbpId(String hrbpId) {
        this.hrbpId = hrbpId
        return this
    }


    /**
     * 设置「行政维度上级」值
     * @param val
     */
    ResCompanyDTO setManagementParentId(String managementParentId) {
        this.managementParentId = managementParentId
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    ResCompanyDTO setManagerId(String managerId) {
        this.managerId = managerId
        return this
    }


    /**
     * 设置「负责人」值
     * @param val
     */
    ResCompanyDTO setManagerName(String managerName) {
        this.managerName = managerName
        return this
    }


    /**
     * 设置「地址」值
     * @param val
     */
    ResCompanyDTO setStreet(String street) {
        this.street = street
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResCompanyDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    ResCompanyDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
