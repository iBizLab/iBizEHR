<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def new_attendance = logic.param('new_attendance').getReal()
def res = logic.param('hours_previously_today').getReal()
def hours_previously_today = res.get("hours_previously_today") as BigDecimal

new_attendance.set("hours_previously_today",hours_previously_today.setScale(2, BigDecimal.ROUND_HALF_UP))
new_attendance.set("hours_today",hours_previously_today.setScale(2, BigDecimal.ROUND_HALF_UP))
new_attendance.set("attendance_state","checked_in")

// 签到时间处理
def check_in = new_attendance.get("check_in")
def inputFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
def outputFormat = new java.text.SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒")
outputFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"))

// 转换并存储结果
def formattedCheckOut = outputFormat.format(inputFormat.parse(check_in.toString()))
new_attendance.set("check_in_display", formattedCheckOut)
```
