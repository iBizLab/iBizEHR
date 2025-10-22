<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	*
from
	hr_attendance_overtime
where
	`DATE` = DATE(?) 
	and EMPLOYEE_ID = ?
LIMIT 1;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).CHECK_IN(签到)`
2. `Default(传入变量).EMPLOYEE_ID(员工)`

将执行sql结果赋值给参数`over_time(加班记录)`
