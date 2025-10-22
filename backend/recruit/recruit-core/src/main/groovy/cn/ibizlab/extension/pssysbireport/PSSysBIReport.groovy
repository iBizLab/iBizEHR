package cn.ibizlab.extension.pssysbireport

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.pssysbireport.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSSYSBIREPORT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSSysBIReport extends GroovyPSModelDERuntime<PSSysBIReport,PSSysBIReportDTO,PSSysBIReportFilterDTO> {

    public static final String ACTION_APPLY = "APPLY"
    public static final String ACTION_COMPILEAPPBIREPORT = "COMPILEAPPBIREPORT"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSSysBIReport _instance
    void setInstance(PSSysBIReport instance) {
        _instance = instance
    }
    static PSSysBIReport getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSSysBIReportDTO create(PSSysBIReportDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSSysBIReportDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSSysBIReportDTO update(PSSysBIReportDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSSysBIReportDTO.class)
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
    PSSysBIReportDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSSysBIReportDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSSysBIReportDTO getDraft(PSSysBIReportDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSSysBIReportDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSSysBIReportDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSSysBIReportDTO save(PSSysBIReportDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSSysBIReportDTO.class)
    }

    /**
     * 行为：应用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_APPLY)
    def apply(PSSysBIReportDTO dto) throws Throwable {
        this.execute(ACTION_APPLY, dto, PSSysBIReportDTO.class)
    }

    /**
     * 行为：编译报表模型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COMPILEAPPBIREPORT)
    def compileAppBIReport(PSSysBIReportDTO dto) throws Throwable {
        this.execute(ACTION_COMPILEAPPBIREPORT, dto, PSSysBIReportDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSSysBIReportDTO> fetchDefault(PSSysBIReportFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSSysBIReportDTO.class)
    }

}