<p class="panel-title"><b>执行sql语句</b></p>

```sql
select MEMBER_ID,MEMBER_NAME,RULE_ID FROM attendance_schedule s WHERE  rule_id != ? and checkin_date >= CURDATE()
 AND EXISTS (
    SELECT 1 
    FROM attendance_activate_rule rule  
    WHERE 
      rule.id = s.rule_id 
  )
	GROUP BY s.MEMBER_ID
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(主键)`

将执行sql结果赋值给参数`curActiveMember(curActiveMember)`
