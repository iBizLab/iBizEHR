package cn.ibizlab.ebsx.sysdepartment.dto

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
class SysDepartmentDTO extends GroovyDTO<SysDepartmentDTO> {

    /**
     * 「部门标识」
     */
    @JsonProperty("deptid")
    String deptId
    /**
     * 「部门代码」
     */
    @JsonProperty("deptcode")
    String deptCode
    /**
     * 「部门名称」
     */
    @JsonProperty("deptname")
    String deptName
    /**
     * 「上级部门」
     */
    @JsonProperty("parentdeptid")
    String parentDeptId
    /**
     * 「部门简称」
     */
    @JsonProperty("shortname")
    String shortName
    /**
     * 「部门级别」
     */
    @JsonProperty("deptlevel")
    Integer deptLevel
    /**
     * 「区属」
     */
    @JsonProperty("domains")
    String domains
    /**
     * 「排序」
     */
    @JsonProperty("showorder")
    Integer showOrder
    /**
     * 「业务编码」
     */
    @JsonProperty("bcode")
    String bCode
    /**
     * 「分管领导标识」
     */
    @JsonProperty("leaderid")
    String leaderId
    /**
     * 「分管领导」
     */
    @JsonProperty("leadername")
    String leaderName
    /**
     * 「单位」
     */
    @JsonProperty("orgid")
    String orgId
    /**
     * 「单位名称」
     */
    @JsonProperty("orgname")
    String orgName
    /**
     * 「上级部门」
     */
    @JsonProperty("parentdeptname")
    String parentDeptName
    /**
     * 「创建时间」
     */
    @JsonProperty("createdate")
    Timestamp createDate
    /**
     * 「更新时间」
     */
    @JsonProperty("updatedate")
    Timestamp updateDate
    /**
     * 「保留」
     */
    @JsonProperty("reserver")
    String reserver
    /**
     * 「保留10」
     */
    @JsonProperty("reserver10")
    String reserver10
    /**
     * 「保留11」
     */
    @JsonProperty("reserver11")
    Integer reserver11
    /**
     * 「保留12」
     */
    @JsonProperty("reserver12")
    Integer reserver12
    /**
     * 「保留13」
     */
    @JsonProperty("reserver13")
    Integer reserver13
    /**
     * 「保留14」
     */
    @JsonProperty("reserver14")
    Integer reserver14
    /**
     * 「保留15」
     */
    @JsonProperty("reserver15")
    BigDecimal reserver15
    /**
     * 「保留16」
     */
    @JsonProperty("reserver16")
    BigDecimal reserver16
    /**
     * 「保留17」
     */
    @JsonProperty("reserver17")
    BigDecimal reserver17
    /**
     * 「保留18」
     */
    @JsonProperty("reserver18")
    BigDecimal reserver18
    /**
     * 「保留19」
     */
    @JsonProperty("reserver19")
    Timestamp reserver19
    /**
     * 「保留2」
     */
    @JsonProperty("reserver2")
    String reserver2
    /**
     * 「保留20」
     */
    @JsonProperty("reserver20")
    Timestamp reserver20
    /**
     * 「保留3」
     */
    @JsonProperty("reserver3")
    String reserver3
    /**
     * 「保留4」
     */
    @JsonProperty("reserver4")
    String reserver4
    /**
     * 「保留5」
     */
    @JsonProperty("reserver5")
    String reserver5
    /**
     * 「保留6」
     */
    @JsonProperty("reserver6")
    String reserver6
    /**
     * 「保留7」
     */
    @JsonProperty("reserver7")
    String reserver7
    /**
     * 「保留8」
     */
    @JsonProperty("reserver8")
    String reserver8
    /**
     * 「保留9」
     */
    @JsonProperty("reserver9")
    String reserver9
    /**
     * 「钉钉部门标识」
     */
    @JsonProperty("dddeptid")
    String dDDeptId
    /**
     * 「部门全称」
     */
    @JsonProperty("deptfullname")
    String deptFullName
    /**
     * 「部门领导」
     */
    @JsonProperty("deptleader")
    String deptLeader
    /**
     * 「部门领导标识」
     */
    @JsonProperty("deptleaderid")
    String deptLeaderId
    /**
     * 「启用标志」
     * 字典[是否]
     */
    @JsonProperty("isvalid")
    Integer isValid
    /**
     * 「企业微信部门标识」
     */
    @JsonProperty("wxworkdeptid")
    String wXWorkDeptId

