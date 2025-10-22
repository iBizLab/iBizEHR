<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as exam_feedback
from
	hr_exam t
where
	status = '10' and t.CREATE_UID  = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(计数器返回结果)`，并将执行sql结果赋值给参数`result(计数器返回结果)`
