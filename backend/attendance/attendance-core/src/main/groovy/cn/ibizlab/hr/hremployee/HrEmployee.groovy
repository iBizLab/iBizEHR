package cn.ibizlab.hr.hremployee

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hremployee.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_EMPLOYEE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrEmployee extends GroovyDataEntityRuntime<HrEmployee,HrEmployeeDTO,HrEmployeeFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrEmployee _instance
    void setInstance(HrEmployee instance) {
        _instance = instance
    }
    static HrEmployee getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrEmployeeDTO create(HrEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrEmployeeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrEmployeeDTO update(HrEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrEmployeeDTO.class)
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
    HrEmployeeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrEmployeeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrEmployeeDTO getDraft(HrEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrEmployeeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrEmployeeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrEmployeeDTO save(HrEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrEmployeeDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrEmployeeDTO> fetchDefault(HrEmployeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrEmployeeDTO.class)
    }

}