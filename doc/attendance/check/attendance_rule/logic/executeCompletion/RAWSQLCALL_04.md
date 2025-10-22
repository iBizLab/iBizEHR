<p class="panel-title"><b>执行sql语句</b></p>

```sql
DELETE FROM attendance_group_shift_member WHERE  user_id = ? and  rule_id != ?
 AND EXISTS (
    SELECT 1 
    FROM attendance_rule rule  
    WHERE 
      rule.id = attendance_group_shift_member.rule_id 
      AND rule.IS_ACTIVATE  = 1
  )
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `deptTemp.USER_ID(标识)`
2. `Default(传入变量).ID(主键)`

