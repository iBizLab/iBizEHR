package cn.ibizlab.checkin.runtime.plugin

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime
import net.ibizsys.central.database.ISysDBSchemeRuntime
import net.ibizsys.central.dataentity.action.DEActionRuntimeBase
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.ISearchContextDTO
import org.springframework.util.ObjectUtils

import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.Duration;
import net.ibizsys.runtime.util.Entity
import net.ibizsys.runtime.util.KeyValueUtils

class AttendanceCalculateDEActionRuntime extends DEActionRuntimeBase{

    // 定义日期格式
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter time_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
    private static final DateTimeFormatter originalFormat2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    @Override
    protected Object onExecute(IEntityDTO iEntityDTO) throws Throwable {
        // 初始化运行时对象
        ISysDBSchemeRuntime dbSchema = this.getDataEntityRuntime().getSysDBSchemeRuntimeMust()

        // 获取相关实体运行时
        IDataEntityRuntime attendance_scheduleRuntime = systemRuntime.getDataEntityRuntime("attendance_schedule");
        ISearchContextDTO attendance_scheduleSearchContext = attendance_scheduleRuntime.createSearchContext().all();
        IDataEntityRuntime attendanceRecordRuntime = systemRuntime.getDataEntityRuntime("attendance_record");
        IDataEntityRuntime recordDetailRuntime = systemRuntime.getDataEntityRuntime("attendance_record_detail");
        IDataEntityRuntime employeeRuntime = systemRuntime.getDataEntityRuntime("hr_employee");


        // 清理历史数据
        attendance_scheduleSearchContext = cleanAttendanceData(attendance_scheduleSearchContext, iEntityDTO, dbSchema);

        // 查询排班记录
        List<IEntityDTO> attendance_schedules = attendance_scheduleRuntime.selectDataQuery("all", attendance_scheduleSearchContext);

        // 处理排班记录
        def (List<IEntityDTO> recordList, List<IEntityDTO> detailList) = processSchedules(attendanceRecordRuntime, recordDetailRuntime, employeeRuntime, dbSchema, attendance_schedules);

        //批量保存数据
        batchSaveData(attendanceRecordRuntime, recordList, recordDetailRuntime, detailList);

    }

    /**
     * 清理指定时间范围内的考勤数据
     */
    private ISearchContextDTO cleanAttendanceData(ISearchContextDTO attendance_scheduleSearchContext, IEntityDTO iEntityDTO, ISysDBSchemeRuntime dbSchema) {
        def del_detail_sql = "";
        def del_record_sql = "";
        def del_param = [];

        // 判断是否未手动执行重新计算
        def n_date_gtandeq = "";
        def n_date_ltandeq = "";
        // 获取昨天的日期
        LocalDate yesterday = LocalDate.now();
        // 格式化昨天的日期为字符串
        String yesterdayStr = yesterday.format(formatter);
        if (!ObjectUtils.isEmpty(iEntityDTO)) {
            n_date_gtandeq = iEntityDTO.get("name");
            n_date_ltandeq = iEntityDTO.get("cmd");
        }

        if (!ObjectUtils.isEmpty(n_date_gtandeq) && !ObjectUtils.isEmpty(n_date_ltandeq)){
            del_detail_sql = "delete from attendance_record_detail where record_id in (select t2.id from attendance_record t2 where t2.checkin_date >= ? and t2.checkin_date <= ?)";
            del_record_sql = "delete from attendance_record where checkin_date >= ? and checkin_date <= ?";
            del_param.add(n_date_gtandeq);
            del_param.add(n_date_ltandeq);
            attendance_scheduleSearchContext.gte("checkin_date", n_date_gtandeq);
            attendance_scheduleSearchContext.lte("checkin_date", n_date_ltandeq);
        } else {
            del_detail_sql = "delete from attendance_record_detail where record_id in (select t2.id from attendance_record t2 where t2.checkin_date = ?)";
            del_record_sql = "delete from attendance_record where checkin_date = ?";
            del_param.add(yesterdayStr);
            attendance_scheduleSearchContext.eq("checkin_date", yesterdayStr);
        }
        dbSchema.executeSQL(del_detail_sql, del_param);
        dbSchema.executeSQL(del_record_sql, del_param);
        return attendance_scheduleSearchContext;
    }

