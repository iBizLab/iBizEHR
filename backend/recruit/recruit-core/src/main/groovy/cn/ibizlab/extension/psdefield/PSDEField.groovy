package cn.ibizlab.extension.psdefield

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.psdefield.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSDEFIELD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSDEField extends GroovyPSModelDERuntime<PSDEField,PSDEFieldDTO,PSDEFieldFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSDEField _instance
    void setInstance(PSDEField instance) {
        _instance = instance
    }
    static PSDEField getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSDEFieldDTO create(PSDEFieldDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSDEFieldDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSDEFieldDTO update(PSDEFieldDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSDEFieldDTO.class)
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
    PSDEFieldDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSDEFieldDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSDEFieldDTO getDraft(PSDEFieldDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSDEFieldDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSDEFieldDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSDEFieldDTO save(PSDEFieldDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSDEFieldDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSDEFieldDTO> fetchDefault(PSDEFieldFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSDEFieldDTO.class)
    }

}