package cn.ibizlab.mail.mailtemplate.dto

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
class MailTemplateDTO extends GroovyDTO<MailTemplateDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「自动删除」
     * 字典[是否]
     */
    @JsonProperty("auto_delete")
    Integer autoDelete
    /**
     * 「正文」
     */
    @JsonProperty("body_html")
    String bodyHtml
    /**
     * 「可写」
     * 字典[是否]
     */
    @JsonProperty("can_write")
    Integer canWrite
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
     * 「模板描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「抄送」
     */
    @JsonProperty("email_cc")
    String emailCc
    /**
     * 「来自」
     */
    @JsonProperty("email_from")
    String emailFrom
    /**
     * 「电子邮件通知布局」
     */
    @JsonProperty("email_layout_xmlid")
    String emailLayoutXmlid
    /**
     * 「至（EMail）」
     */
    @JsonProperty("email_to")
    String emailTo
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「是模板编辑器」
     * 字典[是否]
     */
    @JsonProperty("is_template_editor")
    Integer isTemplateEditor
    /**
     * 「语言」
     */
    @JsonProperty("lang")
    String lang
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「至（合作伙伴）」
     */
    @JsonProperty("partner_to")
    String partnerTo
    /**
     * 「渲染模型」
     */
    @JsonProperty("render_model")
    String renderModel
    /**
     * 「回复」
     */
    @JsonProperty("reply_to")
    String replyTo
    /**
     * 「安排的日期」
     */
    @JsonProperty("scheduled_date")
    String scheduledDate
    /**
     * 「主旨」
     */
    @JsonProperty("subject")
    String subject
    /**
     * 「模板类别」
     * 字典[模板类别]
     */
    @JsonProperty("template_category")
    String templateCategory
    /**
     * 「模板文件名」
     */
    @JsonProperty("template_fs")
    String templateFs
    /**
     * 「默认收件人」
     * 字典[是否]
     */
    @JsonProperty("use_default_to")
    Integer useDefaultTo
    /**
     * 「用户」
     */
    @JsonProperty("user_id")
    String userId
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
    MailTemplateDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「自动删除」值
     * 字典[是否]
     * @param val
     */
    MailTemplateDTO setAutoDelete(Integer autoDelete) {
        this.autoDelete = autoDelete
        return this
    }


    /**
     * 设置「正文」值
     * @param val
     */
    MailTemplateDTO setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml
        return this
    }


    /**
     * 设置「可写」值
     * 字典[是否]
     * @param val
     */
    MailTemplateDTO setCanWrite(Integer canWrite) {
        this.canWrite = canWrite
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MailTemplateDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    MailTemplateDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「模板描述」值
     * @param val
     */
    MailTemplateDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailTemplateDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「抄送」值
     * @param val
     */
    MailTemplateDTO setEmailCc(String emailCc) {
        this.emailCc = emailCc
        return this
    }


    /**
     * 设置「来自」值
     * @param val
     */
    MailTemplateDTO setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom
        return this
    }


    /**
     * 设置「电子邮件通知布局」值
     * @param val
     */
    MailTemplateDTO setEmailLayoutXmlid(String emailLayoutXmlid) {
        this.emailLayoutXmlid = emailLayoutXmlid
        return this
    }


    /**
     * 设置「至（EMail）」值
     * @param val
     */
    MailTemplateDTO setEmailTo(String emailTo) {
        this.emailTo = emailTo
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailTemplateDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「是模板编辑器」值
     * 字典[是否]
     * @param val
     */
    MailTemplateDTO setIsTemplateEditor(Integer isTemplateEditor) {
        this.isTemplateEditor = isTemplateEditor
        return this
    }


    /**
     * 设置「语言」值
     * @param val
     */
    MailTemplateDTO setLang(String lang) {
        this.lang = lang
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailTemplateDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「至（合作伙伴）」值
     * @param val
     */
    MailTemplateDTO setPartnerTo(String partnerTo) {
        this.partnerTo = partnerTo
        return this
    }


    /**
     * 设置「渲染模型」值
     * @param val
     */
    MailTemplateDTO setRenderModel(String renderModel) {
        this.renderModel = renderModel
        return this
    }


    /**
     * 设置「回复」值
     * @param val
     */
    MailTemplateDTO setReplyTo(String replyTo) {
        this.replyTo = replyTo
        return this
    }


    /**
     * 设置「安排的日期」值
     * @param val
     */
    MailTemplateDTO setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate
        return this
    }


    /**
     * 设置「主旨」值
     * @param val
     */
    MailTemplateDTO setSubject(String subject) {
        this.subject = subject
        return this
    }


    /**
     * 设置「模板类别」值
     * 字典[模板类别]
     * @param val
     */
    MailTemplateDTO setTemplateCategory(String templateCategory) {
        this.templateCategory = templateCategory
        return this
    }


    /**
     * 设置「模板文件名」值
     * @param val
     */
    MailTemplateDTO setTemplateFs(String templateFs) {
        this.templateFs = templateFs
        return this
    }


    /**
     * 设置「默认收件人」值
     * 字典[是否]
     * @param val
     */
    MailTemplateDTO setUseDefaultTo(Integer useDefaultTo) {
        this.useDefaultTo = useDefaultTo
        return this
    }


    /**
     * 设置「用户」值
     * @param val
     */
    MailTemplateDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MailTemplateDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    MailTemplateDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
