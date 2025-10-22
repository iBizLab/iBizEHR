package cn.ibizlab.mail.mailaliasdomain

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.mail.mailaliasdomain.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_ALIAS_DOMAIN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailAliasDomain extends GroovyDataEntityRuntime<MailAliasDomain,MailAliasDomainDTO,MailAliasDomainFilterDTO> {

    private static MailAliasDomain _instance
    void setInstance(MailAliasDomain instance) {
        _instance = instance
    }
    static MailAliasDomain getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailAliasDomainDTO create(MailAliasDomainDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailAliasDomainDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailAliasDomainDTO update(MailAliasDomainDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailAliasDomainDTO.class)
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
    MailAliasDomainDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailAliasDomainDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailAliasDomainDTO getDraft(MailAliasDomainDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailAliasDomainDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailAliasDomainDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailAliasDomainDTO save(MailAliasDomainDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailAliasDomainDTO.class)
    }

}