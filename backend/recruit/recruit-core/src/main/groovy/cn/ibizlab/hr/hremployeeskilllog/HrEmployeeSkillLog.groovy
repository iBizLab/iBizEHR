package cn.ibizlab.hr.hremployeeskilllog

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hremployeeskilllog.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_EMPLOYEE_SKILL_LOG]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrEmployeeSkillLog extends GroovyDataEntityRuntime<HrEmployeeSkillLog,HrEmployeeSkillLogDTO,HrEmployeeSkillLogFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrEmployeeSkillLog _instance
    void setInstance(HrEmployeeSkillLog instance) {
        _instance = instance
    }
    static HrEmployeeSkillLog getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrEmployeeSkillLogDTO create(HrEmployeeSkillLogDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrEmployeeSkillLogDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrEmployeeSkillLogDTO update(HrEmployeeSkillLogDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrEmployeeSkillLogDTO.class)
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
    HrEmployeeSkillLogDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrEmployeeSkillLogDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrEmployeeSkillLogDTO getDraft(HrEmployeeSkillLogDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrEmployeeSkillLogDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrEmployeeSkillLogDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrEmployeeSkillLogDTO save(HrEmployeeSkillLogDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrEmployeeSkillLogDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrEmployeeSkillLogDTO> fetchDefault(HrEmployeeSkillLogFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrEmployeeSkillLogDTO.class)
    }

}