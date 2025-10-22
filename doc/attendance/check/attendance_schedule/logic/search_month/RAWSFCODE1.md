<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def result_list = logic.param('result_list').getReal()

// 获取当前日期
def currentDate = new Date()

// 设置日期格式
def dateFormat = new java.text.SimpleDateFormat("yyyy-MM")

// 获取当前年月字符串
def cur_month = dateFormat.format(currentDate)
def cur_month_map = new HashMap()
cur_month_map.put('name', cur_month)

// 获取当前日期的 Calendar 实例
def calendar = java.util.Calendar.getInstance()
calendar.setTime(currentDate)

// 获取前3个月
for (int i = 3; i >= 1; i--) {
    calendar.setTime(currentDate)
    calendar.add(Calendar.MONTH, -i)
    def month_map = new HashMap()
    month_map.put('name', dateFormat.format(calendar.getTime()))
    result_list.add(month_map)
}
result_list.add(cur_month_map)
// 获取后1个月
calendar.setTime(currentDate) // 重置为当前日期
calendar.add(Calendar.MONTH, 1)
def next_month = dateFormat.format(calendar.getTime())
def next_month_map = new HashMap()
next_month_map.put('name', next_month)
result_list.add(next_month_map)
```
