<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _shifts = logic.param('shifts').getReal()

// 生成白班和晚班配置
def createShift = { name, startTime, endTime,order_value ->
    return [
        attendance_ratio: 1.0,
        order_value: order_value,
        working_number: 1,
        schedule_type: "class_inversion",
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
                order_value:1,
                next_tag: name=="晚班"?"0,1":null
            ]
        ],
        default_flag: 0,
        public_flag: 0,
        name: name,
        id:  java.util.UUID.randomUUID()
    ]
}

def dayShift = createShift("白班", "09:00:00", "20:00:00",1)
def nightShift = createShift("晚班", "20:00:00", "08:00:00",2) 

_shifts << dayShift
_shifts << nightShift

def _default = logic.param('Default').getReal();
_default.set("shifts",_shifts);

```
