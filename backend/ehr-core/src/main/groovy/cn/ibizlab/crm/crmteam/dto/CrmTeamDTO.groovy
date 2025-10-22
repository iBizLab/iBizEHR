package cn.ibizlab.crm.crmteam.dto

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
class CrmTeamDTO extends GroovyDTO<CrmTeamDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「电子邮箱别名」
     */
    @JsonProperty("alias_email")
    String aliasEmail
    /**
     * 「别名」
     */
    @JsonProperty("alias_id")
    String aliasId
    /**
     * 「自动指派」
     * 字典[是否]
     */
    @JsonProperty("assignment_auto_enabled")
    Integer assignmentAutoEnabled
    /**
     * 「指派域名」
     */
    @JsonProperty("assignment_domain")
    String assignmentDomain
    /**
     * 「线索指派」
     * 字典[是否]
     */
    @JsonProperty("assignment_enabled")
    Integer assignmentEnabled
    /**
     * 「线索平均能力」
     */
    @JsonProperty("assignment_max")
    Integer assignmentMax
    /**
     * 「跳过自动分配」
     * 字典[是否]
     */
    @JsonProperty("assignment_optout")
    Integer assignmentOptout
    /**
     * 「颜色指标」
     */
    @JsonProperty("color")
    Integer color
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
     * 「仪表板按钮」
     */
    @JsonProperty("dashboard_button_name")
    String dashboardButtonName
    /**
     * 「数据仪表图」
     */
    @JsonProperty("dashboard_graph_data")
    String dashboardGraphData
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
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
     * 「本月已开具发票」
     */
    @JsonProperty("invoiced")
    Double invoiced
    /**
     * 「开票目标」
     */
    @JsonProperty("invoiced_target")
    Double invoicedTarget
    /**
     * 「显示仪表」
     * 字典[是否]
     */
    @JsonProperty("is_favorite")
    Integer isFavorite
    /**
     * 「允许多个会员资格」
     * 字典[是否]
     */
    @JsonProperty("is_membership_multi")
    Integer isMembershipMulti
    /**
     * 「本月指派的线索/商机」
     */
    @JsonProperty("lead_all_assigned_month_count")
    Integer leadAllAssignedMonthCount
    /**
     * 「超出每月线索分配」
     * 字典[是否]
     */
    @JsonProperty("lead_all_assigned_month_exceeded")
    Integer leadAllAssignedMonthExceeded
    /**
     * 「线索属性」
     */
    @JsonProperty("lead_properties_definition")
    String leadPropertiesDefinition
    /**
     * 「未指派的线索」
     */
    @JsonProperty("lead_unassigned_count")
    Integer leadUnassignedCount
    /**
     * 「会员问题警告」
     */
    @JsonProperty("member_warning")
    String memberWarning
    /**
     * 「附件数量」
     */
    @JsonProperty("message_attachment_count")
    Integer messageAttachmentCount
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
     * 「所需操作」
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
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「商机收入」
     */
    @JsonProperty("opportunities_amount")
    BigDecimal opportunitiesAmount
    /**
     * 「商机」
     */
    @JsonProperty("opportunities_count")
    Integer opportunitiesCount
    /**
     * 「逾期商机收入」
     */
    @JsonProperty("opportunities_overdue_amount")
    BigDecimal opportunitiesOverdueAmount
    /**
     * 「逾期商机」
     */
    @JsonProperty("opportunities_overdue_count")
    Integer opportunitiesOverdueCount
    /**
     * 「待开票报价单金额」
     */
    @JsonProperty("quotations_amount")
    Double quotationsAmount
    /**
     * 「待开票报价单的数量」
     */
    @JsonProperty("quotations_count")
    Integer quotationsCount
    /**
     * 「销售订单号」
     */
    @JsonProperty("sale_order_count")
    Integer saleOrderCount
    /**
     * 「待开票销售的数量」
     */
    @JsonProperty("sales_to_invoice_count")
    Integer salesToInvoiceCount
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「线索」
     * 字典[是否]
     */
    @JsonProperty("use_leads")
    Integer useLeads
    /**
     * 「渠道」
     * 字典[是否]
     */
    @JsonProperty("use_opportunities")
    Integer useOpportunities
    /**
     * 「团队负责人」
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
    CrmTeamDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「电子邮箱别名」值
     * @param val
     */
    CrmTeamDTO setAliasEmail(String aliasEmail) {
        this.aliasEmail = aliasEmail
        return this
    }


    /**
     * 设置「别名」值
     * @param val
     */
    CrmTeamDTO setAliasId(String aliasId) {
        this.aliasId = aliasId
        return this
    }


    /**
     * 设置「自动指派」值
     * 字典[是否]
     * @param val
     */
    CrmTeamDTO setAssignmentAutoEnabled(Integer assignmentAutoEnabled) {
        this.assignmentAutoEnabled = assignmentAutoEnabled
        return this
    }


    /**
     * 设置「指派域名」值
     * @param val
     */
    CrmTeamDTO setAssignmentDomain(String assignmentDomain) {
        this.assignmentDomain = assignmentDomain
        return this
    }


    /**
     * 设置「线索指派」值
     * 字典[是否]
     * @param val
     */
    CrmTeamDTO setAssignmentEnabled(Integer assignmentEnabled) {
        this.assignmentEnabled = assignmentEnabled
        return this
    }


    /**
     * 设置「线索平均能力」值
     * @param val
     */
    CrmTeamDTO setAssignmentMax(Integer assignmentMax) {
        this.assignmentMax = assignmentMax
        return this
    }


    /**
     * 设置「跳过自动分配」值
     * 字典[是否]
     * @param val
     */
    CrmTeamDTO setAssignmentOptout(Integer assignmentOptout) {
        this.assignmentOptout = assignmentOptout
        return this
    }


    /**
     * 设置「颜色指标」值
     * @param val
     */
    CrmTeamDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    CrmTeamDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    CrmTeamDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    CrmTeamDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「仪表板按钮」值
     * @param val
     */
    CrmTeamDTO setDashboardButtonName(String dashboardButtonName) {
        this.dashboardButtonName = dashboardButtonName
        return this
    }


    /**
     * 设置「数据仪表图」值
     * @param val
     */
    CrmTeamDTO setDashboardGraphData(String dashboardGraphData) {
        this.dashboardGraphData = dashboardGraphData
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    CrmTeamDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    CrmTeamDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CrmTeamDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「本月已开具发票」值
     * @param val
     */
    CrmTeamDTO setInvoiced(Double invoiced) {
        this.invoiced = invoiced
        return this
    }


    /**
     * 设置「开票目标」值
     * @param val
     */
    CrmTeamDTO setInvoicedTarget(Double invoicedTarget) {
        this.invoicedTarget = invoicedTarget
        return this
    }


    /**
     * 设置「显示仪表」值
     * 字典[是否]
     * @param val
     */
    CrmTeamDTO setIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite
        return this
    }


    /**
     * 设置「允许多个会员资格」值
     * 字典[是否]
     * @param val
     */
    CrmTeamDTO setIsMembershipMulti(Integer isMembershipMulti) {
        this.isMembershipMulti = isMembershipMulti
        return this
    }


    /**
     * 设置「本月指派的线索/商机」值
     * @param val
     */
    CrmTeamDTO setLeadAllAssignedMonthCount(Integer leadAllAssignedMonthCount) {
        this.leadAllAssignedMonthCount = leadAllAssignedMonthCount
        return this
    }


    /**
     * 设置「超出每月线索分配」值
     * 字典[是否]
     * @param val
     */
    CrmTeamDTO setLeadAllAssignedMonthExceeded(Integer leadAllAssignedMonthExceeded) {
        this.leadAllAssignedMonthExceeded = leadAllAssignedMonthExceeded
        return this
    }


    /**
     * 设置「线索属性」值
     * @param val
     */
    CrmTeamDTO setLeadPropertiesDefinition(String leadPropertiesDefinition) {
        this.leadPropertiesDefinition = leadPropertiesDefinition
        return this
    }


    /**
     * 设置「未指派的线索」值
     * @param val
     */
    CrmTeamDTO setLeadUnassignedCount(Integer leadUnassignedCount) {
        this.leadUnassignedCount = leadUnassignedCount
        return this
    }


    /**
     * 设置「会员问题警告」值
     * @param val
     */
    CrmTeamDTO setMemberWarning(String memberWarning) {
        this.memberWarning = memberWarning
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    CrmTeamDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    CrmTeamDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    CrmTeamDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    CrmTeamDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    CrmTeamDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「所需操作」值
     * 字典[是否]
     * @param val
     */
    CrmTeamDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    CrmTeamDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CrmTeamDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「商机收入」值
     * @param val
     */
    CrmTeamDTO setOpportunitiesAmount(BigDecimal opportunitiesAmount) {
        this.opportunitiesAmount = opportunitiesAmount
        return this
    }


    /**
     * 设置「商机」值
     * @param val
     */
    CrmTeamDTO setOpportunitiesCount(Integer opportunitiesCount) {
        this.opportunitiesCount = opportunitiesCount
        return this
    }


    /**
     * 设置「逾期商机收入」值
     * @param val
     */
    CrmTeamDTO setOpportunitiesOverdueAmount(BigDecimal opportunitiesOverdueAmount) {
        this.opportunitiesOverdueAmount = opportunitiesOverdueAmount
        return this
    }


    /**
     * 设置「逾期商机」值
     * @param val
     */
    CrmTeamDTO setOpportunitiesOverdueCount(Integer opportunitiesOverdueCount) {
        this.opportunitiesOverdueCount = opportunitiesOverdueCount
        return this
    }


    /**
     * 设置「待开票报价单金额」值
     * @param val
     */
    CrmTeamDTO setQuotationsAmount(Double quotationsAmount) {
        this.quotationsAmount = quotationsAmount
        return this
    }


    /**
     * 设置「待开票报价单的数量」值
     * @param val
     */
    CrmTeamDTO setQuotationsCount(Integer quotationsCount) {
        this.quotationsCount = quotationsCount
        return this
    }


    /**
     * 设置「销售订单号」值
     * @param val
     */
    CrmTeamDTO setSaleOrderCount(Integer saleOrderCount) {
        this.saleOrderCount = saleOrderCount
        return this
    }


    /**
     * 设置「待开票销售的数量」值
     * @param val
     */
    CrmTeamDTO setSalesToInvoiceCount(Integer salesToInvoiceCount) {
        this.salesToInvoiceCount = salesToInvoiceCount
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    CrmTeamDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「线索」值
     * 字典[是否]
     * @param val
     */
    CrmTeamDTO setUseLeads(Integer useLeads) {
        this.useLeads = useLeads
        return this
    }


    /**
     * 设置「渠道」值
     * 字典[是否]
     * @param val
     */
    CrmTeamDTO setUseOpportunities(Integer useOpportunities) {
        this.useOpportunities = useOpportunities
        return this
    }


    /**
     * 设置「团队负责人」值
     * @param val
     */
    CrmTeamDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CrmTeamDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    CrmTeamDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
