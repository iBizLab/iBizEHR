package cn.ibizlab.base.rescompany.dto

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
class ResCompanyDTO extends GroovyDTO<ResCompanyDTO> {

    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id

    /**
     * 设置「标识」值
     * @param val
     */
    ResCompanyDTO setId(String id) {
        this.id = id
        return this
    }

}
