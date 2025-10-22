<p class="panel-title"><b>执行sql语句</b></p>

```sql
select

	t1.`RULE_DATA`,
	t1.`RULE_ID`

from
	`ATTENDANCE_SCHEDULE` t1
left join `ATTENDANCE_ACTIVATE_RULE` t11 on
	t1.`RULE_ID` = t11.`ID`
where 
	t1.MANUAL = 1
	and t1.CHECKIN_DATE >= CURDATE()
	GROUP BY t1.RULE_ID
```


将执行sql结果赋值给参数`manualSchedules(manualSchedules)`
