package cn.ibizlab.hr.hrcandidatetalentpool

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrcandidatetalentpool.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_CANDIDATE_TALENT_POOL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrCandidateTalentPool extends GroovyDataEntityRuntime<HrCandidateTalentPool,HrCandidateTalentPoolDTO,HrCandidateTalentPoolFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrCandidateTalentPool _instance
    void setInstance(HrCandidateTalentPool instance) {
        _instance = instance
    }
    static HrCandidateTalentPool getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrCandidateTalentPoolDTO create(HrCandidateTalentPoolDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrCandidateTalentPoolDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrCandidateTalentPoolDTO update(HrCandidateTalentPoolDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrCandidateTalentPoolDTO.class)
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
    HrCandidateTalentPoolDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrCandidateTalentPoolDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrCandidateTalentPoolDTO getDraft(HrCandidateTalentPoolDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrCandidateTalentPoolDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrCandidateTalentPoolDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrCandidateTalentPoolDTO save(HrCandidateTalentPoolDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrCandidateTalentPoolDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrCandidateTalentPoolDTO> fetchDefault(HrCandidateTalentPoolFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrCandidateTalentPoolDTO.class)
    }

}