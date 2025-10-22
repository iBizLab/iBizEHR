package cn.ibizlab.hr.hrjobplatformaccount.dto

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
class HrJobPlatformAccountDTO extends GroovyDTO<HrJobPlatformAccountDTO> {

    /**
     * 「接收简历邮箱」
     */
    @JsonProperty("receive_email")
    String receiveEmail
    /**
     * 「图片」
     */
    @JsonProperty("image")
    String image
    /**
     * 「发布状态」
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
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「招聘平台」
     */
    @JsonProperty("job_platform_id")
    String jobPlatformId
    /**
     * 「名称」
     */
    @JsonProperty("job_platform_name")
    String jobPlatformName
    /**
     * 「授权账号」
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
     * 设置「接收简历邮箱」值
     * @param val
     */
    HrJobPlatformAccountDTO setReceiveEmail(String receiveEmail) {
        this.receiveEmail = receiveEmail
        return this
    }


    /**
     * 设置「图片」值
     * @param val
     */
    HrJobPlatformAccountDTO setImage(String image) {
        this.image = image
        return this
    }


    /**
     * 设置「发布状态」值
     * 字典[招聘平台/账号发布状态]
     * @param val
     */
    HrJobPlatformAccountDTO setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrJobPlatformAccountDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrJobPlatformAccountDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrJobPlatformAccountDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「招聘平台」值
     * @param val
     */
    HrJobPlatformAccountDTO setJobPlatformId(String jobPlatformId) {
        this.jobPlatformId = jobPlatformId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrJobPlatformAccountDTO setJobPlatformName(String jobPlatformName) {
        this.jobPlatformName = jobPlatformName
        return this
    }


    /**
     * 设置「授权账号」值
     * @param val
     */
    HrJobPlatformAccountDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrJobPlatformAccountDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrJobPlatformAccountDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
