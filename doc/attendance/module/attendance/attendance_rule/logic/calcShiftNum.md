## 计算班次数量 <!-- {docsify-ignore-all} -->

   

### 逻辑处理脚本

```
if (data.shift_num == null && data.schedule_type == "manual" && data.shifts != null ) {
    var shifts = data.shifts;
    data.shift_num = shifts.length;
}
```
