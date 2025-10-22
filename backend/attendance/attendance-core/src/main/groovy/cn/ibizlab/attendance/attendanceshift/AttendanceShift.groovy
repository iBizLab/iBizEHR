package cn.ibizlab.attendance.attendanceshift

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendanceshift.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_SHIFT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceShift extends GroovyDataEntityRuntime<AttendanceShift,AttendanceShiftDTO,AttendanceShiftFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AttendanceShift _instance
    void setInstance(AttendanceShift instance) {
        _instance = instance
    }
    static AttendanceShift getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceShiftDTO create(AttendanceShiftDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceShiftDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceShiftDTO update(AttendanceShiftDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceShiftDTO.class)
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
    AttendanceShiftDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceShiftDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceShiftDTO getDraft(AttendanceShiftDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceShiftDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceShiftDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceShiftDTO save(AttendanceShiftDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceShiftDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceShiftDTO> fetchDefault(AttendanceShiftFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceShiftDTO.class)
    }

}