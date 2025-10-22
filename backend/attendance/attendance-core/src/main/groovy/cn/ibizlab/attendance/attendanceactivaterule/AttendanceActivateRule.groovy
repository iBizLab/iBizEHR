package cn.ibizlab.attendance.attendanceactivaterule

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendanceactivaterule.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_ACTIVATE_RULE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceActivateRule extends GroovyDataEntityRuntime<AttendanceActivateRule,AttendanceActivateRuleDTO,AttendanceActivateRuleFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AttendanceActivateRule _instance
    void setInstance(AttendanceActivateRule instance) {
        _instance = instance
    }
    static AttendanceActivateRule getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceActivateRuleDTO create(AttendanceActivateRuleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceActivateRuleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceActivateRuleDTO update(AttendanceActivateRuleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceActivateRuleDTO.class)
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
    AttendanceActivateRuleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceActivateRuleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceActivateRuleDTO getDraft(AttendanceActivateRuleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceActivateRuleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceActivateRuleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceActivateRuleDTO save(AttendanceActivateRuleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceActivateRuleDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceActivateRuleDTO> fetchDefault(AttendanceActivateRuleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceActivateRuleDTO.class)
    }

}