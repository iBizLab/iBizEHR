package cn.ibizlab.hr.hrdepartment.dto

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
class HrDepartmentDTO extends GroovyDTO<HrDepartmentDTO> {

    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「颜色指标」
     */
    @JsonProperty("color")
    String color
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
     * 「完整名称」
     */
    @JsonProperty("complete_name")
    String completeName
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
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「备注」
     */
    @JsonProperty("note")
    String note
    /**
     * 「上级部门」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「上级部门」
     */
    @JsonProperty("parent_name")
    String parentName
    /**
     * 「父级路径」
     */
    @JsonProperty("parent_path")
    String parentPath
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
    HrDepartmentDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「颜色指标」值
     * @param val
     */
    HrDepartmentDTO setColor(String color) {
        this.color = color
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrDepartmentDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    HrDepartmentDTO setCompanyName(String companyName) {
        this.companyName = companyName
        return this
    }


    /**
     * 设置「完整名称」值
     * @param val
     */
    HrDepartmentDTO setCompleteName(String completeName) {
        this.completeName = completeName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    HrDepartmentDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    HrDepartmentDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    HrDepartmentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    HrDepartmentDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    HrDepartmentDTO setNote(String note) {
        this.note = note
        return this
    }


    /**
     * 设置「上级部门」值
     * @param val
     */
    HrDepartmentDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「上级部门」值
     * @param val
     */
    HrDepartmentDTO setParentName(String parentName) {
        this.parentName = parentName
        return this
    }


    /**
     * 设置「父级路径」值
     * @param val
     */
    HrDepartmentDTO setParentPath(String parentPath) {
        this.parentPath = parentPath
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    HrDepartmentDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    HrDepartmentDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
