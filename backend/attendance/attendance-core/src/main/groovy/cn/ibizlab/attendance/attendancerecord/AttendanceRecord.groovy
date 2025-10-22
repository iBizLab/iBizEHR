package cn.ibizlab.attendance.attendancerecord

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendancerecord.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_RECORD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceRecord extends GroovyDataEntityRuntime<AttendanceRecord,AttendanceRecordDTO,AttendanceRecordFilterDTO> {

    public static final String ACTION_MYATTENDANCESUMMARY = "MyAttendanceSummary"
    public static final String ACTION_CHECK_INFO = "check_info"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ABNORMAL_ATTENDANCE = "abnormal_attendance"
    public static final String DATASET_CLOCK = "clock"
    public static final String DATASET_RECORD = "record"
    private static AttendanceRecord _instance
    void setInstance(AttendanceRecord instance) {
        _instance = instance
    }
    static AttendanceRecord getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceRecordDTO create(AttendanceRecordDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceRecordDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceRecordDTO update(AttendanceRecordDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceRecordDTO.class)
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
    AttendanceRecordDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceRecordDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceRecordDTO getDraft(AttendanceRecordDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceRecordDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceRecordDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceRecordDTO save(AttendanceRecordDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceRecordDTO.class)
    }

    /**
     * 行为：月底汇总_我的出勤统计 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MYATTENDANCESUMMARY)
    def myAttendanceSummary(AttendanceRecordDTO dto) throws Throwable {
        return this.execute(ACTION_MYATTENDANCESUMMARY, dto, AttendanceRecordDTO.class)
    }

    /**
     * 行为：考勤记录反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECK_INFO)
    def checkInfo(AttendanceRecordDTO dto) throws Throwable {
        return this.execute(ACTION_CHECK_INFO, dto, AttendanceRecordDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceRecordDTO> fetchDefault(AttendanceRecordFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceRecordDTO.class)
    }

    /**
     * 数据集：异常考勤 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ABNORMAL_ATTENDANCE)
    Page<AttendanceRecordDTO> fetchAbnormalAttendance(AttendanceRecordFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ABNORMAL_ATTENDANCE, context, AttendanceRecordDTO.class)
    }

    /**
     * 数据集：clock 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CLOCK)
    Page<AttendanceRecordDTO> fetchClock(AttendanceRecordFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CLOCK, context, AttendanceRecordDTO.class)
    }

    /**
     * 数据集：考勤记录(特定搜索条件) 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECORD)
    Page<AttendanceRecordDTO> fetchRecord(AttendanceRecordFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECORD, context, AttendanceRecordDTO.class)
    }

}