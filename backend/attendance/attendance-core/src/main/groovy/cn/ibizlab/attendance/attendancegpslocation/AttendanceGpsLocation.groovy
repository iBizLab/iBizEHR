package cn.ibizlab.attendance.attendancegpslocation

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendancegpslocation.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_GPS_LOCATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceGpsLocation extends GroovyDataEntityRuntime<AttendanceGpsLocation,AttendanceGpsLocationDTO,AttendanceGpsLocationFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AttendanceGpsLocation _instance
    void setInstance(AttendanceGpsLocation instance) {
        _instance = instance
    }
    static AttendanceGpsLocation getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceGpsLocationDTO create(AttendanceGpsLocationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceGpsLocationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceGpsLocationDTO update(AttendanceGpsLocationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceGpsLocationDTO.class)
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
    AttendanceGpsLocationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceGpsLocationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceGpsLocationDTO getDraft(AttendanceGpsLocationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceGpsLocationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceGpsLocationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceGpsLocationDTO save(AttendanceGpsLocationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceGpsLocationDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceGpsLocationDTO> fetchDefault(AttendanceGpsLocationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceGpsLocationDTO.class)
    }

}