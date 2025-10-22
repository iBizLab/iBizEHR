package cn.ibizlab.hr.hrrecruitmentdegree

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrrecruitmentdegree.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_RECRUITMENT_DEGREE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrRecruitmentDegree extends GroovyDataEntityRuntime<HrRecruitmentDegree,HrRecruitmentDegreeDTO,HrRecruitmentDegreeFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrRecruitmentDegree _instance
    void setInstance(HrRecruitmentDegree instance) {
        _instance = instance
    }
    static HrRecruitmentDegree getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrRecruitmentDegreeDTO create(HrRecruitmentDegreeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrRecruitmentDegreeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrRecruitmentDegreeDTO update(HrRecruitmentDegreeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrRecruitmentDegreeDTO.class)
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
    HrRecruitmentDegreeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrRecruitmentDegreeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrRecruitmentDegreeDTO getDraft(HrRecruitmentDegreeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrRecruitmentDegreeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrRecruitmentDegreeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrRecruitmentDegreeDTO save(HrRecruitmentDegreeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrRecruitmentDegreeDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrRecruitmentDegreeDTO> fetchDefault(HrRecruitmentDegreeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrRecruitmentDegreeDTO.class)
    }

}