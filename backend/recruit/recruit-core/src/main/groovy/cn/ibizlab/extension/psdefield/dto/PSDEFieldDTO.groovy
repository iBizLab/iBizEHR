package cn.ibizlab.extension.psdefield.dto

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
class PSDEFieldDTO extends GroovyDTO<PSDEFieldDTO> {

    /**
     * 「扩展模型」
     * 字典[是否]
     */
    @JsonProperty("dynamodelflag")
    Integer dynaModelFlag
    /**
     * 「系统建立模式」
     */
    @JsonProperty("systemflag")
    BigDecimal systemFlag
    /**
     * 「备注」
     */
    @JsonProperty("memo")
    String memo
    /**
     * 「代码表」
     */
    @JsonProperty("pscodelistid")
    String pscodelistid
    /**
     * 「排序」
     */
    @JsonProperty("ordervalue")
    BigDecimal ordervalue
    /**
     * 「允许空值」
     * 字典[是否]
     */
    @JsonProperty("allowempty")
    Integer allowEmpty
    /**
     * 「代码名称」
     */
    @JsonProperty("codename")
    String codeName
    /**
     * 「建立时间」
     */
    @JsonProperty("createdate")
    Timestamp createDate
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("createman")
    String createMan
    /**
     * 「属性类型」
     * 字典[云实体属性类型]
     */
    @JsonProperty("deftype")
    Integer dEFType
    /**
     * 「属性标记」
     */
    @JsonProperty("fieldtag")
    String fieldTag
    /**
     * 「属性标记2」
     */
    @JsonProperty("fieldtag2")
    String fieldTag2
    /**
     * 「长度」
     */
    @JsonProperty("length")
    Integer length
    /**
     * 「中文名称」
     */
    @JsonProperty("logicname")
    String logicName
    /**
     * 「实体属性标识」
     */
    @JsonProperty("psdefieldid")
    String pSDEFieldId
    /**
     * 「实体属性名称」
     */
    @JsonProperty("psdefieldname")
    String pSDEFieldName
    /**
     * 「实体」
     */
    @JsonProperty("psdeid")
    String pSDEId
    /**
     * 「实体」
     */
    @JsonProperty("psdename")
    String pSDEName
    /**
     * 「数据类型」
     * 字典[实体属性数据类型]
     */
    @JsonProperty("psdatatypeid")
    String pSDataTypeId
    /**
     * 「数据类型」
     * 字典[实体属性数据类型]
     */
    @JsonProperty("psdatatypename")
    String pSDataTypeName
    /**
     * 「浮点精度」
     */
    @JsonProperty("precision2")
    Integer precision2
    /**
     * 「更新时间」
     */
    @JsonProperty("updatedate")
    Timestamp updateDate
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("updateman")
    String updateMan
    /**
     * 「用户标记」
     */
    @JsonProperty("usertag")
    String userTag
    /**
     * 「用户标记2」
     */
    @JsonProperty("usertag2")
    String userTag2
    /**
     * 「用户标记3」
     */
    @JsonProperty("usertag3")
    String userTag3
    /**
     * 「用户标记4」
     */
    @JsonProperty("usertag4")
    String userTag4
    /**
     * 「扩展标记」
     */
    @JsonProperty("extension_tag")
    String extensionTag
    /**
     * 「扩展标记2」
     */
    @JsonProperty("extension_tag2")
    String extensionTag2
    /**
     * 「扩展标记3」
     */
    @JsonProperty("extension_tag3")
    String extensionTag3
    /**
     * 「扩展标记4」
     */
    @JsonProperty("extension_tag4")
    String extensionTag4

    /**
     * 设置「扩展模型」值
     * 字典[是否]
     * @param val
     */
    PSDEFieldDTO setDynaModelFlag(Integer dynaModelFlag) {
        this.dynaModelFlag = dynaModelFlag
        return this
    }


