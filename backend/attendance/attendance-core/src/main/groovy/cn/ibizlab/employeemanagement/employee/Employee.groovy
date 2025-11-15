package cn.ibizlab.employeemanagement.employee

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.employeemanagement.employee.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[EMPLOYEE]运行时对象
 * 此代码用户功能扩展代码
 *
 * 该实体存在实体映射或者自定义动态扩展对象，开启RTCode模式会导致映射功能失效
 */
class Employee extends GroovyDataEntityRuntime<Employee,EmployeeDTO,EmployeeFilterDTO> {

    public static final String ACTION_NOTHING = "nothing"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_DEPTALL = "deptall"
    public static final String DATASET_EMPLOYEE = "employee"
    public static final String DATASET_GYS_EMP = "gys_emp"
    public static final String DATASET_USER = "user"
    private static Employee _instance
    void setInstance(Employee instance) {
        _instance = instance
    }
    static Employee getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATE)
    EmployeeDTO create(EmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, EmployeeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    EmployeeDTO update(EmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, EmployeeDTO.class)
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
    EmployeeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, EmployeeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    EmployeeDTO getDraft(EmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, EmployeeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    int checkKey(EmployeeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    EmployeeDTO save(EmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, EmployeeDTO.class)
    }

    /**
     * 行为：无操作 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_NOTHING)
    def nothing(EmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_NOTHING, dto, EmployeeDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    Page<EmployeeDTO> fetchDefault(EmployeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, EmployeeDTO.class)
    }

    /**
     * 数据集：部门人员 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEPTALL)
    Page<EmployeeDTO> fetchDeptall(EmployeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEPTALL, context, EmployeeDTO.class)
    }

    /**
     * 数据集：获取员工信息(特定搜索条件) 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_EMPLOYEE)
    Page<EmployeeDTO> fetchEmployee(EmployeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EMPLOYEE, context, EmployeeDTO.class)
    }

    /**
     * 数据集：供应商人员 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_GYS_EMP)
    Page<EmployeeDTO> fetchGysEmp(EmployeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_GYS_EMP, context, EmployeeDTO.class)
    }

    /**
     * 数据集：员工 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_USER)
    Page<EmployeeDTO> fetchUser(EmployeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, EmployeeDTO.class)
    }

}