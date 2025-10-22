package cn.ibizlab.extension.pssysbicube

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.pssysbicube.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSSYSBICUBE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSSysBICube extends GroovyPSModelDERuntime<PSSysBICube,PSSysBICubeDTO,PSSysBICubeFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSSysBICube _instance
    void setInstance(PSSysBICube instance) {
        _instance = instance
    }
    static PSSysBICube getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSSysBICubeDTO create(PSSysBICubeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSSysBICubeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSSysBICubeDTO update(PSSysBICubeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSSysBICubeDTO.class)
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
    PSSysBICubeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSSysBICubeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSSysBICubeDTO getDraft(PSSysBICubeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSSysBICubeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSSysBICubeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSSysBICubeDTO save(PSSysBICubeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSSysBICubeDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSSysBICubeDTO> fetchDefault(PSSysBICubeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSSysBICubeDTO.class)
    }

}