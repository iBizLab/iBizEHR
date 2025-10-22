<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var _default = logic.getParam('Default');
var shifts = _default.get("shifts");
if(shifts!=null && shifts.size()>0){
    var shift = shifts.get(0);
    var scopes = shift.get("scopes")
    var scope = scopes.get(0);
    _default.set("free_start",scope.get("start_base_time"))
    _default.set("free_end",scope.get("end_base_time"))
}

```
