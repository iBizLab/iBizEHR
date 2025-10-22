<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as second_interview_pending
from
	hr_applicant t
inner join hr_recruitment_stage t2 on
	t.STAGE_ID = t2.id
where
	t2.`SEQUENCE` = '60'
	and t.status = '1'
	and exists(
		select * from hr_interview t3 inner join hr_applicant_interview t4 on t3.id = t4.interview_id
			where  t3.STAGE_ID = '2' and t3.STATUS  = '1' and t4.APPLICANT_ID  = t.ID 
	)
```


重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
