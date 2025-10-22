package cn.ibizlab.hr.hrinterviewschedule.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.hr.hrinterview.dto.HrInterviewDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class HrInterviewScheduleDTO extends GroovyDTO<HrInterviewScheduleDTO> {

    /**
     * 「面试日期」
     */
    @JsonProperty("start_date")
    Timestamp startDate
    /**
     * 「面试类型」
     * 字典[面试类型]
     */
    @JsonProperty("interview_type")
    String interviewType
    /**
     * 「简历类型」
     * 字典[简历类型]
     */
    @JsonProperty("resume_type")
    String resumeType
    /**
     * 「附件」
     */
    @JsonProperty("attachment")
    String attachment
    /**
     * 「面试类型分类」
     * 字典[面试类型分类]
     */
    @JsonProperty("interview_category")
    String interviewCategory
    /**
     * 「是否发送邮件通知」
     * 字典[邮件通知候选人]
     */
    @JsonProperty("is_send_email")
    String isSendEmail
    /**
     * 「是否发送短信」
     * 字典[短信通知候选人]
     */
    @JsonProperty("is_send_sms")
    String isSendSms
    /**
     * 「短信内容」
     */
    @JsonProperty("sms_content")
    String smsContent
    /**
     * 「邮件内容」
     */
    @JsonProperty("email_content")
    String emailContent
    /**
     * 「邮件模版」
     * 字典[邮件模版（临时）]
     */
    @JsonProperty("email_template_id")
    String emailTemplateId
    /**
     * 「面试地点」
     */
    @JsonProperty("address_id")
    String addressId
    /**
     * 「短信模版」
     * 字典[短信模版（临时）]
     */
    @JsonProperty("sms_template_id")
    String smsTemplateId
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
     * 「null」
     */
    @JsonProperty("interviews")
    List<HrInterviewDTO> interviews

    /**
     * 设置「面试日期」值
     * @param val
     */
    HrInterviewScheduleDTO setStartDate(Timestamp startDate) {
        this.startDate = startDate
        return this
    }


    /**
     * 设置「面试类型」值
     * 字典[面试类型]
     * @param val
     */
    HrInterviewScheduleDTO setInterviewType(String interviewType) {
        this.interviewType = interviewType
        return this
    }


    /**
     * 设置「简历类型」值
     * 字典[简历类型]
     * @param val
     */
    HrInterviewScheduleDTO setResumeType(String resumeType) {
        this.resumeType = resumeType
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    HrInterviewScheduleDTO setAttachment(String attachment) {
        this.attachment = attachment
        return this
    }


    /**
     * 设置「面试类型分类」值
     * 字典[面试类型分类]
     * @param val
     */
    HrInterviewScheduleDTO setInterviewCategory(String interviewCategory) {
        this.interviewCategory = interviewCategory
        return this
    }


    /**
     * 设置「是否发送邮件通知」值
     * 字典[邮件通知候选人]
     * @param val
     */
    HrInterviewScheduleDTO setIsSendEmail(String isSendEmail) {
        this.isSendEmail = isSendEmail
        return this
    }


    /**
     * 设置「是否发送短信」值
     * 字典[短信通知候选人]
     * @param val
     */
    HrInterviewScheduleDTO setIsSendSms(String isSendSms) {
        this.isSendSms = isSendSms
        return this
    }


    /**
     * 设置「短信内容」值
     * @param val
     */
    HrInterviewScheduleDTO setSmsContent(String smsContent) {
        this.smsContent = smsContent
        return this
    }


    /**
     * 设置「邮件内容」值
     * @param val
     */
    HrInterviewScheduleDTO setEmailContent(String emailContent) {
        this.emailContent = emailContent
        return this
    }


    /**
     * 设置「邮件模版」值
     * 字典[邮件模版（临时）]
     * @param val
     */
    HrInterviewScheduleDTO setEmailTemplateId(String emailTemplateId) {
        this.emailTemplateId = emailTemplateId
        return this
    }


    /**
     * 设置「面试地点」值
     * @param val
     */
    HrInterviewScheduleDTO setAddressId(String addressId) {
        this.addressId = addressId
        return this
    }


    /**
     * 设置「短信模版」值
     * 字典[短信模版（临时）]
     * @param val
     */
    HrInterviewScheduleDTO setSmsTemplateId(String smsTemplateId) {
        this.smsTemplateId = smsTemplateId
        return this
    }


    /**
     * 设置「候选人申请」值
     * @param val
     */
    HrInterviewScheduleDTO setApplicantId(String applicantId) {
        this.applicantId = applicantId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrInterviewScheduleDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrInterviewScheduleDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrInterviewScheduleDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrInterviewScheduleDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrInterviewScheduleDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrInterviewScheduleDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    HrInterviewScheduleDTO setInterviews(List<HrInterviewDTO> interviews) {
        this.interviews = interviews
        return this
    }

}
