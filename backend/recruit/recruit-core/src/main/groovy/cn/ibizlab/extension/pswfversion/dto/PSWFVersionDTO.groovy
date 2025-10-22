package cn.ibizlab.extension.pswfversion.dto

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
class PSWFVersionDTO extends GroovyDTO<PSWFVersionDTO> {

    /**
     * 「扩展状态」
     * 字典[扩展状态]
     */
    @JsonProperty("applyflag")
    Integer applyflag
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
     * 「工作流」
     */
    @JsonProperty("pswfid")
    String pSWFId
    /**
     * 「工作流」
     */
    @JsonProperty("pswfname")
    String pSWFName
    /**
     * 「工作流版本标识」
     */
    @JsonProperty("pswfversionid")
    String pSWFVersionId
    /**
     * 「工作流版本名称」
     */
    @JsonProperty("pswfversionname")
    String pSWFVersionName
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
     * 设置「扩展状态」值
     * 字典[扩展状态]
     * @param val
     */
    PSWFVersionDTO setApplyflag(Integer applyflag) {
        this.applyflag = applyflag
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PSWFVersionDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSWFVersionDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「工作流」值
     * @param val
     */
    PSWFVersionDTO setPSWFId(String pSWFId) {
        this.pSWFId = pSWFId
        return this
    }


    /**
     * 设置「工作流」值
     * @param val
     */
    PSWFVersionDTO setPSWFName(String pSWFName) {
        this.pSWFName = pSWFName
        return this
    }


    /**
     * 设置「工作流版本标识」值
     * @param val
     */
    PSWFVersionDTO setPSWFVersionId(String pSWFVersionId) {
        this.pSWFVersionId = pSWFVersionId
        return this
    }


    /**
     * 设置「工作流版本名称」值
     * @param val
     */
    PSWFVersionDTO setPSWFVersionName(String pSWFVersionName) {
        this.pSWFVersionName = pSWFVersionName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PSWFVersionDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSWFVersionDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「扩展标记」值
     * @param val
     */
    PSWFVersionDTO setExtensionTag(String extensionTag) {
        this.extensionTag = extensionTag
        return this
    }


    /**
     * 设置「扩展标记2」值
     * @param val
     */
    PSWFVersionDTO setExtensionTag2(String extensionTag2) {
        this.extensionTag2 = extensionTag2
        return this
    }


    /**
     * 设置「扩展标记3」值
     * @param val
     */
    PSWFVersionDTO setExtensionTag3(String extensionTag3) {
        this.extensionTag3 = extensionTag3
        return this
    }


    /**
     * 设置「扩展标记4」值
     * @param val
     */
    PSWFVersionDTO setExtensionTag4(String extensionTag4) {
        this.extensionTag4 = extensionTag4
        return this
    }

}
