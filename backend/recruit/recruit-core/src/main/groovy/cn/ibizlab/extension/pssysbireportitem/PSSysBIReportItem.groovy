package cn.ibizlab.extension.pssysbireportitem

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.pssysbireportitem.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSSYSBIREPORTITEM]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSSysBIReportItem extends GroovyPSModelDERuntime<PSSysBIReportItem,PSSysBIReportItemDTO,PSSysBIReportItemFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSSysBIReportItem _instance
    void setInstance(PSSysBIReportItem instance) {
        _instance = instance
    }
    static PSSysBIReportItem getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSSysBIReportItemDTO create(PSSysBIReportItemDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSSysBIReportItemDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSSysBIReportItemDTO update(PSSysBIReportItemDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSSysBIReportItemDTO.class)
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
    PSSysBIReportItemDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSSysBIReportItemDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSSysBIReportItemDTO getDraft(PSSysBIReportItemDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSSysBIReportItemDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSSysBIReportItemDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSSysBIReportItemDTO save(PSSysBIReportItemDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSSysBIReportItemDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSSysBIReportItemDTO> fetchDefault(PSSysBIReportItemFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSSysBIReportItemDTO.class)
    }

}