package cn.ibizlab.base.resgroupsimpliedrel.dto

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
class ResGroupsImpliedRelDTO extends GroovyDTO<ResGroupsImpliedRelDTO> {

    /**
     * 「权限组标识」
     */
    @JsonProperty("gid")
    String gid
    /**
     * 「权限组标识」
     */
    @JsonProperty("gname")
    String gname
    /**
     * 「继承权限组标识」
     */
    @JsonProperty("hid")
    String hid
    /**
     * 「继承权限组标识」
     */
    @JsonProperty("hname")
    String hname
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
     * 设置「权限组标识」值
     * @param val
     */
    ResGroupsImpliedRelDTO setGid(String gid) {
        this.gid = gid
        return this
    }


    /**
     * 设置「权限组标识」值
     * @param val
     */
    ResGroupsImpliedRelDTO setGname(String gname) {
        this.gname = gname
        return this
    }


    /**
     * 设置「继承权限组标识」值
     * @param val
     */
    ResGroupsImpliedRelDTO setHid(String hid) {
        this.hid = hid
        return this
    }


    /**
     * 设置「继承权限组标识」值
     * @param val
     */
    ResGroupsImpliedRelDTO setHname(String hname) {
        this.hname = hname
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResGroupsImpliedRelDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResGroupsImpliedRelDTO setName(String name) {
        this.name = name
        return this
    }

}
