<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal();
def shifts = logic.param('shifts').getReal();
def same_restday = _default.same_restday;
if(shifts){
    def title = shifts.collect { it.name }.join('/')
    def fillWorkdays = []
    //休息日相同
    if(same_restday ==1){
        def workdays = _default.get("workdays") ?: []
        def week1 = _default.get("week1") ?: ""
        def week2 = _default.get("week2") ?: ""
        def week3 = _default.get("week3") ?: ""
        def week4 = _default.get("week4") ?: ""
        def selection = [week1, week2, week3, week4].join(',').split(',')  

        // 获取已存在的 workday
        def existingDays = workdays.collect { it.day_number }

        (1..28).each { i ->
            if (!existingDays.contains(i)) {
                def workday = [
                    name: i.toString(),
                    day_number: i,
                    title: selection.contains(i.toString()) ? title : "休息"  
                ]
                fillWorkdays << workday
            }else{
                // 为已存在的workday填充title
                def existingWorkday = workdays.find { it.day_number == i }
                if (existingWorkday) {
                    existingWorkday.title = title
                }
        }

        // 合并后排序
        def combinedWorkdays = (workdays + fillWorkdays).sort { 
            it.day_number 
        }    
        _default.set("workdays", combinedWorkdays)
    }
    }
    //休息日不同
    if(same_restday ==0 ){
        title = title+"/休息"  
        if( _default.get("workdays") == null){
            def inversion_days = _default.inversion_days
            if(inversion_days){
                (1..inversion_days).each { i ->
                    def workday = [
                        name  : "第"+i+"天",
                        day_number: i,
                        title: title,
                        rule_id : _default.id
                    ]
                    fillWorkdays << workday
                }
                _default.set("workdays", fillWorkdays)
        }
        }else{
            _default.get("workdays").each{ w ->
                w.title =title
            }           
        }
    }
}
```
