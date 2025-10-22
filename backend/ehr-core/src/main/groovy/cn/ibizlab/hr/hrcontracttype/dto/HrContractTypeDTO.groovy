package cn.ibizlab.hr.hrcontracttype.dto

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
class HrContractTypeDTO extends GroovyDTO<HrContractTypeDTO> {

    /**
     * 「代码」
     */
    @JsonProperty("code")
    String code
    /**
     * 「国家/地区」
     */
    @JsonProperty("country_id")
    String countryId
    /**
     * 「国家/地区」
     */
    @JsonProperty("country_name")
    String countryName
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
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
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
     * 设置「代码」值
     * @param val
     */
    HrContractTypeDTO setCode(String code) {
        this.code = code
        return this
    }


    /**
     * 设置「国家/地区」值
     * @param val
     */
    HrContractTypeDTO setCountryId(String countryId) {
        this.countryId = countryId
        return this
    }


    /**
     * 设置「国家/地区」值
     * @param val
     */
    HrContractTypeDTO setCountryName(String countryName) {
        this.countryName = countryName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrContractTypeDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrContractTypeDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrContractTypeDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrContractTypeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrContractTypeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    HrContractTypeDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrContractTypeDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrContractTypeDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