    /**
     * 处理所有排班记录生成考勤数据
     */
    private List[] processSchedules(attendanceRecordRuntime, recordDetailRuntime, employeeRuntime, dbSchema, List<IEntityDTO> attendance_schedules) {
        if (!ObjectUtils.isEmpty(attendance_schedules)){
            List<IEntityDTO> record_list = attendanceRecordRuntime.createEntityList();
            List<IEntityDTO> all_details_list = recordDetailRuntime.createEntityList();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            for (IEntityDTO attendance_schedule : attendance_schedules) {
                String member_id = attendance_schedule.get("member_id");
                //是否工作日
                Integer workday = attendance_schedule.getInteger("workday", 0);
                if (workday == 1) {
                    List<Map<String, Object>> applications = null;
                    if (!ObjectUtils.isEmpty(member_id) && !ObjectUtils.isEmpty(attendance_schedule.get("checkin_date"))){
                        def checkinApplicationSql = "select hlt.name as LEAVE_TYPE, h.DATE_FROM , h.DATE_TO  from hr_leave h left join  hr_leave_type hlt on h.HOLIDAY_STATUS_ID  = hlt.id  where h.STATE = 'validate' and DATE(h.DATE_FROM) <= ? and DATE(h.DATE_TO) >= ? and h.EMPLOYEE_ID = ?";
                        def _param = []
                        _param.add(dateFormat.format(attendance_schedule.get("checkin_date")));
                        _param.add(dateFormat.format(attendance_schedule.get("checkin_date")));
                        _param.add(member_id);
                        applications = dbSchema.executeSelectSQL(checkinApplicationSql, _param) as List<Map<String, Object>>;

                        // 创建基础考勤记录
                        IEntityDTO employee = employeeRuntime.get(member_id);
                        IEntityDTO record = createAttendanceRecord(attendance_schedule, employee, attendanceRecordRuntime);

                        // 应出勤天数
                        double attendance_ratio = 1;
                        // 应出勤总工时(分钟数)
                        int work_load = 0;
                        if (!ObjectUtils.isEmpty(attendance_schedule.get("shift_data"))) {
                            Map<String, Object> shift_data = attendance_schedule.get("shift_data") as Map<String, Object>;
                            if (!ObjectUtils.isEmpty(shift_data.get("attendance_ratio"))) {
                                attendance_ratio = shift_data.get("attendance_ratio");
                            }
                            if (!ObjectUtils.isEmpty(shift_data.get("work_load"))) {
                                work_load = Integer.parseInt(shift_data.get("work_load"));
                            }
                        }
                        record.set("should_attendance_days", attendance_ratio);
                        //迟到时长 (分钟)
                        int late_minutes = 0;
                        // 早退时长 (分钟)
                        int leave_early_minutes = 0;
                        //班次信息
                        String shift_message = "";
                        if (!ObjectUtils.isEmpty(attendance_schedule.get("work_time"))){
                            List<IEntityDTO> details_list = recordDetailRuntime.createEntityList();
                            List<Entity> work_time_list = attendance_schedule.get("work_time") as List<Entity>;
                            // 给班次排序
                            work_time_list.sort { it.get("order_value") }
                            // 给跨天班次打标记并返回打卡记录
                            List<Map<String, Object>> clock_list = setNextDayFlag(work_time_list, member_id, dateFormat.format(attendance_schedule.get("checkin_date")), dbSchema);
                            Entity ruleData = attendance_schedule.get("rule_data");
                            Entity shiftData = attendance_schedule.get("shift_data");
                            int work_item_index = 1;
                            for (Entity work_time : work_time_list){
                                String start = String.valueOf(work_time.get("start_base_time"));
                                String end = String.valueOf(work_time.get("end_base_time"));
                                shift_message += work_time.get("shift_name") + ":" + start + "-" + end;
                                if (!ObjectUtils.isEmpty(start) && !ObjectUtils.isEmpty(end)) {
                                    // 解析字符串为 LocalTime（仅提取时分）
                                    LocalTime start_time = LocalTime.parse(start, time_formatter).withSecond(0).withNano(0);
                                    LocalTime end_time = LocalTime.parse(end, time_formatter).withSecond(0).withNano(0);
                                    // 解析班次
                                    Map<String, LocalDateTime> workTimeMap = parseWorkTime(attendance_schedule, work_time);
                                    // 处理打卡记录
                                    Map<String, List<LocalDateTime>> checkTimesMap = processClockRecord(workTimeMap, clock_list, attendance_schedule.get("schedule_type"));
                                    // 上班details
                                    IEntityDTO start_detail = processCheckinDetail(ruleData, recordDetailRuntime, work_time, applications, record.get("id"), checkTimesMap, work_item_index,0);
                                    details_list.add(start_detail);
                                    all_details_list.add(start_detail);
                                    IEntityDTO end_detail = recordDetailRuntime.createEntity();
                                    if (checkTimesMap) {
                                        // 下班details
                                        end_detail = processCheckinDetail(ruleData, recordDetailRuntime, work_time, applications, record.get("id") , checkTimesMap, work_item_index, 1);
                                        details_list.add(end_detail);
                                        all_details_list.add(end_detail);
                                    }
                                    // 实际出勤时长
                                    calculateActualAttendance(attendance_schedule, record, work_time, start_detail, end_detail, attendance_ratio, work_load);
                                    // 是否迟到
                                    if (Objects.equals("LATE", start_detail.get("checkin_result"))){
                                        LocalTime start_checkin_time = LocalTime.parse(String.valueOf(start_detail.get("checkin_time")), originalFormat);
                                        late_minutes += calculateMins(start_time, start_checkin_time);
                                    }
                                    // 是否早退
                                    if (Objects.equals("LEAVE_EARLY", end_detail.get("checkin_result"))){
                                        LocalTime end_checkin_time = LocalTime.parse(String.valueOf(end_detail.get("checkin_time")), originalFormat);
                                        leave_early_minutes += calculateMins(end_checkin_time, end_time);
                                    }
                                    if (work_time_list.indexOf(work_time) == work_time_list.size() - 1) {
                                        // 最后一个班次，计算加班
                                        calculateOvertime(record, shiftData, workTimeMap, checkTimesMap);
                                    }
                                    // 计算应出勤时长
                                    double should_attendance_hours = calculateShouldAttendance(record, attendance_schedule, work_time);
                                    // 处理申请数据
                                    processCheckinApplications(applications, attendance_schedule, record, start, should_attendance_hours);
                                }
                                work_item_index++
                            }
                            record.set("late_minutes", late_minutes)
                            record.set("leave_early_minutes", leave_early_minutes)
                            record.set("shift_message", shift_message)
                            if (details_list.size() > 0){
                                boolean normal_status = true;
                                boolean late_status = false;
                                boolean leave_early_status = false;
                                boolean missing_status = false;
                                boolean absent_status = false;
                                int late_times = 0;
                                int leave_early_times = 0;
                                int checkin_missing_times = 0;
                                for (IEntityDTO details : details_list) {
                                    String checkin_result = details.get("checkin_result")
                                    if (Objects.equals(checkin_result, "LATE")){
                                        normal_status = false;
                                        late_status = true;
                                        late_times++;
                                    } else if (Objects.equals(checkin_result, "LEAVE_EARLY")){
                                        normal_status = false;
                                        leave_early_status = true;
                                        leave_early_times++;
                                    } else if (checkin_result.contains("MISSING")){
                                        normal_status = false;
                                        missing_status = true;
                                        checkin_missing_times++;
                                    } else if (checkin_result.contains("ABSENT")){
                                        //缺勤也计缺卡
                                        checkin_missing_times++;
                                        normal_status = false;
                                        absent_status = true;
                                    }
                                }
                                record.set("late_times", late_times);
                                record.set("leave_early_times", leave_early_times);
                                record.set("checkin_missing_times", checkin_missing_times);
                                if (normal_status){
                                    record.set("checkin_result", "NORMAL");
                                } else {
                                    if (late_status){
                                        record.set("checkin_result", "LATE");
                                    }
                                    if (leave_early_status){
                                        record.set("checkin_result", "LEAVE_EARLY");
                                    }
                                    if (late_status && leave_early_status) {
                                        record.set("checkin_result", "LATE_AND_LEAVE_EARLY");
                                    }
                                    if (absent_status){
                                        record.set("checkin_result", "ABSENT");
                                    }
                                    if (missing_status){
                                        record.set("checkin_result", "MISSING");
                                    }
                                }
                            }
                            if (details_list.size() == 0 && ObjectUtils.isEmpty(record.get("checkin_result"))){
                                record.set("checkin_result", "ABSENT");
                            }
                        }
                        record_list.add(record)
                    }
                }
            }
            return [record_list, all_details_list];
        }
    }

