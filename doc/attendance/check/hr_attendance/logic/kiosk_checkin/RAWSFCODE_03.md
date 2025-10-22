<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def last = logic.param('last').getReal()
def res = logic.param('hours_previously_today').getReal()
def hours_previously_today = res.get("hours_previously_today") as BigDecimal

def worked_hours = last.get("worked_hours") as BigDecimal

// 计算并保留两位小数
def hours_today = (hours_previously_today + worked_hours).setScale(2, BigDecimal.ROUND_HALF_UP)

last.set("hours_today", hours_today)
last.set("hours_previously_today", hours_previously_today.setScale(2, BigDecimal.ROUND_HALF_UP))
last.set("attendance_state", "checked_out")

// 签退时间处理
def check_out = last.get("check_out")
def inputFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
def outputFormat = new java.text.SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒")
outputFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"))

// 转换并存储结果
def formattedCheckOut = outputFormat.format(inputFormat.parse(check_out.toString()))
last.set("check_out_display", formattedCheckOut)
```
