<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def activeShifts = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")
def fill_time = _default.get("fill_time")

def rest = _default.get("rest")
def work = _default.get("work")

def attendance_group_shift = logic.param('attendance_group_shift').getReal()
def workdays = attendance_group_shift.get("workdays")

def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
def endCal = Calendar.getInstance()
endCal.add(Calendar.MONTH, 1)
endCal.set(Calendar.DAY_OF_MONTH, endCal.getActualMaximum(Calendar.DAY_OF_MONTH))

// 修改点1：以fill_time作为排班生成起点（零点时间）
def startCal = Calendar.getInstance()
if (fill_time instanceof String) {
    startCal.setTime(sdf.parse(fill_time))
} else {
    startCal.setTime(fill_time)
}
startCal.set(Calendar.HOUR_OF_DAY, 0)
startCal.set(Calendar.MINUTE, 0)
startCal.set(Calendar.SECOND, 0)
startCal.set(Calendar.MILLISECOND, 0)

// 保持effect_time作为周期计算基准

Date baseDate = effect_time
Calendar effectCal = Calendar.getInstance()
if (effect_time instanceof String) {
    effectCal.setTime(sdf.parse(effect_time))
} else {
    effectCal.setTime(effect_time)
}

// 计算fill_time相对于effect_time的初始偏移天数
long effectMillis = effectCal.getTimeInMillis()
long fillMillis = startCal.getTimeInMillis()
int initialOffsetDays = (fillMillis - effectMillis) / (24 * 60 * 60 * 1000)

// 构建天数循环映射（保持原逻辑）
def workdayNum = rest + work
def cycleMap = [:]
workdays.eachWithIndex { workday, index ->
    if (index + 1 <= workdayNum) {
        cycleMap[(index + 1)] = workday
    }
}

// 生成排班数据
while (!startCal.after(endCal)) {
    Date checkinDate = startCal.getTime()
    
    // 计算相对于effect_time的偏移天数（核心修改）
    long offsetMillis = checkinDate.time - effectMillis
    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
    int dayInCycle = (offsetDays % workdayNum) + 1  // 周期位置计算

    def workdayConfig = cycleMap[dayInCycle]
    if (workdayConfig) {
        def shift = workdayConfig.get("is_work") == 1 ? activeShifts[0] : null
        def shiftData = shift?.shift_data ?: [:]
        def workTime = shiftData?.work_times ?: []

        def attendance_schedule = sys.entity('attendance_schedule')
        attendance_schedule.rule_data = activeRule.rule_data
        attendance_schedule.rule_name = activeRule.name
        attendance_schedule.rule_id = activeRule.id
        attendance_schedule.checkin_date = sdf.format(checkinDate)
        attendance_schedule.shift_data = shiftData
        attendance_schedule.work_time = workTime
        attendance_schedule.workday = shiftData ? 1 : 0
        newSchedules.add(attendance_schedule)
    }
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
