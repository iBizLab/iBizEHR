<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as pending
from
	hr_offer_approval hoa
where
	hoa.STATUS = 'pending' and hoa.CREATE_UID  = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
