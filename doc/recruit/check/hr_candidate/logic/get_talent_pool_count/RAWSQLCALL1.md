<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT count(1) talent_pool_count from hr_candidate  where LAST_TP_TALENT_POOL is not null
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
