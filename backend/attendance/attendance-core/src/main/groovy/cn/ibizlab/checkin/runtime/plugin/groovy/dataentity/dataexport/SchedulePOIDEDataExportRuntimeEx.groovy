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