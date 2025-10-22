package cn.ibizlab.extension.psdelogicnode

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.psdelogicnode.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSDELOGICNODE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSDELogicNode extends GroovyPSModelDERuntime<PSDELogicNode,PSDELogicNodeDTO,PSDELogicNodeFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSDELogicNode _instance
    void setInstance(PSDELogicNode instance) {
        _instance = instance
    }
    static PSDELogicNode getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSDELogicNodeDTO create(PSDELogicNodeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSDELogicNodeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSDELogicNodeDTO update(PSDELogicNodeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSDELogicNodeDTO.class)
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
    PSDELogicNodeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSDELogicNodeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSDELogicNodeDTO getDraft(PSDELogicNodeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSDELogicNodeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSDELogicNodeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSDELogicNodeDTO save(PSDELogicNodeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSDELogicNodeDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSDELogicNodeDTO> fetchDefault(PSDELogicNodeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSDELogicNodeDTO.class)
    }

}