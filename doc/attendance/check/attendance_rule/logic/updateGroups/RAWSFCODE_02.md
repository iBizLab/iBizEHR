<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()

def groupShifts = _default.get("attendance_group_shifts")

def inversion_cycle = _default.get("inversion_cycle")
def workdays = _default.get("workdays")

def week1 = _default.get("week1")?:""
def week2 = _default.get("week2")?:""
def week3 = _default.get("week3")?:""
def week4 = _default.get("week4")?:""

def selection = week1
// 根据 inversion_cycle 计算阈值并筛选工作日
def filteredWorkdays = []
if (inversion_cycle == 1) {
    filteredWorkdays = workdays.findAll { it.day_number < 8 }
} else if (inversion_cycle == 2) {
    filteredWorkdays = workdays.findAll { it.day_number < 15 }
    selection = selection + week2
} else if (inversion_cycle == 3) {
    filteredWorkdays = workdays.findAll { it.day_number < 22 }
    selection = selection + week2 + week3
} else if (inversion_cycle == 4) {
    selection = selection + week2 + week3 + week4
    filteredWorkdays = workdays 
}

final WEEK_DAYS = ['周一', '周二', '周三', '周四', '周五', '周六', '周日']

filteredWorkdays.each { day ->
        def offset = (day.day_number - 8 + 7) % 7
        day.set("name",WEEK_DAYS[offset])
        day.set("is_work", selection.contains(day.day_number.toString())?1:0)
}

groupShifts.forEach { i ->
    i.workdays = filteredWorkdays
}
```
