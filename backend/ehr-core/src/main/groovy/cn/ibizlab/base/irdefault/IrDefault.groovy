package cn.ibizlab.base.irdefault

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.irdefault.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_DEFAULT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrDefault extends GroovyDataEntityRuntime<IrDefault,IrDefaultDTO,IrDefaultFilterDTO> {

    public static final String ACTION_GET_MODEL_DEFAULTS = "get_model_defaults"
    public static final String ACTION_SET = "set"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static IrDefault _instance
    void setInstance(IrDefault instance) {
        _instance = instance
    }
    static IrDefault getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrDefaultDTO create(IrDefaultDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrDefaultDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrDefaultDTO update(IrDefaultDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrDefaultDTO.class)
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
    IrDefaultDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrDefaultDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrDefaultDTO getDraft(IrDefaultDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrDefaultDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrDefaultDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrDefaultDTO save(IrDefaultDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrDefaultDTO.class)
    }

    /**
     * 行为：获取模型默认值 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_MODEL_DEFAULTS)
    def getModelDefaults(String key) throws Throwable {
        return this.execute(ACTION_GET_MODEL_DEFAULTS, key, IrDefaultDTO.class)
    }

    /**
     * 行为：设置数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SET)
    def set(IrDefaultDTO dto) throws Throwable {
        this.execute(ACTION_SET, dto, IrDefaultDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IrDefaultDTO> fetchDefault(IrDefaultFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IrDefaultDTO.class)
    }

}