<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def now = new Date()

// 获取下个月第一天
def calendar = Calendar.getInstance()
calendar.setTime(now)
calendar.add(Calendar.MONTH, 1)  
calendar.set(Calendar.DAY_OF_MONTH, 1)
calendar.set(Calendar.HOUR_OF_DAY, 0)
calendar.set(Calendar.MINUTE, 0)
calendar.set(Calendar.SECOND, 0)
calendar.set(Calendar.MILLISECOND, 0)

def nextMonthFirstDay = calendar.getTime()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
 _default.set("fill_time",sdf.format(nextMonthFirstDay))

```
