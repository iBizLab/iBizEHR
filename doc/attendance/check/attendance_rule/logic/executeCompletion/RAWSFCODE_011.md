<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def activeShifts = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")
def inversion_days = _default.get("inversion_days")

def attendance_group_shift = logic.param('attendance_group_shift').getReal()
def workdays = attendance_group_shift.get("workdays")

def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
def endCal = Calendar.getInstance()
endCal.add(Calendar.MONTH, 1)
endCal.set(Calendar.DAY_OF_MONTH, endCal.getActualMaximum(Calendar.DAY_OF_MONTH))

def startCal = Calendar.getInstance()
startCal.setTime(effect_time)
startCal.set(Calendar.HOUR_OF_DAY, 0)
startCal.set(Calendar.MINUTE, 0)
startCal.set(Calendar.SECOND, 0)
startCal.set(Calendar.MILLISECOND, 0)

def cycleMap = [:]
workdays.eachWithIndex { workday, index ->
    if (index + 1 <= inversion_days) {
        cycleMap[(index + 1)] = workday
    }
}

Date baseDate = startCal.getTime()
while (!startCal.after(endCal)) {
    Date checkinDate = startCal.getTime()
    long offsetMillis = checkinDate.time - baseDate.time
    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
    int dayInCycle = (offsetDays % inversion_days) + 1

    def workdayConfig = cycleMap[dayInCycle]
    if (workdayConfig) {
        def shift = activeShifts.find { it.id == workdayConfig.shift_id }
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
