package cn.ibizlab.extension.psdeform

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.psdeform.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSDEFORM]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSDEForm extends GroovyPSModelDERuntime<PSDEForm,PSDEFormDTO,PSDEFormFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSDEForm _instance
    void setInstance(PSDEForm instance) {
        _instance = instance
    }
    static PSDEForm getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSDEFormDTO create(PSDEFormDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSDEFormDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSDEFormDTO update(PSDEFormDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSDEFormDTO.class)
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
    PSDEFormDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSDEFormDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSDEFormDTO getDraft(PSDEFormDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSDEFormDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSDEFormDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSDEFormDTO save(PSDEFormDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSDEFormDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSDEFormDTO> fetchDefault(PSDEFormFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSDEFormDTO.class)
    }

}