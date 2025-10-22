package cn.ibizlab.extension.pscoreprdfunc.dto

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
class PSCorePrdFuncDTO extends GroovyDTO<PSCorePrdFuncDTO> {

    /**
     * 「功能类型」
     * 字典[应用模型类型]
     */
    @JsonProperty("functype")
    String funcType
    /**
     * 「设置」
     */
    @JsonProperty("settings")
    String settings
    /**
     * 「可用版本」
     */
    @JsonProperty("vers")
    String vers
    /**
     * 「详细信息」
     */
    @JsonProperty("info")
    String info
    /**
     * 「产品分类」
     * 字典[应用模型分类]
     */
    @JsonProperty("category")
    String category
    /**
     * 「变更日志」
     */
    @JsonProperty("changelog")
    String changelog
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
     * 「当前版本」
     */
    @JsonProperty("currentversion")
    String currentVersion
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
     * 「功能编号」
     */
    @JsonProperty("funcsn")
    String funcSN
    /**
     * 「功能状态」
     * 字典[核心产品功能状态]
     */
    @JsonProperty("funcstate")
    String funcState
    /**
     * 「功能标记」
     */
    @JsonProperty("functag")
    String funcTag
    /**
     * 「功能标记2」
     */
    @JsonProperty("functag2")
    String funcTag2
    /**
     * 「功能描述链接」
     */
    @JsonProperty("funcurl")
    String funcUrl
    /**
     * 「Http仓库地址」
     */
    @JsonProperty("httpurltorepo")
    String httpUrlToRepo
    /**
     * 「备注」
     */
    @JsonProperty("memo")
    String memo
    /**
     * 「排序值」
     */
    @JsonProperty("ordervalue")
    Integer orderValue
    /**
     * 「核心产品功能标识」
     */
    @JsonProperty("pscoreprdfuncid")
    String pSCorePrdFuncId
    /**
     * 「应用名称」
     */
    @JsonProperty("pscoreprdfuncname")
    String pSCorePrdFuncName
    /**
     * 「核心产品」
     */
    @JsonProperty("pscoreprdid")
    String pSCorePrdId
    /**
     * 「核心产品」
     */
    @JsonProperty("pscoreprdname")
    String pSCorePrdName
    /**
     * 「路径」
     */
    @JsonProperty("path")
    String path
    /**
     * 「设置地址」
     */
    @JsonProperty("settingurl")
    String settingUrl
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
     * 设置「功能类型」值
     * 字典[应用模型类型]
     * @param val
     */
    PSCorePrdFuncDTO setFuncType(String funcType) {
        this.funcType = funcType
        return this
    }


    /**
     * 设置「设置」值
     * @param val
     */
    PSCorePrdFuncDTO setSettings(String settings) {
        this.settings = settings
        return this
    }


    /**
     * 设置「可用版本」值
     * @param val
     */
    PSCorePrdFuncDTO setVers(String vers) {
        this.vers = vers
        return this
    }


    /**
     * 设置「详细信息」值
     * @param val
     */
    PSCorePrdFuncDTO setInfo(String info) {
        this.info = info
        return this
    }


    /**
     * 设置「产品分类」值
     * 字典[应用模型分类]
     * @param val
     */
    PSCorePrdFuncDTO setCategory(String category) {
        this.category = category
        return this
    }


    /**
     * 设置「变更日志」值
     * @param val
     */
    PSCorePrdFuncDTO setChangelog(String changelog) {
        this.changelog = changelog
        return this
    }


    /**
     * 设置「图标路径」值
     * @param val
     */
    PSCorePrdFuncDTO setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PSCorePrdFuncDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSCorePrdFuncDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「当前版本」值
     * @param val
     */
    PSCorePrdFuncDTO setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion
        return this
    }


    /**
     * 设置「完全名称」值
     * @param val
     */
    PSCorePrdFuncDTO setFullName(String fullName) {
        this.fullName = fullName
        return this
    }


    /**
     * 设置「完全路径」值
     * @param val
     */
    PSCorePrdFuncDTO setFullPath(String fullPath) {
        this.fullPath = fullPath
        return this
    }


    /**
     * 设置「功能编号」值
     * @param val
     */
    PSCorePrdFuncDTO setFuncSN(String funcSN) {
        this.funcSN = funcSN
        return this
    }


    /**
     * 设置「功能状态」值
     * 字典[核心产品功能状态]
     * @param val
     */
    PSCorePrdFuncDTO setFuncState(String funcState) {
        this.funcState = funcState
        return this
    }


    /**
     * 设置「功能标记」值
     * @param val
     */
    PSCorePrdFuncDTO setFuncTag(String funcTag) {
        this.funcTag = funcTag
        return this
    }


    /**
     * 设置「功能标记2」值
     * @param val
     */
    PSCorePrdFuncDTO setFuncTag2(String funcTag2) {
        this.funcTag2 = funcTag2
        return this
    }


    /**
     * 设置「功能描述链接」值
     * @param val
     */
    PSCorePrdFuncDTO setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl
        return this
    }


    /**
     * 设置「Http仓库地址」值
     * @param val
     */
    PSCorePrdFuncDTO setHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    PSCorePrdFuncDTO setMemo(String memo) {
        this.memo = memo
        return this
    }


    /**
     * 设置「排序值」值
     * @param val
     */
    PSCorePrdFuncDTO setOrderValue(Integer orderValue) {
        this.orderValue = orderValue
        return this
    }


    /**
     * 设置「核心产品功能标识」值
     * @param val
     */
    PSCorePrdFuncDTO setPSCorePrdFuncId(String pSCorePrdFuncId) {
        this.pSCorePrdFuncId = pSCorePrdFuncId
        return this
    }


    /**
     * 设置「应用名称」值
     * @param val
     */
    PSCorePrdFuncDTO setPSCorePrdFuncName(String pSCorePrdFuncName) {
        this.pSCorePrdFuncName = pSCorePrdFuncName
        return this
    }


    /**
     * 设置「核心产品」值
     * @param val
     */
    PSCorePrdFuncDTO setPSCorePrdId(String pSCorePrdId) {
        this.pSCorePrdId = pSCorePrdId
        return this
    }


    /**
     * 设置「核心产品」值
     * @param val
     */
    PSCorePrdFuncDTO setPSCorePrdName(String pSCorePrdName) {
        this.pSCorePrdName = pSCorePrdName
        return this
    }


    /**
     * 设置「路径」值
     * @param val
     */
    PSCorePrdFuncDTO setPath(String path) {
        this.path = path
        return this
    }


    /**
     * 设置「设置地址」值
     * @param val
     */
    PSCorePrdFuncDTO setSettingUrl(String settingUrl) {
        this.settingUrl = settingUrl
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PSCorePrdFuncDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSCorePrdFuncDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }

}
