package cn.ibizlab.base.extendlog.dto

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
class ExtendLogDTO extends GroovyDTO<ExtendLogDTO> {

    /**
     * 「所属数据标识」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「所属对象子类型」
     */
    @JsonProperty("owner_subtype")
    String ownerSubtype
    /**
     * 「类别」
     */
    @JsonProperty("category")
    String category
    /**
     * 「级别」
     */
    @JsonProperty("level")
    String level
    /**
     * 「调试日志信息」
     */
    @JsonProperty("debug_info")
    String debugInfo
    /**
     * 「日志信息」
     */
    @JsonProperty("info")
    String info
    /**
     * 「起始时间」
     */
    @JsonProperty("start_at")
    Timestamp startAt
    /**
     * 「结束时间」
     */
    @JsonProperty("end_at")
    Timestamp endAt
    /**
     * 「持续时间」
     */
    @JsonProperty("elapsed_time")
    Integer elapsedTime
    /**
     * 「状态」
     */
    @JsonProperty("state")
    String state
    /**
     * 「建立人」
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
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
     * 「更新人」
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime

    /**
     * 设置「所属数据标识」值
     * @param val
     */
    ExtendLogDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    ExtendLogDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属对象子类型」值
     * @param val
     */
    ExtendLogDTO setOwnerSubtype(String ownerSubtype) {
        this.ownerSubtype = ownerSubtype
        return this
    }


    /**
     * 设置「类别」值
     * @param val
     */
    ExtendLogDTO setCategory(String category) {
        this.category = category
        return this
    }


    /**
     * 设置「级别」值
     * @param val
     */
    ExtendLogDTO setLevel(String level) {
        this.level = level
        return this
    }


    /**
     * 设置「调试日志信息」值
     * @param val
     */
    ExtendLogDTO setDebugInfo(String debugInfo) {
        this.debugInfo = debugInfo
        return this
    }


    /**
     * 设置「日志信息」值
     * @param val
     */
    ExtendLogDTO setInfo(String info) {
        this.info = info
        return this
    }


    /**
     * 设置「起始时间」值
     * @param val
     */
    ExtendLogDTO setStartAt(Timestamp startAt) {
        this.startAt = startAt
        return this
    }


    /**
     * 设置「结束时间」值
     * @param val
     */
    ExtendLogDTO setEndAt(Timestamp endAt) {
        this.endAt = endAt
        return this
    }


    /**
     * 设置「持续时间」值
     * @param val
     */
    ExtendLogDTO setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime
        return this
    }


    /**
     * 设置「状态」值
     * @param val
     */
    ExtendLogDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    ExtendLogDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ExtendLogDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ExtendLogDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ExtendLogDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    ExtendLogDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ExtendLogDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
