package cn.ibizlab.hr.hrcandidateskill.dto

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
class HrCandidateSkillDTO extends GroovyDTO<HrCandidateSkillDTO> {

    /**
     * 「应聘人」
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
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「技能」
     */
    @JsonProperty("skill_id")
    String skillId
    /**
     * 「技能等级」
     */
    @JsonProperty("skill_level_id")
    String skillLevelId
    /**
     * 「技能类型」
     */
    @JsonProperty("skill_type_id")
    String skillTypeId
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
     * 设置「应聘人」值
     * @param val
     */
    HrCandidateSkillDTO setCandidateId(String candidateId) {
        this.candidateId = candidateId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrCandidateSkillDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrCandidateSkillDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrCandidateSkillDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrCandidateSkillDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「技能」值
     * @param val
     */
    HrCandidateSkillDTO setSkillId(String skillId) {
        this.skillId = skillId
        return this
    }


    /**
     * 设置「技能等级」值
     * @param val
     */
    HrCandidateSkillDTO setSkillLevelId(String skillLevelId) {
        this.skillLevelId = skillLevelId
        return this
    }


    /**
     * 设置「技能类型」值
     * @param val
     */
    HrCandidateSkillDTO setSkillTypeId(String skillTypeId) {
        this.skillTypeId = skillTypeId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrCandidateSkillDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrCandidateSkillDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
