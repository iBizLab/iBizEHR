## 计算组排班数量 <!-- {docsify-ignore-all} -->

   

### 逻辑处理脚本

```
if (data.group_num == null && (data.schedule_type == "class_inversion" || data.schedule_type == "work_rest") && data.attendance_group_shifts != null ) {
    console.log("计算组排班数")
    // var attendance_group_shifts = data.attendance_group_shifts;
    // data.group_num = attendance_group_shifts.length;
}
```
