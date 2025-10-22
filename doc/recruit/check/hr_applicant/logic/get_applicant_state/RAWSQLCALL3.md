<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)  as status_30 
from hr_applicant ha 
left join hr_recruitment_stage hrs on ha.STAGE_ID  = hrs.id
where hrs.`SEQUENCE`  = 30 and ha.status = 1
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
