package cn.ibizlab.attendance.attendanceworkday

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendanceworkday.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_WORKDAY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceWorkday extends GroovyDataEntityRuntime<AttendanceWorkday,AttendanceWorkdayDTO,AttendanceWorkdayFilterDTO> {

    public static final String DATASET_WEEK1 = "Week1"
    public static final String DATASET_DEFAULT = "Default"
    public static final String DATASET_WEEK2 = "Week2"
    public static final String DATASET_WEEK3 = "Week3"
    public static final String DATASET_WEEK4 = "Week4"
    private static AttendanceWorkday _instance
    void setInstance(AttendanceWorkday instance) {
        _instance = instance
    }
    static AttendanceWorkday getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceWorkdayDTO create(AttendanceWorkdayDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceWorkdayDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceWorkdayDTO update(AttendanceWorkdayDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceWorkdayDTO.class)
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
    AttendanceWorkdayDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceWorkdayDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceWorkdayDTO getDraft(AttendanceWorkdayDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceWorkdayDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceWorkdayDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceWorkdayDTO save(AttendanceWorkdayDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceWorkdayDTO.class)
    }

    /**
     * 数据集：Default 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceWorkdayDTO> fetchDefault(AttendanceWorkdayFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceWorkdayDTO.class)
    }

}