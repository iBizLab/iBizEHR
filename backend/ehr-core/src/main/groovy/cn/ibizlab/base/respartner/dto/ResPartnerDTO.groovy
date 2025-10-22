package cn.ibizlab.base.respartner.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.mail.mailactivity.dto.MailActivityDTO
import cn.ibizlab.base.irattachment.dto.IrAttachmentDTO
import cn.ibizlab.mail.mailfollowers.dto.MailFollowersDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ResPartnerDTO extends GroovyDTO<ResPartnerDTO> {

    /**
     * 「活动集合」
     */
    @JsonProperty("activities")
    List<MailActivityDTO> activities
    /**
     * 「附件集合」
     */
    @JsonProperty("attachments")
    List<IrAttachmentDTO> attachments
    /**
     * 「关注者」
     */
    @JsonProperty("followers")
    List<MailFollowersDTO> followers
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「有效语言数量」
     */
    @JsonProperty("active_lang_count")
    Integer activeLangCount
    /**
     * 「下一活动截止日期」
     */
    @JsonProperty("activity_date_deadline")
    Timestamp activityDateDeadline
    /**
     * 「活动异常标示」
     * 字典[活动异常标示]
     */
    @JsonProperty("activity_exception_decoration")
    String activityExceptionDecoration
    /**
     * 「图标」
     */
    @JsonProperty("activity_exception_icon")
    String activityExceptionIcon
    /**
     * 「活动状态」
     * 字典[活动状态]
     */
    @JsonProperty("activity_state")
    String activityState
    /**
     * 「附加信息」
     */
    @JsonProperty("additional_info")
    String additionalInfo
    /**
     * 「Auto-post bills」
     * 字典[Auto-post bills]
     */
    @JsonProperty("autopost_bills")
    String autopostBills
    /**
     * 「银行」
     */
    @JsonProperty("bank_account_count")
    Integer bankAccountCount
    /**
     * 「条形码」
     */
    @JsonProperty("barcode")
    String barcode
    /**
     * 「采购员」
     */
    @JsonProperty("buyer_id")
    String buyerId
    /**
     * 「从基本日历中标记为已读的最后一条通知」
     */
    @JsonProperty("calendar_last_notif_ack")
    Timestamp calendarLastNotifAck
    /**
     * 「公司认证数」
     */
    @JsonProperty("certifications_company_count")
    Integer certificationsCompanyCount
    /**
     * 「认证计算」
     */
    @JsonProperty("certifications_count")
    Integer certificationsCount
    /**
     * 「城市」
     */
    @JsonProperty("city")
    String city
    /**
     * 「颜色索引」
     */
    @JsonProperty("color")
    Integer color
    /**
     * 「备注」
     */
    @JsonProperty("comment")
    String comment
    /**
     * 「公司名称实体」
     */
    @JsonProperty("commercial_company_name")
    String commercialCompanyName
    /**
     * 「商业实体」
     */
    @JsonProperty("commercial_partner_id")
    String commercialPartnerId
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「公司名称」
     */
    @JsonProperty("company_name")
    String companyName
    /**
     * 「公司注册号」
     */
    @JsonProperty("company_registry")
    String companyRegistry
    /**
     * 「公司 ID 标签」
     */
    @JsonProperty("company_registry_label")
    String companyRegistryLabel
    /**
     * 「公司类型」
     * 字典[公司类型]
     */
    @JsonProperty("company_type")
    String companyType
    /**
     * 「全名」
     */
    @JsonProperty("complete_name")
    String completeName
    /**
     * 「完整地址」
     */
    @JsonProperty("contact_address")
    String contactAddress
    /**
     * 「内嵌完整地址」
     */
    @JsonProperty("contact_address_inline")
    String contactAddressInline
    /**
     * 「国家/地区」
     */
    @JsonProperty("country_id")
    String countryId
    /**
     * 「国家/地区」
     */
    @JsonProperty("country_name")
    String countryName
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
     * 「应收账款总计」
     */
    @JsonProperty("credit")
    BigDecimal credit
    /**
     * 「信贷额度」
     */
    @JsonProperty("credit_limit")
    Double creditLimit
    /**
     * 「贷记入发票」
     */
    @JsonProperty("credit_to_invoice")
    BigDecimal creditToInvoice
    /**
     * 「客户等级」
     */
    @JsonProperty("customer_rank")
    Integer customerRank
    /**
     * 「销售变现天数（DSO）」
     */
    @JsonProperty("days_sales_outstanding")
    Double daysSalesOutstanding
    /**
     * 「应付账款总计」
     */
    @JsonProperty("debit")
    BigDecimal debit
    /**
     * 「应付账款限额」
     */
    @JsonProperty("debit_limit")
    BigDecimal debitLimit
    /**
     * 「显示发票 Edi 格式」
     * 字典[是否]
     */
    @JsonProperty("display_invoice_edi_format")
    Integer displayInvoiceEdiFormat
    /**
     * 「Display Invoice Template Pdf Report」
     * 字典[是否]
     */
    @JsonProperty("display_invoice_template_pdf_report_id")
    Integer displayInvoiceTemplatePdfReportId
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「Duplicated Bank Account Partners Count」
     */
    @JsonProperty("duplicated_bank_account_partners_count")
    Integer duplicatedBankAccountPartnersCount
    /**
     * 「邮箱」
     */
    @JsonProperty("email")
    String email
    /**
     * 「格式化邮件」
     */
    @JsonProperty("email_formatted")
    String emailFormatted
    /**
     * 「规范化邮件」
     */
    @JsonProperty("email_normalized")
    String emailNormalized
    /**
     * 「员工」
     * 字典[是否]
     */
    @JsonProperty("employee")
    Integer employee
    /**
     * 「员工数量」
     */
    @JsonProperty("employees_count")
    Integer employeesCount
    /**
     * 「会计所在国家/地区代码」
     */
    @JsonProperty("fiscal_country_codes")
    String fiscalCountryCodes
    /**
     * 「工作职位」
     */
    @JsonProperty("function")
    String function
    /**
     * 「有消息」
     * 字典[是否]
     */
    @JsonProperty("has_message")
    Integer hasMessage
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「Ignore Abnormal Invoice Amount」
     * 字典[是否]
     */
    @JsonProperty("ignore_abnormal_invoice_amount")
    Integer ignoreAbnormalInvoiceAmount
    /**
     * 「Ignore Abnormal Invoice Date」
     * 字典[是否]
     */
    @JsonProperty("ignore_abnormal_invoice_date")
    Integer ignoreAbnormalInvoiceDate
    /**
     * 「IM的状态」
     */
    @JsonProperty("im_status")
    String imStatus
    /**
     * 「行业」
     */
    @JsonProperty("industry_id")
    String industryId
    /**
     * 「电子发票格式」
     * 字典[电子发票格式]
     */
    @JsonProperty("invoice_edi_format")
    String invoiceEdiFormat
    /**
     * 「发票 EDI 格式商店」
     */
    @JsonProperty("invoice_edi_format_store")
    String invoiceEdiFormatStore
    /**
     * 「传送发票」
     * 字典[传送发票]
     */
    @JsonProperty("invoice_sending_method")
    String invoiceSendingMethod
    /**
     * 「发票」
     * 字典[发票]
     */
    @JsonProperty("invoice_warn")
    String invoiceWarn
    /**
     * 「发票消息」
     */
    @JsonProperty("invoice_warn_msg")
    String invoiceWarnMsg
    /**
     * 「黑名单」
     * 字典[是否]
     */
    @JsonProperty("is_blacklisted")
    Integer isBlacklisted
    /**
     * 「Is Coa Installed」
     * 字典[是否]
     */
    @JsonProperty("is_coa_installed")
    Integer isCoaInstalled
    /**
     * 「是公司」
     * 字典[是否]
     */
    @JsonProperty("is_company")
    Integer isCompany
    /**
     * 「是 Peppol Edi 格式」
     * 字典[是否]
     */
    @JsonProperty("is_peppol_edi_format")
    Integer isPeppolEdiFormat
    /**
     * 「是公共」
     * 字典[是否]
     */
    @JsonProperty("is_public")
    Integer isPublic
    /**
     * 「是 Ubl 格式」
     * 字典[是否]
     */
    @JsonProperty("is_ubl_format")
    Integer isUblFormat
    /**
     * 「日记账项目」
     */
    @JsonProperty("journal_item_count")
    Integer journalItemCount
    /**
     * 「# 会议」
     */
    @JsonProperty("meeting_count")
    Integer meetingCount
    /**
     * 「附件数量」
     */
    @JsonProperty("message_attachment_count")
    Integer messageAttachmentCount
    /**
     * 「退回」
     */
    @JsonProperty("message_bounce")
    Integer messageBounce
    /**
     * 「消息发送错误」
     * 字典[是否]
     */
    @JsonProperty("message_has_error")
    Integer messageHasError
    /**
     * 「错误数量」
     */
    @JsonProperty("message_has_error_counter")
    Integer messageHasErrorCounter
    /**
     * 「短信发送错误」
     * 字典[是否]
     */
    @JsonProperty("message_has_sms_error")
    Integer messageHasSmsError
    /**
     * 「是关注者」
     * 字典[是否]
     */
    @JsonProperty("message_is_follower")
    Integer messageIsFollower
    /**
     * 「待处理」
     * 字典[是否]
     */
    @JsonProperty("message_needaction")
    Integer messageNeedaction
    /**
     * 「操作数量」
     */
    @JsonProperty("message_needaction_counter")
    Integer messageNeedactionCounter
    /**
     * 「手机」
     */
    @JsonProperty("mobile")
    String mobile
    /**
     * 「列入黑名单的手机是移动的」
     * 字典[是否]
     */
    @JsonProperty("mobile_blacklisted")
    Integer mobileBlacklisted
    /**
     * 「我的活动截止时间」
     */
    @JsonProperty("my_activity_date_deadline")
    Timestamp myActivityDateDeadline
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「准时交货率」
     */
    @JsonProperty("on_time_rate")
    Double onTimeRate
    /**
     * 「商机数量」
     */
    @JsonProperty("opportunity_count")
    Integer opportunityCount
    /**
     * 「相关公司」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「相关公司」
     */
    @JsonProperty("parent_name")
    String parentName
    /**
     * 「合作伙伴公司注册处占位符」
     */
    @JsonProperty("partner_company_registry_placeholder")
    String partnerCompanyRegistryPlaceholder
    /**
     * 「公司数据库ID」
     */
    @JsonProperty("partner_gid")
    Integer partnerGid
    /**
     * 「地理纬度」
     */
    @JsonProperty("partner_latitude")
    Double partnerLatitude
    /**
     * 「地理经度」
     */
    @JsonProperty("partner_longitude")
    Double partnerLongitude
    /**
     * 「共享合作伙伴」
     * 字典[是否]
     */
    @JsonProperty("partner_share")
    Integer partnerShare
    /**
     * 「Partner Vat Placeholder」
     */
    @JsonProperty("partner_vat_placeholder")
    String partnerVatPlaceholder
    /**
     * 「支付令牌计数」
     */
    @JsonProperty("payment_token_count")
    Integer paymentTokenCount
    /**
     * 「Peppol电子地址（EAS）」
     * 字典[Peppol电子地址（EAS）]
     */
    @JsonProperty("peppol_eas")
    String peppolEas
    /**
     * 「Peppol Endpoint」
     */
    @JsonProperty("peppol_endpoint")
    String peppolEndpoint
    /**
     * 「电话」
     */
    @JsonProperty("phone")
    String phone
    /**
     * 「列入黑名单的电话是电话」
     * 字典[是否]
     */
    @JsonProperty("phone_blacklisted")
    Integer phoneBlacklisted
    /**
     * 「电话/手机」
     */
    @JsonProperty("phone_mobile_search")
    String phoneMobileSearch
    /**
     * 「净化数量」
     */
    @JsonProperty("phone_sanitized")
    String phoneSanitized
    /**
     * 「电话加黑」
     * 字典[是否]
     */
    @JsonProperty("phone_sanitized_blacklisted")
    Integer phoneSanitizedBlacklisted
    /**
     * 「库存拣货」
     * 字典[库存拣货]
     */
    @JsonProperty("picking_warn")
    String pickingWarn
    /**
     * 「库存拣货单消息」
     */
    @JsonProperty("picking_warn_msg")
    String pickingWarnMsg
    /**
     * 「计划更换自行车」
     * 字典[是否]
     */
    @JsonProperty("plan_to_change_bike")
    Integer planToChangeBike
    /**
     * 「更换车辆计划」
     * 字典[是否]
     */
    @JsonProperty("plan_to_change_car")
    Integer planToChangeCar
    /**
     * 「供应商币别」
     */
    @JsonProperty("property_purchase_currency_id")
    String propertyPurchaseCurrencyId
    /**
     * 「采购订单数」
     */
    @JsonProperty("purchase_order_count")
    Integer purchaseOrderCount
    /**
     * 「采购订单预警」
     * 字典[采购订单预警]
     */
    @JsonProperty("purchase_warn")
    String purchaseWarn
    /**
     * 「采购订单消息」
     */
    @JsonProperty("purchase_warn_msg")
    String purchaseWarnMsg
    /**
     * 「收货提醒」
     * 字典[是否]
     */
    @JsonProperty("receipt_reminder_email")
    Integer receiptReminderEmail
    /**
     * 「参考」
     */
    @JsonProperty("ref")
    String ref
    /**
     * 「收货前几天」
     */
    @JsonProperty("reminder_date_before_receipt")
    Integer reminderDateBeforeReceipt
    /**
     * 「销售订单计数」
     */
    @JsonProperty("sale_order_count")
    Integer saleOrderCount
    /**
     * 「销售警告信息」
     * 字典[销售警告信息]
     */
    @JsonProperty("sale_warn")
    String saleWarn
    /**
     * 「销售订单消息」
     */
    @JsonProperty("sale_warn_msg")
    String saleWarnMsg
    /**
     * 「显示信用额度」
     * 字典[是否]
     */
    @JsonProperty("show_credit_limit")
    Integer showCreditLimit
    /**
     * 「注册令牌（Token）类型」
     */
    @JsonProperty("signup_type")
    String signupType
    /**
     * 「省/州」
     */
    @JsonProperty("state_id")
    String stateId
    /**
     * 「省/州」
     */
    @JsonProperty("state_name")
    String stateName
    /**
     * 「街道」
     */
    @JsonProperty("street")
    String street
    /**
     * 「详细地址」
     */
    @JsonProperty("street2")
    String street2
    /**
     * 「＃供应商账单」
     */
    @JsonProperty("supplier_invoice_count")
    Integer supplierInvoiceCount
    /**
     * 「供应商排名」
     */
    @JsonProperty("supplier_rank")
    Integer supplierRank
    /**
     * 「null」
     */
    @JsonProperty("task_count")
    Integer taskCount
    /**
     * 「已开票总计」
     */
    @JsonProperty("total_invoiced")
    BigDecimal totalInvoiced
    /**
     * 「Degree of trust you have in this debtor」
     * 字典[Degree of trust you have in this debtor]
     */
    @JsonProperty("trust")
    String trust
    /**
     * 「地址类型」
     * 字典[地址类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「时区」
     * 字典[时区]
     */
    @JsonProperty("tz")
    String tz
    /**
     * 「时区偏移」
     */
    @JsonProperty("tz_offset")
    String tzOffset
    /**
     * 「合作伙伴限制」
     * 字典[是否]
     */
    @JsonProperty("use_partner_credit_limit")
    Integer usePartnerCreditLimit
    /**
     * 「业务员」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「业务员」
     */
    @JsonProperty("user_name")
    String userName
    /**
     * 「税号ID」
     */
    @JsonProperty("vat")
    String vat
    /**
     * 「税务 ID 标签」
     */
    @JsonProperty("vat_label")
    String vatLabel
    /**
     * 「网站链接」
     */
    @JsonProperty("website")
    String website
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
     * 「邮编」
     */
    @JsonProperty("zip")
    String zip
    /**
     * 「头像128」
     */
    @JsonProperty("avatar128")
    String avatar128
    /**
     * 「图片128」
     */
    @JsonProperty("image128")
    String image128
    /**
     * 「头像512」
     */
    @JsonProperty("avatar512")
    String avatar512
    /**
     * 「图片512」
     */
    @JsonProperty("image512")
    String image512
    /**
     * 「头像256」
     */
    @JsonProperty("avatar256")
    String avatar256
    /**
     * 「图片256」
     */
    @JsonProperty("image256")
    String image256
    /**
     * 「头像1024」
     */
    @JsonProperty("avatar1024")
    String avatar1024
    /**
     * 「图片1024」
     */
    @JsonProperty("image1024")
    String image1024
    /**
     * 「头像」
     */
    @JsonProperty("avatar")
    String avatar
    /**
     * 「头像」
     */
    @JsonProperty("image")
    String image

    /**
     * 设置「活动集合」值
     * @param val
     */
    ResPartnerDTO setActivities(List<MailActivityDTO> activities) {
        this.activities = activities
        return this
    }


    /**
     * 设置「附件集合」值
     * @param val
     */
    ResPartnerDTO setAttachments(List<IrAttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「关注者」值
     * @param val
     */
    ResPartnerDTO setFollowers(List<MailFollowersDTO> followers) {
        this.followers = followers
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「有效语言数量」值
     * @param val
     */
    ResPartnerDTO setActiveLangCount(Integer activeLangCount) {
        this.activeLangCount = activeLangCount
        return this
    }


    /**
     * 设置「下一活动截止日期」值
     * @param val
     */
    ResPartnerDTO setActivityDateDeadline(Timestamp activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline
        return this
    }


    /**
     * 设置「活动异常标示」值
     * 字典[活动异常标示]
     * @param val
     */
    ResPartnerDTO setActivityExceptionDecoration(String activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    ResPartnerDTO setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon
        return this
    }


    /**
     * 设置「活动状态」值
     * 字典[活动状态]
     * @param val
     */
    ResPartnerDTO setActivityState(String activityState) {
        this.activityState = activityState
        return this
    }


    /**
     * 设置「附加信息」值
     * @param val
     */
    ResPartnerDTO setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo
        return this
    }


    /**
     * 设置「Auto-post bills」值
     * 字典[Auto-post bills]
     * @param val
     */
    ResPartnerDTO setAutopostBills(String autopostBills) {
        this.autopostBills = autopostBills
        return this
    }


    /**
     * 设置「银行」值
     * @param val
     */
    ResPartnerDTO setBankAccountCount(Integer bankAccountCount) {
        this.bankAccountCount = bankAccountCount
        return this
    }


    /**
     * 设置「条形码」值
     * @param val
     */
    ResPartnerDTO setBarcode(String barcode) {
        this.barcode = barcode
        return this
    }


    /**
     * 设置「采购员」值
     * @param val
     */
    ResPartnerDTO setBuyerId(String buyerId) {
        this.buyerId = buyerId
        return this
    }


    /**
     * 设置「从基本日历中标记为已读的最后一条通知」值
     * @param val
     */
    ResPartnerDTO setCalendarLastNotifAck(Timestamp calendarLastNotifAck) {
        this.calendarLastNotifAck = calendarLastNotifAck
        return this
    }


    /**
     * 设置「公司认证数」值
     * @param val
     */
    ResPartnerDTO setCertificationsCompanyCount(Integer certificationsCompanyCount) {
        this.certificationsCompanyCount = certificationsCompanyCount
        return this
    }


    /**
     * 设置「认证计算」值
     * @param val
     */
    ResPartnerDTO setCertificationsCount(Integer certificationsCount) {
        this.certificationsCount = certificationsCount
        return this
    }


    /**
     * 设置「城市」值
     * @param val
     */
    ResPartnerDTO setCity(String city) {
        this.city = city
        return this
    }


    /**
     * 设置「颜色索引」值
     * @param val
     */
    ResPartnerDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    ResPartnerDTO setComment(String comment) {
        this.comment = comment
        return this
    }


    /**
     * 设置「公司名称实体」值
     * @param val
     */
    ResPartnerDTO setCommercialCompanyName(String commercialCompanyName) {
        this.commercialCompanyName = commercialCompanyName
        return this
    }


    /**
     * 设置「商业实体」值
     * @param val
     */
    ResPartnerDTO setCommercialPartnerId(String commercialPartnerId) {
        this.commercialPartnerId = commercialPartnerId
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    ResPartnerDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「公司名称」值
     * @param val
     */
    ResPartnerDTO setCompanyName(String companyName) {
        this.companyName = companyName
        return this
    }


    /**
     * 设置「公司注册号」值
     * @param val
     */
    ResPartnerDTO setCompanyRegistry(String companyRegistry) {
        this.companyRegistry = companyRegistry
        return this
    }


    /**
     * 设置「公司 ID 标签」值
     * @param val
     */
    ResPartnerDTO setCompanyRegistryLabel(String companyRegistryLabel) {
        this.companyRegistryLabel = companyRegistryLabel
        return this
    }


    /**
     * 设置「公司类型」值
     * 字典[公司类型]
     * @param val
     */
    ResPartnerDTO setCompanyType(String companyType) {
        this.companyType = companyType
        return this
    }


    /**
     * 设置「全名」值
     * @param val
     */
    ResPartnerDTO setCompleteName(String completeName) {
        this.completeName = completeName
        return this
    }


    /**
     * 设置「完整地址」值
     * @param val
     */
    ResPartnerDTO setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress
        return this
    }


    /**
     * 设置「内嵌完整地址」值
     * @param val
     */
    ResPartnerDTO setContactAddressInline(String contactAddressInline) {
        this.contactAddressInline = contactAddressInline
        return this
    }


    /**
     * 设置「国家/地区」值
     * @param val
     */
    ResPartnerDTO setCountryId(String countryId) {
        this.countryId = countryId
        return this
    }


    /**
     * 设置「国家/地区」值
     * @param val
     */
    ResPartnerDTO setCountryName(String countryName) {
        this.countryName = countryName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResPartnerDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    ResPartnerDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「应收账款总计」值
     * @param val
     */
    ResPartnerDTO setCredit(BigDecimal credit) {
        this.credit = credit
        return this
    }


    /**
     * 设置「信贷额度」值
     * @param val
     */
    ResPartnerDTO setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit
        return this
    }


    /**
     * 设置「贷记入发票」值
     * @param val
     */
    ResPartnerDTO setCreditToInvoice(BigDecimal creditToInvoice) {
        this.creditToInvoice = creditToInvoice
        return this
    }


    /**
     * 设置「客户等级」值
     * @param val
     */
    ResPartnerDTO setCustomerRank(Integer customerRank) {
        this.customerRank = customerRank
        return this
    }


    /**
     * 设置「销售变现天数（DSO）」值
     * @param val
     */
    ResPartnerDTO setDaysSalesOutstanding(Double daysSalesOutstanding) {
        this.daysSalesOutstanding = daysSalesOutstanding
        return this
    }


    /**
     * 设置「应付账款总计」值
     * @param val
     */
    ResPartnerDTO setDebit(BigDecimal debit) {
        this.debit = debit
        return this
    }


    /**
     * 设置「应付账款限额」值
     * @param val
     */
    ResPartnerDTO setDebitLimit(BigDecimal debitLimit) {
        this.debitLimit = debitLimit
        return this
    }


    /**
     * 设置「显示发票 Edi 格式」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setDisplayInvoiceEdiFormat(Integer displayInvoiceEdiFormat) {
        this.displayInvoiceEdiFormat = displayInvoiceEdiFormat
        return this
    }


    /**
     * 设置「Display Invoice Template Pdf Report」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setDisplayInvoiceTemplatePdfReportId(Integer displayInvoiceTemplatePdfReportId) {
        this.displayInvoiceTemplatePdfReportId = displayInvoiceTemplatePdfReportId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResPartnerDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「Duplicated Bank Account Partners Count」值
     * @param val
     */
    ResPartnerDTO setDuplicatedBankAccountPartnersCount(Integer duplicatedBankAccountPartnersCount) {
        this.duplicatedBankAccountPartnersCount = duplicatedBankAccountPartnersCount
        return this
    }


    /**
     * 设置「邮箱」值
     * @param val
     */
    ResPartnerDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「格式化邮件」值
     * @param val
     */
    ResPartnerDTO setEmailFormatted(String emailFormatted) {
        this.emailFormatted = emailFormatted
        return this
    }


    /**
     * 设置「规范化邮件」值
     * @param val
     */
    ResPartnerDTO setEmailNormalized(String emailNormalized) {
        this.emailNormalized = emailNormalized
        return this
    }


    /**
     * 设置「员工」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setEmployee(Integer employee) {
        this.employee = employee
        return this
    }


    /**
     * 设置「员工数量」值
     * @param val
     */
    ResPartnerDTO setEmployeesCount(Integer employeesCount) {
        this.employeesCount = employeesCount
        return this
    }


    /**
     * 设置「会计所在国家/地区代码」值
     * @param val
     */
    ResPartnerDTO setFiscalCountryCodes(String fiscalCountryCodes) {
        this.fiscalCountryCodes = fiscalCountryCodes
        return this
    }


    /**
     * 设置「工作职位」值
     * @param val
     */
    ResPartnerDTO setFunction(String function) {
        this.function = function
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResPartnerDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「Ignore Abnormal Invoice Amount」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setIgnoreAbnormalInvoiceAmount(Integer ignoreAbnormalInvoiceAmount) {
        this.ignoreAbnormalInvoiceAmount = ignoreAbnormalInvoiceAmount
        return this
    }


    /**
     * 设置「Ignore Abnormal Invoice Date」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setIgnoreAbnormalInvoiceDate(Integer ignoreAbnormalInvoiceDate) {
        this.ignoreAbnormalInvoiceDate = ignoreAbnormalInvoiceDate
        return this
    }


    /**
     * 设置「IM的状态」值
     * @param val
     */
    ResPartnerDTO setImStatus(String imStatus) {
        this.imStatus = imStatus
        return this
    }


    /**
     * 设置「行业」值
     * @param val
     */
    ResPartnerDTO setIndustryId(String industryId) {
        this.industryId = industryId
        return this
    }


    /**
     * 设置「电子发票格式」值
     * 字典[电子发票格式]
     * @param val
     */
    ResPartnerDTO setInvoiceEdiFormat(String invoiceEdiFormat) {
        this.invoiceEdiFormat = invoiceEdiFormat
        return this
    }


    /**
     * 设置「发票 EDI 格式商店」值
     * @param val
     */
    ResPartnerDTO setInvoiceEdiFormatStore(String invoiceEdiFormatStore) {
        this.invoiceEdiFormatStore = invoiceEdiFormatStore
        return this
    }


    /**
     * 设置「传送发票」值
     * 字典[传送发票]
     * @param val
     */
    ResPartnerDTO setInvoiceSendingMethod(String invoiceSendingMethod) {
        this.invoiceSendingMethod = invoiceSendingMethod
        return this
    }


    /**
     * 设置「发票」值
     * 字典[发票]
     * @param val
     */
    ResPartnerDTO setInvoiceWarn(String invoiceWarn) {
        this.invoiceWarn = invoiceWarn
        return this
    }


    /**
     * 设置「发票消息」值
     * @param val
     */
    ResPartnerDTO setInvoiceWarnMsg(String invoiceWarnMsg) {
        this.invoiceWarnMsg = invoiceWarnMsg
        return this
    }


    /**
     * 设置「黑名单」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setIsBlacklisted(Integer isBlacklisted) {
        this.isBlacklisted = isBlacklisted
        return this
    }


    /**
     * 设置「Is Coa Installed」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setIsCoaInstalled(Integer isCoaInstalled) {
        this.isCoaInstalled = isCoaInstalled
        return this
    }


    /**
     * 设置「是公司」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setIsCompany(Integer isCompany) {
        this.isCompany = isCompany
        return this
    }


    /**
     * 设置「是 Peppol Edi 格式」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setIsPeppolEdiFormat(Integer isPeppolEdiFormat) {
        this.isPeppolEdiFormat = isPeppolEdiFormat
        return this
    }


    /**
     * 设置「是公共」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setIsPublic(Integer isPublic) {
        this.isPublic = isPublic
        return this
    }


    /**
     * 设置「是 Ubl 格式」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setIsUblFormat(Integer isUblFormat) {
        this.isUblFormat = isUblFormat
        return this
    }


    /**
     * 设置「日记账项目」值
     * @param val
     */
    ResPartnerDTO setJournalItemCount(Integer journalItemCount) {
        this.journalItemCount = journalItemCount
        return this
    }


    /**
     * 设置「# 会议」值
     * @param val
     */
    ResPartnerDTO setMeetingCount(Integer meetingCount) {
        this.meetingCount = meetingCount
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    ResPartnerDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「退回」值
     * @param val
     */
    ResPartnerDTO setMessageBounce(Integer messageBounce) {
        this.messageBounce = messageBounce
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    ResPartnerDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「待处理」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    ResPartnerDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「手机」值
     * @param val
     */
    ResPartnerDTO setMobile(String mobile) {
        this.mobile = mobile
        return this
    }


    /**
     * 设置「列入黑名单的手机是移动的」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setMobileBlacklisted(Integer mobileBlacklisted) {
        this.mobileBlacklisted = mobileBlacklisted
        return this
    }


    /**
     * 设置「我的活动截止时间」值
     * @param val
     */
    ResPartnerDTO setMyActivityDateDeadline(Timestamp myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResPartnerDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「准时交货率」值
     * @param val
     */
    ResPartnerDTO setOnTimeRate(Double onTimeRate) {
        this.onTimeRate = onTimeRate
        return this
    }


    /**
     * 设置「商机数量」值
     * @param val
     */
    ResPartnerDTO setOpportunityCount(Integer opportunityCount) {
        this.opportunityCount = opportunityCount
        return this
    }


    /**
     * 设置「相关公司」值
     * @param val
     */
    ResPartnerDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「相关公司」值
     * @param val
     */
    ResPartnerDTO setParentName(String parentName) {
        this.parentName = parentName
        return this
    }


    /**
     * 设置「合作伙伴公司注册处占位符」值
     * @param val
     */
    ResPartnerDTO setPartnerCompanyRegistryPlaceholder(String partnerCompanyRegistryPlaceholder) {
        this.partnerCompanyRegistryPlaceholder = partnerCompanyRegistryPlaceholder
        return this
    }


    /**
     * 设置「公司数据库ID」值
     * @param val
     */
    ResPartnerDTO setPartnerGid(Integer partnerGid) {
        this.partnerGid = partnerGid
        return this
    }


    /**
     * 设置「地理纬度」值
     * @param val
     */
    ResPartnerDTO setPartnerLatitude(Double partnerLatitude) {
        this.partnerLatitude = partnerLatitude
        return this
    }


    /**
     * 设置「地理经度」值
     * @param val
     */
    ResPartnerDTO setPartnerLongitude(Double partnerLongitude) {
        this.partnerLongitude = partnerLongitude
        return this
    }


    /**
     * 设置「共享合作伙伴」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setPartnerShare(Integer partnerShare) {
        this.partnerShare = partnerShare
        return this
    }


    /**
     * 设置「Partner Vat Placeholder」值
     * @param val
     */
    ResPartnerDTO setPartnerVatPlaceholder(String partnerVatPlaceholder) {
        this.partnerVatPlaceholder = partnerVatPlaceholder
        return this
    }


    /**
     * 设置「支付令牌计数」值
     * @param val
     */
    ResPartnerDTO setPaymentTokenCount(Integer paymentTokenCount) {
        this.paymentTokenCount = paymentTokenCount
        return this
    }


    /**
     * 设置「Peppol电子地址（EAS）」值
     * 字典[Peppol电子地址（EAS）]
     * @param val
     */
    ResPartnerDTO setPeppolEas(String peppolEas) {
        this.peppolEas = peppolEas
        return this
    }


    /**
     * 设置「Peppol Endpoint」值
     * @param val
     */
    ResPartnerDTO setPeppolEndpoint(String peppolEndpoint) {
        this.peppolEndpoint = peppolEndpoint
        return this
    }


    /**
     * 设置「电话」值
     * @param val
     */
    ResPartnerDTO setPhone(String phone) {
        this.phone = phone
        return this
    }


    /**
     * 设置「列入黑名单的电话是电话」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setPhoneBlacklisted(Integer phoneBlacklisted) {
        this.phoneBlacklisted = phoneBlacklisted
        return this
    }


    /**
     * 设置「电话/手机」值
     * @param val
     */
    ResPartnerDTO setPhoneMobileSearch(String phoneMobileSearch) {
        this.phoneMobileSearch = phoneMobileSearch
        return this
    }


    /**
     * 设置「净化数量」值
     * @param val
     */
    ResPartnerDTO setPhoneSanitized(String phoneSanitized) {
        this.phoneSanitized = phoneSanitized
        return this
    }


    /**
     * 设置「电话加黑」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setPhoneSanitizedBlacklisted(Integer phoneSanitizedBlacklisted) {
        this.phoneSanitizedBlacklisted = phoneSanitizedBlacklisted
        return this
    }


    /**
     * 设置「库存拣货」值
     * 字典[库存拣货]
     * @param val
     */
    ResPartnerDTO setPickingWarn(String pickingWarn) {
        this.pickingWarn = pickingWarn
        return this
    }


    /**
     * 设置「库存拣货单消息」值
     * @param val
     */
    ResPartnerDTO setPickingWarnMsg(String pickingWarnMsg) {
        this.pickingWarnMsg = pickingWarnMsg
        return this
    }


    /**
     * 设置「计划更换自行车」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setPlanToChangeBike(Integer planToChangeBike) {
        this.planToChangeBike = planToChangeBike
        return this
    }


    /**
     * 设置「更换车辆计划」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setPlanToChangeCar(Integer planToChangeCar) {
        this.planToChangeCar = planToChangeCar
        return this
    }


    /**
     * 设置「供应商币别」值
     * @param val
     */
    ResPartnerDTO setPropertyPurchaseCurrencyId(String propertyPurchaseCurrencyId) {
        this.propertyPurchaseCurrencyId = propertyPurchaseCurrencyId
        return this
    }


    /**
     * 设置「采购订单数」值
     * @param val
     */
    ResPartnerDTO setPurchaseOrderCount(Integer purchaseOrderCount) {
        this.purchaseOrderCount = purchaseOrderCount
        return this
    }


    /**
     * 设置「采购订单预警」值
     * 字典[采购订单预警]
     * @param val
     */
    ResPartnerDTO setPurchaseWarn(String purchaseWarn) {
        this.purchaseWarn = purchaseWarn
        return this
    }


    /**
     * 设置「采购订单消息」值
     * @param val
     */
    ResPartnerDTO setPurchaseWarnMsg(String purchaseWarnMsg) {
        this.purchaseWarnMsg = purchaseWarnMsg
        return this
    }


    /**
     * 设置「收货提醒」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setReceiptReminderEmail(Integer receiptReminderEmail) {
        this.receiptReminderEmail = receiptReminderEmail
        return this
    }


    /**
     * 设置「参考」值
     * @param val
     */
    ResPartnerDTO setRef(String ref) {
        this.ref = ref
        return this
    }


    /**
     * 设置「收货前几天」值
     * @param val
     */
    ResPartnerDTO setReminderDateBeforeReceipt(Integer reminderDateBeforeReceipt) {
        this.reminderDateBeforeReceipt = reminderDateBeforeReceipt
        return this
    }


    /**
     * 设置「销售订单计数」值
     * @param val
     */
    ResPartnerDTO setSaleOrderCount(Integer saleOrderCount) {
        this.saleOrderCount = saleOrderCount
        return this
    }


    /**
     * 设置「销售警告信息」值
     * 字典[销售警告信息]
     * @param val
     */
    ResPartnerDTO setSaleWarn(String saleWarn) {
        this.saleWarn = saleWarn
        return this
    }


    /**
     * 设置「销售订单消息」值
     * @param val
     */
    ResPartnerDTO setSaleWarnMsg(String saleWarnMsg) {
        this.saleWarnMsg = saleWarnMsg
        return this
    }


    /**
     * 设置「显示信用额度」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setShowCreditLimit(Integer showCreditLimit) {
        this.showCreditLimit = showCreditLimit
        return this
    }


    /**
     * 设置「注册令牌（Token）类型」值
     * @param val
     */
    ResPartnerDTO setSignupType(String signupType) {
        this.signupType = signupType
        return this
    }


    /**
     * 设置「省/州」值
     * @param val
     */
    ResPartnerDTO setStateId(String stateId) {
        this.stateId = stateId
        return this
    }


    /**
     * 设置「省/州」值
     * @param val
     */
    ResPartnerDTO setStateName(String stateName) {
        this.stateName = stateName
        return this
    }


    /**
     * 设置「街道」值
     * @param val
     */
    ResPartnerDTO setStreet(String street) {
        this.street = street
        return this
    }


    /**
     * 设置「详细地址」值
     * @param val
     */
    ResPartnerDTO setStreet2(String street2) {
        this.street2 = street2
        return this
    }


    /**
     * 设置「＃供应商账单」值
     * @param val
     */
    ResPartnerDTO setSupplierInvoiceCount(Integer supplierInvoiceCount) {
        this.supplierInvoiceCount = supplierInvoiceCount
        return this
    }


    /**
     * 设置「供应商排名」值
     * @param val
     */
    ResPartnerDTO setSupplierRank(Integer supplierRank) {
        this.supplierRank = supplierRank
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    ResPartnerDTO setTaskCount(Integer taskCount) {
        this.taskCount = taskCount
        return this
    }


    /**
     * 设置「已开票总计」值
     * @param val
     */
    ResPartnerDTO setTotalInvoiced(BigDecimal totalInvoiced) {
        this.totalInvoiced = totalInvoiced
        return this
    }


    /**
     * 设置「Degree of trust you have in this debtor」值
     * 字典[Degree of trust you have in this debtor]
     * @param val
     */
    ResPartnerDTO setTrust(String trust) {
        this.trust = trust
        return this
    }


    /**
     * 设置「地址类型」值
     * 字典[地址类型]
     * @param val
     */
    ResPartnerDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「时区」值
     * 字典[时区]
     * @param val
     */
    ResPartnerDTO setTz(String tz) {
        this.tz = tz
        return this
    }


    /**
     * 设置「时区偏移」值
     * @param val
     */
    ResPartnerDTO setTzOffset(String tzOffset) {
        this.tzOffset = tzOffset
        return this
    }


    /**
     * 设置「合作伙伴限制」值
     * 字典[是否]
     * @param val
     */
    ResPartnerDTO setUsePartnerCreditLimit(Integer usePartnerCreditLimit) {
        this.usePartnerCreditLimit = usePartnerCreditLimit
        return this
    }


    /**
     * 设置「业务员」值
     * @param val
     */
    ResPartnerDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「业务员」值
     * @param val
     */
    ResPartnerDTO setUserName(String userName) {
        this.userName = userName
        return this
    }


    /**
     * 设置「税号ID」值
     * @param val
     */
    ResPartnerDTO setVat(String vat) {
        this.vat = vat
        return this
    }


    /**
     * 设置「税务 ID 标签」值
     * @param val
     */
    ResPartnerDTO setVatLabel(String vatLabel) {
        this.vatLabel = vatLabel
        return this
    }


    /**
     * 设置「网站链接」值
     * @param val
     */
    ResPartnerDTO setWebsite(String website) {
        this.website = website
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResPartnerDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    ResPartnerDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「邮编」值
     * @param val
     */
    ResPartnerDTO setZip(String zip) {
        this.zip = zip
        return this
    }


    /**
     * 设置「头像128」值
     * @param val
     */
    ResPartnerDTO setAvatar128(String avatar128) {
        this.avatar128 = avatar128
        return this
    }


    /**
     * 设置「图片128」值
     * @param val
     */
    ResPartnerDTO setImage128(String image128) {
        this.image128 = image128
        return this
    }


    /**
     * 设置「头像512」值
     * @param val
     */
    ResPartnerDTO setAvatar512(String avatar512) {
        this.avatar512 = avatar512
        return this
    }


    /**
     * 设置「图片512」值
     * @param val
     */
    ResPartnerDTO setImage512(String image512) {
        this.image512 = image512
        return this
    }


    /**
     * 设置「头像256」值
     * @param val
     */
    ResPartnerDTO setAvatar256(String avatar256) {
        this.avatar256 = avatar256
        return this
    }


    /**
     * 设置「图片256」值
     * @param val
     */
    ResPartnerDTO setImage256(String image256) {
        this.image256 = image256
        return this
    }


    /**
     * 设置「头像1024」值
     * @param val
     */
    ResPartnerDTO setAvatar1024(String avatar1024) {
        this.avatar1024 = avatar1024
        return this
    }


    /**
     * 设置「图片1024」值
     * @param val
     */
    ResPartnerDTO setImage1024(String image1024) {
        this.image1024 = image1024
        return this
    }


    /**
     * 设置「头像」值
     * @param val
     */
    ResPartnerDTO setAvatar(String avatar) {
        this.avatar = avatar
        return this
    }


    /**
     * 设置「头像」值
     * @param val
     */
    ResPartnerDTO setImage(String image) {
        this.image = image
        return this
    }

}
