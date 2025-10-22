package cn.ibizlab.base.resusers.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.base.resgroupsusersrel.dto.ResGroupsUsersRelDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ResUsersDTO extends GroovyDTO<ResUsersDTO> {

    /**
     * 「姓名」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「# 访问权限」
     */
    @JsonProperty("accesses_count")
    Integer accessesCount
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
     * 「青铜徽标数目」
     */
    @JsonProperty("bronze_badge")
    Integer bronzeBadge
    /**
     * 「采购员」
     */
    @JsonProperty("buyer_id")
    String buyerId
    /**
     * 「日历默认隐私」
     * 字典[日历默认隐私]
     */
    @JsonProperty("calendar_default_privacy")
    String calendarDefaultPrivacy
    /**
     * 「从基本日历中标记为已读的最后一条通知」
     */
    @JsonProperty("calendar_last_notif_ack")
    Timestamp calendarLastNotifAck
    /**
     * 「能编辑」
     * 字典[是否]
     */
    @JsonProperty("can_edit")
    Integer canEdit
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
     * 「公司数目」
     */
    @JsonProperty("companies_count")
    Integer companiesCount
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
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「技术领域，是否创建员工」
     * 字典[是否]
     */
    @JsonProperty("create_employee")
    Integer createEmployee
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
     * 「员工人数」
     */
    @JsonProperty("employee_count")
    Integer employeeCount
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
     * 「金质徽标数量」
     */
    @JsonProperty("gold_badge")
    Integer goldBadge
    /**
     * 「# 分组」
     */
    @JsonProperty("groups_count")
    Integer groupsCount
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
     * 「是系统」
     * 字典[是否]
     */
    @JsonProperty("is_system")
    Integer isSystem
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
     * 「贡献值」
     */
    @JsonProperty("karma")
    Integer karma
    /**
     * 「登录」
     */
    @JsonProperty("login")
    String login
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
     * 「设置密码」
     */
    @JsonProperty("new_password")
    String newPassword
    /**
     * 「通知」
     * 字典[通知]
     */
    @JsonProperty("notification_type")
    String notificationType
    /**
     * 「Odoobot 挂了」
     * 字典[是否]
     */
    @JsonProperty("odoobot_failed")
    Integer odoobotFailed
    /**
     * 「小秘书状态」
     * 字典[小秘书状态]
     */
    @JsonProperty("odoobot_state")
    String odoobotState
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
     * 「相关合作伙伴」
     */
    @JsonProperty("partner_id")
    String partnerId
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
     * 「相关合作伙伴」
     */
    @JsonProperty("partner_name")
    String partnerName
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
     * 「密码」
     */
    @JsonProperty("password")
    String password
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
     * 「要求加班」
     * 字典[是否]
     */
    @JsonProperty("request_overtime")
    Integer requestOvertime
    /**
     * 「# 记录规则」
     */
    @JsonProperty("rules_count")
    Integer rulesCount
    /**
     * 「销售订单计数」
     */
    @JsonProperty("sale_order_count")
    Integer saleOrderCount
    /**
     * 「用户销售团队」
     */
    @JsonProperty("sale_team_id")
    String saleTeamId
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
     * 「共享用户」
     * 字典[是否]
     */
    @JsonProperty("share")
    Integer share
    /**
     * 「显示信用额度」
     * 字典[是否]
     */
    @JsonProperty("show_credit_limit")
    Integer showCreditLimit
    /**
     * 「电子邮件签名」
     */
    @JsonProperty("signature")
    String signature
    /**
     * 「注册令牌（Token）类型」
     */
    @JsonProperty("signup_type")
    String signupType
    /**
     * 「银质徽标数量」
     */
    @JsonProperty("silver_badge")
    Integer silverBadge
    /**
     * 「状态」
     * 字典[状态]
     */
    @JsonProperty("state")
    String state
    /**
     * 「省/州」
     */
    @JsonProperty("state_id")
    String stateId
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
     * 「活动完成目标」
     */
    @JsonProperty("target_sales_done")
    Integer targetSalesDone
    /**
     * 「销售订单目标结算单」
     */
    @JsonProperty("target_sales_invoiced")
    Integer targetSalesInvoiced
    /**
     * 「商机赢得目标」
     */
    @JsonProperty("target_sales_won")
    Integer targetSalesWon
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
     * 「双重身份验证」
     * 字典[是否]
     */
    @JsonProperty("totp_enabled")
    Integer totpEnabled
    /**
     * 「Totp密匙」
     */
    @JsonProperty("totp_secret")
    String totpSecret
    /**
     * 「新手入门」
     * 字典[是否]
     */
    @JsonProperty("tour_enabled")
    Integer tourEnabled
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
     * 「用户组警告」
     */
    @JsonProperty("user_group_warning")
    String userGroupWarning
    /**
     * 「业务员」
     */
    @JsonProperty("user_id")
    String userId
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
     * 「null」
     */
    @JsonProperty("groups_users_rels")
    List<ResGroupsUsersRelDTO> groupsUsersRels

    /**
     * 设置「姓名」值
     * @param val
     */
    ResUsersDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「# 访问权限」值
     * @param val
     */
    ResUsersDTO setAccessesCount(Integer accessesCount) {
        this.accessesCount = accessesCount
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「有效语言数量」值
     * @param val
     */
    ResUsersDTO setActiveLangCount(Integer activeLangCount) {
        this.activeLangCount = activeLangCount
        return this
    }


    /**
     * 设置「下一活动截止日期」值
     * @param val
     */
    ResUsersDTO setActivityDateDeadline(Timestamp activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline
        return this
    }


    /**
     * 设置「活动异常标示」值
     * 字典[活动异常标示]
     * @param val
     */
    ResUsersDTO setActivityExceptionDecoration(String activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    ResUsersDTO setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon
        return this
    }


    /**
     * 设置「活动状态」值
     * 字典[活动状态]
     * @param val
     */
    ResUsersDTO setActivityState(String activityState) {
        this.activityState = activityState
        return this
    }


    /**
     * 设置「附加信息」值
     * @param val
     */
    ResUsersDTO setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo
        return this
    }


    /**
     * 设置「Auto-post bills」值
     * 字典[Auto-post bills]
     * @param val
     */
    ResUsersDTO setAutopostBills(String autopostBills) {
        this.autopostBills = autopostBills
        return this
    }


    /**
     * 设置「银行」值
     * @param val
     */
    ResUsersDTO setBankAccountCount(Integer bankAccountCount) {
        this.bankAccountCount = bankAccountCount
        return this
    }


    /**
     * 设置「条形码」值
     * @param val
     */
    ResUsersDTO setBarcode(String barcode) {
        this.barcode = barcode
        return this
    }


    /**
     * 设置「青铜徽标数目」值
     * @param val
     */
    ResUsersDTO setBronzeBadge(Integer bronzeBadge) {
        this.bronzeBadge = bronzeBadge
        return this
    }


    /**
     * 设置「采购员」值
     * @param val
     */
    ResUsersDTO setBuyerId(String buyerId) {
        this.buyerId = buyerId
        return this
    }


    /**
     * 设置「日历默认隐私」值
     * 字典[日历默认隐私]
     * @param val
     */
    ResUsersDTO setCalendarDefaultPrivacy(String calendarDefaultPrivacy) {
        this.calendarDefaultPrivacy = calendarDefaultPrivacy
        return this
    }


    /**
     * 设置「从基本日历中标记为已读的最后一条通知」值
     * @param val
     */
    ResUsersDTO setCalendarLastNotifAck(Timestamp calendarLastNotifAck) {
        this.calendarLastNotifAck = calendarLastNotifAck
        return this
    }


    /**
     * 设置「能编辑」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setCanEdit(Integer canEdit) {
        this.canEdit = canEdit
        return this
    }


    /**
     * 设置「公司认证数」值
     * @param val
     */
    ResUsersDTO setCertificationsCompanyCount(Integer certificationsCompanyCount) {
        this.certificationsCompanyCount = certificationsCompanyCount
        return this
    }


    /**
     * 设置「认证计算」值
     * @param val
     */
    ResUsersDTO setCertificationsCount(Integer certificationsCount) {
        this.certificationsCount = certificationsCount
        return this
    }


    /**
     * 设置「城市」值
     * @param val
     */
    ResUsersDTO setCity(String city) {
        this.city = city
        return this
    }


    /**
     * 设置「颜色索引」值
     * @param val
     */
    ResUsersDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    ResUsersDTO setComment(String comment) {
        this.comment = comment
        return this
    }


    /**
     * 设置「公司名称实体」值
     * @param val
     */
    ResUsersDTO setCommercialCompanyName(String commercialCompanyName) {
        this.commercialCompanyName = commercialCompanyName
        return this
    }


    /**
     * 设置「商业实体」值
     * @param val
     */
    ResUsersDTO setCommercialPartnerId(String commercialPartnerId) {
        this.commercialPartnerId = commercialPartnerId
        return this
    }


    /**
     * 设置「公司数目」值
     * @param val
     */
    ResUsersDTO setCompaniesCount(Integer companiesCount) {
        this.companiesCount = companiesCount
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    ResUsersDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「公司名称」值
     * @param val
     */
    ResUsersDTO setCompanyName(String companyName) {
        this.companyName = companyName
        return this
    }


    /**
     * 设置「公司注册号」值
     * @param val
     */
    ResUsersDTO setCompanyRegistry(String companyRegistry) {
        this.companyRegistry = companyRegistry
        return this
    }


    /**
     * 设置「公司 ID 标签」值
     * @param val
     */
    ResUsersDTO setCompanyRegistryLabel(String companyRegistryLabel) {
        this.companyRegistryLabel = companyRegistryLabel
        return this
    }


    /**
     * 设置「公司类型」值
     * 字典[公司类型]
     * @param val
     */
    ResUsersDTO setCompanyType(String companyType) {
        this.companyType = companyType
        return this
    }


    /**
     * 设置「全名」值
     * @param val
     */
    ResUsersDTO setCompleteName(String completeName) {
        this.completeName = completeName
        return this
    }


    /**
     * 设置「完整地址」值
     * @param val
     */
    ResUsersDTO setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress
        return this
    }


    /**
     * 设置「内嵌完整地址」值
     * @param val
     */
    ResUsersDTO setContactAddressInline(String contactAddressInline) {
        this.contactAddressInline = contactAddressInline
        return this
    }


    /**
     * 设置「国家/地区」值
     * @param val
     */
    ResUsersDTO setCountryId(String countryId) {
        this.countryId = countryId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResUsersDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「技术领域，是否创建员工」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setCreateEmployee(Integer createEmployee) {
        this.createEmployee = createEmployee
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    ResUsersDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「应收账款总计」值
     * @param val
     */
    ResUsersDTO setCredit(BigDecimal credit) {
        this.credit = credit
        return this
    }


    /**
     * 设置「信贷额度」值
     * @param val
     */
    ResUsersDTO setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit
        return this
    }


    /**
     * 设置「贷记入发票」值
     * @param val
     */
    ResUsersDTO setCreditToInvoice(BigDecimal creditToInvoice) {
        this.creditToInvoice = creditToInvoice
        return this
    }


    /**
     * 设置「客户等级」值
     * @param val
     */
    ResUsersDTO setCustomerRank(Integer customerRank) {
        this.customerRank = customerRank
        return this
    }


    /**
     * 设置「销售变现天数（DSO）」值
     * @param val
     */
    ResUsersDTO setDaysSalesOutstanding(Double daysSalesOutstanding) {
        this.daysSalesOutstanding = daysSalesOutstanding
        return this
    }


    /**
     * 设置「应付账款总计」值
     * @param val
     */
    ResUsersDTO setDebit(BigDecimal debit) {
        this.debit = debit
        return this
    }


    /**
     * 设置「应付账款限额」值
     * @param val
     */
    ResUsersDTO setDebitLimit(BigDecimal debitLimit) {
        this.debitLimit = debitLimit
        return this
    }


    /**
     * 设置「显示发票 Edi 格式」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setDisplayInvoiceEdiFormat(Integer displayInvoiceEdiFormat) {
        this.displayInvoiceEdiFormat = displayInvoiceEdiFormat
        return this
    }


    /**
     * 设置「Display Invoice Template Pdf Report」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setDisplayInvoiceTemplatePdfReportId(Integer displayInvoiceTemplatePdfReportId) {
        this.displayInvoiceTemplatePdfReportId = displayInvoiceTemplatePdfReportId
        return this
    }


    /**
     * 设置「Duplicated Bank Account Partners Count」值
     * @param val
     */
    ResUsersDTO setDuplicatedBankAccountPartnersCount(Integer duplicatedBankAccountPartnersCount) {
        this.duplicatedBankAccountPartnersCount = duplicatedBankAccountPartnersCount
        return this
    }


    /**
     * 设置「邮箱」值
     * @param val
     */
    ResUsersDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「格式化邮件」值
     * @param val
     */
    ResUsersDTO setEmailFormatted(String emailFormatted) {
        this.emailFormatted = emailFormatted
        return this
    }


    /**
     * 设置「规范化邮件」值
     * @param val
     */
    ResUsersDTO setEmailNormalized(String emailNormalized) {
        this.emailNormalized = emailNormalized
        return this
    }


    /**
     * 设置「员工」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setEmployee(Integer employee) {
        this.employee = employee
        return this
    }


    /**
     * 设置「员工人数」值
     * @param val
     */
    ResUsersDTO setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount
        return this
    }


    /**
     * 设置「员工数量」值
     * @param val
     */
    ResUsersDTO setEmployeesCount(Integer employeesCount) {
        this.employeesCount = employeesCount
        return this
    }


    /**
     * 设置「会计所在国家/地区代码」值
     * @param val
     */
    ResUsersDTO setFiscalCountryCodes(String fiscalCountryCodes) {
        this.fiscalCountryCodes = fiscalCountryCodes
        return this
    }


    /**
     * 设置「工作职位」值
     * @param val
     */
    ResUsersDTO setFunction(String function) {
        this.function = function
        return this
    }


    /**
     * 设置「金质徽标数量」值
     * @param val
     */
    ResUsersDTO setGoldBadge(Integer goldBadge) {
        this.goldBadge = goldBadge
        return this
    }


    /**
     * 设置「# 分组」值
     * @param val
     */
    ResUsersDTO setGroupsCount(Integer groupsCount) {
        this.groupsCount = groupsCount
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResUsersDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「Ignore Abnormal Invoice Amount」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setIgnoreAbnormalInvoiceAmount(Integer ignoreAbnormalInvoiceAmount) {
        this.ignoreAbnormalInvoiceAmount = ignoreAbnormalInvoiceAmount
        return this
    }


    /**
     * 设置「Ignore Abnormal Invoice Date」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setIgnoreAbnormalInvoiceDate(Integer ignoreAbnormalInvoiceDate) {
        this.ignoreAbnormalInvoiceDate = ignoreAbnormalInvoiceDate
        return this
    }


    /**
     * 设置「IM的状态」值
     * @param val
     */
    ResUsersDTO setImStatus(String imStatus) {
        this.imStatus = imStatus
        return this
    }


    /**
     * 设置「行业」值
     * @param val
     */
    ResUsersDTO setIndustryId(String industryId) {
        this.industryId = industryId
        return this
    }


    /**
     * 设置「电子发票格式」值
     * 字典[电子发票格式]
     * @param val
     */
    ResUsersDTO setInvoiceEdiFormat(String invoiceEdiFormat) {
        this.invoiceEdiFormat = invoiceEdiFormat
        return this
    }


    /**
     * 设置「发票 EDI 格式商店」值
     * @param val
     */
    ResUsersDTO setInvoiceEdiFormatStore(String invoiceEdiFormatStore) {
        this.invoiceEdiFormatStore = invoiceEdiFormatStore
        return this
    }


    /**
     * 设置「传送发票」值
     * 字典[传送发票]
     * @param val
     */
    ResUsersDTO setInvoiceSendingMethod(String invoiceSendingMethod) {
        this.invoiceSendingMethod = invoiceSendingMethod
        return this
    }


    /**
     * 设置「发票」值
     * 字典[发票]
     * @param val
     */
    ResUsersDTO setInvoiceWarn(String invoiceWarn) {
        this.invoiceWarn = invoiceWarn
        return this
    }


    /**
     * 设置「发票消息」值
     * @param val
     */
    ResUsersDTO setInvoiceWarnMsg(String invoiceWarnMsg) {
        this.invoiceWarnMsg = invoiceWarnMsg
        return this
    }


    /**
     * 设置「黑名单」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setIsBlacklisted(Integer isBlacklisted) {
        this.isBlacklisted = isBlacklisted
        return this
    }


    /**
     * 设置「Is Coa Installed」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setIsCoaInstalled(Integer isCoaInstalled) {
        this.isCoaInstalled = isCoaInstalled
        return this
    }


    /**
     * 设置「是公司」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setIsCompany(Integer isCompany) {
        this.isCompany = isCompany
        return this
    }


    /**
     * 设置「是 Peppol Edi 格式」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setIsPeppolEdiFormat(Integer isPeppolEdiFormat) {
        this.isPeppolEdiFormat = isPeppolEdiFormat
        return this
    }


    /**
     * 设置「是公共」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setIsPublic(Integer isPublic) {
        this.isPublic = isPublic
        return this
    }


    /**
     * 设置「是系统」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setIsSystem(Integer isSystem) {
        this.isSystem = isSystem
        return this
    }


    /**
     * 设置「是 Ubl 格式」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setIsUblFormat(Integer isUblFormat) {
        this.isUblFormat = isUblFormat
        return this
    }


    /**
     * 设置「日记账项目」值
     * @param val
     */
    ResUsersDTO setJournalItemCount(Integer journalItemCount) {
        this.journalItemCount = journalItemCount
        return this
    }


    /**
     * 设置「贡献值」值
     * @param val
     */
    ResUsersDTO setKarma(Integer karma) {
        this.karma = karma
        return this
    }


    /**
     * 设置「登录」值
     * @param val
     */
    ResUsersDTO setLogin(String login) {
        this.login = login
        return this
    }


    /**
     * 设置「# 会议」值
     * @param val
     */
    ResUsersDTO setMeetingCount(Integer meetingCount) {
        this.meetingCount = meetingCount
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    ResUsersDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「退回」值
     * @param val
     */
    ResUsersDTO setMessageBounce(Integer messageBounce) {
        this.messageBounce = messageBounce
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    ResUsersDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「待处理」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    ResUsersDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「手机」值
     * @param val
     */
    ResUsersDTO setMobile(String mobile) {
        this.mobile = mobile
        return this
    }


    /**
     * 设置「列入黑名单的手机是移动的」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setMobileBlacklisted(Integer mobileBlacklisted) {
        this.mobileBlacklisted = mobileBlacklisted
        return this
    }


    /**
     * 设置「我的活动截止时间」值
     * @param val
     */
    ResUsersDTO setMyActivityDateDeadline(Timestamp myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResUsersDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「设置密码」值
     * @param val
     */
    ResUsersDTO setNewPassword(String newPassword) {
        this.newPassword = newPassword
        return this
    }


    /**
     * 设置「通知」值
     * 字典[通知]
     * @param val
     */
    ResUsersDTO setNotificationType(String notificationType) {
        this.notificationType = notificationType
        return this
    }


    /**
     * 设置「Odoobot 挂了」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setOdoobotFailed(Integer odoobotFailed) {
        this.odoobotFailed = odoobotFailed
        return this
    }


    /**
     * 设置「小秘书状态」值
     * 字典[小秘书状态]
     * @param val
     */
    ResUsersDTO setOdoobotState(String odoobotState) {
        this.odoobotState = odoobotState
        return this
    }


    /**
     * 设置「准时交货率」值
     * @param val
     */
    ResUsersDTO setOnTimeRate(Double onTimeRate) {
        this.onTimeRate = onTimeRate
        return this
    }


    /**
     * 设置「商机数量」值
     * @param val
     */
    ResUsersDTO setOpportunityCount(Integer opportunityCount) {
        this.opportunityCount = opportunityCount
        return this
    }


    /**
     * 设置「相关公司」值
     * @param val
     */
    ResUsersDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「合作伙伴公司注册处占位符」值
     * @param val
     */
    ResUsersDTO setPartnerCompanyRegistryPlaceholder(String partnerCompanyRegistryPlaceholder) {
        this.partnerCompanyRegistryPlaceholder = partnerCompanyRegistryPlaceholder
        return this
    }


    /**
     * 设置「公司数据库ID」值
     * @param val
     */
    ResUsersDTO setPartnerGid(Integer partnerGid) {
        this.partnerGid = partnerGid
        return this
    }


    /**
     * 设置「相关合作伙伴」值
     * @param val
     */
    ResUsersDTO setPartnerId(String partnerId) {
        this.partnerId = partnerId
        return this
    }


    /**
     * 设置「地理纬度」值
     * @param val
     */
    ResUsersDTO setPartnerLatitude(Double partnerLatitude) {
        this.partnerLatitude = partnerLatitude
        return this
    }


    /**
     * 设置「地理经度」值
     * @param val
     */
    ResUsersDTO setPartnerLongitude(Double partnerLongitude) {
        this.partnerLongitude = partnerLongitude
        return this
    }


    /**
     * 设置「相关合作伙伴」值
     * @param val
     */
    ResUsersDTO setPartnerName(String partnerName) {
        this.partnerName = partnerName
        return this
    }


    /**
     * 设置「共享合作伙伴」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setPartnerShare(Integer partnerShare) {
        this.partnerShare = partnerShare
        return this
    }


    /**
     * 设置「Partner Vat Placeholder」值
     * @param val
     */
    ResUsersDTO setPartnerVatPlaceholder(String partnerVatPlaceholder) {
        this.partnerVatPlaceholder = partnerVatPlaceholder
        return this
    }


    /**
     * 设置「密码」值
     * @param val
     */
    ResUsersDTO setPassword(String password) {
        this.password = password
        return this
    }


    /**
     * 设置「支付令牌计数」值
     * @param val
     */
    ResUsersDTO setPaymentTokenCount(Integer paymentTokenCount) {
        this.paymentTokenCount = paymentTokenCount
        return this
    }


    /**
     * 设置「Peppol电子地址（EAS）」值
     * 字典[Peppol电子地址（EAS）]
     * @param val
     */
    ResUsersDTO setPeppolEas(String peppolEas) {
        this.peppolEas = peppolEas
        return this
    }


    /**
     * 设置「Peppol Endpoint」值
     * @param val
     */
    ResUsersDTO setPeppolEndpoint(String peppolEndpoint) {
        this.peppolEndpoint = peppolEndpoint
        return this
    }


    /**
     * 设置「电话」值
     * @param val
     */
    ResUsersDTO setPhone(String phone) {
        this.phone = phone
        return this
    }


    /**
     * 设置「列入黑名单的电话是电话」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setPhoneBlacklisted(Integer phoneBlacklisted) {
        this.phoneBlacklisted = phoneBlacklisted
        return this
    }


    /**
     * 设置「电话/手机」值
     * @param val
     */
    ResUsersDTO setPhoneMobileSearch(String phoneMobileSearch) {
        this.phoneMobileSearch = phoneMobileSearch
        return this
    }


    /**
     * 设置「净化数量」值
     * @param val
     */
    ResUsersDTO setPhoneSanitized(String phoneSanitized) {
        this.phoneSanitized = phoneSanitized
        return this
    }


    /**
     * 设置「电话加黑」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setPhoneSanitizedBlacklisted(Integer phoneSanitizedBlacklisted) {
        this.phoneSanitizedBlacklisted = phoneSanitizedBlacklisted
        return this
    }


    /**
     * 设置「库存拣货」值
     * 字典[库存拣货]
     * @param val
     */
    ResUsersDTO setPickingWarn(String pickingWarn) {
        this.pickingWarn = pickingWarn
        return this
    }


    /**
     * 设置「库存拣货单消息」值
     * @param val
     */
    ResUsersDTO setPickingWarnMsg(String pickingWarnMsg) {
        this.pickingWarnMsg = pickingWarnMsg
        return this
    }


    /**
     * 设置「计划更换自行车」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setPlanToChangeBike(Integer planToChangeBike) {
        this.planToChangeBike = planToChangeBike
        return this
    }


    /**
     * 设置「更换车辆计划」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setPlanToChangeCar(Integer planToChangeCar) {
        this.planToChangeCar = planToChangeCar
        return this
    }


    /**
     * 设置「供应商币别」值
     * @param val
     */
    ResUsersDTO setPropertyPurchaseCurrencyId(String propertyPurchaseCurrencyId) {
        this.propertyPurchaseCurrencyId = propertyPurchaseCurrencyId
        return this
    }


    /**
     * 设置「采购订单数」值
     * @param val
     */
    ResUsersDTO setPurchaseOrderCount(Integer purchaseOrderCount) {
        this.purchaseOrderCount = purchaseOrderCount
        return this
    }


    /**
     * 设置「采购订单预警」值
     * 字典[采购订单预警]
     * @param val
     */
    ResUsersDTO setPurchaseWarn(String purchaseWarn) {
        this.purchaseWarn = purchaseWarn
        return this
    }


    /**
     * 设置「采购订单消息」值
     * @param val
     */
    ResUsersDTO setPurchaseWarnMsg(String purchaseWarnMsg) {
        this.purchaseWarnMsg = purchaseWarnMsg
        return this
    }


    /**
     * 设置「收货提醒」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setReceiptReminderEmail(Integer receiptReminderEmail) {
        this.receiptReminderEmail = receiptReminderEmail
        return this
    }


    /**
     * 设置「参考」值
     * @param val
     */
    ResUsersDTO setRef(String ref) {
        this.ref = ref
        return this
    }


    /**
     * 设置「收货前几天」值
     * @param val
     */
    ResUsersDTO setReminderDateBeforeReceipt(Integer reminderDateBeforeReceipt) {
        this.reminderDateBeforeReceipt = reminderDateBeforeReceipt
        return this
    }


    /**
     * 设置「要求加班」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setRequestOvertime(Integer requestOvertime) {
        this.requestOvertime = requestOvertime
        return this
    }


    /**
     * 设置「# 记录规则」值
     * @param val
     */
    ResUsersDTO setRulesCount(Integer rulesCount) {
        this.rulesCount = rulesCount
        return this
    }


    /**
     * 设置「销售订单计数」值
     * @param val
     */
    ResUsersDTO setSaleOrderCount(Integer saleOrderCount) {
        this.saleOrderCount = saleOrderCount
        return this
    }


    /**
     * 设置「用户销售团队」值
     * @param val
     */
    ResUsersDTO setSaleTeamId(String saleTeamId) {
        this.saleTeamId = saleTeamId
        return this
    }


    /**
     * 设置「销售警告信息」值
     * 字典[销售警告信息]
     * @param val
     */
    ResUsersDTO setSaleWarn(String saleWarn) {
        this.saleWarn = saleWarn
        return this
    }


    /**
     * 设置「销售订单消息」值
     * @param val
     */
    ResUsersDTO setSaleWarnMsg(String saleWarnMsg) {
        this.saleWarnMsg = saleWarnMsg
        return this
    }


    /**
     * 设置「共享用户」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setShare(Integer share) {
        this.share = share
        return this
    }


    /**
     * 设置「显示信用额度」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setShowCreditLimit(Integer showCreditLimit) {
        this.showCreditLimit = showCreditLimit
        return this
    }


    /**
     * 设置「电子邮件签名」值
     * @param val
     */
    ResUsersDTO setSignature(String signature) {
        this.signature = signature
        return this
    }


    /**
     * 设置「注册令牌（Token）类型」值
     * @param val
     */
    ResUsersDTO setSignupType(String signupType) {
        this.signupType = signupType
        return this
    }


    /**
     * 设置「银质徽标数量」值
     * @param val
     */
    ResUsersDTO setSilverBadge(Integer silverBadge) {
        this.silverBadge = silverBadge
        return this
    }


    /**
     * 设置「状态」值
     * 字典[状态]
     * @param val
     */
    ResUsersDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「省/州」值
     * @param val
     */
    ResUsersDTO setStateId(String stateId) {
        this.stateId = stateId
        return this
    }


    /**
     * 设置「街道」值
     * @param val
     */
    ResUsersDTO setStreet(String street) {
        this.street = street
        return this
    }


    /**
     * 设置「详细地址」值
     * @param val
     */
    ResUsersDTO setStreet2(String street2) {
        this.street2 = street2
        return this
    }


    /**
     * 设置「＃供应商账单」值
     * @param val
     */
    ResUsersDTO setSupplierInvoiceCount(Integer supplierInvoiceCount) {
        this.supplierInvoiceCount = supplierInvoiceCount
        return this
    }


    /**
     * 设置「供应商排名」值
     * @param val
     */
    ResUsersDTO setSupplierRank(Integer supplierRank) {
        this.supplierRank = supplierRank
        return this
    }


    /**
     * 设置「活动完成目标」值
     * @param val
     */
    ResUsersDTO setTargetSalesDone(Integer targetSalesDone) {
        this.targetSalesDone = targetSalesDone
        return this
    }


    /**
     * 设置「销售订单目标结算单」值
     * @param val
     */
    ResUsersDTO setTargetSalesInvoiced(Integer targetSalesInvoiced) {
        this.targetSalesInvoiced = targetSalesInvoiced
        return this
    }


    /**
     * 设置「商机赢得目标」值
     * @param val
     */
    ResUsersDTO setTargetSalesWon(Integer targetSalesWon) {
        this.targetSalesWon = targetSalesWon
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    ResUsersDTO setTaskCount(Integer taskCount) {
        this.taskCount = taskCount
        return this
    }


    /**
     * 设置「已开票总计」值
     * @param val
     */
    ResUsersDTO setTotalInvoiced(BigDecimal totalInvoiced) {
        this.totalInvoiced = totalInvoiced
        return this
    }


    /**
     * 设置「双重身份验证」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setTotpEnabled(Integer totpEnabled) {
        this.totpEnabled = totpEnabled
        return this
    }


    /**
     * 设置「Totp密匙」值
     * @param val
     */
    ResUsersDTO setTotpSecret(String totpSecret) {
        this.totpSecret = totpSecret
        return this
    }


    /**
     * 设置「新手入门」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setTourEnabled(Integer tourEnabled) {
        this.tourEnabled = tourEnabled
        return this
    }


    /**
     * 设置「Degree of trust you have in this debtor」值
     * 字典[Degree of trust you have in this debtor]
     * @param val
     */
    ResUsersDTO setTrust(String trust) {
        this.trust = trust
        return this
    }


    /**
     * 设置「地址类型」值
     * 字典[地址类型]
     * @param val
     */
    ResUsersDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「时区」值
     * 字典[时区]
     * @param val
     */
    ResUsersDTO setTz(String tz) {
        this.tz = tz
        return this
    }


    /**
     * 设置「时区偏移」值
     * @param val
     */
    ResUsersDTO setTzOffset(String tzOffset) {
        this.tzOffset = tzOffset
        return this
    }


    /**
     * 设置「合作伙伴限制」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setUsePartnerCreditLimit(Integer usePartnerCreditLimit) {
        this.usePartnerCreditLimit = usePartnerCreditLimit
        return this
    }


    /**
     * 设置「用户组警告」值
     * @param val
     */
    ResUsersDTO setUserGroupWarning(String userGroupWarning) {
        this.userGroupWarning = userGroupWarning
        return this
    }


    /**
     * 设置「业务员」值
     * @param val
     */
    ResUsersDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「税号ID」值
     * @param val
     */
    ResUsersDTO setVat(String vat) {
        this.vat = vat
        return this
    }


    /**
     * 设置「税务 ID 标签」值
     * @param val
     */
    ResUsersDTO setVatLabel(String vatLabel) {
        this.vatLabel = vatLabel
        return this
    }


    /**
     * 设置「网站链接」值
     * @param val
     */
    ResUsersDTO setWebsite(String website) {
        this.website = website
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResUsersDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    ResUsersDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「邮编」值
     * @param val
     */
    ResUsersDTO setZip(String zip) {
        this.zip = zip
        return this
    }


    /**
     * 设置「头像128」值
     * @param val
     */
    ResUsersDTO setAvatar128(String avatar128) {
        this.avatar128 = avatar128
        return this
    }


    /**
     * 设置「图片128」值
     * @param val
     */
    ResUsersDTO setImage128(String image128) {
        this.image128 = image128
        return this
    }


    /**
     * 设置「头像512」值
     * @param val
     */
    ResUsersDTO setAvatar512(String avatar512) {
        this.avatar512 = avatar512
        return this
    }


    /**
     * 设置「图片512」值
     * @param val
     */
    ResUsersDTO setImage512(String image512) {
        this.image512 = image512
        return this
    }


    /**
     * 设置「头像256」值
     * @param val
     */
    ResUsersDTO setAvatar256(String avatar256) {
        this.avatar256 = avatar256
        return this
    }


    /**
     * 设置「图片256」值
     * @param val
     */
    ResUsersDTO setImage256(String image256) {
        this.image256 = image256
        return this
    }


    /**
     * 设置「头像1024」值
     * @param val
     */
    ResUsersDTO setAvatar1024(String avatar1024) {
        this.avatar1024 = avatar1024
        return this
    }


    /**
     * 设置「图片1024」值
     * @param val
     */
    ResUsersDTO setImage1024(String image1024) {
        this.image1024 = image1024
        return this
    }


    /**
     * 设置「头像」值
     * @param val
     */
    ResUsersDTO setAvatar(String avatar) {
        this.avatar = avatar
        return this
    }


    /**
     * 设置「头像」值
     * @param val
     */
    ResUsersDTO setImage(String image) {
        this.image = image
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    ResUsersDTO setGroupsUsersRels(List<ResGroupsUsersRelDTO> groupsUsersRels) {
        this.groupsUsersRels = groupsUsersRels
        return this
    }

}
