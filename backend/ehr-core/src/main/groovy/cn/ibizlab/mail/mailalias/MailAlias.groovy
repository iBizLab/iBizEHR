package cn.ibizlab.mail.mailalias

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.mail.mailalias.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_ALIAS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailAlias extends GroovyDataEntityRuntime<MailAlias,MailAliasDTO,MailAliasFilterDTO> {

    private static MailAlias _instance
    void setInstance(MailAlias instance) {
        _instance = instance
    }
    static MailAlias getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailAliasDTO create(MailAliasDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailAliasDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailAliasDTO update(MailAliasDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailAliasDTO.class)
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
    MailAliasDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailAliasDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailAliasDTO getDraft(MailAliasDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailAliasDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailAliasDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailAliasDTO save(MailAliasDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailAliasDTO.class)
    }

}