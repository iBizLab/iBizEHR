package cn.ibizlab.attendance.attendancegroupshift

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendancegroupshift.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_GROUP_SHIFT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceGroupShift extends GroovyDataEntityRuntime<AttendanceGroupShift,AttendanceGroupShiftDTO,AttendanceGroupShiftFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AttendanceGroupShift _instance
    void setInstance(AttendanceGroupShift instance) {
        _instance = instance
    }
    static AttendanceGroupShift getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceGroupShiftDTO create(AttendanceGroupShiftDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceGroupShiftDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceGroupShiftDTO update(AttendanceGroupShiftDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceGroupShiftDTO.class)
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
    AttendanceGroupShiftDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceGroupShiftDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceGroupShiftDTO getDraft(AttendanceGroupShiftDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceGroupShiftDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceGroupShiftDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceGroupShiftDTO save(AttendanceGroupShiftDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceGroupShiftDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceGroupShiftDTO> fetchDefault(AttendanceGroupShiftFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceGroupShiftDTO.class)
    }

}