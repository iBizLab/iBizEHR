package cn.ibizlab.ebsx.sysdepartment

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ebsx.sysdepartment.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SYS_DEPT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SysDepartment extends GroovyDataEntityRuntime<SysDepartment,SysDepartmentDTO,SysDepartmentFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static SysDepartment _instance
    void setInstance(SysDepartment instance) {
        _instance = instance
    }
    static SysDepartment getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SysDepartmentDTO create(SysDepartmentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SysDepartmentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SysDepartmentDTO update(SysDepartmentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SysDepartmentDTO.class)
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
    SysDepartmentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SysDepartmentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SysDepartmentDTO getDraft(SysDepartmentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SysDepartmentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SysDepartmentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SysDepartmentDTO save(SysDepartmentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SysDepartmentDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SysDepartmentDTO> fetchDefault(SysDepartmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SysDepartmentDTO.class)
    }

}