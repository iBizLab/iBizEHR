package cn.ibizlab.attendance.attendancegpslocation.dto

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
class AttendanceGpsLocationDTO extends GroovyDTO<AttendanceGpsLocationDTO> {

    /**
     * 「精度」
     */
    @JsonProperty("longitude")
    Double longitude
    /**
     * 「详细地址」
     */
    @JsonProperty("location")
    String location
    /**
     * 「有效范围」
     */
    @JsonProperty("range")
    Integer range
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
     * 「纬度」
     */
    @JsonProperty("latitude")
    Double latitude
    /**
     * 「考勤地点」
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
     * 设置「精度」值
     * @param val
     */
    AttendanceGpsLocationDTO setLongitude(Double longitude) {
        this.longitude = longitude
        return this
    }


    /**
     * 设置「详细地址」值
     * @param val
     */
    AttendanceGpsLocationDTO setLocation(String location) {
        this.location = location
        return this
    }


    /**
     * 设置「有效范围」值
     * @param val
     */
    AttendanceGpsLocationDTO setRange(Integer range) {
        this.range = range
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AttendanceGpsLocationDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceGpsLocationDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    AttendanceGpsLocationDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「纬度」值
     * @param val
     */
    AttendanceGpsLocationDTO setLatitude(Double latitude) {
        this.latitude = latitude
        return this
    }


    /**
     * 设置「考勤地点」值
     * @param val
     */
    AttendanceGpsLocationDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    AttendanceGpsLocationDTO setRuleId(String ruleId) {
        this.ruleId = ruleId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceGpsLocationDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceGpsLocationDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