    /**
     * 创建基础考勤记录
     */
    private IEntityDTO createAttendanceRecord(IEntityDTO attendance_schedule, IEntityDTO employee, attendanceRecordRuntime) {
        IEntityDTO record = attendanceRecordRuntime.createEntity();
        String record_id = KeyValueUtils.genUniqueId();
        record.set("id", record_id);
        record.set("member_id", attendance_schedule.get("member_id"));
        record.set("checkin_date", attendance_schedule.get("checkin_date"));
        record.set("rule_id", attendance_schedule.get("rule_id"));
        record.set("title", employee.get("title"));
        record.set("member_num", employee.get("employee_num"));
        record.set("dept_id", employee.get("department_id"));
        record.set("dept_name", employee.get("department_name"));
        record.set("member_name", employee.get("name"));
        record.set("overtime_hours", 0);
        record.set("should_attendance_hours", 0)
        record.set("working_hours", 0)
        record.set("working_mins", 0)
        record.set("actual_attendance_days", 0)
        return record;
    }

    /**
     * 计算加班
     */
    private void calculateOvertime(record, shiftData, Map<String, LocalDateTime> workTimeMap, Map<String, List<LocalDateTime>> checkTimesMap) {
        long overtime_hours = record.get("overtime_hours");
        LocalDateTime end = workTimeMap.get("end_base_time");
        if (!ObjectUtils.isEmpty(shiftData.get("overtime_valid")) && shiftData.get("overtime_valid") == 1) {
            long start_overtime = shiftData.get("start_overtime");
            long invalid_overtime = shiftData.get("invalid_overtime");
            LocalDateTime invalidTime = null;
            LocalDateTime normalTime = null;
            if (!ObjectUtils.isEmpty(checkTimesMap) && !ObjectUtils.isEmpty(checkTimesMap.get("invalid_check_times")) && checkTimesMap.get("invalid_check_times").size() > 0) {
                invalidTime = Collections.max(checkTimesMap.get("invalid_check_times"));
            }
            if (!ObjectUtils.isEmpty(checkTimesMap) && !ObjectUtils.isEmpty(checkTimesMap.get("normal_end_check_times")) && checkTimesMap.get("normal_end_check_times").size() > 0) {
                normalTime = Collections.max(checkTimesMap.get("normal_end_check_times"));
            }
            LocalDateTime latestTime = compareAndReturnMax(invalidTime, normalTime);
            // 判断是否符合加班条件
            if (!ObjectUtils.isEmpty(latestTime)) {
                if (compareLocalDateTimes(latestTime, end.plusMinutes(start_overtime)) == 1 && calculateMinutes(end, latestTime) > invalid_overtime) {
                    overtime_hours += calculateTimes(end, latestTime);
                }
            }
        }
        record.set("overtime_hours", overtime_hours);
    }

    /**
     * 计算应出勤时长
     */
    private double calculateShouldAttendance(record, attendance_schedule, work_time) {
        double should_attendance_hours = record.get("should_attendance_hours");
        String checkinDate = String.valueOf(attendance_schedule.get("checkin_date")).substring(0, 11);
        String start = checkinDate + String.valueOf(work_time.get("start_base_time"));
        String end = checkinDate + String.valueOf(work_time.get("end_base_time"));
        LocalDateTime start_time = LocalDateTime.parse(start, originalFormat2).withSecond(0).withNano(0);
        LocalDateTime end_time = LocalDateTime.parse(end, originalFormat2).withSecond(0).withNano(0);
        // 次日班次
        if (work_time.get("isNextDay") == 1) {
            start_time = start_time.plusDays(1);
            end_time = end_time.plusDays(1);
        } else if (work_time.get("isNextDay") == 2) {
            end_time = end_time.plusDays(1);
        }
        should_attendance_hours += calculateTimes(start_time, end_time);
        record.set("should_attendance_hours", should_attendance_hours);
        return should_attendance_hours;
    }

