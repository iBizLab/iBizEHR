package cn.ibizlab.base.irsequence.dto

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
class IrSequenceDTO extends GroovyDTO<IrSequenceDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「序列类型」
     */
    @JsonProperty("code")
    String code
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
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
     * 「实施策略」
     * 字典[实施策略]
     */
    @JsonProperty("implementation")
    String implementation
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「步长」
     */
    @JsonProperty("number_increment")
    Integer numberIncrement
    /**
     * 「下一个编号」
     */
    @JsonProperty("number_next")
    Integer numberNext
    /**
     * 「序列填充长度」
     */
    @JsonProperty("padding")
    Integer padding
    /**
     * 「前缀」
     */
    @JsonProperty("prefix")
    String prefix
    /**
     * 「后缀」
     */
    @JsonProperty("suffix")
    String suffix
    /**
     * 「按日期重编序列号」
     * 字典[是否]
     */
    @JsonProperty("use_date_range")
    Integer useDateRange
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
    IrSequenceDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「序列类型」值
     * @param val
     */
    IrSequenceDTO setCode(String code) {
        this.code = code
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    IrSequenceDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    IrSequenceDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    IrSequenceDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrSequenceDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「实施策略」值
     * 字典[实施策略]
     * @param val
     */
    IrSequenceDTO setImplementation(String implementation) {
        this.implementation = implementation
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IrSequenceDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「步长」值
     * @param val
     */
    IrSequenceDTO setNumberIncrement(Integer numberIncrement) {
        this.numberIncrement = numberIncrement
        return this
    }


    /**
     * 设置「下一个编号」值
     * @param val
     */
    IrSequenceDTO setNumberNext(Integer numberNext) {
        this.numberNext = numberNext
        return this
    }


    /**
     * 设置「序列填充长度」值
     * @param val
     */
    IrSequenceDTO setPadding(Integer padding) {
        this.padding = padding
        return this
    }


    /**
     * 设置「前缀」值
     * @param val
     */
    IrSequenceDTO setPrefix(String prefix) {
        this.prefix = prefix
        return this
    }


    /**
     * 设置「后缀」值
     * @param val
     */
    IrSequenceDTO setSuffix(String suffix) {
        this.suffix = suffix
        return this
    }


    /**
     * 设置「按日期重编序列号」值
     * 字典[是否]
     * @param val
     */
    IrSequenceDTO setUseDateRange(Integer useDateRange) {
        this.useDateRange = useDateRange
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrSequenceDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    IrSequenceDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
