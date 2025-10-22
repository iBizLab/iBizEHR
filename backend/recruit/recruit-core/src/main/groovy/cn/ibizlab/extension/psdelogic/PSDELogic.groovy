package cn.ibizlab.extension.psdelogic

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.psdelogic.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSDELOGIC]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSDELogic extends GroovyPSModelDERuntime<PSDELogic,PSDELogicDTO,PSDELogicFilterDTO> {

    public static final String ACTION_APPLY = "APPLY"
    public static final String ACTION_DISABLE = "DISABLE"
    public static final String ACTION_ENABLE = "ENABLE"
    public static final String ACTION_GET_LAST_RUN_INFO = "get_last_run_info"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSDELogic _instance
    void setInstance(PSDELogic instance) {
        _instance = instance
    }
    static PSDELogic getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSDELogicDTO create(PSDELogicDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSDELogicDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSDELogicDTO update(PSDELogicDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSDELogicDTO.class)
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
    PSDELogicDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSDELogicDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSDELogicDTO getDraft(PSDELogicDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSDELogicDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSDELogicDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSDELogicDTO save(PSDELogicDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSDELogicDTO.class)
    }

    /**
     * 行为：应用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_APPLY)
    def apply(PSDELogicDTO dto) throws Throwable {
        this.execute(ACTION_APPLY, dto, PSDELogicDTO.class)
    }

    /**
     * 行为：禁用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DISABLE)
    def disable(PSDELogicDTO dto) throws Throwable {
        this.execute(ACTION_DISABLE, dto, PSDELogicDTO.class)
    }

    /**
     * 行为：启用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ENABLE)
    def enable(PSDELogicDTO dto) throws Throwable {
        this.execute(ACTION_ENABLE, dto, PSDELogicDTO.class)
    }

    /**
     * 行为：获取最后运行信息 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_LAST_RUN_INFO)
    def getLastRunInfo(String key) throws Throwable {
        return this.execute(ACTION_GET_LAST_RUN_INFO, key, PSDELogicDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSDELogicDTO> fetchDefault(PSDELogicFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSDELogicDTO.class)
    }

}