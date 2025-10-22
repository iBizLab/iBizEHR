package cn.ibizlab.base.respartnerbank.dto

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
class ResPartnerBankDTO extends GroovyDTO<ResPartnerBankDTO> {

    /**
     * 「null」
     */
    @JsonProperty("aba_routing")
    String abaRouting
    /**
     * 「账户持有人姓名」
     */
    @JsonProperty("acc_holder_name")
    String accHolderName
    /**
     * 「账户编号」
     */
    @JsonProperty("acc_number")
    String accNumber
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
     * 「Activity Exception Decoration」
     * 字典[Activity Exception Decoration]
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
     * 「转出资金」
     * 字典[是否]
     */
    @JsonProperty("allow_out_payment")
    Integer allowOutPayment
    /**
     * 「银行」
     */
    @JsonProperty("bank_id")
    String bankId
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
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
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「有Iban警告消息」
     * 字典[是否]
     */
    @JsonProperty("has_iban_warning")
    Integer hasIbanWarning
    /**
     * 「有消息」
     * 字典[是否]
     */
    @JsonProperty("has_message")
    Integer hasMessage
    /**
     * 「有资金转账警告消息」
     * 字典[是否]
     */
    @JsonProperty("has_money_transfer_warning")
    Integer hasMoneyTransferWarning
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「锁定信任字段」
     * 字典[是否]
     */
    @JsonProperty("lock_trust_fields")
    Integer lockTrustFields
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
     * 「Money Transfer Service」
     */
    @JsonProperty("money_transfer_service")
    String moneyTransferService
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
     * 「账户持有者」
     */
    @JsonProperty("partner_id")
    String partnerId
    /**
     * 「消毒账号」
     */
    @JsonProperty("sanitized_acc_number")
    String sanitizedAccNumber
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「用户有验证银行账户的群组」
     * 字典[是否]
     */
    @JsonProperty("user_has_group_validate_bank_account")
    Integer userHasGroupValidateBankAccount
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
     * 设置「null」值
     * @param val
     */
    ResPartnerBankDTO setAbaRouting(String abaRouting) {
        this.abaRouting = abaRouting
        return this
    }


    /**
     * 设置「账户持有人姓名」值
     * @param val
     */
    ResPartnerBankDTO setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName
        return this
    }


    /**
     * 设置「账户编号」值
     * @param val
     */
    ResPartnerBankDTO setAccNumber(String accNumber) {
        this.accNumber = accNumber
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    ResPartnerBankDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「下一活动截止日期」值
     * @param val
     */
    ResPartnerBankDTO setActivityDateDeadline(Timestamp activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline
        return this
    }


    /**
     * 设置「Activity Exception Decoration」值
     * 字典[Activity Exception Decoration]
     * @param val
     */
    ResPartnerBankDTO setActivityExceptionDecoration(String activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    ResPartnerBankDTO setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon
        return this
    }


    /**
     * 设置「活动状态」值
     * 字典[活动状态]
     * @param val
     */
    ResPartnerBankDTO setActivityState(String activityState) {
        this.activityState = activityState
        return this
    }


    /**
     * 设置「转出资金」值
     * 字典[是否]
     * @param val
     */
    ResPartnerBankDTO setAllowOutPayment(Integer allowOutPayment) {
        this.allowOutPayment = allowOutPayment
        return this
    }


    /**
     * 设置「银行」值
     * @param val
     */
    ResPartnerBankDTO setBankId(String bankId) {
        this.bankId = bankId
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    ResPartnerBankDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResPartnerBankDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    ResPartnerBankDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「币别」值
     * @param val
     */
    ResPartnerBankDTO setCurrencyId(String currencyId) {
        this.currencyId = currencyId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResPartnerBankDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「有Iban警告消息」值
     * 字典[是否]
     * @param val
     */
    ResPartnerBankDTO setHasIbanWarning(Integer hasIbanWarning) {
        this.hasIbanWarning = hasIbanWarning
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    ResPartnerBankDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「有资金转账警告消息」值
     * 字典[是否]
     * @param val
     */
    ResPartnerBankDTO setHasMoneyTransferWarning(Integer hasMoneyTransferWarning) {
        this.hasMoneyTransferWarning = hasMoneyTransferWarning
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResPartnerBankDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「锁定信任字段」值
     * 字典[是否]
     * @param val
     */
    ResPartnerBankDTO setLockTrustFields(Integer lockTrustFields) {
        this.lockTrustFields = lockTrustFields
        return this
    }


    /**
     * 设置「Attachment Count」值
     * @param val
     */
    ResPartnerBankDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「Message Delivery error」值
     * 字典[是否]
     * @param val
     */
    ResPartnerBankDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    ResPartnerBankDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    ResPartnerBankDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    ResPartnerBankDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「待处理」值
     * 字典[是否]
     * @param val
     */
    ResPartnerBankDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    ResPartnerBankDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「Money Transfer Service」值
     * @param val
     */
    ResPartnerBankDTO setMoneyTransferService(String moneyTransferService) {
        this.moneyTransferService = moneyTransferService
        return this
    }


    /**
     * 设置「我的活动截止时间」值
     * @param val
     */
    ResPartnerBankDTO setMyActivityDateDeadline(Timestamp myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResPartnerBankDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「账户持有者」值
     * @param val
     */
    ResPartnerBankDTO setPartnerId(String partnerId) {
        this.partnerId = partnerId
        return this
    }


    /**
     * 设置「消毒账号」值
     * @param val
     */
    ResPartnerBankDTO setSanitizedAccNumber(String sanitizedAccNumber) {
        this.sanitizedAccNumber = sanitizedAccNumber
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    ResPartnerBankDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「用户有验证银行账户的群组」值
     * 字典[是否]
     * @param val
     */
    ResPartnerBankDTO setUserHasGroupValidateBankAccount(Integer userHasGroupValidateBankAccount) {
        this.userHasGroupValidateBankAccount = userHasGroupValidateBankAccount
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResPartnerBankDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    ResPartnerBankDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
