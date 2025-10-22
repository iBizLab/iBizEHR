<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def details = logic.param('details').getReal()

def sdf = new java.text.SimpleDateFormat("HH:mm:ss")

details.sort { a, b ->
    def timeA = java.time.LocalTime.parse(sdf.format(a.get('should_checkin_time')))
    def timeB = java.time.LocalTime.parse(sdf.format(b.get('should_checkin_time')))
    timeA <=> timeB
}
```
