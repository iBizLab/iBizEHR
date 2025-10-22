package cn.ibizlab.employeemanagement.userobject.dto

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
class UserObjectDTO extends GroovyDTO<UserObjectDTO> {

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
    @JsonProperty("write_date")
    Timestamp writeDate
    /**
     * 「类型」
     */
    @JsonProperty("type")
    String type
    /**
     * 「部门ID」
     */
    @JsonProperty("dept_id")
    String deptId
    /**
     * 「供应商ID」
     */
    @JsonProperty("gys_infoid")
    String gysInfoid
    /**
     * 「上级部门ID标识」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「上级部门ID名称」
     */
    @JsonProperty("parent_name")
    String parentName
    /**
     * 「状态」
     */
    @JsonProperty("status")
    String status

    /**
     * 设置「标识」值
     * @param val
     */
    UserObjectDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    UserObjectDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    UserObjectDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    UserObjectDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    UserObjectDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    UserObjectDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「类型」值
     * @param val
     */
    UserObjectDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「部门ID」值
     * @param val
     */
    UserObjectDTO setDeptId(String deptId) {
        this.deptId = deptId
        return this
    }


    /**
     * 设置「供应商ID」值
     * @param val
     */
    UserObjectDTO setGysInfoid(String gysInfoid) {
        this.gysInfoid = gysInfoid
        return this
    }


    /**
     * 设置「上级部门ID标识」值
     * @param val
     */
    UserObjectDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「上级部门ID名称」值
     * @param val
     */
    UserObjectDTO setParentName(String parentName) {
        this.parentName = parentName
        return this
    }


    /**
     * 设置「状态」值
     * @param val
     */
    UserObjectDTO setStatus(String status) {
        this.status = status
        return this
    }

}
