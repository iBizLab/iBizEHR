package cn.ibizlab.baseextend.irunires

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.baseextend.irunires.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_UNIRES]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrUnires extends GroovyDataEntityRuntime<IrUnires,IrUniresDTO,IrUniresFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_PSMODEL_SYNC = "psmodel_sync"
    private static IrUnires _instance
    void setInstance(IrUnires instance) {
        _instance = instance
    }
    static IrUnires getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrUniresDTO create(IrUniresDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrUniresDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrUniresDTO update(IrUniresDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrUniresDTO.class)
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
    IrUniresDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrUniresDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrUniresDTO getDraft(IrUniresDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrUniresDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrUniresDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrUniresDTO save(IrUniresDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrUniresDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IrUniresDTO> fetchDefault(IrUniresFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IrUniresDTO.class)
    }

    /**
     * 数据集：模型同步数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PSMODEL_SYNC)
    Page<IrUniresDTO> fetchPsmodelSync(IrUniresFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PSMODEL_SYNC, context, IrUniresDTO.class)
    }

}