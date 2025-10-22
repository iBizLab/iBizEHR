<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COALESCE(SUM(WORKED_HOURS), 0) AS hours_previously_today
FROM hr_attendance 
WHERE employee_id = ?
  AND DATE(CHECK_IN) = CURDATE();
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `emp.ID(标识)`

将执行sql结果赋值给参数`hours_previously_today(今日工作时数)`
