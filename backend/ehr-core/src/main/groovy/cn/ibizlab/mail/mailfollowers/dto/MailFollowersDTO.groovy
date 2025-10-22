package cn.ibizlab.mail.mailfollowers.dto

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
class MailFollowersDTO extends GroovyDTO<MailFollowersDTO> {

    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「关注类型」
     * 字典[关注类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「资源标识」
     */
    @JsonProperty("res_id")
    String resId
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
     * 「相关的业务伙伴」
     */
    @JsonProperty("partner_id")
    String partnerId
    /**
     * 「相关的单据模型名称」
     */
    @JsonProperty("res_model")
    String resModel

    /**
     * 设置「名称」值
     * @param val
     */
    MailFollowersDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「关注类型」值
     * 字典[关注类型]
     * @param val
     */
    MailFollowersDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「资源标识」值
     * @param val
     */
    MailFollowersDTO setResId(String resId) {
        this.resId = resId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    MailFollowersDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailFollowersDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「相关的业务伙伴」值
     * @param val
     */
    MailFollowersDTO setPartnerId(String partnerId) {
        this.partnerId = partnerId
        return this
    }


    /**
     * 设置「相关的单据模型名称」值
     * @param val
     */
    MailFollowersDTO setResModel(String resModel) {
        this.resModel = resModel
        return this
    }

}
