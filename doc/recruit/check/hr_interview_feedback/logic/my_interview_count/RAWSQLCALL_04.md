<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1) AS expire_count
FROM hr_interview_feedback hif 
left join hr_interview hi on hif.INTERVIEW_ID  = hi.id
left join hr_interview_schedule his  on hi.SCHEDULE_ID  = his.id
WHERE his.START_DATE < CURRENT_DATE 
  AND (hif.RESULT_TYPE IS NULL OR TRIM(hif.RESULT_TYPE) = '') and hif.INTERVIEWER_ID  = ?;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
