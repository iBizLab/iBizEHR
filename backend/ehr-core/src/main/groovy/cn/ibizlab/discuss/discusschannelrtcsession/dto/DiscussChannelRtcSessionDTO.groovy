package cn.ibizlab.discuss.discusschannelrtcsession.dto

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
class DiscussChannelRtcSessionDTO extends GroovyDTO<DiscussChannelRtcSessionDTO> {

    /**
     * 「频道」
     */
    @JsonProperty("channel_id")
    String channelId
    /**
     * 「频道成员」
     */
    @JsonProperty("channel_member_id")
    String channelMemberId
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
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「正在发送用户视频」
     * 字典[是否]
     */
    @JsonProperty("is_camera_on")
    Integer isCameraOn
    /**
     * 「禁用来电声音」
     * 字典[是否]
     */
    @JsonProperty("is_deaf")
    Integer isDeaf
    /**
     * 「麦克风静音」
     * 字典[是否]
     */
    @JsonProperty("is_muted")
    Integer isMuted
    /**
     * 「正在共享屏幕」
     * 字典[是否]
     */
    @JsonProperty("is_screen_sharing_on")
    Integer isScreenSharingOn
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
    DiscussChannelRtcSessionDTO setChannelId(String channelId) {
        this.channelId = channelId
        return this
    }


    /**
     * 设置「频道成员」值
     * @param val
     */
    DiscussChannelRtcSessionDTO setChannelMemberId(String channelMemberId) {
        this.channelMemberId = channelMemberId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    DiscussChannelRtcSessionDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    DiscussChannelRtcSessionDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    DiscussChannelRtcSessionDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DiscussChannelRtcSessionDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「正在发送用户视频」值
     * 字典[是否]
     * @param val
     */
    DiscussChannelRtcSessionDTO setIsCameraOn(Integer isCameraOn) {
        this.isCameraOn = isCameraOn
        return this
    }


    /**
     * 设置「禁用来电声音」值
     * 字典[是否]
     * @param val
     */
    DiscussChannelRtcSessionDTO setIsDeaf(Integer isDeaf) {
        this.isDeaf = isDeaf
        return this
    }


    /**
     * 设置「麦克风静音」值
     * 字典[是否]
     * @param val
     */
    DiscussChannelRtcSessionDTO setIsMuted(Integer isMuted) {
        this.isMuted = isMuted
        return this
    }


    /**
     * 设置「正在共享屏幕」值
     * 字典[是否]
     * @param val
     */
    DiscussChannelRtcSessionDTO setIsScreenSharingOn(Integer isScreenSharingOn) {
        this.isScreenSharingOn = isScreenSharingOn
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DiscussChannelRtcSessionDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    DiscussChannelRtcSessionDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
