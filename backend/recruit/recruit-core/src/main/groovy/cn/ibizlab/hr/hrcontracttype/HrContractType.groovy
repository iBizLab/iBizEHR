package cn.ibizlab.hr.hrcontracttype

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrcontracttype.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_CONTRACT_TYPE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrContractType extends GroovyDataEntityRuntime<HrContractType,HrContractTypeDTO,HrContractTypeFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrContractType _instance
    void setInstance(HrContractType instance) {
        _instance = instance
    }
    static HrContractType getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrContractTypeDTO create(HrContractTypeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrContractTypeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrContractTypeDTO update(HrContractTypeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrContractTypeDTO.class)
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
    HrContractTypeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrContractTypeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrContractTypeDTO getDraft(HrContractTypeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrContractTypeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrContractTypeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrContractTypeDTO save(HrContractTypeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrContractTypeDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrContractTypeDTO> fetchDefault(HrContractTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrContractTypeDTO.class)
    }

}