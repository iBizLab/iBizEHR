package cn.ibizlab.mail.mailmessage.dto

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
class MailMessageDTO extends GroovyDTO<MailMessageDTO> {

    /**
     * 「收藏计数」
     */
    @JsonProperty("favorite_count")
    Integer favoriteCount
    /**
     * 「收藏」
     * 字典[是否]
     */
    @JsonProperty("is_favorite")
    Integer isFavorite
    /**
     * 「资源标识」
     */
    @JsonProperty("res_id")
    String resId
    /**
     * 「上级消息内容」
     */
    @JsonProperty("parent_body")
    String parentBody
    /**
     * 「上级消息作者」
     */
    @JsonProperty("parent_author_id")
    String parentAuthorId
    /**
     * 「审计日志已启动」
     * 字典[是否]
     */
    @JsonProperty("account_audit_log_activated")
    Integer accountAuditLogActivated
    /**
     * 「描述」
     */
    @JsonProperty("account_audit_log_preview")
    String accountAuditLogPreview
    /**
     * 「访客」
     */
    @JsonProperty("author_guest_id")
    String authorGuestId
    /**
     * 「作者」
     */
    @JsonProperty("author_id")
    String authorId
    /**
     * 「内容」
     */
    @JsonProperty("body")
    String body
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
     * 「日期」
     */
    @JsonProperty("date")
    Timestamp date
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「电子邮件添加签字」
     * 字典[是否]
     */
    @JsonProperty("email_add_signature")
    Integer emailAddSignature
    /**
     * 「来自」
     */
    @JsonProperty("email_from")
    String emailFrom
    /**
     * 「布局」
     */
    @JsonProperty("email_layout_xmlid")
    String emailLayoutXmlid
    /**
     * 「有错误」
     * 字典[是否]
     */
    @JsonProperty("has_error")
    Integer hasError
    /**
     * 「有短信息错误」
     * 字典[是否]
     */
    @JsonProperty("has_sms_error")
    Integer hasSmsError
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「是当前用户还是访客作者」
     * 字典[是否]
     */
    @JsonProperty("is_current_user_or_guest_author")
    Integer isCurrentUserOrGuestAuthor
    /**
     * 「仅限员工」
     * 字典[是否]
     */
    @JsonProperty("is_internal")
    Integer isInternal
    /**
     * 「邮件活动类型」
     */
    @JsonProperty("mail_activity_type_id")
    String mailActivityTypeId
    /**
     * 「消息ID」
     */
    @JsonProperty("message_id")
    String messageId
    /**
     * 「类型」
     * 字典[类型]
     */
    @JsonProperty("message_type")
    String messageType
    /**
     * 「相关单据模型」
     */
    @JsonProperty("model")
    String model
    /**
     * 「需要行动」
     * 字典[是否]
     */
    @JsonProperty("needaction")
    Integer needaction
    /**
     * 「上级消息」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「已置顶」
     */
    @JsonProperty("pinned_at")
    Timestamp pinnedAt
    /**
     * 「预览」
     */
    @JsonProperty("preview")
    String preview
    /**
     * 「评级值」
     */
    @JsonProperty("rating_value")
    Double ratingValue
    /**
     * 「别名域」
     */
    @JsonProperty("record_alias_domain_id")
    String recordAliasDomainId
    /**
     * 「公司」
     */
    @JsonProperty("record_company_id")
    String recordCompanyId
    /**
     * 「消息记录名称」
     */
    @JsonProperty("record_name")
    String recordName
    /**
     * 「回复 至」
     */
    @JsonProperty("reply_to")
    String replyTo
    /**
     * 「无响应」
     * 字典[是否]
     */
    @JsonProperty("reply_to_force_new")
    Integer replyToForceNew
    /**
     * 「蜗牛邮件错误消息」
     * 字典[是否]
     */
    @JsonProperty("snailmail_error")
    Integer snailmailError
    /**
     * 「星标消息」
     * 字典[是否]
     */
    @JsonProperty("starred")
    Integer starred
    /**
     * 「主旨」
     */
    @JsonProperty("subject")
    String subject
    /**
     * 「子类型」
     */
    @JsonProperty("subtype_id")
    String subtypeId
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
     * 设置「收藏计数」值
     * @param val
     */
    MailMessageDTO setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount
        return this
    }


    /**
     * 设置「收藏」值
     * 字典[是否]
     * @param val
     */
    MailMessageDTO setIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite
        return this
    }


    /**
     * 设置「资源标识」值
     * @param val
     */
    MailMessageDTO setResId(String resId) {
        this.resId = resId
        return this
    }


    /**
     * 设置「上级消息内容」值
     * @param val
     */
    MailMessageDTO setParentBody(String parentBody) {
        this.parentBody = parentBody
        return this
    }


    /**
     * 设置「上级消息作者」值
     * @param val
     */
    MailMessageDTO setParentAuthorId(String parentAuthorId) {
        this.parentAuthorId = parentAuthorId
        return this
    }


    /**
     * 设置「审计日志已启动」值
     * 字典[是否]
     * @param val
     */
    MailMessageDTO setAccountAuditLogActivated(Integer accountAuditLogActivated) {
        this.accountAuditLogActivated = accountAuditLogActivated
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    MailMessageDTO setAccountAuditLogPreview(String accountAuditLogPreview) {
        this.accountAuditLogPreview = accountAuditLogPreview
        return this
    }


    /**
     * 设置「访客」值
     * @param val
     */
    MailMessageDTO setAuthorGuestId(String authorGuestId) {
        this.authorGuestId = authorGuestId
        return this
    }


    /**
     * 设置「作者」值
     * @param val
     */
    MailMessageDTO setAuthorId(String authorId) {
        this.authorId = authorId
        return this
    }


    /**
     * 设置「内容」值
     * @param val
     */
    MailMessageDTO setBody(String body) {
        this.body = body
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailMessageDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    MailMessageDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「日期」值
     * @param val
     */
    MailMessageDTO setDate(Timestamp date) {
        this.date = date
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailMessageDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「电子邮件添加签字」值
     * 字典[是否]
     * @param val
     */
    MailMessageDTO setEmailAddSignature(Integer emailAddSignature) {
        this.emailAddSignature = emailAddSignature
        return this
    }


    /**
     * 设置「来自」值
     * @param val
     */
    MailMessageDTO setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom
        return this
    }


    /**
     * 设置「布局」值
     * @param val
     */
    MailMessageDTO setEmailLayoutXmlid(String emailLayoutXmlid) {
        this.emailLayoutXmlid = emailLayoutXmlid
        return this
    }


    /**
     * 设置「有错误」值
     * 字典[是否]
     * @param val
     */
    MailMessageDTO setHasError(Integer hasError) {
        this.hasError = hasError
        return this
    }


    /**
     * 设置「有短信息错误」值
     * 字典[是否]
     * @param val
     */
    MailMessageDTO setHasSmsError(Integer hasSmsError) {
        this.hasSmsError = hasSmsError
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailMessageDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「是当前用户还是访客作者」值
     * 字典[是否]
     * @param val
     */
    MailMessageDTO setIsCurrentUserOrGuestAuthor(Integer isCurrentUserOrGuestAuthor) {
        this.isCurrentUserOrGuestAuthor = isCurrentUserOrGuestAuthor
        return this
    }


    /**
     * 设置「仅限员工」值
     * 字典[是否]
     * @param val
     */
    MailMessageDTO setIsInternal(Integer isInternal) {
        this.isInternal = isInternal
        return this
    }


    /**
     * 设置「邮件活动类型」值
     * @param val
     */
    MailMessageDTO setMailActivityTypeId(String mailActivityTypeId) {
        this.mailActivityTypeId = mailActivityTypeId
        return this
    }


    /**
     * 设置「消息ID」值
     * @param val
     */
    MailMessageDTO setMessageId(String messageId) {
        this.messageId = messageId
        return this
    }


    /**
     * 设置「类型」值
     * 字典[类型]
     * @param val
     */
    MailMessageDTO setMessageType(String messageType) {
        this.messageType = messageType
        return this
    }


    /**
     * 设置「相关单据模型」值
     * @param val
     */
    MailMessageDTO setModel(String model) {
        this.model = model
        return this
    }


    /**
     * 设置「需要行动」值
     * 字典[是否]
     * @param val
     */
    MailMessageDTO setNeedaction(Integer needaction) {
        this.needaction = needaction
        return this
    }


    /**
     * 设置「上级消息」值
     * @param val
     */
    MailMessageDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「已置顶」值
     * @param val
     */
    MailMessageDTO setPinnedAt(Timestamp pinnedAt) {
        this.pinnedAt = pinnedAt
        return this
    }


    /**
     * 设置「预览」值
     * @param val
     */
    MailMessageDTO setPreview(String preview) {
        this.preview = preview
        return this
    }


    /**
     * 设置「评级值」值
     * @param val
     */
    MailMessageDTO setRatingValue(Double ratingValue) {
        this.ratingValue = ratingValue
        return this
    }


    /**
     * 设置「别名域」值
     * @param val
     */
    MailMessageDTO setRecordAliasDomainId(String recordAliasDomainId) {
        this.recordAliasDomainId = recordAliasDomainId
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    MailMessageDTO setRecordCompanyId(String recordCompanyId) {
        this.recordCompanyId = recordCompanyId
        return this
    }


    /**
     * 设置「消息记录名称」值
     * @param val
     */
    MailMessageDTO setRecordName(String recordName) {
        this.recordName = recordName
        return this
    }


    /**
     * 设置「回复 至」值
     * @param val
     */
    MailMessageDTO setReplyTo(String replyTo) {
        this.replyTo = replyTo
        return this
    }


    /**
     * 设置「无响应」值
     * 字典[是否]
     * @param val
     */
    MailMessageDTO setReplyToForceNew(Integer replyToForceNew) {
        this.replyToForceNew = replyToForceNew
        return this
    }


    /**
     * 设置「蜗牛邮件错误消息」值
     * 字典[是否]
     * @param val
     */
    MailMessageDTO setSnailmailError(Integer snailmailError) {
        this.snailmailError = snailmailError
        return this
    }


    /**
     * 设置「星标消息」值
     * 字典[是否]
     * @param val
     */
    MailMessageDTO setStarred(Integer starred) {
        this.starred = starred
        return this
    }


    /**
     * 设置「主旨」值
     * @param val
     */
    MailMessageDTO setSubject(String subject) {
        this.subject = subject
        return this
    }


    /**
     * 设置「子类型」值
     * @param val
     */
    MailMessageDTO setSubtypeId(String subtypeId) {
        this.subtypeId = subtypeId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailMessageDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    MailMessageDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
