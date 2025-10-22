package cn.ibizlab.hr.hremployee.dto

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
class HrEmployeeDTO extends GroovyDTO<HrEmployeeDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「姓名」
     */
    @JsonProperty("name")
    String name
    /**
     * 「证件类型」
     */
    @JsonProperty("identification_type")
    String identificationType
    /**
     * 「民族」
     */
    @JsonProperty("nation")
    String nation
    /**
     * 「婚姻状况」
     */
    @JsonProperty("marital_status")
    String maritalStatus
    /**
     * 「参加工作日期」
     */
    @JsonProperty("start_workdate")
    Timestamp startWorkdate
    /**
     * 「最高学历」
     */
    @JsonProperty("education_level")
    String educationLevel
    /**
     * 「专业」
     */
    @JsonProperty("major")
    String major
    /**
     * 「入职日期」
     */
    @JsonProperty("join_workdate")
    Timestamp joinWorkdate
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「其它说明」
     */
    @JsonProperty("additional_note")
    String additionalNote
    /**
     * 「徽标 ID」
     */
    @JsonProperty("barcode")
    String barcode
    /**
     * 「出生日期」
     */
    @JsonProperty("birthday")
    Timestamp birthday
    /**
     * 「证书等级」
     */
    @JsonProperty("certificate")
    String certificate
    /**
     * 「受抚养的子女数」
     */
    @JsonProperty("children")
    Integer children
    /**
     * 「颜色指标」
     */
    @JsonProperty("color")
    Integer color
    /**
     * 「部门」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「部门」
     */
    @JsonProperty("company_name")
    String companyName
    /**
     * 「合同警告」
     * 字典[是否]
     */
    @JsonProperty("contract_warning")
    Integer contractWarning
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
     * 「部门」
     */
    @JsonProperty("department_id")
    String departmentId
    /**
     * 「部门」
     */
    @JsonProperty("department_name")
    String departmentName
    /**
     * 「离职日期」
     */
    @JsonProperty("departure_date")
    Timestamp departureDate
    /**
     * 「其它信息」
     */
    @JsonProperty("departure_description")
    String departureDescription
    /**
     * 「通勤距离」
     */
    @JsonProperty("distance_home_work")
    Integer distanceHomeWork
    /**
     * 「通勤距离（单位）」
     */
    @JsonProperty("distance_home_work_unit")
    String distanceHomeWorkUnit
    /**
     * 「联系人姓名」
     */
    @JsonProperty("emergency_contact")
    String emergencyContact
    /**
     * 「电话」
     */
    @JsonProperty("emergency_phone")
    String emergencyPhone
    /**
     * 「雇佣关系」
     */
    @JsonProperty("employee_type")
    String employeeType
    /**
     * 「首次合同日期」
     */
    @JsonProperty("first_contract_date")
    Timestamp firstContractDate
    /**
     * 「性别」
     */
    @JsonProperty("gender")
    String gender
    /**
     * 「职位」
     */
    @JsonProperty("hr_job_id")
    String hrJobId
    /**
     * 「证件号码」
     */
    @JsonProperty("identification_id")
    String identificationId
    /**
     * 「灵活可变」
     * 字典[是否]
     */
    @JsonProperty("is_flexible")
    Integer isFlexible
    /**
     * 「完全灵活」
     * 字典[是否]
     */
    @JsonProperty("is_fully_flexible")
    Integer isFullyFlexible
    /**
     * 「工作头衔」
     */
    @JsonProperty("job_title")
    String jobTitle
    /**
     * 「通勤距离（公里）」
     */
    @JsonProperty("km_home_work")
    Integer kmHomeWork
    /**
     * 「法定名称」
     */
    @JsonProperty("legal_name")
    String legalName
    /**
     * 「手机号码」
     */
    @JsonProperty("mobile_phone")
    String mobilePhone
    /**
     * 「调动卡」
     */
    @JsonProperty("mobility_card")
    String mobilityCard
    /**
     * 「备注」
     */
    @JsonProperty("notes")
    String notes
    /**
     * 「护照号」
     */
    @JsonProperty("passport_id")
    String passportId
    /**
     * 「工号」
     */
    @JsonProperty("permit_no")
    String permitNo
    /**
     * 「PIN」
     */
    @JsonProperty("pin")
    String pin
    /**
     * 「出生地」
     */
    @JsonProperty("place_of_birth")
    String placeOfBirth
    /**
     * 「私人车辆车牌」
     */
    @JsonProperty("private_car_plate")
    String privateCarPlate
    /**
     * 「户籍所在地」
     */
    @JsonProperty("private_city")
    String privateCity
    /**
     * 「私人电子邮箱」
     */
    @JsonProperty("private_email")
    String privateEmail
    /**
     * 「私人电话」
     */
    @JsonProperty("private_phone")
    String privatePhone
    /**
     * 「户籍地址」
     */
    @JsonProperty("private_street")
    String privateStreet
    /**
     * 「户籍详细地址」
     */
    @JsonProperty("private_street2")
    String privateStreet2
    /**
     * 「邮编」
     */
    @JsonProperty("private_zip")
    String privateZip
    /**
     * 「社会保险号SIN」
     */
    @JsonProperty("sinid")
    String sinid
    /**
     * 「配偶生日」
     */
    @JsonProperty("spouse_birthdate")
    Timestamp spouseBirthdate
    /**
     * 「配偶全名」
     */
    @JsonProperty("spouse_complete_name")
    String spouseCompleteName
    /**
     * 「社会保障号SSN」
     */
    @JsonProperty("ssnid")
    String ssnid
    /**
     * 「研究领域」
     */
    @JsonProperty("study_field")
    String studyField
    /**
     * 「毕业学校」
     */
    @JsonProperty("study_school")
    String studySchool
    /**
     * 「用户」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「用户」
     */
    @JsonProperty("user_name")
    String userName
    /**
     * 「公司汽车」
     */
    @JsonProperty("vehicle")
    String vehicle
    /**
     * 「签证有效期」
     */
    @JsonProperty("visa_expire")
    Timestamp visaExpire
    /**
     * 「签证号」
     */
    @JsonProperty("visa_no")
    String visaNo
    /**
     * 「工作电子邮件」
     */
    @JsonProperty("work_email")
    String workEmail
    /**
     * 「工作许可证到期日期」
     */
    @JsonProperty("work_permit_expiration_date")
    Timestamp workPermitExpirationDate
    /**
     * 「工作许可的预定活动」
     * 字典[是否]
     */
    @JsonProperty("work_permit_scheduled_activity")
    Integer workPermitScheduledActivity
    /**
     * 「办公电话」
     */
    @JsonProperty("work_phone")
    String workPhone
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
     * 「管理链」
     */
    @JsonProperty("parent_path")
    String parentPath

    /**
     * 设置「标识」值
     * @param val
     */
    HrEmployeeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「姓名」值
     * @param val
     */
    HrEmployeeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「证件类型」值
     * @param val
     */
    HrEmployeeDTO setIdentificationType(String identificationType) {
        this.identificationType = identificationType
        return this
    }


    /**
     * 设置「民族」值
     * @param val
     */
    HrEmployeeDTO setNation(String nation) {
        this.nation = nation
        return this
    }


    /**
     * 设置「婚姻状况」值
     * @param val
     */
    HrEmployeeDTO setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus
        return this
    }


    /**
     * 设置「参加工作日期」值
     * @param val
     */
    HrEmployeeDTO setStartWorkdate(Timestamp startWorkdate) {
        this.startWorkdate = startWorkdate
        return this
    }


    /**
     * 设置「最高学历」值
     * @param val
     */
    HrEmployeeDTO setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel
        return this
    }


    /**
     * 设置「专业」值
     * @param val
     */
    HrEmployeeDTO setMajor(String major) {
        this.major = major
        return this
    }


    /**
     * 设置「入职日期」值
     * @param val
     */
    HrEmployeeDTO setJoinWorkdate(Timestamp joinWorkdate) {
        this.joinWorkdate = joinWorkdate
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「其它说明」值
     * @param val
     */
    HrEmployeeDTO setAdditionalNote(String additionalNote) {
        this.additionalNote = additionalNote
        return this
    }


    /**
     * 设置「徽标 ID」值
     * @param val
     */
    HrEmployeeDTO setBarcode(String barcode) {
        this.barcode = barcode
        return this
    }


    /**
     * 设置「出生日期」值
     * @param val
     */
    HrEmployeeDTO setBirthday(Timestamp birthday) {
        this.birthday = birthday
        return this
    }


    /**
     * 设置「证书等级」值
     * @param val
     */
    HrEmployeeDTO setCertificate(String certificate) {
        this.certificate = certificate
        return this
    }


    /**
     * 设置「受抚养的子女数」值
     * @param val
     */
    HrEmployeeDTO setChildren(Integer children) {
        this.children = children
        return this
    }


    /**
     * 设置「颜色指标」值
     * @param val
     */
    HrEmployeeDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrEmployeeDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrEmployeeDTO setCompanyName(String companyName) {
        this.companyName = companyName
        return this
    }


    /**
     * 设置「合同警告」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setContractWarning(Integer contractWarning) {
        this.contractWarning = contractWarning
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrEmployeeDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrEmployeeDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrEmployeeDTO setDepartmentId(String departmentId) {
        this.departmentId = departmentId
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    HrEmployeeDTO setDepartmentName(String departmentName) {
        this.departmentName = departmentName
        return this
    }


    /**
     * 设置「离职日期」值
     * @param val
     */
    HrEmployeeDTO setDepartureDate(Timestamp departureDate) {
        this.departureDate = departureDate
        return this
    }


    /**
     * 设置「其它信息」值
     * @param val
     */
    HrEmployeeDTO setDepartureDescription(String departureDescription) {
        this.departureDescription = departureDescription
        return this
    }


    /**
     * 设置「通勤距离」值
     * @param val
     */
    HrEmployeeDTO setDistanceHomeWork(Integer distanceHomeWork) {
        this.distanceHomeWork = distanceHomeWork
        return this
    }


    /**
     * 设置「通勤距离（单位）」值
     * @param val
     */
    HrEmployeeDTO setDistanceHomeWorkUnit(String distanceHomeWorkUnit) {
        this.distanceHomeWorkUnit = distanceHomeWorkUnit
        return this
    }


    /**
     * 设置「联系人姓名」值
     * @param val
     */
    HrEmployeeDTO setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact
        return this
    }


    /**
     * 设置「电话」值
     * @param val
     */
    HrEmployeeDTO setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone
        return this
    }


    /**
     * 设置「雇佣关系」值
     * @param val
     */
    HrEmployeeDTO setEmployeeType(String employeeType) {
        this.employeeType = employeeType
        return this
    }


    /**
     * 设置「首次合同日期」值
     * @param val
     */
    HrEmployeeDTO setFirstContractDate(Timestamp firstContractDate) {
        this.firstContractDate = firstContractDate
        return this
    }


    /**
     * 设置「性别」值
     * @param val
     */
    HrEmployeeDTO setGender(String gender) {
        this.gender = gender
        return this
    }


    /**
     * 设置「职位」值
     * @param val
     */
    HrEmployeeDTO setHrJobId(String hrJobId) {
        this.hrJobId = hrJobId
        return this
    }


    /**
     * 设置「证件号码」值
     * @param val
     */
    HrEmployeeDTO setIdentificationId(String identificationId) {
        this.identificationId = identificationId
        return this
    }


    /**
     * 设置「灵活可变」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setIsFlexible(Integer isFlexible) {
        this.isFlexible = isFlexible
        return this
    }


    /**
     * 设置「完全灵活」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setIsFullyFlexible(Integer isFullyFlexible) {
        this.isFullyFlexible = isFullyFlexible
        return this
    }


    /**
     * 设置「工作头衔」值
     * @param val
     */
    HrEmployeeDTO setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle
        return this
    }


    /**
     * 设置「通勤距离（公里）」值
     * @param val
     */
    HrEmployeeDTO setKmHomeWork(Integer kmHomeWork) {
        this.kmHomeWork = kmHomeWork
        return this
    }


    /**
     * 设置「法定名称」值
     * @param val
     */
    HrEmployeeDTO setLegalName(String legalName) {
        this.legalName = legalName
        return this
    }


    /**
     * 设置「手机号码」值
     * @param val
     */
    HrEmployeeDTO setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone
        return this
    }


    /**
     * 设置「调动卡」值
     * @param val
     */
    HrEmployeeDTO setMobilityCard(String mobilityCard) {
        this.mobilityCard = mobilityCard
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    HrEmployeeDTO setNotes(String notes) {
        this.notes = notes
        return this
    }


    /**
     * 设置「护照号」值
     * @param val
     */
    HrEmployeeDTO setPassportId(String passportId) {
        this.passportId = passportId
        return this
    }


    /**
     * 设置「工号」值
     * @param val
     */
    HrEmployeeDTO setPermitNo(String permitNo) {
        this.permitNo = permitNo
        return this
    }


    /**
     * 设置「PIN」值
     * @param val
     */
    HrEmployeeDTO setPin(String pin) {
        this.pin = pin
        return this
    }


    /**
     * 设置「出生地」值
     * @param val
     */
    HrEmployeeDTO setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth
        return this
    }


    /**
     * 设置「私人车辆车牌」值
     * @param val
     */
    HrEmployeeDTO setPrivateCarPlate(String privateCarPlate) {
        this.privateCarPlate = privateCarPlate
        return this
    }


    /**
     * 设置「户籍所在地」值
     * @param val
     */
    HrEmployeeDTO setPrivateCity(String privateCity) {
        this.privateCity = privateCity
        return this
    }


    /**
     * 设置「私人电子邮箱」值
     * @param val
     */
    HrEmployeeDTO setPrivateEmail(String privateEmail) {
        this.privateEmail = privateEmail
        return this
    }


    /**
     * 设置「私人电话」值
     * @param val
     */
    HrEmployeeDTO setPrivatePhone(String privatePhone) {
        this.privatePhone = privatePhone
        return this
    }


    /**
     * 设置「户籍地址」值
     * @param val
     */
    HrEmployeeDTO setPrivateStreet(String privateStreet) {
        this.privateStreet = privateStreet
        return this
    }


    /**
     * 设置「户籍详细地址」值
     * @param val
     */
    HrEmployeeDTO setPrivateStreet2(String privateStreet2) {
        this.privateStreet2 = privateStreet2
        return this
    }


    /**
     * 设置「邮编」值
     * @param val
     */
    HrEmployeeDTO setPrivateZip(String privateZip) {
        this.privateZip = privateZip
        return this
    }


    /**
     * 设置「社会保险号SIN」值
     * @param val
     */
    HrEmployeeDTO setSinid(String sinid) {
        this.sinid = sinid
        return this
    }


    /**
     * 设置「配偶生日」值
     * @param val
     */
    HrEmployeeDTO setSpouseBirthdate(Timestamp spouseBirthdate) {
        this.spouseBirthdate = spouseBirthdate
        return this
    }


    /**
     * 设置「配偶全名」值
     * @param val
     */
    HrEmployeeDTO setSpouseCompleteName(String spouseCompleteName) {
        this.spouseCompleteName = spouseCompleteName
        return this
    }


    /**
     * 设置「社会保障号SSN」值
     * @param val
     */
    HrEmployeeDTO setSsnid(String ssnid) {
        this.ssnid = ssnid
        return this
    }


    /**
     * 设置「研究领域」值
     * @param val
     */
    HrEmployeeDTO setStudyField(String studyField) {
        this.studyField = studyField
        return this
    }


    /**
     * 设置「毕业学校」值
     * @param val
     */
    HrEmployeeDTO setStudySchool(String studySchool) {
        this.studySchool = studySchool
        return this
    }


    /**
     * 设置「用户」值
     * @param val
     */
    HrEmployeeDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「用户」值
     * @param val
     */
    HrEmployeeDTO setUserName(String userName) {
        this.userName = userName
        return this
    }


    /**
     * 设置「公司汽车」值
     * @param val
     */
    HrEmployeeDTO setVehicle(String vehicle) {
        this.vehicle = vehicle
        return this
    }


    /**
     * 设置「签证有效期」值
     * @param val
     */
    HrEmployeeDTO setVisaExpire(Timestamp visaExpire) {
        this.visaExpire = visaExpire
        return this
    }


    /**
     * 设置「签证号」值
     * @param val
     */
    HrEmployeeDTO setVisaNo(String visaNo) {
        this.visaNo = visaNo
        return this
    }


    /**
     * 设置「工作电子邮件」值
     * @param val
     */
    HrEmployeeDTO setWorkEmail(String workEmail) {
        this.workEmail = workEmail
        return this
    }


    /**
     * 设置「工作许可证到期日期」值
     * @param val
     */
    HrEmployeeDTO setWorkPermitExpirationDate(Timestamp workPermitExpirationDate) {
        this.workPermitExpirationDate = workPermitExpirationDate
        return this
    }


    /**
     * 设置「工作许可的预定活动」值
     * 字典[是否]
     * @param val
     */
    HrEmployeeDTO setWorkPermitScheduledActivity(Integer workPermitScheduledActivity) {
        this.workPermitScheduledActivity = workPermitScheduledActivity
        return this
    }


    /**
     * 设置「办公电话」值
     * @param val
     */
    HrEmployeeDTO setWorkPhone(String workPhone) {
        this.workPhone = workPhone
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrEmployeeDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrEmployeeDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「管理链」值
     * @param val
     */
    HrEmployeeDTO setParentPath(String parentPath) {
        this.parentPath = parentPath
        return this
    }

}
