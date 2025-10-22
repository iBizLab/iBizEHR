<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def curRldata = logic.param('curRldata').getReal()

def lastRldata = logic.param('lastRldata').getReal()

if(curRldata){
    // 添加日期格式化工具
    def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")

    // 获取当前年份的第一天和最后一天
    def currentYear = java.time.Year.now().value
    def firstDayOfYear = java.time.LocalDate.of(currentYear, 1, 1)
    def lastDayOfYear = java.time.LocalDate.of(currentYear, 12, 31)

    curRldata.each{ i ->
        // 解析日期范围
        def startDate = i.get("date_from")
        def endDate = i.get("date_to")

        if (startDate && endDate) {
            // 日期范围截断逻辑
            if(startDate && !startDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate().isAfter(firstDayOfYear)){
                startDate = java.sql.Timestamp.valueOf(firstDayOfYear.atStartOfDay())
            }
            if(endDate && endDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate().isAfter(lastDayOfYear)){
                endDate = java.sql.Timestamp.valueOf(lastDayOfYear.atTime(23,59,59))
            }

            // 将Timestamp转换为LocalDate
            java.time.LocalDate start = startDate.toInstant()
                .atZone(java.time.ZoneId.systemDefault())
                .toLocalDate()

            java.time.LocalDate end = endDate.toInstant()
                .atZone(java.time.ZoneId.systemDefault())
                .toLocalDate()

            // 使用循环逐日增加
            while (!start.isAfter(end)) {
                def restday = sys.entity('resource_calendar_leaves')
                restday.set("date", sdf.format(Date.from(start.atStartOfDay(java.time.ZoneId.systemDefault()).toInstant())))
                restday.set("name", i.get("name"))
                lastRldata.add(restday)
                // 增加一天
                start = start.plusDays(1)
            }
        }
    }
}
```
