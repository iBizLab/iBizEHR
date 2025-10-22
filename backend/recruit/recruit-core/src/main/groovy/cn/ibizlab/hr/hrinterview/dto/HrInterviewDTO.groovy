package cn.ibizlab.hr.hrinterview.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.hr.hrinterviewuser.dto.HrInterviewUserDTO
import cn.ibizlab.hr.hrinterviewfeedback.dto.HrInterviewFeedbackDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class HrInterviewDTO extends GroovyDTO<HrInterviewDTO> {

    /**
     * 「面试时长」
     * 字典[面试时长]
     */
    @JsonProperty("duration")
    String duration
    /**
     * 「面试时间」
     * 字典[面试开始时间]
     */
    @JsonProperty("start_time")
    String startTime
    /**
     * 「面试状态」
     * 字典[面试状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「面试阶段」
     * 字典[面试阶段]
     */
    @JsonProperty("stage_id")
    String stageId
    /**
     * 「会议号」
     */
    @JsonProperty("meeting_id")
    String meetingId
    /**
     * 「面试日期」
     */
    @JsonProperty("start_date")
    Timestamp startDate
    /**
     * 「面试地点」
     */
    @JsonProperty("address_id")
    String addressId
    /**
     * 「候选人」
     */
    @JsonProperty("candidate_display_name")
    String candidateDisplayName
    /**
     * 「联系方式」
     */
    @JsonProperty("mobile_phone")
    String mobilePhone
    /**
     * 「应聘职位」
     */
    @JsonProperty("job_name")
    String jobName
    /**
     * 「面试结果」
     */
    @JsonProperty("interview_result")
    String interviewResult
    /**
     * 「面试类型」
     * 字典[面试类型]
     */
    @JsonProperty("interview_type")
    String interviewType
    /**
     * 「面试官」
     */
    @JsonProperty("interviewers")
    String interviewers
    /**
     * 「候选人申请」
     */
    @JsonProperty("applicant_ids")
    String applicantIds
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
     * 「面试负责人」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「面试负责人」
     */
    @JsonProperty("owner_name")
    String ownerName
    /**
     * 「面试安排」
     */
    @JsonProperty("schedule_id")
    String scheduleId
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
     * 「null」
     */
    @JsonProperty("candidates")
    List<HrInterviewUserDTO> candidates
    /**
     * 「null」
     */
    @JsonProperty("hr_interview_feedbacks")
    List<HrInterviewFeedbackDTO> hrInterviewFeedbacks

    /**
     * 设置「面试时长」值
     * 字典[面试时长]
     * @param val
     */
    HrInterviewDTO setDuration(String duration) {
        this.duration = duration
        return this
    }


    /**
     * 设置「面试时间」值
     * 字典[面试开始时间]
     * @param val
     */
    HrInterviewDTO setStartTime(String startTime) {
        this.startTime = startTime
        return this
    }


    /**
     * 设置「面试状态」值
     * 字典[面试状态]
     * @param val
     */
    HrInterviewDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「面试阶段」值
     * 字典[面试阶段]
     * @param val
     */
    HrInterviewDTO setStageId(String stageId) {
        this.stageId = stageId
        return this
    }


    /**
     * 设置「会议号」值
     * @param val
     */
    HrInterviewDTO setMeetingId(String meetingId) {
        this.meetingId = meetingId
        return this
    }


    /**
     * 设置「面试日期」值
     * @param val
     */
    HrInterviewDTO setStartDate(Timestamp startDate) {
        this.startDate = startDate
        return this
    }


    /**
     * 设置「面试地点」值
     * @param val
     */
    HrInterviewDTO setAddressId(String addressId) {
        this.addressId = addressId
        return this
    }


    /**
     * 设置「候选人」值
     * @param val
     */
    HrInterviewDTO setCandidateDisplayName(String candidateDisplayName) {
        this.candidateDisplayName = candidateDisplayName
        return this
    }


    /**
     * 设置「联系方式」值
     * @param val
     */
    HrInterviewDTO setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone
        return this
    }


    /**
     * 设置「应聘职位」值
     * @param val
     */
    HrInterviewDTO setJobName(String jobName) {
        this.jobName = jobName
        return this
    }


    /**
     * 设置「面试结果」值
     * @param val
     */
    HrInterviewDTO setInterviewResult(String interviewResult) {
        this.interviewResult = interviewResult
        return this
    }


    /**
     * 设置「面试类型」值
     * 字典[面试类型]
     * @param val
     */
    HrInterviewDTO setInterviewType(String interviewType) {
        this.interviewType = interviewType
        return this
    }


    /**
     * 设置「面试官」值
     * @param val
     */
    HrInterviewDTO setInterviewers(String interviewers) {
        this.interviewers = interviewers
        return this
    }


    /**
     * 设置「候选人申请」值
     * @param val
     */
    HrInterviewDTO setApplicantIds(String applicantIds) {
        this.applicantIds = applicantIds
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrInterviewDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrInterviewDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrInterviewDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrInterviewDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「面试负责人」值
     * @param val
     */
    HrInterviewDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「面试负责人」值
     * @param val
     */
    HrInterviewDTO setOwnerName(String ownerName) {
        this.ownerName = ownerName
        return this
    }


    /**
     * 设置「面试安排」值
     * @param val
     */
    HrInterviewDTO setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrInterviewDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrInterviewDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    HrInterviewDTO setCandidates(List<HrInterviewUserDTO> candidates) {
        this.candidates = candidates
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    HrInterviewDTO setHrInterviewFeedbacks(List<HrInterviewFeedbackDTO> hrInterviewFeedbacks) {
        this.hrInterviewFeedbacks = hrInterviewFeedbacks
        return this
    }

}
