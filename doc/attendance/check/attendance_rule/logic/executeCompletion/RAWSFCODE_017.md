<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def activeRule = logic.param('activeRule').getReal()
def rule_data = activeRule.get("rule_data")
def _default = logic.param('Default').getReal()

print "rule_data配置, ${rule_data}"


if (rule_data != null ) {
    Map<String, Object> ruleData = rule_data as Map<String, Object>;
    def workdays = ruleData.get("workdays")
    if (workdays) {
        _default.set("workdays",workdays)
    }
    _workdays = new ArrayList<>(workdays)

    
    def attendance_group_shifts = ruleData.get("attendance_group_shifts")
    if (attendance_group_shifts) {
        _default.set("attendance_group_shifts",attendance_group_shifts)
    }

    def effect_time = ruleData.get("effect_time")
    if(effect_time){
        _default.set("effect_time",effect_time)
    } 
       
    def rest = ruleData.get("rest")
    if(rest){
        _default.set("rest",rest)
    }
    def work = ruleData.get("work")
    if(work){
        _default.set("work",work)
    }  

    def inversion_cycle = ruleData.get("inversion_cycle")
    if(inversion_cycle){
        _default.set("inversion_cycle",inversion_cycle)
    }  
    
    def schedule_type = ruleData.get("schedule_type")
    if(schedule_type){
        _default.set("schedule_type",schedule_type)
    }
}
```
