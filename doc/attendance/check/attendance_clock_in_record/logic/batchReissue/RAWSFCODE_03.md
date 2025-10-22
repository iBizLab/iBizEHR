<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def persons = logic.param('persons').getReal()
def _default = logic.param('Default').getReal()

persons.each { emp ->
    def record = sys.entity('attendance_clock_in_record')
    record.set("id",net.ibizsys.runtime.util.KeyValueUtils.genUniqueId())
    record.set("member_id",emp.id)
    record.set("member_name",emp.name)
    record.set("dept_name",emp.dept_name)
    record.set("dept_id",emp.dept_id)
    record.set("checkin_type","reissue")
    record.set("checkin_time",_default.get("checkin_time"))
    def recordRuntime = sys.dataentity('attendance_clock_in_record')
    recordRuntime.create(record)
}
```
