<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	COUNT(1) as status_0
from
	hr_exam he
where
	he.STATUS = 10
	and he.CREATE_UID = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
