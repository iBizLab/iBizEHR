```sql
SELECT
t1.`ACTIVE`,
t1.`COMPANY_ID`,
t21.`NAME` AS `COMPANY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DEPARTMENT_ID`,
t11.`NAME` AS `DEPARTMENT_NAME`,
t1.`ID`,
t1.`NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `mail_activity_plan` t1 
LEFT JOIN `hr_department` t11 ON t1.`DEPARTMENT_ID` = t11.`ID` 
LEFT JOIN `res_company` t21 ON t1.`COMPANY_ID` = t21.`ID` 


```