package cn.ibizlab.attendance.attendancerecorddetail

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendancerecorddetail.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_RECORD_DETAIL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceRecordDetail extends GroovyDataEntityRuntime<AttendanceRecordDetail,AttendanceRecordDetailDTO,AttendanceRecordDetailFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AttendanceRecordDetail _instance
    void setInstance(AttendanceRecordDetail instance) {
        _instance = instance
    }
    static AttendanceRecordDetail getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceRecordDetailDTO create(AttendanceRecordDetailDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceRecordDetailDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceRecordDetailDTO update(AttendanceRecordDetailDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceRecordDetailDTO.class)
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
    AttendanceRecordDetailDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceRecordDetailDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceRecordDetailDTO getDraft(AttendanceRecordDetailDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceRecordDetailDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceRecordDetailDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceRecordDetailDTO save(AttendanceRecordDetailDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceRecordDetailDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceRecordDetailDTO> fetchDefault(AttendanceRecordDetailFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceRecordDetailDTO.class)
    }

}