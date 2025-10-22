<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) today_to_filter_apply from hr_applicant ha where ha.STAGE_ID  = 10 and status = 1 and DATE(CREATE_DATE) = CURRENT_DATE;
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
