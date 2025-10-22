package cn.ibizlab.mail.mailaliasdomain.dto

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
class MailAliasDomainDTO extends GroovyDTO<MailAliasDomainDTO> {

    /**
     * 「弹跳别名」
     */
    @JsonProperty("bounce_alias")
    String bounceAlias
    /**
     * 「退件电子邮件」
     */
    @JsonProperty("bounce_email")
    String bounceEmail
    /**
     * 「全部别名」
     */
    @JsonProperty("catchall_alias")
    String catchallAlias
    /**
     * 「预设邮件」
     */
    @JsonProperty("catchall_email")
    String catchallEmail
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
     * 「默认发件人别名」
     */
    @JsonProperty("default_from")
    String defaultFrom
    /**
     * 「默认从」
     */
    @JsonProperty("default_from_email")
    String defaultFromEmail
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
     * 设置「弹跳别名」值
     * @param val
     */
    MailAliasDomainDTO setBounceAlias(String bounceAlias) {
        this.bounceAlias = bounceAlias
        return this
    }


    /**
     * 设置「退件电子邮件」值
     * @param val
     */
    MailAliasDomainDTO setBounceEmail(String bounceEmail) {
        this.bounceEmail = bounceEmail
        return this
    }


    /**
     * 设置「全部别名」值
     * @param val
     */
    MailAliasDomainDTO setCatchallAlias(String catchallAlias) {
        this.catchallAlias = catchallAlias
        return this
    }


    /**
     * 设置「预设邮件」值
     * @param val
     */
    MailAliasDomainDTO setCatchallEmail(String catchallEmail) {
        this.catchallEmail = catchallEmail
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailAliasDomainDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    MailAliasDomainDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「默认发件人别名」值
     * @param val
     */
    MailAliasDomainDTO setDefaultFrom(String defaultFrom) {
        this.defaultFrom = defaultFrom
        return this
    }


    /**
     * 设置「默认从」值
     * @param val
     */
    MailAliasDomainDTO setDefaultFromEmail(String defaultFromEmail) {
        this.defaultFromEmail = defaultFromEmail
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailAliasDomainDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailAliasDomainDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailAliasDomainDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    MailAliasDomainDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailAliasDomainDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    MailAliasDomainDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
