# 服务插件 <!-- {docsify-ignore-all} -->

|  对象      |  实体  |  类型  | 插件  |备注|
|  --------  | ----- | -----    |-----    |----    |
|考勤计算(attendance_calculate)|[打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record)|PSDEUserCustomActionImpl|[考勤计算](#AttendanceCalculate)||
|数据导出2|[打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record)|PSDEDataExportImpl|[ClockInRecordPOIDEDataExportRuntimeEx](#ClockInRecord)|打卡记录自定义导出|
|异常考勤|[考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record)|PSDEDataExportImpl|[AbnormalAttendancePOIDEDataExportRuntimeEx](#AbnormalAttendance)|异常考勤自定义导出|
|每日统计|[考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record)|PSDEDataExportImpl|[DailyStatisticsPOIDEDataExportRuntimeEx](#DailyStatistics)|每日统计自定义导出|
|判断人员是否已存在其他规则(judgingMember)|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)|PSDEUserCustomActionImpl|[JudgingDEActionRuntime](#JudgingDEActionRuntime)|判断人员是否已存在|
|人员排班(member)|[排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule)|PSDEDataSetImpl|[ScheduleDEDataSetRuntime](#ScheduleDEDataSetRuntime)||
|数据导出|[排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule)|PSDEDataExportImpl|[SchedulePOIDEDataExportRuntimeEx](#Schedule)|排班视图自定义导出|
|数据导出|[考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics)|PSDEDataExportImpl|[MonthlySummaryPOIDEDataExportRuntimeEx](#UsrSFPlugin0521277606)|月度统计自定义导出|
|数据导出2|[考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics)|PSDEDataExportImpl|[PersonalSummaryPOIDEDataExportRuntimeEx](#PersonalSummary)|个人统计自定义导出|
|部门人员(deptall)|[员工信息(EMPLOYEE)](module/employee_management/employee)|PSDEDataSetImpl|[EmployeeDEDataSetRuntime](#EmployeeDEDataSetRuntime)|获取部门下所有人员|
|计算工作时间、加班时间(ComputeWorkHour)|[出勤(HR_ATTENDANCE)](module/hr/hr_attendance)|PSDEUserCustomActionImpl|[ComputeWorkHourDEActionRuntime](#ComputeWorkHourDEActionRuntime)|计算工作时间、加班时间|
|获取节假日(aSyncHolidays)|[休假详细信息(RESOURCE_CALENDAR_LEAVES)](module/resource/resource_calendar_leaves)|PSDEUserCustomActionImpl|[SyncHolidaysDEActionRuntime](#SyncHolidaysDEActionRuntime)||
|用户对象映射(USER_OBJECT)||PSDataEntityImpl|[UserObjectDERuntime](#UserObjectDERuntime)|UserObjectDERuntime|

### AbnormalAttendancePOIDEDataExportRuntimeEx :id=AbnormalAttendance
异常考勤自定义导出

```cn.ibizlab.checkin.runtime.plugin.groovy.dataentity.dataexport.AbnormalAttendancePOIDEDataExportRuntimeEx```

```groovy
package cn.ibizlab.checkin.runtime.plugin.groovy.dataentity.dataexport

import groovy.transform.CompileStatic
import net.ibizsys.central.plugin.poi.dataentity.dataexport.POIDEDataExportRuntime

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem
import net.ibizsys.runtime.security.UserContext
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.data.domain.Page
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils

import java.text.SimpleDateFormat;

@CompileStatic
class AbnormalAttendancePOIDEDataExportRuntimeEx extends POIDEDataExportRuntime {


    @Override
    protected void onExportStream(Object objData, OutputStream outputStram) throws Throwable {
        Workbook workbook = new XSSFWorkbook();
        Throwable var4 = null;

        try {
            List<IPSDEDataExportItem> exportItems = this.getPSDEDataExport().getPSDEDataExportItems();

            if (ObjectUtils.isEmpty(exportItems)) {
                throw new Exception("未指定导出列");
            }
            MultiValueMap<String, String> parameters = UserContext.getCurrent().getWebContext().getParameters();

            // 基础信息
            List<String> baseInfoList = convertStringToList(parameters.get("base_info")?.toString())
            // 打卡信息
            List<String> indexNumList = convertStringToList(parameters.get("index_num")?.toString())
            List<String> resultList = new ArrayList<>()
            // 遍历 indexNumList
            for (String item : indexNumList) {
                resultList.add("start_" + item);
                resultList.add("end_" + item);
            }
            List<String> checkInInfoList = convertStringToList(parameters.get("check_in_info")?.toString())
            resultList.addAll(checkInInfoList)
            // 时长统计
            List<String> durationStatisticsList = convertStringToList(parameters.get("duration_statistics")?.toString())

            Sheet sheet = workbook.createSheet()

            // 创建动态表头
            createHeaders(sheet, baseInfoList, resultList, durationStatisticsList, exportItems);

            // 获取动态属性列
            Row headerRow = sheet.getRow(2);
            List<String> propertyNames = getPropertyNames(headerRow);

            // 创建Excel表格数据
            List<IEntityDTO> data = ((Page) objData).getContent();

            // 平铺打卡数据
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            for (Object item : data) {
                IEntityDTO it = item as IEntityDTO;
                if (!ObjectUtils.isEmpty(it.get("details"))) {
                    List<IEntityDTO> details = it.get("details") as List<IEntityDTO>;
                    for (IEntityDTO item2 : details) {
                        if (!ObjectUtils.isEmpty(item2.get("checkin_time"))) {
                            it.set(item2.get("detail_index"), sdf.format(item2.get("checkin_time")));
                        }
                    }
                }
            }

            int startRowIndex = 3; // 数据从第4行开始（0-based索引）
            fillDataRows(sheet, data, propertyNames, startRowIndex);

            // 删除标识行
            deleteRowSimple(sheet, 2)

            workbook.write(outputStram);
        } catch (Throwable var25) {
            var4 = var25;
            throw var25;
        } finally {
            if (workbook != null) {
                if (var4 != null) {
                    try {
                        workbook.close();
                    } catch (Throwable var24) {
                        var4.addSuppressed(var24);
                    }
                } else {
                    workbook.close();
                }
            }
        }

    }

    // 字符串转List方法
    private static List<String> convertStringToList(String input) {
        if (input == "[]" || input == "[null]" || input == "" || input == null || input.trim().isEmpty()) {
            return new ArrayList<>();
        }

        // 去除方括号并按逗号分割
        String cleaned = input.substring(1, input.length() - 1).trim();
        String[] parts = cleaned.split(",");

        List<String> result = new ArrayList<>();
        for (String part : parts) {
            if (!"name".equals(part.trim())) {
                result.add(part.trim());
            }
        }
        return result;
    }

    // 创建复杂的列头结构
    private static void createHeaders(Sheet sheet, List<String> baseInfoList,
                                                  List<String> resultList,
                                                  List<String> durationStatisticsList,
                                                  List<IPSDEDataExportItem> exportItems) {
        // 创建两行表头
        Row row0 = sheet.createRow(0);
        Row row1 = sheet.createRow(1);
        Row row2 = sheet.createRow(2);
        int colIndex = 0;
        // 基本信息分组
        if (baseInfoList.size() > 0) {
            colIndex = createGroupHeader(sheet, row0, row1, row2, colIndex,
                    "基本信息", baseInfoList, exportItems);
        }
        // 打卡信息分组
        if (resultList.size() > 0) {
            colIndex = createGroupHeader(sheet, row0, row1, row2, colIndex,
                    "打卡信息", resultList, exportItems);
        }
        // 时长统计分组
        if (durationStatisticsList.size() > 0) {
            colIndex = createGroupHeader(sheet, row0, row1, row2, colIndex,
                    "时长统计", durationStatisticsList, exportItems);
        }
    }

    // 安全合并单元格（防止无效合并区域）
    private static void addSafeMergedRegion(Sheet sheet, int firstRow, int lastRow,
                                            int firstCol, int lastCol) {
        // 确保是有效的合并区域（至少包含两个单元格）
        int rowSpan = lastRow - firstRow + 1;
        int colSpan = lastCol - firstCol + 1;

        if (rowSpan >= 2 || colSpan >= 2) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow, lastRow, firstCol, lastCol));
        }
    }

    // 创建分组列头（修复单列问题）
    private static int createGroupHeader(Sheet sheet, Row row0, Row row1, Row row2,
                                         int startCol, String groupName,
                                         List<String> headers, List<IPSDEDataExportItem> exportItems) {
        if (headers.isEmpty()) {
            return startCol;
        }

        int endCol = startCol + headers.size() - 1;

        // 创建分组标题单元格（存在分组列就创建）
        Cell groupCell = row0.createCell(startCol);
        groupCell.setCellValue(groupName);

        // 处理多列情况
        if (headers.size() > 1) {
            // 横向合并分组标题
            sheet.addMergedRegion(new CellRangeAddress(0, 0, startCol, endCol));

            // 创建分组内的列头
            for (int i = 0; i < headers.size(); i++) {
                Cell headerCell = row1.createCell(startCol + i);
                Cell headerCell2 = row2.createCell(startCol + i);
                String header = headers.get(i);
                String headerName = getHeaderName(header, exportItems)
                headerCell.setCellValue(headerName);
                headerCell2.setCellValue(header)
            }
        }
        // 处理单列情况
        else if (headers.size() == 1) {
            // 1. 分组标题显示在第一行（不合并）
            // 2. 列头显示在第二行
            // 创建列头单元格
            Cell headerCell = row1.createCell(startCol);
            String header = headers.get(0);
            String headerName = getHeaderName(header, exportItems)
            headerCell.setCellValue(headerName);
            Cell headerCell2 = row2.createCell(startCol);
            headerCell2.setCellValue(header)
        }

        return endCol + 1;
    }

    private static String getHeaderName(String header, List<IPSDEDataExportItem> exportItems) {
        String headerName = ""
        for (IPSDEDataExportItem item : exportItems) {
            if (item.getName().equals(header)) {
                headerName = item.getCaption()
            }
        }
        return headerName
    }

    // 填充数据行
    private static void fillDataRows(Sheet sheet, List<IEntityDTO> data, List<String> propertyNames, int startRowIndex) {
        if (data == null || data.isEmpty()) return;
        for (int i = 0; i < data.size(); i++) {
            IEntityDTO entity = data.get(i);
            // 创建每行数据
            Row dataRow = sheet.createRow(startRowIndex + i);
            // 填充每个单元格
            for (int col = 0; col < propertyNames.size(); col++) {
                String propertyName = propertyNames.get(col);
                String propertyValue = entity.get(propertyName);
                Cell cell = dataRow.createCell(col);
                // 设置单元格值
                cell.setCellValue(propertyValue);
            }
        }
    }

    // 获取第三行的属性名列表
    private static List<String> getPropertyNames(Row headerRow) {
        List<String> propertyNames = new ArrayList<>();
        int lastCellNum = headerRow.getLastCellNum();

        for (int i = 0; i < lastCellNum; i++) {
            Cell cell = headerRow.getCell(i);
            if (cell != null) {
                propertyNames.add(cell.getStringCellValue());
            } else {
                propertyNames.add(""); // 空值处理
            }
        }
        return propertyNames;
    }

    private static void deleteRowSimple(Sheet sheet, int rowIndex) {
        int lastRowNum = sheet.getLastRowNum();
        // 验证行索引
        if (rowIndex < 0 || rowIndex > lastRowNum) {
            throw new IllegalArgumentException("行索引超出范围: " + rowIndex);
        }
        // 如果是最后一行，直接删除
        if (rowIndex == lastRowNum) {
            Row row = sheet.getRow(rowIndex);
            if (row != null) {
                sheet.removeRow(row);
            }
        }
        // 如果是中间行，向上移动后续行
        else {
            sheet.shiftRows(rowIndex + 1, lastRowNum, -1);
        }
    }
}
```
### 考勤计算 :id=AttendanceCalculate


```cn.ibizlab.checkin.runtime.plugin.AttendanceCalculateDEActionRuntime```

```groovy
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
```
### ClockInRecordPOIDEDataExportRuntimeEx :id=ClockInRecord
打卡记录自定义导出

```cn.ibizlab.checkin.runtime.plugin.groovy.dataentity.dataexport.ClockInRecordPOIDEDataExportRuntimeEx```

```groovy
package cn.ibizlab.checkin.runtime.plugin.groovy.dataentity.dataexport

import groovy.transform.CompileStatic;
import net.ibizsys.central.plugin.poi.dataentity.dataexport.POIDEDataExportRuntime

import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem
import net.ibizsys.runtime.security.UserContext
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.data.domain.Page
import org.springframework.util.MultiValueMap
import org.springframework.util.ObjectUtils;
import java.text.SimpleDateFormat;

@CompileStatic
class ClockInRecordPOIDEDataExportRuntimeEx extends POIDEDataExportRuntime {

    @Override
    protected void onExportStream(Object objData, OutputStream outputStram) throws Throwable {
        Workbook workbook = new XSSFWorkbook();
        Throwable var4 = null;
        try {
            List<IPSDEDataExportItem> exportItems = this.getPSDEDataExport().getPSDEDataExportItems();
            if (ObjectUtils.isEmpty(exportItems)) {
                throw new Exception("未指定导出列");
            }

            MultiValueMap<String, String> parameters = UserContext.getCurrent().getWebContext().getParameters();
            // 时间范围
            List<String> dateRangeList = convertStringToList(parameters.get("date_range")?.toString());
            List<String> dateRangeWeekList = new ArrayList<>();
            List<String> dateRange = new ArrayList<>();
            if (!ObjectUtils.isEmpty(dateRangeList) && dateRangeList.size() > 0) {
                dateRangeWeekList = generateDateWeekRange(dateRangeList.get(0), dateRangeList.get(1));
                dateRange = generateDateRange(dateRangeList.get(0), dateRangeList.get(1));
            }

            Sheet sheet = workbook.createSheet();
            Row row = sheet.createRow(0);

            for(int i = 0; i < exportItems.size(); ++i) {
                IPSDEDataExportItem iPSDEDataExportItem = (IPSDEDataExportItem)exportItems.get(i);
                Cell cell0 = row.createCell(i);
                cell0.setCellValue(iPSDEDataExportItem.getCaption());
            }

            // 新建日历表格头
            for(int i = 0; i < dateRangeWeekList.size(); ++i) {
                Cell cell0 = row.createCell(i + exportItems.size());
                cell0.setCellValue(dateRangeWeekList[i]);
            }

            List<IEntityDTO> data = new ArrayList<>();
            if (objData instanceof Page) {
                data = ((Page)objData).getContent();
            } else if (objData instanceof List) {
                data = (List<IEntityDTO>) objData;
            }
            
            // 平铺日历数据
            for (Object item : data) {
                IEntityDTO it = item as IEntityDTO;
                if (!ObjectUtils.isEmpty(it.get("attendance_data"))) {
                    Map<String, Object> attendanceData = it.get("attendance_data") as Map<String, Object>;
                    Set<String> keys = attendanceData.keySet();
                    for (String key : keys) {
                        Map<String, Object> record = attendanceData.get(key) as Map<String, Object>;
                        if (!ObjectUtils.isEmpty(record) && !ObjectUtils.isEmpty(record.get("details"))) {
                            List<IEntityDTO> details = record.get("details") as List<IEntityDTO>;
                            String checkinTime = "";
                            for (IEntityDTO item2 : details) {
                                checkinTime += item2.get("checkin_time").toString() + "\n";
                            }
                            it.set(key, checkinTime);
                        }
                    }
                }
            }

            for(int i = 0; i < data.size(); ++i) {
                IEntityDTO entityDTO = (IEntityDTO)data.get(i);
                Row dataRow = sheet.createRow(i + 1);
                for(int k = 0; k < exportItems.size(); ++k) {
                    IPSDEDataExportItem iPSDEDataExportItem = (IPSDEDataExportItem)exportItems.get(k);
                    Object objValue = entityDTO.get(iPSDEDataExportItem.getName());
                    Cell cell0 = dataRow.createCell(k);
                    if (objValue != null) {
                        cell0.setCellValue(this.convertValue(iPSDEDataExportItem, objValue));
                    }
                }
                // 填充日历数据
                for(int k = 0; k < dateRange.size(); ++k) {
                    Object objValue = entityDTO.get(dateRange[k]);
                    Cell cell0 = dataRow.createCell(k + exportItems.size());
                    if (objValue != null) {
                        cell0.setCellValue(objValue.toString());
                    }
                }
            }
            workbook.write(outputStram);
        } catch (Throwable var25) {
            var4 = var25;
            throw var25;
        } finally {
            if (workbook != null) {
                if (var4 != null) {
                    try {
                        workbook.close();
                    } catch (Throwable var24) {
                        var4.addSuppressed(var24);
                    }
                } else {
                    workbook.close();
                }
            }
        }
    }

    // 字符串转List方法
    private static List<String> convertStringToList(String input) {
        if (input == null || input.trim().isEmpty() || input == "[null]") {
            return new ArrayList<>();
        }
        // 去除方括号并按逗号分割
        String cleaned = input.substring(1, input.length() - 1).trim();
        String[] parts = cleaned.split(",");

        List<String> result = new ArrayList<>();
        for (String part : parts) {
            if (!"name".equals(part.trim())) {
                result.add(part.trim());
            }
        }
        return result;
    }

    private static List<String> generateDateWeekRange(String startDate, String endDate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE", Locale.CHINA);
        Date start = sdf.parse(startDate);
        Date end = sdf.parse(endDate);
        List<String> dateArray = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        while (!calendar.getTime().after(end)) {
            String formattedDate = sdf.format(calendar.getTime()) + " " + dayOfWeekFormat.format(calendar.getTime());
            dateArray.add(formattedDate);
            calendar.add(Calendar.DATE, 1);
        }
        return dateArray;
    }

    private static List<String> generateDateRange(String startDate, String endDate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date start = sdf.parse(startDate);
        Date end = sdf.parse(endDate);
        List<String> dateArray = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        while (!calendar.getTime().after(end)) {
            dateArray.add(sdf.format(calendar.getTime()));
            calendar.add(Calendar.DATE, 1);
        }
        return dateArray;
    }
}
```
### ComputeWorkHourDEActionRuntime :id=ComputeWorkHourDEActionRuntime
计算工作时间、加班时间

```cn.ibizlab.checkin.runtime.plugin.ComputeWorkHourDEActionRuntime```

```groovy
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
```
### DailyStatisticsPOIDEDataExportRuntimeEx :id=DailyStatistics
每日统计自定义导出

```cn.ibizlab.checkin.runtime.plugin.groovy.dataentity.dataexport.DailyStatisticsPOIDEDataExportRuntimeEx```

```groovy
package cn.ibizlab.checkin.runtime.plugin.groovy.dataentity.dataexport

import groovy.transform.CompileStatic
import net.ibizsys.central.plugin.poi.dataentity.dataexport.POIDEDataExportRuntime

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem
import net.ibizsys.runtime.security.UserContext
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.data.domain.Page
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils

import java.text.SimpleDateFormat;

@CompileStatic
class DailyStatisticsPOIDEDataExportRuntimeEx extends POIDEDataExportRuntime {


    @Override
    protected void onExportStream(Object objData, OutputStream outputStram) throws Throwable {
        Workbook workbook = new XSSFWorkbook();
        Throwable var4 = null;

        try {
            List<IPSDEDataExportItem> exportItems = this.getPSDEDataExport().getPSDEDataExportItems();

            if (ObjectUtils.isEmpty(exportItems)) {
                throw new Exception("未指定导出列");
            }
            MultiValueMap<String, String> parameters = UserContext.getCurrent().getWebContext().getParameters();

            // 基础信息
            List<String> baseInfoList = convertStringToList(parameters.get("base_info")?.toString())
            // 打卡信息
            List<String> indexNumList = convertStringToList(parameters.get("index_num")?.toString())
            List<String> resultList = new ArrayList<>()
            // 遍历 indexNumList
            for (String item : indexNumList) {
                resultList.add("start_" + item);
                resultList.add("end_" + item);
            }
            List<String> checkInInfoList = convertStringToList(parameters.get("check_in_info")?.toString())
            resultList.addAll(checkInInfoList)
            // 时长统计
            List<String> durationStatisticsList = convertStringToList(parameters.get("duration_statistics")?.toString())
            // 异常统计
            List<String> abnormalList = convertStringToList(parameters.get("abnormal_statistics")?.toString())

            Sheet sheet = workbook.createSheet()

            // 创建动态表头
            createHeaders(sheet, baseInfoList, resultList, durationStatisticsList, abnormalList, exportItems);

            // 获取动态属性列
            Row headerRow = sheet.getRow(2);
            List<String> propertyNames = getPropertyNames(headerRow);

            // 创建Excel表格数据
            List<IEntityDTO> data = ((Page) objData).getContent();

            // 平铺打卡数据
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            for (Object item : data) {
                IEntityDTO it = item as IEntityDTO;
                if (!ObjectUtils.isEmpty(it.get("details"))) {
                    List<IEntityDTO> details = it.get("details") as List<IEntityDTO>;
                    for (IEntityDTO item2 : details) {
                        if (!ObjectUtils.isEmpty(item2.get("checkin_time"))) {
                            it.set(item2.get("detail_index"), sdf.format(item2.get("checkin_time")));
                        }
                    }
                }
            }

            int startRowIndex = 3; // 数据从第4行开始（0-based索引）
            fillDataRows(sheet, data, propertyNames, startRowIndex);

            // 删除标识行
            deleteRowSimple(sheet, 2)

            workbook.write(outputStram);
        } catch (Throwable var25) {
            var4 = var25;
            throw var25;
        } finally {
            if (workbook != null) {
                if (var4 != null) {
                    try {
                        workbook.close();
                    } catch (Throwable var24) {
                        var4.addSuppressed(var24);
                    }
                } else {
                    workbook.close();
                }
            }
        }

    }

    // 字符串转List方法
    private static List<String> convertStringToList(String input) {
        if (input == "[]" || input == "[null]" || input == "" || input == null || input.trim().isEmpty()) {
            return new ArrayList<>();
        }

        // 去除方括号并按逗号分割
        String cleaned = input.substring(1, input.length() - 1).trim();
        String[] parts = cleaned.split(",");

        List<String> result = new ArrayList<>();
        for (String part : parts) {
            if (!"name".equals(part.trim())) {
                result.add(part.trim());
            }
        }
        return result;
    }

    // 创建复杂的列头结构
    private static void createHeaders(Sheet sheet, List<String> baseInfoList,
                                                  List<String> resultList,
                                                  List<String> durationStatisticsList,
                                                  List<String> abnormalList,
                                                  List<IPSDEDataExportItem> exportItems) {
        // 创建两行表头
        Row row0 = sheet.createRow(0);
        Row row1 = sheet.createRow(1);
        Row row2 = sheet.createRow(2);
        int colIndex = 0;
        // 基本信息分组
        if (baseInfoList.size() > 0) {
            colIndex = createGroupHeader(sheet, row0, row1, row2, colIndex,
                    "基本信息", baseInfoList, exportItems);
        }
        // 打卡信息分组
        if (resultList.size() > 0) {
            colIndex = createGroupHeader(sheet, row0, row1, row2, colIndex,
                    "打卡信息", resultList, exportItems);
        }
        // 时长统计分组
        if (durationStatisticsList.size() > 0) {
            colIndex = createGroupHeader(sheet, row0, row1, row2, colIndex,
                    "时长统计", durationStatisticsList, exportItems);
        }
        // 异常统计分组
        if (abnormalList.size() > 0) {
            colIndex = createGroupHeader(sheet, row0, row1, row2, colIndex,
                    "异常统计", abnormalList, exportItems);
        }
    }

    // 安全合并单元格（防止无效合并区域）
    private static void addSafeMergedRegion(Sheet sheet, int firstRow, int lastRow,
                                            int firstCol, int lastCol) {
        // 确保是有效的合并区域（至少包含两个单元格）
        int rowSpan = lastRow - firstRow + 1;
        int colSpan = lastCol - firstCol + 1;

        if (rowSpan >= 2 || colSpan >= 2) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow, lastRow, firstCol, lastCol));
        }
    }

    // 创建分组列头（修复单列问题）
    private static int createGroupHeader(Sheet sheet, Row row0, Row row1, Row row2,
                                         int startCol, String groupName,
                                         List<String> headers, List<IPSDEDataExportItem> exportItems) {
        if (headers.isEmpty()) {
            return startCol;
        }

        int endCol = startCol + headers.size() - 1;

        // 创建分组标题单元格（存在分组列就创建）
        Cell groupCell = row0.createCell(startCol);
        groupCell.setCellValue(groupName);

        // 处理多列情况
        if (headers.size() > 1) {
            // 横向合并分组标题
            sheet.addMergedRegion(new CellRangeAddress(0, 0, startCol, endCol));

            // 创建分组内的列头
            for (int i = 0; i < headers.size(); i++) {
                Cell headerCell = row1.createCell(startCol + i);
                Cell headerCell2 = row2.createCell(startCol + i);
                String header = headers.get(i);
                String headerName = getHeaderName(header, exportItems)
                headerCell.setCellValue(headerName);
                headerCell2.setCellValue(header)
            }
        }
        // 处理单列情况
        else if (headers.size() == 1) {
            // 1. 分组标题显示在第一行（不合并）
            // 2. 列头显示在第二行
            // 创建列头单元格
            Cell headerCell = row1.createCell(startCol);
            String header = headers.get(0);
            String headerName = getHeaderName(header, exportItems)
            headerCell.setCellValue(headerName);
            Cell headerCell2 = row2.createCell(startCol);
            headerCell2.setCellValue(header)
        }

        return endCol + 1;
    }

    private static String getHeaderName(String header, List<IPSDEDataExportItem> exportItems) {
        String headerName = ""
        for (IPSDEDataExportItem item : exportItems) {
            if (item.getName().equals(header)) {
                headerName = item.getCaption()
            }
        }
        return headerName
    }

    // 填充数据行
    private static void fillDataRows(Sheet sheet, List<IEntityDTO> data, List<String> propertyNames, int startRowIndex) {
        if (data == null || data.isEmpty()) return;
        for (int i = 0; i < data.size(); i++) {
            IEntityDTO entity = data.get(i);
            // 创建每行数据
            Row dataRow = sheet.createRow(startRowIndex + i);
            // 填充每个单元格
            for (int col = 0; col < propertyNames.size(); col++) {
                String propertyName = propertyNames.get(col);
                String propertyValue = entity.get(propertyName);
                Cell cell = dataRow.createCell(col);
                // 设置单元格值
                cell.setCellValue(propertyValue);
            }
        }
    }

    // 获取第三行的属性名列表
    private static List<String> getPropertyNames(Row headerRow) {
        List<String> propertyNames = new ArrayList<>();
        int lastCellNum = headerRow.getLastCellNum();

        for (int i = 0; i < lastCellNum; i++) {
            Cell cell = headerRow.getCell(i);
            if (cell != null) {
                propertyNames.add(cell.getStringCellValue());
            } else {
                propertyNames.add(""); // 空值处理
            }
        }
        return propertyNames;
    }

    private static void deleteRowSimple(Sheet sheet, int rowIndex) {
        int lastRowNum = sheet.getLastRowNum();
        // 验证行索引
        if (rowIndex < 0 || rowIndex > lastRowNum) {
            throw new IllegalArgumentException("行索引超出范围: " + rowIndex);
        }
        // 如果是最后一行，直接删除
        if (rowIndex == lastRowNum) {
            Row row = sheet.getRow(rowIndex);
            if (row != null) {
                sheet.removeRow(row);
            }
        }
        // 如果是中间行，向上移动后续行
        else {
            sheet.shiftRows(rowIndex + 1, lastRowNum, -1);
        }
    }
}
```
### EmployeeDEDataSetRuntime :id=EmployeeDEDataSetRuntime
获取部门下所有人员

```cn.ibizlab.checkin.runtime.plugin.EmployeeDEDataSetRuntime```

```groovy
package cn.ibizlab.checkin.runtime.plugin

import net.ibizsys.central.dataentity.IDataEntityRuntime
import net.ibizsys.central.dataentity.ds.DEDataSetRuntimeBase
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.ISearchContext
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.model.dataentity.ds.IPSDEDataSet
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

class EmployeeDEDataSetRuntime extends DEDataSetRuntimeBase {

    @Override
    protected Object onFetch(ISearchContext iSearchContext) throws Throwable {
        ISearchContextDTO context = (ISearchContextDTO) iSearchContext

        // 1. 获取部门及其所有子部门ID
        def rootDeptId = context.get("n_dept_id_eq");
        if (!rootDeptId){
            return new CustomPageImpl<IEntityDTO>([], context.getPageable(), 0, 0)
        }
        List<String> allDeptIds = getAllSubDeptIds(rootDeptId)

        // 2. 构建人员查询条件
        IDataEntityRuntime employeeRuntime = this.getSystemRuntime().getDataEntityRuntime("employee");
        ISearchContextDTO employeeSearchContextDTO = employeeRuntime.createSearchContext();
        employeeSearchContextDTO.eq('status', 1)
        def deptStr = allDeptIds ? allDeptIds.join(",") : ""

        employeeSearchContextDTO.in('dept_id', deptStr)
        employeeSearchContextDTO.setPageable(context.getPageable())
        Object[] args = [employeeSearchContextDTO];

        // 3. 执行查询
        Page<?> rawPage = (Page<?>) employeeRuntime.fetchDataSet("user", null, args);

        // 4. 转换结果
        return employeeRuntime.getEntityDTOPage(
                rawPage,
                employeeRuntime.getDefaultPSDEDataSet(),
                employeeSearchContextDTO.getPageable()
        )
    }

    // 递归获取所有子部门ID（含自身）
    private List<String> getAllSubDeptIds(String rootDeptId) {
        def deptRuntime = getSystemRuntime().getDataEntityRuntime("department")
        ISearchContextDTO searchContextDTO = deptRuntime.createSearchContext();
        searchContextDTO.count(false).limit(10000)
        //获取所有部门
        IPSDEDataSet iPSDEDataSet = deptRuntime.getPSDEDataSet("dept");
        List<IEntityDTO> allDepts = deptRuntime.selectDataSet(iPSDEDataSet, searchContextDTO);

        List<String> result = new ArrayList<>()
        collectSubDeptIds(rootDeptId, allDepts, result)
        return result
    }

    private void collectSubDeptIds(String deptId, List<IEntityDTO> allDepts, List<String> result) {
        // 先添加当前部门
        result.add(deptId)
        // 查找所有子部门
        List<IEntityDTO> children = allDepts.findAll { it.get("parent_id") == deptId }
        // 递归处理子部门
        children.each { child ->
            collectSubDeptIds(child.id, allDepts, result)
        }
    }
    

    @Override
    public boolean isValid(Object[] args) {
        return true;
    }

    
    class CustomPageImpl<T> extends net.ibizsys.central.util.PageImpl<T> {
        private final long total;

        public CustomPageImpl(List<T> content, Pageable pageable, long total, int totalPages) {
            super(content, pageable, total, totalPages);
            this.total = total;
        }

        @Override
        long getTotalElements() {
            return total;
        }
    }


}
```
### HttpsWebFluxClient :id=GLOBAL_WEBCLIENT


```cn.ibizlab.checkin.runtime.plugin.client.HttpsWebFluxClient```

```groovy
package cn.ibizlab.checkin.runtime.plugin.client

import io.netty.handler.ssl.SslContext
import io.netty.handler.ssl.SslContextBuilder
import io.netty.handler.ssl.util.InsecureTrustManagerFactory
import net.ibizsys.central.plugin.spring.service.client.WebFluxClient
import net.ibizsys.central.service.client.WebClientBase
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.http.client.reactive.ReactorClientHttpConnector
import org.springframework.http.codec.json.Jackson2JsonDecoder
import org.springframework.http.codec.json.Jackson2JsonEncoder
import org.springframework.util.StringUtils
import org.springframework.web.reactive.function.client.WebClient
import reactor.netty.http.client.HttpClient

/**
 * https时忽略 ssl 
 */
class HttpsWebFluxClient extends WebFluxClient {

    private final Log log = LogFactory.getLog(HttpsWebFluxClient.class)
    private WebClient webClient = null;
    private WebClient webClient2 = null;

    @Override
    protected WebClient getWebClient(String strUri) {

        if (StringUtils.hasLength(this.getServiceUrl())) {
            if (this.webClient == null) {
                if (this.getServiceUrl().indexOf("lb://") == 0) {
                    this.webClient = WebClient.builder().codecs({ configurer ->
                        configurer.defaultCodecs().jackson2JsonDecoder(new Jackson2JsonDecoder(WebClientBase.MAPPER));
                        configurer.defaultCodecs().jackson2JsonEncoder(new Jackson2JsonEncoder(WebClientBase.OUTMAPPER));
                        configurer.defaultCodecs().maxInMemorySize(getMaxInMemorySize());
                    }).filter(getExchangeFilterFunction()).baseUrl(this.getServiceUrl()).build();
                } else {

                    SslContext sslContext = SslContextBuilder
                            .forClient()
                            .trustManager(InsecureTrustManagerFactory.INSTANCE)
                            .build();

                    HttpClient httpClient = HttpClient.create().secure { t -> t.sslContext(sslContext) };

                    this.webClient = WebClient.builder().codecs({ configurer ->
                        configurer.defaultCodecs().jackson2JsonDecoder(new Jackson2JsonDecoder(WebClientBase.MAPPER));
                        configurer.defaultCodecs().jackson2JsonEncoder(new Jackson2JsonEncoder(WebClientBase.OUTMAPPER));
                        configurer.defaultCodecs().maxInMemorySize(getMaxInMemorySize());
                    }).baseUrl(this.getServiceUrl()).clientConnector(new ReactorClientHttpConnector(httpClient)).build();
                }
            }
            return this.webClient;
        } else if (StringUtils.hasLength(strUri) && strUri.indexOf("lb://") == 0) {
            if (this.webClient == null) {
                this.webClient = WebClient.builder().codecs({ configurer ->
                    configurer.defaultCodecs().jackson2JsonDecoder(new Jackson2JsonDecoder(WebClientBase.MAPPER));
                    configurer.defaultCodecs().jackson2JsonEncoder(new Jackson2JsonEncoder(WebClientBase.OUTMAPPER));
                    configurer.defaultCodecs().maxInMemorySize(getMaxInMemorySize());
                }).filter(getExchangeFilterFunction()).build();
            }
            return this.webClient;
        } else {
            if (this.webClient2 == null) {

                SslContext sslContext = SslContextBuilder
                        .forClient()
                        .trustManager(InsecureTrustManagerFactory.INSTANCE)
                        .build();

                HttpClient httpClient = HttpClient.create().secure { t -> t.sslContext(sslContext) };

                this.webClient2 = WebClient.builder().codecs({ configurer ->
                    configurer.defaultCodecs().jackson2JsonDecoder(new Jackson2JsonDecoder(WebClientBase.MAPPER));
                    configurer.defaultCodecs().jackson2JsonEncoder(new Jackson2JsonEncoder(WebClientBase.OUTMAPPER));
                    configurer.defaultCodecs().maxInMemorySize(getMaxInMemorySize());
                }).clientConnector(new ReactorClientHttpConnector(httpClient)).build();
            }
            return this.webClient2;
        }
    }
}

```
### JudgingDEActionRuntime :id=JudgingDEActionRuntime
判断人员是否已存在

```cn.ibizlab.checkin.runtime.plugin.JudgingDEActionRuntime```

```groovy
package cn.ibizlab.checkin.runtime.plugin

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime
import net.ibizsys.central.database.ISysDBSchemeRuntime
import net.ibizsys.central.dataentity.action.DEActionRuntimeBase
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.model.dataentity.ds.IPSDEDataSet
import net.ibizsys.runtime.util.JsonUtils
import org.springframework.util.ObjectUtils

class JudgingDEActionRuntime extends DEActionRuntimeBase {


    @Override
    protected Object onExecute(IEntityDTO iEntityDTO) throws Throwable {
        IEntityDTO ret = this.getDataEntityRuntime().createEntity();
        // 初始化运行时对象
        ISysDBSchemeRuntime dbSchema = this.getDataEntityRuntime().getSysDBSchemeRuntimeMust()
        IDataEntityRuntime shiftMemberRuntime = systemRuntime.getDataEntityRuntime("attendance_group_shift_member")

        def cur_members = JsonUtils.asList(iEntityDTO.get("cur_members"))
        def other_members = JsonUtils.asList(iEntityDTO.get("other_members"))
        def summaryResult = new ArrayList()
        def groupByResult = new ArrayList()
        if (!ObjectUtils.isEmpty(cur_members)) {
            //校验所选人/部门是否在其他生效规则中
            for (cur_member in cur_members) {

                def _param = []
                _param.add(iEntityDTO.get("attendance_rule") ?: "")
                _param.add(cur_member.get("id"))

                def sql = "select g.name, g.rule_id, r.name as rule_name from attendance_group_shift_member g left join attendance_rule r on rule_id = r.ID where rule_id != ? and user_id = ? and exists ( select 1 from attendance_activate_rule rule where rule.id = g.rule_id)";
                List<Map<String, Object>> memberResult = dbSchema.executeSelectSQL(sql, _param) as List<Map<String, Object>>;
                if (!ObjectUtils.isEmpty(memberResult)) {
                    summaryResult.addAll(memberResult)
                }
            }
            if (!ObjectUtils.isEmpty(summaryResult)) {
                def grouped = summaryResult.groupBy { it.RULE_ID }
                grouped.each { ruleId, items ->
                    IEntityDTO temp = shiftMemberRuntime.createEntity();
                    def names = items.collect { it.get("NAME") }.findAll { it != null }
                    temp.set("name", names.join('、'))
                    temp.set("rule_id", ruleId)
                    temp.set("rule_name", items[0].get("RULE_NAME"))
                    groupByResult.add(temp)
                }
                def namesWithRules = groupByResult.collect { item ->
                    "${item.name}已在考勤规则${item.get("rule_name")}内"
                }
                // 拼接最终消息
                def msg = "${namesWithRules.join('、')},是否将其移入当前考勤规则？"
                ret.set("msg", msg.toString())
                ret.set("isAdd", true)
                return ret;
            }

            if (!ObjectUtils.isEmpty(other_members)) {
                //新增组间冲突校验逻辑
                def groups = JsonUtils.asList(iEntityDTO.get("groups"))
                def deptRuntime = getSystemRuntime().getDataEntityRuntime("department")
                ISearchContextDTO searchContextDTO = deptRuntime.createSearchContext();
                searchContextDTO.count(false).limit(10000)
                //获取所有部门
                IPSDEDataSet iPSDEDataSet = deptRuntime.getPSDEDataSet("dept");
                List<IEntityDTO> deptList = deptRuntime.selectDataSet(iPSDEDataSet, searchContextDTO);
                // 创建快速查找集合
                def otherIds = other_members.collect { it.get("user_id") } as Set
                def conflictGroups = new HashSet()
                cur_members.each { cur_member ->
                    def parentId = cur_member.get("parent_id")
                    // 1、确保所选的人/部门不在其他组部门下
                    if (parentId) {
                        def currentId = parentId
                        boolean conflictFound = false
                        // 逐级向上查找，找到第一个冲突即停止
                        while (currentId && !conflictFound) {
                            // 获取部门信息
                            def dept = deptList.find { it.id == currentId }
                            if (dept && otherIds.contains(dept.id)) {
                                // 记录冲突组
                                def member = other_members.find { it.user_id == dept.id }
                                def group = groups.find { it.id == member.get("group_id") }
                                conflictGroups.add(group?.get("order_num"))
                                conflictFound = true
                            } else {
                                // 继续向上查找
                                currentId = dept?.get("parent_id")
                            }

                        }
                    }
                    // 2、确保所选的部门下没有其他组人员/部门
                    if (cur_member.get("type") == "dept") {
                        def rootDeptId = cur_member.get("id")

                        // 递归获取所有子部门ID（含自身）
                        List<String> allSubDeptIds = [rootDeptId]
                        def subDeptIds = getSubDeptIds(rootDeptId, deptList)
                        allSubDeptIds.addAll(subDeptIds)

                        // 检查其他组成员是否在这些部门中
                        other_members.each { member ->
                            def userId = member.get("parent_id")
                            if (allSubDeptIds.contains(userId)) {
                                def group = groups.find { it.id == member.get("group_id") }
                                conflictGroups.add(group?.get("order_num"))
                            }
                        }
                    }

                }

                // 生成提示信息
                if (!conflictGroups.isEmpty()) {
                    def msg = "与第${conflictGroups.join('、')}组考勤人员有重合，请修改考勤人员？"
                    ret.set("msg", msg)
                    ret.set("isAdd", false)
                    return ret;
                }

            }
        }
        return ret;

    }

    // 辅助方法：递归获取子部门ID
    private List<String> getSubDeptIds(String deptId, List<IEntityDTO> deptList) {
        List<String> subDepts = []
        deptList.each { dept ->
            if (dept.get("parent_id") == deptId) {
                subDepts.add(dept.id)
                subDepts.addAll(getSubDeptIds(dept.id, deptList))
            }
        }
        return subDepts
    }


}
```
### PersonalSummaryPOIDEDataExportRuntimeEx :id=PersonalSummary
个人统计自定义导出

```cn.ibizlab.checkin.runtime.plugin.groovy.dataentity.dataexport.PersonalSummaryPOIDEDataExportRuntimeEx```

```groovy
package cn.ibizlab.checkin.runtime.plugin.groovy.dataentity.dataexport

import groovy.transform.CompileStatic;
import net.ibizsys.central.plugin.poi.dataentity.dataexport.POIDEDataExportRuntime

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem
import net.ibizsys.runtime.security.UserContext
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.data.domain.Page
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;
import java.text.SimpleDateFormat;

@CompileStatic
class PersonalSummaryPOIDEDataExportRuntimeEx extends POIDEDataExportRuntime {

    @Override
    protected void onExportStream(Object objData, OutputStream outputStram) throws Throwable {
        Workbook workbook = new XSSFWorkbook();
        Throwable var4 = null;
        try {
            List<IPSDEDataExportItem> exportItems = this.getPSDEDataExport().getPSDEDataExportItems();

            if (ObjectUtils.isEmpty(exportItems)) {
                throw new Exception("未指定导出列");
            }
            MultiValueMap<String, String> parameters = UserContext.getCurrent().getWebContext().getParameters();
            // 基础信息
            List<String> baseInfoList = convertStringToList(parameters.get("base_info")?.toString())
            // 出勤统计
            List<String> attendanceList = convertStringToList(parameters.get("attendance")?.toString())
            // 异常统计
            List<String> abnormalList = convertStringToList(parameters.get("abnormal")?.toString())
            // 请假统计
            List<String> leaveList = convertStringToList(parameters.get("leave")?.toString())
            // 每日统计
            String daily = parameters.get("daily");
            // 时间范围
            List<String> dateRangeList = convertStringToList(parameters.get("date_range")?.toString())
            List<String> dateRangeWeekList = generateDateWeekRange(dateRangeList.get(0), dateRangeList.get(1));
            Sheet sheet = workbook.createSheet()
            // 创建动态表头
            createHeaders(sheet, baseInfoList, attendanceList, abnormalList,
                    leaveList, daily, dateRangeWeekList, exportItems);
            // 获取动态属性列
            Row headerRow = sheet.getRow(2);
            List<String> propertyNames = getPropertyNames(headerRow);
            if (daily == "[daily]") {
                // 添加日历属性名称
                List<String> dateRange = generateDateRange(dateRangeList.get(0), dateRangeList.get(1));
                propertyNames.addAll(dateRange);
            }
            // 创建Excel表格数据
            List<IEntityDTO> data = ((Page) objData).getContent();

            // 平铺日历数据
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            for (Object item : data) {
                IEntityDTO it = item as IEntityDTO;
                if (!ObjectUtils.isEmpty(it.get("attendance_data"))) {
                    Map<String, Object> attendanceData = it.get("attendance_data") as Map<String, Object>;
                    Set<String> keys = attendanceData.keySet();
                    for (String key : keys) {
                        IEntityDTO record = attendanceData.get(key) as IEntityDTO;
                        if (!ObjectUtils.isEmpty(record) && !ObjectUtils.isEmpty(record.get("details"))) {
                            List<IEntityDTO> details = record.get("details") as List<IEntityDTO>;
                            String checkinTime = "";
                            for (IEntityDTO item2 : details) {
                                if (item2.get("checkin_result") == "NORMAL") {
                                    if (!ObjectUtils.isEmpty(item2.get("checkin_time"))) {
                                        checkinTime += sdf.format(item2.get("checkin_time")) + "\n";
                                    }
                                }
                            }
                            it.set(key, checkinTime);
                        }
                    }
                }
            }

            int startRowIndex = 3; // 数据从第4行开始（0-based索引）
            fillDataRows(sheet, data, propertyNames, startRowIndex);
            // 删除标识行
            deleteRowSimple(sheet, 2)
            workbook.write(outputStram);
        } catch (Throwable var25) {
            var4 = var25;
            throw var25;
        } finally {
            if (workbook != null) {
                if (var4 != null) {
                    try {
                        workbook.close();
                    } catch (Throwable var24) {
                        var4.addSuppressed(var24);
                    }
                } else {
                    workbook.close();
                }
            }
        }
    }


    // 字符串转List方法
    private static List<String> convertStringToList(String input) {
        if (input == "[]" || input == "[null]" || input == "" || input == null || input.trim().isEmpty()) {
            return new ArrayList<>();
        }
        // 去除方括号并按逗号分割
        String cleaned = input.substring(1, input.length() - 1).trim();
        String[] parts = cleaned.split(",");

        List<String> result = new ArrayList<>();
        for (String part : parts) {
            if (!"name".equals(part.trim())) {
                result.add(part.trim());
            }
        }
        return result;
    }

    // 创建复杂的列头结构
    private static void createHeaders(Sheet sheet, List<String> baseInfoList,
                                      List<String> attendanceList,
                                      List<String> abnormalList,
                                      List<String> leaveList,
                                      String daily,
                                      List<String> dateRangeList,
                                      List<IPSDEDataExportItem> exportItems) {
        // 创建两行表头
        Row row0 = sheet.createRow(0);
        Row row1 = sheet.createRow(1);
        Row row2 = sheet.createRow(2);
        int colIndex = 0;
        // 基本信息分组
        if (baseInfoList.size() > 0) {
            colIndex = createGroupHeader(sheet, row0, row1, row2, colIndex,
                    "基本信息", baseInfoList, exportItems);
        }
        // 出勤统计分组
        if (attendanceList.size() > 0) {
            colIndex = createGroupHeader(sheet, row0, row1, row2, colIndex,
                    "出勤统计", attendanceList, exportItems);
        }
        // 异常统计分组
        if (abnormalList.size() > 0) {
            colIndex = createGroupHeader(sheet, row0, row1, row2, colIndex,
                    "异常统计", abnormalList, exportItems);
        }
        // 请假统计分组
        if (leaveList.size() > 0) {
            colIndex = createGroupHeader(sheet, row0, row1, row2, colIndex,
                    "请假统计", leaveList, exportItems);
        }
        if (daily == "[daily]") {
            // 每日统计分组
            if (dateRangeList.size() > 0) {
                colIndex = createDateRangeHeader(sheet, row0, row1, row2, colIndex,
                        "每日统计", dateRangeList);
            }
        }
    }

    // 安全合并单元格（防止无效合并区域）
    private static void addSafeMergedRegion(Sheet sheet, int firstRow, int lastRow,
                                            int firstCol, int lastCol) {
        // 确保是有效的合并区域（至少包含两个单元格）
        int rowSpan = lastRow - firstRow + 1;
        int colSpan = lastCol - firstCol + 1;

        if (rowSpan >= 2 || colSpan >= 2) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow, lastRow, firstCol, lastCol));
        }
    }

    private static int createDateRangeHeader(Sheet sheet, Row row0, Row row1, Row row2,
                                         int startCol, String groupName,
                                         List<String> headers) {
        if (headers.isEmpty()) {
            return startCol;
        }
        int endCol = startCol + headers.size() - 1;
        // 创建分组标题单元格（存在分组列就创建）
        Cell groupCell = row0.createCell(startCol);
        groupCell.setCellValue(groupName);
        // 处理多列情况
        if (headers.size() > 1) {
            // 横向合并分组标题
            sheet.addMergedRegion(new CellRangeAddress(0, 0, startCol, endCol));
            // 创建分组内的列头
            for (int i = 0; i < headers.size(); i++) {
                Cell headerCell = row1.createCell(startCol + i);
                Cell headerCell2 = row2.createCell(startCol + i);
                String header = headers.get(i).substring(0, 10);
                String headerName = headers.get(i);
                headerCell.setCellValue(headerName);
                headerCell2.setCellValue(header)
            }
        }
        // 处理单列情况
        else if (headers.size() == 1) {
            // 1. 分组标题显示在第一行（不合并）
            // 2. 列头显示在第二行
            // 创建列头单元格
            Cell headerCell = row1.createCell(startCol);
            String header = headers.get(0).substring(0, 10);
            String headerName = headers.get(0);
            headerCell.setCellValue(headerName);
            Cell headerCell2 = row2.createCell(startCol);
            headerCell2.setCellValue(header)
        }
        return endCol + 1;
    }

    // 创建分组列头（修复单列问题）
    private static int createGroupHeader(Sheet sheet, Row row0, Row row1, Row row2,
                                         int startCol, String groupName,
                                         List<String> headers, List<IPSDEDataExportItem> exportItems) {
        if (headers.isEmpty()) {
            return startCol;
        }
        int endCol = startCol + headers.size() - 1;
        // 创建分组标题单元格（存在分组列就创建）
        Cell groupCell = row0.createCell(startCol);
        groupCell.setCellValue(groupName);
        // 处理多列情况
        if (headers.size() > 1) {
            // 横向合并分组标题
            sheet.addMergedRegion(new CellRangeAddress(0, 0, startCol, endCol));
            // 创建分组内的列头
            for (int i = 0; i < headers.size(); i++) {
                Cell headerCell = row1.createCell(startCol + i);
                Cell headerCell2 = row2.createCell(startCol + i);
                String header = headers.get(i);
                String headerName = getHeaderName(header, exportItems)
                headerCell.setCellValue(headerName);
                headerCell2.setCellValue(header)
            }
        }
        // 处理单列情况
        else if (headers.size() == 1) {
            // 1. 分组标题显示在第一行（不合并）
            // 2. 列头显示在第二行
            // 创建列头单元格
            Cell headerCell = row1.createCell(startCol);
            String header = headers.get(0);
            String headerName = getHeaderName(header, exportItems)
            headerCell.setCellValue(headerName);
            Cell headerCell2 = row2.createCell(startCol);
            headerCell2.setCellValue(header)
        }
        return endCol + 1;
    }

    private static String getHeaderName(String header, List<IPSDEDataExportItem> exportItems) {
        String headerName = ""
        for (IPSDEDataExportItem item : exportItems) {
            if (item.getName().equals(header)) {
                headerName = item.getCaption()
            }
        }
        return headerName
    }

    // 填充数据行
    private void fillDataRows(Sheet sheet, List<IEntityDTO> data, List<String> propertyNames, int startRowIndex) {
        if (data == null || data.isEmpty()) return;
        for (int i = 0; i < data.size(); i++) {
            IEntityDTO entity = data.get(i);
            // 创建每行数据
            Row dataRow = sheet.createRow(startRowIndex + i);
            // 填充每个单元格
            for (int col = 0; col < propertyNames.size(); col++) {
                String propertyName = propertyNames.get(col);
                String propertyValue = entity.get(propertyName);
                Cell cell = dataRow.createCell(col);
                // 设置单元格值
                cell.setCellValue(propertyValue);
            }
        }
    }

    // 获取第三行的属性名列表
    private static List<String> getPropertyNames(Row headerRow) {
        List<String> propertyNames = new ArrayList<>();
        int lastCellNum = headerRow.getLastCellNum();

        for (int i = 0; i < lastCellNum; i++) {
            Cell cell = headerRow.getCell(i);
            if (cell != null) {
                propertyNames.add(cell.getStringCellValue());
            } else {
                propertyNames.add(""); // 空值处理
            }
        }
        return propertyNames;
    }

    private static void deleteRowSimple(Sheet sheet, int rowIndex) {
        int lastRowNum = sheet.getLastRowNum();
        // 验证行索引
        if (rowIndex < 0 || rowIndex > lastRowNum) {
            throw new IllegalArgumentException("行索引超出范围: " + rowIndex);
        }
        // 如果是最后一行，直接删除
        if (rowIndex == lastRowNum) {
            Row row = sheet.getRow(rowIndex);
            if (row != null) {
                sheet.removeRow(row);
            }
        }
        // 如果是中间行，向上移动后续行
        else {
            sheet.shiftRows(rowIndex + 1, lastRowNum, -1);
        }
    }

    private static List<String> generateDateWeekRange(String startDate, String endDate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE", Locale.CHINA);

        Date start = sdf.parse(startDate);
        Date end = sdf.parse(endDate);

        List<String> dateArray = new ArrayList<>();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);

        while (!calendar.getTime().after(end)) {
            String formattedDate = sdf.format(calendar.getTime()) + " " + dayOfWeekFormat.format(calendar.getTime());
            dateArray.add(formattedDate);
            calendar.add(Calendar.DATE, 1);
        }

        return dateArray;
    }

    private static List<String> generateDateRange(String startDate, String endDate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date start = sdf.parse(startDate);
        Date end = sdf.parse(endDate);

        List<String> dateArray = new ArrayList<>();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);

        while (!calendar.getTime().after(end)) {
            dateArray.add(sdf.format(calendar.getTime()));
            calendar.add(Calendar.DATE, 1);
        }

        return dateArray;
    }
}
```
### SchedulePOIDEDataExportRuntimeEx :id=Schedule
排班视图自定义导出

```cn.ibizlab.checkin.runtime.plugin.groovy.dataentity.dataexport.SchedulePOIDEDataExportRuntimeEx```

```groovy
package cn.ibizlab.checkin.runtime.plugin.groovy.dataentity.dataexport

import groovy.transform.CompileStatic;
import net.ibizsys.central.plugin.poi.dataentity.dataexport.POIDEDataExportRuntime

import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem
import net.ibizsys.runtime.security.UserContext
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.data.domain.Page
import org.springframework.util.MultiValueMap
import org.springframework.util.ObjectUtils



@CompileStatic
class SchedulePOIDEDataExportRuntimeEx extends POIDEDataExportRuntime {

    @Override
    protected void onExportStream(Object objData, OutputStream outputStram) throws Throwable {
        Workbook workbook = new XSSFWorkbook();
        Throwable var4 = null;
        try {
            List<IPSDEDataExportItem> exportItems = this.getPSDEDataExport().getPSDEDataExportItems();
            if (ObjectUtils.isEmpty(exportItems)) {
                throw new Exception("未指定导出列");
            }

            MultiValueMap<String, String> parameters = UserContext.getCurrent().getWebContext().getParameters();
            // 月份
            String chooseMonth = parameters.get("choose_month")?.toString();
            chooseMonth = chooseMonth.substring(1, chooseMonth.length() - 1);
            // 获取当月的每日数据
            List<String> monthlyData = getMonthlyData(chooseMonth);

            Sheet sheet = workbook.createSheet();
            Row row = sheet.createRow(0);
            
            for(int i = 0; i < exportItems.size(); ++i) {
                IPSDEDataExportItem iPSDEDataExportItem = (IPSDEDataExportItem)exportItems.get(i);
                Cell cell0 = row.createCell(i);
                cell0.setCellValue(iPSDEDataExportItem.getCaption());
            }

            // 新建日历表格头
            for(int i = 0; i < monthlyData.size(); ++i) {
                Cell cell0 = row.createCell(i + exportItems.size());
                cell0.setCellValue(monthlyData[i]);
            }

            List<IEntityDTO> data = ((Page)objData).getContent();
            Map<String, List<IEntityDTO>> groupedMembers = groupMembersById(data);
            int i = 0;
            for(String key : groupedMembers.keySet()) {
                ++i;
                List<IEntityDTO> items = groupedMembers.get(key).sort { it.get("checkin_date") }
                Row dataRow = sheet.createRow(i);
                for(int k = 0; k < exportItems.size(); ++k) {
                    IPSDEDataExportItem iPSDEDataExportItem = (IPSDEDataExportItem)exportItems.get(k);
                    Object objValue = items[0].get(iPSDEDataExportItem.getName());
                    Cell cell0 = dataRow.createCell(k);
                    if (objValue != null) {
                        cell0.setCellValue(this.convertValue(iPSDEDataExportItem, objValue));
                    }
                }
                // 填充日历数据
                for(int k = 0; k < monthlyData.size(); ++k) {
                    IEntityDTO item = items[k];
                    // 1、shifts为空,当天无考勤数据，显示“/”
                    if (item == null || ObjectUtils.isEmpty(item.get("shifts"))) {
                        Cell cell0 = dataRow.createCell(k + exportItems.size());
                        cell0.setCellValue("/");
                        continue;
                    }
                    // 2、规则类型是否为免考勤，免考勤的话显示“免考勤”
                    if (!ObjectUtils.isEmpty(item.get("rule_data"))) {
                        IEntityDTO ruleData = item.get("rule_data") as IEntityDTO;
                        if (ruleData.get("schedule_type") == "no_required") {
                            Cell cell0 = dataRow.createCell(k + exportItems.size());
                            cell0.setCellValue("免考勤");
                            continue;
                        }
                    }
                    // 3、规则类型是否为自由班，自由班的话显示"/"
                    if (!ObjectUtils.isEmpty(item.get("rule_data"))) {
                        IEntityDTO ruleData = item.get("rule_data") as IEntityDTO;
                        if (ruleData.get("schedule_type") == "free") {
                            Cell cell0 = dataRow.createCell(k + exportItems.size());
                            cell0.setCellValue("/");
                            continue;
                        }
                    }
                    // 4、判断是否工作日
                    if (item.get("workday") == 0 || ObjectUtils.isEmpty(item.get("shift_data"))) {
                        Cell cell0 = dataRow.createCell(k + exportItems.size());
                        cell0.setCellValue("休息");
                    } else {
                        if (!ObjectUtils.isEmpty(item.get("shift_data"))) {
                            IEntityDTO shiftData = item.get("shift_data") as IEntityDTO;
                            Cell cell0 = dataRow.createCell(k + exportItems.size());
                            cell0.setCellValue(shiftData.get("name").toString());
                        }
                    }
                }
            }
            workbook.write(outputStram);
        } catch (Throwable var25) {
            var4 = var25;
            throw var25;
        } finally {
            if (workbook != null) {
                if (var4 != null) {
                    try {
                        workbook.close();
                    } catch (Throwable var24) {
                        var4.addSuppressed(var24);
                    }
                } else {
                    workbook.close();
                }
            }
        }
    }

    private static List<String> getMonthlyData(String yearMonth) {
        // 分割输入的字符串
        String[] parts = yearMonth.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        // 创建一个日历实例，并设置为该月的第一天
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);  // 月份是从0开始的，所以减去1
        // 获取该月的天数
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        // 创建一个字符串列表来存储结果
        List<String> dailyData = new ArrayList<>();
        // 遍历每一天
        for (int day = 1; day <= daysInMonth; day++) {
            calendar.set(year, month - 1, day);
            // 获取星期几（1=星期日，2=星期一，...，7=星期六）
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            // 根据星期几返回中文的星期
            String weekday = "";
            switch (dayOfWeek) {
                case Calendar.SUNDAY:
                    weekday = "日"; break;
                case Calendar.MONDAY:
                    weekday = "一"; break;
                case Calendar.TUESDAY:
                    weekday = "二"; break;
                case Calendar.WEDNESDAY:
                    weekday = "三"; break;
                case Calendar.THURSDAY:
                    weekday = "四"; break;
                case Calendar.FRIDAY:
                    weekday = "五"; break;
                case Calendar.SATURDAY:
                    weekday = "六"; break;
            }
            // 生成格式并加入列表
            dailyData.add(day + weekday);
        }
        return dailyData;  // 返回生成的数据列表
    }

    private static Map<String, List<IEntityDTO>> groupMembersById(List<IEntityDTO> members) {
        Map<String, List<IEntityDTO>> groupedMembers = new HashMap<>();
        // 遍历成员列表
        for (IEntityDTO member : members) {
            String memberId = member.get("member_id");
            // 使用 getOrDefault 进行获取或创建新列表
            List<IEntityDTO> memberList = groupedMembers.getOrDefault(memberId, new ArrayList<>());
            memberList.add(member);
            groupedMembers.put(memberId, memberList); // 更新 map 中的列表
        }
        return groupedMembers; // 返回分组后的结果
    }
}
```
### ScheduleDEDataSetRuntime :id=ScheduleDEDataSetRuntime


```cn.ibizlab.checkin.runtime.plugin.ScheduleDEDataSetRuntime```

```groovy
package cn.ibizlab.checkin.runtime.plugin


import net.ibizsys.central.dataentity.IDataEntityRuntime
import net.ibizsys.central.dataentity.ds.DEDataSetRuntimeBase
import net.ibizsys.central.util.ISearchContext
import net.ibizsys.model.dataentity.ds.IPSDEDataSet
import net.ibizsys.runtime.util.JsonUtils;
import org.springframework.data.domain.Page;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import org.springframework.data.domain.Pageable;

class ScheduleDEDataSetRuntime extends DEDataSetRuntimeBase {

    @Override
    protected Object onFetch(ISearchContext iSearchContext) throws Throwable {
        ISearchContextDTO iSearchContextDTO = (ISearchContextDTO) iSearchContext;
        // 获取employee实体
        IDataEntityRuntime employeeRuntime = this.getSystemRuntime().getDataEntityRuntime("employee");
        ISearchContextDTO employeeSearchContextDTO = employeeRuntime.createSearchContext();
        employeeSearchContextDTO.eq('status', 1);
        def person_range = iSearchContextDTO.get("n_member_id_in");

        //解析特定条件
        if (person_range != null && person_range != "") {
            def depts = []
            def persons = []
            person_range.each { item ->
                if (item.type == "dept") {
                    depts.add(item.id)
                } else {
                    persons.add(item.id)
                }
            }
            def deptStr = depts ? depts.join(",") : ""
            def personStr = persons ? persons.join(",") : ""
            if (deptStr != "" && personStr != "") {
                employeeSearchContextDTO.and().or().in('dept_id', deptStr).in('id', personStr)
            } else if (deptStr != "" && personStr == "") {
                employeeSearchContextDTO.in('dept_id', deptStr)
            } else {
                employeeSearchContextDTO.in('id', personStr)
            }
        }

        if (this.getDataEntityRuntime().getSystemPersistentAdapter() == null) {
            throw new Exception("实体未提供系统持久化设置器");
        }

        employeeSearchContextDTO.setPageable(iSearchContextDTO.getPageable());
        employeeSearchContextDTO.sort("name,desc");
        Object[] args = [employeeSearchContextDTO];
        Page<?> ret = (Page<?>) employeeRuntime.fetchDataSet("user", null, args);
        Page<IEntityDTO> page = employeeRuntime.getEntityDTOPage(ret, employeeRuntime.getDefaultPSDEDataSet(), employeeSearchContextDTO.getPageable());
        return new CustomPageImpl<IEntityDTO>(fillScheduleData(page.getContent(), iSearchContextDTO), employeeSearchContextDTO.getPageable(), ret.getTotalElements(), page.getTotalPages());
    }


    @Override
    public boolean isValid(Object[] args) {
        return true;
    }

    protected List<IEntityDTO> fillScheduleData(List<IEntityDTO> dtos, ISearchContextDTO iSearchContextDTO) {
        ISearchContextDTO attendance_scheduleSearchContextDTO = this.getDataEntityRuntime().createSearchContext();
        List<IEntityDTO> lastScheduleDTOList = new ArrayList<IEntityDTO>();
        List<String> persons = new ArrayList<String>();
        // 查询排班
        for (IEntityDTO dto : dtos) {
            persons.add(dto.getString("id", ""));
        }
        def personStr = persons ? persons.join(",") : ""

        attendance_scheduleSearchContextDTO.count(false).limit(10000).in("member_id", personStr);

        // 考勤规则过滤
        boolean inputRule = (iSearchContextDTO.get("n_rule_id_eq") != null && iSearchContextDTO.get("n_rule_id_eq") != "")
        if (inputRule) {
            attendance_scheduleSearchContextDTO.eq("rule_id", iSearchContextDTO.get("n_rule_id_eq"));
        }
        if (iSearchContextDTO.get("choose_month") != null && iSearchContextDTO.get("choose_month") != "") {
            attendance_scheduleSearchContextDTO.custom(" DATE_FORMAT(t1.CHECKIN_DATE, '%Y-%m') = '"+ iSearchContextDTO.get("choose_month") +"'")
        }

        IPSDEDataSet iPSDEDataSet = this.getDataEntityRuntime().getPSDEDataSet("Default");
        List<IEntityDTO> attendance_scheduleDTOList = this.getDataEntityRuntime().selectDataSet(iPSDEDataSet, attendance_scheduleSearchContextDTO)?:this.getDataEntityRuntime().createEntityList();
        //固定排班、灵活打卡、大小周需区分
        attendance_scheduleDTOList.forEach { s ->
            if (s.get("schedule_type").equals("fixed") || s.get("schedule_type").equals("flexible") || s.get("schedule_type").equals("alternate_week")){
                def shifts = s.get("shifts")
                def shift_data = JsonUtils.asMap(s.get("shift_data"))
                if (shifts && shift_data){
                    def matchedShift = shifts.find { it.id == shift_data.get("id") }
                    s.set("shifts", [matchedShift])
                }
                //休息
                if(shifts && !shift_data){
                    shifts.each {it ->
                        def shift_data1 = JsonUtils.asMap(it.get("shift_data"))
                        if (shift_data1.get("default_flag") == 1){
                            s.set("shifts", [it])
                        }
                    }

                }
            }
        }
        if (inputRule){
            //以规则为维度
            lastScheduleDTOList.addAll(attendance_scheduleDTOList)
        }else {
            //以人员为维度
            if (attendance_scheduleDTOList.size() > 0) {
                lastScheduleDTOList.addAll(attendance_scheduleDTOList)
                for (IEntityDTO employee : dtos) {
                    boolean userExistsSchedule = false;
                    for (IEntityDTO attendance_schedule : lastScheduleDTOList) {
                        if (employee.getString("id", "") == attendance_schedule.getString("member_id", "")) {
                            userExistsSchedule = true;
                            break;
                        }
                    }
                    if (!userExistsSchedule) {
                        IEntityDTO entityDTO = this.getDataEntityRuntime().createEntity();
                        entityDTO.put("member_id", employee.getString("id", ""));
                        entityDTO.put("member_name", employee.getString("name", ""));
                        lastScheduleDTOList.add(entityDTO);
                    }
                }
            }else {
                for (IEntityDTO employee : dtos) {
                    IEntityDTO entityDTO = this.getDataEntityRuntime().createEntity();
                    entityDTO.put("member_id", employee.getString("id", ""));
                    entityDTO.put("member_name", employee.getString("name", ""));
                    lastScheduleDTOList.add(entityDTO);
                }
            }
        }
        return lastScheduleDTOList;

    }


    class CustomPageImpl<T> extends net.ibizsys.central.util.PageImpl<T> {
        private final long total;

        public CustomPageImpl(List<T> content, Pageable pageable, long total, int totalPages) {
            super(content, pageable, total, totalPages);
            this.total = total;
        }

        @Override
        long getTotalElements() {
            return total;
        }
    }


}
```
### SyncHolidaysDEActionRuntime :id=SyncHolidaysDEActionRuntime


```cn.ibizlab.checkin.runtime.plugin.SyncHolidaysDEActionRuntime```

```groovy
package cn.ibizlab.checkin.runtime.plugin

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime
import net.ibizsys.central.database.ISysDBSchemeRuntime
import net.ibizsys.central.dataentity.action.DEActionRuntimeBase
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.runtime.util.KeyValueUtils

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


class SyncHolidaysDEActionRuntime extends DEActionRuntimeBase {

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter datetimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // 定义节假日映射关系
    private static final Map<String, String> HOLIDAY_MAPPING = new HashMap<String, String>() {
        {
            put("元旦节", "new_years_day");
            put("春节", "spring_festival");
            put("清明节", "tomb_sweeping_festival");
            put("劳动节", "labor_day");
            put("端午节", "dragon_boat_festival");
            put("中秋节", "mid_autumn_festival");
            put("国庆节", "national_day");
        }
    };

    protected Object onExecute(IEntityDTO iEntityDTO) throws Throwable {
        // 获取请求webclient对象
        def webclient = sys.webclient()
        def strUri = 'https://apis.tianapi.com/jiejiari/index'
        def strContentType = "application/x-www-form-urlencoded"
        def year = Calendar.getInstance().get(Calendar.YEAR).toString()

        // 构建参数Map（自动处理URL编码）
        def objBody = [key: 'de9f57437df2fe27fc766b0b7db40671', date: "${year}", type: '1']
        def headers = ['Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8']

        try {
            // 调用请求并自动处理编码
            def response = webclient.post(strUri, null, headers, null, objBody, strContentType, String.class, null);
            // 解析并合并结果
            def json = new groovy.json.JsonSlurper().parseText(response.getBody())
            if (json?.code == 200 && json?.result?.list) {
                def results = json.result.list;
                // 同步至节假日表
                syncHolidays(results)
            }
        } catch (Exception e) {
            e.printStackTrace()
        }
        return iEntityDTO;
    }

    /**
     *  同步至节假日表
     */
    private void syncHolidays(ArrayList holidays) {
        ISysDBSchemeRuntime dbSchema = this.getDataEntityRuntime().getSysDBSchemeRuntimeMust()
        // 删除今年已同步的数据
        def del_curYear_sql =
                "delete\n" +
                        "from\n" +
                        "\tresource_calendar_leaves\n" +
                        "where\n" +
                        "\tDATE_FROM >= DATE_FORMAT(CURDATE(), '%Y-01-01')\n" +
                        "\tand DATE_FROM < DATE_ADD(DATE_FORMAT(CURDATE(), '%Y-01-01'), interval 1 year)\n" +
                        "\tand CALENDAR_ID is null\n" +
                        "\tand HOLIDAY_TYPE in ('new_years_day','spring_festival','tomb_sweeping_festival','dragon_boat_festival','labor_day','dragon_boat_festival','national_day','mid_autumn_festival')";
        dbSchema.executeSQL(del_curYear_sql, []);

        //  获取相关实体运行时
        IDataEntityRuntime leavesRuntime = systemRuntime.getDataEntityRuntime("resource_calendar_leaves");
        List<IEntityDTO> newLeaves = leavesRuntime.createEntityList();
        for (Map<String, Object> holiday : (holidays as List<Map<String, Object>>)) {
            // 构造节假日
            IEntityDTO leaveData = createLeaveData(holiday, leavesRuntime);
            newLeaves.add(leaveData);
        }
        if (!newLeaves.isEmpty()) {
            leavesRuntime.rawCreate(newLeaves, true)
        }
    }


    /**
     *  创建基础节假日数据
     */
    private IEntityDTO createLeaveData(Map<String, Object> holiday, leavesRuntime) {
        IEntityDTO leaveData = leavesRuntime.createEntity();
        String pKey = KeyValueUtils.genUniqueId();
        leaveData.set("id", pKey);

        // 进行节假日映射
        String tianXingName = (String) holiday.get("name");
        String holidayType = HOLIDAY_MAPPING.getOrDefault(tianXingName, tianXingName);
        leaveData.set("holiday_type", holidayType);
        leaveData.set("name", tianXingName);

        // 节假日数组
        String[] vacation  = holiday.get("vacation").split("[|]");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        LocalDateTime dateFrom = LocalDate.parse(vacation[0], dateFormatter).atStartOfDay();
        LocalDateTime dateTo = LocalDate.parse(vacation[vacation.length-1], dateFormatter).atTime(23, 59, 59);
        leaveData.set("date_from", dateFrom);
        leaveData.set("date_to", dateTo);

        return leaveData;
    }

}
```
### UserObjectDERuntime :id=UserObjectDERuntime
UserObjectDERuntime

```cn.ibizlab.checkin.runtime.plugin.UserObjectDERuntime```

```groovy
package cn.ibizlab.checkin.runtime.plugin

import net.ibizsys.central.cloud.core.dataentity.DataEntityRuntime
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.annotation.DEAction

class UserObjectDERuntime extends DataEntityRuntime {

    @DEAction("Get")
    protected Object doGet(String  strDEId) throws Throwable {
        IDataEntityRuntime employeeRuntime = this.getSystemRuntime().getDataEntityRuntime("employee");
        try {
            IEntityDTO employee = employeeRuntime.get(strDEId);
            return employee;
        } catch (Exception e) {
            IDataEntityRuntime deptRuntime = this.getSystemRuntime().getDataEntityRuntime("department");
            IEntityDTO dept = deptRuntime.get(strDEId);
            return dept;
        }

        return null;
    }
}
```
### MonthlySummaryPOIDEDataExportRuntimeEx :id=UsrSFPlugin0521277606
月度统计自定义导出

```cn.ibizlab.checkin.runtime.plugin.groovy.dataentity.dataexport.MonthlySummaryPOIDEDataExportRuntimeEx```

```groovy
package cn.ibizlab.checkin.runtime.plugin.groovy.dataentity.dataexport

import groovy.transform.CompileStatic;
import net.ibizsys.central.plugin.poi.dataentity.dataexport.POIDEDataExportRuntime

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem
import net.ibizsys.runtime.security.UserContext
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.data.domain.Page
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;
import java.text.SimpleDateFormat;

@CompileStatic
class MonthlySummaryPOIDEDataExportRuntimeEx extends POIDEDataExportRuntime {

    @Override
    protected void onExportStream(Object objData, OutputStream outputStram) throws Throwable {
        Workbook workbook = new XSSFWorkbook();
        Throwable var4 = null;
        try {
            List<IPSDEDataExportItem> exportItems = this.getPSDEDataExport().getPSDEDataExportItems();

            if (ObjectUtils.isEmpty(exportItems)) {
                throw new Exception("未指定导出列");
            }
            MultiValueMap<String, String> parameters = UserContext.getCurrent().getWebContext().getParameters();
            // 基础信息
            List<String> baseInfoList = convertStringToList(parameters.get("base_info")?.toString())
            // 出勤统计
            List<String> attendanceList = convertStringToList(parameters.get("attendance")?.toString())
            // 异常统计
            List<String> abnormalList = convertStringToList(parameters.get("abnormal")?.toString())
            // 请假统计
            List<String> leaveList = convertStringToList(parameters.get("leave")?.toString())
            // 每日统计
            String daily = parameters.get("daily");
            // 时间范围
            List<String> dateRangeList = convertStringToList(parameters.get("date_range")?.toString())
            List<String> dateRangeWeekList = generateDateWeekRange(dateRangeList.get(0), dateRangeList.get(1));
            Sheet sheet = workbook.createSheet()
            // 创建动态表头
            createHeaders(sheet, baseInfoList, attendanceList, abnormalList,
                    leaveList, daily, dateRangeWeekList, exportItems);
            // 获取动态属性列
            Row headerRow = sheet.getRow(2);
            List<String> propertyNames = getPropertyNames(headerRow);
//            if (daily == "[daily]") {
//                // 添加日历属性名称
//                List<String> dateRange = generateDateRange(dateRangeList.get(0), dateRangeList.get(1));
//                propertyNames.addAll(dateRange);
//            }
            // 创建Excel表格数据
            List<IEntityDTO> data = ((Page) objData).getContent();

            // 平铺日历数据
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            for (Object item : data) {
                IEntityDTO it = item as IEntityDTO;
                if (!ObjectUtils.isEmpty(it.get("attendance_data"))) {
                    Map<String, Object> attendanceData = it.get("attendance_data") as Map<String, Object>;
                    Set<String> keys = attendanceData.keySet();
                    for (String key : keys) {
                        IEntityDTO record = attendanceData.get(key) as IEntityDTO;
                        if (!ObjectUtils.isEmpty(record) && !ObjectUtils.isEmpty(record.get("details"))) {
                            List<IEntityDTO> details = record.get("details") as List<IEntityDTO>;
                            String checkinTime = "";
                            for (IEntityDTO item2 : details) {
                                if (item2.get("checkin_result") == "NORMAL") {
                                    if (!ObjectUtils.isEmpty(item2.get("checkin_time"))) {
                                        checkinTime += sdf.format(item2.get("checkin_time")) + "\n";
                                    }
                                }
                            }
                            it.set(key, checkinTime);
                        }
                    }
                }
            }

            int startRowIndex = 3; // 数据从第4行开始（0-based索引）
            fillDataRows(sheet, data, propertyNames, startRowIndex);
            // 删除标识行
            deleteRowSimple(sheet, 2)
            workbook.write(outputStram);
        } catch (Throwable var25) {
            var4 = var25;
            throw var25;
        } finally {
            if (workbook != null) {
                if (var4 != null) {
                    try {
                        workbook.close();
                    } catch (Throwable var24) {
                        var4.addSuppressed(var24);
                    }
                } else {
                    workbook.close();
                }
            }
        }
    }


    // 字符串转List方法
    private static List<String> convertStringToList(String input) {
        if (input == "[]" || input == "[null]" || input == "" || input == null || input.trim().isEmpty()) {
            return new ArrayList<>();
        }
        // 去除方括号并按逗号分割
        String cleaned = input.substring(1, input.length() - 1).trim();
        String[] parts = cleaned.split(",");

        List<String> result = new ArrayList<>();
        for (String part : parts) {
            if (!"name".equals(part.trim())) {
                result.add(part.trim());
            }
        }
        return result;
    }

    // 创建复杂的列头结构
    private static void createHeaders(Sheet sheet, List<String> baseInfoList,
                                      List<String> attendanceList,
                                      List<String> abnormalList,
                                      List<String> leaveList,
                                      String daily,
                                      List<String> dateRangeList,
                                      List<IPSDEDataExportItem> exportItems) {
        // 创建两行表头
        Row row0 = sheet.createRow(0);
        Row row1 = sheet.createRow(1);
        Row row2 = sheet.createRow(2);
        int colIndex = 0;
        // 基本信息分组
        if (baseInfoList.size() > 0) {
            colIndex = createGroupHeader(sheet, row0, row1, row2, colIndex,
                    "基本信息", baseInfoList, exportItems);
        }
        // 出勤统计分组
        if (attendanceList.size() > 0) {
            colIndex = createGroupHeader(sheet, row0, row1, row2, colIndex,
                    "出勤统计", attendanceList, exportItems);
        }
        // 异常统计分组
        if (abnormalList.size() > 0) {
            colIndex = createGroupHeader(sheet, row0, row1, row2, colIndex,
                    "异常统计", abnormalList, exportItems);
        }
        // 请假统计分组
        if (leaveList.size() > 0) {
            colIndex = createGroupHeader(sheet, row0, row1, row2, colIndex,
                    "请假统计", leaveList, exportItems);
        }
        if (daily == "[daily]") {
            // 每日统计分组
            if (dateRangeList.size() > 0) {
                colIndex = createDateRangeHeader(sheet, row0, row1, row2, colIndex,
                        "每日统计", dateRangeList);
            }
        }
    }

    // 安全合并单元格（防止无效合并区域）
    private static void addSafeMergedRegion(Sheet sheet, int firstRow, int lastRow,
                                            int firstCol, int lastCol) {
        // 确保是有效的合并区域（至少包含两个单元格）
        int rowSpan = lastRow - firstRow + 1;
        int colSpan = lastCol - firstCol + 1;

        if (rowSpan >= 2 || colSpan >= 2) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow, lastRow, firstCol, lastCol));
        }
    }

    private static int createDateRangeHeader(Sheet sheet, Row row0, Row row1, Row row2,
                                         int startCol, String groupName,
                                         List<String> headers) {
        if (headers.isEmpty()) {
            return startCol;
        }
        int endCol = startCol + headers.size() - 1;
        // 创建分组标题单元格（存在分组列就创建）
        Cell groupCell = row0.createCell(startCol);
        groupCell.setCellValue(groupName);
        // 处理多列情况
        if (headers.size() > 1) {
            // 横向合并分组标题
            sheet.addMergedRegion(new CellRangeAddress(0, 0, startCol, endCol));
            // 创建分组内的列头
            for (int i = 0; i < headers.size(); i++) {
                Cell headerCell = row1.createCell(startCol + i);
                Cell headerCell2 = row2.createCell(startCol + i);
                String header = headers.get(i).substring(0, 10);
                String headerName = headers.get(i);
                headerCell.setCellValue(headerName);
                headerCell2.setCellValue(header)
            }
        }
        // 处理单列情况
        else if (headers.size() == 1) {
            // 1. 分组标题显示在第一行（不合并）
            // 2. 列头显示在第二行
            // 创建列头单元格
            Cell headerCell = row1.createCell(startCol);
            String header = headers.get(0).substring(0, 10);
            String headerName = headers.get(0);
            headerCell.setCellValue(headerName);
            Cell headerCell2 = row2.createCell(startCol);
            headerCell2.setCellValue(header)
        }
        return endCol + 1;
    }

    // 创建分组列头（修复单列问题）
    private static int createGroupHeader(Sheet sheet, Row row0, Row row1, Row row2,
                                         int startCol, String groupName,
                                         List<String> headers, List<IPSDEDataExportItem> exportItems) {
        if (headers.isEmpty()) {
            return startCol;
        }
        int endCol = startCol + headers.size() - 1;
        // 创建分组标题单元格（存在分组列就创建）
        Cell groupCell = row0.createCell(startCol);
        groupCell.setCellValue(groupName);
        // 处理多列情况
        if (headers.size() > 1) {
            // 横向合并分组标题
            sheet.addMergedRegion(new CellRangeAddress(0, 0, startCol, endCol));
            // 创建分组内的列头
            for (int i = 0; i < headers.size(); i++) {
                Cell headerCell = row1.createCell(startCol + i);
                Cell headerCell2 = row2.createCell(startCol + i);
                String header = headers.get(i);
                String headerName = getHeaderName(header, exportItems)
                headerCell.setCellValue(headerName);
                headerCell2.setCellValue(header)
            }
        }
        // 处理单列情况
        else if (headers.size() == 1) {
            // 1. 分组标题显示在第一行（不合并）
            // 2. 列头显示在第二行
            // 创建列头单元格
            Cell headerCell = row1.createCell(startCol);
            String header = headers.get(0);
            String headerName = getHeaderName(header, exportItems)
            headerCell.setCellValue(headerName);
            Cell headerCell2 = row2.createCell(startCol);
            headerCell2.setCellValue(header)
        }
        return endCol + 1;
    }

    private static String getHeaderName(String header, List<IPSDEDataExportItem> exportItems) {
        String headerName = ""
        for (IPSDEDataExportItem item : exportItems) {
            if (item.getName().equals(header)) {
                headerName = item.getCaption()
            }
        }
        return headerName
    }

    // 填充数据行
    private void fillDataRows(Sheet sheet, List<IEntityDTO> data, List<String> propertyNames, int startRowIndex) {
        if (data == null || data.isEmpty()) return;
        for (int i = 0; i < data.size(); i++) {
            IEntityDTO entity = data.get(i);
            // 创建每行数据
            Row dataRow = sheet.createRow(startRowIndex + i);
            // 填充每个单元格
            for (int col = 0; col < propertyNames.size(); col++) {
                String propertyName = propertyNames.get(col);
                String propertyValue = entity.get(propertyName);
                Cell cell = dataRow.createCell(col);
                // 设置单元格值
                cell.setCellValue(propertyValue);
            }
        }
    }

    // 获取第三行的属性名列表
    private static List<String> getPropertyNames(Row headerRow) {
        List<String> propertyNames = new ArrayList<>();
        int lastCellNum = headerRow.getLastCellNum();

        for (int i = 0; i < lastCellNum; i++) {
            Cell cell = headerRow.getCell(i);
            if (cell != null) {
                propertyNames.add(cell.getStringCellValue());
            } else {
                propertyNames.add(""); // 空值处理
            }
        }
        return propertyNames;
    }

    private static void deleteRowSimple(Sheet sheet, int rowIndex) {
        int lastRowNum = sheet.getLastRowNum();
        // 验证行索引
        if (rowIndex < 0 || rowIndex > lastRowNum) {
            throw new IllegalArgumentException("行索引超出范围: " + rowIndex);
        }
        // 如果是最后一行，直接删除
        if (rowIndex == lastRowNum) {
            Row row = sheet.getRow(rowIndex);
            if (row != null) {
                sheet.removeRow(row);
            }
        }
        // 如果是中间行，向上移动后续行
        else {
            sheet.shiftRows(rowIndex + 1, lastRowNum, -1);
        }
    }

    private static List<String> generateDateWeekRange(String startDate, String endDate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE", Locale.CHINA);

        Date start = sdf.parse(startDate);
        Date end = sdf.parse(endDate);

        List<String> dateArray = new ArrayList<>();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);

        while (!calendar.getTime().after(end)) {
            String formattedDate = sdf.format(calendar.getTime()) + " " + dayOfWeekFormat.format(calendar.getTime());
            dateArray.add(formattedDate);
            calendar.add(Calendar.DATE, 1);
        }

        return dateArray;
    }

    private static List<String> generateDateRange(String startDate, String endDate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date start = sdf.parse(startDate);
        Date end = sdf.parse(endDate);

        List<String> dateArray = new ArrayList<>();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);

        while (!calendar.getTime().after(end)) {
            dateArray.add(sdf.format(calendar.getTime()));
            calendar.add(Calendar.DATE, 1);
        }

        return dateArray;
    }
}
```
### SubSysServiceAPIRuntime :id=UsrSFPlugin1026805041


```net.ibizsys.central.service.SubSysServiceAPIRuntime```

```groovy
null
```






