package cn.ibizlab.base.comment.dto

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
class CommentDTO extends GroovyDTO<CommentDTO> {

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
     * 「父标识」
     */
    @JsonProperty("pid")
    String pid
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime
    /**
     * 「更新人」
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「建立人」
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「评论主体标识」
     */
    @JsonProperty("principal_id")
    String principalId
    /**
     * 「评论主体名称」
     */
    @JsonProperty("principal_name")
    String principalName
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「评论主体类型」
     */
    @JsonProperty("principal_type")
    String principalType
    /**
     * 「内容」
     */
    @JsonProperty("content")
    String content
    /**
     * 「父内容」
     */
    @JsonProperty("pcontent")
    String pcontent
    /**
     * 「父建立人」
     */
    @JsonProperty("pcreate_man")
    String pcreateMan
    /**
     * 「是否置顶」
     * 字典[是否]
     */
    @JsonProperty("is_top")
    Integer isTop

    /**
     * 设置「标识」值
     * @param val
     */
    CommentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CommentDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    CommentDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CommentDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    CommentDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    CommentDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    CommentDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「评论主体标识」值
     * @param val
     */
    CommentDTO setPrincipalId(String principalId) {
        this.principalId = principalId
        return this
    }


    /**
     * 设置「评论主体名称」值
     * @param val
     */
    CommentDTO setPrincipalName(String principalName) {
        this.principalName = principalName
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    CommentDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「评论主体类型」值
     * @param val
     */
    CommentDTO setPrincipalType(String principalType) {
        this.principalType = principalType
        return this
    }


    /**
     * 设置「内容」值
     * @param val
     */
    CommentDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「父内容」值
     * @param val
     */
    CommentDTO setPcontent(String pcontent) {
        this.pcontent = pcontent
        return this
    }


    /**
     * 设置「父建立人」值
     * @param val
     */
    CommentDTO setPcreateMan(String pcreateMan) {
        this.pcreateMan = pcreateMan
        return this
    }


    /**
     * 设置「是否置顶」值
     * 字典[是否]
     * @param val
     */
    CommentDTO setIsTop(Integer isTop) {
        this.isTop = isTop
        return this
    }

}
