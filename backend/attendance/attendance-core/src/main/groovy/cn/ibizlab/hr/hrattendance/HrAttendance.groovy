package cn.ibizlab.hr.hrattendance

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrattendance.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_ATTENDANCE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrAttendance extends GroovyDataEntityRuntime<HrAttendance,HrAttendanceDTO,HrAttendanceFilterDTO> {

    public static final String ACTION_COMPUTEWORKHOUR = "ComputeWorkHour"
    public static final String ACTION_BATCHAPPROVAL = "batchApproval"
    public static final String ACTION_KIOSK_CHECKIN = "kiosk_checkin"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_MANAGE = "manage"
    private static HrAttendance _instance
    void setInstance(HrAttendance instance) {
        _instance = instance
    }
    static HrAttendance getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrAttendanceDTO create(HrAttendanceDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrAttendanceDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrAttendanceDTO update(HrAttendanceDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrAttendanceDTO.class)
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
    HrAttendanceDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrAttendanceDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrAttendanceDTO getDraft(HrAttendanceDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrAttendanceDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrAttendanceDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrAttendanceDTO save(HrAttendanceDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrAttendanceDTO.class)
    }

    /**
     * 行为：计算工作时间、加班时间 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COMPUTEWORKHOUR)
    def computeWorkHour(HrAttendanceDTO dto) throws Throwable {
        return this.execute(ACTION_COMPUTEWORKHOUR, dto, HrAttendanceDTO.class)
    }

    /**
     * 行为：批量审批 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_BATCHAPPROVAL)
    def batchApproval(HrAttendanceDTO dto) throws Throwable {
        this.execute(ACTION_BATCHAPPROVAL, dto, HrAttendanceDTO.class)
    }

    /**
     * 行为：自助终端考勤 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_KIOSK_CHECKIN)
    def kioskCheckin(HrAttendanceDTO dto) throws Throwable {
        this.execute(ACTION_KIOSK_CHECKIN, dto, HrAttendanceDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrAttendanceDTO> fetchDefault(HrAttendanceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrAttendanceDTO.class)
    }

    /**
     * 数据集：manage 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MANAGE)
    Page<HrAttendanceDTO> fetchManage(HrAttendanceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MANAGE, context, HrAttendanceDTO.class)
    }

}