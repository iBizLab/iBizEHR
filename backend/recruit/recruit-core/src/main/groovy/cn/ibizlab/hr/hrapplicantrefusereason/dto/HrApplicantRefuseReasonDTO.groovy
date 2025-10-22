package cn.ibizlab.hr.hrapplicantrefusereason.dto

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
class HrApplicantRefuseReasonDTO extends GroovyDTO<HrApplicantRefuseReasonDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「应聘人」
     */
    @JsonProperty("candidate_id")
    String candidateId
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
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「工作岗位」
     */
    @JsonProperty("job_id")
    String jobId
    /**
     * 「最终阶段」
     */
    @JsonProperty("last_stage_id")
    String lastStageId
    /**
     * 「主要附件」
     */
    @JsonProperty("message_main_attachment_id")
    String messageMainAttachmentId
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「拒绝理由」
     */
    @JsonProperty("refuse_reason_id")
    String refuseReasonId
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「阶段」
     */
    @JsonProperty("stage_id")
    String stageId
    /**
     * 「招聘人员」
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
    HrApplicantRefuseReasonDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「应聘人」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setCandidateId(String candidateId) {
        this.candidateId = candidateId
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「工作岗位」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setJobId(String jobId) {
        this.jobId = jobId
        return this
    }


    /**
     * 设置「最终阶段」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setLastStageId(String lastStageId) {
        this.lastStageId = lastStageId
        return this
    }


    /**
     * 设置「主要附件」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setMessageMainAttachmentId(String messageMainAttachmentId) {
        this.messageMainAttachmentId = messageMainAttachmentId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「拒绝理由」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setRefuseReasonId(String refuseReasonId) {
        this.refuseReasonId = refuseReasonId
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「阶段」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setStageId(String stageId) {
        this.stageId = stageId
        return this
    }


    /**
     * 设置「招聘人员」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrApplicantRefuseReasonDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
