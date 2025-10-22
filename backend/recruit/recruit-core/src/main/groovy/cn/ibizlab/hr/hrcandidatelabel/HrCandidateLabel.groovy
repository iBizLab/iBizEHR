package cn.ibizlab.hr.hrcandidatelabel

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrcandidatelabel.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_CANDIDATE_LABEL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrCandidateLabel extends GroovyDataEntityRuntime<HrCandidateLabel,HrCandidateLabelDTO,HrCandidateLabelFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrCandidateLabel _instance
    void setInstance(HrCandidateLabel instance) {
        _instance = instance
    }
    static HrCandidateLabel getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrCandidateLabelDTO create(HrCandidateLabelDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrCandidateLabelDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrCandidateLabelDTO update(HrCandidateLabelDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrCandidateLabelDTO.class)
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
    HrCandidateLabelDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrCandidateLabelDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrCandidateLabelDTO getDraft(HrCandidateLabelDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrCandidateLabelDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrCandidateLabelDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrCandidateLabelDTO save(HrCandidateLabelDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrCandidateLabelDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrCandidateLabelDTO> fetchDefault(HrCandidateLabelFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrCandidateLabelDTO.class)
    }

}