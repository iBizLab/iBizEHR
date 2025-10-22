package cn.ibizlab.attendance.attendancestatistics

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendancestatistics.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_STATISTICS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceStatistics extends GroovyDataEntityRuntime<AttendanceStatistics,AttendanceStatisticsDTO,AttendanceStatisticsFilterDTO> {

    public static final String ACTION_CHECK_INFO = "check_info"
    public static final String ACTION_PERSONAL = "personal"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_MONTH_REPORT = "month_report"
    private static AttendanceStatistics _instance
    void setInstance(AttendanceStatistics instance) {
        _instance = instance
    }
    static AttendanceStatistics getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceStatisticsDTO create(AttendanceStatisticsDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceStatisticsDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceStatisticsDTO update(AttendanceStatisticsDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceStatisticsDTO.class)
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
    AttendanceStatisticsDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceStatisticsDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceStatisticsDTO getDraft(AttendanceStatisticsDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceStatisticsDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceStatisticsDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceStatisticsDTO save(AttendanceStatisticsDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceStatisticsDTO.class)
    }

    /**
     * 行为：信息反查 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECK_INFO)
    def checkInfo(AttendanceStatisticsDTO dto) throws Throwable {
        return this.execute(ACTION_CHECK_INFO, dto, AttendanceStatisticsDTO.class)
    }

    /**
     * 行为：个人统计 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PERSONAL)
    def personal(AttendanceStatisticsDTO dto) throws Throwable {
        return this.execute(ACTION_PERSONAL, dto, AttendanceStatisticsDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceStatisticsDTO> fetchDefault(AttendanceStatisticsFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceStatisticsDTO.class)
    }

    /**
     * 数据集：月度统计 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MONTH_REPORT)
    Page<AttendanceStatisticsDTO> fetchMonthReport(AttendanceStatisticsFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MONTH_REPORT, context, AttendanceStatisticsDTO.class)
    }

}