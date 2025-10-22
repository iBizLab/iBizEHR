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