package cn.ibizlab.employeemanagement.userobject

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.employeemanagement.userobject.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[USER_OBJECT]运行时对象
 * 此代码用户功能扩展代码
 *
 * 该实体存在实体映射或者自定义动态扩展对象，开启RTCode模式会导致映射功能失效
 */
class UserObject extends cn.ibizlab.checkin.runtime.plugin.UserObjectDERuntime {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_DEPT = "dept"
    public static final String DATASET_MY_DEPT = "my_dept"
    public static final String DATASET_ROOT = "root"
    public static final String DATASET_USER = "user"
    private static UserObject _instance
    void setInstance(UserObject instance) {
        _instance = instance
    }
    static UserObject getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATE)
    UserObjectDTO create(UserObjectDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, UserObjectDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    UserObjectDTO update(UserObjectDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, UserObjectDTO.class)
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
    UserObjectDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, UserObjectDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    UserObjectDTO getDraft(UserObjectDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, UserObjectDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    int checkKey(UserObjectDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    UserObjectDTO save(UserObjectDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, UserObjectDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    Page<UserObjectDTO> fetchDefault(UserObjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, UserObjectDTO.class)
    }

    /**
     * 数据集：部门 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEPT)
    Page<UserObjectDTO> fetchDept(UserObjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEPT, context, UserObjectDTO.class)
    }

    /**
     * 数据集：我的部门 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_MY_DEPT)
    Page<UserObjectDTO> fetchMyDept(UserObjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_DEPT, context, UserObjectDTO.class)
    }

    /**
     * 数据集：根部门 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_ROOT)
    Page<UserObjectDTO> fetchRoot(UserObjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ROOT, context, UserObjectDTO.class)
    }

    /**
     * 数据集：人员 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_USER)
    Page<UserObjectDTO> fetchUser(UserObjectFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER, context, UserObjectDTO.class)
    }

}