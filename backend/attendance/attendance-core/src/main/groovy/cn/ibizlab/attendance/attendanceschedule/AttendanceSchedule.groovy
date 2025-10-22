package cn.ibizlab.attendance.attendanceschedule

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendanceschedule.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_SCHEDULE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceSchedule extends GroovyDataEntityRuntime<AttendanceSchedule,AttendanceScheduleDTO,AttendanceScheduleFilterDTO> {

    public static final String ACTION_CLEARMANUALSCHEDULE = "clearManualSchedule"
    public static final String ACTION_FILLSHIFTS = "fillShifts"
    public static final String ACTION_MANUAL = "manual"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ALL = "all"
    public static final String DATASET_GROUP_BY_MEMBER = "group_by_member"
    public static final String DATASET_MEMBER = "member"
    public static final String DATASET_SEARCH_MONTH = "search_month"
    private static AttendanceSchedule _instance
    void setInstance(AttendanceSchedule instance) {
        _instance = instance
    }
    static AttendanceSchedule getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceScheduleDTO create(AttendanceScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceScheduleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceScheduleDTO update(AttendanceScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceScheduleDTO.class)
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
    AttendanceScheduleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceScheduleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceScheduleDTO getDraft(AttendanceScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceScheduleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceScheduleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceScheduleDTO save(AttendanceScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceScheduleDTO.class)
    }

    /**
     * 行为：清除手动排班 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CLEARMANUALSCHEDULE)
    def clearManualSchedule(AttendanceScheduleDTO dto) throws Throwable {
        this.execute(ACTION_CLEARMANUALSCHEDULE, dto, AttendanceScheduleDTO.class)
    }

    /**
     * 行为：填充班次 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILLSHIFTS)
    def fillShifts(AttendanceScheduleDTO dto) throws Throwable {
        this.execute(ACTION_FILLSHIFTS, dto, AttendanceScheduleDTO.class)
    }

    /**
     * 行为：手动排班 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MANUAL)
    def manual(AttendanceScheduleDTO dto) throws Throwable {
        return this.execute(ACTION_MANUAL, dto, AttendanceScheduleDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceScheduleDTO> fetchDefault(AttendanceScheduleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceScheduleDTO.class)
    }

    /**
     * 数据集：全部 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<AttendanceScheduleDTO> fetchAll(AttendanceScheduleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, AttendanceScheduleDTO.class)
    }

    /**
     * 数据集：全部 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_GROUP_BY_MEMBER)
    Page<AttendanceScheduleDTO> fetchGroupByMember(AttendanceScheduleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_GROUP_BY_MEMBER, context, AttendanceScheduleDTO.class)
    }

    /**
     * 数据集：人员排班 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MEMBER)
    Page<AttendanceScheduleDTO> fetchMember(AttendanceScheduleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MEMBER, context, AttendanceScheduleDTO.class)
    }

    /**
     * 数据集：搜索月份 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SEARCH_MONTH)
    Page<AttendanceScheduleDTO> fetchSearchMonth(AttendanceScheduleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SEARCH_MONTH, context, AttendanceScheduleDTO.class)
    }

}