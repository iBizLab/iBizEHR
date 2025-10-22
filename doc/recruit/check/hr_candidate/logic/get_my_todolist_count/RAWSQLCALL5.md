<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)as to_onboard from hr_applicant t inner join hr_recruitment_stage t2 on t.STAGE_ID  = t2.id where  t2.`SEQUENCE` = '80' and t.status = '1'
```


重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
