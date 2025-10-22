package cn.ibizlab.hr.hrjobplatform.dto

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
class HrJobPlatformDTO extends GroovyDTO<HrJobPlatformDTO> {

    /**
     * 「图片」
     */
    @JsonProperty("image")
    String image
    /**
     * 「授权账号数量」
     */
    @JsonProperty("platform_account_count")
    Integer platformAccountCount
    /**
     * 「类型」
     * 字典[岗位发布平台类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「招聘平台地址」
     */
    @JsonProperty("url")
    String url
    /**
     * 「状态」
     * 字典[招聘平台/账号发布状态]
     */
    @JsonProperty("publish_status")
    String publishStatus
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
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「电子邮件」
     */
    @JsonProperty("email")
    String email
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
     * 设置「图片」值
     * @param val
     */
    HrJobPlatformDTO setImage(String image) {
        this.image = image
        return this
    }


    /**
     * 设置「授权账号数量」值
     * @param val
     */
    HrJobPlatformDTO setPlatformAccountCount(Integer platformAccountCount) {
        this.platformAccountCount = platformAccountCount
        return this
    }


    /**
     * 设置「类型」值
     * 字典[岗位发布平台类型]
     * @param val
     */
    HrJobPlatformDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「招聘平台地址」值
     * @param val
     */
    HrJobPlatformDTO setUrl(String url) {
        this.url = url
        return this
    }


    /**
     * 设置「状态」值
     * 字典[招聘平台/账号发布状态]
     * @param val
     */
    HrJobPlatformDTO setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrJobPlatformDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrJobPlatformDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrJobPlatformDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「电子邮件」值
     * @param val
     */
    HrJobPlatformDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrJobPlatformDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrJobPlatformDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrJobPlatformDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrJobPlatformDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
