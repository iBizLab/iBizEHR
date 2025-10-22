package cn.ibizlab.hr.hrworklocation.dto

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
class HrWorkLocationDTO extends GroovyDTO<HrWorkLocationDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「工作地址」
     */
    @JsonProperty("address_id")
    String addressId
    /**
     * 「工作地址」
     */
    @JsonProperty("address_name")
    String addressName
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「公司」
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
     * 「地点编号」
     */
    @JsonProperty("location_number")
    String locationNumber
    /**
     * 「封面图片」
     * 字典[封面图片]
     */
    @JsonProperty("location_type")
    String locationType
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
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
    HrWorkLocationDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「工作地址」值
     * @param val
     */
    HrWorkLocationDTO setAddressId(String addressId) {
        this.addressId = addressId
        return this
    }


    /**
     * 设置「工作地址」值
     * @param val
     */
    HrWorkLocationDTO setAddressName(String addressName) {
        this.addressName = addressName
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrWorkLocationDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrWorkLocationDTO setCompanyName(String companyName) {
        this.companyName = companyName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrWorkLocationDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrWorkLocationDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    HrWorkLocationDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrWorkLocationDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「地点编号」值
     * @param val
     */
    HrWorkLocationDTO setLocationNumber(String locationNumber) {
        this.locationNumber = locationNumber
        return this
    }


    /**
     * 设置「封面图片」值
     * 字典[封面图片]
     * @param val
     */
    HrWorkLocationDTO setLocationType(String locationType) {
        this.locationType = locationType
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrWorkLocationDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrWorkLocationDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrWorkLocationDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