    /**
     * 设置「系统建立模式」值
     * @param val
     */
    PSDEFieldDTO setSystemFlag(BigDecimal systemFlag) {
        this.systemFlag = systemFlag
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    PSDEFieldDTO setMemo(String memo) {
        this.memo = memo
        return this
    }


    /**
     * 设置「代码表」值
     * @param val
     */
    PSDEFieldDTO setPscodelistid(String pscodelistid) {
        this.pscodelistid = pscodelistid
        return this
    }


    /**
     * 设置「排序」值
     * @param val
     */
    PSDEFieldDTO setOrdervalue(BigDecimal ordervalue) {
        this.ordervalue = ordervalue
        return this
    }


    /**
     * 设置「允许空值」值
     * 字典[是否]
     * @param val
     */
    PSDEFieldDTO setAllowEmpty(Integer allowEmpty) {
        this.allowEmpty = allowEmpty
        return this
    }


    /**
     * 设置「代码名称」值
     * @param val
     */
    PSDEFieldDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PSDEFieldDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSDEFieldDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「属性类型」值
     * 字典[云实体属性类型]
     * @param val
     */
    PSDEFieldDTO setDEFType(Integer dEFType) {
        this.dEFType = dEFType
        return this
    }


    /**
     * 设置「属性标记」值
     * @param val
     */
    PSDEFieldDTO setFieldTag(String fieldTag) {
        this.fieldTag = fieldTag
        return this
    }


    /**
     * 设置「属性标记2」值
     * @param val
     */
    PSDEFieldDTO setFieldTag2(String fieldTag2) {
        this.fieldTag2 = fieldTag2
        return this
    }


    /**
     * 设置「长度」值
     * @param val
     */
    PSDEFieldDTO setLength(Integer length) {
        this.length = length
        return this
    }


    /**
     * 设置「中文名称」值
     * @param val
     */
    PSDEFieldDTO setLogicName(String logicName) {
        this.logicName = logicName
        return this
    }


    /**
     * 设置「实体属性标识」值
     * @param val
     */
    PSDEFieldDTO setPSDEFieldId(String pSDEFieldId) {
        this.pSDEFieldId = pSDEFieldId
        return this
    }


    /**
     * 设置「实体属性名称」值
     * @param val
     */
    PSDEFieldDTO setPSDEFieldName(String pSDEFieldName) {
        this.pSDEFieldName = pSDEFieldName
        return this
    }


    /**
     * 设置「实体」值
     * @param val
     */
    PSDEFieldDTO setPSDEId(String pSDEId) {
        this.pSDEId = pSDEId
        return this
    }


    /**
     * 设置「实体」值
     * @param val
     */
    PSDEFieldDTO setPSDEName(String pSDEName) {
        this.pSDEName = pSDEName
        return this
    }


    /**
     * 设置「数据类型」值
     * 字典[实体属性数据类型]
     * @param val
     */
    PSDEFieldDTO setPSDataTypeId(String pSDataTypeId) {
        this.pSDataTypeId = pSDataTypeId
        return this
    }


    /**
     * 设置「数据类型」值
     * 字典[实体属性数据类型]
     * @param val
     */
    PSDEFieldDTO setPSDataTypeName(String pSDataTypeName) {
        this.pSDataTypeName = pSDataTypeName
        return this
    }


    /**
     * 设置「浮点精度」值
     * @param val
     */
    PSDEFieldDTO setPrecision2(Integer precision2) {
        this.precision2 = precision2
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PSDEFieldDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSDEFieldDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「用户标记」值
     * @param val
     */
    PSDEFieldDTO setUserTag(String userTag) {
        this.userTag = userTag
        return this
    }


    /**
     * 设置「用户标记2」值
     * @param val
     */
    PSDEFieldDTO setUserTag2(String userTag2) {
        this.userTag2 = userTag2
        return this
    }


    /**
     * 设置「用户标记3」值
     * @param val
     */
    PSDEFieldDTO setUserTag3(String userTag3) {
        this.userTag3 = userTag3
        return this
    }


    /**
     * 设置「用户标记4」值
     * @param val
     */
    PSDEFieldDTO setUserTag4(String userTag4) {
        this.userTag4 = userTag4
        return this
    }


    /**
     * 设置「扩展标记」值
     * @param val
     */
    PSDEFieldDTO setExtensionTag(String extensionTag) {
        this.extensionTag = extensionTag
        return this
    }


    /**
     * 设置「扩展标记2」值
     * @param val
     */
    PSDEFieldDTO setExtensionTag2(String extensionTag2) {
        this.extensionTag2 = extensionTag2
        return this
    }


    /**
     * 设置「扩展标记3」值
     * @param val
     */
    PSDEFieldDTO setExtensionTag3(String extensionTag3) {
        this.extensionTag3 = extensionTag3
        return this
    }


    /**
     * 设置「扩展标记4」值
     * @param val
     */
    PSDEFieldDTO setExtensionTag4(String extensionTag4) {
        this.extensionTag4 = extensionTag4
        return this
    }

}
