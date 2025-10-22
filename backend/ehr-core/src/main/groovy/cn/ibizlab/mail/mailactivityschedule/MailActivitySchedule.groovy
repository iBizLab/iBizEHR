package cn.ibizlab.mail.mailactivityschedule

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.mail.mailactivityschedule.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_ACTIVITY_SCHEDULE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailActivitySchedule extends GroovyDataEntityRuntime<MailActivitySchedule,MailActivityScheduleDTO,MailActivityScheduleFilterDTO> {

    public static final String ACTION_ACTION_SCHEDULE_ACTIVITIES = "action_schedule_activities"
    public static final String ACTION_SCHEDULE_ACTIVITIES_DONE = "schedule_activities_done"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static MailActivitySchedule _instance
    void setInstance(MailActivitySchedule instance) {
        _instance = instance
    }
    static MailActivitySchedule getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailActivityScheduleDTO create(MailActivityScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailActivityScheduleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailActivityScheduleDTO update(MailActivityScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailActivityScheduleDTO.class)
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
    MailActivityScheduleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailActivityScheduleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailActivityScheduleDTO getDraft(MailActivityScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailActivityScheduleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailActivityScheduleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailActivityScheduleDTO save(MailActivityScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailActivityScheduleDTO.class)
    }

    /**
     * 行为：安排 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ACTION_SCHEDULE_ACTIVITIES)
    def actionScheduleActivities(MailActivityScheduleDTO dto) throws Throwable {
        this.execute(ACTION_ACTION_SCHEDULE_ACTIVITIES, dto, MailActivityScheduleDTO.class)
    }

    /**
     * 行为：安排并标记完成 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SCHEDULE_ACTIVITIES_DONE)
    def scheduleActivitiesDone(MailActivityScheduleDTO dto) throws Throwable {
        this.execute(ACTION_SCHEDULE_ACTIVITIES_DONE, dto, MailActivityScheduleDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailActivityScheduleDTO> fetchDefault(MailActivityScheduleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailActivityScheduleDTO.class)
    }

}