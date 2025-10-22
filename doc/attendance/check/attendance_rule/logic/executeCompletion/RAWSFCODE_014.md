<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def newSchedules = logic.param('newSchedules').getReal()
def holidays = logic.param('calendarList').getReal()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")

newSchedules.each { attendance_schedule ->
    def checkin_date = sdf.format(attendance_schedule.checkin_date)
    def holiday = holidays.find { sdf.format(it.rq) == checkin_date }
    println("判断节假日attendance_schedule"+attendance_schedule)
    println("判断节假日"+holiday)
    if(holiday != null ){
        attendance_schedule.shift_data = null
        attendance_schedule.work_time = null
        attendance_schedule.workday = 0
    }
}

```
