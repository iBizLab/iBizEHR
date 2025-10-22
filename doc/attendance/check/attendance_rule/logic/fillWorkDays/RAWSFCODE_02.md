<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal();
def shifts = logic.param('shifts').getReal();
def defaultShift = shifts.find { it.default_flag == 1 }
if(defaultShift){
    def workdays = _default.get("workdays") ? _default.get("workdays") : [];
    def big_week = _default.get("week1") ?_default.get("week1"):"";
    def small_week = _default.get("week2") ?_default.get("week2"):"";
    def selection = big_week+","+small_week

  // 获取已存在的 workday
    def existingDays = workdays.collect { it.day_number }

    def fillWorkdays = []
    (1..14).each { i ->  
        if (!existingDays.contains(i)) {
            def workday = [
                name  : i.toString(),
                day_number : i,
                shift_id : selection.contains(i.toString())?defaultShift.id:null
        ]
            fillWorkdays << workday
        }
    }

    // 合并后排序
    def combinedWorkdays = (workdays + fillWorkdays).sort { 
        it.day_number 
    }    
    _default.set("workdays", combinedWorkdays)
}
```
