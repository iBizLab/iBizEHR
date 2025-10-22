```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t11.`IMAGE`,
t1.`JOB_PLATFORM_ID`,
t11.`NAME` AS `JOB_PLATFORM_NAME`,
t1.`NAME`,
t1.`RECEIVE_EMAIL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_job_platform_account` t1 
LEFT JOIN `hr_job_platform` t11 ON t1.`JOB_PLATFORM_ID` = t11.`ID` 


```