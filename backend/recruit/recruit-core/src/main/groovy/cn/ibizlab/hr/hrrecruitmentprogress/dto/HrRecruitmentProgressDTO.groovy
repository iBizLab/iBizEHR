package cn.ibizlab.hr.hrrecruitmentprogress.dto

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
class HrRecruitmentProgressDTO extends GroovyDTO<HrRecruitmentProgressDTO> {

    /**
     * 「状态」
     * 字典[招聘流程状态]
     */
    @JsonProperty("status")
    String status
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
     * 「招聘流程名称」
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
     * 设置「状态」值
     * 字典[招聘流程状态]
     * @param val
     */
    HrRecruitmentProgressDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrRecruitmentProgressDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrRecruitmentProgressDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrRecruitmentProgressDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「招聘流程名称」值
     * @param val
     */
    HrRecruitmentProgressDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrRecruitmentProgressDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrRecruitmentProgressDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
