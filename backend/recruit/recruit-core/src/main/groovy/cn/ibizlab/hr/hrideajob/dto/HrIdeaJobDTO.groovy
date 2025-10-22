package cn.ibizlab.hr.hrideajob.dto

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
class HrIdeaJobDTO extends GroovyDTO<HrIdeaJobDTO> {

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
     * 「岗位名称」
     */
    @JsonProperty("job_name")
    String jobName
    /**
     * 「工作地点」
     */
    @JsonProperty("address_id")
    String addressId
    /**
     * 「职位类别」
     */
    @JsonProperty("category")
    String category
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
     * 「需求」
     */
    @JsonProperty("idea_id")
    String ideaId
    /**
     * 「岗位」
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
     * 设置「标识」值
     * @param val
     */
    HrIdeaJobDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrIdeaJobDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「岗位名称」值
     * @param val
     */
    HrIdeaJobDTO setJobName(String jobName) {
        this.jobName = jobName
        return this
    }


    /**
     * 设置「工作地点」值
     * @param val
     */
    HrIdeaJobDTO setAddressId(String addressId) {
        this.addressId = addressId
        return this
    }


    /**
     * 设置「职位类别」值
     * @param val
     */
    HrIdeaJobDTO setCategory(String category) {
        this.category = category
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrIdeaJobDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrIdeaJobDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「需求」值
     * @param val
     */
    HrIdeaJobDTO setIdeaId(String ideaId) {
        this.ideaId = ideaId
        return this
    }


    /**
     * 设置「岗位」值
     * @param val
     */
    HrIdeaJobDTO setJobId(String jobId) {
        this.jobId = jobId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrIdeaJobDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrIdeaJobDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
