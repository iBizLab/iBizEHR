package cn.ibizlab.base.irmodulecategory

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.irmodulecategory.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_MODULE_CATEGORY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrModuleCategory extends GroovyDataEntityRuntime<IrModuleCategory,IrModuleCategoryDTO,IrModuleCategoryFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static IrModuleCategory _instance
    void setInstance(IrModuleCategory instance) {
        _instance = instance
    }
    static IrModuleCategory getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrModuleCategoryDTO create(IrModuleCategoryDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrModuleCategoryDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrModuleCategoryDTO update(IrModuleCategoryDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrModuleCategoryDTO.class)
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
    IrModuleCategoryDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrModuleCategoryDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrModuleCategoryDTO getDraft(IrModuleCategoryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrModuleCategoryDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrModuleCategoryDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrModuleCategoryDTO save(IrModuleCategoryDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrModuleCategoryDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IrModuleCategoryDTO> fetchDefault(IrModuleCategoryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IrModuleCategoryDTO.class)
    }

}