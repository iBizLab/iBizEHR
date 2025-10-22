package cn.ibizlab.attendance.attendancecheckinapplication

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendancecheckinapplication.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_CHECKIN_APPLICATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceCheckinApplication extends GroovyDataEntityRuntime<AttendanceCheckinApplication,AttendanceCheckinApplicationDTO,AttendanceCheckinApplicationFilterDTO> {

    public static final String ACTION_CANCELLATION = "cancellation"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_NORMAL = "normal"
    private static AttendanceCheckinApplication _instance
    void setInstance(AttendanceCheckinApplication instance) {
        _instance = instance
    }
    static AttendanceCheckinApplication getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceCheckinApplicationDTO create(AttendanceCheckinApplicationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceCheckinApplicationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceCheckinApplicationDTO update(AttendanceCheckinApplicationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceCheckinApplicationDTO.class)
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
    AttendanceCheckinApplicationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceCheckinApplicationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceCheckinApplicationDTO getDraft(AttendanceCheckinApplicationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceCheckinApplicationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceCheckinApplicationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceCheckinApplicationDTO save(AttendanceCheckinApplicationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceCheckinApplicationDTO.class)
    }

    /**
     * 行为：申请作废 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CANCELLATION)
    def cancellation(AttendanceCheckinApplicationDTO dto) throws Throwable {
        this.execute(ACTION_CANCELLATION, dto, AttendanceCheckinApplicationDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceCheckinApplicationDTO> fetchDefault(AttendanceCheckinApplicationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceCheckinApplicationDTO.class)
    }

    /**
     * 数据集：正常 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NORMAL)
    Page<AttendanceCheckinApplicationDTO> fetchNormal(AttendanceCheckinApplicationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NORMAL, context, AttendanceCheckinApplicationDTO.class)
    }

}