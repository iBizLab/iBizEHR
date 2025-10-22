package cn.ibizlab.discuss.discusschannelmember.dto

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
class DiscussChannelMemberDTO extends GroovyDTO<DiscussChannelMemberDTO> {

    /**
     * 「频道」
     */
    @JsonProperty("channel_id")
    String channelId
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
     * 「自定义频道名称」
     */
    @JsonProperty("custom_channel_name")
    String customChannelName
    /**
     * 「定制通知」
     * 字典[定制通知]
     */
    @JsonProperty("custom_notifications")
    String customNotifications
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「最后一次提取」
     */
    @JsonProperty("fetched_message_id")
    String fetchedMessageId
    /**
     * 「对话收拢状态」
     * 字典[对话收拢状态]
     */
    @JsonProperty("fold_state")
    String foldState
    /**
     * 「访客」
     */
    @JsonProperty("guest_id")
    String guestId
    /**
     * 「访客」
     */
    @JsonProperty("guest_name")
    String guestName
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「是否置顶」
     * 字典[是否]
     */
    @JsonProperty("is_pinned")
    Integer isPinned
    /**
     * 「是自我」
     * 字典[是否]
     */
    @JsonProperty("is_self")
    Integer isSelf
    /**
     * 「持续的兴趣」
     */
    @JsonProperty("last_interest_dt")
    Timestamp lastInterestDt
    /**
     * 「上次查看日期」
     */
    @JsonProperty("last_seen_dt")
    Timestamp lastSeenDt
    /**
     * 「未读消息数」
     */
    @JsonProperty("message_unread_counter")
    Integer messageUnreadCounter
    /**
     * 「静音通知，直到」
     */
    @JsonProperty("mute_until_dt")
    Timestamp muteUntilDt
    /**
     * 「新信息分割符」
     */
    @JsonProperty("new_message_separator")
    Integer newMessageSeparator
    /**
     * 「合作伙伴」
     */
    @JsonProperty("partner_id")
    String partnerId
    /**
     * 「合作伙伴」
     */
    @JsonProperty("partner_name")
    String partnerName
    /**
     * 「振铃会话」
     */
    @JsonProperty("rtc_inviting_session_id")
    String rtcInvitingSessionId
    /**
     * 「最近一次查阅」
     */
    @JsonProperty("seen_message_id")
    String seenMessageId
    /**
     * 「取消置顶日期」
     */
    @JsonProperty("unpin_dt")
    Timestamp unpinDt
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
     * 设置「频道」值
     * @param val
     */
    DiscussChannelMemberDTO setChannelId(String channelId) {
        this.channelId = channelId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    DiscussChannelMemberDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    DiscussChannelMemberDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「自定义频道名称」值
     * @param val
     */
    DiscussChannelMemberDTO setCustomChannelName(String customChannelName) {
        this.customChannelName = customChannelName
        return this
    }


    /**
     * 设置「定制通知」值
     * 字典[定制通知]
     * @param val
     */
    DiscussChannelMemberDTO setCustomNotifications(String customNotifications) {
        this.customNotifications = customNotifications
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    DiscussChannelMemberDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「最后一次提取」值
     * @param val
     */
    DiscussChannelMemberDTO setFetchedMessageId(String fetchedMessageId) {
        this.fetchedMessageId = fetchedMessageId
        return this
    }


    /**
     * 设置「对话收拢状态」值
     * 字典[对话收拢状态]
     * @param val
     */
    DiscussChannelMemberDTO setFoldState(String foldState) {
        this.foldState = foldState
        return this
    }


    /**
     * 设置「访客」值
     * @param val
     */
    DiscussChannelMemberDTO setGuestId(String guestId) {
        this.guestId = guestId
        return this
    }


    /**
     * 设置「访客」值
     * @param val
     */
    DiscussChannelMemberDTO setGuestName(String guestName) {
        this.guestName = guestName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DiscussChannelMemberDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「是否置顶」值
     * 字典[是否]
     * @param val
     */
    DiscussChannelMemberDTO setIsPinned(Integer isPinned) {
        this.isPinned = isPinned
        return this
    }


    /**
     * 设置「是自我」值
     * 字典[是否]
     * @param val
     */
    DiscussChannelMemberDTO setIsSelf(Integer isSelf) {
        this.isSelf = isSelf
        return this
    }


    /**
     * 设置「持续的兴趣」值
     * @param val
     */
    DiscussChannelMemberDTO setLastInterestDt(Timestamp lastInterestDt) {
        this.lastInterestDt = lastInterestDt
        return this
    }


    /**
     * 设置「上次查看日期」值
     * @param val
     */
    DiscussChannelMemberDTO setLastSeenDt(Timestamp lastSeenDt) {
        this.lastSeenDt = lastSeenDt
        return this
    }


    /**
     * 设置「未读消息数」值
     * @param val
     */
    DiscussChannelMemberDTO setMessageUnreadCounter(Integer messageUnreadCounter) {
        this.messageUnreadCounter = messageUnreadCounter
        return this
    }


    /**
     * 设置「静音通知，直到」值
     * @param val
     */
    DiscussChannelMemberDTO setMuteUntilDt(Timestamp muteUntilDt) {
        this.muteUntilDt = muteUntilDt
        return this
    }


    /**
     * 设置「新信息分割符」值
     * @param val
     */
    DiscussChannelMemberDTO setNewMessageSeparator(Integer newMessageSeparator) {
        this.newMessageSeparator = newMessageSeparator
        return this
    }


    /**
     * 设置「合作伙伴」值
     * @param val
     */
    DiscussChannelMemberDTO setPartnerId(String partnerId) {
        this.partnerId = partnerId
        return this
    }


    /**
     * 设置「合作伙伴」值
     * @param val
     */
    DiscussChannelMemberDTO setPartnerName(String partnerName) {
        this.partnerName = partnerName
        return this
    }


    /**
     * 设置「振铃会话」值
     * @param val
     */
    DiscussChannelMemberDTO setRtcInvitingSessionId(String rtcInvitingSessionId) {
        this.rtcInvitingSessionId = rtcInvitingSessionId
        return this
    }


    /**
     * 设置「最近一次查阅」值
     * @param val
     */
    DiscussChannelMemberDTO setSeenMessageId(String seenMessageId) {
        this.seenMessageId = seenMessageId
        return this
    }


    /**
     * 设置「取消置顶日期」值
     * @param val
     */
    DiscussChannelMemberDTO setUnpinDt(Timestamp unpinDt) {
        this.unpinDt = unpinDt
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DiscussChannelMemberDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    DiscussChannelMemberDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
