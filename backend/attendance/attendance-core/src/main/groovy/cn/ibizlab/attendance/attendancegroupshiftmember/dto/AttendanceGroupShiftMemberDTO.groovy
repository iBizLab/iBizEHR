package cn.ibizlab.attendance.attendancegroupshiftmember.dto

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
class AttendanceGroupShiftMemberDTO extends GroovyDTO<AttendanceGroupShiftMemberDTO> {

    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("write_uid")
    String writeUid
    /**
     * 「更新时间」
     */
    @JsonProperty("write_date")
    Timestamp writeDate
    /**
     * 「成员类型」
     * 字典[成员类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「父标识」
     */
    @JsonProperty("parent_id")
    String parentId
    /**
     * 「规则标识」
     */
    @JsonProperty("rule_id")
    String ruleId
    /**
     * 「组排班标识」
     */
    @JsonProperty("group_id")
    String groupId
    /**
     * 「主键」
     */
    @JsonProperty("id")
    String id
    /**
     * 「标识」
     */
    @JsonProperty("user_id")
    String userId

    /**
     * 设置「名称」值
     * @param val
     */
    AttendanceGroupShiftMemberDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceGroupShiftMemberDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AttendanceGroupShiftMemberDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceGroupShiftMemberDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceGroupShiftMemberDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「成员类型」值
     * 字典[成员类型]
     * @param val
     */
    AttendanceGroupShiftMemberDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    AttendanceGroupShiftMemberDTO setParentId(String parentId) {
        this.parentId = parentId
        return this
    }


    /**
     * 设置「规则标识」值
     * @param val
     */
    AttendanceGroupShiftMemberDTO setRuleId(String ruleId) {
        this.ruleId = ruleId
        return this
    }


    /**
     * 设置「组排班标识」值
     * @param val
     */
    AttendanceGroupShiftMemberDTO setGroupId(String groupId) {
        this.groupId = groupId
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    AttendanceGroupShiftMemberDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    AttendanceGroupShiftMemberDTO setUserId(String userId) {
        this.userId = userId
        return this
    }

}
