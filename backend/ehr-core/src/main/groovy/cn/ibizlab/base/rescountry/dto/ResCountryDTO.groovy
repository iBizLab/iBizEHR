package cn.ibizlab.base.rescountry.dto

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
class ResCountryDTO extends GroovyDTO<ResCountryDTO> {

    /**
     * 「报表中的布局」
     */
    @JsonProperty("address_format")
    String addressFormat
    /**
     * 「国家/地区代码」
     */
    @JsonProperty("code")
    String code
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
     * 「币别」
     */
    @JsonProperty("currency_id")
    String currencyId
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
     * 「旗帜」
     */
    @JsonProperty("image_url")
    String imageUrl
    /**
     * 「是支持Stripe支付的国家/地区」
     * 字典[是否]
     */
    @JsonProperty("is_stripe_supported_country")
    Integer isStripeSupportedCountry
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「客户姓名 职位」
     * 字典[客户姓名 职位]
     */
    @JsonProperty("name_position")
    String namePosition
    /**
     * 「国家/地区长途区号」
     */
    @JsonProperty("phone_code")
    Integer phoneCode
    /**
     * 「省/州必填」
     * 字典[是否]
     */
    @JsonProperty("state_required")
    Integer stateRequired
    /**
     * 「大桶标签」
     */
    @JsonProperty("vat_label")
    String vatLabel
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
     * 「需要邮编」
     * 字典[是否]
     */
    @JsonProperty("zip_required")
    Integer zipRequired

    /**
     * 设置「报表中的布局」值
     * @param val
     */
    ResCountryDTO setAddressFormat(String addressFormat) {
        this.addressFormat = addressFormat
        return this
    }


    /**
     * 设置「国家/地区代码」值
     * @param val
     */
    ResCountryDTO setCode(String code) {
        this.code = code
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResCountryDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    ResCountryDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「币别」值
     * @param val
     */
    ResCountryDTO setCurrencyId(String currencyId) {
        this.currencyId = currencyId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResCountryDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResCountryDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「旗帜」值
     * @param val
     */
    ResCountryDTO setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl
        return this
    }


    /**
     * 设置「是支持Stripe支付的国家/地区」值
     * 字典[是否]
     * @param val
     */
    ResCountryDTO setIsStripeSupportedCountry(Integer isStripeSupportedCountry) {
        this.isStripeSupportedCountry = isStripeSupportedCountry
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResCountryDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「客户姓名 职位」值
     * 字典[客户姓名 职位]
     * @param val
     */
    ResCountryDTO setNamePosition(String namePosition) {
        this.namePosition = namePosition
        return this
    }


    /**
     * 设置「国家/地区长途区号」值
     * @param val
     */
    ResCountryDTO setPhoneCode(Integer phoneCode) {
        this.phoneCode = phoneCode
        return this
    }


    /**
     * 设置「省/州必填」值
     * 字典[是否]
     * @param val
     */
    ResCountryDTO setStateRequired(Integer stateRequired) {
        this.stateRequired = stateRequired
        return this
    }


    /**
     * 设置「大桶标签」值
     * @param val
     */
    ResCountryDTO setVatLabel(String vatLabel) {
        this.vatLabel = vatLabel
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResCountryDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    ResCountryDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「需要邮编」值
     * 字典[是否]
     * @param val
     */
    ResCountryDTO setZipRequired(Integer zipRequired) {
        this.zipRequired = zipRequired
        return this
    }

}
