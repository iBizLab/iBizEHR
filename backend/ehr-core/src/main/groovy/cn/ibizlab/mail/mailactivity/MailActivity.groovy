package cn.ibizlab.mail.mailactivity

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.mail.mailactivity.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_ACTIVITY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailActivity extends GroovyDataEntityRuntime<MailActivity,MailActivityDTO,MailActivityFilterDTO> {

    public static final String ACTION_ACTION_DONE = "action_done"
    public static final String ACTION_ACTION_SNOOZE = "action_snooze"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_UN_FINISHED = "un_finished"
    private static MailActivity _instance
    void setInstance(MailActivity instance) {
        _instance = instance
    }
    static MailActivity getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailActivityDTO create(MailActivityDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailActivityDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailActivityDTO update(MailActivityDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailActivityDTO.class)
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
    MailActivityDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailActivityDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailActivityDTO getDraft(MailActivityDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailActivityDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailActivityDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailActivityDTO save(MailActivityDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailActivityDTO.class)
    }

    /**
     * 行为：完成活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ACTION_DONE)
    def actionDone(MailActivityDTO dto) throws Throwable {
        this.execute(ACTION_ACTION_DONE, dto, MailActivityDTO.class)
    }

    /**
     * 行为：延迟活动 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ACTION_SNOOZE)
    def actionSnooze(MailActivityDTO dto) throws Throwable {
        this.execute(ACTION_ACTION_SNOOZE, dto, MailActivityDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailActivityDTO> fetchDefault(MailActivityFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailActivityDTO.class)
    }

    /**
     * 数据集：未完成 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_UN_FINISHED)
    Page<MailActivityDTO> fetchUnFinished(MailActivityFilterDTO context) throws Throwable {
        return this.fetch(DATASET_UN_FINISHED, context, MailActivityDTO.class)
    }

}