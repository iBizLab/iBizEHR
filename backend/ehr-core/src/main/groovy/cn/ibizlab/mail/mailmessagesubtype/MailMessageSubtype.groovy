package cn.ibizlab.mail.mailmessagesubtype

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.mail.mailmessagesubtype.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_MESSAGE_SUBTYPE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailMessageSubtype extends GroovyDataEntityRuntime<MailMessageSubtype,MailMessageSubtypeDTO,MailMessageSubtypeFilterDTO> {

    private static MailMessageSubtype _instance
    void setInstance(MailMessageSubtype instance) {
        _instance = instance
    }
    static MailMessageSubtype getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailMessageSubtypeDTO create(MailMessageSubtypeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailMessageSubtypeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailMessageSubtypeDTO update(MailMessageSubtypeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailMessageSubtypeDTO.class)
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
    MailMessageSubtypeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailMessageSubtypeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailMessageSubtypeDTO getDraft(MailMessageSubtypeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailMessageSubtypeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailMessageSubtypeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailMessageSubtypeDTO save(MailMessageSubtypeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailMessageSubtypeDTO.class)
    }

}