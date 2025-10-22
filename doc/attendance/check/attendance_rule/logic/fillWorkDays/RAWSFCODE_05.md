<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def workday = _default.get("workday")?: ""
def schedule_type = _default.get("schedule_type")
def workdays = _default.get("workdays")

//固定排班、灵活打卡>workday
if (workday == "" && 
    workdays != null&&
    ( schedule_type == "fixed" || schedule_type == "flexible")) 
{
        workday = workdays
                .findAll { it.shift_id != null } 
                .sort { a, b -> a.day_number <=> b.day_number }
                .collect { it.day_number } 
                .join(',')

        _default.set("workday",workday)    
}

//计算工作日week1
def week1 = _default.get("week1")?: ""
if (week1 == ""&& workdays != null) {
    if(schedule_type == "alternate_week" ){
        week1 = workdays
                .findAll { it.shift_id != null && it.day_number < 8} 
                .sort { a, b -> a.day_number <=> b.day_number }
                .collect { it.day_number } 
                .join(',')
    }
    if(schedule_type == "class_inversion") {
         week1 = workdays
                .findAll { it.id != null && it.day_number < 8} 
                .sort { a, b -> a.day_number <=> b.day_number }
                .collect { it.day_number } 
                .join(',')
    }
    _default.set("week1",week1)    
}
//计算工作日week2
def week2 = _default.get("week2")?: ""
if (week2 == ""&& workdays != null) {
    if(schedule_type == "alternate_week" ){
        week2 = workdays
                .findAll { it.shift_id != null && 7<it.day_number && it.day_number < 15} 
                .sort { a, b -> a.day_number <=> b.day_number }
                .collect { it.day_number } 
                .join(',')
    }
    if(schedule_type == "class_inversion") {
         week2 = workdays
                .findAll { it.id != null && 7<it.day_number && it.day_number < 15} 
                .sort { a, b -> a.day_number <=> b.day_number }
                .collect { it.day_number } 
                .join(',')
    }
    _default.set("week2",week2)    

}

//计算工作日week3
def week3 = _default.get("week3")?: ""
if (week3 == "" && schedule_type == "class_inversion" && workdays != null) {
    week3 = workdays
        .findAll { it.id != null && 14<it.day_number && it.day_number < 22} 
        .sort { a, b -> a.day_number <=> b.day_number }
        .collect { it.day_number } 
        .join(',')
    _default.set("week3",week3) 
}
//计算工作日week4
def week4 = _default.get("week4")?: ""
if (week4 == "" && schedule_type == "class_inversion"&& workdays != null) {
    week4 = workdays
        .findAll { it.id != null && 21<it.day_number && it.day_number < 29} 
        .sort { a, b -> a.day_number <=> b.day_number }
        .collect { it.day_number } 
        .join(',')
    _default.set("week4",week4) 

}



```
