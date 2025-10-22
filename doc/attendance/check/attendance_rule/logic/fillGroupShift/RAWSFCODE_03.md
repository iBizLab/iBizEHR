<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()

def groupShifts = _default.get("group_shifts")

def group_num = _default.group_num ?: 2
def workdays = _default.get("workdays")

(1..group_num).each { i ->
    def new_group = sys.entity('attendance_group_shift')
    if (new_group) {
        new_group.schedule_type = _default.get("schedule_type")
        new_group.rule_id = _default.get("id")
        new_group.workdays = workdays
        new_group.all_company = false
        new_group.order_num = i
        groupShifts.add(new_group)
    }
}

```
