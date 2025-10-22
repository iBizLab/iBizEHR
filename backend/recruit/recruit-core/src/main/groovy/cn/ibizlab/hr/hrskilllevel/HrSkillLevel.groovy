package cn.ibizlab.hr.hrskilllevel

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrskilllevel.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_SKILL_LEVEL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrSkillLevel extends GroovyDataEntityRuntime<HrSkillLevel,HrSkillLevelDTO,HrSkillLevelFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrSkillLevel _instance
    void setInstance(HrSkillLevel instance) {
        _instance = instance
    }
    static HrSkillLevel getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrSkillLevelDTO create(HrSkillLevelDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrSkillLevelDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrSkillLevelDTO update(HrSkillLevelDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrSkillLevelDTO.class)
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
    HrSkillLevelDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrSkillLevelDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrSkillLevelDTO getDraft(HrSkillLevelDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrSkillLevelDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrSkillLevelDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrSkillLevelDTO save(HrSkillLevelDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrSkillLevelDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrSkillLevelDTO> fetchDefault(HrSkillLevelFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrSkillLevelDTO.class)
    }

}