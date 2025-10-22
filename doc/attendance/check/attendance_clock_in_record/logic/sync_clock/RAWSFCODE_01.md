<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def attendances = logic.param('attendances').getReal()
def _default = logic.param('Default').getReal()
def hr_attendanceRuntime = sys.dataentity('hr_attendance')
if(!attendances.isEmpty()){
    //取第一项进行更新
    def hr_attendance = attendances[0]
    hr_attendance.set('check_out',_default.get('checkin_time'))
    hr_attendanceRuntime.update(hr_attendance)

}else{
    def hr_attendance = sys.entity('hr_attendance')
    hr_attendance.set("id",net.ibizsys.runtime.util.KeyValueUtils.genUniqueId())
    hr_attendance.set('check_in',_default.get('checkin_time'))
    hr_attendance.set('employee_id',_default.get('member_id'))
    hr_attendanceRuntime.create(hr_attendance)
}
```
