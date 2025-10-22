package cn.ibizlab.mail.mailactivitytype

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.mail.mailactivitytype.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_ACTIVITY_TYPE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailActivityType extends GroovyDataEntityRuntime<MailActivityType,MailActivityTypeDTO,MailActivityTypeFilterDTO> {

    public static final String ACTION_GET_DATE_DEADLINE = "get_date_deadline"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_RES_AND_SYS = "res_and_sys"
    private static MailActivityType _instance
    void setInstance(MailActivityType instance) {
        _instance = instance
    }
    static MailActivityType getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailActivityTypeDTO create(MailActivityTypeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailActivityTypeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailActivityTypeDTO update(MailActivityTypeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailActivityTypeDTO.class)
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
    MailActivityTypeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailActivityTypeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailActivityTypeDTO getDraft(MailActivityTypeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailActivityTypeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailActivityTypeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailActivityTypeDTO save(MailActivityTypeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailActivityTypeDTO.class)
    }

    /**
     * 行为：获取到期日期 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_DATE_DEADLINE)
    def getDateDeadline(MailActivityTypeDTO dto) throws Throwable {
        this.execute(ACTION_GET_DATE_DEADLINE, dto, MailActivityTypeDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailActivityTypeDTO> fetchDefault(MailActivityTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailActivityTypeDTO.class)
    }

    /**
     * 数据集：资源类型及系统 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RES_AND_SYS)
    Page<MailActivityTypeDTO> fetchResAndSys(MailActivityTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RES_AND_SYS, context, MailActivityTypeDTO.class)
    }

}