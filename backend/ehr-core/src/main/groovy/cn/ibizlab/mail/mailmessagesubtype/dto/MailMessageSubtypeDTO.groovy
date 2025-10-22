package cn.ibizlab.mail.mailmessagesubtype.dto

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
class MailMessageSubtypeDTO extends GroovyDTO<MailMessageSubtypeDTO> {

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
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「隐藏」
     * 字典[是否]
     */
    @JsonProperty("hidden")
    Integer hidden
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「仅内部的」
     * 字典[是否]
     */
    @JsonProperty("internal")
    Integer internal
    /**
     * 「默认」
     * 字典[是否]
     */
    @JsonProperty("is_default")
    Integer isDefault
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「上级」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「关联字段」
     */
    @JsonProperty("relation_field")
    String relationField
    /**
     * 「模型」
     */
    @JsonProperty("res_model")
    String resModel
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「跟踪收件人」
     * 字典[是否]
     */
    @JsonProperty("track_recipients")
    Integer trackRecipients
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
    MailMessageSubtypeDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    MailMessageSubtypeDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    MailMessageSubtypeDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailMessageSubtypeDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「隐藏」值
     * 字典[是否]
     * @param val
     */
    MailMessageSubtypeDTO setHidden(Integer hidden) {
        this.hidden = hidden
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailMessageSubtypeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「仅内部的」值
     * 字典[是否]
     * @param val
     */
    MailMessageSubtypeDTO setInternal(Integer internal) {
        this.internal = internal
        return this
    }


    /**
     * 设置「默认」值
     * 字典[是否]
     * @param val
     */
    MailMessageSubtypeDTO setIsDefault(Integer isDefault) {
        this.isDefault = isDefault
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailMessageSubtypeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「上级」值
     * @param val
     */
    MailMessageSubtypeDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「关联字段」值
     * @param val
     */
    MailMessageSubtypeDTO setRelationField(String relationField) {
        this.relationField = relationField
        return this
    }


    /**
     * 设置「模型」值
     * @param val
     */
    MailMessageSubtypeDTO setResModel(String resModel) {
        this.resModel = resModel
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    MailMessageSubtypeDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「跟踪收件人」值
     * 字典[是否]
     * @param val
     */
    MailMessageSubtypeDTO setTrackRecipients(Integer trackRecipients) {
        this.trackRecipients = trackRecipients
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailMessageSubtypeDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    MailMessageSubtypeDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
