```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EMAIL`,
t1.`ID`,
t1.`IMAGE`,
t1.`NAME`,
(SELECT count(1) from hr_job_platform_account where Job_platform_id = t1.id ) AS `PLATFORM_ACCOUNT_COUNT`,
(select case when count(1) >0 then '2' else '1'end  from hr_job_platform_record where job_id =${srfwebcontext('hr_job_id','{"defname":"TYPE","dename":"HR_JOB_PLATFORM"}')} and job_platform_id = t1.id) AS `PUBLISH_STATUS`,
t1.`TYPE`,
t1.`URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_job_platform` t1
WHERE ( t1.`TYPE` =  '1' )
```