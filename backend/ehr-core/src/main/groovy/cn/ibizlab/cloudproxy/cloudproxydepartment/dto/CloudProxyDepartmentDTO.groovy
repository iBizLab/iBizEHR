package cn.ibizlab.cloudproxy.cloudproxydepartment.dto

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
class CloudProxyDepartmentDTO extends GroovyDTO<CloudProxyDepartmentDTO> {

    /**
     * 「部门负责人标识」
     */
    @JsonProperty("head_id")
    String headId
    /**
     * 「父部门标识」
     */
    @JsonProperty("parent_id")
    String parentId
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
     * 设置「部门负责人标识」值
     * @param val
     */
    CloudProxyDepartmentDTO setHeadId(String headId) {
        this.headId = headId
        return this
    }


    /**
     * 设置「父部门标识」值
     * @param val
     */
    CloudProxyDepartmentDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CloudProxyDepartmentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CloudProxyDepartmentDTO setName(String name) {
        this.name = name
        return this
    }

}
