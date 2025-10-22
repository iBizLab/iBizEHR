```sql
SELECT
t1.`CODE`,
t1.`COUNTRY_ID`,
t11.`NAME` AS `COUNTRY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`SEQUENCE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_contract_type` t1 
LEFT JOIN `res_country` t11 ON t1.`COUNTRY_ID` = t11.`ID` 


```