package cn.ibizlab.discuss.discusschannel.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.base.irattachment.dto.IrAttachmentDTO
import cn.ibizlab.mail.mailfollowers.dto.MailFollowersDTO
import cn.ibizlab.discuss.discusschannelmember.dto.DiscussChannelMemberDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class DiscussChannelDTO extends GroovyDTO<DiscussChannelDTO> {

    /**
     * 「附件集合」
     */
    @JsonProperty("attachments")
    List<IrAttachmentDTO> attachments
    /**
     * 「关注者」
     */
    @JsonProperty("followers")
    List<MailFollowersDTO> followers
    /**
     * 「成员」
     */
    @JsonProperty("members")
    String members
    /**
     * 「频道成员」
     */
    @JsonProperty("channel_members")
    List<DiscussChannelMemberDTO> channelMembers
    /**
     * 「有效」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
    /**
     * 「允许公开上传」
     * 字典[是否]
     */
    @JsonProperty("allow_public_upload")
    Integer allowPublicUpload
    /**
     * 「头像缓存键」
     */
    @JsonProperty("avatar_cache_key")
    String avatarCacheKey
    /**
     * 「频道类型」
     * 字典[频道类型]
     */
    @JsonProperty("channel_type")
    String channelType
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
     * 「默认显示模式」
     * 字典[默认显示模式]
     */
    @JsonProperty("default_display_mode")
    String defaultDisplayMode
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「来自消息」
     */
    @JsonProperty("from_message_id")
    String fromMessageId
    /**
     * 「授权群组」
     */
    @JsonProperty("group_public_id")
    String groupPublicId
    /**
     * 「授权群组」
     */
    @JsonProperty("group_public_name")
    String groupPublicName
    /**
     * 「有消息」
     * 字典[是否]
     */
    @JsonProperty("has_message")
    Integer hasMessage
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「邀请URL」
     */
    @JsonProperty("invitation_url")
    String invitationUrl
    /**
     * 「能编辑」
     * 字典[是否]
     */
    @JsonProperty("is_editable")
    Integer isEditable
    /**
     * 「是会员」
     * 字典[是否]
     */
    @JsonProperty("is_member")
    Integer isMember
    /**
     * 「持续的兴趣」
     */
    @JsonProperty("last_interest_dt")
    Timestamp lastInterestDt
    /**
     * 「成员计数」
     */
    @JsonProperty("member_count")
    Integer memberCount
    /**
     * 「附件数量」
     */
    @JsonProperty("message_attachment_count")
    Integer messageAttachmentCount
    /**
     * 「消息发送错误」
     * 字典[是否]
     */
    @JsonProperty("message_has_error")
    Integer messageHasError
    /**
     * 「错误数量」
     */
    @JsonProperty("message_has_error_counter")
    Integer messageHasErrorCounter
    /**
     * 「短信发送错误」
     * 字典[是否]
     */
    @JsonProperty("message_has_sms_error")
    Integer messageHasSmsError
    /**
     * 「是关注者」
     * 字典[是否]
     */
    @JsonProperty("message_is_follower")
    Integer messageIsFollower
    /**
     * 「待处理」
     * 字典[是否]
     */
    @JsonProperty("message_needaction")
    Integer messageNeedaction
    /**
     * 「操作数量」
     */
    @JsonProperty("message_needaction_counter")
    Integer messageNeedactionCounter
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「父频道」
     */
    @JsonProperty("parent_channel_id")
    String parentChannelId
    /**
     * 「父频道名称」
     */
    @JsonProperty("parent_channel_name")
    String parentChannelName
    /**
     * 「Sfu 频道 Uuid」
     */
    @JsonProperty("sfu_channel_uuid")
    String sfuChannelUuid
    /**
     * 「Sfu 服务器网址」
     */
    @JsonProperty("sfu_server_url")
    String sfuServerUrl
    /**
     * 「UUID」
     */
    @JsonProperty("uuid")
    String uuid
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
     * 设置「附件集合」值
     * @param val
     */
    DiscussChannelDTO setAttachments(List<IrAttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「关注者」值
     * @param val
     */
    DiscussChannelDTO setFollowers(List<MailFollowersDTO> followers) {
        this.followers = followers
        return this
    }


    /**
     * 设置「成员」值
     * @param val
     */
    DiscussChannelDTO setMembers(String members) {
        this.members = members
        return this
    }


    /**
     * 设置「频道成员」值
     * @param val
     */
    DiscussChannelDTO setChannelMembers(List<DiscussChannelMemberDTO> channelMembers) {
        this.channelMembers = channelMembers
        return this
    }


    /**
     * 设置「有效」值
     * 字典[是否]
     * @param val
     */
    DiscussChannelDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「允许公开上传」值
     * 字典[是否]
     * @param val
     */
    DiscussChannelDTO setAllowPublicUpload(Integer allowPublicUpload) {
        this.allowPublicUpload = allowPublicUpload
        return this
    }


    /**
     * 设置「头像缓存键」值
     * @param val
     */
    DiscussChannelDTO setAvatarCacheKey(String avatarCacheKey) {
        this.avatarCacheKey = avatarCacheKey
        return this
    }


    /**
     * 设置「频道类型」值
     * 字典[频道类型]
     * @param val
     */
    DiscussChannelDTO setChannelType(String channelType) {
        this.channelType = channelType
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    DiscussChannelDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    DiscussChannelDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「默认显示模式」值
     * 字典[默认显示模式]
     * @param val
     */
    DiscussChannelDTO setDefaultDisplayMode(String defaultDisplayMode) {
        this.defaultDisplayMode = defaultDisplayMode
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    DiscussChannelDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    DiscussChannelDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「来自消息」值
     * @param val
     */
    DiscussChannelDTO setFromMessageId(String fromMessageId) {
        this.fromMessageId = fromMessageId
        return this
    }


    /**
     * 设置「授权群组」值
     * @param val
     */
    DiscussChannelDTO setGroupPublicId(String groupPublicId) {
        this.groupPublicId = groupPublicId
        return this
    }


    /**
     * 设置「授权群组」值
     * @param val
     */
    DiscussChannelDTO setGroupPublicName(String groupPublicName) {
        this.groupPublicName = groupPublicName
        return this
    }


    /**
     * 设置「有消息」值
     * 字典[是否]
     * @param val
     */
    DiscussChannelDTO setHasMessage(Integer hasMessage) {
        this.hasMessage = hasMessage
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DiscussChannelDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「邀请URL」值
     * @param val
     */
    DiscussChannelDTO setInvitationUrl(String invitationUrl) {
        this.invitationUrl = invitationUrl
        return this
    }


    /**
     * 设置「能编辑」值
     * 字典[是否]
     * @param val
     */
    DiscussChannelDTO setIsEditable(Integer isEditable) {
        this.isEditable = isEditable
        return this
    }


    /**
     * 设置「是会员」值
     * 字典[是否]
     * @param val
     */
    DiscussChannelDTO setIsMember(Integer isMember) {
        this.isMember = isMember
        return this
    }


    /**
     * 设置「持续的兴趣」值
     * @param val
     */
    DiscussChannelDTO setLastInterestDt(Timestamp lastInterestDt) {
        this.lastInterestDt = lastInterestDt
        return this
    }


    /**
     * 设置「成员计数」值
     * @param val
     */
    DiscussChannelDTO setMemberCount(Integer memberCount) {
        this.memberCount = memberCount
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    DiscussChannelDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「消息发送错误」值
     * 字典[是否]
     * @param val
     */
    DiscussChannelDTO setMessageHasError(Integer messageHasError) {
        this.messageHasError = messageHasError
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    DiscussChannelDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「短信发送错误」值
     * 字典[是否]
     * @param val
     */
    DiscussChannelDTO setMessageHasSmsError(Integer messageHasSmsError) {
        this.messageHasSmsError = messageHasSmsError
        return this
    }


    /**
     * 设置「是关注者」值
     * 字典[是否]
     * @param val
     */
    DiscussChannelDTO setMessageIsFollower(Integer messageIsFollower) {
        this.messageIsFollower = messageIsFollower
        return this
    }


    /**
     * 设置「待处理」值
     * 字典[是否]
     * @param val
     */
    DiscussChannelDTO setMessageNeedaction(Integer messageNeedaction) {
        this.messageNeedaction = messageNeedaction
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    DiscussChannelDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    DiscussChannelDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「父频道」值
     * @param val
     */
    DiscussChannelDTO setParentChannelId(String parentChannelId) {
        this.parentChannelId = parentChannelId
        return this
    }


    /**
     * 设置「父频道名称」值
     * @param val
     */
    DiscussChannelDTO setParentChannelName(String parentChannelName) {
        this.parentChannelName = parentChannelName
        return this
    }


    /**
     * 设置「Sfu 频道 Uuid」值
     * @param val
     */
    DiscussChannelDTO setSfuChannelUuid(String sfuChannelUuid) {
        this.sfuChannelUuid = sfuChannelUuid
        return this
    }


    /**
     * 设置「Sfu 服务器网址」值
     * @param val
     */
    DiscussChannelDTO setSfuServerUrl(String sfuServerUrl) {
        this.sfuServerUrl = sfuServerUrl
        return this
    }


    /**
     * 设置「UUID」值
     * @param val
     */
    DiscussChannelDTO setUuid(String uuid) {
        this.uuid = uuid
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DiscussChannelDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    DiscussChannelDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
