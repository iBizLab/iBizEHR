package cn.ibizlab.base.rescompany.dto

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
class ResCompanyDTO extends GroovyDTO<ResCompanyDTO> {

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
     * 「缺勤管理」
     * 字典[是否]
     */
    @JsonProperty("absence_management")
    Integer absenceManagement
    /**
     * 「会计所在国家/地区」
     */
    @JsonProperty("account_fiscal_country_id")
    String accountFiscalCountryId
    /**
     * 「期初分录」
     */
    @JsonProperty("account_opening_date")
    Timestamp accountOpeningDate
    /**
     * 「Default Sales Price Include」
     * 字典[Default Sales Price Include]
     */
    @JsonProperty("account_price_include")
    String accountPriceInclude
    /**
     * 「Storno会计应用程序」
     * 字典[是否]
     */
    @JsonProperty("account_storno")
    Integer accountStorno
    /**
     * 「销售信用额度」
     * 字典[是否]
     */
    @JsonProperty("account_use_credit_limit")
    Integer accountUseCreditLimit
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
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
     * 「电子邮件域名」
     */
    @JsonProperty("alias_domain_id")
    String aliasDomainId
    /**
     * 「使用盎格鲁撒克逊会计」
     * 字典[是否]
     */
    @JsonProperty("anglo_saxon_accounting")
    Integer angloSaxonAccounting
    /**
     * 「日期」
     */
    @JsonProperty("annual_inventory_day")
    Integer annualInventoryDay
    /**
     * 「年度库存月」
     * 字典[年度库存月]
     */
    @JsonProperty("annual_inventory_month")
    String annualInventoryMonth
    /**
     * 「条码来源」
     * 字典[条码来源]
     */
    @JsonProperty("attendance_barcode_source")
    String attendanceBarcodeSource
    /**
     * 「来自 Systray 的出席情况」
     * 字典[是否]
     */
    @JsonProperty("attendance_from_systray")
    Integer attendanceFromSystray
    /**
     * 「自助考勤终端延迟」
     */
    @JsonProperty("attendance_kiosk_delay")
    Integer attendanceKioskDelay
    /**
     * 「自助考勤终端密钥」
     */
    @JsonProperty("attendance_kiosk_key")
    String attendanceKioskKey
    /**
     * 「考勤模式」
     * 字典[考勤模式]
     */
    @JsonProperty("attendance_kiosk_mode")
    String attendanceKioskMode
    /**
     * 「自助考勤终端网址」
     */
    @JsonProperty("attendance_kiosk_url")
    String attendanceKioskUrl
    /**
     * 「员工PIN」
     * 字典[是否]
     */
    @JsonProperty("attendance_kiosk_use_pin")
    Integer attendanceKioskUsePin
    /**
     * 「额外工时验证」
     * 字典[额外工时验证]
     */
    @JsonProperty("attendance_overtime_validation")
    String attendanceOvertimeValidation
    /**
     * 「自动签退」
     * 字典[是否]
     */
    @JsonProperty("auto_check_out")
    Integer autoCheckOut
    /**
     * 「null」
     */
    @JsonProperty("auto_check_out_tolerance")
    Double autoCheckOutTolerance
    /**
     * 「自动验证账单」
     * 字典[是否]
     */
    @JsonProperty("autopost_bills")
    Integer autopostBills
    /**
     * 「Prefix of the bank accounts」
     */
    @JsonProperty("bank_account_code_prefix")
    String bankAccountCodePrefix
    /**
     * 「Batch Payment Sequence」
     */
    @JsonProperty("batch_payment_sequence_id")
    String batchPaymentSequenceId
    /**
     * 「退件电子邮件」
     */
    @JsonProperty("bounce_email")
    String bounceEmail
    /**
     * 「退回」
     */
    @JsonProperty("bounce_formatted")
    String bounceFormatted
    /**
     * 「候选人属性」
     */
    @JsonProperty("candidate_properties_definition")
    String candidatePropertiesDefinition
    /**
     * 「Prefix of the cash accounts」
     */
    @JsonProperty("cash_account_code_prefix")
    String cashAccountCodePrefix
    /**
     * 「预设邮件」
     */
    @JsonProperty("catchall_email")
    String catchallEmail
    /**
     * 「预设」
     */
    @JsonProperty("catchall_formatted")
    String catchallFormatted
    /**
     * 「审计跟踪」
     * 字典[是否]
     */
    @JsonProperty("check_account_audit_trail")
    Integer checkAccountAuditTrail
    /**
     * 「城市」
     */
    @JsonProperty("city")
    String city
    /**
     * 「颜色」
     */
    @JsonProperty("color")
    Integer color
    /**
     * 「公司详情」
     */
    @JsonProperty("company_details")
    String companyDetails
    /**
     * 「公司注册处占位符」
     */
    @JsonProperty("company_registry_placeholder")
    String companyRegistryPlaceholder
    /**
     * 「公司增值税占位符」
     */
    @JsonProperty("company_vat_placeholder")
    String companyVatPlaceholder
    /**
     * 「合同到期通知期」
     */
    @JsonProperty("contract_expiration_notice_period")
    Integer contractExpirationNoticePeriod
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
     * 「币别」
     */
    @JsonProperty("currency_id")
    String currencyId
    /**
     * 「币别」
     */
    @JsonProperty("currency_name")
    String currencyName
    /**
     * 「采购前置天数」
     */
    @JsonProperty("days_to_purchase")
    Double daysToPurchase
    /**
     * 「大写发票总额」
     * 字典[是否]
     */
    @JsonProperty("display_invoice_amount_total_words")
    Integer displayInvoiceAmountTotalWords
    /**
     * 「税款以公司币别表示」
     * 字典[是否]
     */
    @JsonProperty("display_invoice_tax_company_currency")
    Integer displayInvoiceTaxCompanyCurrency
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「格式化的邮件」
     */
    @JsonProperty("email_formatted")
    String emailFormatted
    /**
     * 「电子邮件标题颜色」
     */
    @JsonProperty("email_primary_color")
    String emailPrimaryColor
    /**
     * 「电子邮件按钮颜色」
     */
    @JsonProperty("email_secondary_color")
    String emailSecondaryColor
    /**
     * 「员工属性」
     */
    @JsonProperty("employee_properties_definition")
    String employeePropertiesDefinition
    /**
     * 「Expects a Chart of Accounts」
     * 字典[是否]
     */
    @JsonProperty("expects_chart_of_accounts")
    Integer expectsChartOfAccounts
    /**
     * 「会计年度最后一天」
     */
    @JsonProperty("fiscalyear_last_day")
    Integer fiscalyearLastDay
    /**
     * 「会计年度最后一个月」
     * 字典[会计年度最后一个月]
     */
    @JsonProperty("fiscalyear_last_month")
    String fiscalyearLastMonth
    /**
     * 「全球锁定日期」
     */
    @JsonProperty("fiscalyear_lock_date")
    Timestamp fiscalyearLockDate
    /**
     * 「字体」
     * 字典[字体]
     */
    @JsonProperty("font")
    String font
    /**
     * 「硬锁定日期」
     */
    @JsonProperty("hard_lock_date")
    Timestamp hardLockDate
    /**
     * 「有消息」
     * 字典[是否]
     */
    @JsonProperty("has_message")
    Integer hasMessage
    /**
     * 「已收到库存警告短信息」
     * 字典[是否]
     */
    @JsonProperty("has_received_warning_stock_sms")
    Integer hasReceivedWarningStockSms
    /**
     * 「显示额外时间」
     * 字典[是否]
     */
    @JsonProperty("hr_attendance_display_overtime")
    Integer hrAttendanceDisplayOvertime
    /**
     * 「根据出勤率」
     * 字典[是否]
     */
    @JsonProperty("hr_presence_control_attendance")
    Integer hrPresenceControlAttendance
    /**
     * 「根据发送的电子邮件数量」
     * 字典[是否]
     */
    @JsonProperty("hr_presence_control_email")
    Integer hrPresenceControlEmail
    /**
     * 「# 要发送的电子邮件」
     */
    @JsonProperty("hr_presence_control_email_amount")
    Integer hrPresenceControlEmailAmount
    /**
     * 「基于IP地址」
     * 字典[是否]
     */
    @JsonProperty("hr_presence_control_ip")
    Integer hrPresenceControlIp
    /**
     * 「有效的IP地址」
     */
    @JsonProperty("hr_presence_control_ip_list")
    String hrPresenceControlIpList
    /**
     * 「基于系统中的用户状态」
     * 字典[是否]
     */
    @JsonProperty("hr_presence_control_login")
    Integer hrPresenceControlLogin
    /**
     * 「丰富完成」
     * 字典[是否]
     */
    @JsonProperty("iap_enrich_auto_done")
    Integer iapEnrichAutoDone
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「Default Terms and Conditions」
     */
    @JsonProperty("invoice_terms")
    String invoiceTerms
    /**
     * 「Default Terms and Conditions as a Web page」
     */
    @JsonProperty("invoice_terms_html")
    String invoiceTermsHtml
    /**
     * 「公司详细信息是否为空」
     * 字典[是否]
     */
    @JsonProperty("is_company_details_empty")
    Integer isCompanyDetailsEmpty
    /**
     * 「职位属性」
     */
    @JsonProperty("job_properties_definition")
    String jobPropertiesDefinition
    /**
     * 「布局背景」
     * 字典[布局背景]
     */
    @JsonProperty("layout_background")
    String layoutBackground
    /**
     * 「制造提前期」
     */
    @JsonProperty("manufacturing_lead")
    Double manufacturingLead
    /**
     * 「Attachment Count」
     */
    @JsonProperty("message_attachment_count")
    Integer messageAttachmentCount
    /**
     * 「Message Delivery error」
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
     * 「对公司有利的宽容时间」
     */
    @JsonProperty("overtime_company_threshold")
    Integer overtimeCompanyThreshold
    /**
     * 「对员工有利的宽容时间」
     */
    @JsonProperty("overtime_employee_threshold")
    Integer overtimeEmployeeThreshold
    /**
     * 「上级公司」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「上级公司」
     */
    @JsonProperty("parent_name")
    String parentName
    /**
     * 「上级路径」
     */
    @JsonProperty("parent_path")
    String parentPath
    /**
     * 「合作伙伴」
     */
    @JsonProperty("partner_id")
    String partnerId
    /**
     * 「合作伙伴」
     */
    @JsonProperty("partner_name")
    String partnerName
    /**
     * 「选择支付方式」
     * 字典[选择支付方式]
     */
    @JsonProperty("payment_onboarding_payment_method")
    String paymentOnboardingPaymentMethod
    /**
     * 「批准等级」
     * 字典[批准等级]
     */
    @JsonProperty("po_double_validation")
    String poDoubleValidation
    /**
     * 「再次验证金额」
     */
    @JsonProperty("po_double_validation_amount")
    BigDecimal poDoubleValidationAmount
    /**
     * 「采购提前期」
     */
    @JsonProperty("po_lead")
    Double poLead
    /**
     * 「销售订单修改」
     * 字典[销售订单修改]
     */
    @JsonProperty("po_lock")
    String poLock
    /**
     * 「线上付款」
     * 字典[是否]
     */
    @JsonProperty("portal_confirmation_pay")
    Integer portalConfirmationPay
    /**
     * 「线上签署」
     * 字典[是否]
     */
    @JsonProperty("portal_confirmation_sign")
    Integer portalConfirmationSign
    /**
     * 「预付百分比」
     */
    @JsonProperty("prepayment_percent")
    Double prepaymentPercent
    /**
     * 「原色」
     */
    @JsonProperty("primary_color")
    String primaryColor
    /**
     * 「采购锁定日期」
     */
    @JsonProperty("purchase_lock_date")
    Timestamp purchaseLockDate
    /**
     * 「Display QR-code on invoices」
     * 字典[是否]
     */
    @JsonProperty("qr_code")
    Integer qrCode
    /**
     * 「快速编码」
     * 字典[快速编码]
     */
    @JsonProperty("quick_edit_mode")
    String quickEditMode
    /**
     * 「默认报价有效期」
     */
    @JsonProperty("quotation_validity_days")
    Integer quotationValidityDays
    /**
     * 「报告页脚」
     */
    @JsonProperty("report_footer")
    String reportFooter
    /**
     * 「公司标语」
     */
    @JsonProperty("report_header")
    String reportHeader
    /**
     * 「默认工作时间」
     */
    @JsonProperty("resource_calendar_id")
    String resourceCalendarId
    /**
     * 「销售锁定日期」
     */
    @JsonProperty("sale_lock_date")
    Timestamp saleLockDate
    /**
     * 「销售入门选择的付款方式」
     * 字典[销售入门选择的付款方式]
     */
    @JsonProperty("sale_onboarding_payment_method")
    String saleOnboardingPaymentMethod
    /**
     * 「次要颜色」
     */
    @JsonProperty("secondary_color")
    String secondaryColor
    /**
     * 「销售安全天数」
     */
    @JsonProperty("security_lead")
    Double securityLead
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「实体邮寄颜色」
     * 字典[是否]
     */
    @JsonProperty("snailmail_color")
    Integer snailmailColor
    /**
     * 「添加一个封面页」
     * 字典[是否]
     */
    @JsonProperty("snailmail_cover")
    Integer snailmailCover
    /**
     * 「双面」
     * 字典[是否]
     */
    @JsonProperty("snailmail_duplex")
    Integer snailmailDuplex
    /**
     * 「Facebook 账户」
     */
    @JsonProperty("social_facebook")
    String socialFacebook
    /**
     * 「GitHub账户」
     */
    @JsonProperty("social_github")
    String socialGithub
    /**
     * 「Instagram 账号」
     */
    @JsonProperty("social_instagram")
    String socialInstagram
    /**
     * 「领英账号」
     */
    @JsonProperty("social_linkedin")
    String socialLinkedin
    /**
     * 「TikTok / 抖音账号」
     */
    @JsonProperty("social_tiktok")
    String socialTiktok
    /**
     * 「X 账户」
     */
    @JsonProperty("social_twitter")
    String socialTwitter
    /**
     * 「Youtube账号」
     */
    @JsonProperty("social_youtube")
    String socialYoutube
    /**
     * 「确认拣货邮件模版」
     */
    @JsonProperty("stock_mail_confirmation_template_id")
    String stockMailConfirmationTemplateId
    /**
     * 「邮件确认拣货」
     * 字典[是否]
     */
    @JsonProperty("stock_move_email_validation")
    Integer stockMoveEmailValidation
    /**
     * 「短信息确认」
     * 字典[是否]
     */
    @JsonProperty("stock_move_sms_validation")
    Integer stockMoveSmsValidation
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
     * 「Tax Calculation Rounding Method」
     * 字典[Tax Calculation Rounding Method]
     */
    @JsonProperty("tax_calculation_rounding_method")
    String taxCalculationRoundingMethod
    /**
     * 「采用现金收付」
     * 字典[是否]
     */
    @JsonProperty("tax_exigibility")
    Integer taxExigibility
    /**
     * 「纳税申报表锁定日期」
     */
    @JsonProperty("tax_lock_date")
    Timestamp taxLockDate
    /**
     * 「Terms & Conditions format」
     * 字典[Terms & Conditions format]
     */
    @JsonProperty("terms_type")
    String termsType
    /**
     * 「Prefix of the transfer accounts」
     */
    @JsonProperty("transfer_account_code_prefix")
    String transferAccountCodePrefix
    /**
     * 「用户财政年度锁定日期」
     */
    @JsonProperty("user_fiscalyear_lock_date")
    Timestamp userFiscalyearLockDate
    /**
     * 「用户硬性锁定日期」
     */
    @JsonProperty("user_hard_lock_date")
    Timestamp userHardLockDate
    /**
     * 「用户采购锁定日期」
     */
    @JsonProperty("user_purchase_lock_date")
    Timestamp userPurchaseLockDate
    /**
     * 「用户销售锁定日期」
     */
    @JsonProperty("user_sale_lock_date")
    Timestamp userSaleLockDate
    /**
     * 「User Tax Lock Date」
     */
    @JsonProperty("user_tax_lock_date")
    Timestamp userTaxLockDate
    /**
     * 「使用默认徽标」
     * 字典[是否]
     */
    @JsonProperty("uses_default_logo")
    Integer usesDefaultLogo
    /**
     * 「工作许可证到期通知期」
     */
    @JsonProperty("work_permit_expiration_notice_period")
    Integer workPermitExpirationNoticePeriod
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
     * 设置「活动集合」值
     * @param val
     */
    ResCompanyDTO setActivities(List<MailActivityDTO> activities) {
        this.activities = activities
        return this
    }


