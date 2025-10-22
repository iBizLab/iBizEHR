package cn.ibizlab.discuss.discussvoicemetadata.dto

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
class DiscussVoiceMetadataDTO extends GroovyDTO<DiscussVoiceMetadataDTO> {

    /**
     * 「附件」
     */
    @JsonProperty("attachment_id")
    String attachmentId
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
     * 设置「附件」值
     * @param val
     */
    DiscussVoiceMetadataDTO setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    DiscussVoiceMetadataDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    DiscussVoiceMetadataDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    DiscussVoiceMetadataDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DiscussVoiceMetadataDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DiscussVoiceMetadataDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    DiscussVoiceMetadataDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
