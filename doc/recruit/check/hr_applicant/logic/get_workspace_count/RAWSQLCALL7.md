<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) second_interview_pending from hr_interview hi where hi.status != 1 and hi.STAGE_ID  = 2
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
