package cn.ibizlab.hr.hrtalentpool

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrtalentpool.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_TALENT_POOL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrTalentPool extends GroovyDataEntityRuntime<HrTalentPool,HrTalentPoolDTO,HrTalentPoolFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrTalentPool _instance
    void setInstance(HrTalentPool instance) {
        _instance = instance
    }
    static HrTalentPool getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrTalentPoolDTO create(HrTalentPoolDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrTalentPoolDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrTalentPoolDTO update(HrTalentPoolDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrTalentPoolDTO.class)
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
    HrTalentPoolDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrTalentPoolDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrTalentPoolDTO getDraft(HrTalentPoolDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrTalentPoolDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrTalentPoolDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrTalentPoolDTO save(HrTalentPoolDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrTalentPoolDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrTalentPoolDTO> fetchDefault(HrTalentPoolFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrTalentPoolDTO.class)
    }

}