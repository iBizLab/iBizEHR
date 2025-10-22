```sql
SELECT
t1.`GID`,
t1.`ID`,
t1.`NAME`,
t11.`RES_CODE`,
t1.`UNIRES_ID`,
t11.`NAME` AS `UNIRES_NAME`
FROM `unires_group_rel` t1 
LEFT JOIN `ir_unires` t11 ON t1.`UNIRES_ID` = t11.`ID` 


```