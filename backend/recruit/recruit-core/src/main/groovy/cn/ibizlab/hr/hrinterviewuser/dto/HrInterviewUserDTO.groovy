package cn.ibizlab.hr.hrinterviewuser.dto

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
class HrInterviewUserDTO extends GroovyDTO<HrInterviewUserDTO> {

    /**
     * 「面试参与者类型」
     * 字典[面试参与者类型]
     */
    @JsonProperty("user_type")
    String userType
    /**
     * 「面试参与者」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「面试参与者」
     */
    @JsonProperty("user_name")
    String userName
    /**
     * 「参与者状态」
     */
    @JsonProperty("user_status")
    String userStatus
    /**
     * 「会议链接」
     */
    @JsonProperty("video_url")
    String videoUrl
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
     * 「候选人」
     */
    @JsonProperty("candidate_display_name")
    String candidateDisplayName
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
     * 「面试」
     */
    @JsonProperty("interview_id")
    String interviewId
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
     * 设置「面试参与者类型」值
     * 字典[面试参与者类型]
     * @param val
     */
    HrInterviewUserDTO setUserType(String userType) {
        this.userType = userType
        return this
    }


    /**
     * 设置「面试参与者」值
     * @param val
     */
    HrInterviewUserDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「面试参与者」值
     * @param val
     */
    HrInterviewUserDTO setUserName(String userName) {
        this.userName = userName
        return this
    }


    /**
     * 设置「参与者状态」值
     * @param val
     */
    HrInterviewUserDTO setUserStatus(String userStatus) {
        this.userStatus = userStatus
        return this
    }


    /**
     * 设置「会议链接」值
     * @param val
     */
    HrInterviewUserDTO setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl
        return this
    }


    /**
     * 设置「联系方式」值
     * @param val
     */
    HrInterviewUserDTO setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone
        return this
    }


    /**
     * 设置「应聘职位」值
     * @param val
     */
    HrInterviewUserDTO setJobName(String jobName) {
        this.jobName = jobName
        return this
    }


    /**
     * 设置「候选人」值
     * @param val
     */
    HrInterviewUserDTO setCandidateDisplayName(String candidateDisplayName) {
        this.candidateDisplayName = candidateDisplayName
        return this
    }


    /**
     * 设置「候选人申请」值
     * @param val
     */
    HrInterviewUserDTO setApplicantId(String applicantId) {
        this.applicantId = applicantId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrInterviewUserDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrInterviewUserDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrInterviewUserDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「面试」值
     * @param val
     */
    HrInterviewUserDTO setInterviewId(String interviewId) {
        this.interviewId = interviewId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrInterviewUserDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrInterviewUserDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrInterviewUserDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
