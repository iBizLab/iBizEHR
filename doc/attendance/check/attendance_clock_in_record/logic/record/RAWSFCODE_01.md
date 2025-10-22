<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
//获取`打卡记录`实体运行对象
def record_runtime = sys.dataentity('attendance_clock_in_record')
def record_filter = record_runtime.filter()
record_filter.all()

def person_range = _default.get("n_member_id_in")
if ( person_range != null && person_range != "") {
    def depts = []
    def persons = []
    person_range.each { item ->
        if (item.type == "dept") {
            depts.add(item.id)
        } else {
            persons.add(item.id)
        }
    }
    def deptStr = depts ? depts.join(",") : ""
    def personStr = persons ? persons.join(",") : ""
    if (deptStr != "" && personStr != "") {
        record_filter.and().or().in('dept_id', deptStr).in('id', personStr)
    } else if (deptStr != "" && personStr == "") {
        record_filter.in('dept_id', deptStr)
    } else {
        record_filter.in('member_id', personStr)
    }
}

def n_checkin_time_gtandeq = _default.get('n_checkin_time_gtandeq')
def n_checkin_time_ltandeq = _default.get('n_checkin_time_ltandeq')
if (n_checkin_time_gtandeq != null && n_checkin_time_ltandeq != null) {
    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') >= '"+ n_checkin_time_gtandeq +"'")
    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') <= '"+ n_checkin_time_ltandeq +"'")
}

def dataList = record_filter.select('');
if (dataList){
    def newRecords = logic.param('newRecords').getReal()
    dataList.groupBy { it.get("member_id") }.each { memberId, records ->
        println("输出memberId: " + memberId)
        println("输出records: " + records)
        if (!records) {
            return
        }

        def newRecord = sys.entity('attendance_clock_in_record')
        newRecord.set('id', records[0].get("member_id"))
        newRecord.set('member_id', records[0].get("member_id"))
        newRecord.set('dept_id', records[0].get("dept_id"))
        newRecord.set('dept_name', records[0].get("dept_name"))
        newRecord.set('member_name', records[0].get("member_name"))

        def map = new HashMap<String, List<String>>()
        def resultMap = new HashMap()

        // 遍历数据列表，根据日期分组
        records.each { item ->
            def dateKey = item.get("checkin_time").toString().substring(0, 10)
            // 按照年月日分组
            if (!map.containsKey(dateKey)) {
                map[dateKey] = []
            }
            map[dateKey].add(item)
        }

        // 处理分组后的数据
        map.each { entry ->
            def temp = [details: entry.value]
            resultMap.put(entry.key, temp)
        }
        println("输出map: " + map)
        println("输出resultMap: " + resultMap)
        newRecord.set('attendance_data', resultMap)
        newRecords.add(newRecord)
    }
}
```
