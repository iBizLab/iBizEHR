<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1) as done_count
FROM hr_interview_feedback hif 
WHERE hif.RESULT_TYPE IS NOT NULL 
  AND TRIM(hif.RESULT_TYPE) != '' and hif.INTERVIEWER_ID  = ?;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
