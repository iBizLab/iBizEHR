package cn.ibizlab.attendance.attendancecheckindevice

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendancecheckindevice.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_CHECKIN_DEVICE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceCheckinDevice extends GroovyDataEntityRuntime<AttendanceCheckinDevice,AttendanceCheckinDeviceDTO,AttendanceCheckinDeviceFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AttendanceCheckinDevice _instance
    void setInstance(AttendanceCheckinDevice instance) {
        _instance = instance
    }
    static AttendanceCheckinDevice getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceCheckinDeviceDTO create(AttendanceCheckinDeviceDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceCheckinDeviceDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceCheckinDeviceDTO update(AttendanceCheckinDeviceDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceCheckinDeviceDTO.class)
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
    AttendanceCheckinDeviceDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceCheckinDeviceDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceCheckinDeviceDTO getDraft(AttendanceCheckinDeviceDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceCheckinDeviceDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceCheckinDeviceDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceCheckinDeviceDTO save(AttendanceCheckinDeviceDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceCheckinDeviceDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceCheckinDeviceDTO> fetchDefault(AttendanceCheckinDeviceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceCheckinDeviceDTO.class)
    }

}