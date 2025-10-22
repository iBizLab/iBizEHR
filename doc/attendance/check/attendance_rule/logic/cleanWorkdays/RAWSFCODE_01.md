<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def schedule_type = _default.schedule_type ;
//N班倒
if(schedule_type == "class_inversion"){
    _default.workday = "";
    def inversion_cycle = _default.inversion_cycle ;

    if(inversion_cycle== 1){
        _default.week2 = "" ;
        _default.week3 = "" ;
        _default.week4 = "" ;
    }
    if(inversion_cycle== 2){
        _default.week3 = "" ;
        _default.week4 = "" ;
    }
    if(inversion_cycle== 3){
        _default.week4 = "" ;
    }
}

//固定排班/灵活打卡
if(schedule_type == "flexible" || schedule_type == "fixed"){
    _default.week1 = "" ;
    _default.week2 = "" ;
    _default.week3 = "" ;
    _default.week4 = "" ;
}

//大小周
if(schedule_type == "alternate_week" ){
    _default.workday = "";
    _default.week3 = "" ;
    _default.week4 = "" ;
}

def workdays = logic.param('workdays').getReal()
def lastDays = logic.param('lastDays').getReal()

def selection = [_default.week1, _default.week2, _default.week3, _default.week4,_default.workday].join(',').split(',')

//遍历workdays
for(workday in workdays){
    if(selection.contains(workday.get("name"))){
        //附加到数组
        lastDays.add(workday)
    }
}
```
