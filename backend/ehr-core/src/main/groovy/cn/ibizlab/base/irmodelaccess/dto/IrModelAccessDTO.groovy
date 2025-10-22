package cn.ibizlab.base.irmodelaccess.dto

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
class IrModelAccessDTO extends GroovyDTO<IrModelAccessDTO> {

    /**
     * 「模型」
     */
    @JsonProperty("model_id")
    String modelId
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「授权群组」
     */
    @JsonProperty("group_id")
    String groupId
    /**
     * 「授权群组名称」
     */
    @JsonProperty("group_name")
    String groupName
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
     * 「创建」
     * 字典[是否]
     */
    @JsonProperty("perm_create")
    Integer permCreate
    /**
     * 「读取」
     * 字典[是否]
     */
    @JsonProperty("perm_read")
    Integer permRead
    /**
     * 「删除」
     * 字典[是否]
     */
    @JsonProperty("perm_unlink")
    Integer permUnlink
    /**
     * 「写入」
     * 字典[是否]
     */
    @JsonProperty("perm_write")
    Integer permWrite

    /**
     * 设置「模型」值
     * @param val
     */
    IrModelAccessDTO setModelId(String modelId) {
        this.modelId = modelId
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    IrModelAccessDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「授权群组」值
     * @param val
     */
    IrModelAccessDTO setGroupId(String groupId) {
        this.groupId = groupId
        return this
    }


    /**
     * 设置「授权群组名称」值
     * @param val
     */
    IrModelAccessDTO setGroupName(String groupName) {
        this.groupName = groupName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrModelAccessDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IrModelAccessDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「创建」值
     * 字典[是否]
     * @param val
     */
    IrModelAccessDTO setPermCreate(Integer permCreate) {
        this.permCreate = permCreate
        return this
    }


    /**
     * 设置「读取」值
     * 字典[是否]
     * @param val
     */
    IrModelAccessDTO setPermRead(Integer permRead) {
        this.permRead = permRead
        return this
    }


    /**
     * 设置「删除」值
     * 字典[是否]
     * @param val
     */
    IrModelAccessDTO setPermUnlink(Integer permUnlink) {
        this.permUnlink = permUnlink
        return this
    }


    /**
     * 设置「写入」值
     * 字典[是否]
     * @param val
     */
    IrModelAccessDTO setPermWrite(Integer permWrite) {
        this.permWrite = permWrite
        return this
    }

}
