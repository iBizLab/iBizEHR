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
     * 「电子邮件」
     */
    @JsonProperty("email")
    String email
    /**
     * 「电话」
     */
    @JsonProperty("phone")
    String phone
    /**
     * 「共享用户」
     * 字典[是否]
     */
    @JsonProperty("share")
    Integer share
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
     * 「名称」
     */
    @JsonProperty("company_name")
    String companyName
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
     * 「用户」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「名称」
     */
    @JsonProperty("user_name")
    String userName
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
     * 设置「电子邮件」值
     * @param val
     */
    ResourceResourceDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「电话」值
     * @param val
     */
    ResourceResourceDTO setPhone(String phone) {
        this.phone = phone
        return this
    }


    /**
     * 设置「共享用户」值
     * 字典[是否]
     * @param val
     */
    ResourceResourceDTO setShare(Integer share) {
        this.share = share
        return this
    }


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
     * 设置「名称」值
     * @param val
     */
    ResourceResourceDTO setCompanyName(String companyName) {
        this.companyName = companyName
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
     * 设置「用户」值
     * @param val
     */
    ResourceResourceDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResourceResourceDTO setUserName(String userName) {
        this.userName = userName
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
     * @param val
     */
    ResourceResourceDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
