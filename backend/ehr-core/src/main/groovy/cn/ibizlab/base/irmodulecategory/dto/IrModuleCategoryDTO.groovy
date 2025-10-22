package cn.ibizlab.base.irmodulecategory.dto

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
class IrModuleCategoryDTO extends GroovyDTO<IrModuleCategoryDTO> {

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
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「专属」
     * 字典[是否]
     */
    @JsonProperty("exclusive")
    Integer exclusive
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
     * 「父应用」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「父应用名称」
     */
    @JsonProperty("parent_name")
    String parentName
    /**
     * 「序列」
     */
    @JsonProperty("sequence")
    Integer sequence
    /**
     * 「显示」
     * 字典[是否]
     */
    @JsonProperty("visible")
    Integer visible
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
    IrModuleCategoryDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    IrModuleCategoryDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    IrModuleCategoryDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「专属」值
     * 字典[是否]
     * @param val
     */
    IrModuleCategoryDTO setExclusive(Integer exclusive) {
        this.exclusive = exclusive
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrModuleCategoryDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IrModuleCategoryDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「父应用」值
     * @param val
     */
    IrModuleCategoryDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「父应用名称」值
     * @param val
     */
    IrModuleCategoryDTO setParentName(String parentName) {
        this.parentName = parentName
        return this
    }


    /**
     * 设置「序列」值
     * @param val
     */
    IrModuleCategoryDTO setSequence(Integer sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「显示」值
     * 字典[是否]
     * @param val
     */
    IrModuleCategoryDTO setVisible(Integer visible) {
        this.visible = visible
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrModuleCategoryDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    IrModuleCategoryDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