    /**
     * 计算实际出勤时长
     */
    private void calculateActualAttendance(IEntityDTO attendance_schedule, IEntityDTO record, workTime, IEntityDTO start_detail, IEntityDTO end_detail, attendance_ratio, work_load) {

        Entity ruleData = attendance_schedule.get("rule_data");
        // 实际出勤小时
        double working_hours = record.get("working_hours");
        // 实际出勤分钟
        double working_mins = record.get("working_mins");
        // 实际出勤天数
        double actual_attendance_days = record.get("actual_attendance_days");

        if (!ObjectUtils.isEmpty(start_detail) && !ObjectUtils.isEmpty(end_detail) && !ObjectUtils.isEmpty(start_detail.get("checkin_time")) && !ObjectUtils.isEmpty(end_detail.get("checkin_time"))) {
            LocalDateTime start_check_time = LocalDateTime.parse(String.valueOf(start_detail.get("checkin_time")), originalFormat);
            LocalDateTime end_check_time = LocalDateTime.parse(String.valueOf(end_detail.get("checkin_time")), originalFormat);
            working_hours += calculateTimes(start_check_time, end_check_time);
            working_mins += calculateMinutes(start_check_time, end_check_time);
        }
        if (!ObjectUtils.isEmpty(workTime.get("rest_enable")) && workTime.get("rest_enable") == 1) {
            String checkinDate = String.valueOf(attendance_schedule.get("checkin_date")).substring(0, 11);
            String start = checkinDate + String.valueOf(workTime.get("rest_start"));
            String end = checkinDate + String.valueOf(workTime.get("end_start"));
            LocalDateTime restStart = LocalDateTime.parse(start, originalFormat2);
            LocalDateTime restEnd = LocalDateTime.parse(end, originalFormat2);
            if (compareLocalDateTimes(restStart, restEnd) == 1) {
                restEnd.plusDays(1);
            }
            working_hours -= calculateTimes(restStart, restEnd);
            working_mins -= calculateMinutes(restStart, restEnd);
        }
        // 处理自由班打卡规则
        if (!ObjectUtils.isEmpty(ruleData) && ruleData.get("schedule_type") == "free") {
            // 打卡两次及以上
            if (ruleData.get("free_ratio") == 2) {
                if (working_mins <= ruleData.get("free_min_minutes")) {
                    working_hours = 0;
                }
            }
        }
        record.set("working_hours", working_hours)

        // 计算实际出勤天数(实际出勤工时 / 规则上的总工时  * 应出勤天数)
        if (working_hours != 0 && work_load != 0) {
            actual_attendance_days = ((working_hours * 60) / work_load) * attendance_ratio;
            // 四舍五入保留一位
            double rounded = Math.round(actual_attendance_days * 10.0) / 10.0;
            record.set("actual_attendance_days", rounded)
        }
        record.set("actual_attendance_days", actual_attendance_days);
    }

