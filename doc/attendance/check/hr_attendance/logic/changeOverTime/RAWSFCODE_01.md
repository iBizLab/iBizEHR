<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def check_in = _default.get("check_in")
def startOfDayFormat = new java.text.SimpleDateFormat("yyyy-MM-dd 00:00:00")
def startOfDay = startOfDayFormat.format(check_in) 
_default.set("dateOnly", startOfDay)
if(!_default.get("overtime_hours")){
    _default.set("overtime_hours", 0)
}
```
