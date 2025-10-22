package cn.ibizlab.attendance.attendanceactivateshift

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendanceactivateshift.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_ACTIVATE_SHIFT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceActivateShift extends GroovyDataEntityRuntime<AttendanceActivateShift,AttendanceActivateShiftDTO,AttendanceActivateShiftFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AttendanceActivateShift _instance
    void setInstance(AttendanceActivateShift instance) {
        _instance = instance
    }
    static AttendanceActivateShift getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceActivateShiftDTO create(AttendanceActivateShiftDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceActivateShiftDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceActivateShiftDTO update(AttendanceActivateShiftDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceActivateShiftDTO.class)
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
    AttendanceActivateShiftDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceActivateShiftDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceActivateShiftDTO getDraft(AttendanceActivateShiftDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceActivateShiftDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceActivateShiftDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceActivateShiftDTO save(AttendanceActivateShiftDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceActivateShiftDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceActivateShiftDTO> fetchDefault(AttendanceActivateShiftFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceActivateShiftDTO.class)
    }

}