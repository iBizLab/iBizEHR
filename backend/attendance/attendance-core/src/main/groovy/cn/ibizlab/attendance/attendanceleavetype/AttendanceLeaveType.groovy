package cn.ibizlab.attendance.attendanceleavetype

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendanceleavetype.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_LEAVE_TYPE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceLeaveType extends GroovyDataEntityRuntime<AttendanceLeaveType,AttendanceLeaveTypeDTO,AttendanceLeaveTypeFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AttendanceLeaveType _instance
    void setInstance(AttendanceLeaveType instance) {
        _instance = instance
    }
    static AttendanceLeaveType getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceLeaveTypeDTO create(AttendanceLeaveTypeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceLeaveTypeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceLeaveTypeDTO update(AttendanceLeaveTypeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceLeaveTypeDTO.class)
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
    AttendanceLeaveTypeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceLeaveTypeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceLeaveTypeDTO getDraft(AttendanceLeaveTypeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceLeaveTypeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceLeaveTypeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceLeaveTypeDTO save(AttendanceLeaveTypeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceLeaveTypeDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceLeaveTypeDTO> fetchDefault(AttendanceLeaveTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceLeaveTypeDTO.class)
    }

}