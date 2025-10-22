package cn.ibizlab.mail.mailactivityplantemplate

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.mail.mailactivityplantemplate.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_ACTIVITY_PLAN_TEMPLATE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailActivityPlanTemplate extends GroovyDataEntityRuntime<MailActivityPlanTemplate,MailActivityPlanTemplateDTO,MailActivityPlanTemplateFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static MailActivityPlanTemplate _instance
    void setInstance(MailActivityPlanTemplate instance) {
        _instance = instance
    }
    static MailActivityPlanTemplate getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailActivityPlanTemplateDTO create(MailActivityPlanTemplateDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailActivityPlanTemplateDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailActivityPlanTemplateDTO update(MailActivityPlanTemplateDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailActivityPlanTemplateDTO.class)
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
    MailActivityPlanTemplateDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailActivityPlanTemplateDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailActivityPlanTemplateDTO getDraft(MailActivityPlanTemplateDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailActivityPlanTemplateDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailActivityPlanTemplateDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailActivityPlanTemplateDTO save(MailActivityPlanTemplateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailActivityPlanTemplateDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailActivityPlanTemplateDTO> fetchDefault(MailActivityPlanTemplateFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailActivityPlanTemplateDTO.class)
    }

}