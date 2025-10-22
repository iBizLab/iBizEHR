```sql
SELECT
t1.`ADDRESS`,
t1.`BIRTHDAY`,
t1.`CANDIDATE_DISPLAY_NAME`,
t1.`CANDIDATE_ID`,
t21.`NAME` AS `CANDIDATE_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EDUCATION`,
t1.`EMAIL_FROM`,
t1.`EXPERIENCE`,
'base' AS `FLOW_TYPE`,
t1.`GENDER`,
t1.`ID`,
t1.`IMAGE`,
(select count(1) from favorite where create_man=#{ctx.sessioncontext.srfpersonid} and OWNER_ID=t1.`ID` ) AS `IS_FAVORITE`,
(CASE WHEN EXISTS (         SELECT 1 FROM `hr_offer`          WHERE applicant_id = t1.id     ) THEN 1 ELSE 0 END ) AS `IS_OFFER`,
(CASE WHEN EXISTS (         SELECT 1 FROM `hr_candidate_filter`          WHERE applicant_id = t1.id     ) THEN 1 ELSE 0 END ) AS `IS_RECOMMENDED`,
t1.`JOB_ID`,
t11.`NAME` AS `JOB_NAME`,
t1.`JOB_PLATFORM_ID`,
t41.`NAME` AS `JOB_PLATFORM_NAME`,
t1.`LAST_EDU_ACADEMIC_DEGREE`,
t1.`LAST_EDU_DATE`,
t1.`LAST_EDU_SCHOOL`,
t1.`LAST_EDU_SPECIALITY`,
t1.`LAST_EXP_COMPANY`,
t1.`LAST_EXP_DATE`,
t1.`LAST_EXP_JOB`,
t11.`MANAGER_UID`,
t1.`MOBILE_PHONE`,
t1.`OWNER_ID`,
t51.`NAME` AS `OWNER_NAME`,
t11.`PRIORITY_ID`,
t11.`PROGRESS_ID`,
t1.`RESUME_SOURCE`,
t1.`SALARY_EXPECTED`,
t1.`SALARY_PROPOSED`,
t1.`STAGE_ID`,
t31.`NAME` AS `STAGE_NAME`,
t31.`SEQUENCE` AS `STAGE_SEQUENCE`,
t1.`STATUS`,
t1.`TAGS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_applicant` t1 
LEFT JOIN `hr_job` t11 ON t1.`JOB_ID` = t11.`ID` 
LEFT JOIN `hr_candidate` t21 ON t1.`CANDIDATE_ID` = t21.`ID` 
LEFT JOIN `hr_recruitment_stage` t31 ON t1.`STAGE_ID` = t31.`ID` 
LEFT JOIN `hr_job_platform` t41 ON t1.`JOB_PLATFORM_ID` = t41.`ID` 
LEFT JOIN `hr_employee` t51 ON t1.`OWNER_ID` = t51.`ID` 

WHERE ( t1.`STATUS` = '1' )
```