    /**
     * 设置「附件集合」值
     * @param val
     */
    ResCompanyDTO setAttachments(List<IrAttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「关注者」值
     * @param val
     */
    ResCompanyDTO setFollowers(List<MailFollowersDTO> followers) {
        this.followers = followers
        return this
    }


    /**
     * 设置「缺勤管理」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setAbsenceManagement(Integer absenceManagement) {
        this.absenceManagement = absenceManagement
        return this
    }


    /**
     * 设置「会计所在国家/地区」值
     * @param val
     */
    ResCompanyDTO setAccountFiscalCountryId(String accountFiscalCountryId) {
        this.accountFiscalCountryId = accountFiscalCountryId
        return this
    }


    /**
     * 设置「期初分录」值
     * @param val
     */
    ResCompanyDTO setAccountOpeningDate(Timestamp accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate
        return this
    }


    /**
     * 设置「Default Sales Price Include」值
     * 字典[Default Sales Price Include]
     * @param val
     */
    ResCompanyDTO setAccountPriceInclude(String accountPriceInclude) {
        this.accountPriceInclude = accountPriceInclude
        return this
    }


    /**
     * 设置「Storno会计应用程序」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setAccountStorno(Integer accountStorno) {
        this.accountStorno = accountStorno
        return this
    }


    /**
     * 设置「销售信用额度」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setAccountUseCreditLimit(Integer accountUseCreditLimit) {
        this.accountUseCreditLimit = accountUseCreditLimit
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「下一活动截止日期」值
     * @param val
     */
    ResCompanyDTO setActivityDateDeadline(Timestamp activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline
        return this
    }


    /**
     * 设置「活动异常标示」值
     * 字典[活动异常标示]
     * @param val
     */
    ResCompanyDTO setActivityExceptionDecoration(String activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    ResCompanyDTO setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon
        return this
    }


    /**
     * 设置「活动状态」值
     * 字典[活动状态]
     * @param val
     */
    ResCompanyDTO setActivityState(String activityState) {
        this.activityState = activityState
        return this
    }


    /**
     * 设置「电子邮件域名」值
     * @param val
     */
    ResCompanyDTO setAliasDomainId(String aliasDomainId) {
        this.aliasDomainId = aliasDomainId
        return this
    }


    /**
     * 设置「使用盎格鲁撒克逊会计」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setAngloSaxonAccounting(Integer angloSaxonAccounting) {
        this.angloSaxonAccounting = angloSaxonAccounting
        return this
    }


    /**
     * 设置「日期」值
     * @param val
     */
    ResCompanyDTO setAnnualInventoryDay(Integer annualInventoryDay) {
        this.annualInventoryDay = annualInventoryDay
        return this
    }


    /**
     * 设置「年度库存月」值
     * 字典[年度库存月]
     * @param val
     */
    ResCompanyDTO setAnnualInventoryMonth(String annualInventoryMonth) {
        this.annualInventoryMonth = annualInventoryMonth
        return this
    }


    /**
     * 设置「条码来源」值
     * 字典[条码来源]
     * @param val
     */
    ResCompanyDTO setAttendanceBarcodeSource(String attendanceBarcodeSource) {
        this.attendanceBarcodeSource = attendanceBarcodeSource
        return this
    }


    /**
     * 设置「来自 Systray 的出席情况」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setAttendanceFromSystray(Integer attendanceFromSystray) {
        this.attendanceFromSystray = attendanceFromSystray
        return this
    }


    /**
     * 设置「自助考勤终端延迟」值
     * @param val
     */
    ResCompanyDTO setAttendanceKioskDelay(Integer attendanceKioskDelay) {
        this.attendanceKioskDelay = attendanceKioskDelay
        return this
    }


    /**
     * 设置「自助考勤终端密钥」值
     * @param val
     */
    ResCompanyDTO setAttendanceKioskKey(String attendanceKioskKey) {
        this.attendanceKioskKey = attendanceKioskKey
        return this
    }


    /**
     * 设置「考勤模式」值
     * 字典[考勤模式]
     * @param val
     */
    ResCompanyDTO setAttendanceKioskMode(String attendanceKioskMode) {
        this.attendanceKioskMode = attendanceKioskMode
        return this
    }


    /**
     * 设置「自助考勤终端网址」值
     * @param val
     */
    ResCompanyDTO setAttendanceKioskUrl(String attendanceKioskUrl) {
        this.attendanceKioskUrl = attendanceKioskUrl
        return this
    }


    /**
     * 设置「员工PIN」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setAttendanceKioskUsePin(Integer attendanceKioskUsePin) {
        this.attendanceKioskUsePin = attendanceKioskUsePin
        return this
    }


    /**
     * 设置「额外工时验证」值
     * 字典[额外工时验证]
     * @param val
     */
    ResCompanyDTO setAttendanceOvertimeValidation(String attendanceOvertimeValidation) {
        this.attendanceOvertimeValidation = attendanceOvertimeValidation
        return this
    }


    /**
     * 设置「自动签退」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setAutoCheckOut(Integer autoCheckOut) {
        this.autoCheckOut = autoCheckOut
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    ResCompanyDTO setAutoCheckOutTolerance(Double autoCheckOutTolerance) {
        this.autoCheckOutTolerance = autoCheckOutTolerance
        return this
    }


    /**
     * 设置「自动验证账单」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setAutopostBills(Integer autopostBills) {
        this.autopostBills = autopostBills
        return this
    }


    /**
     * 设置「Prefix of the bank accounts」值
     * @param val
     */
    ResCompanyDTO setBankAccountCodePrefix(String bankAccountCodePrefix) {
        this.bankAccountCodePrefix = bankAccountCodePrefix
        return this
    }


    /**
     * 设置「Batch Payment Sequence」值
     * @param val
     */
    ResCompanyDTO setBatchPaymentSequenceId(String batchPaymentSequenceId) {
        this.batchPaymentSequenceId = batchPaymentSequenceId
        return this
    }


    /**
     * 设置「退件电子邮件」值
     * @param val
     */
    ResCompanyDTO setBounceEmail(String bounceEmail) {
        this.bounceEmail = bounceEmail
        return this
    }


    /**
     * 设置「退回」值
     * @param val
     */
    ResCompanyDTO setBounceFormatted(String bounceFormatted) {
        this.bounceFormatted = bounceFormatted
        return this
    }


    /**
     * 设置「候选人属性」值
     * @param val
     */
    ResCompanyDTO setCandidatePropertiesDefinition(String candidatePropertiesDefinition) {
        this.candidatePropertiesDefinition = candidatePropertiesDefinition
        return this
    }


    /**
     * 设置「Prefix of the cash accounts」值
     * @param val
     */
    ResCompanyDTO setCashAccountCodePrefix(String cashAccountCodePrefix) {
        this.cashAccountCodePrefix = cashAccountCodePrefix
        return this
    }


    /**
     * 设置「预设邮件」值
     * @param val
     */
    ResCompanyDTO setCatchallEmail(String catchallEmail) {
        this.catchallEmail = catchallEmail
        return this
    }


    /**
     * 设置「预设」值
     * @param val
     */
    ResCompanyDTO setCatchallFormatted(String catchallFormatted) {
        this.catchallFormatted = catchallFormatted
        return this
    }


    /**
     * 设置「审计跟踪」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setCheckAccountAuditTrail(Integer checkAccountAuditTrail) {
        this.checkAccountAuditTrail = checkAccountAuditTrail
        return this
    }


    /**
     * 设置「城市」值
     * @param val
     */
    ResCompanyDTO setCity(String city) {
        this.city = city
        return this
    }


    /**
     * 设置「颜色」值
     * @param val
     */
    ResCompanyDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「公司详情」值
     * @param val
     */
    ResCompanyDTO setCompanyDetails(String companyDetails) {
        this.companyDetails = companyDetails
        return this
    }


    /**
     * 设置「公司注册处占位符」值
     * @param val
     */
    ResCompanyDTO setCompanyRegistryPlaceholder(String companyRegistryPlaceholder) {
        this.companyRegistryPlaceholder = companyRegistryPlaceholder
        return this
    }


    /**
     * 设置「公司增值税占位符」值
     * @param val
     */
    ResCompanyDTO setCompanyVatPlaceholder(String companyVatPlaceholder) {
        this.companyVatPlaceholder = companyVatPlaceholder
        return this
    }


    /**
     * 设置「合同到期通知期」值
     * @param val
     */
    ResCompanyDTO setContractExpirationNoticePeriod(Integer contractExpirationNoticePeriod) {
        this.contractExpirationNoticePeriod = contractExpirationNoticePeriod
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResCompanyDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    ResCompanyDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「币别」值
     * @param val
     */
    ResCompanyDTO setCurrencyId(String currencyId) {
        this.currencyId = currencyId
        return this
    }


    /**
     * 设置「币别」值
     * @param val
     */
    ResCompanyDTO setCurrencyName(String currencyName) {
        this.currencyName = currencyName
        return this
    }


    /**
     * 设置「采购前置天数」值
     * @param val
     */
    ResCompanyDTO setDaysToPurchase(Double daysToPurchase) {
        this.daysToPurchase = daysToPurchase
        return this
    }


    /**
     * 设置「大写发票总额」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setDisplayInvoiceAmountTotalWords(Integer displayInvoiceAmountTotalWords) {
        this.displayInvoiceAmountTotalWords = displayInvoiceAmountTotalWords
        return this
    }


    /**
     * 设置「税款以公司币别表示」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setDisplayInvoiceTaxCompanyCurrency(Integer displayInvoiceTaxCompanyCurrency) {
        this.displayInvoiceTaxCompanyCurrency = displayInvoiceTaxCompanyCurrency
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResCompanyDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「格式化的邮件」值
     * @param val
     */
    ResCompanyDTO setEmailFormatted(String emailFormatted) {
        this.emailFormatted = emailFormatted
        return this
    }


    /**
     * 设置「电子邮件标题颜色」值
     * @param val
     */
    ResCompanyDTO setEmailPrimaryColor(String emailPrimaryColor) {
        this.emailPrimaryColor = emailPrimaryColor
        return this
    }


    /**
     * 设置「电子邮件按钮颜色」值
     * @param val
     */
    ResCompanyDTO setEmailSecondaryColor(String emailSecondaryColor) {
        this.emailSecondaryColor = emailSecondaryColor
        return this
    }


    /**
     * 设置「员工属性」值
     * @param val
     */
    ResCompanyDTO setEmployeePropertiesDefinition(String employeePropertiesDefinition) {
        this.employeePropertiesDefinition = employeePropertiesDefinition
        return this
    }


    /**
     * 设置「Expects a Chart of Accounts」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setExpectsChartOfAccounts(Integer expectsChartOfAccounts) {
        this.expectsChartOfAccounts = expectsChartOfAccounts
        return this
    }


    /**
     * 设置「会计年度最后一天」值
     * @param val
     */
    ResCompanyDTO setFiscalyearLastDay(Integer fiscalyearLastDay) {
        this.fiscalyearLastDay = fiscalyearLastDay
        return this
    }


    /**
     * 设置「会计年度最后一个月」值
     * 字典[会计年度最后一个月]
     * @param val
     */
    ResCompanyDTO setFiscalyearLastMonth(String fiscalyearLastMonth) {
        this.fiscalyearLastMonth = fiscalyearLastMonth
        return this
    }


    /**
     * 设置「全球锁定日期」值
     * @param val
     */
    ResCompanyDTO setFiscalyearLockDate(Timestamp fiscalyearLockDate) {
        this.fiscalyearLockDate = fiscalyearLockDate
        return this
    }


    /**
     * 设置「字体」值
     * 字典[字体]
     * @param val
     */
    ResCompanyDTO setFont(String font) {
        this.font = font
        return this
    }


    /**
     * 设置「硬锁定日期」值
     * @param val
     */
    ResCompanyDTO setHardLockDate(Timestamp hardLockDate) {
        this.hardLockDate = hardLockDate
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「已收到库存警告短信息」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setHasReceivedWarningStockSms(Integer hasReceivedWarningStockSms) {
        this.hasReceivedWarningStockSms = hasReceivedWarningStockSms
        return this
    }


    /**
     * 设置「显示额外时间」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setHrAttendanceDisplayOvertime(Integer hrAttendanceDisplayOvertime) {
        this.hrAttendanceDisplayOvertime = hrAttendanceDisplayOvertime
        return this
    }


    /**
     * 设置「根据出勤率」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setHrPresenceControlAttendance(Integer hrPresenceControlAttendance) {
        this.hrPresenceControlAttendance = hrPresenceControlAttendance
        return this
    }


    /**
     * 设置「根据发送的电子邮件数量」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setHrPresenceControlEmail(Integer hrPresenceControlEmail) {
        this.hrPresenceControlEmail = hrPresenceControlEmail
        return this
    }


    /**
     * 设置「# 要发送的电子邮件」值
     * @param val
     */
    ResCompanyDTO setHrPresenceControlEmailAmount(Integer hrPresenceControlEmailAmount) {
        this.hrPresenceControlEmailAmount = hrPresenceControlEmailAmount
        return this
    }


    /**
     * 设置「基于IP地址」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setHrPresenceControlIp(Integer hrPresenceControlIp) {
        this.hrPresenceControlIp = hrPresenceControlIp
        return this
    }


    /**
     * 设置「有效的IP地址」值
     * @param val
     */
    ResCompanyDTO setHrPresenceControlIpList(String hrPresenceControlIpList) {
        this.hrPresenceControlIpList = hrPresenceControlIpList
        return this
    }


    /**
     * 设置「基于系统中的用户状态」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setHrPresenceControlLogin(Integer hrPresenceControlLogin) {
        this.hrPresenceControlLogin = hrPresenceControlLogin
        return this
    }


    /**
     * 设置「丰富完成」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setIapEnrichAutoDone(Integer iapEnrichAutoDone) {
        this.iapEnrichAutoDone = iapEnrichAutoDone
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResCompanyDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「Default Terms and Conditions」值
     * @param val
     */
    ResCompanyDTO setInvoiceTerms(String invoiceTerms) {
        this.invoiceTerms = invoiceTerms
        return this
    }


    /**
     * 设置「Default Terms and Conditions as a Web page」值
     * @param val
     */
    ResCompanyDTO setInvoiceTermsHtml(String invoiceTermsHtml) {
        this.invoiceTermsHtml = invoiceTermsHtml
        return this
    }


    /**
     * 设置「公司详细信息是否为空」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setIsCompanyDetailsEmpty(Integer isCompanyDetailsEmpty) {
        this.isCompanyDetailsEmpty = isCompanyDetailsEmpty
        return this
    }


    /**
     * 设置「职位属性」值
     * @param val
     */
    ResCompanyDTO setJobPropertiesDefinition(String jobPropertiesDefinition) {
        this.jobPropertiesDefinition = jobPropertiesDefinition
        return this
    }


    /**
     * 设置「布局背景」值
     * 字典[布局背景]
     * @param val
     */
    ResCompanyDTO setLayoutBackground(String layoutBackground) {
        this.layoutBackground = layoutBackground
        return this
    }


    /**
     * 设置「制造提前期」值
     * @param val
     */
    ResCompanyDTO setManufacturingLead(Double manufacturingLead) {
        this.manufacturingLead = manufacturingLead
        return this
    }


    /**
     * 设置「Attachment Count」值
     * @param val
     */
    ResCompanyDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「Message Delivery error」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    ResCompanyDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「待处理」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    ResCompanyDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「我的活动截止时间」值
     * @param val
     */
    ResCompanyDTO setMyActivityDateDeadline(Timestamp myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResCompanyDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「对公司有利的宽容时间」值
     * @param val
     */
    ResCompanyDTO setOvertimeCompanyThreshold(Integer overtimeCompanyThreshold) {
        this.overtimeCompanyThreshold = overtimeCompanyThreshold
        return this
    }


    /**
     * 设置「对员工有利的宽容时间」值
     * @param val
     */
    ResCompanyDTO setOvertimeEmployeeThreshold(Integer overtimeEmployeeThreshold) {
        this.overtimeEmployeeThreshold = overtimeEmployeeThreshold
        return this
    }


    /**
     * 设置「上级公司」值
     * @param val
     */
    ResCompanyDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「上级公司」值
     * @param val
     */
    ResCompanyDTO setParentName(String parentName) {
        this.parentName = parentName
        return this
    }


    /**
     * 设置「上级路径」值
     * @param val
     */
    ResCompanyDTO setParentPath(String parentPath) {
        this.parentPath = parentPath
        return this
    }


    /**
     * 设置「合作伙伴」值
     * @param val
     */
    ResCompanyDTO setPartnerId(String partnerId) {
        this.partnerId = partnerId
        return this
    }


    /**
     * 设置「合作伙伴」值
     * @param val
     */
    ResCompanyDTO setPartnerName(String partnerName) {
        this.partnerName = partnerName
        return this
    }


    /**
     * 设置「选择支付方式」值
     * 字典[选择支付方式]
     * @param val
     */
    ResCompanyDTO setPaymentOnboardingPaymentMethod(String paymentOnboardingPaymentMethod) {
        this.paymentOnboardingPaymentMethod = paymentOnboardingPaymentMethod
        return this
    }


    /**
     * 设置「批准等级」值
     * 字典[批准等级]
     * @param val
     */
    ResCompanyDTO setPoDoubleValidation(String poDoubleValidation) {
        this.poDoubleValidation = poDoubleValidation
        return this
    }


    /**
     * 设置「再次验证金额」值
     * @param val
     */
    ResCompanyDTO setPoDoubleValidationAmount(BigDecimal poDoubleValidationAmount) {
        this.poDoubleValidationAmount = poDoubleValidationAmount
        return this
    }


    /**
     * 设置「采购提前期」值
     * @param val
     */
    ResCompanyDTO setPoLead(Double poLead) {
        this.poLead = poLead
        return this
    }


    /**
     * 设置「销售订单修改」值
     * 字典[销售订单修改]
     * @param val
     */
    ResCompanyDTO setPoLock(String poLock) {
        this.poLock = poLock
        return this
    }


    /**
     * 设置「线上付款」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setPortalConfirmationPay(Integer portalConfirmationPay) {
        this.portalConfirmationPay = portalConfirmationPay
        return this
    }


    /**
     * 设置「线上签署」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setPortalConfirmationSign(Integer portalConfirmationSign) {
        this.portalConfirmationSign = portalConfirmationSign
        return this
    }


    /**
     * 设置「预付百分比」值
     * @param val
     */
    ResCompanyDTO setPrepaymentPercent(Double prepaymentPercent) {
        this.prepaymentPercent = prepaymentPercent
        return this
    }


    /**
     * 设置「原色」值
     * @param val
     */
    ResCompanyDTO setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor
        return this
    }


    /**
     * 设置「采购锁定日期」值
     * @param val
     */
    ResCompanyDTO setPurchaseLockDate(Timestamp purchaseLockDate) {
        this.purchaseLockDate = purchaseLockDate
        return this
    }


    /**
     * 设置「Display QR-code on invoices」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setQrCode(Integer qrCode) {
        this.qrCode = qrCode
        return this
    }


    /**
     * 设置「快速编码」值
     * 字典[快速编码]
     * @param val
     */
    ResCompanyDTO setQuickEditMode(String quickEditMode) {
        this.quickEditMode = quickEditMode
        return this
    }


    /**
     * 设置「默认报价有效期」值
     * @param val
     */
    ResCompanyDTO setQuotationValidityDays(Integer quotationValidityDays) {
        this.quotationValidityDays = quotationValidityDays
        return this
    }


    /**
     * 设置「报告页脚」值
     * @param val
     */
    ResCompanyDTO setReportFooter(String reportFooter) {
        this.reportFooter = reportFooter
        return this
    }


    /**
     * 设置「公司标语」值
     * @param val
     */
    ResCompanyDTO setReportHeader(String reportHeader) {
        this.reportHeader = reportHeader
        return this
    }


    /**
     * 设置「默认工作时间」值
     * @param val
     */
    ResCompanyDTO setResourceCalendarId(String resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId
        return this
    }


    /**
     * 设置「销售锁定日期」值
     * @param val
     */
    ResCompanyDTO setSaleLockDate(Timestamp saleLockDate) {
        this.saleLockDate = saleLockDate
        return this
    }


    /**
     * 设置「销售入门选择的付款方式」值
     * 字典[销售入门选择的付款方式]
     * @param val
     */
    ResCompanyDTO setSaleOnboardingPaymentMethod(String saleOnboardingPaymentMethod) {
        this.saleOnboardingPaymentMethod = saleOnboardingPaymentMethod
        return this
    }


    /**
     * 设置「次要颜色」值
     * @param val
     */
    ResCompanyDTO setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor
        return this
    }


    /**
     * 设置「销售安全天数」值
     * @param val
     */
    ResCompanyDTO setSecurityLead(Double securityLead) {
        this.securityLead = securityLead
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    ResCompanyDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「实体邮寄颜色」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setSnailmailColor(Integer snailmailColor) {
        this.snailmailColor = snailmailColor
        return this
    }


    /**
     * 设置「添加一个封面页」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setSnailmailCover(Integer snailmailCover) {
        this.snailmailCover = snailmailCover
        return this
    }


    /**
     * 设置「双面」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setSnailmailDuplex(Integer snailmailDuplex) {
        this.snailmailDuplex = snailmailDuplex
        return this
    }


    /**
     * 设置「Facebook 账户」值
     * @param val
     */
    ResCompanyDTO setSocialFacebook(String socialFacebook) {
        this.socialFacebook = socialFacebook
        return this
    }


    /**
     * 设置「GitHub账户」值
     * @param val
     */
    ResCompanyDTO setSocialGithub(String socialGithub) {
        this.socialGithub = socialGithub
        return this
    }


    /**
     * 设置「Instagram 账号」值
     * @param val
     */
    ResCompanyDTO setSocialInstagram(String socialInstagram) {
        this.socialInstagram = socialInstagram
        return this
    }


    /**
     * 设置「领英账号」值
     * @param val
     */
    ResCompanyDTO setSocialLinkedin(String socialLinkedin) {
        this.socialLinkedin = socialLinkedin
        return this
    }


    /**
     * 设置「TikTok / 抖音账号」值
     * @param val
     */
    ResCompanyDTO setSocialTiktok(String socialTiktok) {
        this.socialTiktok = socialTiktok
        return this
    }


    /**
     * 设置「X 账户」值
     * @param val
     */
    ResCompanyDTO setSocialTwitter(String socialTwitter) {
        this.socialTwitter = socialTwitter
        return this
    }


    /**
     * 设置「Youtube账号」值
     * @param val
     */
    ResCompanyDTO setSocialYoutube(String socialYoutube) {
        this.socialYoutube = socialYoutube
        return this
    }


    /**
     * 设置「确认拣货邮件模版」值
     * @param val
     */
    ResCompanyDTO setStockMailConfirmationTemplateId(String stockMailConfirmationTemplateId) {
        this.stockMailConfirmationTemplateId = stockMailConfirmationTemplateId
        return this
    }


    /**
     * 设置「邮件确认拣货」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setStockMoveEmailValidation(Integer stockMoveEmailValidation) {
        this.stockMoveEmailValidation = stockMoveEmailValidation
        return this
    }


    /**
     * 设置「短信息确认」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setStockMoveSmsValidation(Integer stockMoveSmsValidation) {
        this.stockMoveSmsValidation = stockMoveSmsValidation
        return this
    }


    /**
     * 设置「街道」值
     * @param val
     */
    ResCompanyDTO setStreet(String street) {
        this.street = street
        return this
    }


    /**
     * 设置「详细地址」值
     * @param val
     */
    ResCompanyDTO setStreet2(String street2) {
        this.street2 = street2
        return this
    }


    /**
     * 设置「Tax Calculation Rounding Method」值
     * 字典[Tax Calculation Rounding Method]
     * @param val
     */
    ResCompanyDTO setTaxCalculationRoundingMethod(String taxCalculationRoundingMethod) {
        this.taxCalculationRoundingMethod = taxCalculationRoundingMethod
        return this
    }


    /**
     * 设置「采用现金收付」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setTaxExigibility(Integer taxExigibility) {
        this.taxExigibility = taxExigibility
        return this
    }


    /**
     * 设置「纳税申报表锁定日期」值
     * @param val
     */
    ResCompanyDTO setTaxLockDate(Timestamp taxLockDate) {
        this.taxLockDate = taxLockDate
        return this
    }


    /**
     * 设置「Terms & Conditions format」值
     * 字典[Terms & Conditions format]
     * @param val
     */
    ResCompanyDTO setTermsType(String termsType) {
        this.termsType = termsType
        return this
    }


    /**
     * 设置「Prefix of the transfer accounts」值
     * @param val
     */
    ResCompanyDTO setTransferAccountCodePrefix(String transferAccountCodePrefix) {
        this.transferAccountCodePrefix = transferAccountCodePrefix
        return this
    }


    /**
     * 设置「用户财政年度锁定日期」值
     * @param val
     */
    ResCompanyDTO setUserFiscalyearLockDate(Timestamp userFiscalyearLockDate) {
        this.userFiscalyearLockDate = userFiscalyearLockDate
        return this
    }


    /**
     * 设置「用户硬性锁定日期」值
     * @param val
     */
    ResCompanyDTO setUserHardLockDate(Timestamp userHardLockDate) {
        this.userHardLockDate = userHardLockDate
        return this
    }


    /**
     * 设置「用户采购锁定日期」值
     * @param val
     */
    ResCompanyDTO setUserPurchaseLockDate(Timestamp userPurchaseLockDate) {
        this.userPurchaseLockDate = userPurchaseLockDate
        return this
    }


    /**
     * 设置「用户销售锁定日期」值
     * @param val
     */
    ResCompanyDTO setUserSaleLockDate(Timestamp userSaleLockDate) {
        this.userSaleLockDate = userSaleLockDate
        return this
    }


    /**
     * 设置「User Tax Lock Date」值
     * @param val
     */
    ResCompanyDTO setUserTaxLockDate(Timestamp userTaxLockDate) {
        this.userTaxLockDate = userTaxLockDate
        return this
    }


    /**
     * 设置「使用默认徽标」值
     * 字典[是否]
     * @param val
     */
    ResCompanyDTO setUsesDefaultLogo(Integer usesDefaultLogo) {
        this.usesDefaultLogo = usesDefaultLogo
        return this
    }


    /**
     * 设置「工作许可证到期通知期」值
     * @param val
     */
    ResCompanyDTO setWorkPermitExpirationNoticePeriod(Integer workPermitExpirationNoticePeriod) {
        this.workPermitExpirationNoticePeriod = workPermitExpirationNoticePeriod
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResCompanyDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    ResCompanyDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「邮编」值
     * @param val
     */
    ResCompanyDTO setZip(String zip) {
        this.zip = zip
        return this
    }

}
