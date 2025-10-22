<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COALESCE(SUM(OVERTIME_HOURS), 0)+? AS total_overtime_hours
FROM hr_attendance
WHERE employee_id = ?
  AND DATE(check_in) = DATE(?) 
  AND check_out IS NOT NULL 
  AND id != ?
  AND OVERTIME_STATUS = 'approved'
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).OVERTIME_HOURS(随着时间的推移)`
2. `Default(传入变量).EMPLOYEE_ID(员工)`
3. `Default(传入变量).CHECK_IN(签到)`
4. `Default(传入变量).ID(标识)`

将执行sql结果赋值给参数`sum_over(sum_over)`
