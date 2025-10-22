<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def schedule_type = _default.get('schedule_type')
def group_num = _default.get('group_num')
def group_shifts = _default.get('group_shifts')
if (group_num == null && (schedule_type == "class_inversion" || schedule_type == "work_rest") && group_shifts != null ) {
    _default.set("group_num",group_shifts.size())
}
```
