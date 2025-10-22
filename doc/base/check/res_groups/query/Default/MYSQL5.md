```sql
SELECT
t1.`API_KEY_DURATION`,
t1.`CATEGORY_ID`,
t11.`NAME` AS `CATEGORY_NAME`,
t1.`COLOR`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`SHARE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `res_groups` t1 
LEFT JOIN `ir_module_category` t11 ON t1.`CATEGORY_ID` = t11.`ID` 


```