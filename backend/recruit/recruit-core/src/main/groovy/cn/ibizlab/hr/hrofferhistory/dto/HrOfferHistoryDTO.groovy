package cn.ibizlab.hr.hrofferhistory.dto

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
class HrOfferHistoryDTO extends GroovyDTO<HrOfferHistoryDTO> {

    /**
     * 「候选人姓名」
     */
    @JsonProperty("candidate_display_name")
    String candidateDisplayName
    /**
     * 「发送时间」
     */
    @JsonProperty("send_time")
    Timestamp sendTime
    /**
     * 「反馈状态」
     * 字典[offer发送反馈状态]
     */
    @JsonProperty("feedback_status")
    String feedbackStatus
    /**
     * 「发送方式」
     */
    @JsonProperty("send_type")
    String sendType
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
     * 「Offer标识」
     */
    @JsonProperty("hr_offer_id")
    String hrOfferId
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
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
     * 设置「候选人姓名」值
     * @param val
     */
    HrOfferHistoryDTO setCandidateDisplayName(String candidateDisplayName) {
        this.candidateDisplayName = candidateDisplayName
        return this
    }


    /**
     * 设置「发送时间」值
     * @param val
     */
    HrOfferHistoryDTO setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime
        return this
    }


    /**
     * 设置「反馈状态」值
     * 字典[offer发送反馈状态]
     * @param val
     */
    HrOfferHistoryDTO setFeedbackStatus(String feedbackStatus) {
        this.feedbackStatus = feedbackStatus
        return this
    }


    /**
     * 设置「发送方式」值
     * @param val
     */
    HrOfferHistoryDTO setSendType(String sendType) {
        this.sendType = sendType
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrOfferHistoryDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrOfferHistoryDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「Offer标识」值
     * @param val
     */
    HrOfferHistoryDTO setHrOfferId(String hrOfferId) {
        this.hrOfferId = hrOfferId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrOfferHistoryDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrOfferHistoryDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrOfferHistoryDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrOfferHistoryDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
