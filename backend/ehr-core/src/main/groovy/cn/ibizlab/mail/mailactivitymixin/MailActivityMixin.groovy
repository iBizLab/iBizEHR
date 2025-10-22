package cn.ibizlab.mail.mailactivitymixin

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.mail.mailactivitymixin.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_ACTIVITY_MIXIN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailActivityMixin extends GroovyDataEntityRuntime<MailActivityMixin,MailActivityMixinDTO,MailActivityMixinFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static MailActivityMixin _instance
    void setInstance(MailActivityMixin instance) {
        _instance = instance
    }
    static MailActivityMixin getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailActivityMixinDTO create(MailActivityMixinDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailActivityMixinDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailActivityMixinDTO update(MailActivityMixinDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailActivityMixinDTO.class)
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
    MailActivityMixinDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailActivityMixinDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailActivityMixinDTO getDraft(MailActivityMixinDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailActivityMixinDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailActivityMixinDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailActivityMixinDTO save(MailActivityMixinDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailActivityMixinDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailActivityMixinDTO> fetchDefault(MailActivityMixinFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailActivityMixinDTO.class)
    }

}