<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1)  AS first_feedback_pending 
FROM hr_interview_feedback hif 
left join hr_interview hi on hif.INTERVIEW_ID  = hi.id
where 
	hi.STAGE_ID  = 1
  and hif.RESULT_TYPE IS NOT NULL 
  AND hif.RESULT_TYPE != '';
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
