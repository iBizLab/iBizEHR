<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	*
from
	hr_attendance ha
where
	EMPLOYEE_ID = ?
	and DATE(CHECK_IN) = DATE(?)
	and CHECK_IN < ?
	and CHECK_OUT is null
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).MEMBER_ID(员工ID)`
2. `Default(传入变量).CHECKIN_TIME(打卡时间)`
3. `Default(传入变量).CHECKIN_TIME(打卡时间)`

将执行sql结果赋值给参数`attendances(出勤记录)`
