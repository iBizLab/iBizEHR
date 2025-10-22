package cn.ibizlab.hr.hrjobplatformrecord.dto

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
class HrJobPlatformRecordDTO extends GroovyDTO<HrJobPlatformRecordDTO> {

    /**
     * 「类型」
     * 字典[岗位发布平台类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「发布人/账号」
     */
    @JsonProperty("owner_id")
    String ownerId
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
     * 「岗位」
     */
    @JsonProperty("job_id")
    String jobId
    /**
     * 「招聘平台」
     */
    @JsonProperty("job_platform_id")
    String jobPlatformId
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「更新人」
     */
    @JsonProperty("write_uid")
    String writeUid

    /**
     * 设置「类型」值
     * 字典[岗位发布平台类型]
     * @param val
     */
    HrJobPlatformRecordDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「发布人/账号」值
     * @param val
     */
    HrJobPlatformRecordDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrJobPlatformRecordDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrJobPlatformRecordDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrJobPlatformRecordDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「岗位」值
     * @param val
     */
    HrJobPlatformRecordDTO setJobId(String jobId) {
        this.jobId = jobId
        return this
    }


    /**
     * 设置「招聘平台」值
     * @param val
     */
    HrJobPlatformRecordDTO setJobPlatformId(String jobPlatformId) {
        this.jobPlatformId = jobPlatformId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrJobPlatformRecordDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrJobPlatformRecordDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
