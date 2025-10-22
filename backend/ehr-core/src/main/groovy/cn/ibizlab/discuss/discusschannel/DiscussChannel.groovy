package cn.ibizlab.discuss.discusschannel

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.discuss.discusschannel.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DISCUSS_CHANNEL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DiscussChannel extends GroovyDataEntityRuntime<DiscussChannel,DiscussChannelDTO,DiscussChannelFilterDTO> {

    public static final String ACTION_ACTION_UNFOLLOW = "action_unfollow"
    public static final String ACTION_ADD_MEMBERS = "add_members"
    public static final String ACTION_CHANNEL_JOIN = "channel_join"
    public static final String ACTION_JOIN_CHANNEL = "join_channel"
    public static final String ACTION_SET_MESSAGE_PIN = "set_message_pin"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_USER_PUBLIC = "cur_user_public"
    public static final String DATASET_GROUP_PRIVATE = "group_private"
    public static final String DATASET_PUBLIC = "public"
    private static DiscussChannel _instance
    void setInstance(DiscussChannel instance) {
        _instance = instance
    }
    static DiscussChannel getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DiscussChannelDTO create(DiscussChannelDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DiscussChannelDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DiscussChannelDTO update(DiscussChannelDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DiscussChannelDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    DiscussChannelDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DiscussChannelDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DiscussChannelDTO getDraft(DiscussChannelDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DiscussChannelDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DiscussChannelDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DiscussChannelDTO save(DiscussChannelDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DiscussChannelDTO.class)
    }

    /**
     * 行为：退出频道 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ACTION_UNFOLLOW)
    def actionUnfollow(DiscussChannelDTO dto) throws Throwable {
        this.execute(ACTION_ACTION_UNFOLLOW, dto, DiscussChannelDTO.class)
    }

    /**
     * 行为：邀请成员 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_MEMBERS)
    def addMembers(DiscussChannelDTO dto) throws Throwable {
        this.execute(ACTION_ADD_MEMBERS, dto, DiscussChannelDTO.class)
    }

    /**
     * 行为：加入频道 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANNEL_JOIN)
    def channelJoin(DiscussChannelDTO dto) throws Throwable {
        this.execute(ACTION_CHANNEL_JOIN, dto, DiscussChannelDTO.class)
    }

    /**
     * 行为：加入频道 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_JOIN_CHANNEL)
    def joinChannel(DiscussChannelDTO dto) throws Throwable {
        this.execute(ACTION_JOIN_CHANNEL, dto, DiscussChannelDTO.class)
    }

    /**
     * 行为：设置置顶消息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET_MESSAGE_PIN)
    def setMessagePin(DiscussChannelDTO dto) throws Throwable {
        this.execute(ACTION_SET_MESSAGE_PIN, dto, DiscussChannelDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DiscussChannelDTO> fetchDefault(DiscussChannelFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DiscussChannelDTO.class)
    }

    /**
     * 数据集：当前用户加入公共频道 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_USER_PUBLIC)
    Page<DiscussChannelDTO> fetchCurUserPublic(DiscussChannelFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER_PUBLIC, context, DiscussChannelDTO.class)
    }

    /**
     * 数据集：群聊和私人频道查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_GROUP_PRIVATE)
    Page<DiscussChannelDTO> fetchGroupPrivate(DiscussChannelFilterDTO context) throws Throwable {
        return this.fetch(DATASET_GROUP_PRIVATE, context, DiscussChannelDTO.class)
    }

    /**
     * 数据集：公共频道查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PUBLIC)
    Page<DiscussChannelDTO> fetchPublic(DiscussChannelFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PUBLIC, context, DiscussChannelDTO.class)
    }

}