package cn.ibizlab.base.irmodel.dto

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
class IrModelDTO extends GroovyDTO<IrModelDTO> {

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
     * 「信息」
     */
    @JsonProperty("info")
    String info
    /**
     * 「有邮件活动」
     * 字典[是否]
     */
    @JsonProperty("is_mail_activity")
    Integer isMailActivity
    /**
     * 「有邮件黑名单」
     * 字典[是否]
     */
    @JsonProperty("is_mail_blacklist")
    Integer isMailBlacklist
    /**
     * 「有邮件会话」
     * 字典[是否]
     */
    @JsonProperty("is_mail_thread")
    Integer isMailThread
    /**
     * 「瞬态模型」
     * 字典[是否]
     */
    @JsonProperty("is_transient")
    Integer isTransient
    /**
     * 「模型」
     */
    @JsonProperty("model")
    String model
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「排序」
     */
    @JsonProperty("order")
    String order
    /**
     * 「类型」
     * 字典[类型]
     */
    @JsonProperty("state")
    String state
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
     * 设置「建立时间」值
     * @param val
     */
    IrModelDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    IrModelDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrModelDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「信息」值
     * @param val
     */
    IrModelDTO setInfo(String info) {
        this.info = info
        return this
    }


    /**
     * 设置「有邮件活动」值
     * 字典[是否]
     * @param val
     */
    IrModelDTO setIsMailActivity(Integer isMailActivity) {
        this.isMailActivity = isMailActivity
        return this
    }


    /**
     * 设置「有邮件黑名单」值
     * 字典[是否]
     * @param val
     */
    IrModelDTO setIsMailBlacklist(Integer isMailBlacklist) {
        this.isMailBlacklist = isMailBlacklist
        return this
    }


    /**
     * 设置「有邮件会话」值
     * 字典[是否]
     * @param val
     */
    IrModelDTO setIsMailThread(Integer isMailThread) {
        this.isMailThread = isMailThread
        return this
    }


    /**
     * 设置「瞬态模型」值
     * 字典[是否]
     * @param val
     */
    IrModelDTO setIsTransient(Integer isTransient) {
        this.isTransient = isTransient
        return this
    }


    /**
     * 设置「模型」值
     * @param val
     */
    IrModelDTO setModel(String model) {
        this.model = model
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IrModelDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「排序」值
     * @param val
     */
    IrModelDTO setOrder(String order) {
        this.order = order
        return this
    }


    /**
     * 设置「类型」值
     * 字典[类型]
     * @param val
     */
    IrModelDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrModelDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    IrModelDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
