<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	t1.`CHECKIN_DATE`,
	t1.`ID`,
	t1.`MANUAL`,
	t1.`MANUAL_TYPE`,
	t1.`MEMBER_ID`,
	t1.`MEMBER_NAME`,
	t1.`NAME`,
	t1.`RULE_DATA`,
	t1.`RULE_ID`,
	t11.`NAME` as `RULE_NAME`,
	t11.`SCHEDULE_TYPE`,
	t1.`SHIFT_DATA`,
	t1.`WORKDAY`,
	t1.`WORK_TIME`
from
	`ATTENDANCE_SCHEDULE` t1
left join `ATTENDANCE_ACTIVATE_RULE` t11 on
	t1.`RULE_ID` = t11.`ID`
where 
	t1.MANUAL = 1
	and t1.CHECKIN_DATE >= CURDATE()
```


将执行sql结果赋值给参数`manualSchedules(manualSchedules)`
