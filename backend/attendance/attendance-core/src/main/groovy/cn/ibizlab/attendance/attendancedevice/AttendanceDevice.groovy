package cn.ibizlab.attendance.attendancedevice

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendancedevice.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_DEVICE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceDevice extends GroovyDataEntityRuntime<AttendanceDevice,AttendanceDeviceDTO,AttendanceDeviceFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AttendanceDevice _instance
    void setInstance(AttendanceDevice instance) {
        _instance = instance
    }
    static AttendanceDevice getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceDeviceDTO create(AttendanceDeviceDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceDeviceDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceDeviceDTO update(AttendanceDeviceDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceDeviceDTO.class)
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
    AttendanceDeviceDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceDeviceDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceDeviceDTO getDraft(AttendanceDeviceDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceDeviceDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceDeviceDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceDeviceDTO save(AttendanceDeviceDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceDeviceDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceDeviceDTO> fetchDefault(AttendanceDeviceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceDeviceDTO.class)
    }

}