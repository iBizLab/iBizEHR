## 获取默认班次临时数据 <!-- {docsify-ignore-all} -->

   

### 逻辑处理脚本

```
console.log('获取默认班次临时数据:');

const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');
//获取默认shift
const list = service.local.getList(context);
const defaultShift = list.find(item =>item.default_flag == 1 );
context.shift = defaultShift.id
console.log("计算工时" + defaultShift);
var _scopes = defaultShift.scopes || [];
var totalWorkingMinutes = 0;

function timeToMinutes(timeStr) {
  const parts = timeStr.split(':');
  const hours = parseInt(parts[0], 10);
  const minutes = parseInt(parts[1], 10);
  return hours * 60 + minutes;
}

// 遍历现有 scope 计算总工时
for (var i = 0; i < _scopes.length; i++) {
  var scope = _scopes[i];
  // 转换时间为分钟数
  const start = timeToMinutes(scope.start_base_time);
  const end = timeToMinutes(scope.end_base_time);
  
  // 计算单个班次工时（分钟）
  totalWorkingMinutes += (end - start);
}

// 转换为小时分钟格式
var hours = Math.floor(Math.abs(totalWorkingMinutes) / 60);
var minutes = totalWorkingMinutes % 60;
var workLoadText = hours + "小时" + minutes + "分钟";

defaultShift.work_load = workLoadText;
return defaultShift;

```
