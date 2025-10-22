package cn.ibizlab.resource.resourcemixin.dto

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
class ResourceMixinDTO extends GroovyDTO<ResourceMixinDTO> {

    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「工作时间」
     */
    @JsonProperty("resource_calendar_id")
    String resourceCalendarId
    /**
     * 「资源」
     */
    @JsonProperty("resource_id")
    String resourceId

    /**
     * 设置「名称」值
     * @param val
     */
    ResourceMixinDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    ResourceMixinDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResourceMixinDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「工作时间」值
     * @param val
     */
    ResourceMixinDTO setResourceCalendarId(String resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId
        return this
    }


    /**
     * 设置「资源」值
     * @param val
     */
    ResourceMixinDTO setResourceId(String resourceId) {
        this.resourceId = resourceId
        return this
    }

}
