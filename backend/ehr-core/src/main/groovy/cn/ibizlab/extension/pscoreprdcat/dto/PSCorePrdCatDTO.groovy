package cn.ibizlab.extension.pscoreprdcat.dto

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
class PSCorePrdCatDTO extends GroovyDTO<PSCorePrdCatDTO> {

    /**
     * 「上级分类」
     */
    @JsonProperty("ppscoreprdcatid")
    String pPSCorePrdCatId
    /**
     * 「图标路径」
     */
    @JsonProperty("avatarurl")
    String avatarUrl
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
     * 「完全名称」
     */
    @JsonProperty("fullname")
    String fullName
    /**
     * 「完全路径」
     */
    @JsonProperty("fullpath")
    String fullPath
    /**
     * 「备注」
     */
    @JsonProperty("memo")
    String memo
    /**
     * 「上级分类」
     */
    @JsonProperty("ppscoreprdcatname")
    String pPSCorePrdCatName
    /**
     * 「核心产品分类标识」
     */
    @JsonProperty("pscoreprdcatid")
    String pSCorePrdCatId
    /**
     * 「核心产品分类名称」
     */
    @JsonProperty("pscoreprdcatname")
    String pSCorePrdCatName
    /**
     * 「路径」
     */
    @JsonProperty("path")
    String path
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
     * 设置「上级分类」值
     * @param val
     */
    PSCorePrdCatDTO setPPSCorePrdCatId(String pPSCorePrdCatId) {
        this.pPSCorePrdCatId = pPSCorePrdCatId
        return this
    }


    /**
     * 设置「图标路径」值
     * @param val
     */
    PSCorePrdCatDTO setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PSCorePrdCatDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSCorePrdCatDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「完全名称」值
     * @param val
     */
    PSCorePrdCatDTO setFullName(String fullName) {
        this.fullName = fullName
        return this
    }


    /**
     * 设置「完全路径」值
     * @param val
     */
    PSCorePrdCatDTO setFullPath(String fullPath) {
        this.fullPath = fullPath
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    PSCorePrdCatDTO setMemo(String memo) {
        this.memo = memo
        return this
    }


    /**
     * 设置「上级分类」值
     * @param val
     */
    PSCorePrdCatDTO setPPSCorePrdCatName(String pPSCorePrdCatName) {
        this.pPSCorePrdCatName = pPSCorePrdCatName
        return this
    }


    /**
     * 设置「核心产品分类标识」值
     * @param val
     */
    PSCorePrdCatDTO setPSCorePrdCatId(String pSCorePrdCatId) {
        this.pSCorePrdCatId = pSCorePrdCatId
        return this
    }


    /**
     * 设置「核心产品分类名称」值
     * @param val
     */
    PSCorePrdCatDTO setPSCorePrdCatName(String pSCorePrdCatName) {
        this.pSCorePrdCatName = pSCorePrdCatName
        return this
    }


    /**
     * 设置「路径」值
     * @param val
     */
    PSCorePrdCatDTO setPath(String path) {
        this.path = path
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PSCorePrdCatDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSCorePrdCatDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }

}
