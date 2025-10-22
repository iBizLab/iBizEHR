<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as after
from
	hr_interview_feedback t1
left join hr_interview t2 on
	t1.interview_id = t2.id
left join hr_interview_schedule t3 on
	t2.schedule_id = t3.id
where
	t3.start_date > current_date
	and t1.INTERVIEWER_ID = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(计数器返回结果)`，并将执行sql结果赋值给参数`result(计数器返回结果)`
