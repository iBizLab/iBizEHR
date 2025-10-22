package cn.ibizlab.base.irrule

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.irrule.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_RULE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrRule extends GroovyDataEntityRuntime<IrRule,IrRuleDTO,IrRuleFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_GLOBAL = "global"
    public static final String DATASET_PSMODEL_SYNC = "psmodel_sync"
    private static IrRule _instance
    void setInstance(IrRule instance) {
        _instance = instance
    }
    static IrRule getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrRuleDTO create(IrRuleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrRuleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrRuleDTO update(IrRuleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrRuleDTO.class)
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
    IrRuleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrRuleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrRuleDTO getDraft(IrRuleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrRuleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrRuleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrRuleDTO save(IrRuleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrRuleDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IrRuleDTO> fetchDefault(IrRuleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IrRuleDTO.class)
    }

    /**
     * 数据集：全局 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_GLOBAL)
    Page<IrRuleDTO> fetchGlobal(IrRuleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_GLOBAL, context, IrRuleDTO.class)
    }

    /**
     * 数据集：模型同步数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PSMODEL_SYNC)
    Page<IrRuleDTO> fetchPsmodelSync(IrRuleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PSMODEL_SYNC, context, IrRuleDTO.class)
    }

}