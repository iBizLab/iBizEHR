```sql
SELECT
t1.`COMPANY_ID`,
t31.`NAME` AS `COMPANY_NAME`,
t1.`CONDITION`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`FIELD_ID`,
t1.`ID`,
t1.`JSON_VALUE`,
t1.`USER_ID`,
t21.`NAME` AS `USER_NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ir_default` t1 
LEFT JOIN `res_users` t11 ON t1.`USER_ID` = t11.`ID` 
LEFT JOIN `res_partner` t21 ON t11.`PARTNER_ID` = t21.`ID` 
LEFT JOIN `res_company` t31 ON t1.`COMPANY_ID` = t31.`ID` 


```