<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal();
def shifts = logic.param('shifts').getReal();
def defaultShift = shifts.find { it.default_flag == 1 }
if(defaultShift){
    def work = _default.get("work") ?_default.get("work"):5;
    def rest = _default.get("rest") ?_default.get("rest"):2;
    def num = work+rest;

    def fillWorkdays = [];
    (1..num).each { i ->  
        def workday = [
            name  : "第"+i+"天",
            day_number : i,
            title : "工作/休息"
        ]
        fillWorkdays << workday
    }

    _default.set("workdays", fillWorkdays)
}
```
