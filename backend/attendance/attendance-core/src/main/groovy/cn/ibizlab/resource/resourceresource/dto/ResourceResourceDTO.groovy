package cn.ibizlab.resource.resourceresource.dto

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
class ResourceResourceDTO extends GroovyDTO<ResourceResourceDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「工时」
     */
    @JsonProperty("calendar_id")
    String calendarId
    /**
     * 「名称」
     */
    @JsonProperty("calendar_name")
    String calendarName
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
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
     * 「类型」
     * 字典[类型]
     */
    @JsonProperty("resource_type")
    String resourceType
    /**
     * 「效率因子」
     */
    @JsonProperty("time_efficiency")
    Double timeEfficiency
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
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    ResourceResourceDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「工时」值
     * @param val
     */
    ResourceResourceDTO setCalendarId(String calendarId) {
        this.calendarId = calendarId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResourceResourceDTO setCalendarName(String calendarName) {
        this.calendarName = calendarName
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    ResourceResourceDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResourceResourceDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResourceResourceDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResourceResourceDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResourceResourceDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResourceResourceDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「类型」值
     * 字典[类型]
     * @param val
     */
    ResourceResourceDTO setResourceType(String resourceType) {
        this.resourceType = resourceType
        return this
    }


    /**
     * 设置「效率因子」值
     * @param val
     */
    ResourceResourceDTO setTimeEfficiency(Double timeEfficiency) {
        this.timeEfficiency = timeEfficiency
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResourceResourceDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ResourceResourceDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
