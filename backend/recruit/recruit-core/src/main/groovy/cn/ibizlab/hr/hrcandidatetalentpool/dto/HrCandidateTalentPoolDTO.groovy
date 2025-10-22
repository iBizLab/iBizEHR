package cn.ibizlab.hr.hrcandidatetalentpool.dto

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
class HrCandidateTalentPoolDTO extends GroovyDTO<HrCandidateTalentPoolDTO> {

    /**
     * 「候选人」
     */
    @JsonProperty("candidate_id")
    String candidateId
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
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「人才库」
     */
    @JsonProperty("talent_pool_id")
    String talentPoolId
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
     * 设置「候选人」值
     * @param val
     */
    HrCandidateTalentPoolDTO setCandidateId(String candidateId) {
        this.candidateId = candidateId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrCandidateTalentPoolDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrCandidateTalentPoolDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrCandidateTalentPoolDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrCandidateTalentPoolDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「人才库」值
     * @param val
     */
    HrCandidateTalentPoolDTO setTalentPoolId(String talentPoolId) {
        this.talentPoolId = talentPoolId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrCandidateTalentPoolDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrCandidateTalentPoolDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
