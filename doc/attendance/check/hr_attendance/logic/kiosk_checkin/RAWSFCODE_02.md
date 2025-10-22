<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def new_attendance = logic.param('new_attendance').getReal()
def emp = logic.param('emp').getReal()
def now = java.time.LocalDateTime.now()
def formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

new_attendance.set("check_in",now.format(formatter))
new_attendance.set("in_mode","kiosk")
new_attendance.set("employee_id",emp.get("id"))
new_attendance.set("employee_name",emp.get("name"))
new_attendance.set("overtime_status","to_approve")
```
