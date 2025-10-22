package cn.ibizlab.attendance.attendancewifilocation.dto

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
class AttendanceWifiLocationDTO extends GroovyDTO<AttendanceWifiLocationDTO> {

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
     * 「Mac地址」
     */
    @JsonProperty("mac_address")
    String macAddress
    /**
     * 「WiFi名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「主键」
     */
    @JsonProperty("rule_id")
    String ruleId
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
     * 设置「创建时间」值
     * @param val
     */
    AttendanceWifiLocationDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceWifiLocationDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    AttendanceWifiLocationDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「Mac地址」值
     * @param val
     */
    AttendanceWifiLocationDTO setMacAddress(String macAddress) {
        this.macAddress = macAddress
        return this
    }


    /**
     * 设置「WiFi名称」值
     * @param val
     */
    AttendanceWifiLocationDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    AttendanceWifiLocationDTO setRuleId(String ruleId) {
        this.ruleId = ruleId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceWifiLocationDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceWifiLocationDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
