<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT * 
FROM hr_attendance 
WHERE employee_id = ?
  AND check_in < ?
  AND id != ?
ORDER BY check_in DESC 
LIMIT 1;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).EMPLOYEE_ID(员工)`
2. `Default(传入变量).CHECK_OUT(签离)`
3. `Default(传入变量).ID(标识)`

将执行sql结果赋值给参数`before_check_out(before_check_out)`
