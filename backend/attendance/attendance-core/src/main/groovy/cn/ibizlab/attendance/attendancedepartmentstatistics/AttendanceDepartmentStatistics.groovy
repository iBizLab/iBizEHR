package cn.ibizlab.attendance.attendancedepartmentstatistics

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendancedepartmentstatistics.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_DEPARTMENT_STATISTICS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceDepartmentStatistics extends GroovyDataEntityRuntime<AttendanceDepartmentStatistics,AttendanceDepartmentStatisticsDTO,AttendanceDepartmentStatisticsFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ATTENDANCE_DEPARTMENT_STATISTICS = "attendance_department_statistics"
    private static AttendanceDepartmentStatistics _instance
    void setInstance(AttendanceDepartmentStatistics instance) {
        _instance = instance
    }
    static AttendanceDepartmentStatistics getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceDepartmentStatisticsDTO create(AttendanceDepartmentStatisticsDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceDepartmentStatisticsDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceDepartmentStatisticsDTO update(AttendanceDepartmentStatisticsDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceDepartmentStatisticsDTO.class)
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
    AttendanceDepartmentStatisticsDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceDepartmentStatisticsDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceDepartmentStatisticsDTO getDraft(AttendanceDepartmentStatisticsDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceDepartmentStatisticsDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceDepartmentStatisticsDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceDepartmentStatisticsDTO save(AttendanceDepartmentStatisticsDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceDepartmentStatisticsDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceDepartmentStatisticsDTO> fetchDefault(AttendanceDepartmentStatisticsFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceDepartmentStatisticsDTO.class)
    }

    /**
     * 数据集：部门统计 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ATTENDANCE_DEPARTMENT_STATISTICS)
    Page<AttendanceDepartmentStatisticsDTO> fetchAttendanceDepartmentStatistics(AttendanceDepartmentStatisticsFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ATTENDANCE_DEPARTMENT_STATISTICS, context, AttendanceDepartmentStatisticsDTO.class)
    }

}