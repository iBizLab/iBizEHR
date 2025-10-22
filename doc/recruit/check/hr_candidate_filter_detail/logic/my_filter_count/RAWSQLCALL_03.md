<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1) as recommend
FROM hr_candidate_filter_detail hcfd where hcfd.status = 4  and hcfd.USER_ID = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
