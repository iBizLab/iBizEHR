<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def last = logic.param('last').getReal()
def now = java.time.LocalDateTime.now()
def formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

last.set("check_out", now.format(formatter))
last.set("out_mode", "kiosk")
last.set("overtime_status", "to_approve")
```
