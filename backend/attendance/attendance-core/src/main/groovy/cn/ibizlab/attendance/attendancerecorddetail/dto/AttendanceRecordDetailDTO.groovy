package cn.ibizlab.attendance.attendancerecorddetail.dto

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
class AttendanceRecordDetailDTO extends GroovyDTO<AttendanceRecordDetailDTO> {

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
     * 「考勤结果」
     */
    @JsonProperty("checkin_result")
    String checkinResult
    /**
     * 「实际考勤时间」
     */
    @JsonProperty("checkin_time")
    Timestamp checkinTime
    /**
     * 「应考勤时间」
     */
    @JsonProperty("should_checkin_time")
    Timestamp shouldCheckinTime
    /**
     * 「是否出差」
     * 字典[是否]
     */
    @JsonProperty("is_business_trip")
    Integer isBusinessTrip
    /**
     * 「是否请假」
     * 字典[是否]
     */
    @JsonProperty("is_leave")
    Integer isLeave
    /**
     * 「是否外出」
     * 字典[是否]
     */
    @JsonProperty("is_go_out")
    Integer isGoOut
    /**
     * 「详情索引」
     */
    @JsonProperty("detail_index")
    String detailIndex
    /**
     * 「休假类型名称」
     */
    @JsonProperty("leave_name")
    String leaveName
    /**
     * 「考勤记录ID」
     */
    @JsonProperty("record_id")
    String recordId

    /**
     * 设置「标识」值
     * @param val
     */
    AttendanceRecordDetailDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AttendanceRecordDetailDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceRecordDetailDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AttendanceRecordDetailDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceRecordDetailDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceRecordDetailDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「考勤结果」值
     * @param val
     */
    AttendanceRecordDetailDTO setCheckinResult(String checkinResult) {
        this.checkinResult = checkinResult
        return this
    }


    /**
     * 设置「实际考勤时间」值
     * @param val
     */
    AttendanceRecordDetailDTO setCheckinTime(Timestamp checkinTime) {
        this.checkinTime = checkinTime
        return this
    }


    /**
     * 设置「应考勤时间」值
     * @param val
     */
    AttendanceRecordDetailDTO setShouldCheckinTime(Timestamp shouldCheckinTime) {
        this.shouldCheckinTime = shouldCheckinTime
        return this
    }


    /**
     * 设置「是否出差」值
     * 字典[是否]
     * @param val
     */
    AttendanceRecordDetailDTO setIsBusinessTrip(Integer isBusinessTrip) {
        this.isBusinessTrip = isBusinessTrip
        return this
    }


    /**
     * 设置「是否请假」值
     * 字典[是否]
     * @param val
     */
    AttendanceRecordDetailDTO setIsLeave(Integer isLeave) {
        this.isLeave = isLeave
        return this
    }


    /**
     * 设置「是否外出」值
     * 字典[是否]
     * @param val
     */
    AttendanceRecordDetailDTO setIsGoOut(Integer isGoOut) {
        this.isGoOut = isGoOut
        return this
    }


    /**
     * 设置「详情索引」值
     * @param val
     */
    AttendanceRecordDetailDTO setDetailIndex(String detailIndex) {
        this.detailIndex = detailIndex
        return this
    }


    /**
     * 设置「休假类型名称」值
     * @param val
     */
    AttendanceRecordDetailDTO setLeaveName(String leaveName) {
        this.leaveName = leaveName
        return this
    }


    /**
     * 设置「考勤记录ID」值
     * @param val
     */
    AttendanceRecordDetailDTO setRecordId(String recordId) {
        this.recordId = recordId
        return this
    }

}
