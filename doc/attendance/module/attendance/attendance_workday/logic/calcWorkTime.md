## 计算上下班时间 <!-- {docsify-ignore-all} -->

   

### 逻辑处理脚本

```
const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
const shiftService = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');
var shift = await shiftService.local.get(context, data.shift_id);
var worktimeParts = [];
if (shift != null && shift.scopes!=null) {
    var scopes = shift.scopes
    scopes.forEach(scope => {
        var start = scope.start_base_time.substring(0, 5);
        if(scope.next_tag === "1,0"||scope.next_tag === "1,1"){
            start = "次日" + start;
        }
        var end = scope.end_base_time.substring(0, 5);
        if(scope.next_tag === "0,1"||scope.next_tag === "1,1"){
            end = "次日" + end;
        }
        worktimeParts.push(start + '-' + end);
    })
}
data.work_time = worktimeParts.length == 0 ? "休息日" : worktimeParts.join('/');
```
