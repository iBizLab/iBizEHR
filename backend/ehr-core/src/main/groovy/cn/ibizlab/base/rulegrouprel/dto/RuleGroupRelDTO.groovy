package cn.ibizlab.base.rulegrouprel.dto

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
class RuleGroupRelDTO extends GroovyDTO<RuleGroupRelDTO> {

    /**
     * 「模型」
     */
    @JsonProperty("model_id")
    String modelId
    /**
     * 「域名」
     */
    @JsonProperty("domain_force")
    String domainForce
    /**
     * 「组标识」
     */
    @JsonProperty("gid")
    String gid
    /**
     * 「组名称」
     */
    @JsonProperty("gname")
    String gname
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
     * 「规则标识」
     */
    @JsonProperty("rule_id")
    String ruleId
    /**
     * 「规则名称」
     */
    @JsonProperty("rule_name")
    String ruleName

    /**
     * 设置「模型」值
     * @param val
     */
    RuleGroupRelDTO setModelId(String modelId) {
        this.modelId = modelId
        return this
    }


    /**
     * 设置「域名」值
     * @param val
     */
    RuleGroupRelDTO setDomainForce(String domainForce) {
        this.domainForce = domainForce
        return this
    }


    /**
     * 设置「组标识」值
     * @param val
     */
    RuleGroupRelDTO setGid(String gid) {
        this.gid = gid
        return this
    }


    /**
     * 设置「组名称」值
     * @param val
     */
    RuleGroupRelDTO setGname(String gname) {
        this.gname = gname
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    RuleGroupRelDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    RuleGroupRelDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「创建」值
     * 字典[是否]
     * @param val
     */
    RuleGroupRelDTO setPermCreate(Integer permCreate) {
        this.permCreate = permCreate
        return this
    }


    /**
     * 设置「读取」值
     * 字典[是否]
     * @param val
     */
    RuleGroupRelDTO setPermRead(Integer permRead) {
        this.permRead = permRead
        return this
    }


    /**
     * 设置「删除」值
     * 字典[是否]
     * @param val
     */
    RuleGroupRelDTO setPermUnlink(Integer permUnlink) {
        this.permUnlink = permUnlink
        return this
    }


    /**
     * 设置「写入」值
     * 字典[是否]
     * @param val
     */
    RuleGroupRelDTO setPermWrite(Integer permWrite) {
        this.permWrite = permWrite
        return this
    }


    /**
     * 设置「规则标识」值
     * @param val
     */
    RuleGroupRelDTO setRuleId(String ruleId) {
        this.ruleId = ruleId
        return this
    }


    /**
     * 设置「规则名称」值
     * @param val
     */
    RuleGroupRelDTO setRuleName(String ruleName) {
        this.ruleName = ruleName
        return this
    }

}
