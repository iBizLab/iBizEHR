<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT * 
FROM hr_attendance 
WHERE employee_id = ?
  AND check_out is null
  AND id != ?
ORDER BY check_in DESC 
LIMIT 1;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).EMPLOYEE_ID(员工)`
2. `Default(传入变量).ID(标识)`

重置参数`no_check_out(未签退出勤记录)`，并将执行sql结果赋值给参数`no_check_out(未签退出勤记录)`
