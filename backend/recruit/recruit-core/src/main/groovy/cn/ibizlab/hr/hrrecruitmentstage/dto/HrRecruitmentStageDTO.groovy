package cn.ibizlab.hr.hrrecruitmentstage.dto

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
class HrRecruitmentStageDTO extends GroovyDTO<HrRecruitmentStageDTO> {

    /**
     * 「状态」
     * 字典[招聘阶段状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「颜色」
     */
    @JsonProperty("color")
    String color
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
     * 「折叠看板」
     * 字典[是否]
     */
    @JsonProperty("fold")
    Integer fold
    /**
     * 「雇佣阶段」
     * 字典[是否]
     */
    @JsonProperty("hired_stage")
    Integer hiredStage
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「警告是否清晰可见」
     * 字典[是否]
     */
    @JsonProperty("is_warning_visible")
    Integer isWarningVisible
    /**
     * 「红色的看板标签」
     */
    @JsonProperty("legend_blocked")
    String legendBlocked
    /**
     * 「绿色看板标签」
     */
    @JsonProperty("legend_done")
    String legendDone
    /**
     * 「灰色看板标签」
     */
    @JsonProperty("legend_normal")
    String legendNormal
    /**
     * 「阶段名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「要求」
     */
    @JsonProperty("requirements")
    String requirements
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
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
     * 字典[招聘阶段状态]
     * @param val
     */
    HrRecruitmentStageDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「颜色」值
     * @param val
     */
    HrRecruitmentStageDTO setColor(String color) {
        this.color = color
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrRecruitmentStageDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrRecruitmentStageDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrRecruitmentStageDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「折叠看板」值
     * 字典[是否]
     * @param val
     */
    HrRecruitmentStageDTO setFold(Integer fold) {
        this.fold = fold
        return this
    }


    /**
     * 设置「雇佣阶段」值
     * 字典[是否]
     * @param val
     */
    HrRecruitmentStageDTO setHiredStage(Integer hiredStage) {
        this.hiredStage = hiredStage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrRecruitmentStageDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「警告是否清晰可见」值
     * 字典[是否]
     * @param val
     */
    HrRecruitmentStageDTO setIsWarningVisible(Integer isWarningVisible) {
        this.isWarningVisible = isWarningVisible
        return this
    }


    /**
     * 设置「红色的看板标签」值
     * @param val
     */
    HrRecruitmentStageDTO setLegendBlocked(String legendBlocked) {
        this.legendBlocked = legendBlocked
        return this
    }


    /**
     * 设置「绿色看板标签」值
     * @param val
     */
    HrRecruitmentStageDTO setLegendDone(String legendDone) {
        this.legendDone = legendDone
        return this
    }


    /**
     * 设置「灰色看板标签」值
     * @param val
     */
    HrRecruitmentStageDTO setLegendNormal(String legendNormal) {
        this.legendNormal = legendNormal
        return this
    }


    /**
     * 设置「阶段名称」值
     * @param val
     */
    HrRecruitmentStageDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「要求」值
     * @param val
     */
    HrRecruitmentStageDTO setRequirements(String requirements) {
        this.requirements = requirements
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    HrRecruitmentStageDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrRecruitmentStageDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrRecruitmentStageDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
