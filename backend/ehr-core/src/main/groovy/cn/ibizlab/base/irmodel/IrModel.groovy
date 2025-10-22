package cn.ibizlab.base.irmodel

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.irmodel.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_MODEL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrModel extends GroovyDataEntityRuntime<IrModel,IrModelDTO,IrModelFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static IrModel _instance
    void setInstance(IrModel instance) {
        _instance = instance
    }
    static IrModel getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrModelDTO create(IrModelDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrModelDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrModelDTO update(IrModelDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrModelDTO.class)
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
    IrModelDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrModelDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrModelDTO getDraft(IrModelDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrModelDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrModelDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrModelDTO save(IrModelDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrModelDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IrModelDTO> fetchDefault(IrModelFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IrModelDTO.class)
    }

}