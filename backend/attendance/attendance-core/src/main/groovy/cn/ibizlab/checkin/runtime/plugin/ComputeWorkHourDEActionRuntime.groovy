package cn.ibizlab.checkin.runtime.plugin

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime
import net.ibizsys.central.dataentity.action.DEActionRuntimeBase

import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.runtime.util.Entity
import org.springframework.util.ObjectUtils

import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class ComputeWorkHourDEActionRuntime extends DEActionRuntimeBase{

    // 定义日期格式
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter time_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
    private static final DateTimeFormatter originalFormat2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    protected Object onExecute(IEntityDTO iEntityDTO) throws Throwable {
        iEntityDTO.set("worked_hours", 0.0)
        iEntityDTO.set("overtime_hours", 0.0)
        if(!iEntityDTO.get("check_out")){
            return iEntityDTO
        }
        // 获取相关实体运行时
        IDataEntityRuntime attendance_scheduleRuntime = systemRuntime.getDataEntityRuntime("attendance_schedule");

        Timestamp originalTimestamp = (Timestamp) iEntityDTO.get("check_in");
        LocalDateTime startOfDay = originalTimestamp.toLocalDateTime()
                .toLocalDate()
                .atStartOfDay()
        Timestamp formattedTimestamp = Timestamp.valueOf(startOfDay);

        // 查询排班记录
        ISearchContextDTO attendance_scheduleSearchContext = attendance_scheduleRuntime.createSearchContext().all();
        attendance_scheduleSearchContext.eq("member_id", iEntityDTO.get("employee_id"))
        attendance_scheduleSearchContext.eq("checkin_date", formattedTimestamp);
        List<IEntityDTO> attendance_schedules = attendance_scheduleRuntime.selectDataQuery("all", attendance_scheduleSearchContext);
        if (!ObjectUtils.isEmpty(attendance_schedules)) {
            computeWorkHour(iEntityDTO, attendance_schedules[0], formattedTimestamp)
        }
        return iEntityDTO
    }

    private void computeWorkHour(iEntityDTO, attendance_schedule, checkin_date) {
        //是否工作日
        Integer workday = attendance_schedule.getInteger("workday", 0);
        if (workday == 1) {
            if (!ObjectUtils.isEmpty(checkin_date)){
                //班次信息
                String shift_message = "";
                if (!ObjectUtils.isEmpty(attendance_schedule.get("work_time"))){
                    List<Entity> work_time_list = attendance_schedule.get("work_time") as List<Entity>;
                    // 给班次排序
                    work_time_list.sort { it.get("order_value") }
                    // 给跨天班次打标记并返回打卡记录
                    List<Map<String, Object>> clock_list = setNextDayFlag(work_time_list, dateFormat.format(checkin_date), iEntityDTO);

                    Entity shiftData = attendance_schedule.get("shift_data");
                    int work_item_index = 1;
                    for (Entity work_time : work_time_list){
                        String start = String.valueOf(work_time.get("start_base_time"));
                        String end = String.valueOf(work_time.get("end_base_time"));
                        shift_message += work_time.get("shift_name") + ":" + start + "-" + end;
                        if (!ObjectUtils.isEmpty(start) && !ObjectUtils.isEmpty(end) && !ObjectUtils.isEmpty(clock_list)) {
                            // 解析班次
                            Map<String, LocalDateTime> workTimeMap = parseWorkTime(attendance_schedule, work_time);
                            // 处理打卡记录
                            Map<String, List<LocalDateTime>> checkTimesMap = processClockRecord(workTimeMap, clock_list, attendance_schedule.get("schedule_type"));
                            if (!ObjectUtils.isEmpty(checkTimesMap)) {
                                // 实际出勤时长
                                calculateActualAttendance(attendance_schedule, iEntityDTO, work_time);
                                if (work_time_list.indexOf(work_time) == work_time_list.size() - 1) {
                                    // 最后一个班次，计算加班
                                    calculateOvertime(iEntityDTO, shiftData, workTimeMap, checkTimesMap);
                                }
                            }
                        }
                        work_item_index++
                    }
                }
            }
        }else{
            // 实际出勤时长
            calculateActualAttendance(attendance_schedule, iEntityDTO, null);
            // 如果员工当天本不工作（如周末），所有工作时长均计为加班
            iEntityDTO.set("overtime_hours", iEntityDTO.get("worked_hours"));
        }

    }


    /**
     * 计算实际出勤时长
     */
    private void calculateActualAttendance(IEntityDTO attendance_schedule, IEntityDTO iEntityDTO, workTime) {

        // 实际出勤小时
        double worked_hours = iEntityDTO.get("worked_hours");


        if (!ObjectUtils.isEmpty(iEntityDTO.get("check_in")) && !ObjectUtils.isEmpty(iEntityDTO.get("check_out"))) {
            Timestamp checkInTimestamp = (Timestamp) iEntityDTO.get("check_in");
            Timestamp checkOutTimestamp = (Timestamp) iEntityDTO.get("check_out");

            LocalDateTime start_check_time = checkInTimestamp.toLocalDateTime();
            LocalDateTime end_check_time = checkOutTimestamp.toLocalDateTime();
            worked_hours += calculateTimes(start_check_time, end_check_time);
        }
        if (workTime && !ObjectUtils.isEmpty(workTime.get("rest_enable")) && workTime.get("rest_enable") == 1) {
            String checkinDate = String.valueOf(attendance_schedule.get("checkin_date")).substring(0, 11);
            String start = checkinDate + String.valueOf(workTime.get("rest_start"));
            String end = checkinDate + String.valueOf(workTime.get("end_start"));
            LocalDateTime restStart = LocalDateTime.parse(start, originalFormat2);
            LocalDateTime restEnd = LocalDateTime.parse(end, originalFormat2);
            if (compareLocalDateTimes(restStart, restEnd) == 1) {
                restEnd.plusDays(1);
            }
            worked_hours -= calculateTimes(restStart, restEnd);
        }
        iEntityDTO.set("worked_hours", worked_hours)

    }

    /**
     * 计算加班
     */
    private void calculateOvertime(iEntityDTO, shiftData, Map<String, LocalDateTime> workTimeMap, Map<String, List<LocalDateTime>> checkTimesMap) {
        double overtime_hours = iEntityDTO.get("overtime_hours");
        Timestamp checkInTimestamp = (Timestamp) iEntityDTO.get("check_in");
        LocalDateTime start_check_time = checkInTimestamp.toLocalDateTime();

        LocalDateTime end = workTimeMap.get("end_base_time");
        if (!ObjectUtils.isEmpty(shiftData.get("overtime_valid")) && shiftData.get("overtime_valid") == 1) {
            long start_overtime = shiftData.get("start_overtime");
            long invalid_overtime = shiftData.get("invalid_overtime");
            LocalDateTime invalidTime = null;
            LocalDateTime normalTime = null;
            if (!ObjectUtils.isEmpty(checkTimesMap.get("invalid_check_times")) && checkTimesMap.get("invalid_check_times").size() > 0) {
                invalidTime = Collections.max(checkTimesMap.get("invalid_check_times"));
            }
            if (!ObjectUtils.isEmpty(checkTimesMap.get("normal_end_check_times")) && checkTimesMap.get("normal_end_check_times").size() > 0) {
                normalTime = Collections.max(checkTimesMap.get("normal_end_check_times"));
            }
            LocalDateTime latestTime = compareAndReturnMax(invalidTime, normalTime);
            // 判断是否符合加班条件
            if (!ObjectUtils.isEmpty(latestTime)) {
                if (compareLocalDateTimes(start_check_time, end.plusMinutes(start_overtime)) == 1) {
                    overtime_hours += calculateTimes(start_check_time, latestTime);
                }else if (compareLocalDateTimes(latestTime, end.plusMinutes(start_overtime)) == 1 && calculateMinutes(end, latestTime) > invalid_overtime) {
                    overtime_hours += calculateTimes(end, latestTime);
                }
            }
        }
        iEntityDTO.set("overtime_hours", overtime_hours);
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
    private List<Map<String, Object>> setNextDayFlag(List<Entity> work_time_list, String checkinDate, IEntityDTO iEntityDTO) {
        for (int i = 0; i < work_time_list.size(); i++) {
            Entity currentEntity = work_time_list[i];
            String start = String.valueOf(currentEntity.get("start_base_time"));
            String end = String.valueOf(currentEntity.get("end_base_time"));
            LocalTime start_time = LocalTime.parse(start, time_formatter).withSecond(0).withNano(0);
            LocalTime end_time = LocalTime.parse(end, time_formatter).withSecond(0).withNano(0);
            // 比较 start_base_time 和 end_base_time 的值
            if (compareTimes(start_time, end_time) == 1) {
                LocalDate nextDayDate = LocalDate.parse(checkinDate, formatter).plusDays(1);
                // 如果 start_base_time 大于 end_base_time，则设置当前和后续对象的 isNextDay 为 1
                for (int j = i; j < work_time_list.size(); j++) {
                    if (j == i) {
                        work_time_list[j].set("isNextDay", 2);
                    } else {
                        work_time_list[j].set("isNextDay", 1);
                    }
                }
            }
            break;
        }
        return getClockList(iEntityDTO);
    }

    /**
     * 构造打卡记录
     */
    private static List<Map<String, Object>> getClockList(iEntityDTO) {

        // 创建新列表存储转换后的结果
        List<Map<String, Object>> resultList = new ArrayList<>();

        // 处理签到时间
        if (iEntityDTO.get("CHECK_IN") != null) {
            Map<String, Object> checkIn = new HashMap<>();
            checkIn.put("CHECKIN_TIME", iEntityDTO.get("CHECK_IN"));
            resultList.add(checkIn);
        }

        // 处理签退时间
        if (iEntityDTO.get("CHECK_OUT") != null) {
            Map<String, Object> checkOut = new HashMap<>();
            checkOut.put("CHECKIN_TIME", iEntityDTO.get("CHECK_OUT"));
            resultList.add(checkOut);
        }

        return resultList;
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
    private static boolean isTimeInRange03(LocalDateTime punchTime, LocalDateTime earliestTime, LocalDateTime latestTime) {
        return !punchTime.isBefore(earliestTime) && punchTime.isBefore(latestTime);
    }

    // 判断时间是否在最早时间之后，且在最晚时间之前（不包含最早和最晚）
    private static boolean isTimeInRange04(LocalDateTime punchTime, LocalDateTime earliestTime, LocalDateTime latestTime) {
        return punchTime.isAfter(earliestTime) && punchTime.isBefore(latestTime);
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
        Duration duration = Duration.between(startTime, endTime);
//        long hours = duration.toHours();
//        long minutes = duration.toMinutes() % 60;
//        return hours + minutes / 100.0;
        double totalHours = duration.toMinutes() / 60.0;
        return totalHours;
    }



    private static LocalDateTime formatTimeStr(String timeStr){
        // 创建 DateTimeFormatter 对象，定义格式模式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
        // 使用 DateTimeFormatter 解析字符串为 LocalDateTime 对象
        return LocalDateTime.parse(timeStr, formatter);
    }
}