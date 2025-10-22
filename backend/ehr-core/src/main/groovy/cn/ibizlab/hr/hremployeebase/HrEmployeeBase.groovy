package cn.ibizlab.hr.hremployeebase

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hremployeebase.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_EMPLOYEE_BASE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrEmployeeBase extends GroovyDataEntityRuntime<HrEmployeeBase,HrEmployeeBaseDTO,HrEmployeeBaseFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrEmployeeBase _instance
    void setInstance(HrEmployeeBase instance) {
        _instance = instance
    }
    static HrEmployeeBase getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrEmployeeBaseDTO create(HrEmployeeBaseDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrEmployeeBaseDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrEmployeeBaseDTO update(HrEmployeeBaseDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrEmployeeBaseDTO.class)
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
    HrEmployeeBaseDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrEmployeeBaseDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrEmployeeBaseDTO getDraft(HrEmployeeBaseDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrEmployeeBaseDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrEmployeeBaseDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrEmployeeBaseDTO save(HrEmployeeBaseDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrEmployeeBaseDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrEmployeeBaseDTO> fetchDefault(HrEmployeeBaseFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrEmployeeBaseDTO.class)
    }

}