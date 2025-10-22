package cn.ibizlab.mail.mailalias.dto

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
class MailAliasDTO extends GroovyDTO<MailAliasDTO> {

    /**
     * 「自定义退回消息」
     */
    @JsonProperty("alias_bounced_content")
    String aliasBouncedContent
    /**
     * 「别名授权于」
     * 字典[别名授权于]
     */
    @JsonProperty("alias_contact")
    String aliasContact
    /**
     * 「默认值」
     */
    @JsonProperty("alias_defaults")
    String aliasDefaults
    /**
     * 「别名域」
     */
    @JsonProperty("alias_domain_id")
    String aliasDomainId
    /**
     * 「记录线索ID」
     */
    @JsonProperty("alias_force_thread_id")
    Integer aliasForceThreadId
    /**
     * 「别名电子邮件」
     */
    @JsonProperty("alias_full_name")
    String aliasFullName
    /**
     * 「收件时检测本地的别名域」
     * 字典[是否]
     */
    @JsonProperty("alias_incoming_local")
    Integer aliasIncomingLocal
    /**
     * 「别名」
     */
    @JsonProperty("alias_name")
    String aliasName
    /**
     * 「上级记录ID」
     */
    @JsonProperty("alias_parent_thread_id")
    Integer aliasParentThreadId
    /**
     * 「别名状态」
     * 字典[别名状态]
     */
    @JsonProperty("alias_status")
    String aliasStatus
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
     * 设置「自定义退回消息」值
     * @param val
     */
    MailAliasDTO setAliasBouncedContent(String aliasBouncedContent) {
        this.aliasBouncedContent = aliasBouncedContent
        return this
    }


    /**
     * 设置「别名授权于」值
     * 字典[别名授权于]
     * @param val
     */
    MailAliasDTO setAliasContact(String aliasContact) {
        this.aliasContact = aliasContact
        return this
    }


    /**
     * 设置「默认值」值
     * @param val
     */
    MailAliasDTO setAliasDefaults(String aliasDefaults) {
        this.aliasDefaults = aliasDefaults
        return this
    }


    /**
     * 设置「别名域」值
     * @param val
     */
    MailAliasDTO setAliasDomainId(String aliasDomainId) {
        this.aliasDomainId = aliasDomainId
        return this
    }


    /**
     * 设置「记录线索ID」值
     * @param val
     */
    MailAliasDTO setAliasForceThreadId(Integer aliasForceThreadId) {
        this.aliasForceThreadId = aliasForceThreadId
        return this
    }


    /**
     * 设置「别名电子邮件」值
     * @param val
     */
    MailAliasDTO setAliasFullName(String aliasFullName) {
        this.aliasFullName = aliasFullName
        return this
    }


    /**
     * 设置「收件时检测本地的别名域」值
     * 字典[是否]
     * @param val
     */
    MailAliasDTO setAliasIncomingLocal(Integer aliasIncomingLocal) {
        this.aliasIncomingLocal = aliasIncomingLocal
        return this
    }


    /**
     * 设置「别名」值
     * @param val
     */
    MailAliasDTO setAliasName(String aliasName) {
        this.aliasName = aliasName
        return this
    }


    /**
     * 设置「上级记录ID」值
     * @param val
     */
    MailAliasDTO setAliasParentThreadId(Integer aliasParentThreadId) {
        this.aliasParentThreadId = aliasParentThreadId
        return this
    }


    /**
     * 设置「别名状态」值
     * 字典[别名状态]
     * @param val
     */
    MailAliasDTO setAliasStatus(String aliasStatus) {
        this.aliasStatus = aliasStatus
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailAliasDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    MailAliasDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailAliasDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailAliasDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailAliasDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    MailAliasDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
