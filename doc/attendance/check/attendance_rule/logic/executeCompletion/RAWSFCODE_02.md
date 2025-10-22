<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
def activeShifts  = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("fill_time")
def workdays =  logic.param('workdays').getReal()

// 获取当前日期
def now = new Date()
def calendar = Calendar.getInstance()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
calendar.setTime(now)
 
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

    // 2. 查找匹配的工作日配置
    def workdayConfig = workdaysParam.find { it.day_number == dayNumber }
    
    // 3. 未找到工作日配置时返回空班次
    if (!workdayConfig || !workdayConfig.shift_id) {
        // print "未找到工作日配置时返回空班次, ${workdayConfig}!"
        return null
    }

    // 4. 查找对应的班次信息
    def shift = activeShiftsParam.find { it.id == workdayConfig.shift_id }
    
    // 5. 未找到班次时返回空班次
    if (!shift || !shift.shift_data) {
        // print "未找到班次时返回空班次, ${shift}!"
        return null 
    }

    // 6. 返回班次数据
    // print "返回班次数据, ${shift}!"
    return shift.shift_data
}

// 排班生成
def startCal = Calendar.getInstance()
if (effect_time instanceof String) {
    startCal.setTime(sdf.parse(effect_time))
} else {
    startCal.setTime(effect_time)
}       
// 解析结束日期
def endCal = Calendar.getInstance()
endCal.setTime(sdf.parse(endDate))

// 遍历日期区间
while (!startCal.after(endCal)) {
    def checkinDate = startCal.getTime()
    def shift_data = generateShiftData(checkinDate, workdays, activeShifts)
    def workTime = shift_data?.work_times ?: null

    def attendance_schedule = sys.entity('attendance_schedule')
    attendance_schedule.rule_data = activeRule.get("rule_data")
    attendance_schedule.rule_name = activeRule.get("name")
    attendance_schedule.rule_id = activeRule.get("id")
    attendance_schedule.checkin_date =  sdf.format(checkinDate)
    attendance_schedule.shift_data = shift_data
    attendance_schedule.work_time = workTime
    attendance_schedule.workday = shift_data != null ? 1 : 0 
    // attendance_schedule.id = UUID.randomUUID().toString() 

    newSchedules.add(attendance_schedule)
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
