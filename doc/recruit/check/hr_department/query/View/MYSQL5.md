```sql
SELECT
t1.`ACTIVE`,
t1.`COLOR`,
t1.`COMPANY_ID`,
t21.`NAME` AS `COMPANY_NAME`,
t1.`COMPLETE_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`NOTE`,
t1.`PARENT_ID`,
t11.`NAME` AS `PARENT_NAME`,
t1.`PARENT_PATH`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_department` t1 
LEFT JOIN `hr_department` t11 ON t1.`PARENT_ID` = t11.`ID` 
LEFT JOIN `res_company` t21 ON t1.`COMPANY_ID` = t21.`ID` 


```