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
     * 「详细信息」
     */
    @JsonProperty("info")
    String info
    /**
     * 「产品分类」
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
     * 「当前版本」
     */
    @JsonProperty("currentversion")
    String currentVersion
    /**
     * 「功能状态」
     * 字典[核心产品功能状态]
     */
    @JsonProperty("funcstate")
    String funcState
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
     * 「设置地址」
     */
    @JsonProperty("settingurl")
    String settingUrl

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
     * 设置「详细信息」值
     * @param val
     */
    PSCorePrdFuncDTO setInfo(String info) {
        this.info = info
        return this
    }


    /**
     * 设置「产品分类」值
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
     * 设置「当前版本」值
     * @param val
     */
    PSCorePrdFuncDTO setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion
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
     * 设置「设置地址」值
     * @param val
     */
    PSCorePrdFuncDTO setSettingUrl(String settingUrl) {
        this.settingUrl = settingUrl
        return this
    }

}
