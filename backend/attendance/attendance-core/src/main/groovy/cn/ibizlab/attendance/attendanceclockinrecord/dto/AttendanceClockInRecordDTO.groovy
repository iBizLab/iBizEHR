package cn.ibizlab.attendance.attendanceclockinrecord.dto

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
class AttendanceClockInRecordDTO extends GroovyDTO<AttendanceClockInRecordDTO> {

    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("write_uid")
    String writeUid
    /**
     * 「更新时间」
     */
    @JsonProperty("write_date")
    Timestamp writeDate
    /**
     * 「员工名称」
     */
    @JsonProperty("member_name")
    String memberName
    /**
     * 「部门ID」
     */
    @JsonProperty("dept_id")
    String deptId
    /**
     * 「部门名称」
     */
    @JsonProperty("dept_name")
    String deptName
    /**
     * 「工号」
     */
    @JsonProperty("member_num")
    String memberNum
    /**
     * 「打卡图片」
     */
    @JsonProperty("checkin_image")
    String checkinImage
    /**
     * 「打卡备注」
     */
    @JsonProperty("checkin_remark")
    String checkinRemark
    /**
     * 「打卡结果」
     * 字典[考勤结果]
     */
    @JsonProperty("checkin_result")
    String checkinResult
    /**
     * 「打卡时间」
     */
    @JsonProperty("checkin_time")
    Timestamp checkinTime
    /**
     * 「打卡方式」
     * 字典[打卡方式（得力）]
     */
    @JsonProperty("checkin_type")
    String checkinType
    /**
     * 「打卡类型」
     * 字典[打卡类型]
     */
    @JsonProperty("clock_type")
    String clockType
    /**
     * 「操作指令」
     */
    @JsonProperty("cmd")
    String cmd
    /**
     * 「考勤日期」
     */
    @JsonProperty("date")
    Timestamp date
    /**
     * 「设备名称」
     */
    @JsonProperty("device_name")
    String deviceName
    /**
     * 「上班时长」
     */
    @JsonProperty("duration_hours")
    Integer durationHours
    /**
     * 「记录ID」
     */
    @JsonProperty("id")
    String id
    /**
     * 「员工ID」
     */
    @JsonProperty("member_id")
    String memberId
    /**
     * 「应打卡时间」
     */
    @JsonProperty("should_checkin_time")
    Timestamp shouldCheckinTime
    /**
     * 「数据来源」
     */
    @JsonProperty("source")
    String source
    /**
     * 「终端设备ID」
     */
    @JsonProperty("terminal_id")
    String terminalId

    /**
     * 设置「名称」值
     * @param val
     */
    AttendanceClockInRecordDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceClockInRecordDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AttendanceClockInRecordDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceClockInRecordDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceClockInRecordDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「员工名称」值
     * @param val
     */
    AttendanceClockInRecordDTO setMemberName(String memberName) {
        this.memberName = memberName
        return this
    }


    /**
     * 设置「部门ID」值
     * @param val
     */
    AttendanceClockInRecordDTO setDeptId(String deptId) {
        this.deptId = deptId
        return this
    }


    /**
     * 设置「部门名称」值
     * @param val
     */
    AttendanceClockInRecordDTO setDeptName(String deptName) {
        this.deptName = deptName
        return this
    }


    /**
     * 设置「工号」值
     * @param val
     */
    AttendanceClockInRecordDTO setMemberNum(String memberNum) {
        this.memberNum = memberNum
        return this
    }


    /**
     * 设置「打卡图片」值
     * @param val
     */
    AttendanceClockInRecordDTO setCheckinImage(String checkinImage) {
        this.checkinImage = checkinImage
        return this
    }


    /**
     * 设置「打卡备注」值
     * @param val
     */
    AttendanceClockInRecordDTO setCheckinRemark(String checkinRemark) {
        this.checkinRemark = checkinRemark
        return this
    }


    /**
     * 设置「打卡结果」值
     * 字典[考勤结果]
     * @param val
     */
    AttendanceClockInRecordDTO setCheckinResult(String checkinResult) {
        this.checkinResult = checkinResult
        return this
    }


    /**
     * 设置「打卡时间」值
     * @param val
     */
    AttendanceClockInRecordDTO setCheckinTime(Timestamp checkinTime) {
        this.checkinTime = checkinTime
        return this
    }


    /**
     * 设置「打卡方式」值
     * 字典[打卡方式（得力）]
     * @param val
     */
    AttendanceClockInRecordDTO setCheckinType(String checkinType) {
        this.checkinType = checkinType
        return this
    }


    /**
     * 设置「打卡类型」值
     * 字典[打卡类型]
     * @param val
     */
    AttendanceClockInRecordDTO setClockType(String clockType) {
        this.clockType = clockType
        return this
    }


    /**
     * 设置「操作指令」值
     * @param val
     */
    AttendanceClockInRecordDTO setCmd(String cmd) {
        this.cmd = cmd
        return this
    }


    /**
     * 设置「考勤日期」值
     * @param val
     */
    AttendanceClockInRecordDTO setDate(Timestamp date) {
        this.date = date
        return this
    }


    /**
     * 设置「设备名称」值
     * @param val
     */
    AttendanceClockInRecordDTO setDeviceName(String deviceName) {
        this.deviceName = deviceName
        return this
    }


    /**
     * 设置「上班时长」值
     * @param val
     */
    AttendanceClockInRecordDTO setDurationHours(Integer durationHours) {
        this.durationHours = durationHours
        return this
    }


    /**
     * 设置「记录ID」值
     * @param val
     */
    AttendanceClockInRecordDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「员工ID」值
     * @param val
     */
    AttendanceClockInRecordDTO setMemberId(String memberId) {
        this.memberId = memberId
        return this
    }


    /**
     * 设置「应打卡时间」值
     * @param val
     */
    AttendanceClockInRecordDTO setShouldCheckinTime(Timestamp shouldCheckinTime) {
        this.shouldCheckinTime = shouldCheckinTime
        return this
    }


    /**
     * 设置「数据来源」值
     * @param val
     */
    AttendanceClockInRecordDTO setSource(String source) {
        this.source = source
        return this
    }


    /**
     * 设置「终端设备ID」值
     * @param val
     */
    AttendanceClockInRecordDTO setTerminalId(String terminalId) {
        this.terminalId = terminalId
        return this
    }

}
