package cn.ibizlab.hr.hrrecruitmentprogress

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrrecruitmentprogress.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_RECRUITMENT_PROGRESS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrRecruitmentProgress extends GroovyDataEntityRuntime<HrRecruitmentProgress,HrRecruitmentProgressDTO,HrRecruitmentProgressFilterDTO> {

    public static final String ACTION_DISABLE = "disable"
    public static final String ACTION_ENABLE = "enable"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrRecruitmentProgress _instance
    void setInstance(HrRecruitmentProgress instance) {
        _instance = instance
    }
    static HrRecruitmentProgress getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrRecruitmentProgressDTO create(HrRecruitmentProgressDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrRecruitmentProgressDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrRecruitmentProgressDTO update(HrRecruitmentProgressDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrRecruitmentProgressDTO.class)
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
    HrRecruitmentProgressDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrRecruitmentProgressDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrRecruitmentProgressDTO getDraft(HrRecruitmentProgressDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrRecruitmentProgressDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrRecruitmentProgressDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrRecruitmentProgressDTO save(HrRecruitmentProgressDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrRecruitmentProgressDTO.class)
    }

    /**
     * 行为：停用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DISABLE)
    def disable(HrRecruitmentProgressDTO dto) throws Throwable {
        this.execute(ACTION_DISABLE, dto, HrRecruitmentProgressDTO.class)
    }

    /**
     * 行为：启用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ENABLE)
    def enable(HrRecruitmentProgressDTO dto) throws Throwable {
        this.execute(ACTION_ENABLE, dto, HrRecruitmentProgressDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrRecruitmentProgressDTO> fetchDefault(HrRecruitmentProgressFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrRecruitmentProgressDTO.class)
    }

}