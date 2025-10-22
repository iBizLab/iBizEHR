<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT
  0 AS should_attendance_days,
  COALESCE(sum((select count(1) from attendance_record tt where tt.CHECKIN_RESULT ='NORMAL'  and t.id=tt.id )),0) AS actual_attendance_days, 
  0 AS should_working_hours,
  COALESCE(SUM(t.WORKING_HOURS), 0) AS working_hours,
  COALESCE(SUM(t.BILLABLE_HOURS), 0) AS billable_hours,
  0 AS pay_overtime_time,
  0 AS rest_overtime_time 
FROM
  attendance_record t 
WHERE
  CHECKIN_DATE >= DATE_FORMAT(CURRENT_DATE(), '%Y-%m-01') 
  AND CHECKIN_DATE <= LAST_DAY(CURRENT_DATE()) 
  AND t.MEMBER_ID = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfpersonid`

重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
