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