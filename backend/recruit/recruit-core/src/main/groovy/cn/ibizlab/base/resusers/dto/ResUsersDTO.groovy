package cn.ibizlab.base.resusers.dto

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
class ResUsersDTO extends GroovyDTO<ResUsersDTO> {

    /**
     * 「姓名」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「公司标识」
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
     * 「标识」
     */
    @JsonProperty("id")
    String id
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
     * 「Odoobot 挂了」
     * 字典[是否]
     */
    @JsonProperty("odoobot_failed")
    Integer odoobotFailed
    /**
     * 「共享用户」
     * 字典[是否]
     */
    @JsonProperty("share")
    Integer share
    /**
     * 「电子邮件签名」
     */
    @JsonProperty("signature")
    String signature
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
     * 「新手入门」
     * 字典[是否]
     */
    @JsonProperty("tour_enabled")
    Integer tourEnabled
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
     * 设置「姓名」值
     * @param val
     */
    ResUsersDTO setDisplayName(String displayName) {
        this.displayName = displayName
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
     * 设置「公司标识」值
     * @param val
     */
    ResUsersDTO setCompanyId(String companyId) {
        this.companyId = companyId
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
     * 设置「建立人」值
     * @param val
     */
    ResUsersDTO setCreateUid(String createUid) {
        this.createUid = createUid
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
     * 设置「Odoobot 挂了」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setOdoobotFailed(Integer odoobotFailed) {
        this.odoobotFailed = odoobotFailed
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
     * 设置「电子邮件签名」值
     * @param val
     */
    ResUsersDTO setSignature(String signature) {
        this.signature = signature
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
     * 设置「新手入门」值
     * 字典[是否]
     * @param val
     */
    ResUsersDTO setTourEnabled(Integer tourEnabled) {
        this.tourEnabled = tourEnabled
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

}
