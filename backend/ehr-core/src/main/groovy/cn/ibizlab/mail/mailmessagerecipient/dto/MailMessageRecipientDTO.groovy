package cn.ibizlab.mail.mailmessagerecipient.dto

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
class MailMessageRecipientDTO extends GroovyDTO<MailMessageRecipientDTO> {

    /**
     * 「建立人」
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「更新人」
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「标识」
     */
    @JsonProperty("message_id")
    String messageId
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「标识」
     */
    @JsonProperty("partner_id")
    String partnerId

    /**
     * 设置「建立人」值
     * @param val
     */
    MailMessageRecipientDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailMessageRecipientDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    MailMessageRecipientDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailMessageRecipientDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailMessageRecipientDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailMessageRecipientDTO setMessageId(String messageId) {
        this.messageId = messageId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailMessageRecipientDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailMessageRecipientDTO setPartnerId(String partnerId) {
        this.partnerId = partnerId
        return this
    }

}
