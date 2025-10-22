package cn.ibizlab.hr.hrskill

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrskill.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_SKILL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrSkill extends GroovyDataEntityRuntime<HrSkill,HrSkillDTO,HrSkillFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrSkill _instance
    void setInstance(HrSkill instance) {
        _instance = instance
    }
    static HrSkill getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrSkillDTO create(HrSkillDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrSkillDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrSkillDTO update(HrSkillDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrSkillDTO.class)
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
    HrSkillDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrSkillDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrSkillDTO getDraft(HrSkillDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrSkillDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrSkillDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrSkillDTO save(HrSkillDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrSkillDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrSkillDTO> fetchDefault(HrSkillFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrSkillDTO.class)
    }

}