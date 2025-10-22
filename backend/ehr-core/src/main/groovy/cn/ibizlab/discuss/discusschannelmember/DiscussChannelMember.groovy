package cn.ibizlab.discuss.discusschannelmember

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.discuss.discusschannelmember.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DISCUSS_CHANNEL_MEMBER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DiscussChannelMember extends GroovyDataEntityRuntime<DiscussChannelMember,DiscussChannelMemberDTO,DiscussChannelMemberFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static DiscussChannelMember _instance
    void setInstance(DiscussChannelMember instance) {
        _instance = instance
    }
    static DiscussChannelMember getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DiscussChannelMemberDTO create(DiscussChannelMemberDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DiscussChannelMemberDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DiscussChannelMemberDTO update(DiscussChannelMemberDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DiscussChannelMemberDTO.class)
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
    DiscussChannelMemberDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DiscussChannelMemberDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DiscussChannelMemberDTO getDraft(DiscussChannelMemberDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DiscussChannelMemberDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DiscussChannelMemberDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DiscussChannelMemberDTO save(DiscussChannelMemberDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DiscussChannelMemberDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<DiscussChannelMemberDTO> fetchDefault(DiscussChannelMemberFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DiscussChannelMemberDTO.class)
    }

}