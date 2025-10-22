package cn.ibizlab.attendance.attendancewifilocation

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendancewifilocation.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_WIFI_LOCATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceWifiLocation extends GroovyDataEntityRuntime<AttendanceWifiLocation,AttendanceWifiLocationDTO,AttendanceWifiLocationFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AttendanceWifiLocation _instance
    void setInstance(AttendanceWifiLocation instance) {
        _instance = instance
    }
    static AttendanceWifiLocation getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceWifiLocationDTO create(AttendanceWifiLocationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceWifiLocationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceWifiLocationDTO update(AttendanceWifiLocationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceWifiLocationDTO.class)
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
    AttendanceWifiLocationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceWifiLocationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceWifiLocationDTO getDraft(AttendanceWifiLocationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceWifiLocationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceWifiLocationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceWifiLocationDTO save(AttendanceWifiLocationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceWifiLocationDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceWifiLocationDTO> fetchDefault(AttendanceWifiLocationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceWifiLocationDTO.class)
    }

}