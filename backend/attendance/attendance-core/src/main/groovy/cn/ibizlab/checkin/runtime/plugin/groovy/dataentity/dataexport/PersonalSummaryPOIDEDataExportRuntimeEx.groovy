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