    /**
     * 设置「部门标识」值
     * @param val
     */
    SysDepartmentDTO setDeptId(String deptId) {
        this.deptId = deptId
        return this
    }


    /**
     * 设置「部门代码」值
     * @param val
     */
    SysDepartmentDTO setDeptCode(String deptCode) {
        this.deptCode = deptCode
        return this
    }


    /**
     * 设置「部门名称」值
     * @param val
     */
    SysDepartmentDTO setDeptName(String deptName) {
        this.deptName = deptName
        return this
    }


    /**
     * 设置「上级部门」值
     * @param val
     */
    SysDepartmentDTO setParentDeptId(String parentDeptId) {
        this.parentDeptId = parentDeptId
        return this
    }


    /**
     * 设置「部门简称」值
     * @param val
     */
    SysDepartmentDTO setShortName(String shortName) {
        this.shortName = shortName
        return this
    }


    /**
     * 设置「部门级别」值
     * @param val
     */
    SysDepartmentDTO setDeptLevel(Integer deptLevel) {
        this.deptLevel = deptLevel
        return this
    }


    /**
     * 设置「区属」值
     * @param val
     */
    SysDepartmentDTO setDomains(String domains) {
        this.domains = domains
        return this
    }


    /**
     * 设置「排序」值
     * @param val
     */
    SysDepartmentDTO setShowOrder(Integer showOrder) {
        this.showOrder = showOrder
        return this
    }


    /**
     * 设置「业务编码」值
     * @param val
     */
    SysDepartmentDTO setBCode(String bCode) {
        this.bCode = bCode
        return this
    }


    /**
     * 设置「分管领导标识」值
     * @param val
     */
    SysDepartmentDTO setLeaderId(String leaderId) {
        this.leaderId = leaderId
        return this
    }


    /**
     * 设置「分管领导」值
     * @param val
     */
    SysDepartmentDTO setLeaderName(String leaderName) {
        this.leaderName = leaderName
        return this
    }


    /**
     * 设置「单位」值
     * @param val
     */
    SysDepartmentDTO setOrgId(String orgId) {
        this.orgId = orgId
        return this
    }


    /**
     * 设置「单位名称」值
     * @param val
     */
    SysDepartmentDTO setOrgName(String orgName) {
        this.orgName = orgName
        return this
    }


