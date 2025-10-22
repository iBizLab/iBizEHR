<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def temp = logic.param('temp').getReal()
def checkinDate = temp.get("checkin_date")
def activeShifts = logic.param('activeShifts').getReal()
def member_id = temp.get("member_id")
def rule_data = temp.get("rule_data")

if (rule_data != null && checkinDate != null && activeShifts != null) {
    Map<String, Object> ruleData = rule_data as Map<String, Object>
    def attendance_group_shifts = ruleData.get("attendance_group_shifts")
    def effect_time = ruleData.get("effect_time")
    def inversion_cycle = ruleData.get("inversion_cycle") as Integer

    // 解析日期工具
    def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
    def checkinCal = Calendar.getInstance()
    if (checkinDate instanceof String) {
        checkinCal.setTime(sdf.parse(checkinDate))
    } else {
        checkinCal.setTime(checkinDate)
    }

    // 计算周期天数
    int cycleDays = inversion_cycle * 7

    // 预处理工作日数据
    def validWorkdays = attendance_group_shifts.findAll { it.day_number <= cycleDays }
    def cycleMap = validWorkdays.collectEntries { [(it.day_number): it] }

    // 计算基准日（effect_time的最近前序周一）
    Calendar baseCal = Calendar.getInstance()
    baseCal.setTime(sdf.parse(effect_time))
    int daysToSubtract = (baseCal.get(Calendar.DAY_OF_WEEK) - 2 + 7) % 7
    if (daysToSubtract > 0) {
        baseCal.add(Calendar.DAY_OF_MONTH, -daysToSubtract)
    }
    Date baseDate = baseCal.getTime()

    // 计算日期偏移
    long offsetMillis = checkinCal.getTimeInMillis() - baseDate.getTime()
    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
    int dayInCycle = (offsetDays % cycleDays) + 1

    // 查找班次配置
    def workdayConfig = cycleMap[dayInCycle]
    if (workdayConfig) {
        def shift = activeShifts.find { it.id == workdayConfig.shift_id }
        if (shift) {
            def shiftData = shift.shift_data
            def workTime = shiftData?.work_times
            // 更新临时参数
            temp.set("shift_data", shiftData)
            temp.set("work_time", workTime)
            temp.set("workday", shiftData ? 1 : 0)
        }
    }
}
```
