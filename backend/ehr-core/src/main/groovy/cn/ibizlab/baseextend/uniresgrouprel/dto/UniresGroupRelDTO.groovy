package cn.ibizlab.baseextend.uniresgrouprel.dto

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
class UniresGroupRelDTO extends GroovyDTO<UniresGroupRelDTO> {

    /**
     * 「资源代码」
     */
    @JsonProperty("res_code")
    String resCode
    /**
     * 「标识」
     */
    @JsonProperty("gid")
    String gid
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
     * 「统一资源标识」
     */
    @JsonProperty("unires_id")
    String uniresId
    /**
     * 「统一资源名称」
     */
    @JsonProperty("unires_name")
    String uniresName

    /**
     * 设置「资源代码」值
     * @param val
     */
    UniresGroupRelDTO setResCode(String resCode) {
        this.resCode = resCode
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    UniresGroupRelDTO setGid(String gid) {
        this.gid = gid
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    UniresGroupRelDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    UniresGroupRelDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「统一资源标识」值
     * @param val
     */
    UniresGroupRelDTO setUniresId(String uniresId) {
        this.uniresId = uniresId
        return this
    }


    /**
     * 设置「统一资源名称」值
     * @param val
     */
    UniresGroupRelDTO setUniresName(String uniresName) {
        this.uniresName = uniresName
        return this
    }

}
