<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) to_onboard from hr_applicant ha where (ha.STAGE_ID  = 50)
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
