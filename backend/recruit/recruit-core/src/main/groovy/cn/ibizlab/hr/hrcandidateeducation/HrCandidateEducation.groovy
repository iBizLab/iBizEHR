package cn.ibizlab.hr.hrcandidateeducation

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrcandidateeducation.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_CANDIDATE_EDUCATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrCandidateEducation extends GroovyDataEntityRuntime<HrCandidateEducation,HrCandidateEducationDTO,HrCandidateEducationFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrCandidateEducation _instance
    void setInstance(HrCandidateEducation instance) {
        _instance = instance
    }
    static HrCandidateEducation getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrCandidateEducationDTO create(HrCandidateEducationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrCandidateEducationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrCandidateEducationDTO update(HrCandidateEducationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrCandidateEducationDTO.class)
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
    HrCandidateEducationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrCandidateEducationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrCandidateEducationDTO getDraft(HrCandidateEducationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrCandidateEducationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrCandidateEducationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrCandidateEducationDTO save(HrCandidateEducationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrCandidateEducationDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrCandidateEducationDTO> fetchDefault(HrCandidateEducationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrCandidateEducationDTO.class)
    }

}