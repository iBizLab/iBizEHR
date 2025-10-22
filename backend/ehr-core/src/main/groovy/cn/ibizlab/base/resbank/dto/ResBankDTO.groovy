package cn.ibizlab.base.resbank.dto

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
class ResBankDTO extends GroovyDTO<ResBankDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「银行识别码」
     */
    @JsonProperty("bic")
    String bic
    /**
     * 「城市」
     */
    @JsonProperty("city")
    String city
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
     * 「邮箱」
     */
    @JsonProperty("email")
    String email
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
     * 「电话」
     */
    @JsonProperty("phone")
    String phone
    /**
     * 「街道」
     */
    @JsonProperty("street")
    String street
    /**
     * 「详细地址」
     */
    @JsonProperty("street2")
    String street2
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
     * 「邮编」
     */
    @JsonProperty("zip")
    String zip

    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    ResBankDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「银行识别码」值
     * @param val
     */
    ResBankDTO setBic(String bic) {
        this.bic = bic
        return this
    }


    /**
     * 设置「城市」值
     * @param val
     */
    ResBankDTO setCity(String city) {
        this.city = city
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResBankDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    ResBankDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResBankDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「邮箱」值
     * @param val
     */
    ResBankDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResBankDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResBankDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「电话」值
     * @param val
     */
    ResBankDTO setPhone(String phone) {
        this.phone = phone
        return this
    }


    /**
     * 设置「街道」值
     * @param val
     */
    ResBankDTO setStreet(String street) {
        this.street = street
        return this
    }


    /**
     * 设置「详细地址」值
     * @param val
     */
    ResBankDTO setStreet2(String street2) {
        this.street2 = street2
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResBankDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    ResBankDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「邮编」值
     * @param val
     */
    ResBankDTO setZip(String zip) {
        this.zip = zip
        return this
    }

}