    /**
     * 设置「上级部门」值
     * @param val
     */
    SysDepartmentDTO setParentDeptName(String parentDeptName) {
        this.parentDeptName = parentDeptName
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    SysDepartmentDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    SysDepartmentDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「保留」值
     * @param val
     */
    SysDepartmentDTO setReserver(String reserver) {
        this.reserver = reserver
        return this
    }


    /**
     * 设置「保留10」值
     * @param val
     */
    SysDepartmentDTO setReserver10(String reserver10) {
        this.reserver10 = reserver10
        return this
    }


    /**
     * 设置「保留11」值
     * @param val
     */
    SysDepartmentDTO setReserver11(Integer reserver11) {
        this.reserver11 = reserver11
        return this
    }


    /**
     * 设置「保留12」值
     * @param val
     */
    SysDepartmentDTO setReserver12(Integer reserver12) {
        this.reserver12 = reserver12
        return this
    }


    /**
     * 设置「保留13」值
     * @param val
     */
    SysDepartmentDTO setReserver13(Integer reserver13) {
        this.reserver13 = reserver13
        return this
    }


    /**
     * 设置「保留14」值
     * @param val
     */
    SysDepartmentDTO setReserver14(Integer reserver14) {
        this.reserver14 = reserver14
        return this
    }


    /**
     * 设置「保留15」值
     * @param val
     */
    SysDepartmentDTO setReserver15(BigDecimal reserver15) {
        this.reserver15 = reserver15
        return this
    }


    /**
     * 设置「保留16」值
     * @param val
     */
    SysDepartmentDTO setReserver16(BigDecimal reserver16) {
        this.reserver16 = reserver16
        return this
    }


    /**
     * 设置「保留17」值
     * @param val
     */
    SysDepartmentDTO setReserver17(BigDecimal reserver17) {
        this.reserver17 = reserver17
        return this
    }


    /**
     * 设置「保留18」值
     * @param val
     */
    SysDepartmentDTO setReserver18(BigDecimal reserver18) {
        this.reserver18 = reserver18
        return this
    }


    /**
     * 设置「保留19」值
     * @param val
     */
    SysDepartmentDTO setReserver19(Timestamp reserver19) {
        this.reserver19 = reserver19
        return this
    }


    /**
     * 设置「保留2」值
     * @param val
     */
    SysDepartmentDTO setReserver2(String reserver2) {
        this.reserver2 = reserver2
        return this
    }


    /**
     * 设置「保留20」值
     * @param val
     */
    SysDepartmentDTO setReserver20(Timestamp reserver20) {
        this.reserver20 = reserver20
        return this
    }


    /**
     * 设置「保留3」值
     * @param val
     */
    SysDepartmentDTO setReserver3(String reserver3) {
        this.reserver3 = reserver3
        return this
    }


    /**
     * 设置「保留4」值
     * @param val
     */
    SysDepartmentDTO setReserver4(String reserver4) {
        this.reserver4 = reserver4
        return this
    }


    /**
     * 设置「保留5」值
     * @param val
     */
    SysDepartmentDTO setReserver5(String reserver5) {
        this.reserver5 = reserver5
        return this
    }


    /**
     * 设置「保留6」值
     * @param val
     */
    SysDepartmentDTO setReserver6(String reserver6) {
        this.reserver6 = reserver6
        return this
    }


    /**
     * 设置「保留7」值
     * @param val
     */
    SysDepartmentDTO setReserver7(String reserver7) {
        this.reserver7 = reserver7
        return this
    }


    /**
     * 设置「保留8」值
     * @param val
     */
    SysDepartmentDTO setReserver8(String reserver8) {
        this.reserver8 = reserver8
        return this
    }


    /**
     * 设置「保留9」值
     * @param val
     */
    SysDepartmentDTO setReserver9(String reserver9) {
        this.reserver9 = reserver9
        return this
    }


    /**
     * 设置「钉钉部门标识」值
     * @param val
     */
    SysDepartmentDTO setDDDeptId(String dDDeptId) {
        this.dDDeptId = dDDeptId
        return this
    }


    /**
     * 设置「部门全称」值
     * @param val
     */
    SysDepartmentDTO setDeptFullName(String deptFullName) {
        this.deptFullName = deptFullName
        return this
    }


    /**
     * 设置「部门领导」值
     * @param val
     */
    SysDepartmentDTO setDeptLeader(String deptLeader) {
        this.deptLeader = deptLeader
        return this
    }


    /**
     * 设置「部门领导标识」值
     * @param val
     */
    SysDepartmentDTO setDeptLeaderId(String deptLeaderId) {
        this.deptLeaderId = deptLeaderId
        return this
    }


    /**
     * 设置「启用标志」值
     * 字典[是否]
     * @param val
     */
    SysDepartmentDTO setIsValid(Integer isValid) {
        this.isValid = isValid
        return this
    }


    /**
     * 设置「企业微信部门标识」值
     * @param val
     */
    SysDepartmentDTO setWXWorkDeptId(String wXWorkDeptId) {
        this.wXWorkDeptId = wXWorkDeptId
        return this
    }

}
