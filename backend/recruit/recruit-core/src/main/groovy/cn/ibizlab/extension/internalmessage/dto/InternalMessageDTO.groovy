package cn.ibizlab.extension.internalmessage.dto

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
class InternalMessageDTO extends GroovyDTO<InternalMessageDTO> {

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
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
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
     * 「属性」
     */
    @JsonProperty("content")
    String content
    /**
     * 「属性2」
     */
    @JsonProperty("receiver")
    String receiver
    /**
     * 「状态」
     */
    @JsonProperty("status")
    String status
    /**
     * 「通知人类型」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「内容类型」
     */
    @JsonProperty("content_type")
    String contentType
    /**
     * 「属性3」
     */
    @JsonProperty("url")
    String url
    /**
     * 「属性4」
     */
    @JsonProperty("mobile_url")
    String mobileUrl
    /**
     * 「系统标签」
     */
    @JsonProperty("system_tag")
    String systemTag
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「消息类型」
     */
    @JsonProperty("message_type")
    String messageType

    /**
     * 设置「标识」值
     * @param val
     */
    InternalMessageDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    InternalMessageDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    InternalMessageDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    InternalMessageDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    InternalMessageDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    InternalMessageDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「属性」值
     * @param val
     */
    InternalMessageDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「属性2」值
     * @param val
     */
    InternalMessageDTO setReceiver(String receiver) {
        this.receiver = receiver
        return this
    }


    /**
     * 设置「状态」值
     * @param val
     */
    InternalMessageDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「通知人类型」值
     * @param val
     */
    InternalMessageDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「内容类型」值
     * @param val
     */
    InternalMessageDTO setContentType(String contentType) {
        this.contentType = contentType
        return this
    }


    /**
     * 设置「属性3」值
     * @param val
     */
    InternalMessageDTO setUrl(String url) {
        this.url = url
        return this
    }


    /**
     * 设置「属性4」值
     * @param val
     */
    InternalMessageDTO setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl
        return this
    }


    /**
     * 设置「系统标签」值
     * @param val
     */
    InternalMessageDTO setSystemTag(String systemTag) {
        this.systemTag = systemTag
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    InternalMessageDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「消息类型」值
     * @param val
     */
    InternalMessageDTO setMessageType(String messageType) {
        this.messageType = messageType
        return this
    }

}
