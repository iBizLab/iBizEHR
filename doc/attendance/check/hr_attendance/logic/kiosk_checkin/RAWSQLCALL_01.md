<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT * 
FROM hr_attendance 
WHERE employee_id = ?
ORDER BY WRITE_DATE  DESC 
LIMIT 1;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `emp.ID(标识)`

将执行sql结果赋值给参数`last(last)`
