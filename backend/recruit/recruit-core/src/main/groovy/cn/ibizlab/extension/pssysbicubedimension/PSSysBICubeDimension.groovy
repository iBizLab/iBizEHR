package cn.ibizlab.extension.pssysbicubedimension

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.pssysbicubedimension.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSSYSBICUBEDIMENSION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSSysBICubeDimension extends GroovyPSModelDERuntime<PSSysBICubeDimension,PSSysBICubeDimensionDTO,PSSysBICubeDimensionFilterDTO> {

    public static final String ACTION_APPLY = "APPLY"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSSysBICubeDimension _instance
    void setInstance(PSSysBICubeDimension instance) {
        _instance = instance
    }
    static PSSysBICubeDimension getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSSysBICubeDimensionDTO create(PSSysBICubeDimensionDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSSysBICubeDimensionDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSSysBICubeDimensionDTO update(PSSysBICubeDimensionDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSSysBICubeDimensionDTO.class)
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
    PSSysBICubeDimensionDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSSysBICubeDimensionDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSSysBICubeDimensionDTO getDraft(PSSysBICubeDimensionDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSSysBICubeDimensionDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSSysBICubeDimensionDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSSysBICubeDimensionDTO save(PSSysBICubeDimensionDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSSysBICubeDimensionDTO.class)
    }

    /**
     * 行为：应用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_APPLY)
    def apply(PSSysBICubeDimensionDTO dto) throws Throwable {
        this.execute(ACTION_APPLY, dto, PSSysBICubeDimensionDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSSysBICubeDimensionDTO> fetchDefault(PSSysBICubeDimensionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSSysBICubeDimensionDTO.class)
    }

}