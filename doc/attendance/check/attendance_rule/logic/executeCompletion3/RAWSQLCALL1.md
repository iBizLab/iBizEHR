<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT 
   *
FROM 
    attendance_activate_rule r
WHERE 
    EXISTS (
        SELECT 
            1
        FROM 
            attendance_group_shift_member gsm
        WHERE 
            gsm.rule_id = r.id
    )
```


将执行sql结果赋值给参数`rules(rules)`
