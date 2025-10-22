```sql
SELECT
t11.`DOMAIN_FORCE`,
t1.`GID`,
t21.`NAME` AS `GNAME`,
t1.`ID`,
t11.`MODEL_ID`,
t1.`NAME`,
t11.`PERM_CREATE`,
t11.`PERM_READ`,
t11.`PERM_UNLINK`,
t11.`PERM_WRITE`,
t1.`RULE_ID`,
t11.`NAME` AS `RULE_NAME`
FROM `rule_group_rel` t1 
LEFT JOIN `ir_rule` t11 ON t1.`RULE_ID` = t11.`ID` 
LEFT JOIN `res_groups` t21 ON t1.`GID` = t21.`ID` 


```