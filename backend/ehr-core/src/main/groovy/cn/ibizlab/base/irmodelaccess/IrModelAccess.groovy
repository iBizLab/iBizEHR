package cn.ibizlab.base.irmodelaccess

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.irmodelaccess.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_MODEL_ACCESS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrModelAccess extends GroovyDataEntityRuntime<IrModelAccess,IrModelAccessDTO,IrModelAccessFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static IrModelAccess _instance
    void setInstance(IrModelAccess instance) {
        _instance = instance
    }
    static IrModelAccess getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrModelAccessDTO create(IrModelAccessDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrModelAccessDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrModelAccessDTO update(IrModelAccessDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrModelAccessDTO.class)
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
    IrModelAccessDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrModelAccessDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrModelAccessDTO getDraft(IrModelAccessDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrModelAccessDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrModelAccessDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrModelAccessDTO save(IrModelAccessDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrModelAccessDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IrModelAccessDTO> fetchDefault(IrModelAccessFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IrModelAccessDTO.class)
    }

}