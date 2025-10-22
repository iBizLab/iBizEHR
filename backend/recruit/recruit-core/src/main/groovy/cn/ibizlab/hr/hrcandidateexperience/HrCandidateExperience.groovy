package cn.ibizlab.hr.hrcandidateexperience

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrcandidateexperience.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_CANDIDATE_EXPERIENCE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrCandidateExperience extends GroovyDataEntityRuntime<HrCandidateExperience,HrCandidateExperienceDTO,HrCandidateExperienceFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrCandidateExperience _instance
    void setInstance(HrCandidateExperience instance) {
        _instance = instance
    }
    static HrCandidateExperience getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrCandidateExperienceDTO create(HrCandidateExperienceDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrCandidateExperienceDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrCandidateExperienceDTO update(HrCandidateExperienceDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrCandidateExperienceDTO.class)
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
    HrCandidateExperienceDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrCandidateExperienceDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrCandidateExperienceDTO getDraft(HrCandidateExperienceDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrCandidateExperienceDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrCandidateExperienceDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrCandidateExperienceDTO save(HrCandidateExperienceDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrCandidateExperienceDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrCandidateExperienceDTO> fetchDefault(HrCandidateExperienceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrCandidateExperienceDTO.class)
    }

}