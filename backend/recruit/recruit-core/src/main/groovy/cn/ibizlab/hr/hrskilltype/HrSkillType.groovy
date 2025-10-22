package cn.ibizlab.hr.hrskilltype

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrskilltype.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_SKILL_TYPE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrSkillType extends GroovyDataEntityRuntime<HrSkillType,HrSkillTypeDTO,HrSkillTypeFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrSkillType _instance
    void setInstance(HrSkillType instance) {
        _instance = instance
    }
    static HrSkillType getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrSkillTypeDTO create(HrSkillTypeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrSkillTypeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrSkillTypeDTO update(HrSkillTypeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrSkillTypeDTO.class)
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
    HrSkillTypeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrSkillTypeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrSkillTypeDTO getDraft(HrSkillTypeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrSkillTypeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrSkillTypeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrSkillTypeDTO save(HrSkillTypeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrSkillTypeDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrSkillTypeDTO> fetchDefault(HrSkillTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrSkillTypeDTO.class)
    }

}