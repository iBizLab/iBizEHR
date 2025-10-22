package cn.ibizlab.hr.hrskill.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.hr.hrskill.dto.HrSkillDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class HrSkillDTO extends GroovyDTO<HrSkillDTO> {

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
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
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
     * 「null」
     */
    @JsonProperty("hr_skills")
    List<HrSkillDTO> hrSkills

    /**
     * 设置「建立时间」值
     * @param val
     */
    HrSkillDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrSkillDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrSkillDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrSkillDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrSkillDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    HrSkillDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「技能类型」值
     * @param val
     */
    HrSkillDTO setSkillTypeId(String skillTypeId) {
        this.skillTypeId = skillTypeId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrSkillDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrSkillDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    HrSkillDTO setHrSkills(List<HrSkillDTO> hrSkills) {
        this.hrSkills = hrSkills
        return this
    }

}
