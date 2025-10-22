package cn.ibizlab.extension.psdeform.dto

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
class PSDEFormDTO extends GroovyDTO<PSDEFormDTO> {

    /**
     * 「扩展模型」
     * 字典[是否]
     */
    @JsonProperty("dynamodelflag")
    Integer dynaModelFlag
    /**
     * 「代码标识」
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
     * 「表单类型」
     */
    @JsonProperty("formtype")
    String formType
    /**
     * 「实体表单标识」
     */
    @JsonProperty("psdeformid")
    String pSDEFormId
    /**
     * 「实体表单名称」
     */
    @JsonProperty("psdeformname")
    String pSDEFormName
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
    PSDEFormDTO setDynaModelFlag(Integer dynaModelFlag) {
        this.dynaModelFlag = dynaModelFlag
        return this
    }


    /**
     * 设置「代码标识」值
     * @param val
     */
    PSDEFormDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PSDEFormDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSDEFormDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「表单类型」值
     * @param val
     */
    PSDEFormDTO setFormType(String formType) {
        this.formType = formType
        return this
    }


    /**
     * 设置「实体表单标识」值
     * @param val
     */
    PSDEFormDTO setPSDEFormId(String pSDEFormId) {
        this.pSDEFormId = pSDEFormId
        return this
    }


    /**
     * 设置「实体表单名称」值
     * @param val
     */
    PSDEFormDTO setPSDEFormName(String pSDEFormName) {
        this.pSDEFormName = pSDEFormName
        return this
    }


    /**
     * 设置「实体」值
     * @param val
     */
    PSDEFormDTO setPSDEId(String pSDEId) {
        this.pSDEId = pSDEId
        return this
    }


    /**
     * 设置「实体」值
     * @param val
     */
    PSDEFormDTO setPSDEName(String pSDEName) {
        this.pSDEName = pSDEName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PSDEFormDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSDEFormDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「扩展标记」值
     * @param val
     */
    PSDEFormDTO setExtensionTag(String extensionTag) {
        this.extensionTag = extensionTag
        return this
    }


    /**
     * 设置「扩展标记2」值
     * @param val
     */
    PSDEFormDTO setExtensionTag2(String extensionTag2) {
        this.extensionTag2 = extensionTag2
        return this
    }


    /**
     * 设置「扩展标记3」值
     * @param val
     */
    PSDEFormDTO setExtensionTag3(String extensionTag3) {
        this.extensionTag3 = extensionTag3
        return this
    }


    /**
     * 设置「扩展标记4」值
     * @param val
     */
    PSDEFormDTO setExtensionTag4(String extensionTag4) {
        this.extensionTag4 = extensionTag4
        return this
    }

}
