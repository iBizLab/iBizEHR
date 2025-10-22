package cn.ibizlab.hr.hrrecruitmentsource.dto

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
class HrRecruitmentSourceDTO extends GroovyDTO<HrRecruitmentSourceDTO> {

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
     * 「有域」
     */
    @JsonProperty("has_domain")
    String hasDomain
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「工作」
     */
    @JsonProperty("job_id")
    String jobId
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
     * 设置「建立时间」值
     * @param val
     */
    HrRecruitmentSourceDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrRecruitmentSourceDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrRecruitmentSourceDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「有域」值
     * @param val
     */
    HrRecruitmentSourceDTO setHasDomain(String hasDomain) {
        this.hasDomain = hasDomain
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrRecruitmentSourceDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「工作」值
     * @param val
     */
    HrRecruitmentSourceDTO setJobId(String jobId) {
        this.jobId = jobId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrRecruitmentSourceDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrRecruitmentSourceDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
