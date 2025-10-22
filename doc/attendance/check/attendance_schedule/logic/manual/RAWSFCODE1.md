<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def attendance_schedule_runtime = sys.dataentity('attendance_schedule')

if(_default != null){
    _default.each { it ->
        def attendance_schedule = attendance_schedule_runtime.entity()
        def attendance_schedule_id = it.get("id")
        def workday = it.get("workday")
        if(attendance_schedule_id != null){
            attendance_schedule.set("id", attendance_schedule_id)
            attendance_schedule.set("manual", 1)
            attendance_schedule.set("workday", workday)
            def choose_shift = it.get("choose_shift")
            if(choose_shift != null){
                def shift_data = choose_shift.get("shift_data")
                def work_time = choose_shift.get("work_times")?choose_shift.get("work_times"):shift_data.get("work_times")
                attendance_schedule.set("work_time", work_time)
                attendance_schedule.set("shift_data", shift_data)
            }
            attendance_schedule_runtime.update(attendance_schedule)
        }
    }
}


```
