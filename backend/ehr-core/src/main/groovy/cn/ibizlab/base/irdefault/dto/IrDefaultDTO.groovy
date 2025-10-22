package cn.ibizlab.base.irdefault.dto

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
class IrDefaultDTO extends GroovyDTO<IrDefaultDTO> {

    /**
     * 「属性标识」
     */
    @JsonProperty("field_id")
    String fieldId
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「公司名称」
     */
    @JsonProperty("company_name")
    String companyName
    /**
     * 「条件」
     */
    @JsonProperty("condition")
    String condition
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
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「默认值 (JSON格式)」
     */
    @JsonProperty("json_value")
    String jsonValue
    /**
     * 「用户」
     */
    @JsonProperty("user_id")
    String userId
    /**
     * 「用户名称」
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
     * 设置「属性标识」值
     * @param val
     */
    IrDefaultDTO setFieldId(String fieldId) {
        this.fieldId = fieldId
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    IrDefaultDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「公司名称」值
     * @param val
     */
    IrDefaultDTO setCompanyName(String companyName) {
        this.companyName = companyName
        return this
    }


    /**
     * 设置「条件」值
     * @param val
     */
    IrDefaultDTO setCondition(String condition) {
        this.condition = condition
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    IrDefaultDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    IrDefaultDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrDefaultDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「默认值 (JSON格式)」值
     * @param val
     */
    IrDefaultDTO setJsonValue(String jsonValue) {
        this.jsonValue = jsonValue
        return this
    }


    /**
     * 设置「用户」值
     * @param val
     */
    IrDefaultDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「用户名称」值
     * @param val
     */
    IrDefaultDTO setUserName(String userName) {
        this.userName = userName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrDefaultDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    IrDefaultDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
