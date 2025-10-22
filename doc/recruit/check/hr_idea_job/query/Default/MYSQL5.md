```sql
SELECT
t11.`ADDRESS_ID`,
t11.`CATEGORY`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`IDEA_ID`,
t1.`JOB_ID`,
t11.`NAME` AS `JOB_NAME`,
t1.`NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_idea_job` t1 
LEFT JOIN `hr_job` t11 ON t1.`JOB_ID` = t11.`ID` 


```