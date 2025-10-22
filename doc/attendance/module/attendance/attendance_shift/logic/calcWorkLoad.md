## 计算工时 <!-- {docsify-ignore-all} -->

   

### 逻辑处理脚本

```
var _scopes = data.scopes || [];
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
        // 转换时间段为分钟数
        const start = timeToMinutes(scope.start_base_time);
        const end = timeToMinutes(scope.end_base_time);
        // 累加工时
        if (start >= end) {
            totalWorkingMinutes += (24 * 60 - start + end);
        }else {
            totalWorkingMinutes += (end - start);
        }

}

// 转换为小时分钟格式
var hours = Math.floor(Math.abs(totalWorkingMinutes) / 60);
var minutes = totalWorkingMinutes % 60;
var workLoadText = hours + "小时" + minutes + "分钟";

data.work_load = workLoadText;
```
