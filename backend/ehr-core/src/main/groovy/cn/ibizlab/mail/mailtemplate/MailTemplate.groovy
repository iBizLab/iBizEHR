package cn.ibizlab.mail.mailtemplate

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.mail.mailtemplate.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_TEMPLATE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailTemplate extends GroovyDataEntityRuntime<MailTemplate,MailTemplateDTO,MailTemplateFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static MailTemplate _instance
    void setInstance(MailTemplate instance) {
        _instance = instance
    }
    static MailTemplate getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailTemplateDTO create(MailTemplateDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailTemplateDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailTemplateDTO update(MailTemplateDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailTemplateDTO.class)
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
    MailTemplateDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailTemplateDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailTemplateDTO getDraft(MailTemplateDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailTemplateDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailTemplateDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailTemplateDTO save(MailTemplateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailTemplateDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailTemplateDTO> fetchDefault(MailTemplateFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailTemplateDTO.class)
    }

}