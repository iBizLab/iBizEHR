package cn.ibizlab.employeemanagement.department

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.employeemanagement.department.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DEPARTMENT]运行时对象
 * 此代码用户功能扩展代码
 *
 * 该实体存在实体映射或者自定义动态扩展对象，开启RTCode模式会导致映射功能失效
 */
class Department extends GroovyDataEntityRuntime<Department,DepartmentDTO,DepartmentFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_DEPT = "dept"
    public static final String DATASET_MY_DEPT = "my_dept"
    public static final String DATASET_ROOT = "root"
    private static Department _instance
    void setInstance(Department instance) {
        _instance = instance
    }
    static Department getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATE)
    DepartmentDTO create(DepartmentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DepartmentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    DepartmentDTO update(DepartmentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DepartmentDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    //@DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_GET)
    DepartmentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DepartmentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    DepartmentDTO getDraft(DepartmentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DepartmentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    int checkKey(DepartmentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    DepartmentDTO save(DepartmentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DepartmentDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    Page<DepartmentDTO> fetchDefault(DepartmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, DepartmentDTO.class)
    }

    /**
     * 数据集：部门 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEPT)
    Page<DepartmentDTO> fetchDept(DepartmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEPT, context, DepartmentDTO.class)
    }

    /**
     * 数据集：我的部门 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_MY_DEPT)
    Page<DepartmentDTO> fetchMyDept(DepartmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_DEPT, context, DepartmentDTO.class)
    }

    /**
     * 数据集：根部门 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_ROOT)
    Page<DepartmentDTO> fetchRoot(DepartmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ROOT, context, DepartmentDTO.class)
    }

}