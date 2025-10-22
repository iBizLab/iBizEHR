package cn.ibizlab.mail.mailfollowers

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.mail.mailfollowers.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_FOLLOWERS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailFollowers extends GroovyDataEntityRuntime<MailFollowers,MailFollowersDTO,MailFollowersFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_COMMON = "common"
    public static final String DATASET_MAIL_MESSAGE_ATTENTION = "mail_message_attention"
    private static MailFollowers _instance
    void setInstance(MailFollowers instance) {
        _instance = instance
    }
    static MailFollowers getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailFollowersDTO create(MailFollowersDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailFollowersDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailFollowersDTO update(MailFollowersDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailFollowersDTO.class)
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
    MailFollowersDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailFollowersDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailFollowersDTO getDraft(MailFollowersDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailFollowersDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailFollowersDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailFollowersDTO save(MailFollowersDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailFollowersDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailFollowersDTO> fetchDefault(MailFollowersFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailFollowersDTO.class)
    }

    /**
     * 数据集：常规 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMON)
    Page<MailFollowersDTO> fetchCommon(MailFollowersFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMON, context, MailFollowersDTO.class)
    }

    /**
     * 数据集：评论提醒 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MAIL_MESSAGE_ATTENTION)
    Page<MailFollowersPartnerIdDTO> fetchMailMessageAttention(MailFollowersFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MAIL_MESSAGE_ATTENTION, context, MailFollowersPartnerIdDTO.class)
    }

}