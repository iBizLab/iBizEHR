package cn.ibizlab.extension.pssysbicubemeasure

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.pssysbicubemeasure.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSSYSBICUBEMEASURE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSSysBICubeMeasure extends GroovyPSModelDERuntime<PSSysBICubeMeasure,PSSysBICubeMeasureDTO,PSSysBICubeMeasureFilterDTO> {

    public static final String ACTION_APPLY = "APPLY"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSSysBICubeMeasure _instance
    void setInstance(PSSysBICubeMeasure instance) {
        _instance = instance
    }
    static PSSysBICubeMeasure getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSSysBICubeMeasureDTO create(PSSysBICubeMeasureDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSSysBICubeMeasureDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSSysBICubeMeasureDTO update(PSSysBICubeMeasureDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSSysBICubeMeasureDTO.class)
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
    PSSysBICubeMeasureDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSSysBICubeMeasureDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSSysBICubeMeasureDTO getDraft(PSSysBICubeMeasureDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSSysBICubeMeasureDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSSysBICubeMeasureDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSSysBICubeMeasureDTO save(PSSysBICubeMeasureDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSSysBICubeMeasureDTO.class)
    }

    /**
     * 行为：应用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_APPLY)
    def apply(PSSysBICubeMeasureDTO dto) throws Throwable {
        this.execute(ACTION_APPLY, dto, PSSysBICubeMeasureDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSSysBICubeMeasureDTO> fetchDefault(PSSysBICubeMeasureFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSSysBICubeMeasureDTO.class)
    }

}