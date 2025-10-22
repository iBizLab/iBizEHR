package cn.ibizlab.extension.pscoreprdcat

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.pscoreprdcat.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSCOREPRDCAT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSCorePrdCat extends GroovyPSModelDERuntime<PSCorePrdCat,PSCorePrdCatDTO,PSCorePrdCatFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSCorePrdCat _instance
    void setInstance(PSCorePrdCat instance) {
        _instance = instance
    }
    static PSCorePrdCat getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSCorePrdCatDTO create(PSCorePrdCatDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSCorePrdCatDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSCorePrdCatDTO update(PSCorePrdCatDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSCorePrdCatDTO.class)
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
    PSCorePrdCatDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSCorePrdCatDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSCorePrdCatDTO getDraft(PSCorePrdCatDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSCorePrdCatDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSCorePrdCatDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSCorePrdCatDTO save(PSCorePrdCatDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSCorePrdCatDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSCorePrdCatDTO> fetchDefault(PSCorePrdCatFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSCorePrdCatDTO.class)
    }

}