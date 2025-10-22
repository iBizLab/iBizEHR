<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("fill_time")

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

    def attendance_schedule = sys.entity('attendance_schedule')
    attendance_schedule.rule_name = activeRule.get("name")
    attendance_schedule.rule_id = activeRule.get("id")
    attendance_schedule.checkin_date =  sdf.format(checkinDate)
    attendance_schedule.workday = 0

    newSchedules.add(attendance_schedule)
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
