package cn.ibizlab.hr.hrofferimprec.dto

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
class HrOfferImpRecDTO extends GroovyDTO<HrOfferImpRecDTO> {

    /**
     * 「姓名」
     */
    @JsonProperty("name")
    String name
    /**
     * 「第三方系统」
     */
    @JsonProperty("system")
    String system
    /**
     * 「导入时间」
     */
    @JsonProperty("imp_date")
    String impDate
    /**
     * 「操作人」
     */
    @JsonProperty("operator")
    String operator
    /**
     * 「导入阶段」
     */
    @JsonProperty("imp_stage")
    String impStage
    /**
     * 「导入状态」
     */
    @JsonProperty("imp_status")
    String impStatus
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
     * 「offer标识」
     */
    @JsonProperty("hr_offer_id")
    String hrOfferId
    /**
     * 「导入记录标识」
     */
    @JsonProperty("hr_offer_imp_rec_id")
    String hrOfferImpRecId
    /**
     * 「导入记录名称」
     */
    @JsonProperty("hr_offer_imp_rec_name")
    String hrOfferImpRecName
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
    HrOfferImpRecDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「第三方系统」值
     * @param val
     */
    HrOfferImpRecDTO setSystem(String system) {
        this.system = system
        return this
    }


    /**
     * 设置「导入时间」值
     * @param val
     */
    HrOfferImpRecDTO setImpDate(String impDate) {
        this.impDate = impDate
        return this
    }


    /**
     * 设置「操作人」值
     * @param val
     */
    HrOfferImpRecDTO setOperator(String operator) {
        this.operator = operator
        return this
    }


    /**
     * 设置「导入阶段」值
     * @param val
     */
    HrOfferImpRecDTO setImpStage(String impStage) {
        this.impStage = impStage
        return this
    }


    /**
     * 设置「导入状态」值
     * @param val
     */
    HrOfferImpRecDTO setImpStatus(String impStatus) {
        this.impStatus = impStatus
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrOfferImpRecDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrOfferImpRecDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「offer标识」值
     * @param val
     */
    HrOfferImpRecDTO setHrOfferId(String hrOfferId) {
        this.hrOfferId = hrOfferId
        return this
    }


    /**
     * 设置「导入记录标识」值
     * @param val
     */
    HrOfferImpRecDTO setHrOfferImpRecId(String hrOfferImpRecId) {
        this.hrOfferImpRecId = hrOfferImpRecId
        return this
    }


    /**
     * 设置「导入记录名称」值
     * @param val
     */
    HrOfferImpRecDTO setHrOfferImpRecName(String hrOfferImpRecName) {
        this.hrOfferImpRecName = hrOfferImpRecName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrOfferImpRecDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrOfferImpRecDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
