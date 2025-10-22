<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def results = logic.param('results').getReal()
def groupResult = logic.param('groupResult').getReal()
def _default = logic.param('Default').getReal()

if (results) {
    // 按rule_id分组并构建新结构
    def grouped = results.groupBy { it.rule_id }
    grouped.each { ruleId, items ->
        def temp = sys.entity('Attendance_group_shift_member')
        def names = items.collect { it.get("name") }.findAll { it != null }
        temp.set("name", names.join('、'))
        temp.set("rule_id",ruleId )
        groupResult.add(temp)
    }
}

```
