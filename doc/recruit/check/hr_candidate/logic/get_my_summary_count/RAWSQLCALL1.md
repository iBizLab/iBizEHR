<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as candidate_filter
from
	hr_candidate_filter_detail t
where
	status = '1' and t.USER_ID  = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(计数器返回结果)`，并将执行sql结果赋值给参数`result(计数器返回结果)`
