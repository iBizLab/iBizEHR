package cn.ibizlab.attendance.attendanceclockinrecord

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendanceclockinrecord.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_CLOCK_IN_RECORD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceClockInRecord extends GroovyDataEntityRuntime<AttendanceClockInRecord,AttendanceClockInRecordDTO,AttendanceClockInRecordFilterDTO> {

    public static final String ACTION_ATTENDANCE_CALCULATE = "attendance_calculate"
    public static final String ACTION_BATCHREISSUE = "batchReissue"
    public static final String ACTION_NOTHING = "nothing"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_MYCLOCKINRECORD = "MYCLOCKINRECORD"
    public static final String DATASET_RECORD = "record"
    public static final String DATASET_RECORD_LIST = "record_list"
    private static AttendanceClockInRecord _instance
    void setInstance(AttendanceClockInRecord instance) {
        _instance = instance
    }
    static AttendanceClockInRecord getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceClockInRecordDTO create(AttendanceClockInRecordDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceClockInRecordDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceClockInRecordDTO update(AttendanceClockInRecordDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceClockInRecordDTO.class)
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
    AttendanceClockInRecordDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceClockInRecordDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceClockInRecordDTO getDraft(AttendanceClockInRecordDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceClockInRecordDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceClockInRecordDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceClockInRecordDTO save(AttendanceClockInRecordDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceClockInRecordDTO.class)
    }

    /**
     * 行为：考勤计算 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ATTENDANCE_CALCULATE)
    def attendanceCalculate(AttendanceClockInRecordDTO dto) throws Throwable {
        this.execute(ACTION_ATTENDANCE_CALCULATE, dto, AttendanceClockInRecordDTO.class)
    }

    /**
     * 行为：批量补卡 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCHREISSUE)
    def batchReissue(AttendanceClockInRecordDTO dto) throws Throwable {
        this.execute(ACTION_BATCHREISSUE, dto, AttendanceClockInRecordDTO.class)
    }

    /**
     * 行为：无操作 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_NOTHING)
    def nothing(AttendanceClockInRecordDTO dto) throws Throwable {
        return this.execute(ACTION_NOTHING, dto, AttendanceClockInRecordDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceClockInRecordDTO> fetchDefault(AttendanceClockInRecordFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceClockInRecordDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MYCLOCKINRECORD)
    Page<AttendanceClockInRecordDTO> fetchMyClockInRecord(AttendanceClockInRecordFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MYCLOCKINRECORD, context, AttendanceClockInRecordDTO.class)
    }

    /**
     * 数据集：打卡记录 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECORD)
    Page<AttendanceClockInRecordDTO> fetchRecord(AttendanceClockInRecordFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECORD, context, AttendanceClockInRecordDTO.class)
    }

    /**
     * 数据集：列表视图 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_RECORD_LIST)
    Page<AttendanceClockInRecordDTO> fetchRecordList(AttendanceClockInRecordFilterDTO context) throws Throwable {
        return this.fetch(DATASET_RECORD_LIST, context, AttendanceClockInRecordDTO.class)
    }

}