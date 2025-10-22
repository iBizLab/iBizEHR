package cn.ibizlab.attendance.attendancerule

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.attendance.attendancerule.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[ATTENDANCE_RULE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AttendanceRule extends GroovyDataEntityRuntime<AttendanceRule,AttendanceRuleDTO,AttendanceRuleFilterDTO> {

    public static final String ACTION_CHANGEGROUPS = "changeGroups"
    public static final String ACTION_EXECUTECOMPLETION = "executeCompletion"
    public static final String ACTION_EXECUTIONACTIVATE = "executionActivate"
    public static final String ACTION_FILLDEFAULTSHIFT = "fillDefaultShift"
    public static final String ACTION_FILLGROUPSHIFT = "fillGroupShift"
    public static final String ACTION_FILLWORKDAYS = "fillWorkDays"
    public static final String ACTION_JUDGINGMEMBER = "judgingMember"
    public static final String DATASET_ALL = "ALL"
    public static final String DATASET_CALENDAR = "Calendar"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_COMPLETE = "complete"
    public static final String DATASET_NEEDACTIVATE = "needActivate"
    private static AttendanceRule _instance
    void setInstance(AttendanceRule instance) {
        _instance = instance
    }
    static AttendanceRule getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AttendanceRuleDTO create(AttendanceRuleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AttendanceRuleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AttendanceRuleDTO update(AttendanceRuleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AttendanceRuleDTO.class)
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
    AttendanceRuleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AttendanceRuleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AttendanceRuleDTO getDraft(AttendanceRuleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AttendanceRuleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AttendanceRuleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AttendanceRuleDTO save(AttendanceRuleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AttendanceRuleDTO.class)
    }

    /**
     * 行为：更新组排班 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGEGROUPS)
    def changeGroups(AttendanceRuleDTO dto) throws Throwable {
        this.execute(ACTION_CHANGEGROUPS, dto, AttendanceRuleDTO.class)
    }

    /**
     * 行为：定时执行补全排班 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_EXECUTECOMPLETION)
    def executeCompletion(AttendanceRuleDTO dto) throws Throwable {
        this.execute(ACTION_EXECUTECOMPLETION, dto, AttendanceRuleDTO.class)
    }

    /**
     * 行为：定时执行激活规则 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_EXECUTIONACTIVATE)
    def executionActivate(AttendanceRuleDTO dto) throws Throwable {
        this.execute(ACTION_EXECUTIONACTIVATE, dto, AttendanceRuleDTO.class)
    }

    /**
     * 行为：填充默认班次 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILLDEFAULTSHIFT)
    def fillDefaultShift(AttendanceRuleDTO dto) throws Throwable {
        this.execute(ACTION_FILLDEFAULTSHIFT, dto, AttendanceRuleDTO.class)
    }

    /**
     * 行为：填充组排班 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILLGROUPSHIFT)
    def fillGroupShift(AttendanceRuleDTO dto) throws Throwable {
        this.execute(ACTION_FILLGROUPSHIFT, dto, AttendanceRuleDTO.class)
    }

    /**
     * 行为：填充工作日 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILLWORKDAYS)
    def fillWorkDays(AttendanceRuleDTO dto) throws Throwable {
        this.execute(ACTION_FILLWORKDAYS, dto, AttendanceRuleDTO.class)
    }

    /**
     * 行为：判断人员是否已存在其他规则 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_JUDGINGMEMBER)
    def judgingMember(AttendanceRuleDTO dto) throws Throwable {
        return this.execute(ACTION_JUDGINGMEMBER, dto, AttendanceRuleDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ALL)
    Page<AttendanceRuleDTO> fetchALL(AttendanceRuleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ALL, context, AttendanceRuleDTO.class)
    }

    /**
     * 数据集：日历排班 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CALENDAR)
    Page<AttendanceRuleDTO> fetchCalendar(AttendanceRuleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CALENDAR, context, AttendanceRuleDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AttendanceRuleDTO> fetchDefault(AttendanceRuleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AttendanceRuleDTO.class)
    }

    /**
     * 数据集：完整数据（含人数） 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMPLETE)
    Page<AttendanceRuleDTO> fetchComplete(AttendanceRuleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMPLETE, context, AttendanceRuleDTO.class)
    }

    /**
     * 数据集：全部数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NEEDACTIVATE)
    Page<AttendanceRuleDTO> fetchNeedActivate(AttendanceRuleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NEEDACTIVATE, context, AttendanceRuleDTO.class)
    }

}