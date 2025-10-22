package cn.ibizlab.resource.publicleavetype.dto

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
class PublicLeaveTypeDTO extends GroovyDTO<PublicLeaveTypeDTO> {

    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("write_uid")
    String writeUid
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「代码名称」
     */
    @JsonProperty("code")
    String code
    /**
     * 「主键」
     */
    @JsonProperty("id")
    String id

    /**
     * 设置「名称」值
     * @param val
     */
    PublicLeaveTypeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PublicLeaveTypeDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PublicLeaveTypeDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PublicLeaveTypeDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PublicLeaveTypeDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「代码名称」值
     * @param val
     */
    PublicLeaveTypeDTO setCode(String code) {
        this.code = code
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    PublicLeaveTypeDTO setId(String id) {
        this.id = id
        return this
    }

}
