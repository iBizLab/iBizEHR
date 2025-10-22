<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
def activeShifts  = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")
def workdays = _default.get("workdays")
//大小周
def biweekly_cycle = _default.get("biweekly_cycle")

// 获取当前日期
def now = new Date()
def calendar = Calendar.getInstance()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
calendar.setTime(now)

 //限制生成区间
def limitTime = _default.get("limitTime")
def limitCal = Calendar.getInstance()
if(limitTime ){
    if (limitTime instanceof String) {
        limitCal.setTime(sdf.parse(limitTime))
    } else {
        limitCal.setTime(limitTime)
    }
}
 
// 跳转到下个月
calendar.add(Calendar.MONTH, 1)
// 设置为下个月最后一天
calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
    
// 排班结束日期
def endDate = sdf.format(calendar.getTime())

// 计算当天排班班次
def generateShiftData = { Date checkinDate, List workdaysParam, List activeShiftsParam ->
    // 1. 确定当前日期是周几（1-7对应周一到周日）
    def calendarInner = Calendar.getInstance()
    calendarInner.setTime(checkinDate)
    int dayOfWeek = calendarInner.get(Calendar.DAY_OF_WEEK)
    int dayNumber = (dayOfWeek == Calendar.SUNDAY) ? 7 : dayOfWeek - 1

    // 新增大/小周计算逻辑
    // 计算生效日期所在周的第一天（周一）
    def effectCal = Calendar.getInstance()
    effectCal.setTime(effect_time)
    effectCal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)

    // 计算检查日期所在周的第一天（周一）
    def checkinCal = Calendar.getInstance()
    checkinCal.setTime(checkinDate)
    checkinCal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)

    // 计算周数差（生效日期所在周为第1周）
    long diffMillis = checkinCal.getTimeInMillis() - effectCal.getTimeInMillis()
    int weekNumber = (int)(diffMillis / (7 * 24 * 60 * 60 * 1000)) + 1

    // 判断当前是大周还是小周
    boolean isBigWeek = false
    if (biweekly_cycle == "big_small") {
    isBigWeek = (weekNumber % 2 == 1)  // 奇数周为大周
} else if (biweekly_cycle == "small_big") {
    isBigWeek = (weekNumber % 2 == 0)  // 偶数周为大周
}

// 调整day_number（小周时+7）
int adjustedDayNumber = isBigWeek ? dayNumber : dayNumber + 7

// 2. 查找匹配的工作日配置（直接匹配调整后的day_number）
def workdayConfig = workdaysParam.find {
    it.day_number == adjustedDayNumber
}

// 3. 未找到工作日配置时返回空班次
if (!workdayConfig || !workdayConfig.shift_id) {
    return null
}

// 4. 查找对应的班次信息
def shift = activeShiftsParam.find { it.id == workdayConfig.shift_id }

// 5. 未找到班次时返回空班次
if (!shift || !shift.shift_data) {
    return null
}

// 6. 返回班次数据
return shift.shift_data
}

// 排班生成
def startCal = Calendar.getInstance()
startCal.setTime(effect_time)
    
// 解析结束日期
def endCal = Calendar.getInstance()
endCal.setTime(sdf.parse(endDate))

// 遍历日期区间
while (!startCal.after(endCal)) {
    if(limitTime && startCal.before(limitCal)){
        startCal.add(Calendar.DAY_OF_MONTH, 1)
        continue 
    }
    def checkinDate = startCal.getTime()
    def shift_data = generateShiftData(checkinDate, workdays, activeShifts)
    def workTime = shift_data?.get("work_times") ?: null

    def schedule = sys.entity('attendance_schedule')
    schedule.rule_data = activeRule.get("rule_data")
    schedule.rule_name = activeRule.get("name")
    schedule.rule_id = activeRule.get("id")
    schedule.checkin_date =  sdf.format(checkinDate)
    if(shift_data){
        shift_data.name = "白班"
    }
    schedule.shift_data = shift_data
    schedule.work_time = workTime
    schedule.workday = shift_data != null ? 1 : 0 
    // schedule.id = UUID.randomUUID().toString() 

    newSchedules.add(schedule)
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
