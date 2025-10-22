package cn.ibizlab.attendance.attendancedevice.dto

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
class AttendanceDeviceDTO extends GroovyDTO<AttendanceDeviceDTO> {

    /**
     * 「设备SN」
     */
    @JsonProperty("device")
    String device
    /**
     * 「创建时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「创建人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「主键」
     */
    @JsonProperty("id")
    String id
    /**
     * 「设备名称」
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
     * 字典[云系统操作者]
     */
    @JsonProperty("write_uid")
    String writeUid

    /**
     * 设置「设备SN」值
     * @param val
     */
    AttendanceDeviceDTO setDevice(String device) {
        this.device = device
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AttendanceDeviceDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceDeviceDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    AttendanceDeviceDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「设备名称」值
     * @param val
     */
    AttendanceDeviceDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceDeviceDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceDeviceDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
