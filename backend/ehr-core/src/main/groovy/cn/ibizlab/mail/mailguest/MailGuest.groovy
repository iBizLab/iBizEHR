package cn.ibizlab.mail.mailguest

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.mail.mailguest.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_GUEST]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailGuest extends GroovyDataEntityRuntime<MailGuest,MailGuestDTO,MailGuestFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static MailGuest _instance
    void setInstance(MailGuest instance) {
        _instance = instance
    }
    static MailGuest getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailGuestDTO create(MailGuestDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailGuestDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailGuestDTO update(MailGuestDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailGuestDTO.class)
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
    MailGuestDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailGuestDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailGuestDTO getDraft(MailGuestDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailGuestDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailGuestDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailGuestDTO save(MailGuestDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailGuestDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailGuestDTO> fetchDefault(MailGuestFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailGuestDTO.class)
    }

}