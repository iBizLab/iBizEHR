package cn.ibizlab.hr.hrcandidateskill

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrcandidateskill.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_CANDIDATE_SKILL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrCandidateSkill extends GroovyDataEntityRuntime<HrCandidateSkill,HrCandidateSkillDTO,HrCandidateSkillFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrCandidateSkill _instance
    void setInstance(HrCandidateSkill instance) {
        _instance = instance
    }
    static HrCandidateSkill getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrCandidateSkillDTO create(HrCandidateSkillDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrCandidateSkillDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrCandidateSkillDTO update(HrCandidateSkillDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrCandidateSkillDTO.class)
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
    HrCandidateSkillDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrCandidateSkillDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrCandidateSkillDTO getDraft(HrCandidateSkillDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrCandidateSkillDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrCandidateSkillDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrCandidateSkillDTO save(HrCandidateSkillDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrCandidateSkillDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrCandidateSkillDTO> fetchDefault(HrCandidateSkillFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrCandidateSkillDTO.class)
    }

}