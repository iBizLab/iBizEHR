package cn.ibizlab.hr.hrrecruitmentsource

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrrecruitmentsource.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_RECRUITMENT_SOURCE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrRecruitmentSource extends GroovyDataEntityRuntime<HrRecruitmentSource,HrRecruitmentSourceDTO,HrRecruitmentSourceFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrRecruitmentSource _instance
    void setInstance(HrRecruitmentSource instance) {
        _instance = instance
    }
    static HrRecruitmentSource getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrRecruitmentSourceDTO create(HrRecruitmentSourceDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrRecruitmentSourceDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrRecruitmentSourceDTO update(HrRecruitmentSourceDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrRecruitmentSourceDTO.class)
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
    HrRecruitmentSourceDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrRecruitmentSourceDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrRecruitmentSourceDTO getDraft(HrRecruitmentSourceDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrRecruitmentSourceDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrRecruitmentSourceDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrRecruitmentSourceDTO save(HrRecruitmentSourceDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrRecruitmentSourceDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrRecruitmentSourceDTO> fetchDefault(HrRecruitmentSourceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrRecruitmentSourceDTO.class)
    }

}