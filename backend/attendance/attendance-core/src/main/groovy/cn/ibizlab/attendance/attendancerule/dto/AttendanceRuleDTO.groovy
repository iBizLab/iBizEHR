package cn.ibizlab.attendance.attendancerule.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.attendance.attendancecheckindevice.dto.AttendanceCheckinDeviceDTO
import cn.ibizlab.attendance.attendancegpslocation.dto.AttendanceGpsLocationDTO
import cn.ibizlab.attendance.attendancegroupshift.dto.AttendanceGroupShiftDTO
import cn.ibizlab.attendance.attendanceshift.dto.AttendanceShiftDTO
import cn.ibizlab.attendance.attendancewifilocation.dto.AttendanceWifiLocationDTO
import cn.ibizlab.attendance.attendanceworkday.dto.AttendanceWorkdayDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class AttendanceRuleDTO extends GroovyDTO<AttendanceRuleDTO> {

    /**
     * 「每日打卡要求」
     * 字典[打卡要求]
     */
    @JsonProperty("requirement")
    String requirement
    /**
     * 「智能匹配」
     * 字典[是否]
     */
    @JsonProperty("auto_match")
    Integer autoMatch
    /**
     * 「工作日(周期1)」
     * 字典[周期1]
     */
    @JsonProperty("week1")
    String week1
    /**
     * 「工作日(周期2)」
     * 字典[周期2]
     */
    @JsonProperty("week2")
    String week2
    /**
     * 「工作日(周期3)」
     * 字典[周期3]
     */
    @JsonProperty("week3")
    String week3
    /**
     * 「工作日(周期4)」
     * 字典[周期4]
     */
    @JsonProperty("week4")
    String week4
    /**
     * 「工作日(常规)」
     * 字典[周期1]
     */
    @JsonProperty("workday")
    String workday
    /**
     * 「上下班时间」
     */
    @JsonProperty("work_time")
    String workTime
    /**
     * 「循环周期设置（大小周）」
     * 字典[循环周期]
     */
    @JsonProperty("biweekly_cycle")
    String biweeklyCycle
    /**
     * 「循环周期设置（N班倒）」
     * 字典[循环周数]
     */
    @JsonProperty("inversion_cycle")
    Integer inversionCycle
    /**
     * 「循环天数设置（N班倒）」
     * 字典[循环天数]
     */
    @JsonProperty("inversion_days")
    Integer inversionDays
    /**
     * 「生效时间」
     */
    @JsonProperty("effect_time")
    Timestamp effectTime
    /**
     * 「工作天数（上A休B）」
     */
    @JsonProperty("work")
    Integer work
    /**
     * 「休息天数（上A休B）」
     */
    @JsonProperty("rest")
    Integer rest
    /**
     * 「是否休息日相同」
     * 字典[是否休息日相同]
     */
    @JsonProperty("same_restday")
    Integer sameRestday
    /**
     * 「倒班数」
     * 字典[N班倒]
     */
    @JsonProperty("inversion_count")
    Integer inversionCount
    /**
     * 「默认班次标识」
     */
    @JsonProperty("default_shift")
    String defaultShift
    /**
     * 「智能匹配判断结果」
     */
    @JsonProperty("judge_result")
    String judgeResult
    /**
     * 「成员总数」
     */
    @JsonProperty("total_members")
    String totalMembers
    /**
     * 「班次数量」
     * 字典[班次数量]
     */
    @JsonProperty("shift_num")
    Integer shiftNum
    /**
     * 「是否激活」
     * 字典[是否]
     */
    @JsonProperty("is_activate")
    Integer isActivate
    /**
     * 「组排班数」
     */
    @JsonProperty("group_num")
    Integer groupNum
    /**
     * 「节假日配置」
     * 字典[节假日（动态）]
     */
    @JsonProperty("holiday")
    String holiday
    /**
     * 「实际出勤次数」
     * 字典[打卡次数]
     */
    @JsonProperty("free_ratio")
    Integer freeRatio
    /**
     * 「实际最少出勤时长」
     */
    @JsonProperty("free_min_minutes")
    Integer freeMinMinutes
    /**
     * 「默认免考勤」
     * 字典[是否]
     */
    @JsonProperty("default_flag")
    Integer defaultFlag
    /**
     * 「工作时段」
     */
    @JsonProperty("work_times")
    List<IEntity> workTimes
    /**
     * 「考勤方式」
     * 字典[考勤方式类型]
     */
    @JsonProperty("checkin_method")
    String checkinMethod
    /**
     * 「创建时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「创建人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「弹性分钟数」
     */
    @JsonProperty("elastic_minutes")
    Integer elasticMinutes
    /**
     * 「是否启用弹性打卡」
     * 字典[是否]
     */
    @JsonProperty("elastic_valid")
    Integer elasticValid
    /**
     * 「结束时间」
     */
    @JsonProperty("free_end")
    Timestamp freeEnd
    /**
     * 「开始时间」
     */
    @JsonProperty("free_start")
    Timestamp freeStart
    /**
     * 「主键」
     */
    @JsonProperty("id")
    String id
    /**
     * 「规则名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「班次类型」
     * 字典[班次类型]
     */
    @JsonProperty("schedule_type")
    String scheduleType
    /**
     * 「更新时间」
     */
    @JsonProperty("write_date")
    Timestamp writeDate
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("write_uid")
    String writeUid
    /**
     * 「null」
     */
    @JsonProperty("devices")
    List<AttendanceCheckinDeviceDTO> devices
    /**
     * 「null」
     */
    @JsonProperty("gps_list")
    List<AttendanceGpsLocationDTO> gpsList
    /**
     * 「null」
     */
    @JsonProperty("group_shifts")
    List<AttendanceGroupShiftDTO> groupShifts
    /**
     * 「null」
     */
    @JsonProperty("shifts")
    List<AttendanceShiftDTO> shifts
    /**
     * 「null」
     */
    @JsonProperty("wifi_list")
    List<AttendanceWifiLocationDTO> wifiList
    /**
     * 「null」
     */
    @JsonProperty("workdays")
    List<AttendanceWorkdayDTO> workdays

    /**
     * 设置「每日打卡要求」值
     * 字典[打卡要求]
     * @param val
     */
    AttendanceRuleDTO setRequirement(String requirement) {
        this.requirement = requirement
        return this
    }


    /**
     * 设置「智能匹配」值
     * 字典[是否]
     * @param val
     */
    AttendanceRuleDTO setAutoMatch(Integer autoMatch) {
        this.autoMatch = autoMatch
        return this
    }


    /**
     * 设置「工作日(周期1)」值
     * 字典[周期1]
     * @param val
     */
    AttendanceRuleDTO setWeek1(String week1) {
        this.week1 = week1
        return this
    }


    /**
     * 设置「工作日(周期2)」值
     * 字典[周期2]
     * @param val
     */
    AttendanceRuleDTO setWeek2(String week2) {
        this.week2 = week2
        return this
    }


    /**
     * 设置「工作日(周期3)」值
     * 字典[周期3]
     * @param val
     */
    AttendanceRuleDTO setWeek3(String week3) {
        this.week3 = week3
        return this
    }


    /**
     * 设置「工作日(周期4)」值
     * 字典[周期4]
     * @param val
     */
    AttendanceRuleDTO setWeek4(String week4) {
        this.week4 = week4
        return this
    }


    /**
     * 设置「工作日(常规)」值
     * 字典[周期1]
     * @param val
     */
    AttendanceRuleDTO setWorkday(String workday) {
        this.workday = workday
        return this
    }


    /**
     * 设置「上下班时间」值
     * @param val
     */
    AttendanceRuleDTO setWorkTime(String workTime) {
        this.workTime = workTime
        return this
    }


    /**
     * 设置「循环周期设置（大小周）」值
     * 字典[循环周期]
     * @param val
     */
    AttendanceRuleDTO setBiweeklyCycle(String biweeklyCycle) {
        this.biweeklyCycle = biweeklyCycle
        return this
    }


    /**
     * 设置「循环周期设置（N班倒）」值
     * 字典[循环周数]
     * @param val
     */
    AttendanceRuleDTO setInversionCycle(Integer inversionCycle) {
        this.inversionCycle = inversionCycle
        return this
    }


    /**
     * 设置「循环天数设置（N班倒）」值
     * 字典[循环天数]
     * @param val
     */
    AttendanceRuleDTO setInversionDays(Integer inversionDays) {
        this.inversionDays = inversionDays
        return this
    }


    /**
     * 设置「生效时间」值
     * @param val
     */
    AttendanceRuleDTO setEffectTime(Timestamp effectTime) {
        this.effectTime = effectTime
        return this
    }


    /**
     * 设置「工作天数（上A休B）」值
     * @param val
     */
    AttendanceRuleDTO setWork(Integer work) {
        this.work = work
        return this
    }


    /**
     * 设置「休息天数（上A休B）」值
     * @param val
     */
    AttendanceRuleDTO setRest(Integer rest) {
        this.rest = rest
        return this
    }


    /**
     * 设置「是否休息日相同」值
     * 字典[是否休息日相同]
     * @param val
     */
    AttendanceRuleDTO setSameRestday(Integer sameRestday) {
        this.sameRestday = sameRestday
        return this
    }


    /**
     * 设置「倒班数」值
     * 字典[N班倒]
     * @param val
     */
    AttendanceRuleDTO setInversionCount(Integer inversionCount) {
        this.inversionCount = inversionCount
        return this
    }


    /**
     * 设置「默认班次标识」值
     * @param val
     */
    AttendanceRuleDTO setDefaultShift(String defaultShift) {
        this.defaultShift = defaultShift
        return this
    }


    /**
     * 设置「智能匹配判断结果」值
     * @param val
     */
    AttendanceRuleDTO setJudgeResult(String judgeResult) {
        this.judgeResult = judgeResult
        return this
    }


    /**
     * 设置「成员总数」值
     * @param val
     */
    AttendanceRuleDTO setTotalMembers(String totalMembers) {
        this.totalMembers = totalMembers
        return this
    }


    /**
     * 设置「班次数量」值
     * 字典[班次数量]
     * @param val
     */
    AttendanceRuleDTO setShiftNum(Integer shiftNum) {
        this.shiftNum = shiftNum
        return this
    }


    /**
     * 设置「是否激活」值
     * 字典[是否]
     * @param val
     */
    AttendanceRuleDTO setIsActivate(Integer isActivate) {
        this.isActivate = isActivate
        return this
    }


    /**
     * 设置「组排班数」值
     * @param val
     */
    AttendanceRuleDTO setGroupNum(Integer groupNum) {
        this.groupNum = groupNum
        return this
    }


    /**
     * 设置「节假日配置」值
     * 字典[节假日（动态）]
     * @param val
     */
    AttendanceRuleDTO setHoliday(String holiday) {
        this.holiday = holiday
        return this
    }


    /**
     * 设置「实际出勤次数」值
     * 字典[打卡次数]
     * @param val
     */
    AttendanceRuleDTO setFreeRatio(Integer freeRatio) {
        this.freeRatio = freeRatio
        return this
    }


    /**
     * 设置「实际最少出勤时长」值
     * @param val
     */
    AttendanceRuleDTO setFreeMinMinutes(Integer freeMinMinutes) {
        this.freeMinMinutes = freeMinMinutes
        return this
    }


    /**
     * 设置「默认免考勤」值
     * 字典[是否]
     * @param val
     */
    AttendanceRuleDTO setDefaultFlag(Integer defaultFlag) {
        this.defaultFlag = defaultFlag
        return this
    }


    /**
     * 设置「工作时段」值
     * @param val
     */
    AttendanceRuleDTO setWorkTimes(List<IEntity> workTimes) {
        this.workTimes = workTimes
        return this
    }


    /**
     * 设置「考勤方式」值
     * 字典[考勤方式类型]
     * @param val
     */
    AttendanceRuleDTO setCheckinMethod(String checkinMethod) {
        this.checkinMethod = checkinMethod
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    AttendanceRuleDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「创建人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceRuleDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「弹性分钟数」值
     * @param val
     */
    AttendanceRuleDTO setElasticMinutes(Integer elasticMinutes) {
        this.elasticMinutes = elasticMinutes
        return this
    }


    /**
     * 设置「是否启用弹性打卡」值
     * 字典[是否]
     * @param val
     */
    AttendanceRuleDTO setElasticValid(Integer elasticValid) {
        this.elasticValid = elasticValid
        return this
    }


    /**
     * 设置「结束时间」值
     * @param val
     */
    AttendanceRuleDTO setFreeEnd(Timestamp freeEnd) {
        this.freeEnd = freeEnd
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    AttendanceRuleDTO setFreeStart(Timestamp freeStart) {
        this.freeStart = freeStart
        return this
    }


    /**
     * 设置「主键」值
     * @param val
     */
    AttendanceRuleDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「规则名称」值
     * @param val
     */
    AttendanceRuleDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「班次类型」值
     * 字典[班次类型]
     * @param val
     */
    AttendanceRuleDTO setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AttendanceRuleDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AttendanceRuleDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    AttendanceRuleDTO setDevices(List<AttendanceCheckinDeviceDTO> devices) {
        this.devices = devices
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    AttendanceRuleDTO setGpsList(List<AttendanceGpsLocationDTO> gpsList) {
        this.gpsList = gpsList
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    AttendanceRuleDTO setGroupShifts(List<AttendanceGroupShiftDTO> groupShifts) {
        this.groupShifts = groupShifts
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    AttendanceRuleDTO setShifts(List<AttendanceShiftDTO> shifts) {
        this.shifts = shifts
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    AttendanceRuleDTO setWifiList(List<AttendanceWifiLocationDTO> wifiList) {
        this.wifiList = wifiList
        return this
    }


    /**
     * 设置「null」值
     * @param val
     */
    AttendanceRuleDTO setWorkdays(List<AttendanceWorkdayDTO> workdays) {
        this.workdays = workdays
        return this
    }

}
