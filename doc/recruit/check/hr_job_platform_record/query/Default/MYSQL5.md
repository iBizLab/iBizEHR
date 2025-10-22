```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`JOB_ID`,
t1.`JOB_PLATFORM_ID`,
t1.`NAME`,
t1.`OWNER_ID`,
t11.`TYPE`,
t1.`WRITE_UID`
FROM `hr_job_platform_record` t1 
LEFT JOIN `hr_job_platform` t11 ON t1.`JOB_PLATFORM_ID` = t11.`ID` 


```