```sql
SELECT
t1.`ACTIVE`,
t1.`GROUP_ID`,
t11.`NAME` AS `GROUP_NAME`,
t1.`ID`,
t1.`MODEL_ID`,
t1.`NAME`,
t1.`PERM_CREATE`,
t1.`PERM_READ`,
t1.`PERM_UNLINK`,
t1.`PERM_WRITE`
FROM `ir_model_access` t1 
LEFT JOIN `res_groups` t11 ON t1.`GROUP_ID` = t11.`ID` 


```