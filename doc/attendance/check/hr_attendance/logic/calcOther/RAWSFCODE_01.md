<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def overtime_status = _default.get("overtime_status")
if(_default.get("check_out")){
    if(overtime_status == "to_approve"){
        _default.set("validated_overtime_hours",_default.get("overtime_hours"))
    }
    if(overtime_status == "refused"){
        _default.set("validated_overtime_hours",0)
    }
    def expected_hours = _default.get("worked_hours")?:0 - _default.get("overtime_hours")?:0
    _default.set("expected_hours",expected_hours)
}else {
    _default.set("validated_overtime_hours",0)
    _default.set("expected_hours",0)
}

```
