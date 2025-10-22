package cn.ibizlab.extension.psdelogiclink

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.psdelogiclink.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSDELOGICLINK]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSDELogicLink extends GroovyPSModelDERuntime<PSDELogicLink,PSDELogicLinkDTO,PSDELogicLinkFilterDTO> {

    public static final String DATASET_CURITEMBYDSCNODE = "CurItemByDscNode"
    public static final String DATASET_CURITEMBYSRCNODE = "CurItemBySrcNode"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSDELogicLink _instance
    void setInstance(PSDELogicLink instance) {
        _instance = instance
    }
    static PSDELogicLink getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSDELogicLinkDTO create(PSDELogicLinkDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSDELogicLinkDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSDELogicLinkDTO update(PSDELogicLinkDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSDELogicLinkDTO.class)
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
    PSDELogicLinkDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSDELogicLinkDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSDELogicLinkDTO getDraft(PSDELogicLinkDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSDELogicLinkDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSDELogicLinkDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSDELogicLinkDTO save(PSDELogicLinkDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSDELogicLinkDTO.class)
    }

    /**
     * 数据集：目标节点相关连线 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CURITEMBYDSCNODE)
    Page<PSDELogicLinkDTO> fetchCurItemByDscNode(PSDELogicLinkFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CURITEMBYDSCNODE, context, PSDELogicLinkDTO.class)
    }

    /**
     * 数据集：源节点相关连线 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CURITEMBYSRCNODE)
    Page<PSDELogicLinkDTO> fetchCurItemBySrcNode(PSDELogicLinkFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CURITEMBYSRCNODE, context, PSDELogicLinkDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSDELogicLinkDTO> fetchDefault(PSDELogicLinkFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSDELogicLinkDTO.class)
    }

}