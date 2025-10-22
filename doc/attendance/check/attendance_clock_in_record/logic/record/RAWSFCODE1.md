<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def emp_temp = logic.param('emp_temp').getReal()

def n_checkin_time_gtandeq = _default.get('n_checkin_time_gtandeq')
def n_checkin_time_ltandeq = _default.get('n_checkin_time_ltandeq')

//获取`打卡记录`实体运行对象
def record_runtime = sys.dataentity('attendance_clock_in_record')
def record_filter = record_runtime.filter()
record_filter.all()
record_filter.eq('member_id', emp_temp.get("id"))

if (n_checkin_time_gtandeq != null && n_checkin_time_ltandeq != null) {
    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') >= '"+ n_checkin_time_gtandeq +"'")
    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') <= '"+ n_checkin_time_ltandeq +"'")
}
def dataList = record_filter.select('');

def map = new HashMap<String, List<String>>()
def resultMap = new HashMap()

// 遍历数据列表，根据日期分组
dataList.each { item ->
    def dateKey = item.get("checkin_time").toString().substring(0, 10)
    // 按照年月日分组
    if (!map.containsKey(dateKey)) {
        map[dateKey] = []
    }
    map[dateKey].add(item)
}

// 处理分组后的数据
map.each { entry ->
    // entry.value.each { it ->
    //     it.set("checkin_time", it.get("checkin_time") ? it.get("checkin_time").toString().substring(11, 19) : '')
    // }
    def temp = [details: entry.value]
    resultMap.put(entry.key, temp)
}

emp_temp.set('attendance_data', resultMap);
emp_temp.set('member_name', emp_temp.get("name"));
emp_temp.set('member_num',emp_temp.get("employee_num"));
```
