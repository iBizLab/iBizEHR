package cn.ibizlab.hr.hrcandidatefilter.dto

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
class HrCandidateFilterDTO extends GroovyDTO<HrCandidateFilterDTO> {

    /**
     * 「审核用户」
     */
    @JsonProperty("reviewer_user_ids")
    String reviewerUserIds
    /**
     * 「抄送用户」
     */
    @JsonProperty("carboncopy_user_ids")
    String carboncopyUserIds
    /**
     * 「备注」
     */
    @JsonProperty("memo")
    String memo
    /**
     * 「类型」
     * 字典[推荐简历类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「候选人申请」
     */
    @JsonProperty("applicant_id")
    String applicantId
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
     * 设置「审核用户」值
     * @param val
     */
    HrCandidateFilterDTO setReviewerUserIds(String reviewerUserIds) {
        this.reviewerUserIds = reviewerUserIds
        return this
    }


    /**
     * 设置「抄送用户」值
     * @param val
     */
    HrCandidateFilterDTO setCarboncopyUserIds(String carboncopyUserIds) {
        this.carboncopyUserIds = carboncopyUserIds
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    HrCandidateFilterDTO setMemo(String memo) {
        this.memo = memo
        return this
    }


    /**
     * 设置「类型」值
     * 字典[推荐简历类型]
     * @param val
     */
    HrCandidateFilterDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「候选人申请」值
     * @param val
     */
    HrCandidateFilterDTO setApplicantId(String applicantId) {
        this.applicantId = applicantId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrCandidateFilterDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrCandidateFilterDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrCandidateFilterDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrCandidateFilterDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrCandidateFilterDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrCandidateFilterDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
