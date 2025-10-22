package cn.ibizlab.hr.hrdepartment

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrdepartment.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_DEPARTMENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrDepartment extends GroovyDataEntityRuntime<HrDepartment,HrDepartmentDTO,HrDepartmentFilterDTO> {

    public static final String ACTION_DEPARTMENT_COUNTER = "department_counter"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_DEPARTMENT_CHART = "department_chart"
    public static final String DATASET_DEPARTMENT_HIERARCHY = "department_hierarchy"
    public static final String DATASET_ROOT = "ROOT"
    public static final String DATASET_SIMPLE = "simple"
    private static HrDepartment _instance
    void setInstance(HrDepartment instance) {
        _instance = instance
    }
    static HrDepartment getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrDepartmentDTO create(HrDepartmentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrDepartmentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrDepartmentDTO update(HrDepartmentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrDepartmentDTO.class)
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
    HrDepartmentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrDepartmentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrDepartmentDTO getDraft(HrDepartmentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrDepartmentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrDepartmentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrDepartmentDTO save(HrDepartmentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrDepartmentDTO.class)
    }

    /**
     * 行为：部门计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DEPARTMENT_COUNTER)
    def departmentCounter(HrDepartmentDTO dto) throws Throwable {
        return this.execute(ACTION_DEPARTMENT_COUNTER, dto, HrDepartmentCounterDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrDepartmentDTO> fetchDefault(HrDepartmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrDepartmentDTO.class)
    }

    /**
     * 数据集：部门架构 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEPARTMENT_CHART)
    Page<HrDepartmentDTO> fetchDepartmentChart(HrDepartmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEPARTMENT_CHART, context, HrDepartmentDTO.class)
    }

    /**
     * 数据集：部门层级 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEPARTMENT_HIERARCHY)
    Page<HrDepartmentDTO> fetchDepartmentHierarchy(HrDepartmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEPARTMENT_HIERARCHY, context, HrDepartmentDTO.class)
    }

    /**
     * 数据集：根部门 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ROOT)
    Page<HrDepartmentDTO> fetchRoot(HrDepartmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ROOT, context, HrDepartmentDTO.class)
    }

    /**
     * 数据集：简单查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SIMPLE)
    Page<HrDepartmentSimpleDTO> fetchSimple(HrDepartmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SIMPLE, context, HrDepartmentSimpleDTO.class)
    }

}