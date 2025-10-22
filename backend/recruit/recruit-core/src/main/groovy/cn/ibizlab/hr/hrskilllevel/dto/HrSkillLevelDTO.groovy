package cn.ibizlab.hr.hrskilllevel.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.hr.hrskilllevel.dto.HrSkillLevelDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class HrSkillLevelDTO extends GroovyDTO<HrSkillLevelDTO> {

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
     * 「默认等级」
     * 字典[是否]
     */
    @JsonProperty("default_level")
    Integer defaultLevel
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
     * 「进度」
     */
    @JsonProperty("level_progress")
    Integer levelProgress
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
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
    @JsonProperty("hr_skill_levels")
    List<HrSkillLevelDTO> hrSkillLevels

    /**
     * 设置「建立时间」值
     * @param val
     */
    HrSkillLevelDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrSkillLevelDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「默认等级」值
     * 字典[是否]
     * @param val
     */
    HrSkillLevelDTO setDefaultLevel(Integer defaultLevel) {
        this.defaultLevel = defaultLevel
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrSkillLevelDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrSkillLevelDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「进度」值
     * @param val
     */
    HrSkillLevelDTO setLevelProgress(Integer levelProgress) {
        this.levelProgress = levelProgress
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrSkillLevelDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「技能类型」值
     * @param val
     */
    HrSkillLevelDTO setSkillTypeId(String skillTypeId) {
        this.skillTypeId = skillTypeId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrSkillLevelDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrSkillLevelDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    HrSkillLevelDTO setHrSkillLevels(List<HrSkillLevelDTO> hrSkillLevels) {
        this.hrSkillLevels = hrSkillLevels
        return this
    }

}
