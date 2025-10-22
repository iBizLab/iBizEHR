<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def activeShift = logic.param('activeShift').getReal()
def shift = activeShift.shift_data

// 计算总工时
int totalWorkLoad = 0
shift.scopes.each { workPeriod ->
    // 安全校验时间格式
    if (workPeriod?.start_base_time && workPeriod?.end_base_time) {
        def timeToMinutes = { time ->
        if (time instanceof java.sql.Timestamp) {
            String timeStr = time.toString().split(' ')[1]
            def parts = timeStr.split(':')[0..1]
            return (parts[0].toInteger() * 60) + parts[1].toInteger()
        }
        def parts = time.split(':')
        (parts[0].toInteger() * 60) + parts[1].toInteger()
    }
        def start = timeToMinutes(workPeriod.start_base_time)
        def end = timeToMinutes(workPeriod.end_base_time)
        if (start >= end) {
            totalWorkLoad += (24 * 60 - start + end);
        }else {
            totalWorkLoad += (end - start);
        }
    }
}

shift.work_load = totalWorkLoad
// shift.scopes = null
shift.set("work_times",shift.scopes)

```
