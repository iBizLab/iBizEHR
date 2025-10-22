package cn.ibizlab.extension.pscoreprd

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.pscoreprd.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSCOREPRD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSCorePrd extends GroovyPSModelDERuntime<PSCorePrd,PSCorePrdDTO,PSCorePrdFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSCorePrd _instance
    void setInstance(PSCorePrd instance) {
        _instance = instance
    }
    static PSCorePrd getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSCorePrdDTO create(PSCorePrdDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSCorePrdDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSCorePrdDTO update(PSCorePrdDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSCorePrdDTO.class)
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
    PSCorePrdDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSCorePrdDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSCorePrdDTO getDraft(PSCorePrdDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSCorePrdDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSCorePrdDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSCorePrdDTO save(PSCorePrdDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSCorePrdDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSCorePrdDTO> fetchDefault(PSCorePrdFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSCorePrdDTO.class)
    }

}