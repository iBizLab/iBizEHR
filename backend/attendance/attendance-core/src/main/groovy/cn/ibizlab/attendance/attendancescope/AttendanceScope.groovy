package cn.ibizlab.attendance.attendancescope

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendancescope.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_SCOPE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceScope extends GroovyDataEntityRuntime<AttendanceScope,AttendanceScopeDTO,AttendanceScopeFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AttendanceScope _instance
    void setInstance(AttendanceScope instance) {
        _instance = instance
    }
    static AttendanceScope getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceScopeDTO create(AttendanceScopeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceScopeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceScopeDTO update(AttendanceScopeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceScopeDTO.class)
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
    AttendanceScopeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceScopeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceScopeDTO getDraft(AttendanceScopeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceScopeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceScopeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceScopeDTO save(AttendanceScopeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceScopeDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceScopeDTO> fetchDefault(AttendanceScopeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceScopeDTO.class)
    }

}