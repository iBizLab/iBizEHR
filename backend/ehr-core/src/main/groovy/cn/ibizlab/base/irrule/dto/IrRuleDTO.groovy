package cn.ibizlab.base.irrule.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.base.rulegrouprel.dto.RuleGroupRelDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class IrRuleDTO extends GroovyDTO<IrRuleDTO> {

    /**
     * 「模型」
     */
    @JsonProperty("model_id")
    String modelId
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「权限组关联规则」
     */
    @JsonProperty("rule_group_rels")
    List<RuleGroupRelDTO> ruleGroupRels
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
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
     * 「域名」
     */
    @JsonProperty("domain_force")
    String domainForce
    /**
     * 「全局」
     * 字典[是否]
     */
    @JsonProperty("global")
    Integer global
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
     * 设置「模型」值
     * @param val
     */
    IrRuleDTO setModelId(String modelId) {
        this.modelId = modelId
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    IrRuleDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「权限组关联规则」值
     * @param val
     */
    IrRuleDTO setRuleGroupRels(List<RuleGroupRelDTO> ruleGroupRels) {
        this.ruleGroupRels = ruleGroupRels
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    IrRuleDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    IrRuleDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    IrRuleDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「域名」值
     * @param val
     */
    IrRuleDTO setDomainForce(String domainForce) {
        this.domainForce = domainForce
        return this
    }


    /**
     * 设置「全局」值
     * 字典[是否]
     * @param val
     */
    IrRuleDTO setGlobal(Integer global) {
        this.global = global
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrRuleDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IrRuleDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「创建」值
     * 字典[是否]
     * @param val
     */
    IrRuleDTO setPermCreate(Integer permCreate) {
        this.permCreate = permCreate
        return this
    }


    /**
     * 设置「读取」值
     * 字典[是否]
     * @param val
     */
    IrRuleDTO setPermRead(Integer permRead) {
        this.permRead = permRead
        return this
    }


    /**
     * 设置「删除」值
     * 字典[是否]
     * @param val
     */
    IrRuleDTO setPermUnlink(Integer permUnlink) {
        this.permUnlink = permUnlink
        return this
    }


    /**
     * 设置「写入」值
     * 字典[是否]
     * @param val
     */
    IrRuleDTO setPermWrite(Integer permWrite) {
        this.permWrite = permWrite
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrRuleDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    IrRuleDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
