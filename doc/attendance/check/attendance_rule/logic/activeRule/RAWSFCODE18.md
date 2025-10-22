<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def curActiveMember = logic.param('curActiveMember').getReal()
def members = logic.param('members').getReal()
def changes = logic.param('changes').getReal()

def ruleIdSet = members.collect { member ->
    curActiveMember.findResult(null) { it.get("member_id") == member.user_id ? it.get("rule_id") : null }
}.findAll { it != null }.toSet()

ruleIdSet.each { ruleId ->
    def newRule = sys.entity('attendance_activate_rule')
    newRule.set('id', ruleId)
    changes.add(newRule)
}
```
