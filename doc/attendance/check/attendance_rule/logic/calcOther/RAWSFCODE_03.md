<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def shifts = _default.get("shifts")
if(shifts){
    def shift = shifts.find { it.default_flag == 1 }
    if(shift){
        _default.set("default_shift",shift.get("id"))
    }
}


```
