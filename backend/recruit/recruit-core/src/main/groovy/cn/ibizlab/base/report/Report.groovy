package cn.ibizlab.base.report

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.report.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[REPORT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Report extends GroovyDataEntityRuntime<Report,ReportDTO,ReportFilterDTO> {

    public static final String ACTION_SYNC_MODEL = "sync_model"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Report _instance
    void setInstance(Report instance) {
        _instance = instance
    }
    static Report getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ReportDTO create(ReportDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ReportDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ReportDTO update(ReportDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ReportDTO.class)
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
    ReportDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ReportDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ReportDTO getDraft(ReportDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ReportDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ReportDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ReportDTO save(ReportDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ReportDTO.class)
    }

    /**
     * 行为：同步模板模型 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SYNC_MODEL)
    def syncModel(ReportDTO dto) throws Throwable {
        this.execute(ACTION_SYNC_MODEL, dto, ReportDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ReportDTO> fetchDefault(ReportFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ReportDTO.class)
    }

}