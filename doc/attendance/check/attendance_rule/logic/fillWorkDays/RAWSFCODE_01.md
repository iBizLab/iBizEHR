<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal();
def shifts = logic.param('shifts').getReal();
def defaultShift = shifts.find { it.default_flag == 1 }
if(defaultShift){
    def workdays = _default.get("workdays") ? _default.get("workdays") : [];
    def selection = _default.get("workday") ?_default.get("workday"):""

  // 获取已存在的 workday
    def existingDays = workdays.collect { it.name as Integer }

    def fillWorkdays = []
    (1..7).each { i ->  
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
    
    // // 为每个工作日填充工作时间
    // combinedWorkdays = combinedWorkdays.collect { workday ->
    //     def worktimeParts = []
 
    //     if (workday.shift_id != null && defaultShift?.scopes) {
    //         // 创建时间格式化工具 (HH:mm 格式)
    //         def timeFormat = new java.text.SimpleDateFormat("HH:mm")
    //         defaultShift.scopes.each { scope ->
    //             // 安全处理时间戳
    //             def start = scope.start_base_time ? timeFormat.format(scope.start_base_time) : ""
    //             def end = scope.end_base_time ? timeFormat.format(scope.end_base_time) : ""
    //             if (start && end) worktimeParts << "${start}-${end}"
    //         }
    //     }
 
    //     // 构建工作时间字符串
    //     workday.work_time = worktimeParts.isEmpty() ? "休息日" : worktimeParts.join('/')
    //     return workday
    // }
    
    _default.set("workdays", combinedWorkdays)
}
```
