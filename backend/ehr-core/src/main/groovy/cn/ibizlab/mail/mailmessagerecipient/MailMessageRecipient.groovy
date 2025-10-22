package cn.ibizlab.mail.mailmessagerecipient

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.mail.mailmessagerecipient.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_MESSAGE_RECIPIENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailMessageRecipient extends GroovyDataEntityRuntime<MailMessageRecipient,MailMessageRecipientDTO,MailMessageRecipientFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static MailMessageRecipient _instance
    void setInstance(MailMessageRecipient instance) {
        _instance = instance
    }
    static MailMessageRecipient getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailMessageRecipientDTO create(MailMessageRecipientDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailMessageRecipientDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailMessageRecipientDTO update(MailMessageRecipientDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailMessageRecipientDTO.class)
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
    MailMessageRecipientDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailMessageRecipientDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailMessageRecipientDTO getDraft(MailMessageRecipientDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailMessageRecipientDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailMessageRecipientDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailMessageRecipientDTO save(MailMessageRecipientDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailMessageRecipientDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailMessageRecipientDTO> fetchDefault(MailMessageRecipientFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailMessageRecipientDTO.class)
    }

}