    /**
     * 处理申请数据
     */
    private void processCheckinApplications(applications, attendance_schedule, record, start, should_attendance_hours) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if(!ObjectUtils.isEmpty(applications)){
            for (Map<String, Object> item : applications) {
                String endTime = String.valueOf(item.get("DATE_TO"));
                String baseStart = dateFormat.format(attendance_schedule.get("checkin_date")).toString() + " " + start;
                LocalDateTime  baseStartTime = LocalDateTime.parse(baseStart, originalFormat2).withSecond(0).withNano(0);
                LocalDateTime  end_Time = LocalDateTime.parse(endTime, originalFormat).withSecond(0).withNano(0);
                double checkinApplicationDuration = calculateTimes(baseStartTime, end_Time);
                if (checkinApplicationDuration >= should_attendance_hours) {
                    record.set("leave_duration", should_attendance_hours);
                    record.set("leave_type", item.get("LEAVE_TYPE"));
                } else {
                    record.set("leave_duration", checkinApplicationDuration);
                    record.set("leave_type", item.get("LEAVE_TYPE"));
                }
                //todo Odoo其他申请类型暂未确认
//                if (item.get("APPLY_TYPE") == "LEAVE") {
//                    if (checkinApplicationDuration >= should_attendance_hours) {
//                        record.set("leave_duration", should_attendance_hours);
//                        record.set("leave_type", item.get("LEAVE_TYPE"));
//                    } else {
//                        record.set("leave_duration", checkinApplicationDuration);
//                        record.set("leave_type", item.get("LEAVE_TYPE"));
//                    }
//                } else if (item.get("APPLY_TYPE") == "BUSINESS_TRIP"){
//                    if (checkinApplicationDuration >= should_attendance_hours) {
//                        record.set("on_business_days", 1);
//                    }
//                } else if (item.get("APPLY_TYPE") == "GO_OUT"){
//                    if (checkinApplicationDuration >= should_attendance_hours) {
//                        record.set("out_hours", should_attendance_hours);
//                    } else {
//                        record.set("out_hours", checkinApplicationDuration);
//                    }
//                }
            }
        }
    }

    /**
     * 解析班次
     */
    private Map<String, LocalDateTime> parseWorkTime(IEntityDTO attendance_schedule, Entity work_time) {
        String checkinDate = String.valueOf(attendance_schedule.get("checkin_date")).substring(0, 11);
        String start = checkinDate + String.valueOf(work_time.get("start_base_time"));
        String end = checkinDate + String.valueOf(work_time.get("end_base_time"));
        LocalDateTime start_time = LocalDateTime.parse(start, originalFormat2).withSecond(0).withNano(0);
        LocalDateTime end_time = LocalDateTime.parse(end, originalFormat2).withSecond(0).withNano(0);
        // 次日班次
        if (work_time.get("isNextDay") == 1) {
            start_time = start_time.plusDays(1);
            end_time = end_time.plusDays(1);
        } else if (work_time.get("isNextDay") == 2) {
            end_time = end_time.plusDays(1);
        }
        // 上班晚 30分钟 记为迟到(计弹性打卡时间)
        LocalDateTime lateStartTimeLimit = start_time.plusMinutes(work_time.get("late_for_late"));
        if (!ObjectUtils.isEmpty(attendance_schedule.get("rule_data"))) {
            Map<String, Object> rule_data = attendance_schedule.get("rule_data") as Map<String, Object>;
            if (!ObjectUtils.isEmpty(rule_data.get("elastic_valid")) && rule_data.get("elastic_valid") == 1) {
                if (rule_data.get("elastic_minutes") > work_time.get("late_for_late")) {
                    lateStartTimeLimit = start_time.plusMinutes(rule_data.get("elastic_minutes"));
                }
            }
        }
        // 上班晚 n分钟 记为缺卡
        LocalDateTime missingStartTimeLimit = start_time.plusMinutes(work_time.get("late_for_absenteeism") ?: 0);
        // 最早提前 n分钟 记为正常打卡
        LocalDateTime earliestStartTimeLimit = start_time.minusMinutes(work_time.get("earliest_checkin") ?: 0);
        // 下班时间最晚 n分钟 记为正常打卡
        LocalDateTime latestEndTimeLimit = end_time.plusMinutes(work_time.get("latest_checkout") ?: 0);
        // 下班早 n分钟 记为早退
        LocalDateTime earlyLeaveEndTimeLimit = end_time.minusMinutes(work_time.get("early_for_early") ?: 0);
        // 下班早 n分钟 记为缺卡
        LocalDateTime missingEndTimeLimit = end_time.minusMinutes(work_time.get("early_for_absenteeism") ?: 0);
        Map<String, LocalDateTime> map = new HashMap<>();
        map.put("missingStartTimeLimit", missingStartTimeLimit);
        map.put("earliestStartTimeLimit", earliestStartTimeLimit);
        map.put("latestEndTimeLimit", latestEndTimeLimit);
        map.put("earlyLeaveEndTimeLimit", earlyLeaveEndTimeLimit);
        map.put("missingEndTimeLimit", missingEndTimeLimit);
        map.put("lateStartTimeLimit", lateStartTimeLimit);
        // 上下班时间（特供灵活打卡、自由班）
        map.put("start_base_time", start_time);
        map.put("end_base_time", end_time);
        return map;
    }

    /**
     * 处理打卡记录
     */
    private Map<String, List<LocalDateTime>> processClockRecord(Map<String, LocalDateTime> workTimeMap, clock_list, String schedule_type) {
        // 上班正常打卡时间
        List<LocalDateTime> normal_start_check_times = new ArrayList<>();
        // 上班迟到打卡时间
        List<LocalDateTime> late_start_check_times = new ArrayList<>();
        // 上下班缺卡打卡时间
        List<LocalDateTime> missing_check_times = new ArrayList<>();
        // 下班正常打卡时间
        List<LocalDateTime> normal_end_check_times = new ArrayList<>();
        // 下班早退打卡时间
        List<LocalDateTime> early_end_check_times = new ArrayList<>();
        // 超出有效打卡时间范围: 无效打卡
        List<LocalDateTime> invalid_check_times = new ArrayList<>();
        // 上下班区间内打卡（特供灵活打卡、自由班）
        List<LocalDateTime> between_check_times = new ArrayList<>();
        for (Map<String, Object> clock : clock_list) {
            String check_in_date = String.valueOf(clock.get("CHECKIN_TIME"));
            if (!ObjectUtils.isEmpty(check_in_date)){
                LocalDateTime check_in_local_date = formatTimeStr(check_in_date);
                LocalDateTime check_in_time = LocalDateTime.parse(check_in_date, originalFormat).withSecond(0).withNano(0);
                if (isTimeInRange01(check_in_time, workTimeMap.get("earliestStartTimeLimit"), workTimeMap.get("lateStartTimeLimit"))){
                    //上班正常 打卡时间范围  判断是否在 earliestStartTimeLimit ~ lateStartTimeLimit 包含最早最晚时间
                    normal_start_check_times.add(check_in_local_date)
                } else if (isTimeInRange02(check_in_time, workTimeMap.get("lateStartTimeLimit"), workTimeMap.get("missingStartTimeLimit"))){
                    //上班迟到 打卡时间范围  判断是否在lateStartTimeLimit后 ~ missingStartTimeLimit 不包含最早 但包含最晚
                    late_start_check_times.add(check_in_local_date)
                } else if (isTimeInRange01(check_in_time, workTimeMap.get("earlyLeaveEndTimeLimit"), workTimeMap.get("latestEndTimeLimit"))){
                    //下班正常 打卡时间范围  判断是否在 earlyLeaveEndTimeLimit ~ latestEndTimeLimit 包含最早最晚时间
                    normal_end_check_times.add(check_in_local_date)
                } else if (isTimeInRange03(check_in_time, workTimeMap.get("missingEndTimeLimit"), workTimeMap.get("earlyLeaveEndTimeLimit"))){
                    //下班早退 打卡时间范围  判断是否在 missingEndTimeLimit 后 ~ earlyLeaveEndTimeLimit 不包含最早 但包含最晚
                    early_end_check_times.add(check_in_local_date)
                } else if (isTimeInRange04(check_in_time, workTimeMap.get("missingStartTimeLimit"), workTimeMap.get("missingEndTimeLimit"))){
                    //上下班缺卡 打卡时间范围  判断是否在 missingStartTimeLimit ~ missingEndTimeLimit 不包含最早 不包含最晚
                    missing_check_times.add(check_in_local_date)
                } else {
                    invalid_check_times.add(check_in_local_date)
                }
                // 特殊规则使用
                if ((schedule_type == "flexible" || schedule_type == "free") && isTimeInRange01(check_in_time, workTimeMap.get("earliestStartTimeLimit"), workTimeMap.get("latestEndTimeLimit"))) {
                    //上下班区间 打卡时间范围  判断是否在 start_base_time ~ end_base_time 包含最早最晚时间
                    between_check_times.add(check_in_local_date)
                }
            }
        }
        Map<String, List<LocalDateTime>> map = new HashMap<>();

        map.put("normal_start_check_times", normal_start_check_times);
        map.put("late_start_check_times", late_start_check_times);
        map.put("missing_check_times", missing_check_times);
        map.put("normal_end_check_times", normal_end_check_times);
        map.put("early_end_check_times", early_end_check_times);
        map.put("invalid_check_times", invalid_check_times);
        map.put("between_check_times", between_check_times);
        // 找到时间最小的两条记录，并移除，排除打卡记录被重复利用问题
        removeMinTimeRecords(clock_list);
        return map;
    }

    /**
     * 处理打卡详情记录
     */
    private IEntityDTO processCheckinDetail(Entity ruleData, recordDetailRuntime, Entity workTime, applications, String recordId, Map<String, List<LocalDateTime>> map, int index, tag) {
        String start = String.valueOf(workTime.get("start_base_time"));
        String end = String.valueOf(workTime.get("end_base_time"));
        String id = KeyValueUtils.genUniqueId();
        IEntityDTO detail = recordDetailRuntime.createEntity();
        detail.set("id", id);
        detail.set("record_id", recordId);
        if (!ObjectUtils.isEmpty(applications)) {
            for (Map<String, Object> application : applications) {
                String startTime = String.valueOf(application.get("DATE_FROM"));
                String endTime = String.valueOf(application.get("DATE_TO"));
                LocalDateTime workTimeStart = LocalDateTime.parse(startTime.substring(0, 10) + " " + start, originalFormat2).withSecond(0).withNano(0);
                LocalDateTime workTimeEnd = LocalDateTime.parse(startTime.substring(0, 10) + " " + end, originalFormat2).withSecond(0).withNano(0);
                LocalDateTime applicationStart = LocalDateTime.parse(startTime, originalFormat).withSecond(0).withNano(0);
                LocalDateTime applicationEnd = LocalDateTime.parse(endTime, originalFormat).withSecond(0).withNano(0);
                if (isTimeInRange5(workTimeStart, workTimeEnd, applicationStart, applicationEnd)) {
                    detail.set("checkin_result", application.get("LEAVE_TYPE"));
                }
                if (tag == 0) {
                    detail.set("detail_index", "start");
                    detail.set("should_checkin_time", start);
                } else {
                    detail.set("detail_index", "end");
                    detail.set("should_checkin_time", end);
                }
            }
        } else {
            boolean normal = false;
            if (tag == 0) {
                detail.set("detail_index", "start_" + index);
                detail.set("should_checkin_time", start);
                // 处理灵活打卡规则-上下班时间内打卡一次
                if (!ObjectUtils.isEmpty(ruleData) && ruleData.get("requirement") == "only_once" && map.get("between_check_times").size() > 0) {
                    detail.set("checkin_time", start);
                    detail.set("checkin_result", "NORMAL");
                    return detail;
                } else if (ruleData.get("requirement") == "only_once") {
                    detail.set("checkin_result", "ABSENT");
                    return detail;
                }

                // 处理灵活打卡规则-只打下班卡
                if (!ObjectUtils.isEmpty(ruleData) && ruleData.get("requirement") == "only_checkout") {
                    detail.set("checkin_time", start);
                    detail.set("checkin_result", "NORMAL");
                } else {
                    if (!ObjectUtils.isEmpty(map.get("normal_start_check_times"))){
                        // 获取最早时间
                        LocalDateTime earliestTime = Collections.min(map.get("normal_start_check_times"));
                        detail.set("checkin_time", earliestTime);
                        detail.set("checkin_result", "NORMAL");
                        normal = true;
                    }
                    if (!normal){
                        boolean abnormal = false;
                        // 迟到打卡
                        if (!ObjectUtils.isEmpty(map.get("late_start_check_times"))){
                            // 获取最早时间
                            LocalDateTime earliestTime = Collections.min(map.get("late_start_check_times"));
                            detail.set("checkin_time", earliestTime);
                            detail.set("checkin_result", "LATE");
                            abnormal = true;
                        }
                        // 缺卡
                        if (!abnormal && !ObjectUtils.isEmpty(map.get("missing_check_times"))){
                            LocalDateTime earliestTime = Collections.min(map.get("missing_check_times"));
                            detail.set("checkin_time", earliestTime);
                            detail.set("checkin_result", "ON_MISSING");
                        }
                        // 无效打卡
                        if (!abnormal && !ObjectUtils.isEmpty(map.get("invalid_check_times"))) {
                            LocalDateTime earliestTime = Collections.min(map.get("invalid_check_times"));
                            detail.set("checkin_time", earliestTime);
                            detail.set("checkin_result", "ON_MISSING");
                        }
                    }
                }
            } else {
                detail.set("detail_index", "end_" + index);
                detail.set("should_checkin_time", end);
                // 处理灵活打卡规则-上下班时间内打卡一次
                if (!ObjectUtils.isEmpty(ruleData) && ruleData.get("requirement") == "only_once" && map.get("between_check_times").size() > 0) {
                    detail.set("checkin_time", end);
                    detail.set("checkin_result", "NORMAL");
                    return detail;
                } else if (ruleData.get("requirement") == "only_once") {
                    detail.set("checkin_result", "ABSENT");
                    return detail;
                }

                // 处理灵活打卡规则-只打上班卡
                if (!ObjectUtils.isEmpty(ruleData) && ruleData.get("requirement") == "only_checkout") {
                    detail.set("checkin_time", end);
                    detail.set("checkin_result", "NORMAL");
                } else {
                    if (!ObjectUtils.isEmpty(map.get("normal_end_check_times"))){
                        // 获取晚时间
                        LocalDateTime latestTime = Collections.max(map.get("normal_end_check_times"));
                        detail.set("checkin_time", latestTime);
                        detail.set("checkin_result", "NORMAL");
                        normal = true;
                    }
                    if (!normal){
                        boolean abnormal = false;
                        // 早退
                        if (!ObjectUtils.isEmpty(map.get("early_end_check_times"))){
                            LocalDateTime latestTime = Collections.max(map.get("early_end_check_times"));
                            detail.set("checkin_time", latestTime);
                            detail.set("checkin_result", "LEAVE_EARLY");
                            abnormal = true;
                        }
                        // 缺卡
                        if (!abnormal && !ObjectUtils.isEmpty(map.get("missing_check_times"))){
                            LocalDateTime latestTime = Collections.max(map.get("missing_check_times"));
                            detail.set("checkin_time", latestTime);
                            detail.set("checkin_result", "OFF_MISSING");
                        }
                        // 无效打卡
                        if (!abnormal && !ObjectUtils.isEmpty(map.get("invalid_check_times"))) {
                            LocalDateTime latestTime = Collections.max(map.get("invalid_check_times"))
                            if (detail.get("checkin_time")){
                                LocalDateTime checkin_time = (Timestamp)detail.get("checkin_time").toLocalDateTime()
                                if (latestTime.isAfter(checkin_time)){
                                    detail.set("checkin_time", latestTime);
                                }
                                detail.set("checkin_result", "OFF_MISSING");
                            }

                        }
                    }
                }
            }
            if (ObjectUtils.isEmpty(detail.get("checkin_result"))){
                detail.set("checkin_result", "ABSENT");
            }
        }
        return detail;
    }

    /**
     * 批量保存数据
     */
    private void batchSaveData(IDataEntityRuntime attendanceRecordRuntime, List<IEntityDTO> records,
                               IDataEntityRuntime recordDetailRuntime, List<IEntityDTO> details) {
        if (!records.isEmpty()) {
            attendanceRecordRuntime.rawCreate(records, true)
        }
        if (!details.isEmpty()) {
            recordDetailRuntime.rawCreate(details, true)
        }
    }

    /**
     * 找到最小时间的两条记录，并移除
     */
    private static void removeMinTimeRecords(List<Map<String, Object>> data) {
        // 如果 data 为 null 或者数据量少于 1 条，直接返回
        if (data == null || data.size() < 1) return;
        // 如果只有一条或两条记录，直接移除
        if (data.size() == 1 || data.size() == 2) {
            data.clear(); // 清空所有记录
            return;
        }
        // 找到CHECKIN_TIME最小的两条记录
        Map<String, Object> minTimeRecord = data.get(0);
        String minTime = (String) minTimeRecord.get("CHECKIN_TIME");
        Map<String, Object> secondMinTimeRecord = null;
        String secondMinTime = null;
        // 遍历，找到最小和第二小的记录
        for (Map<String, Object> record : data) {
            String checkinTime = (String) record.get("CHECKIN_TIME");

            if (checkinTime.compareTo(minTime) < 0) {
                // 更新最小时间记录
                secondMinTimeRecord = minTimeRecord;
                secondMinTime = minTime;
                minTime = checkinTime;
                minTimeRecord = record;
            } else if (secondMinTime == null || checkinTime.compareTo(secondMinTime) < 0) {
                // 更新第二小时间记录
                secondMinTime = checkinTime;
                secondMinTimeRecord = record;
            }
        }
        // 移除最小和第二小的记录
        data.remove(minTimeRecord);
        data.remove(secondMinTimeRecord);
    }

    /**
     * 遍历列表，检查时间，修改 isNextDay 属性，并返回打卡记录
     */
    private List<Map<String, Object>> setNextDayFlag(List<Entity> work_time_list, String memberId, String checkinDate, ISysDBSchemeRuntime dbSchema) {
        String sqlStr = "select CHECK_IN ,CHECK_OUT  from  hr_attendance ha where EMPLOYEE_ID  = ?";
        def _param = []
        _param.add(memberId);
        _param.add(checkinDate);
        for (int i = 0; i < work_time_list.size(); i++) {
            Entity currentEntity = work_time_list[i];
            String start = String.valueOf(currentEntity.get("start_base_time"));
            String end = String.valueOf(currentEntity.get("end_base_time"));
            LocalTime start_time = LocalTime.parse(start, time_formatter).withSecond(0).withNano(0);
            LocalTime end_time = LocalTime.parse(end, time_formatter).withSecond(0).withNano(0);
            // 比较 start_base_time 和 end_base_time 的值
            if (compareTimes(start_time, end_time) == 1) {
                LocalDate nextDayDate = LocalDate.parse(checkinDate, formatter).plusDays(1);
                sqlStr += " AND DATE(CHECK_IN) >= ? AND DATE(CHECK_IN) <= ?";
                _param.add(nextDayDate);
                // 如果 start_base_time 大于 end_base_time，则设置当前和后续对象的 isNextDay 为 1
                for (int j = i; j < work_time_list.size(); j++) {
                    if (j == i) {
                        work_time_list[j].set("isNextDay", 2);
                    } else {
                        work_time_list[j].set("isNextDay", 1);
                    }
                }
            } else {
                sqlStr += " AND DATE(CHECK_IN) = ?";
            }
            break;
        }
        return getClockList(dbSchema, sqlStr, _param);
    }

    /**
     * 根据班次信息获取打卡记录
     */
    private static List<Map<String, Object>> getClockList(ISysDBSchemeRuntime dbSchema, sqlStr, _param) {
        List<Map<String, Object>> originalList = dbSchema.executeSelectSQL(sqlStr, _param);

        if (originalList.isEmpty()) {
            return Collections.emptyList();
        }

        // 创建新列表存储转换后的结果
        List<Map<String, Object>> resultList = new ArrayList<>();

        for (Map<String, Object> clock : originalList) {
            // 处理签到时间
            if (clock.get("CHECK_IN") != null) {
                Map<String, Object> checkIn = new HashMap<>();
                checkIn.put("CHECKIN_TIME", clock.get("CHECK_IN"));
                resultList.add(checkIn);
            }

            // 处理签退时间
            if (clock.get("CHECK_OUT") != null) {
                Map<String, Object> checkOut = new HashMap<>();
                checkOut.put("CHECKIN_TIME", clock.get("CHECK_OUT"));
                resultList.add(checkOut);
            }
        }

        return resultList;
    }

    /**
     * 判断map当且仅有一个长度为1
     */
    private static boolean checkSingleListLength(Map<String, List<LocalDateTime>> checkTimesMap) {
        int count = 0; // 统计 List 长度为 1 的数量
        // 遍历 Map 中的每个键值对
        for (Map.Entry<String, List<LocalDateTime>> entry : checkTimesMap.entrySet()) {
            List<LocalDateTime> timeList = entry.getValue();
            // 判断 list 的长度是否为 1
            if (timeList != null && timeList.size() > 0) {
                count += timeList.size() ;
            }
        }
        // 如果只有一个 List 长度为 1 的条目
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }

    private static LocalDateTime compareAndReturnMax(LocalDateTime time1, LocalDateTime time2) {
        // 处理时间为null的情况
        if (time1 == null && time2 == null) {
            return null; // 如果两个时间都是null，返回null
        }
        if (time1 == null) {
            return time2; // 如果time1是null，返回time2
        }
        if (time2 == null) {
            return time1; // 如果time2是null，返回time1
        }

        // 如果都不为null，比较大小
        if (time1.isBefore(time2)) {
            return time2; // 返回较大的时间
        } else if (time1.isAfter(time2)) {
            return time1; // 返回较大的时间
        } else {
            return time1; // 如果相等，返回任意一个
        }
    }



    private static int compareLocalDateTimes(LocalDateTime earliestTime, LocalDateTime latestTime) {
        if (earliestTime.isBefore(latestTime)) {
            return -1; // earliestTime 小于 latestTime
        } else if (earliestTime.isAfter(latestTime)) {
            return 1;  // earliestTime 大于 latestTime
        } else {
            return 0;  // earliestTime 等于 latestTime
        }
    }


    // 判断 earliestTime 是否小于 latestTime
    private static int compareTimes(LocalTime earliestTime, LocalTime latestTime) {
        if (earliestTime.isBefore(latestTime)) {
            return -1; // earliestTime 小于 latestTime
        } else if (earliestTime.isAfter(latestTime)) {
            return 1;  // earliestTime 大于 latestTime
        } else {
            return 0;  // earliestTime 等于 latestTime
        }
    }

    // 判断时间是否在最早和最晚时间之间（包含最早和最晚）
    private static boolean isTimeInRange1(LocalTime punchTime, LocalTime earliestTime, LocalTime latestTime) {
        return !punchTime.isBefore(earliestTime) && !punchTime.isAfter(latestTime);
    }

    // 判断时间是否在最早和最晚时间之间（包含最早和最晚）
    private static boolean isTimeInRange01(LocalDateTime punchTime, LocalDateTime earliestTime, LocalDateTime latestTime) {
        return !punchTime.isBefore(earliestTime) && !punchTime.isAfter(latestTime);
    }

    // 判断时间是否在最早时间之后，且不超过最晚时间（包含最晚, 不包含最早）
    private static boolean isTimeInRange2(LocalTime punchTime, LocalTime earliestTime, LocalTime latestTime) {
        return punchTime.isAfter(earliestTime) && !punchTime.isAfter(latestTime);
    }

    // 判断时间是否在最早时间之后，且不超过最晚时间（包含最晚, 不包含最早）
    private static boolean isTimeInRange02(LocalDateTime punchTime, LocalDateTime earliestTime, LocalDateTime latestTime) {
        return punchTime.isAfter(earliestTime) && !punchTime.isAfter(latestTime);
    }

    // 判断时间是否在晚于(包含)最早时间，且晚于最晚时间（不包含最晚, 包含最早）
    private static boolean isTimeInRange3(LocalTime punchTime, LocalTime earliestTime, LocalTime latestTime) {
        return !punchTime.isBefore(earliestTime) && punchTime.isBefore(latestTime);
    }

    // 判断时间是否在晚于(包含)最早时间，且晚于最晚时间（不包含最晚, 包含最早）
    private static boolean isTimeInRange03(LocalDateTime punchTime, LocalDateTime earliestTime, LocalDateTime latestTime) {
        return !punchTime.isBefore(earliestTime) && punchTime.isBefore(latestTime);
    }

    // 判断时间是否在最早时间之后，且在最晚时间之前（不包含最早和最晚）
    private static boolean isTimeInRange4(LocalTime punchTime, LocalTime earliestTime, LocalTime latestTime) {
        return punchTime.isAfter(earliestTime) && punchTime.isBefore(latestTime);
    }

    // 判断时间是否在最早时间之后，且在最晚时间之前（不包含最早和最晚）
    private static boolean isTimeInRange04(LocalDateTime punchTime, LocalDateTime earliestTime, LocalDateTime latestTime) {
        return punchTime.isAfter(earliestTime) && punchTime.isBefore(latestTime);
    }

    // 判断时间段1，是否在时间段2之间（包含临界值）
    private static boolean isTimeInRange5(LocalDateTime workTimeStart, LocalDateTime workTimeEnd, LocalDateTime applicationStart, LocalDateTime applicationEnd) {
        return applicationStart.isBefore(workTimeStart) && applicationEnd.isAfter(workTimeEnd);
    }

    private static Object calculateHours(LocalTime startTime, LocalTime endTime) {
        // 计算两个时间之间的持续时间
        Duration duration = Duration.between(startTime, endTime);
        // 将持续时间转换为小时数（以浮动时间表示）
        double hours = duration.toMinutes() / 60.0;
        // 如果是整数，返回整数
        if (hours % 1 == 0) {
            return (long) hours;  // 如果是整数，返回long类型
        } else {
            return hours;  // 保持浮动时间
        }
    }

    private static double calculateMinutes(LocalDateTime startTime, LocalDateTime endTime) {
        // 计算两个时间之间的持续时间
        Duration duration = Duration.between(startTime, endTime);
        // 将持续时间转换为分钟数
        double minutes = duration.toMinutes();
        // 如果分钟数是整数，返回整数类型
        if (minutes % 1 == 0) {
            return (long) minutes;  // 如果是整数，返回long类型
        } else {
            return minutes;  // 保持浮动时间
        }
    }


    private static double calculateTimes(LocalDateTime startTime, LocalDateTime endTime) {
        // 计算两个时间之间的持续时间
        Duration duration = Duration.between(startTime, endTime);
        // 将持续时间转换为小时数（以浮动时间表示，保留一位小数）
        double hours = Math.round((duration.toMinutes() / 60.0) * 10) / 10.0;
        // 如果是整数，返回整数
        if (hours % 1 == 0) {
            return (long) hours;  // 如果是整数，返回long类型
        } else {
            return hours;  // 保持浮动时间
        }
    }

    private static long calculateMins(LocalTime startTime, LocalTime endTime) {
        Duration duration = Duration.between(startTime, endTime);
        return duration.toMinutes();
    }

    private static LocalDateTime formatTimeStr(String timeStr){
        // 创建 DateTimeFormatter 对象，定义格式模式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
        // 使用 DateTimeFormatter 解析字符串为 LocalDateTime 对象
        return LocalDateTime.parse(timeStr, formatter);
    }
}