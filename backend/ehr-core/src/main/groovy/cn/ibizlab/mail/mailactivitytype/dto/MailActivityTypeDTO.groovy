package cn.ibizlab.mail.mailactivitytype.dto

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
class MailActivityTypeDTO extends GroovyDTO<MailActivityTypeDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「操作」
     * 字典[操作]
     */
    @JsonProperty("category")
    String category
    /**
     * 「链接类型」
     * 字典[链接类型]
     */
    @JsonProperty("chaining_type")
    String chainingType
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
     * 「排版类型」
     * 字典[排版类型]
     */
    @JsonProperty("decoration_type")
    String decorationType
    /**
     * 「默认备注」
     */
    @JsonProperty("default_note")
    String defaultNote
    /**
     * 「默认用户」
     */
    @JsonProperty("default_user_id")
    String defaultUserId
    /**
     * 「安排」
     */
    @JsonProperty("delay_count")
    Integer delayCount
    /**
     * 「延迟类型」
     * 字典[延迟类型]
     */
    @JsonProperty("delay_from")
    String delayFrom
    /**
     * 「延迟标签」
     */
    @JsonProperty("delay_label")
    String delayLabel
    /**
     * 「延迟单位」
     * 字典[延迟单位]
     */
    @JsonProperty("delay_unit")
    String delayUnit
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「图标」
     */
    @JsonProperty("icon")
    String icon
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「保持完成」
     * 字典[是否]
     */
    @JsonProperty("keep_done")
    Integer keepDone
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「资源模型」
     */
    @JsonProperty("res_model")
    String resModel
    /**
     * 「模型已更改」
     * 字典[是否]
     */
    @JsonProperty("res_model_change")
    Integer resModelChange
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「默认摘要」
     */
    @JsonProperty("summary")
    String summary
    /**
     * 「触发方式」
     */
    @JsonProperty("triggered_next_type_id")
    String triggeredNextTypeId
    /**
     * 「触发方式」
     */
    @JsonProperty("triggered_next_type_name")
    String triggeredNextTypeName
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
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    MailActivityTypeDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「操作」值
     * 字典[操作]
     * @param val
     */
    MailActivityTypeDTO setCategory(String category) {
        this.category = category
        return this
    }


    /**
     * 设置「链接类型」值
     * 字典[链接类型]
     * @param val
     */
    MailActivityTypeDTO setChainingType(String chainingType) {
        this.chainingType = chainingType
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailActivityTypeDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    MailActivityTypeDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「排版类型」值
     * 字典[排版类型]
     * @param val
     */
    MailActivityTypeDTO setDecorationType(String decorationType) {
        this.decorationType = decorationType
        return this
    }


    /**
     * 设置「默认备注」值
     * @param val
     */
    MailActivityTypeDTO setDefaultNote(String defaultNote) {
        this.defaultNote = defaultNote
        return this
    }


    /**
     * 设置「默认用户」值
     * @param val
     */
    MailActivityTypeDTO setDefaultUserId(String defaultUserId) {
        this.defaultUserId = defaultUserId
        return this
    }


    /**
     * 设置「安排」值
     * @param val
     */
    MailActivityTypeDTO setDelayCount(Integer delayCount) {
        this.delayCount = delayCount
        return this
    }


    /**
     * 设置「延迟类型」值
     * 字典[延迟类型]
     * @param val
     */
    MailActivityTypeDTO setDelayFrom(String delayFrom) {
        this.delayFrom = delayFrom
        return this
    }


    /**
     * 设置「延迟标签」值
     * @param val
     */
    MailActivityTypeDTO setDelayLabel(String delayLabel) {
        this.delayLabel = delayLabel
        return this
    }


    /**
     * 设置「延迟单位」值
     * 字典[延迟单位]
     * @param val
     */
    MailActivityTypeDTO setDelayUnit(String delayUnit) {
        this.delayUnit = delayUnit
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailActivityTypeDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    MailActivityTypeDTO setIcon(String icon) {
        this.icon = icon
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailActivityTypeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「保持完成」值
     * 字典[是否]
     * @param val
     */
    MailActivityTypeDTO setKeepDone(Integer keepDone) {
        this.keepDone = keepDone
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailActivityTypeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「资源模型」值
     * @param val
     */
    MailActivityTypeDTO setResModel(String resModel) {
        this.resModel = resModel
        return this
    }


    /**
     * 设置「模型已更改」值
     * 字典[是否]
     * @param val
     */
    MailActivityTypeDTO setResModelChange(Integer resModelChange) {
        this.resModelChange = resModelChange
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    MailActivityTypeDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「默认摘要」值
     * @param val
     */
    MailActivityTypeDTO setSummary(String summary) {
        this.summary = summary
        return this
    }


    /**
     * 设置「触发方式」值
     * @param val
     */
    MailActivityTypeDTO setTriggeredNextTypeId(String triggeredNextTypeId) {
        this.triggeredNextTypeId = triggeredNextTypeId
        return this
    }


    /**
     * 设置「触发方式」值
     * @param val
     */
    MailActivityTypeDTO setTriggeredNextTypeName(String triggeredNextTypeName) {
        this.triggeredNextTypeName = triggeredNextTypeName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailActivityTypeDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    MailActivityTypeDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
