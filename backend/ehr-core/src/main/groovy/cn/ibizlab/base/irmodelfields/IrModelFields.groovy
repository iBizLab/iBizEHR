package cn.ibizlab.base.irmodelfields

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.irmodelfields.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_MODEL_FIELDS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrModelFields extends GroovyDataEntityRuntime<IrModelFields,IrModelFieldsDTO,IrModelFieldsFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static IrModelFields _instance
    void setInstance(IrModelFields instance) {
        _instance = instance
    }
    static IrModelFields getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrModelFieldsDTO create(IrModelFieldsDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrModelFieldsDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrModelFieldsDTO update(IrModelFieldsDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrModelFieldsDTO.class)
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
    IrModelFieldsDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrModelFieldsDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrModelFieldsDTO getDraft(IrModelFieldsDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrModelFieldsDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrModelFieldsDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrModelFieldsDTO save(IrModelFieldsDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrModelFieldsDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IrModelFieldsDTO> fetchDefault(IrModelFieldsFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IrModelFieldsDTO.class)
    }

}