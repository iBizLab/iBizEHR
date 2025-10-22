package cn.ibizlab.hr.hrleavetype

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrleavetype.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_LEAVE_TYPE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrLeaveType extends GroovyDataEntityRuntime<HrLeaveType,HrLeaveTypeDTO,HrLeaveTypeFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrLeaveType _instance
    void setInstance(HrLeaveType instance) {
        _instance = instance
    }
    static HrLeaveType getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrLeaveTypeDTO create(HrLeaveTypeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrLeaveTypeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrLeaveTypeDTO update(HrLeaveTypeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrLeaveTypeDTO.class)
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
    HrLeaveTypeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrLeaveTypeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrLeaveTypeDTO getDraft(HrLeaveTypeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrLeaveTypeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrLeaveTypeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrLeaveTypeDTO save(HrLeaveTypeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrLeaveTypeDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrLeaveTypeDTO> fetchDefault(HrLeaveTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrLeaveTypeDTO.class)
    }

}