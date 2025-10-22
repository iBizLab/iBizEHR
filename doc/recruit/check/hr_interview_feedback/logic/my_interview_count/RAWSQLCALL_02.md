<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1) as undo_count
FROM hr_interview_feedback hif 
left join hr_interview hi on hif.INTERVIEW_ID  = hi.id
WHERE (hif.RESULT_TYPE IS NULL OR hif.RESULT_TYPE = '') and hif.INTERVIEWER_ID  = ? and hi.STATUS  = 2;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
