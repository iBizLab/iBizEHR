package cn.ibizlab.discuss.discusschannelrtcsession

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.discuss.discusschannelrtcsession.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DISCUSS_CHANNEL_RTC_SESSION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DiscussChannelRtcSession extends GroovyDataEntityRuntime<DiscussChannelRtcSession,DiscussChannelRtcSessionDTO,DiscussChannelRtcSessionFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static DiscussChannelRtcSession _instance
    void setInstance(DiscussChannelRtcSession instance) {
        _instance = instance
    }
    static DiscussChannelRtcSession getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DiscussChannelRtcSessionDTO create(DiscussChannelRtcSessionDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DiscussChannelRtcSessionDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DiscussChannelRtcSessionDTO update(DiscussChannelRtcSessionDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DiscussChannelRtcSessionDTO.class)
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
    DiscussChannelRtcSessionDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DiscussChannelRtcSessionDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DiscussChannelRtcSessionDTO getDraft(DiscussChannelRtcSessionDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DiscussChannelRtcSessionDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DiscussChannelRtcSessionDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DiscussChannelRtcSessionDTO save(DiscussChannelRtcSessionDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DiscussChannelRtcSessionDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DiscussChannelRtcSessionDTO> fetchDefault(DiscussChannelRtcSessionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DiscussChannelRtcSessionDTO.class)
    }

}