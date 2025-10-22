<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def attendances = logic.param('attendances').getReal()

if (_default){
    _default.each { item ->
        if (item != null) {
            def attendances_data = item.any()
            def attendance_runtime = sys.dataentity('hr_attendance')
            def _attendance =attendance_runtime.createEntity(attendances_data)
            attendances.add(_attendance)
        }
    }

}
```
