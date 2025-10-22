<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _shifts = logic.param('shifts').getReal()

def createShift = { name, startTime, endTime ->
    return [
        attendance_ratio: 1.0,
        working_number: 1,
        schedule_type: "manual",
        order_value:1,
        scopes: [
            [
                early_for_absenteeism: 60,
                early_for_early: 0,
                latest_checkout: 480,
                earliest_checkin: 60,
                end_base_time: endTime,
                late_for_absenteeism: 60,
                late_for_late: 0,
                shift_name: name,
                start_base_time: startTime,
                order_value:1
            ]
        ],
        default_flag: 0,
        public_flag: 0,
        name: name,
        id:  java.util.UUID.randomUUID()
    ]
}

def shift1 = createShift("班次1", "08:00:00", "17:00:00")

_shifts << shift1

def _default = logic.param('Default').getReal();
_default.set("shifts",_shifts);
_default.set("shift_num",1);


```
