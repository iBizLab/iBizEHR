package cn.ibizlab.extension.pscoreprd.dto

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
class PSCorePrdDTO extends GroovyDTO<PSCorePrdDTO> {

    /**
     * 「部署应用名」
     */
    @JsonProperty("deploy_system_code")
    String deploySystemCode
    /**
     * 「设置」
     */
    @JsonProperty("settings")
    String settings
    /**
     * 「部署节点」
     */
    @JsonProperty("deploy_service_hub_id")
    String deployServiceHubId
    /**
     * 「可用版本」
     */
    @JsonProperty("vers")
    String vers
    /**
     * 「部署数据源」
     */
    @JsonProperty("deploy_data_source_id")
    String deployDataSourceId
    /**
     * 「部署版本」
     */
    @JsonProperty("deploy_prdver_id")
    String deployPrdverId
    /**
     * 「详细信息」
     */
    @JsonProperty("info")
    String info
    /**
     * 「产品标签」
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
     * 「产品分类」
     */
    @JsonProperty("pscoreprdcatid")
    String pSCorePrdCatId
    /**
     * 「产品分类」
     */
    @JsonProperty("pscoreprdcatname")
    String pSCorePrdCatName
    /**
     * 「产品分类路径」
     */
    @JsonProperty("pscoreprdcatpath")
    String pSCorePrdCatPath
    /**
     * 「核心产品标识」
     */
    @JsonProperty("pscoreprdid")
    String pSCorePrdId
    /**
     * 「产品名称」
     */
    @JsonProperty("pscoreprdname")
    String pSCorePrdName
    /**
     * 「路径」
     */
    @JsonProperty("path")
    String path
    /**
     * 「安装包路径」
     */
    @JsonProperty("pkgfolder")
    String pkgFolder
    /**
     * 「产品编号」
     */
    @JsonProperty("prdsn")
    String prdSN
    /**
     * 「产品标记」
     */
    @JsonProperty("prdtag")
    String prdTag
    /**
     * 「产品标记2」
     */
    @JsonProperty("prdtag2")
    String prdTag2
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
     * 设置「部署应用名」值
     * @param val
     */
    PSCorePrdDTO setDeploySystemCode(String deploySystemCode) {
        this.deploySystemCode = deploySystemCode
        return this
    }


    /**
     * 设置「设置」值
     * @param val
     */
    PSCorePrdDTO setSettings(String settings) {
        this.settings = settings
        return this
    }


    /**
     * 设置「部署节点」值
     * @param val
     */
    PSCorePrdDTO setDeployServiceHubId(String deployServiceHubId) {
        this.deployServiceHubId = deployServiceHubId
        return this
    }


    /**
     * 设置「可用版本」值
     * @param val
     */
    PSCorePrdDTO setVers(String vers) {
        this.vers = vers
        return this
    }


    /**
     * 设置「部署数据源」值
     * @param val
     */
    PSCorePrdDTO setDeployDataSourceId(String deployDataSourceId) {
        this.deployDataSourceId = deployDataSourceId
        return this
    }


    /**
     * 设置「部署版本」值
     * @param val
     */
    PSCorePrdDTO setDeployPrdverId(String deployPrdverId) {
        this.deployPrdverId = deployPrdverId
        return this
    }


    /**
     * 设置「详细信息」值
     * @param val
     */
    PSCorePrdDTO setInfo(String info) {
        this.info = info
        return this
    }


    /**
     * 设置「产品标签」值
     * @param val
     */
    PSCorePrdDTO setCategory(String category) {
        this.category = category
        return this
    }


    /**
     * 设置「变更日志」值
     * @param val
     */
    PSCorePrdDTO setChangelog(String changelog) {
        this.changelog = changelog
        return this
    }


    /**
     * 设置「图标路径」值
     * @param val
     */
    PSCorePrdDTO setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PSCorePrdDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSCorePrdDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「当前版本」值
     * @param val
     */
    PSCorePrdDTO setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion
        return this
    }


    /**
     * 设置「完全名称」值
     * @param val
     */
    PSCorePrdDTO setFullName(String fullName) {
        this.fullName = fullName
        return this
    }


    /**
     * 设置「完全路径」值
     * @param val
     */
    PSCorePrdDTO setFullPath(String fullPath) {
        this.fullPath = fullPath
        return this
    }


    /**
     * 设置「Http仓库地址」值
     * @param val
     */
    PSCorePrdDTO setHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    PSCorePrdDTO setMemo(String memo) {
        this.memo = memo
        return this
    }


    /**
     * 设置「产品分类」值
     * @param val
     */
    PSCorePrdDTO setPSCorePrdCatId(String pSCorePrdCatId) {
        this.pSCorePrdCatId = pSCorePrdCatId
        return this
    }


    /**
     * 设置「产品分类」值
     * @param val
     */
    PSCorePrdDTO setPSCorePrdCatName(String pSCorePrdCatName) {
        this.pSCorePrdCatName = pSCorePrdCatName
        return this
    }


    /**
     * 设置「产品分类路径」值
     * @param val
     */
    PSCorePrdDTO setPSCorePrdCatPath(String pSCorePrdCatPath) {
        this.pSCorePrdCatPath = pSCorePrdCatPath
        return this
    }


    /**
     * 设置「核心产品标识」值
     * @param val
     */
    PSCorePrdDTO setPSCorePrdId(String pSCorePrdId) {
        this.pSCorePrdId = pSCorePrdId
        return this
    }


    /**
     * 设置「产品名称」值
     * @param val
     */
    PSCorePrdDTO setPSCorePrdName(String pSCorePrdName) {
        this.pSCorePrdName = pSCorePrdName
        return this
    }


    /**
     * 设置「路径」值
     * @param val
     */
    PSCorePrdDTO setPath(String path) {
        this.path = path
        return this
    }


    /**
     * 设置「安装包路径」值
     * @param val
     */
    PSCorePrdDTO setPkgFolder(String pkgFolder) {
        this.pkgFolder = pkgFolder
        return this
    }


    /**
     * 设置「产品编号」值
     * @param val
     */
    PSCorePrdDTO setPrdSN(String prdSN) {
        this.prdSN = prdSN
        return this
    }


    /**
     * 设置「产品标记」值
     * @param val
     */
    PSCorePrdDTO setPrdTag(String prdTag) {
        this.prdTag = prdTag
        return this
    }


    /**
     * 设置「产品标记2」值
     * @param val
     */
    PSCorePrdDTO setPrdTag2(String prdTag2) {
        this.prdTag2 = prdTag2
        return this
    }


    /**
     * 设置「设置地址」值
     * @param val
     */
    PSCorePrdDTO setSettingUrl(String settingUrl) {
        this.settingUrl = settingUrl
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PSCorePrdDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSCorePrdDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }

}
