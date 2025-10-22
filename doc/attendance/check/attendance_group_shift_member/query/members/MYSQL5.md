```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`GROUP_ID`,
t1.`ID`,
t1.`NAME`,
t1.`RULE_ID`,
t1.`TYPE`,
t1.`USER_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ATTENDANCE_GROUP_SHIFT_MEMBER` t1 

WHERE ( t1.`GROUP_ID` = #{ctx.datacontext.attendance_group} )
```