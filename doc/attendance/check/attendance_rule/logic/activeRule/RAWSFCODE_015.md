<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def newSchedules = logic.param('newSchedules').getReal()
def holidays = logic.param('lastRldata').getReal()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")

if (newSchedules && newSchedules.size() > 0 && holidays && holidays.size() > 0){
    newSchedules.each { schedule ->
        def checkin_date = sdf.format(schedule.checkin_date)
        def holiday = holidays.find { it.get("date") == checkin_date }
        if(holiday != null ){
            schedule.shift_data = null
            schedule.work_time = null
            schedule.workday = 0
        }
    }
}

```
