package cn.ibizlab.hr.hrcandidateeducation.dto

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
class HrCandidateEducationDTO extends GroovyDTO<HrCandidateEducationDTO> {

    /**
     * 「开始时间」
     */
    @JsonProperty("start_date")
    Timestamp startDate
    /**
     * 「结束时间」
     */
    @JsonProperty("end_date")
    Timestamp endDate
    /**
     * 「学校」
     */
    @JsonProperty("school")
    String school
    /**
     * 「专业」
     */
    @JsonProperty("speciality")
    String speciality
    /**
     * 「学位」
     */
    @JsonProperty("academic_degree")
    String academicDegree
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
     * 设置「开始时间」值
     * @param val
     */
    HrCandidateEducationDTO setStartDate(Timestamp startDate) {
        this.startDate = startDate
        return this
    }


    /**
     * 设置「结束时间」值
     * @param val
     */
    HrCandidateEducationDTO setEndDate(Timestamp endDate) {
        this.endDate = endDate
        return this
    }


    /**
     * 设置「学校」值
     * @param val
     */
    HrCandidateEducationDTO setSchool(String school) {
        this.school = school
        return this
    }


    /**
     * 设置「专业」值
     * @param val
     */
    HrCandidateEducationDTO setSpeciality(String speciality) {
        this.speciality = speciality
        return this
    }


    /**
     * 设置「学位」值
     * @param val
     */
    HrCandidateEducationDTO setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree
        return this
    }


    /**
     * 设置「候选人申请」值
     * @param val
     */
    HrCandidateEducationDTO setApplicantId(String applicantId) {
        this.applicantId = applicantId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrCandidateEducationDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrCandidateEducationDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrCandidateEducationDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrCandidateEducationDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrCandidateEducationDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrCandidateEducationDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
