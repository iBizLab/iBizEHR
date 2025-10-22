<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var shifts = logic.getParam('shifts');
var _default = logic.getParam('Default');

var lastShifts = [];

for (var i = 0; i < shifts.getLength(); i++) {
  var shift = shifts.get(i);
  var work_times = [];
  if(shift.get("scopes")!=null){
    var scopes = shift.get("scopes");
    for (var a =0; a<scopes.getLength(); a++) {
      var scope = scopes.get(a);
      var work_time ={
        start : scope.get("start_base_time"),
        end: scope.get("end_base_time")

      }
      work_times.push(work_time);
    }
    var lastshift = {
      id : i+1,
      name : shift.name,
      work_times : work_times,
      rule_id : _default.get("id")
    }
    lastShifts.push(lastshift);
  }

}

_default.set("work_time",lastShifts[0].work_times)

_default.set("shifts",lastShifts)

```
