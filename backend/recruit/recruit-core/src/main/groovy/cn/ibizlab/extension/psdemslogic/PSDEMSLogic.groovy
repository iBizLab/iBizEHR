package cn.ibizlab.extension.psdemslogic

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.psdemslogic.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSDEMSLOGIC]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSDEMSLogic extends GroovyPSModelDERuntime<PSDEMSLogic,PSDEMSLogicDTO,PSDEMSLogicFilterDTO> {

    public static final String ACTION_APPLY = "APPLY"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSDEMSLogic _instance
    void setInstance(PSDEMSLogic instance) {
        _instance = instance
    }
    static PSDEMSLogic getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSDEMSLogicDTO create(PSDEMSLogicDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSDEMSLogicDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSDEMSLogicDTO update(PSDEMSLogicDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSDEMSLogicDTO.class)
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
    PSDEMSLogicDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSDEMSLogicDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSDEMSLogicDTO getDraft(PSDEMSLogicDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSDEMSLogicDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSDEMSLogicDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSDEMSLogicDTO save(PSDEMSLogicDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSDEMSLogicDTO.class)
    }

    /**
     * 行为：应用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_APPLY)
    def apply(PSDEMSLogicDTO dto) throws Throwable {
        this.execute(ACTION_APPLY, dto, PSDEMSLogicDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSDEMSLogicDTO> fetchDefault(PSDEMSLogicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSDEMSLogicDTO.class)
    }

}