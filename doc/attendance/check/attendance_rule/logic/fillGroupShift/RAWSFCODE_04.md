<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()

def groupShifts = _default.get("group_shifts")

def group_num = _default.group_num ?: 2

def inversion_cycle = _default.get("inversion_cycle")
def workdays = _default.get("workdays")

def week1 = _default.get("week1")?:""
def week2 = _default.get("week2")?:""
def week3 = _default.get("week3")?:""
def week4 = _default.get("week4")?:""

// 将week字符串转换为数字集合
def getWeekSet = { weekStr ->
    weekStr?.tokenize(',')*.toInteger() as Set
}

def weekSet1 = getWeekSet(week1)
def weekSet2 = getWeekSet(week2)
def weekSet3 = getWeekSet(week3)
def weekSet4 = getWeekSet(week4)

// 根据 inversion_cycle 计算阈值并筛选工作日
def filteredWorkdays = []
Set<Integer> selectionSet = []
switch (inversion_cycle) {
    case 1:
        selectionSet.addAll(weekSet1)
        filteredWorkdays = workdays.findAll { it.day_number < 8 }
        break
    case 2:
        selectionSet.addAll(weekSet1 + weekSet2)
        filteredWorkdays = workdays.findAll { it.day_number < 15 }
        break
    case 3:
        selectionSet.addAll(weekSet1 + weekSet2 + weekSet3)
        filteredWorkdays = workdays.findAll { it.day_number < 22 }

        break
    case 4:
        selectionSet.addAll(weekSet1 + weekSet2 + weekSet3 + weekSet4)
        filteredWorkdays = workdays 
        break
}
filteredWorkdays = filteredWorkdays.sort { a, b -> a.day_number <=> b.day_number }

final WEEK_DAYS = ['周一', '周二', '周三', '周四', '周五', '周六', '周日']

filteredWorkdays.each { day ->
    def offset = (day.day_number - 8 + 7) % 7
    day.set("name", WEEK_DAYS[offset])
    day.set("is_work", selectionSet.contains(day.day_number) ? 1 : 0)
}

(1..group_num).each { i ->
    def new_group = sys.entity('attendance_group_shift')
    if (new_group) {
        new_group.schedule_type = _default.get("schedule_type")
        new_group.rule_id = _default.get("id")
        new_group.workdays = filteredWorkdays
        new_group.all_company = false
        new_group.order_num = i
        groupShifts.add(new_group)
    }
}
```
