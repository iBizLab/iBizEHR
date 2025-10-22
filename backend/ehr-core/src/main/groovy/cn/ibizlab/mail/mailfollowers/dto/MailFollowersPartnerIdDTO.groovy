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
class MailFollowersPartnerIdDTO extends GroovyDTO<MailFollowersPartnerIdDTO> {

    /**
     * 「相关的业务伙伴」
     */
    @JsonProperty("partner_id")
    String partnerId

    /**
     * 设置「相关的业务伙伴」值
     * @param val
     */
    MailFollowersPartnerIdDTO setPartnerId(String partnerId) {
        this.partnerId = partnerId
        return this
    }

}
