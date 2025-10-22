package cn.ibizlab.hr.hrinterviewschedule

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrinterviewschedule.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_INTERVIEW_SCHEDULE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrInterviewSchedule extends GroovyDataEntityRuntime<HrInterviewSchedule,HrInterviewScheduleDTO,HrInterviewScheduleFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrInterviewSchedule _instance
    void setInstance(HrInterviewSchedule instance) {
        _instance = instance
    }
    static HrInterviewSchedule getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrInterviewScheduleDTO create(HrInterviewScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrInterviewScheduleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrInterviewScheduleDTO update(HrInterviewScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrInterviewScheduleDTO.class)
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
    HrInterviewScheduleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrInterviewScheduleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrInterviewScheduleDTO getDraft(HrInterviewScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrInterviewScheduleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrInterviewScheduleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrInterviewScheduleDTO save(HrInterviewScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrInterviewScheduleDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrInterviewScheduleDTO> fetchDefault(HrInterviewScheduleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrInterviewScheduleDTO.class)
    }

}