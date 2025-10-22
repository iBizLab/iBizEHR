<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT * 
FROM resource_calendar_leaves 
WHERE DATE_FROM >= DATE_FORMAT(CURDATE(), '%Y-01-01') 
  AND DATE_FROM < DATE_ADD(DATE_FORMAT(CURDATE(), '%Y-01-01'), INTERVAL 1 YEAR)
  AND CALENDAR_ID IS NULL
```


将执行sql结果赋值给参数`holidays(holidays)`
