package cn.ibizlab.base.resusers.dto

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
class ResUsersCounterDTO extends GroovyDTO<ResUsersCounterDTO> {

    /**
     * 「# 访问权限」
     */
    @JsonProperty("accesses_count")
    Integer accessesCount
    /**
     * 「# 分组」
     */
    @JsonProperty("groups_count")
    Integer groupsCount
    /**
     * 「# 记录规则」
     */
    @JsonProperty("rules_count")
    Integer rulesCount

    /**
     * 设置「# 访问权限」值
     * @param val
     */
    ResUsersCounterDTO setAccessesCount(Integer accessesCount) {
        this.accessesCount = accessesCount
        return this
    }


    /**
     * 设置「# 分组」值
     * @param val
     */
    ResUsersCounterDTO setGroupsCount(Integer groupsCount) {
        this.groupsCount = groupsCount
        return this
    }


    /**
     * 设置「# 记录规则」值
     * @param val
     */
    ResUsersCounterDTO setRulesCount(Integer rulesCount) {
        this.rulesCount = rulesCount
        return this
    }

}
