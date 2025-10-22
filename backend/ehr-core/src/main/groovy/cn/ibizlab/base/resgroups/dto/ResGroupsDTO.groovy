package cn.ibizlab.base.resgroups.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.base.rulegrouprel.dto.RuleGroupRelDTO
import cn.ibizlab.base.resgroupsusersrel.dto.ResGroupsUsersRelDTO
import cn.ibizlab.base.resgroupsimpliedrel.dto.ResGroupsImpliedRelDTO
import cn.ibizlab.base.irmodelaccess.dto.IrModelAccessDTO
import cn.ibizlab.baseextend.uniresgrouprel.dto.UniresGroupRelDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ResGroupsDTO extends GroovyDTO<ResGroupsDTO> {

    /**
     * 「规则权限引用」
     */
    @JsonProperty("rule_group_rels")
    List<RuleGroupRelDTO> ruleGroupRels
    /**
     * 「权限组用户」
     */
    @JsonProperty("groups_users_rels")
    List<ResGroupsUsersRelDTO> groupsUsersRels
    /**
     * 「API 密钥最长有效期（天）」
     */
    @JsonProperty("api_key_duration")
    Double apiKeyDuration
    /**
     * 「应用」
     */
    @JsonProperty("category_id")
    String categoryId
    /**
     * 「应用」
     */
    @JsonProperty("category_name")
    String categoryName
    /**
     * 「颜色索引」
     */
    @JsonProperty("color")
    Integer color
    /**
     * 「评论」
     */
    @JsonProperty("comment")
    String comment
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
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「组名称」
     */
    @JsonProperty("full_name")
    String fullName
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
     * 「共享组」
     * 字典[是否]
     */
    @JsonProperty("share")
    Integer share
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
     * 「null」
     */
    @JsonProperty("groups_implied_rels")
    List<ResGroupsImpliedRelDTO> groupsImpliedRels
    /**
     * 「null」
     */
    @JsonProperty("model_access")
    List<IrModelAccessDTO> modelAccess
    /**
     * 「null」
     */
    @JsonProperty("unires_group_rels")
    List<UniresGroupRelDTO> uniresGroupRels

    /**
     * 设置「规则权限引用」值
     * @param val
     */
    ResGroupsDTO setRuleGroupRels(List<RuleGroupRelDTO> ruleGroupRels) {
        this.ruleGroupRels = ruleGroupRels
        return this
    }


    /**
     * 设置「权限组用户」值
     * @param val
     */
    ResGroupsDTO setGroupsUsersRels(List<ResGroupsUsersRelDTO> groupsUsersRels) {
        this.groupsUsersRels = groupsUsersRels
        return this
    }


    /**
     * 设置「API 密钥最长有效期（天）」值
     * @param val
     */
    ResGroupsDTO setApiKeyDuration(Double apiKeyDuration) {
        this.apiKeyDuration = apiKeyDuration
        return this
    }


    /**
     * 设置「应用」值
     * @param val
     */
    ResGroupsDTO setCategoryId(String categoryId) {
        this.categoryId = categoryId
        return this
    }


    /**
     * 设置「应用」值
     * @param val
     */
    ResGroupsDTO setCategoryName(String categoryName) {
        this.categoryName = categoryName
        return this
    }


    /**
     * 设置「颜色索引」值
     * @param val
     */
    ResGroupsDTO setColor(Integer color) {
        this.color = color
        return this
    }


    /**
     * 设置「评论」值
     * @param val
     */
    ResGroupsDTO setComment(String comment) {
        this.comment = comment
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ResGroupsDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    ResGroupsDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    ResGroupsDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「组名称」值
     * @param val
     */
    ResGroupsDTO setFullName(String fullName) {
        this.fullName = fullName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResGroupsDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ResGroupsDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「共享组」值
     * 字典[是否]
     * @param val
     */
    ResGroupsDTO setShare(Integer share) {
        this.share = share
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ResGroupsDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    ResGroupsDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    ResGroupsDTO setGroupsImpliedRels(List<ResGroupsImpliedRelDTO> groupsImpliedRels) {
        this.groupsImpliedRels = groupsImpliedRels
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    ResGroupsDTO setModelAccess(List<IrModelAccessDTO> modelAccess) {
        this.modelAccess = modelAccess
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    ResGroupsDTO setUniresGroupRels(List<UniresGroupRelDTO> uniresGroupRels) {
        this.uniresGroupRels = uniresGroupRels
        return this
    }

}
