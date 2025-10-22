<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _filter = logic.param('Filter').getReal()

def dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd")

def _default = logic.param('Default').getReal()
def rqStr = _default.get("rq")

def yearMonthStr = rqStr.substring(0, 7)
_default.set("rq", yearMonthStr)
def rqDateFormat = new java.text.SimpleDateFormat("yyyy-MM")
def rqDate = rqDateFormat.parse(yearMonthStr)

Calendar cal = Calendar.getInstance()
cal.setTime(rqDate)

// 设置当月第一天
cal.set(Calendar.DAY_OF_MONTH, 1)
Date startOfMonth = cal.getTime()

// 设置下个月第一天并回退一天得到当月最后一天
cal.add(Calendar.MONTH, 1)
cal.set(Calendar.DAY_OF_MONTH, 1)
cal.add(Calendar.DAY_OF_MONTH, -1)
Date endOfMonth = cal.getTime()

// 设置过滤条件（格式化为yyyy-MM-dd）
_default.set("N_DATE_FROM_LTANDEQ", dateFormat.format(endOfMonth))
_default.set("N_DATE_TO_GTANDEQ", dateFormat.format(startOfMonth))
_default.set("startOfMonth",startOfMonth)
```
