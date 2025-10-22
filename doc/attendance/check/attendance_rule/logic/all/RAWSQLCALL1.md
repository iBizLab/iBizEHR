<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT 
    RULE_ID,
    COUNT(DISTINCT MEMBER_ID) AS total_members
FROM attendance_schedule
WHERE checkin_date >= CURDATE()
GROUP BY RULE_ID
```


将执行sql结果赋值给参数`total_members(total_members)`
