<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
Calendar cal = Calendar.getInstance()
int currentYear = cal.get(Calendar.YEAR)
def dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd")

// 设置开始日期为当年第一天
cal.set(currentYear, Calendar.JANUARY, 1, 0, 0, 0)
cal.set(Calendar.MILLISECOND, 0)
Date startOfYear = cal.getTime()

// 设置结束日期为当年最后一天
cal.set(currentYear, Calendar.DECEMBER, 31, 23, 59, 59)
cal.set(Calendar.MILLISECOND, 999)
Date endOfYear = cal.getTime()

// 设置过滤条件（格式化为yyyy-MM-dd）

_default.set("N_DATE_FROM_LTANDEQ", dateFormat.format(endOfYear))
_default.set("N_DATE_TO_GTANDEQ", dateFormat.format(startOfYear))
```
