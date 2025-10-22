```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DESCRIPTION`,
t1.`EXCLUSIVE`,
t1.`ID`,
t1.`NAME`,
t1.`PARENT_ID`,
t11.`NAME` AS `PARENT_NAME`,
t1.`SEQUENCE`,
t1.`VISIBLE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ir_module_category` t1 
LEFT JOIN `ir_module_category` t11 ON t1.`PARENT_ID` = t11.`ID` 


```