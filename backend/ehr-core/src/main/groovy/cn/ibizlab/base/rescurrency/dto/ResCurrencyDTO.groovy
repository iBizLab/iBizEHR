package cn.ibizlab.base.rescurrency.dto

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
class ResCurrencyDTO extends GroovyDTO<ResCurrencyDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
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
     * 「币别小组」
     */
    @JsonProperty("currency_subunit_label")
    String currencySubunitLabel
    /**
     * 「币别单位」
     */
    @JsonProperty("currency_unit_label")
    String currencyUnitLabel
    /**
     * 「日期」
     */
    @JsonProperty("date")
    Timestamp date
    /**
     * 「小数位数」
     */
    @JsonProperty("decimal_places")
    Integer decimalPlaces
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「显示舍入警告信息」
     * 字典[是否]
     */
    @JsonProperty("display_rounding_warning")
    Integer displayRoundingWarning
    /**
     * 「会计所在国家/地区代码」
     */
    @JsonProperty("fiscal_country_codes")
    String fiscalCountryCodes
    /**
     * 「名称」
     */
    @JsonProperty("full_name")
    String fullName
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「汇率」
     */
    @JsonProperty("inverse_rate")
    Double inverseRate
    /**
     * 「是当前的公司币别」
     * 字典[是否]
     */
    @JsonProperty("is_current_company_currency")
    Integer isCurrentCompanyCurrency
    /**
     * 「币别的数字代码。」
     */
    @JsonProperty("iso_numeric")
    Integer isoNumeric
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「符号位置」
     * 字典[符号位置]
     */
    @JsonProperty("position")
    String position
    /**
     * 「当前汇率」
     */
    @JsonProperty("rate")
    Double rate
    /**
     * 「费率字符串」
     */
    @JsonProperty("rate_string")
    String rateString
    /**
     * 「四舍五入系数」
     */
    @JsonProperty("rounding")
    Double rounding
    /**
     * 「符号」
     */
    @JsonProperty("symbol")
    String symbol
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
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    ResCurrencyDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResCurrencyDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    ResCurrencyDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「币别小组」值
     * @param val
     */
    ResCurrencyDTO setCurrencySubunitLabel(String currencySubunitLabel) {
        this.currencySubunitLabel = currencySubunitLabel
        return this
    }


    /**
     * 设置「币别单位」值
     * @param val
     */
    ResCurrencyDTO setCurrencyUnitLabel(String currencyUnitLabel) {
        this.currencyUnitLabel = currencyUnitLabel
        return this
    }


    /**
     * 设置「日期」值
     * @param val
     */
    ResCurrencyDTO setDate(Timestamp date) {
        this.date = date
        return this
    }


    /**
     * 设置「小数位数」值
     * @param val
     */
    ResCurrencyDTO setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResCurrencyDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「显示舍入警告信息」值
     * 字典[是否]
     * @param val
     */
    ResCurrencyDTO setDisplayRoundingWarning(Integer displayRoundingWarning) {
        this.displayRoundingWarning = displayRoundingWarning
        return this
    }


    /**
     * 设置「会计所在国家/地区代码」值
     * @param val
     */
    ResCurrencyDTO setFiscalCountryCodes(String fiscalCountryCodes) {
        this.fiscalCountryCodes = fiscalCountryCodes
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResCurrencyDTO setFullName(String fullName) {
        this.fullName = fullName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResCurrencyDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「汇率」值
     * @param val
     */
    ResCurrencyDTO setInverseRate(Double inverseRate) {
        this.inverseRate = inverseRate
        return this
    }


    /**
     * 设置「是当前的公司币别」值
     * 字典[是否]
     * @param val
     */
    ResCurrencyDTO setIsCurrentCompanyCurrency(Integer isCurrentCompanyCurrency) {
        this.isCurrentCompanyCurrency = isCurrentCompanyCurrency
        return this
    }


    /**
     * 设置「币别的数字代码。」值
     * @param val
     */
    ResCurrencyDTO setIsoNumeric(Integer isoNumeric) {
        this.isoNumeric = isoNumeric
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResCurrencyDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「符号位置」值
     * 字典[符号位置]
     * @param val
     */
    ResCurrencyDTO setPosition(String position) {
        this.position = position
        return this
    }


    /**
     * 设置「当前汇率」值
     * @param val
     */
    ResCurrencyDTO setRate(Double rate) {
        this.rate = rate
        return this
    }


    /**
     * 设置「费率字符串」值
     * @param val
     */
    ResCurrencyDTO setRateString(String rateString) {
        this.rateString = rateString
        return this
    }


    /**
     * 设置「四舍五入系数」值
     * @param val
     */
    ResCurrencyDTO setRounding(Double rounding) {
        this.rounding = rounding
        return this
    }


    /**
     * 设置「符号」值
     * @param val
     */
    ResCurrencyDTO setSymbol(String symbol) {
        this.symbol = symbol
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResCurrencyDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    ResCurrencyDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
