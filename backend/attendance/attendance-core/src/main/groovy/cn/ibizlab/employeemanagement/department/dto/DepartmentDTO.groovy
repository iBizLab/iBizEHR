package cn.ibizlab.employeemanagement.department.dto

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
class DepartmentDTO extends GroovyDTO<DepartmentDTO> {

    /**
     * 「机构ID」
     */
    @JsonProperty("orgid")
    String orgid
    /**
     * 「系统分类ID」
     */
    @JsonProperty("srfdcid")
    String srfdcid
    /**
     * 「创建时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「创建人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「主键」
     */
    @JsonProperty("id")
    String id
    /**
     * 「部门名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「上级部门ID」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「上级部门名称」
     */
    @JsonProperty("parent_name")
    String parentName
    /**
     * 「部门状态」
     */
    @JsonProperty("status")
    String status
    /**
     * 「更新时间」
     */
    @JsonProperty("write_date")
    Timestamp writeDate
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("write_uid")
    String writeUid

    /**
     * 设置「机构ID」值
     * @param val
     */
    DepartmentDTO setOrgid(String orgid) {
        this.orgid = orgid
        return this
    }


    /**
     * 设置「系统分类ID」值
     * @param val
     */
    DepartmentDTO setSrfdcid(String srfdcid) {
        this.srfdcid = srfdcid
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    DepartmentDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    DepartmentDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    DepartmentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「部门名称」值
     * @param val
     */
    DepartmentDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「上级部门ID」值
     * @param val
     */
    DepartmentDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「上级部门名称」值
     * @param val
     */
    DepartmentDTO setParentName(String parentName) {
        this.parentName = parentName
        return this
    }


    /**
     * 设置「部门状态」值
     * @param val
     */
    DepartmentDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DepartmentDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    DepartmentDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
