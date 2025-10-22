# MYSQL5 <!-- {docsify-ignore-all} -->

## [评论(COMMENT)](module/base/comment.md) :id=comment

#### 数据查询(DEFAULT) :id=comment-Default
```sql
SELECT
t1.`CONTENT`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`ID`,
t1.`IS_TOP`,
t1.`NAME`,
t1.`OWNER_TYPE`,
t11.`CONTENT` AS `PCONTENT`,
t11.`CREATE_MAN` AS `PCREATE_MAN`,
t1.`PID`,
t1.`PRINCIPAL_ID`,
t1.`PRINCIPAL_NAME`,
t1.`PRINCIPAL_TYPE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `COMMENT` t1 
LEFT JOIN `COMMENT` t11 ON t1.`PID` = t11.`ID` 

```

#### 默认（全部数据）(VIEW) :id=comment-View
```sql
SELECT
t1.`CONTENT`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`ID`,
t1.`IS_TOP`,
t1.`NAME`,
t1.`OWNER_TYPE`,
t11.`CONTENT` AS `PCONTENT`,
t11.`CREATE_MAN` AS `PCREATE_MAN`,
t1.`PID`,
t1.`PRINCIPAL_ID`,
t1.`PRINCIPAL_NAME`,
t1.`PRINCIPAL_TYPE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `COMMENT` t1 
LEFT JOIN `COMMENT` t11 ON t1.`PID` = t11.`ID` 

```


## [执行人(EXECUTOR)](module/base/executor.md) :id=executor

#### 数据查询(DEFAULT) :id=executor-Default
```sql
SELECT
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`ID`,
t1.`NAME`,
t1.`OWNER_ID`,
t1.`OWNER_SUBTYPE`,
t1.`OWNER_TYPE`,
t1.`SEQUENCE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`,
t1.`USER_ID`,
t1.`USER_NAME`
FROM `EXECUTOR` t1 

```

#### 默认（全部数据）(VIEW) :id=executor-View
```sql
SELECT
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`ID`,
t1.`NAME`,
t1.`OWNER_ID`,
t1.`OWNER_SUBTYPE`,
t1.`OWNER_TYPE`,
t1.`SEQUENCE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`,
t1.`USER_ID`,
t1.`USER_NAME`
FROM `EXECUTOR` t1 

```


## [扩展日志(EXTEND_LOG)](module/base/extend_log.md) :id=extend_log

#### 数据查询(DEFAULT) :id=extend_log-Default
```sql
SELECT
t1.`CATEGORY`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`ELAPSED_TIME`,
t1.`END_AT`,
t1.`ID`,
t1.`LEVEL`,
t1.`NAME`,
t1.`OWNER_ID`,
t1.`OWNER_SUBTYPE`,
t1.`OWNER_TYPE`,
t1.`START_AT`,
t1.`STATE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `EXTEND_LOG` t1 

```

#### 默认（全部数据）(VIEW) :id=extend_log-View
```sql
SELECT
t1.`CATEGORY`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`DEBUG_INFO`,
t1.`ELAPSED_TIME`,
t1.`END_AT`,
t1.`ID`,
t1.`INFO`,
t1.`LEVEL`,
t1.`NAME`,
t1.`OWNER_ID`,
t1.`OWNER_SUBTYPE`,
t1.`OWNER_TYPE`,
t1.`START_AT`,
t1.`STATE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `EXTEND_LOG` t1 

```


## [收藏(FAVORITE)](module/base/favorite.md) :id=favorite

#### 数据查询(DEFAULT) :id=favorite-Default
```sql
SELECT
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`ID`,
t1.`NAME`,
t1.`OWNER_ID`,
t1.`OWNER_SUBTYPE`,
t1.`OWNER_TYPE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `FAVORITE` t1 

```

#### 默认（全部数据）(VIEW) :id=favorite-View
```sql
SELECT
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`ID`,
t1.`NAME`,
t1.`OWNER_ID`,
t1.`OWNER_SUBTYPE`,
t1.`OWNER_TYPE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `FAVORITE` t1 

```


## [候选人申请(HR_APPLICANT)](module/hr/hr_applicant.md) :id=hr_applicant

#### 数据查询(DEFAULT) :id=hr_applicant-Default
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

```

#### 默认（全部数据）(VIEW) :id=hr_applicant-View
```sql
SELECT
t1.`ADDRESS`,
t1.`APPLICANT_NOTES`,
t1.`BIRTHDAY`,
t1.`CANDIDATE_DISPLAY_NAME`,
t1.`CANDIDATE_ID`,
t21.`NAME` AS `CANDIDATE_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DESCRIPTION`,
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

```

#### 流程中的申请(active_applicant) :id=hr_applicant-active_applicant
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

#### bi_search :id=hr_applicant-bi_search
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

```

#### 查询星标(favorite) :id=hr_applicant-favorite
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

WHERE ( (select count(1) from favorite where create_man=#{ctx.sessioncontext.srfpersonid} and OWNER_ID=t1.`ID` ) = '1' )
```


## [申请人类别(HR_APPLICANT_CATEGORY)](module/hr/hr_applicant_category.md) :id=hr_applicant_category

#### 数据查询(DEFAULT) :id=hr_applicant_category-Default
```sql
SELECT
t1.`COLOR`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_applicant_category` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_applicant_category-View
```sql
SELECT
t1.`COLOR`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_applicant_category` t1 

```


## [候选人申请与面试关系(HR_APPLICANT_INTERVIEW)](module/hr/hr_applicant_interview.md) :id=hr_applicant_interview

#### 数据查询(DEFAULT) :id=hr_applicant_interview-Default
```sql
SELECT
t21.`ADDRESS`,
t1.`APPLICANT_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t11.`DURATION`,
t21.`EDUCATION`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`ID`,
t1.`INTERVIEW_ID`,
t51.`INTERVIEW_TYPE`,
t21.`JOB_ID`,
t31.`NAME` AS `JOB_NAME`,
t21.`JOB_PLATFORM_ID`,
t41.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t21.`OWNER_ID`,
t61.`NAME` AS `OWNER_NAME`,
t11.`STAGE_ID`,
t51.`START_DATE`,
t11.`START_TIME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_applicant_interview` t1 
LEFT JOIN `hr_interview` t11 ON t1.`INTERVIEW_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_job` t31 ON t21.`JOB_ID` = t31.`ID` 
LEFT JOIN `hr_job_platform` t41 ON t21.`JOB_PLATFORM_ID` = t41.`ID` 
LEFT JOIN `hr_interview_schedule` t51 ON t11.`SCHEDULE_ID` = t51.`ID` 
LEFT JOIN `hr_employee` t61 ON t21.`OWNER_ID` = t61.`ID` 

```

#### 默认（全部数据）(VIEW) :id=hr_applicant_interview-View
```sql
SELECT
t21.`ADDRESS`,
t1.`APPLICANT_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t21.`DESCRIPTION`,
t11.`DURATION`,
t21.`EDUCATION`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`ID`,
t1.`INTERVIEW_ID`,
t51.`INTERVIEW_TYPE`,
t21.`JOB_ID`,
t31.`NAME` AS `JOB_NAME`,
t21.`JOB_PLATFORM_ID`,
t41.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t21.`OWNER_ID`,
t61.`NAME` AS `OWNER_NAME`,
t11.`STAGE_ID`,
t51.`START_DATE`,
t11.`START_TIME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_applicant_interview` t1 
LEFT JOIN `hr_interview` t11 ON t1.`INTERVIEW_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_job` t31 ON t21.`JOB_ID` = t31.`ID` 
LEFT JOIN `hr_job_platform` t41 ON t21.`JOB_PLATFORM_ID` = t41.`ID` 
LEFT JOIN `hr_interview_schedule` t51 ON t11.`SCHEDULE_ID` = t51.`ID` 
LEFT JOIN `hr_employee` t61 ON t21.`OWNER_ID` = t61.`ID` 

```

#### 面试安排(INTERVIEW_LIST) :id=hr_applicant_interview-interview_list
```sql
SELECT
t21.`ADDRESS`,
t1.`APPLICANT_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t11.`DURATION`,
t21.`EDUCATION`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`ID`,
t1.`INTERVIEW_ID`,
t51.`INTERVIEW_TYPE`,
t21.`JOB_ID`,
t31.`NAME` AS `JOB_NAME`,
t21.`JOB_PLATFORM_ID`,
t41.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t21.`OWNER_ID`,
t61.`NAME` AS `OWNER_NAME`,
t11.`STAGE_ID`,
t51.`START_DATE`,
t11.`START_TIME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_applicant_interview` t1 
LEFT JOIN `hr_interview` t11 ON t1.`INTERVIEW_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_job` t31 ON t21.`JOB_ID` = t31.`ID` 
LEFT JOIN `hr_job_platform` t41 ON t21.`JOB_PLATFORM_ID` = t41.`ID` 
LEFT JOIN `hr_interview_schedule` t51 ON t11.`SCHEDULE_ID` = t51.`ID` 
LEFT JOIN `hr_employee` t61 ON t21.`OWNER_ID` = t61.`ID` 

```

#### 我的面试(MY_INTERVIEW) :id=hr_applicant_interview-my_interview
```sql
SELECT
t21.`ADDRESS`,
t1.`APPLICANT_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t11.`DURATION`,
t21.`EDUCATION`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`ID`,
t1.`INTERVIEW_ID`,
t51.`INTERVIEW_TYPE`,
t21.`JOB_ID`,
t31.`NAME` AS `JOB_NAME`,
t21.`JOB_PLATFORM_ID`,
t41.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t21.`OWNER_ID`,
t61.`NAME` AS `OWNER_NAME`,
t11.`STAGE_ID`,
t51.`START_DATE`,
t11.`START_TIME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_applicant_interview` t1 
LEFT JOIN `hr_interview` t11 ON t1.`INTERVIEW_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_job` t31 ON t21.`JOB_ID` = t31.`ID` 
LEFT JOIN `hr_job_platform` t41 ON t21.`JOB_PLATFORM_ID` = t41.`ID` 
LEFT JOIN `hr_interview_schedule` t51 ON t11.`SCHEDULE_ID` = t51.`ID` 
LEFT JOIN `hr_employee` t61 ON t21.`OWNER_ID` = t61.`ID` 

```


## [ 拒绝原因申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason.md) :id=hr_applicant_refuse_reason

#### 数据查询(DEFAULT) :id=hr_applicant_refuse_reason-Default
```sql
SELECT
t1.`ACTIVE`,
t1.`CANDIDATE_ID`,
t1.`COMPANY_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`JOB_ID`,
t1.`LAST_STAGE_ID`,
t1.`MESSAGE_MAIN_ATTACHMENT_ID`,
t1.`NAME`,
t1.`REFUSE_REASON_ID`,
t1.`SEQUENCE`,
t1.`STAGE_ID`,
t1.`USER_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_applicant_refuse_reason` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_applicant_refuse_reason-View
```sql
SELECT
t1.`ACTIVE`,
t1.`CANDIDATE_ID`,
t1.`COMPANY_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`JOB_ID`,
t1.`LAST_STAGE_ID`,
t1.`MESSAGE_MAIN_ATTACHMENT_ID`,
t1.`NAME`,
t1.`REFUSE_REASON_ID`,
t1.`SEQUENCE`,
t1.`STAGE_ID`,
t1.`USER_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_applicant_refuse_reason` t1 

```


## [候选人(HR_CANDIDATE)](module/hr/hr_candidate.md) :id=hr_candidate

#### 数据查询(DEFAULT) :id=hr_candidate-Default
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`BIRTHDAY`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EDUCATION`,
t1.`EMAIL_FROM`,
t1.`EXPERIENCE`,
t1.`GENDER`,
t1.`ID`,
t1.`LAST_EDU_ACADEMIC_DEGREE`,
t1.`LAST_EDU_DATE`,
t1.`LAST_EDU_SCHOOL`,
t1.`LAST_EDU_SPECIALITY`,
t1.`LAST_EXP_COMPANY`,
t1.`LAST_EXP_DATE`,
t1.`LAST_EXP_JOB`,
t1.`LAST_TAGS`,
t1.`LAST_TP_APPLIED_AT`,
t1.`LAST_TP_ARCHIVED_AT`,
t1.`LAST_TP_ARCHIVE_REASON`,
t1.`LAST_TP_ARCHIVE_REASON_DETAIL`,
t1.`LAST_TP_JOB_NAME`,
t1.`LAST_TP_STAGE_NAME`,
t1.`LAST_TP_TALENT_POOL`,
t1.`MOBILE_PHONE`,
t1.`NAME`,
(SELECT count(1) from hr_candidate  where LAST_TP_TALENT_POOL is not null) AS `TALENT_POOL_COUNT`,
t1.`USER_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_candidate-View
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`BIRTHDAY`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EDUCATION`,
t1.`EMAIL_FROM`,
t1.`EXPERIENCE`,
t1.`GENDER`,
t1.`ID`,
t1.`LAST_EDU_ACADEMIC_DEGREE`,
t1.`LAST_EDU_DATE`,
t1.`LAST_EDU_SCHOOL`,
t1.`LAST_EDU_SPECIALITY`,
t1.`LAST_EXP_COMPANY`,
t1.`LAST_EXP_DATE`,
t1.`LAST_EXP_JOB`,
t1.`LAST_TAGS`,
t1.`LAST_TP_APPLIED_AT`,
t1.`LAST_TP_ARCHIVED_AT`,
t1.`LAST_TP_ARCHIVE_REASON`,
t1.`LAST_TP_ARCHIVE_REASON_DETAIL`,
t1.`LAST_TP_JOB_NAME`,
t1.`LAST_TP_STAGE_NAME`,
t1.`LAST_TP_TALENT_POOL`,
t1.`MOBILE_PHONE`,
t1.`NAME`,
(SELECT count(1) from hr_candidate  where LAST_TP_TALENT_POOL is not null) AS `TALENT_POOL_COUNT`,
t1.`USER_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate` t1 

```

#### 公共人才库查询(PUBLIC_TALENT_POOL) :id=hr_candidate-public_talent_pool
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`BIRTHDAY`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EDUCATION`,
t1.`EMAIL_FROM`,
t1.`EXPERIENCE`,
t1.`GENDER`,
t1.`ID`,
t1.`LAST_EDU_ACADEMIC_DEGREE`,
t1.`LAST_EDU_DATE`,
t1.`LAST_EDU_SCHOOL`,
t1.`LAST_EDU_SPECIALITY`,
t1.`LAST_EXP_COMPANY`,
t1.`LAST_EXP_DATE`,
t1.`LAST_EXP_JOB`,
t1.`LAST_TAGS`,
t1.`LAST_TP_APPLIED_AT`,
t1.`LAST_TP_ARCHIVED_AT`,
t1.`LAST_TP_ARCHIVE_REASON`,
t1.`LAST_TP_ARCHIVE_REASON_DETAIL`,
t1.`LAST_TP_JOB_NAME`,
t1.`LAST_TP_STAGE_NAME`,
t1.`LAST_TP_TALENT_POOL`,
t1.`MOBILE_PHONE`,
t1.`NAME`,
(SELECT count(1) from hr_candidate  where LAST_TP_TALENT_POOL is not null) AS `TALENT_POOL_COUNT`,
t1.`USER_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate` t1 

WHERE ( t1.`LAST_TP_TALENT_POOL` IS NOT NULL )
```


## [候选人教育经历(HR_CANDIDATE_EDUCATION)](module/hr/hr_candidate_education.md) :id=hr_candidate_education

#### 数据查询(DEFAULT) :id=hr_candidate_education-Default
```sql
SELECT
t1.`ACADEMIC_DEGREE`,
t1.`APPLICANT_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`END_DATE`,
t1.`ID`,
t1.`NAME`,
t1.`SCHOOL`,
t1.`SPECIALITY`,
t1.`START_DATE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_education` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_candidate_education-View
```sql
SELECT
t1.`ACADEMIC_DEGREE`,
t1.`APPLICANT_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`END_DATE`,
t1.`ID`,
t1.`NAME`,
t1.`SCHOOL`,
t1.`SPECIALITY`,
t1.`START_DATE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_education` t1 

```


## [候选人工作经历(HR_CANDIDATE_EXPERIENCE)](module/hr/hr_candidate_experience.md) :id=hr_candidate_experience

#### 数据查询(DEFAULT) :id=hr_candidate_experience-Default
```sql
SELECT
t1.`APPLICANT_ID`,
t1.`COMPANY`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DEPARTMENT`,
t1.`END_DATE`,
t1.`ID`,
t1.`INDUSTRY`,
t1.`JOB_NAME`,
t1.`LEADER`,
t1.`LOCATION`,
t1.`NAME`,
t1.`NOW`,
t1.`REASON_FOR_LEAVING`,
t1.`SALARY`,
t1.`START_DATE`,
t1.`SUMMARY`,
t1.`UNDERLING_NUMBER`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_experience` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_candidate_experience-View
```sql
SELECT
t1.`APPLICANT_ID`,
t1.`COMPANY`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DEPARTMENT`,
t1.`END_DATE`,
t1.`ID`,
t1.`INDUSTRY`,
t1.`JOB_NAME`,
t1.`LEADER`,
t1.`LOCATION`,
t1.`NAME`,
t1.`NOW`,
t1.`REASON_FOR_LEAVING`,
t1.`SALARY`,
t1.`START_DATE`,
t1.`SUMMARY`,
t1.`UNDERLING_NUMBER`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_experience` t1 

```


## [筛选候选人(HR_CANDIDATE_FILTER)](module/hr/hr_candidate_filter.md) :id=hr_candidate_filter

#### 数据查询(DEFAULT) :id=hr_candidate_filter-Default
```sql
SELECT
t1.`APPLICANT_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`MEMO`,
t1.`NAME`,
t1.`TYPE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_filter` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_candidate_filter-View
```sql
SELECT
t1.`APPLICANT_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`MEMO`,
t1.`NAME`,
t1.`REVIEWER_USER_IDS`,
t1.`TYPE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_filter` t1 

```


## [筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail.md) :id=hr_candidate_filter_detail

#### 数据查询(DEFAULT) :id=hr_candidate_filter_detail-Default
```sql
SELECT
t21.`ADDRESS`,
t21.`CREATE_DATE` AS `APPLICANT_CREATE_DATE`,
t1.`APPLICANT_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CANDIDATE_FILTER_ID`,
t51.`NAME` AS `CANDIDATE_NAME`,
t1.`CONTENT`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t21.`EDUCATION`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`FEEDBACK_INFORMATION`,
t1.`ID`,
t31.`NAME` AS `JOB_NAME`,
t41.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`LAST_EDU_SCHOOL`,
t1.`MEMO`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t31.`PRIORITY_ID`,
t61.`NAME` AS `STAGE_NAME`,
t1.`STATUS`,
t1.`TYPE`,
t1.`USER_ID`,
t11.`NAME` AS `USER_NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_filter_detail` t1 
LEFT JOIN `hr_employee` t11 ON t1.`USER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_job` t31 ON t21.`JOB_ID` = t31.`ID` 
LEFT JOIN `hr_job_platform` t41 ON t21.`JOB_PLATFORM_ID` = t41.`ID` 
LEFT JOIN `hr_candidate` t51 ON t21.`CANDIDATE_ID` = t51.`ID` 
LEFT JOIN `hr_recruitment_stage` t61 ON t21.`STAGE_ID` = t61.`ID` 

```

#### 默认（全部数据）(VIEW) :id=hr_candidate_filter_detail-View
```sql
SELECT
t21.`ADDRESS`,
t21.`CREATE_DATE` AS `APPLICANT_CREATE_DATE`,
t1.`APPLICANT_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CANDIDATE_FILTER_ID`,
t51.`NAME` AS `CANDIDATE_NAME`,
t1.`CONTENT`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t21.`DESCRIPTION`,
t21.`EDUCATION`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`FEEDBACK_INFORMATION`,
t1.`ID`,
t31.`NAME` AS `JOB_NAME`,
t41.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`LAST_EDU_SCHOOL`,
t1.`MEMO`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t31.`PRIORITY_ID`,
t61.`NAME` AS `STAGE_NAME`,
t1.`STATUS`,
t1.`TYPE`,
t1.`USER_ID`,
t11.`NAME` AS `USER_NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_filter_detail` t1 
LEFT JOIN `hr_employee` t11 ON t1.`USER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_job` t31 ON t21.`JOB_ID` = t31.`ID` 
LEFT JOIN `hr_job_platform` t41 ON t21.`JOB_PLATFORM_ID` = t41.`ID` 
LEFT JOIN `hr_candidate` t51 ON t21.`CANDIDATE_ID` = t51.`ID` 
LEFT JOIN `hr_recruitment_stage` t61 ON t21.`STAGE_ID` = t61.`ID` 

```

#### 已评价(evaluated) :id=hr_candidate_filter_detail-evaluated
```sql
SELECT
t21.`ADDRESS`,
t21.`CREATE_DATE` AS `APPLICANT_CREATE_DATE`,
t1.`APPLICANT_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CANDIDATE_FILTER_ID`,
t51.`NAME` AS `CANDIDATE_NAME`,
t1.`CONTENT`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t21.`EDUCATION`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`FEEDBACK_INFORMATION`,
t1.`ID`,
t31.`NAME` AS `JOB_NAME`,
t41.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`LAST_EDU_SCHOOL`,
t1.`MEMO`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t31.`PRIORITY_ID`,
t61.`NAME` AS `STAGE_NAME`,
t1.`STATUS`,
t1.`TYPE`,
t1.`USER_ID`,
t11.`NAME` AS `USER_NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_filter_detail` t1 
LEFT JOIN `hr_employee` t11 ON t1.`USER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_job` t31 ON t21.`JOB_ID` = t31.`ID` 
LEFT JOIN `hr_job_platform` t41 ON t21.`JOB_PLATFORM_ID` = t41.`ID` 
LEFT JOIN `hr_candidate` t51 ON t21.`CANDIDATE_ID` = t51.`ID` 
LEFT JOIN `hr_recruitment_stage` t61 ON t21.`STAGE_ID` = t61.`ID` 

WHERE ( t1.`STATUS` <> '1' )
```

#### 筛选_个人(filter_myself) :id=hr_candidate_filter_detail-filter_myself
```sql
SELECT
t21.`ADDRESS`,
t21.`CREATE_DATE` AS `APPLICANT_CREATE_DATE`,
t1.`APPLICANT_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CANDIDATE_FILTER_ID`,
t51.`NAME` AS `CANDIDATE_NAME`,
t1.`CONTENT`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t21.`EDUCATION`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`FEEDBACK_INFORMATION`,
t1.`ID`,
t31.`NAME` AS `JOB_NAME`,
t41.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`LAST_EDU_SCHOOL`,
t1.`MEMO`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t31.`PRIORITY_ID`,
t61.`NAME` AS `STAGE_NAME`,
t1.`STATUS`,
t1.`TYPE`,
t1.`USER_ID`,
t11.`NAME` AS `USER_NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_filter_detail` t1 
LEFT JOIN `hr_employee` t11 ON t1.`USER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_job` t31 ON t21.`JOB_ID` = t31.`ID` 
LEFT JOIN `hr_job_platform` t41 ON t21.`JOB_PLATFORM_ID` = t41.`ID` 
LEFT JOIN `hr_candidate` t51 ON t21.`CANDIDATE_ID` = t51.`ID` 
LEFT JOIN `hr_recruitment_stage` t61 ON t21.`STAGE_ID` = t61.`ID` 

WHERE ( t1.`USER_ID` = #{ctx.sessioncontext.srfuserid} )
```

#### 未评价(unevaluated) :id=hr_candidate_filter_detail-unevaluated
```sql
SELECT
t21.`ADDRESS`,
t21.`CREATE_DATE` AS `APPLICANT_CREATE_DATE`,
t1.`APPLICANT_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CANDIDATE_FILTER_ID`,
t51.`NAME` AS `CANDIDATE_NAME`,
t1.`CONTENT`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t21.`EDUCATION`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`FEEDBACK_INFORMATION`,
t1.`ID`,
t31.`NAME` AS `JOB_NAME`,
t41.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`LAST_EDU_SCHOOL`,
t1.`MEMO`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t31.`PRIORITY_ID`,
t61.`NAME` AS `STAGE_NAME`,
t1.`STATUS`,
t1.`TYPE`,
t1.`USER_ID`,
t11.`NAME` AS `USER_NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_filter_detail` t1 
LEFT JOIN `hr_employee` t11 ON t1.`USER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_job` t31 ON t21.`JOB_ID` = t31.`ID` 
LEFT JOIN `hr_job_platform` t41 ON t21.`JOB_PLATFORM_ID` = t41.`ID` 
LEFT JOIN `hr_candidate` t51 ON t21.`CANDIDATE_ID` = t51.`ID` 
LEFT JOIN `hr_recruitment_stage` t61 ON t21.`STAGE_ID` = t61.`ID` 

WHERE ( t1.`STATUS` = '1'  AND  t1.`USER_ID` = #{ctx.sessioncontext.srfuserid} )
```


## [候选人标签(HR_CANDIDATE_LABEL)](module/hr/hr_candidate_label.md) :id=hr_candidate_label

#### 数据查询(DEFAULT) :id=hr_candidate_label-Default
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_label` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_candidate_label-View
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_label` t1 

```


## [候选人的技能水平(HR_CANDIDATE_SKILL)](module/hr/hr_candidate_skill.md) :id=hr_candidate_skill

#### 数据查询(DEFAULT) :id=hr_candidate_skill-Default
```sql
SELECT
t1.`CANDIDATE_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`SKILL_ID`,
t1.`SKILL_LEVEL_ID`,
t1.`SKILL_TYPE_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_skill` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_candidate_skill-View
```sql
SELECT
t1.`CANDIDATE_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`SKILL_ID`,
t1.`SKILL_LEVEL_ID`,
t1.`SKILL_TYPE_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_skill` t1 

```


## [候选者与人才库关系(HR_CANDIDATE_TALENT_POOL)](module/hr/hr_candidate_talent_pool.md) :id=hr_candidate_talent_pool

#### 数据查询(DEFAULT) :id=hr_candidate_talent_pool-Default
```sql
SELECT
t1.`CANDIDATE_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`TALENT_POOL_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_talent_pool` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_candidate_talent_pool-View
```sql
SELECT
t1.`CANDIDATE_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`TALENT_POOL_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_talent_pool` t1 

```


## [合同类型(HR_CONTRACT_TYPE)](module/hr/hr_contract_type.md) :id=hr_contract_type

#### 数据查询(DEFAULT) :id=hr_contract_type-Default
```sql
SELECT
t1.`CODE`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`SEQUENCE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_contract_type` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_contract_type-View
```sql
SELECT
t1.`CODE`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`SEQUENCE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_contract_type` t1 

```


## [部门(HR_DEPARTMENT)](module/hr/hr_department.md) :id=hr_department

#### 数据查询(DEFAULT) :id=hr_department-Default
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
t1.`PARENT_ID`,
t11.`NAME` AS `PARENT_NAME`,
t1.`PARENT_PATH`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_department` t1 
LEFT JOIN `hr_department` t11 ON t1.`PARENT_ID` = t11.`ID` 
LEFT JOIN `res_company` t21 ON t1.`COMPANY_ID` = t21.`ID` 

```

#### 默认（全部数据）(VIEW) :id=hr_department-View
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


## [员工(HR_EMPLOYEE)](module/hr/hr_employee.md) :id=hr_employee

#### 数据查询(DEFAULT) :id=hr_employee-Default
```sql
SELECT
t1.`ACTIVE`,
t1.`BARCODE`,
t1.`BIRTHDAY`,
t1.`CERTIFICATE`,
t1.`CHILDREN`,
t1.`COLOR`,
t1.`COMPANY_ID`,
t11.`NAME` AS `COMPANY_NAME`,
t1.`CONTRACT_WARNING`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DEPARTMENT_ID`,
t31.`NAME` AS `DEPARTMENT_NAME`,
t1.`DEPARTURE_DATE`,
t1.`DISTANCE_HOME_WORK`,
t1.`DISTANCE_HOME_WORK_UNIT`,
t1.`EDUCATION_LEVEL`,
t1.`EMERGENCY_CONTACT`,
t1.`EMERGENCY_PHONE`,
t1.`EMPLOYEE_TYPE`,
t1.`FIRST_CONTRACT_DATE`,
t1.`GENDER`,
t1.`HR_JOB_ID`,
t1.`ID`,
t1.`IDENTIFICATION_ID`,
t1.`IDENTIFICATION_TYPE`,
t1.`IS_FLEXIBLE`,
t1.`IS_FULLY_FLEXIBLE`,
t1.`JOB_TITLE`,
t1.`JOIN_WORKDATE`,
t1.`KM_HOME_WORK`,
t1.`LEGAL_NAME`,
t1.`MAJOR`,
t1.`MARITAL_STATUS`,
t1.`MOBILE_PHONE`,
t1.`MOBILITY_CARD`,
t1.`NAME`,
t1.`NATION`,
t1.`PARENT_PATH`,
t1.`PASSPORT_ID`,
t1.`PERMIT_NO`,
t1.`PIN`,
t1.`PLACE_OF_BIRTH`,
t1.`PRIVATE_CAR_PLATE`,
t1.`PRIVATE_CITY`,
t1.`PRIVATE_EMAIL`,
t1.`PRIVATE_PHONE`,
t1.`PRIVATE_STREET`,
t1.`PRIVATE_STREET2`,
t1.`PRIVATE_ZIP`,
t1.`SINID`,
t1.`SPOUSE_BIRTHDATE`,
t1.`SPOUSE_COMPLETE_NAME`,
t1.`SSNID`,
t1.`START_WORKDATE`,
t1.`STUDY_FIELD`,
t1.`STUDY_SCHOOL`,
t1.`USER_ID`,
t21.`DISPLAY_NAME` AS `USER_NAME`,
t1.`VEHICLE`,
t1.`VISA_EXPIRE`,
t1.`VISA_NO`,
t1.`WORK_EMAIL`,
t1.`WORK_PERMIT_EXPIRATION_DATE`,
t1.`WORK_PERMIT_SCHEDULED_ACTIVITY`,
t1.`WORK_PHONE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_employee` t1 
LEFT JOIN `res_company` t11 ON t1.`COMPANY_ID` = t11.`ID` 
LEFT JOIN `res_users` t21 ON t1.`USER_ID` = t21.`ID` 
LEFT JOIN `hr_department` t31 ON t1.`DEPARTMENT_ID` = t31.`ID` 

```

#### 默认（全部数据）(VIEW) :id=hr_employee-View
```sql
SELECT
t1.`ACTIVE`,
t1.`ADDITIONAL_NOTE`,
t1.`BARCODE`,
t1.`BIRTHDAY`,
t1.`CERTIFICATE`,
t1.`CHILDREN`,
t1.`COLOR`,
t1.`COMPANY_ID`,
t11.`NAME` AS `COMPANY_NAME`,
t1.`CONTRACT_WARNING`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DEPARTMENT_ID`,
t31.`NAME` AS `DEPARTMENT_NAME`,
t1.`DEPARTURE_DATE`,
t1.`DEPARTURE_DESCRIPTION`,
t1.`DISTANCE_HOME_WORK`,
t1.`DISTANCE_HOME_WORK_UNIT`,
t1.`EDUCATION_LEVEL`,
t1.`EMERGENCY_CONTACT`,
t1.`EMERGENCY_PHONE`,
t1.`EMPLOYEE_TYPE`,
t1.`FIRST_CONTRACT_DATE`,
t1.`GENDER`,
t1.`HR_JOB_ID`,
t1.`ID`,
t1.`IDENTIFICATION_ID`,
t1.`IDENTIFICATION_TYPE`,
t1.`IS_FLEXIBLE`,
t1.`IS_FULLY_FLEXIBLE`,
t1.`JOB_TITLE`,
t1.`JOIN_WORKDATE`,
t1.`KM_HOME_WORK`,
t1.`LEGAL_NAME`,
t1.`MAJOR`,
t1.`MARITAL_STATUS`,
t1.`MOBILE_PHONE`,
t1.`MOBILITY_CARD`,
t1.`NAME`,
t1.`NATION`,
t1.`NOTES`,
t1.`PARENT_PATH`,
t1.`PASSPORT_ID`,
t1.`PERMIT_NO`,
t1.`PIN`,
t1.`PLACE_OF_BIRTH`,
t1.`PRIVATE_CAR_PLATE`,
t1.`PRIVATE_CITY`,
t1.`PRIVATE_EMAIL`,
t1.`PRIVATE_PHONE`,
t1.`PRIVATE_STREET`,
t1.`PRIVATE_STREET2`,
t1.`PRIVATE_ZIP`,
t1.`SINID`,
t1.`SPOUSE_BIRTHDATE`,
t1.`SPOUSE_COMPLETE_NAME`,
t1.`SSNID`,
t1.`START_WORKDATE`,
t1.`STUDY_FIELD`,
t1.`STUDY_SCHOOL`,
t1.`USER_ID`,
t21.`DISPLAY_NAME` AS `USER_NAME`,
t1.`VEHICLE`,
t1.`VISA_EXPIRE`,
t1.`VISA_NO`,
t1.`WORK_EMAIL`,
t1.`WORK_PERMIT_EXPIRATION_DATE`,
t1.`WORK_PERMIT_SCHEDULED_ACTIVITY`,
t1.`WORK_PHONE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_employee` t1 
LEFT JOIN `res_company` t11 ON t1.`COMPANY_ID` = t11.`ID` 
LEFT JOIN `res_users` t21 ON t1.`USER_ID` = t21.`ID` 
LEFT JOIN `hr_department` t31 ON t1.`DEPARTMENT_ID` = t31.`ID` 

```


## [ 技能历史(HR_EMPLOYEE_SKILL_LOG)](module/hr/hr_employee_skill_log.md) :id=hr_employee_skill_log

#### 数据查询(DEFAULT) :id=hr_employee_skill_log-Default
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE`,
t1.`EMPLOYEE_ID`,
t1.`ID`,
t1.`SKILL_ID`,
t1.`SKILL_LEVEL_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_employee_skill_log` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_employee_skill_log-View
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE`,
t1.`EMPLOYEE_ID`,
t1.`ID`,
t1.`SKILL_ID`,
t1.`SKILL_LEVEL_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_employee_skill_log` t1 

```


## [考试/测评(HR_EXAM)](module/hr/hr_exam.md) :id=hr_exam

#### 数据查询(DEFAULT) :id=hr_exam-Default
```sql
SELECT
t11.`ADDRESS`,
t1.`ANSWERLINK`,
t1.`APPLICANT_ID`,
t1.`ATTACHMENT`,
t11.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_TIME`,
t1.`CREATE_UID`,
t1.`DETAIL_RESULT`,
t11.`EDUCATION`,
t11.`EMAIL_FROM`,
t11.`EXPERIENCE`,
t1.`FINISH_TIME`,
t1.`ID`,
t21.`NAME` AS `JOB_NAME`,
t31.`NAME` AS `JOB_PLATFORM_NAME`,
t11.`LAST_EDU_ACADEMIC_DEGREE`,
t11.`MOBILE_PHONE`,
t1.`NAME`,
t1.`RESULT`,
t1.`SOURCE`,
t1.`STATUS`,
t1.`TYPE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_exam` t1 
LEFT JOIN `hr_applicant` t11 ON t1.`APPLICANT_ID` = t11.`ID` 
LEFT JOIN `hr_job` t21 ON t11.`JOB_ID` = t21.`ID` 
LEFT JOIN `hr_job_platform` t31 ON t11.`JOB_PLATFORM_ID` = t31.`ID` 

```

#### 默认（全部数据）(VIEW) :id=hr_exam-View
```sql
SELECT
t11.`ADDRESS`,
t1.`ANSWERLINK`,
t1.`APPLICANT_ID`,
t1.`ATTACHMENT`,
t11.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_TIME`,
t1.`CREATE_UID`,
t11.`DESCRIPTION`,
t1.`DETAIL_RESULT`,
t11.`EDUCATION`,
t11.`EMAIL_FROM`,
t11.`EXPERIENCE`,
t1.`FINISH_TIME`,
t1.`ID`,
t21.`NAME` AS `JOB_NAME`,
t31.`NAME` AS `JOB_PLATFORM_NAME`,
t11.`LAST_EDU_ACADEMIC_DEGREE`,
t11.`MOBILE_PHONE`,
t1.`NAME`,
t1.`RESULT`,
t1.`SOURCE`,
t1.`STATUS`,
t1.`TYPE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_exam` t1 
LEFT JOIN `hr_applicant` t11 ON t1.`APPLICANT_ID` = t11.`ID` 
LEFT JOIN `hr_job` t21 ON t11.`JOB_ID` = t21.`ID` 
LEFT JOIN `hr_job_platform` t31 ON t11.`JOB_PLATFORM_ID` = t31.`ID` 

```

#### 用人经理数据集(hm_myself) :id=hr_exam-hm_myself
```sql
SELECT
t11.`ADDRESS`,
t1.`ANSWERLINK`,
t1.`APPLICANT_ID`,
t1.`ATTACHMENT`,
t11.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_TIME`,
t1.`CREATE_UID`,
t1.`DETAIL_RESULT`,
t11.`EDUCATION`,
t11.`EMAIL_FROM`,
t11.`EXPERIENCE`,
t1.`FINISH_TIME`,
t1.`ID`,
t21.`NAME` AS `JOB_NAME`,
t31.`NAME` AS `JOB_PLATFORM_NAME`,
t11.`LAST_EDU_ACADEMIC_DEGREE`,
t11.`MOBILE_PHONE`,
t1.`NAME`,
t1.`RESULT`,
t1.`SOURCE`,
t1.`STATUS`,
t1.`TYPE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_exam` t1 
LEFT JOIN `hr_applicant` t11 ON t1.`APPLICANT_ID` = t11.`ID` 
LEFT JOIN `hr_job` t21 ON t11.`JOB_ID` = t21.`ID` 
LEFT JOIN `hr_job_platform` t31 ON t11.`JOB_PLATFORM_ID` = t31.`ID` 

WHERE ( t1.`CREATE_UID` = #{ctx.sessioncontext.srfuserid} )
```

#### 待反馈(unevaluated) :id=hr_exam-unevaluated
```sql
SELECT
t11.`ADDRESS`,
t1.`ANSWERLINK`,
t1.`APPLICANT_ID`,
t1.`ATTACHMENT`,
t11.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_TIME`,
t1.`CREATE_UID`,
t1.`DETAIL_RESULT`,
t11.`EDUCATION`,
t11.`EMAIL_FROM`,
t11.`EXPERIENCE`,
t1.`FINISH_TIME`,
t1.`ID`,
t21.`NAME` AS `JOB_NAME`,
t31.`NAME` AS `JOB_PLATFORM_NAME`,
t11.`LAST_EDU_ACADEMIC_DEGREE`,
t11.`MOBILE_PHONE`,
t1.`NAME`,
t1.`RESULT`,
t1.`SOURCE`,
t1.`STATUS`,
t1.`TYPE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_exam` t1 
LEFT JOIN `hr_applicant` t11 ON t1.`APPLICANT_ID` = t11.`ID` 
LEFT JOIN `hr_job` t21 ON t11.`JOB_ID` = t21.`ID` 
LEFT JOIN `hr_job_platform` t31 ON t11.`JOB_PLATFORM_ID` = t31.`ID` 

WHERE ( t1.`STATUS` = '10'  AND  t1.`CREATE_UID` = #{ctx.sessioncontext.srfuserid} )
```


## [招聘需求(HR_IDEA)](module/hr/hr_idea.md) :id=hr_idea

#### 招聘_未进行(notstarted) :id=hr_idea-DataQuery2
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_CODE`,
t1.`EDUCATION`,
t1.`ID`,
t1.`IDENTIFIER`,
t1.`JOB_NAME`,
t1.`JOB_TYPE`,
t1.`MANAGEMENT_RANK_IDS`,
t1.`MANAGER_EMPLOYEE_IDS`,
t1.`MAX_SALARY`,
t1.`MIN_SALARY`,
t1.`NAME`,
t1.`NEED_NUMBER`,
t1.`PAYMENTMETHOD`,
t1.`PAYPERIOD`,
t1.`PROFESSIONAL_RANK_IDS`,
t1.`SALARY_UNIT`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_idea` t1 

WHERE ( t1.`STATUS` = 'unstart' )
```

#### 招聘_进行中(started) :id=hr_idea-DataQuery3
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_CODE`,
t1.`EDUCATION`,
t1.`ID`,
t1.`IDENTIFIER`,
t1.`JOB_NAME`,
t1.`JOB_TYPE`,
t1.`MANAGEMENT_RANK_IDS`,
t1.`MANAGER_EMPLOYEE_IDS`,
t1.`MAX_SALARY`,
t1.`MIN_SALARY`,
t1.`NAME`,
t1.`NEED_NUMBER`,
t1.`PAYMENTMETHOD`,
t1.`PAYPERIOD`,
t1.`PROFESSIONAL_RANK_IDS`,
t1.`SALARY_UNIT`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_idea` t1 

WHERE ( t1.`STATUS` = 'ongoing' )
```

#### 招聘_草稿(Draft) :id=hr_idea-DataQuery4
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_CODE`,
t1.`EDUCATION`,
t1.`ID`,
t1.`IDENTIFIER`,
t1.`JOB_NAME`,
t1.`JOB_TYPE`,
t1.`MANAGEMENT_RANK_IDS`,
t1.`MANAGER_EMPLOYEE_IDS`,
t1.`MAX_SALARY`,
t1.`MIN_SALARY`,
t1.`NAME`,
t1.`NEED_NUMBER`,
t1.`PAYMENTMETHOD`,
t1.`PAYPERIOD`,
t1.`PROFESSIONAL_RANK_IDS`,
t1.`SALARY_UNIT`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_idea` t1 

WHERE ( t1.`STATUS` = 'draft' )
```

#### 招聘_暂停(Paused) :id=hr_idea-DataQuery5
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_CODE`,
t1.`EDUCATION`,
t1.`ID`,
t1.`IDENTIFIER`,
t1.`JOB_NAME`,
t1.`JOB_TYPE`,
t1.`MANAGEMENT_RANK_IDS`,
t1.`MANAGER_EMPLOYEE_IDS`,
t1.`MAX_SALARY`,
t1.`MIN_SALARY`,
t1.`NAME`,
t1.`NEED_NUMBER`,
t1.`PAYMENTMETHOD`,
t1.`PAYPERIOD`,
t1.`PROFESSIONAL_RANK_IDS`,
t1.`SALARY_UNIT`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_idea` t1 

WHERE ( t1.`STATUS` = 'suspend' )
```

#### 招聘_已完成(Completed) :id=hr_idea-DataQuery6
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_CODE`,
t1.`EDUCATION`,
t1.`ID`,
t1.`IDENTIFIER`,
t1.`JOB_NAME`,
t1.`JOB_TYPE`,
t1.`MANAGEMENT_RANK_IDS`,
t1.`MANAGER_EMPLOYEE_IDS`,
t1.`MAX_SALARY`,
t1.`MIN_SALARY`,
t1.`NAME`,
t1.`NEED_NUMBER`,
t1.`PAYMENTMETHOD`,
t1.`PAYPERIOD`,
t1.`PROFESSIONAL_RANK_IDS`,
t1.`SALARY_UNIT`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_idea` t1 

WHERE ( t1.`STATUS` = 'complete' )
```

#### 招聘_已取消(Canceled) :id=hr_idea-DataQuery7
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_CODE`,
t1.`EDUCATION`,
t1.`ID`,
t1.`IDENTIFIER`,
t1.`JOB_NAME`,
t1.`JOB_TYPE`,
t1.`MANAGEMENT_RANK_IDS`,
t1.`MANAGER_EMPLOYEE_IDS`,
t1.`MAX_SALARY`,
t1.`MIN_SALARY`,
t1.`NAME`,
t1.`NEED_NUMBER`,
t1.`PAYMENTMETHOD`,
t1.`PAYPERIOD`,
t1.`PROFESSIONAL_RANK_IDS`,
t1.`SALARY_UNIT`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_idea` t1 

WHERE ( t1.`STATUS` = 'canceled' )
```

#### 招聘_已超期(Overdue) :id=hr_idea-DataQuery8
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_CODE`,
t1.`EDUCATION`,
t1.`ID`,
t1.`IDENTIFIER`,
t1.`JOB_NAME`,
t1.`JOB_TYPE`,
t1.`MANAGEMENT_RANK_IDS`,
t1.`MANAGER_EMPLOYEE_IDS`,
t1.`MAX_SALARY`,
t1.`MIN_SALARY`,
t1.`NAME`,
t1.`NEED_NUMBER`,
t1.`PAYMENTMETHOD`,
t1.`PAYPERIOD`,
t1.`PROFESSIONAL_RANK_IDS`,
t1.`SALARY_UNIT`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_idea` t1 

WHERE ( t1.`STATUS` = 'timeout' )
```

#### 数据查询(DEFAULT) :id=hr_idea-Default
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_CODE`,
t1.`EDUCATION`,
t1.`ID`,
t1.`IDENTIFIER`,
t1.`JOB_NAME`,
t1.`JOB_TYPE`,
t1.`MANAGEMENT_RANK_IDS`,
t1.`MANAGER_EMPLOYEE_IDS`,
t1.`MAX_SALARY`,
t1.`MIN_SALARY`,
t1.`NAME`,
t1.`NEED_NUMBER`,
t1.`PAYMENTMETHOD`,
t1.`PAYPERIOD`,
t1.`PROFESSIONAL_RANK_IDS`,
t1.`SALARY_UNIT`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_idea` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_idea-View
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_CODE`,
t1.`DESCRIPTION`,
t1.`EDUCATION`,
t1.`ID`,
t1.`IDENTIFIER`,
t1.`JOB_NAME`,
t1.`JOB_TYPE`,
t1.`MANAGEMENT_RANK_IDS`,
t1.`MANAGER_EMPLOYEE_IDS`,
t1.`MAX_SALARY`,
t1.`MIN_SALARY`,
t1.`NAME`,
t1.`NEED_NUMBER`,
t1.`PAYMENTMETHOD`,
t1.`PAYPERIOD`,
t1.`PROFESSIONAL_RANK_IDS`,
t1.`SALARY_UNIT`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_idea` t1 

```


## [需求与职位关系(HR_IDEA_JOB)](module/hr/hr_idea_job.md) :id=hr_idea_job

#### 数据查询(DEFAULT) :id=hr_idea_job-Default
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

#### 默认（全部数据）(VIEW) :id=hr_idea_job-View
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


## [面试(HR_INTERVIEW)](module/hr/hr_interview.md) :id=hr_interview

#### 数据查询(DEFAULT) :id=hr_interview-Default
```sql
SELECT
t11.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DURATION`,
t1.`ID`,
t1.`INTERVIEWERS`,
t11.`INTERVIEW_TYPE`,
t1.`MEETING_ID`,
t1.`NAME`,
t1.`OWNER_ID`,
t21.`NAME` AS `OWNER_NAME`,
t1.`SCHEDULE_ID`,
t1.`STAGE_ID`,
t11.`START_DATE`,
t1.`START_TIME`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview` t1 
LEFT JOIN `hr_interview_schedule` t11 ON t1.`SCHEDULE_ID` = t11.`ID` 
LEFT JOIN `hr_employee` t21 ON t1.`OWNER_ID` = t21.`ID` 

```

#### 默认（全部数据）(VIEW) :id=hr_interview-View
```sql
SELECT
t11.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DURATION`,
t1.`ID`,
t1.`INTERVIEWERS`,
t11.`INTERVIEW_TYPE`,
t1.`MEETING_ID`,
t1.`NAME`,
t1.`OWNER_ID`,
t21.`NAME` AS `OWNER_NAME`,
t1.`SCHEDULE_ID`,
t1.`STAGE_ID`,
t11.`START_DATE`,
t1.`START_TIME`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview` t1 
LEFT JOIN `hr_interview_schedule` t11 ON t1.`SCHEDULE_ID` = t11.`ID` 
LEFT JOIN `hr_employee` t21 ON t1.`OWNER_ID` = t21.`ID` 

```

#### 今后之后的面试(AFTER_INTERVIEW) :id=hr_interview-after_interview
```sql
SELECT
t11.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DURATION`,
t1.`ID`,
t1.`INTERVIEWERS`,
t11.`INTERVIEW_TYPE`,
t1.`MEETING_ID`,
t1.`NAME`,
t1.`OWNER_ID`,
t21.`NAME` AS `OWNER_NAME`,
t1.`SCHEDULE_ID`,
t1.`STAGE_ID`,
t11.`START_DATE`,
t1.`START_TIME`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview` t1 
LEFT JOIN `hr_interview_schedule` t11 ON t1.`SCHEDULE_ID` = t11.`ID` 
LEFT JOIN `hr_employee` t21 ON t1.`OWNER_ID` = t21.`ID` 

WHERE ( t11.start_date > current_date )
```

#### 今天之前的面试(BEFORE_INTERVIEW) :id=hr_interview-before_interview
```sql
SELECT
t11.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DURATION`,
t1.`ID`,
t1.`INTERVIEWERS`,
t11.`INTERVIEW_TYPE`,
t1.`MEETING_ID`,
t1.`NAME`,
t1.`OWNER_ID`,
t21.`NAME` AS `OWNER_NAME`,
t1.`SCHEDULE_ID`,
t1.`STAGE_ID`,
t11.`START_DATE`,
t1.`START_TIME`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview` t1 
LEFT JOIN `hr_interview_schedule` t11 ON t1.`SCHEDULE_ID` = t11.`ID` 
LEFT JOIN `hr_employee` t21 ON t1.`OWNER_ID` = t21.`ID` 

WHERE ( t11.start_date < current_date )
```

#### bi_search :id=hr_interview-bi_search
```sql
SELECT
t11.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DURATION`,
t1.`ID`,
t1.`INTERVIEWERS`,
t11.`INTERVIEW_TYPE`,
t1.`MEETING_ID`,
t1.`NAME`,
t1.`OWNER_ID`,
t21.`NAME` AS `OWNER_NAME`,
t1.`SCHEDULE_ID`,
t1.`STAGE_ID`,
t11.`START_DATE`,
t1.`START_TIME`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview` t1 
LEFT JOIN `hr_interview_schedule` t11 ON t1.`SCHEDULE_ID` = t11.`ID` 
LEFT JOIN `hr_employee` t21 ON t1.`OWNER_ID` = t21.`ID` 

```

#### 今天的面试(CURRENT_INTERVIEW) :id=hr_interview-current_interview
```sql
SELECT
t11.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DURATION`,
t1.`ID`,
t1.`INTERVIEWERS`,
t11.`INTERVIEW_TYPE`,
t1.`MEETING_ID`,
t1.`NAME`,
t1.`OWNER_ID`,
t21.`NAME` AS `OWNER_NAME`,
t1.`SCHEDULE_ID`,
t1.`STAGE_ID`,
t11.`START_DATE`,
t1.`START_TIME`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview` t1 
LEFT JOIN `hr_interview_schedule` t11 ON t1.`SCHEDULE_ID` = t11.`ID` 
LEFT JOIN `hr_employee` t21 ON t1.`OWNER_ID` = t21.`ID` 

WHERE ( t11.start_date = current_date )
```

#### 查询我的面试(MY_INTERVIEW) :id=hr_interview-my_interview
```sql
SELECT
t11.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DURATION`,
t1.`ID`,
t1.`INTERVIEWERS`,
t11.`INTERVIEW_TYPE`,
t1.`MEETING_ID`,
t1.`NAME`,
t1.`OWNER_ID`,
t21.`NAME` AS `OWNER_NAME`,
t1.`SCHEDULE_ID`,
t1.`STAGE_ID`,
t11.`START_DATE`,
t1.`START_TIME`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview` t1 
LEFT JOIN `hr_interview_schedule` t11 ON t1.`SCHEDULE_ID` = t11.`ID` 
LEFT JOIN `hr_employee` t21 ON t1.`OWNER_ID` = t21.`ID` 

```


## [面试反馈(HR_INTERVIEW_FEEDBACK)](module/hr/hr_interview_feedback.md) :id=hr_interview_feedback

#### 数据查询(DEFAULT) :id=hr_interview_feedback-Default
```sql
SELECT
t21.`ADDRESS`,
t41.`ADDRESS_ID`,
t1.`APPLICANT_ID`,
t1.`APPLICANT_INTERVIEW_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
datediff(t41.`START_DATE`,sysdate()) AS `DAYCALC`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`ID`,
t1.`INTERVIEWER_ID`,
t81.`NAME` AS `INTERVIEWER_NAME`,
t1.`INTERVIEW_ID`,
t41.`INTERVIEW_TYPE`,
t1.`INTERVIEW_USER_ID`,
t1.`IS_NEXT_ROUND`,
t21.`JOB_ID`,
t51.`NAME` AS `JOB_NAME`,
t71.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t21.`OWNER_ID`,
t61.`NAME` AS `OWNER_NAME`,
t1.`RESULT_TYPE`,
t31.`STAGE_ID`,
t41.`START_DATE`,
t31.`START_TIME`,
t31.`STATUS`,
t11.`VIDEO_URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview_feedback` t1 
LEFT JOIN `hr_interview_user` t11 ON t1.`INTERVIEW_USER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_interview` t31 ON t1.`INTERVIEW_ID` = t31.`ID` 
LEFT JOIN `hr_interview_schedule` t41 ON t31.`SCHEDULE_ID` = t41.`ID` 
LEFT JOIN `hr_job` t51 ON t21.`JOB_ID` = t51.`ID` 
LEFT JOIN `hr_employee` t61 ON t21.`OWNER_ID` = t61.`ID` 
LEFT JOIN `hr_job_platform` t71 ON t21.`JOB_PLATFORM_ID` = t71.`ID` 
LEFT JOIN `hr_employee` t81 ON t1.`INTERVIEWER_ID` = t81.`ID` 

```

#### 默认（全部数据）(VIEW) :id=hr_interview_feedback-View
```sql
SELECT
t21.`ADDRESS`,
t41.`ADDRESS_ID`,
t1.`APPLICANT_ID`,
t1.`APPLICANT_INTERVIEW_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
datediff(t41.`START_DATE`,sysdate()) AS `DAYCALC`,
t21.`DESCRIPTION`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`ID`,
t1.`INTERVIEWER_ID`,
t81.`NAME` AS `INTERVIEWER_NAME`,
t1.`INTERVIEW_ID`,
t41.`INTERVIEW_TYPE`,
t1.`INTERVIEW_USER_ID`,
t1.`IS_NEXT_ROUND`,
t21.`JOB_ID`,
t51.`NAME` AS `JOB_NAME`,
t71.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t21.`OWNER_ID`,
t61.`NAME` AS `OWNER_NAME`,
t1.`RESULT_TYPE`,
t31.`STAGE_ID`,
t41.`START_DATE`,
t31.`START_TIME`,
t31.`STATUS`,
t11.`VIDEO_URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview_feedback` t1 
LEFT JOIN `hr_interview_user` t11 ON t1.`INTERVIEW_USER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_interview` t31 ON t1.`INTERVIEW_ID` = t31.`ID` 
LEFT JOIN `hr_interview_schedule` t41 ON t31.`SCHEDULE_ID` = t41.`ID` 
LEFT JOIN `hr_job` t51 ON t21.`JOB_ID` = t51.`ID` 
LEFT JOIN `hr_employee` t61 ON t21.`OWNER_ID` = t61.`ID` 
LEFT JOIN `hr_job_platform` t71 ON t21.`JOB_PLATFORM_ID` = t71.`ID` 
LEFT JOIN `hr_employee` t81 ON t1.`INTERVIEWER_ID` = t81.`ID` 

```

#### 今后的面试(after_interview) :id=hr_interview_feedback-after_interview
```sql
SELECT
t21.`ADDRESS`,
t41.`ADDRESS_ID`,
t1.`APPLICANT_ID`,
t1.`APPLICANT_INTERVIEW_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
datediff(t41.`START_DATE`,sysdate()) AS `DAYCALC`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`ID`,
t1.`INTERVIEWER_ID`,
t81.`NAME` AS `INTERVIEWER_NAME`,
t1.`INTERVIEW_ID`,
t41.`INTERVIEW_TYPE`,
t1.`INTERVIEW_USER_ID`,
t1.`IS_NEXT_ROUND`,
t21.`JOB_ID`,
t51.`NAME` AS `JOB_NAME`,
t71.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t21.`OWNER_ID`,
t61.`NAME` AS `OWNER_NAME`,
t1.`RESULT_TYPE`,
t31.`STAGE_ID`,
t41.`START_DATE`,
t31.`START_TIME`,
t31.`STATUS`,
t11.`VIDEO_URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview_feedback` t1 
LEFT JOIN `hr_interview_user` t11 ON t1.`INTERVIEW_USER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_interview` t31 ON t1.`INTERVIEW_ID` = t31.`ID` 
LEFT JOIN `hr_interview_schedule` t41 ON t31.`SCHEDULE_ID` = t41.`ID` 
LEFT JOIN `hr_job` t51 ON t21.`JOB_ID` = t51.`ID` 
LEFT JOIN `hr_employee` t61 ON t21.`OWNER_ID` = t61.`ID` 
LEFT JOIN `hr_job_platform` t71 ON t21.`JOB_PLATFORM_ID` = t71.`ID` 
LEFT JOIN `hr_employee` t81 ON t1.`INTERVIEWER_ID` = t81.`ID` 

WHERE ( t41.start_date > current_date )
```

#### 之前的面试(before_interview) :id=hr_interview_feedback-before_interview
```sql
SELECT
t21.`ADDRESS`,
t41.`ADDRESS_ID`,
t1.`APPLICANT_ID`,
t1.`APPLICANT_INTERVIEW_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
datediff(t41.`START_DATE`,sysdate()) AS `DAYCALC`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`ID`,
t1.`INTERVIEWER_ID`,
t81.`NAME` AS `INTERVIEWER_NAME`,
t1.`INTERVIEW_ID`,
t41.`INTERVIEW_TYPE`,
t1.`INTERVIEW_USER_ID`,
t1.`IS_NEXT_ROUND`,
t21.`JOB_ID`,
t51.`NAME` AS `JOB_NAME`,
t71.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t21.`OWNER_ID`,
t61.`NAME` AS `OWNER_NAME`,
t1.`RESULT_TYPE`,
t31.`STAGE_ID`,
t41.`START_DATE`,
t31.`START_TIME`,
t31.`STATUS`,
t11.`VIDEO_URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview_feedback` t1 
LEFT JOIN `hr_interview_user` t11 ON t1.`INTERVIEW_USER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_interview` t31 ON t1.`INTERVIEW_ID` = t31.`ID` 
LEFT JOIN `hr_interview_schedule` t41 ON t31.`SCHEDULE_ID` = t41.`ID` 
LEFT JOIN `hr_job` t51 ON t21.`JOB_ID` = t51.`ID` 
LEFT JOIN `hr_employee` t61 ON t21.`OWNER_ID` = t61.`ID` 
LEFT JOIN `hr_job_platform` t71 ON t21.`JOB_PLATFORM_ID` = t71.`ID` 
LEFT JOIN `hr_employee` t81 ON t1.`INTERVIEWER_ID` = t81.`ID` 

WHERE ( t41.start_date < current_date )
```

#### 今天的面试(current_interview) :id=hr_interview_feedback-current_interview
```sql
SELECT
t21.`ADDRESS`,
t41.`ADDRESS_ID`,
t1.`APPLICANT_ID`,
t1.`APPLICANT_INTERVIEW_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
datediff(t41.`START_DATE`,sysdate()) AS `DAYCALC`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`ID`,
t1.`INTERVIEWER_ID`,
t81.`NAME` AS `INTERVIEWER_NAME`,
t1.`INTERVIEW_ID`,
t41.`INTERVIEW_TYPE`,
t1.`INTERVIEW_USER_ID`,
t1.`IS_NEXT_ROUND`,
t21.`JOB_ID`,
t51.`NAME` AS `JOB_NAME`,
t71.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t21.`OWNER_ID`,
t61.`NAME` AS `OWNER_NAME`,
t1.`RESULT_TYPE`,
t31.`STAGE_ID`,
t41.`START_DATE`,
t31.`START_TIME`,
t31.`STATUS`,
t11.`VIDEO_URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview_feedback` t1 
LEFT JOIN `hr_interview_user` t11 ON t1.`INTERVIEW_USER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_interview` t31 ON t1.`INTERVIEW_ID` = t31.`ID` 
LEFT JOIN `hr_interview_schedule` t41 ON t31.`SCHEDULE_ID` = t41.`ID` 
LEFT JOIN `hr_job` t51 ON t21.`JOB_ID` = t51.`ID` 
LEFT JOIN `hr_employee` t61 ON t21.`OWNER_ID` = t61.`ID` 
LEFT JOIN `hr_job_platform` t71 ON t21.`JOB_PLATFORM_ID` = t71.`ID` 
LEFT JOIN `hr_employee` t81 ON t1.`INTERVIEWER_ID` = t81.`ID` 

WHERE ( t41.start_date = current_date )
```

#### 用人经理_我的面试(interview_myself) :id=hr_interview_feedback-interview_myself
```sql
SELECT
t21.`ADDRESS`,
t41.`ADDRESS_ID`,
t1.`APPLICANT_ID`,
t1.`APPLICANT_INTERVIEW_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
datediff(t41.`START_DATE`,sysdate()) AS `DAYCALC`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`ID`,
t1.`INTERVIEWER_ID`,
t81.`NAME` AS `INTERVIEWER_NAME`,
t1.`INTERVIEW_ID`,
t41.`INTERVIEW_TYPE`,
t1.`INTERVIEW_USER_ID`,
t1.`IS_NEXT_ROUND`,
t21.`JOB_ID`,
t51.`NAME` AS `JOB_NAME`,
t71.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t21.`OWNER_ID`,
t61.`NAME` AS `OWNER_NAME`,
t1.`RESULT_TYPE`,
t31.`STAGE_ID`,
t41.`START_DATE`,
t31.`START_TIME`,
t31.`STATUS`,
t11.`VIDEO_URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview_feedback` t1 
LEFT JOIN `hr_interview_user` t11 ON t1.`INTERVIEW_USER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_interview` t31 ON t1.`INTERVIEW_ID` = t31.`ID` 
LEFT JOIN `hr_interview_schedule` t41 ON t31.`SCHEDULE_ID` = t41.`ID` 
LEFT JOIN `hr_job` t51 ON t21.`JOB_ID` = t51.`ID` 
LEFT JOIN `hr_employee` t61 ON t21.`OWNER_ID` = t61.`ID` 
LEFT JOIN `hr_job_platform` t71 ON t21.`JOB_PLATFORM_ID` = t71.`ID` 
LEFT JOIN `hr_employee` t81 ON t1.`INTERVIEWER_ID` = t81.`ID` 

WHERE ( t1.`INTERVIEWER_ID` = #{ctx.sessioncontext.srfuserid} )
```

#### 我通过的面试(my_pass_interview) :id=hr_interview_feedback-my_pass_interview
```sql
SELECT
t21.`ADDRESS`,
t41.`ADDRESS_ID`,
t1.`APPLICANT_ID`,
t1.`APPLICANT_INTERVIEW_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
datediff(t41.`START_DATE`,sysdate()) AS `DAYCALC`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`ID`,
t1.`INTERVIEWER_ID`,
t81.`NAME` AS `INTERVIEWER_NAME`,
t1.`INTERVIEW_ID`,
t41.`INTERVIEW_TYPE`,
t1.`INTERVIEW_USER_ID`,
t1.`IS_NEXT_ROUND`,
t21.`JOB_ID`,
t51.`NAME` AS `JOB_NAME`,
t71.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t21.`OWNER_ID`,
t61.`NAME` AS `OWNER_NAME`,
t1.`RESULT_TYPE`,
t31.`STAGE_ID`,
t41.`START_DATE`,
t31.`START_TIME`,
t31.`STATUS`,
t11.`VIDEO_URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview_feedback` t1 
LEFT JOIN `hr_interview_user` t11 ON t1.`INTERVIEW_USER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_interview` t31 ON t1.`INTERVIEW_ID` = t31.`ID` 
LEFT JOIN `hr_interview_schedule` t41 ON t31.`SCHEDULE_ID` = t41.`ID` 
LEFT JOIN `hr_job` t51 ON t21.`JOB_ID` = t51.`ID` 
LEFT JOIN `hr_employee` t61 ON t21.`OWNER_ID` = t61.`ID` 
LEFT JOIN `hr_job_platform` t71 ON t21.`JOB_PLATFORM_ID` = t71.`ID` 
LEFT JOIN `hr_employee` t81 ON t1.`INTERVIEWER_ID` = t81.`ID` 

WHERE ( t1.`RESULT_TYPE` = '1'  AND  t1.`INTERVIEWER_ID` = #{ctx.sessioncontext.srfuserid} )
```

#### 未评价(unevaluated) :id=hr_interview_feedback-unevaluated
```sql
SELECT
t21.`ADDRESS`,
t41.`ADDRESS_ID`,
t1.`APPLICANT_ID`,
t1.`APPLICANT_INTERVIEW_ID`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
datediff(t41.`START_DATE`,sysdate()) AS `DAYCALC`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`ID`,
t1.`INTERVIEWER_ID`,
t81.`NAME` AS `INTERVIEWER_NAME`,
t1.`INTERVIEW_ID`,
t41.`INTERVIEW_TYPE`,
t1.`INTERVIEW_USER_ID`,
t1.`IS_NEXT_ROUND`,
t21.`JOB_ID`,
t51.`NAME` AS `JOB_NAME`,
t71.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`LAST_EDU_ACADEMIC_DEGREE`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t21.`OWNER_ID`,
t61.`NAME` AS `OWNER_NAME`,
t1.`RESULT_TYPE`,
t31.`STAGE_ID`,
t41.`START_DATE`,
t31.`START_TIME`,
t31.`STATUS`,
t11.`VIDEO_URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview_feedback` t1 
LEFT JOIN `hr_interview_user` t11 ON t1.`INTERVIEW_USER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t1.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_interview` t31 ON t1.`INTERVIEW_ID` = t31.`ID` 
LEFT JOIN `hr_interview_schedule` t41 ON t31.`SCHEDULE_ID` = t41.`ID` 
LEFT JOIN `hr_job` t51 ON t21.`JOB_ID` = t51.`ID` 
LEFT JOIN `hr_employee` t61 ON t21.`OWNER_ID` = t61.`ID` 
LEFT JOIN `hr_job_platform` t71 ON t21.`JOB_PLATFORM_ID` = t71.`ID` 
LEFT JOIN `hr_employee` t81 ON t1.`INTERVIEWER_ID` = t81.`ID` 

WHERE ( t1.`RESULT_TYPE` IS NULL  AND  t1.`INTERVIEWER_ID` = #{ctx.sessioncontext.srfuserid} )
```


## [面试安排(HR_INTERVIEW_SCHEDULE)](module/hr/hr_interview_schedule.md) :id=hr_interview_schedule

#### 数据查询(DEFAULT) :id=hr_interview_schedule-Default
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`APPLICANT_ID`,
t1.`ATTACHMENT`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EMAIL_CONTENT`,
t1.`EMAIL_TEMPLATE_ID`,
t1.`ID`,
t1.`INTERVIEW_CATEGORY`,
t1.`INTERVIEW_TYPE`,
t1.`IS_SEND_EMAIL`,
t1.`IS_SEND_SMS`,
t1.`NAME`,
t1.`RESUME_TYPE`,
t1.`SMS_CONTENT`,
t1.`SMS_TEMPLATE_ID`,
t1.`START_DATE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview_schedule` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_interview_schedule-View
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`APPLICANT_ID`,
t1.`ATTACHMENT`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EMAIL_CONTENT`,
t1.`EMAIL_TEMPLATE_ID`,
t1.`ID`,
t1.`INTERVIEW_CATEGORY`,
t1.`INTERVIEW_TYPE`,
t1.`IS_SEND_EMAIL`,
t1.`IS_SEND_SMS`,
t1.`NAME`,
t1.`RESUME_TYPE`,
t1.`SMS_CONTENT`,
t1.`SMS_TEMPLATE_ID`,
t1.`START_DATE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview_schedule` t1 

```


## [面试参与者(HR_INTERVIEW_USER)](module/hr/hr_interview_user.md) :id=hr_interview_user

#### 数据查询(DEFAULT) :id=hr_interview_user-Default
```sql
SELECT
t1.`APPLICANT_ID`,
t11.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`INTERVIEW_ID`,
t21.`NAME` AS `JOB_NAME`,
t11.`MOBILE_PHONE`,
t1.`NAME`,
t1.`USER_ID`,
t1.`USER_NAME`,
t1.`USER_STATUS`,
t1.`USER_TYPE`,
t1.`VIDEO_URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview_user` t1 
LEFT JOIN `hr_applicant` t11 ON t1.`APPLICANT_ID` = t11.`ID` 
LEFT JOIN `hr_job` t21 ON t11.`JOB_ID` = t21.`ID` 

```

#### 默认（全部数据）(VIEW) :id=hr_interview_user-View
```sql
SELECT
t1.`APPLICANT_ID`,
t11.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`INTERVIEW_ID`,
t21.`NAME` AS `JOB_NAME`,
t11.`MOBILE_PHONE`,
t1.`NAME`,
t1.`USER_ID`,
t1.`USER_NAME`,
t1.`USER_STATUS`,
t1.`USER_TYPE`,
t1.`VIDEO_URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview_user` t1 
LEFT JOIN `hr_applicant` t11 ON t1.`APPLICANT_ID` = t11.`ID` 
LEFT JOIN `hr_job` t21 ON t11.`JOB_ID` = t21.`ID` 

```

#### 候选人(CANDIDATE) :id=hr_interview_user-candidate
```sql
SELECT
t1.`APPLICANT_ID`,
t11.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`INTERVIEW_ID`,
t21.`NAME` AS `JOB_NAME`,
t11.`MOBILE_PHONE`,
t1.`NAME`,
t1.`USER_ID`,
t1.`USER_NAME`,
t1.`USER_STATUS`,
t1.`USER_TYPE`,
t1.`VIDEO_URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview_user` t1 
LEFT JOIN `hr_applicant` t11 ON t1.`APPLICANT_ID` = t11.`ID` 
LEFT JOIN `hr_job` t21 ON t11.`JOB_ID` = t21.`ID` 

WHERE ( t1.`USER_TYPE` = '2' )
```

#### 面试官(INTERVIEWER) :id=hr_interview_user-interviewer
```sql
SELECT
t1.`APPLICANT_ID`,
t11.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`INTERVIEW_ID`,
t21.`NAME` AS `JOB_NAME`,
t11.`MOBILE_PHONE`,
t1.`NAME`,
t1.`USER_ID`,
t1.`USER_NAME`,
t1.`USER_STATUS`,
t1.`USER_TYPE`,
t1.`VIDEO_URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_interview_user` t1 
LEFT JOIN `hr_applicant` t11 ON t1.`APPLICANT_ID` = t11.`ID` 
LEFT JOIN `hr_job` t21 ON t11.`JOB_ID` = t21.`ID` 

WHERE ( t1.`USER_TYPE` = '1' )
```


## [招聘职位(HR_JOB)](module/hr/hr_job.md) :id=hr_job

#### 数据查询(DEFAULT) :id=hr_job-Default
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`ASSISTANT_UID`,
t1.`CATEGORY`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_ID`,
t1.`EDUCATION`,
t1.`EXPECTED_EMPLOYEES`,
t1.`EXPERIENCE`,
t1.`FUNCTION_TYPE`,
(select count(1) from hr_applicant where job_id = t1.`ID` and stage_id = '90') AS `HIRED_EMPLOYEES`,
t1.`ID`,
t1.`INTERVIEWER_UID`,
t1.`IS_PUBLISH_HEADHUNTER`,
t1.`IS_PUBLISH_REFERRAL`,
t1.`IS_PUBLISH_SOCIAL`,
t1.`IS_VIRTUAL`,
t1.`JOB_RANK_IDS`,
t1.`JOB_TYPE`,
t1.`MANAGER_ID`,
t1.`MANAGER_UID`,
t1.`MAX_SALARY`,
t1.`MIN_SALARY`,
t1.`NAME`,
t1.`OWNER_ID`,
t1.`PRIORITY_ID`,
t1.`PROGRESS_ID`,
t11.`NAME` AS `PROGRESS_NAME`,
t1.`SOURCE_TYPE`,
t1.`STATUS`,
(select count(1) from hr_applicant where job_id =t1.`ID` and status = '1') AS `TOTAL_EMPLOYEES`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_job` t1 
LEFT JOIN `hr_recruitment_progress` t11 ON t1.`PROGRESS_ID` = t11.`ID` 

```

#### 默认（全部数据）(VIEW) :id=hr_job-View
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`ASSISTANT_UID`,
t1.`CATEGORY`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_ID`,
t1.`DESCRIPTION`,
t1.`EDUCATION`,
t1.`EXPECTED_EMPLOYEES`,
t1.`EXPERIENCE`,
t1.`FUNCTION_TYPE`,
(select count(1) from hr_applicant where job_id = t1.`ID` and stage_id = '90') AS `HIRED_EMPLOYEES`,
t1.`ID`,
t1.`INTERVIEWER_UID`,
t1.`IS_PUBLISH_HEADHUNTER`,
t1.`IS_PUBLISH_REFERRAL`,
t1.`IS_PUBLISH_SOCIAL`,
t1.`IS_VIRTUAL`,
t1.`JOB_RANK_IDS`,
t1.`JOB_TYPE`,
t1.`MANAGER_ID`,
t1.`MANAGER_UID`,
t1.`MAX_SALARY`,
t1.`MIN_SALARY`,
t1.`NAME`,
t1.`OWNER_ID`,
t1.`PRIORITY_ID`,
t1.`PROGRESS_ID`,
t11.`NAME` AS `PROGRESS_NAME`,
t1.`SOURCE_TYPE`,
t1.`STATUS`,
(select count(1) from hr_applicant where job_id =t1.`ID` and status = '1') AS `TOTAL_EMPLOYEES`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_job` t1 
LEFT JOIN `hr_recruitment_progress` t11 ON t1.`PROGRESS_ID` = t11.`ID` 

```

#### 全部数据（含渠道信息）(all) :id=hr_job-all
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`ASSISTANT_UID`,
t1.`CATEGORY`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_ID`,
t1.`EDUCATION`,
t1.`EXPECTED_EMPLOYEES`,
t1.`EXPERIENCE`,
t1.`FUNCTION_TYPE`,
(select count(1) from hr_applicant where job_id = t1.`ID` and stage_id = '90') AS `HIRED_EMPLOYEES`,
t1.`ID`,
t1.`INTERVIEWER_UID`,
t1.`IS_PUBLISH_HEADHUNTER`,
t1.`IS_PUBLISH_REFERRAL`,
t1.`IS_PUBLISH_SOCIAL`,
t1.`IS_VIRTUAL`,
t1.`JOB_RANK_IDS`,
t1.`JOB_TYPE`,
t1.`MANAGER_ID`,
t1.`MANAGER_UID`,
t1.`MAX_SALARY`,
t1.`MIN_SALARY`,
t1.`NAME`,
t1.`OWNER_ID`,
t1.`PRIORITY_ID`,
t1.`PROGRESS_ID`,
t11.`NAME` AS `PROGRESS_NAME`,
t1.`SOURCE_TYPE`,
t1.`STATUS`,
(select count(1) from hr_applicant where job_id =t1.`ID` and status = '1') AS `TOTAL_EMPLOYEES`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_job` t1 
LEFT JOIN `hr_recruitment_progress` t11 ON t1.`PROGRESS_ID` = t11.`ID` 

```

#### 招聘中(open) :id=hr_job-open
```sql
SELECT
t1.`ADDRESS_ID`,
t1.`ASSISTANT_UID`,
t1.`CATEGORY`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_ID`,
t1.`EDUCATION`,
t1.`EXPECTED_EMPLOYEES`,
t1.`EXPERIENCE`,
t1.`FUNCTION_TYPE`,
(select count(1) from hr_applicant where job_id = t1.`ID` and stage_id = '90') AS `HIRED_EMPLOYEES`,
t1.`ID`,
t1.`INTERVIEWER_UID`,
t1.`IS_PUBLISH_HEADHUNTER`,
t1.`IS_PUBLISH_REFERRAL`,
t1.`IS_PUBLISH_SOCIAL`,
t1.`IS_VIRTUAL`,
t1.`JOB_RANK_IDS`,
t1.`JOB_TYPE`,
t1.`MANAGER_ID`,
t1.`MANAGER_UID`,
t1.`MAX_SALARY`,
t1.`MIN_SALARY`,
t1.`NAME`,
t1.`OWNER_ID`,
t1.`PRIORITY_ID`,
t1.`PROGRESS_ID`,
t11.`NAME` AS `PROGRESS_NAME`,
t1.`SOURCE_TYPE`,
t1.`STATUS`,
(select count(1) from hr_applicant where job_id =t1.`ID` and status = '1') AS `TOTAL_EMPLOYEES`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_job` t1 
LEFT JOIN `hr_recruitment_progress` t11 ON t1.`PROGRESS_ID` = t11.`ID` 

WHERE ( t1.`STATUS` = 'open' )
```


## [招聘平台(HR_JOB_PLATFORM)](module/hr/hr_job_platform.md) :id=hr_job_platform

#### 数据查询(DEFAULT) :id=hr_job_platform-Default
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EMAIL`,
t1.`ID`,
t1.`IMAGE`,
t1.`NAME`,
(SELECT count(1) from hr_job_platform_account where Job_platform_id = t1.id ) AS `PLATFORM_ACCOUNT_COUNT`,
t1.`TYPE`,
t1.`URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_job_platform` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_job_platform-View
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EMAIL`,
t1.`ID`,
t1.`IMAGE`,
t1.`NAME`,
(SELECT count(1) from hr_job_platform_account where Job_platform_id = t1.id ) AS `PLATFORM_ACCOUNT_COUNT`,
t1.`TYPE`,
t1.`URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_job_platform` t1 

```

#### 职位发布情况(job_platform) :id=hr_job_platform-job_platform
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

#### 外部招聘平台(platform) :id=hr_job_platform-platform
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EMAIL`,
t1.`ID`,
t1.`IMAGE`,
t1.`NAME`,
(SELECT count(1) from hr_job_platform_account where Job_platform_id = t1.id ) AS `PLATFORM_ACCOUNT_COUNT`,
t1.`TYPE`,
t1.`URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_job_platform` t1 

WHERE ( t1.`TYPE` = '1' )
```

#### 社招官网(social) :id=hr_job_platform-social
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EMAIL`,
t1.`ID`,
t1.`IMAGE`,
t1.`NAME`,
(SELECT count(1) from hr_job_platform_account where Job_platform_id = t1.id ) AS `PLATFORM_ACCOUNT_COUNT`,
t1.`TYPE`,
t1.`URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_job_platform` t1 

WHERE ( t1.`TYPE` = '2' )
```


## [招聘平台账号(HR_JOB_PLATFORM_ACCOUNT)](module/hr/hr_job_platform_account.md) :id=hr_job_platform_account

#### 数据查询(DEFAULT) :id=hr_job_platform_account-Default
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

#### 默认（全部数据）(VIEW) :id=hr_job_platform_account-View
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

#### 账号发布状态(publish_status) :id=hr_job_platform_account-publish_status
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
t1.`WRITE_UID`,
(select case when count(1) >0 then '2' else '1'end  from hr_job_platform_record t where t.job_id =${srfwebcontext('hr_job_id','{"defname":"TYPE","dename":"HR_JOB_PLATFORM_ACCOUNT"}')} and t.owner_id = t1.id) AS `PUBLISH_STATUS`
FROM `hr_job_platform_account` t1 
LEFT JOIN `hr_job_platform` t11 ON t1.`JOB_PLATFORM_ID` = t11.`ID` 

```


## [招聘平台发布记录(HR_JOB_PLATFORM_RECORD)](module/hr/hr_job_platform_record.md) :id=hr_job_platform_record

#### 数据查询(DEFAULT) :id=hr_job_platform_record-Default
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

#### 默认（全部数据）(VIEW) :id=hr_job_platform_record-View
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


## [OFFER录用(HR_OFFER)](module/hr/hr_offer.md) :id=hr_offer

#### 数据查询(DEFAULT) :id=hr_offer-Default
```sql
SELECT
t11.`ADDRESS`,
t1.`ANNUAL_PERFORMANCE_BONUS`,
t1.`APPLICANT_ID`,
t1.`APPROVAL_ATTACHMENT`,
t1.`ATTACHMENT_PASSWORD`,
t1.`BANK_CARD_INFO`,
t11.`CANDIDATE_DISPLAY_NAME`,
t1.`CHECKINDATE`,
t1.`COMMUNICATION_ALLOWANCE`,
t1.`CONTRACT_TERM`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`CURRENT_EMPLOYER`,
t11.`EDUCATION`,
t11.`EMAIL_FROM`,
t1.`EMAIL_TEMPLATE`,
t11.`EXPERIENCE`,
t1.`HR_IDEA_ID`,
t1.`HR_IDEA_NAME`,
t1.`ID`,
t1.`IS_ENCRYPTED`,
t1.`IS_GENERATE_ATTACHMENT`,
t1.`JOB_NAME`,
t21.`NAME` AS `JOB_PLATFORM_NAME`,
t1.`JOB_RANK_ID`,
t1.`LOCATION_CITY`,
t1.`LOCATION_ID`,
t1.`MA_CURRENCY`,
t1.`MEAL_ALLOWANCE`,
t11.`MOBILE_PHONE`,
t1.`NAME`,
t1.`OFFER_ATTACHMENT_TEMPLATE`,
t1.`OFFER_TYPE`,
t1.`RES_COMPANY_ID`,
t31.`NAME` AS `RES_COMPANY_NAME`,
t1.`SALARY_1`,
t1.`SALARY_2`,
t1.`SALARY_3`,
t1.`SALARY_4`,
t1.`SALARY_5`,
t1.`SALARY_6`,
t1.`SALARY_METHOD`,
t1.`SALARY_TYPE`,
t1.`SMS_TEMPLATE`,
t1.`TRANSPORTATION_ALLOWANCE`,
t1.`WORKING_HOURS_AM`,
t1.`WORKING_HOURS_PM`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_offer` t1 
LEFT JOIN `hr_applicant` t11 ON t1.`APPLICANT_ID` = t11.`ID` 
LEFT JOIN `hr_job_platform` t21 ON t11.`JOB_PLATFORM_ID` = t21.`ID` 
LEFT JOIN `res_company` t31 ON t1.`RES_COMPANY_ID` = t31.`ID` 

```

#### 默认（全部数据）(VIEW) :id=hr_offer-View
```sql
SELECT
t11.`ADDRESS`,
t1.`ANNUAL_PERFORMANCE_BONUS`,
t1.`APPLICANT_ID`,
t1.`APPROVAL_ATTACHMENT`,
t1.`ATTACHMENT_PASSWORD`,
t1.`BANK_CARD_INFO`,
t11.`CANDIDATE_DISPLAY_NAME`,
t1.`CHECKINDATE`,
t1.`COMMUNICATION_ALLOWANCE`,
t1.`CONTRACT_TERM`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`CURRENT_EMPLOYER`,
t11.`EDUCATION`,
t1.`EMAIL_CONTENT`,
t11.`EMAIL_FROM`,
t1.`EMAIL_TEMPLATE`,
t11.`EXPERIENCE`,
t1.`HR_IDEA_ID`,
t1.`HR_IDEA_NAME`,
t1.`ID`,
t1.`IS_ENCRYPTED`,
t1.`IS_GENERATE_ATTACHMENT`,
t1.`JOB_NAME`,
t21.`NAME` AS `JOB_PLATFORM_NAME`,
t1.`JOB_RANK_ID`,
t1.`LOCATION_CITY`,
t1.`LOCATION_ID`,
t1.`MA_CURRENCY`,
t1.`MEAL_ALLOWANCE`,
t11.`MOBILE_PHONE`,
t1.`NAME`,
t1.`OFFER_ATTACHMENT_TEMPLATE`,
t1.`OFFER_TYPE`,
t1.`RES_COMPANY_ID`,
t31.`NAME` AS `RES_COMPANY_NAME`,
t1.`SALARY_1`,
t1.`SALARY_2`,
t1.`SALARY_3`,
t1.`SALARY_4`,
t1.`SALARY_5`,
t1.`SALARY_6`,
t1.`SALARY_METHOD`,
t1.`SALARY_TYPE`,
t1.`SMS_CONTENT`,
t1.`SMS_TEMPLATE`,
t1.`TRANSPORTATION_ALLOWANCE`,
t1.`WORKING_HOURS_AM`,
t1.`WORKING_HOURS_PM`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_offer` t1 
LEFT JOIN `hr_applicant` t11 ON t1.`APPLICANT_ID` = t11.`ID` 
LEFT JOIN `hr_job_platform` t21 ON t11.`JOB_PLATFORM_ID` = t21.`ID` 
LEFT JOIN `res_company` t31 ON t1.`RES_COMPANY_ID` = t31.`ID` 

```

#### bi_search :id=hr_offer-bi_search
```sql
SELECT
t11.`ADDRESS`,
t1.`ANNUAL_PERFORMANCE_BONUS`,
t1.`APPLICANT_ID`,
t1.`APPROVAL_ATTACHMENT`,
t1.`ATTACHMENT_PASSWORD`,
t1.`BANK_CARD_INFO`,
t11.`CANDIDATE_DISPLAY_NAME`,
t1.`CHECKINDATE`,
t1.`COMMUNICATION_ALLOWANCE`,
t1.`CONTRACT_TERM`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`CURRENT_EMPLOYER`,
t11.`EDUCATION`,
t11.`EMAIL_FROM`,
t1.`EMAIL_TEMPLATE`,
t11.`EXPERIENCE`,
t1.`HR_IDEA_ID`,
t1.`HR_IDEA_NAME`,
t1.`ID`,
t1.`IS_ENCRYPTED`,
t1.`IS_GENERATE_ATTACHMENT`,
t1.`JOB_NAME`,
t21.`NAME` AS `JOB_PLATFORM_NAME`,
t1.`JOB_RANK_ID`,
t1.`LOCATION_CITY`,
t1.`LOCATION_ID`,
t1.`MA_CURRENCY`,
t1.`MEAL_ALLOWANCE`,
t11.`MOBILE_PHONE`,
t1.`NAME`,
t1.`OFFER_ATTACHMENT_TEMPLATE`,
t1.`OFFER_TYPE`,
t1.`RES_COMPANY_ID`,
t31.`NAME` AS `RES_COMPANY_NAME`,
t1.`SALARY_1`,
t1.`SALARY_2`,
t1.`SALARY_3`,
t1.`SALARY_4`,
t1.`SALARY_5`,
t1.`SALARY_6`,
t1.`SALARY_METHOD`,
t1.`SALARY_TYPE`,
t1.`SMS_TEMPLATE`,
t1.`TRANSPORTATION_ALLOWANCE`,
t1.`WORKING_HOURS_AM`,
t1.`WORKING_HOURS_PM`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_offer` t1 
LEFT JOIN `hr_applicant` t11 ON t1.`APPLICANT_ID` = t11.`ID` 
LEFT JOIN `hr_job_platform` t21 ON t11.`JOB_PLATFORM_ID` = t21.`ID` 
LEFT JOIN `res_company` t31 ON t1.`RES_COMPANY_ID` = t31.`ID` 

```


## [offer审核(HR_OFFER_APPROVAL)](module/hr/hr_offer_approval.md) :id=hr_offer_approval

#### DEFAULT :id=hr_offer_approval-Default
```sql
SELECT
t21.`ADDRESS`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t21.`EDUCATION`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`HR_OFFER_ID`,
t1.`ID`,
t11.`JOB_NAME`,
t31.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t1.`PERIOD`,
t41.`NAME` AS `RES_COMPANY_NAME`,
t1.`STATUS`,
t1.`WFMEMO`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_offer_approval` t1 
LEFT JOIN `hr_offer` t11 ON t1.`HR_OFFER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t11.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_job_platform` t31 ON t21.`JOB_PLATFORM_ID` = t31.`ID` 
LEFT JOIN `res_company` t41 ON t11.`RES_COMPANY_ID` = t41.`ID` 

```

#### 默认（全部数据）(VIEW) :id=hr_offer_approval-View
```sql
SELECT
t21.`ADDRESS`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t21.`EDUCATION`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`HR_OFFER_ID`,
t1.`ID`,
t11.`JOB_NAME`,
t31.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t1.`PERIOD`,
t41.`NAME` AS `RES_COMPANY_NAME`,
t1.`STATUS`,
t1.`WFMEMO`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_offer_approval` t1 
LEFT JOIN `hr_offer` t11 ON t1.`HR_OFFER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t11.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_job_platform` t31 ON t21.`JOB_PLATFORM_ID` = t31.`ID` 
LEFT JOIN `res_company` t41 ON t11.`RES_COMPANY_ID` = t41.`ID` 

```

#### 用人经理数据集(hm_myself) :id=hr_offer_approval-hm_myself
```sql
SELECT
t21.`ADDRESS`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t21.`EDUCATION`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`HR_OFFER_ID`,
t1.`ID`,
t11.`JOB_NAME`,
t31.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t1.`PERIOD`,
t41.`NAME` AS `RES_COMPANY_NAME`,
t1.`STATUS`,
t1.`WFMEMO`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_offer_approval` t1 
LEFT JOIN `hr_offer` t11 ON t1.`HR_OFFER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t11.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_job_platform` t31 ON t21.`JOB_PLATFORM_ID` = t31.`ID` 
LEFT JOIN `res_company` t41 ON t11.`RES_COMPANY_ID` = t41.`ID` 

WHERE ( t1.`CREATE_UID` = #{ctx.sessioncontext.srfuserid} )
```


## [Offer发送记录(HR_OFFER_HISTORY)](module/hr/hr_offer_history.md) :id=hr_offer_history

#### 数据查询(DEFAULT) :id=hr_offer_history-Default
```sql
SELECT
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`FEEDBACK_STATUS`,
t1.`HR_OFFER_ID`,
t1.`ID`,
t1.`NAME`,
t1.`SEND_TIME`,
t1.`SEND_TYPE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_offer_history` t1 
LEFT JOIN `hr_offer` t11 ON t1.`HR_OFFER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t11.`APPLICANT_ID` = t21.`ID` 

```

#### 默认（全部数据）(VIEW) :id=hr_offer_history-View
```sql
SELECT
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`FEEDBACK_STATUS`,
t1.`HR_OFFER_ID`,
t1.`ID`,
t1.`NAME`,
t1.`SEND_TIME`,
t1.`SEND_TYPE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_offer_history` t1 
LEFT JOIN `hr_offer` t11 ON t1.`HR_OFFER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t11.`APPLICANT_ID` = t21.`ID` 

```


## [导入记录(HR_OFFER_IMP_REC)](module/hr/hr_offer_imp_rec.md) :id=hr_offer_imp_rec

#### 数据查询(DEFAULT) :id=hr_offer_imp_rec-Default
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`HR_OFFER_ID`,
t1.`HR_OFFER_IMP_RECID`,
t1.`HR_OFFER_IMP_RECNAME`,
t1.`IMP_DATE`,
t1.`IMP_STAGE`,
t1.`IMP_STATUS`,
t1.`NAME`,
t1.`OPERATOR`,
t1.`SYSTEM`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_offer_imp_rec` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_offer_imp_rec-View
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`HR_OFFER_ID`,
t1.`HR_OFFER_IMP_RECID`,
t1.`HR_OFFER_IMP_RECNAME`,
t1.`IMP_DATE`,
t1.`IMP_STAGE`,
t1.`IMP_STATUS`,
t1.`NAME`,
t1.`OPERATOR`,
t1.`SYSTEM`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_offer_imp_rec` t1 

```


## [申请人学历(HR_RECRUITMENT_DEGREE)](module/hr/hr_recruitment_degree.md) :id=hr_recruitment_degree

#### 数据查询(DEFAULT) :id=hr_recruitment_degree-Default
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`SEQUENCE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_recruitment_degree` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_recruitment_degree-View
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`SEQUENCE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_recruitment_degree` t1 

```


## [招聘流程(HR_RECRUITMENT_PROGRESS)](module/hr/hr_recruitment_progress.md) :id=hr_recruitment_progress

#### 数据查询(DEFAULT) :id=hr_recruitment_progress-Default
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_recruitment_progress` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_recruitment_progress-View
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_recruitment_progress` t1 

```


## [申请人来源(HR_RECRUITMENT_SOURCE)](module/hr/hr_recruitment_source.md) :id=hr_recruitment_source

#### 数据查询(DEFAULT) :id=hr_recruitment_source-Default
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`JOB_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_recruitment_source` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_recruitment_source-View
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`JOB_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_recruitment_source` t1 

```


## [ 招聘阶段(HR_RECRUITMENT_STAGE)](module/hr/hr_recruitment_stage.md) :id=hr_recruitment_stage

#### 数据查询(DEFAULT) :id=hr_recruitment_stage-Default
```sql
SELECT
t1.`COLOR`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`FOLD`,
t1.`HIRED_STAGE`,
t1.`ID`,
t1.`LEGEND_BLOCKED`,
t1.`LEGEND_DONE`,
t1.`LEGEND_NORMAL`,
t1.`NAME`,
t1.`SEQUENCE`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_recruitment_stage` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_recruitment_stage-View
```sql
SELECT
t1.`COLOR`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`FOLD`,
t1.`HIRED_STAGE`,
t1.`ID`,
t1.`LEGEND_BLOCKED`,
t1.`LEGEND_DONE`,
t1.`LEGEND_NORMAL`,
t1.`NAME`,
t1.`REQUIREMENTS`,
t1.`SEQUENCE`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_recruitment_stage` t1 

```

#### 启用状态(enabled_status) :id=hr_recruitment_stage-enabled_status
```sql
SELECT
t1.`COLOR`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`FOLD`,
t1.`HIRED_STAGE`,
t1.`ID`,
t1.`LEGEND_BLOCKED`,
t1.`LEGEND_DONE`,
t1.`LEGEND_NORMAL`,
t1.`NAME`,
t1.`SEQUENCE`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_recruitment_stage` t1 

WHERE ( t1.`STATUS` = '1' )
```


## [技能(HR_SKILL)](module/hr/hr_skill.md) :id=hr_skill

#### 数据查询(DEFAULT) :id=hr_skill-Default
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`SEQUENCE`,
t1.`SKILL_TYPE_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_skill` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_skill-View
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`SEQUENCE`,
t1.`SKILL_TYPE_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_skill` t1 

```


## [技能等级(HR_SKILL_LEVEL)](module/hr/hr_skill_level.md) :id=hr_skill_level

#### 数据查询(DEFAULT) :id=hr_skill_level-Default
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DEFAULT_LEVEL`,
t1.`ID`,
t1.`LEVEL_PROGRESS`,
t1.`NAME`,
t1.`SKILL_TYPE_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_skill_level` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_skill_level-View
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DEFAULT_LEVEL`,
t1.`ID`,
t1.`LEVEL_PROGRESS`,
t1.`NAME`,
t1.`SKILL_TYPE_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_skill_level` t1 

```


## [技能类型(HR_SKILL_TYPE)](module/hr/hr_skill_type.md) :id=hr_skill_type

#### 数据查询(DEFAULT) :id=hr_skill_type-Default
```sql
SELECT
t1.`ACTIVE`,
t1.`COLOR`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_skill_type` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_skill_type-View
```sql
SELECT
t1.`ACTIVE`,
t1.`COLOR`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_skill_type` t1 

```


## [人才库(HR_TALENT_POOL)](module/hr/hr_talent_pool.md) :id=hr_talent_pool

#### 数据查询(DEFAULT) :id=hr_talent_pool-Default
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_talent_pool` t1 

```

#### 默认（全部数据）(VIEW) :id=hr_talent_pool-View
```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_talent_pool` t1 

```


## [工作地点(HR_WORK_LOCATION)](module/hr/hr_work_location.md) :id=hr_work_location

#### 数据查询(DEFAULT) :id=hr_work_location-Default
```sql
SELECT
t1.`ACTIVE`,
t1.`COMPANY_ID`,
t11.`NAME` AS `COMPANY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`LOCATION_NUMBER`,
t1.`LOCATION_TYPE`,
t1.`NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_work_location` t1 
LEFT JOIN `res_company` t11 ON t1.`COMPANY_ID` = t11.`ID` 

```

#### 默认（全部数据）(VIEW) :id=hr_work_location-View
```sql
SELECT
t1.`ACTIVE`,
t1.`COMPANY_ID`,
t11.`NAME` AS `COMPANY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`LOCATION_NUMBER`,
t1.`LOCATION_TYPE`,
t1.`NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_work_location` t1 
LEFT JOIN `res_company` t11 ON t1.`COMPANY_ID` = t11.`ID` 

```


## [附件(IR_ATTACHMENT)](module/base/ir_attachment.md) :id=ir_attachment

#### 数据查询(DEFAULT) :id=ir_attachment-Default
```sql
SELECT
t1.`ACCESS_TOKEN`,
t1.`CHECKSUM`,
t1.`COMPANY_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`FILE_ID`,
t1.`FILE_SIZE`,
t1.`ID`,
t1.`MIMETYPE`,
t1.`NAME`,
t1.`ORIGINAL_ID`,
t1.`PUBLIC`,
t1.`RES_FIELD`,
t1.`RES_ID`,
t1.`RES_MODEL`,
t1.`STORE_FNAME`,
t1.`TYPE`,
t1.`URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ir_attachment` t1 

```

#### 默认（全部数据）(VIEW) :id=ir_attachment-View
```sql
SELECT
t1.`ACCESS_TOKEN`,
t1.`CHECKSUM`,
t1.`COMPANY_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DESCRIPTION`,
t1.`FILE_ID`,
t1.`FILE_SIZE`,
t1.`ID`,
t1.`INDEX_CONTENT`,
t1.`MIMETYPE`,
t1.`NAME`,
t1.`ORIGINAL_ID`,
t1.`PUBLIC`,
t1.`RES_FIELD`,
t1.`RES_ID`,
t1.`RES_MODEL`,
t1.`STORE_FNAME`,
t1.`TYPE`,
t1.`URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ir_attachment` t1 

```


## [分析报表(REPORT)](module/base/report.md) :id=report

#### DEFAULT :id=report-Default
```sql
SELECT
t1.`CATEGORIES`,
t1.`CHART_TYPE`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`DESC`,
t1.`ENABLE`,
t1.`GROUP`,
t1.`ID`,
t1.`IS_SYSTEM`,
t1.`NAME`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `REPORT` t1 

```

#### 默认（全部数据）(VIEW) :id=report-View
```sql
SELECT
t1.`CATEGORIES`,
t1.`CHART_TYPE`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`DESC`,
t1.`ENABLE`,
t1.`GROUP`,
t1.`ID`,
t1.`IS_SYSTEM`,
t1.`NAME`,
t1.`TEMPLATE_MODEL`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `REPORT` t1 

```


## [组织(RES_COMPANY)](module/base/res_company.md) :id=res_company

#### 数据查询(DEFAULT) :id=res_company-Default
```sql
SELECT
t1.`BUSINESS_PARENT_ID`,
t1.`BUSINESS_SORT`,
t1.`CATEGORY`,
t1.`CODE`,
t1.`COMPANY_CREATEDATE`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`HRBP_ID`,
t1.`ID`,
t1.`IDENTIFIER`,
t1.`IS_VIRTUAL`,
t1.`LEVEL`,
t1.`MANAGEMENT_PARENT_ID`,
t1.`MANAGEMENT_SORT`,
t1.`MANAGER_ID`,
t11.`NAME` AS `MANAGER_NAME`,
t1.`NAME`,
t1.`SHORT_NAME`,
t1.`TELEPHONE`,
t1.`TYPE`,
t1.`WEBSITE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `res_company` t1 
LEFT JOIN `hr_employee` t11 ON t1.`MANAGER_ID` = t11.`ID` 

```

#### 默认（全部数据）(VIEW) :id=res_company-View
```sql
SELECT
t1.`BUSINESS_PARENT_ID`,
t1.`BUSINESS_SORT`,
t1.`CATEGORY`,
t1.`CODE`,
t1.`COMPANY_CREATEDATE`,
t1.`COMPANY_DETAILS`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`HRBP_ID`,
t1.`ID`,
t1.`IDENTIFIER`,
t1.`IS_VIRTUAL`,
t1.`LEVEL`,
t1.`MANAGEMENT_PARENT_ID`,
t1.`MANAGEMENT_SORT`,
t1.`MANAGER_ID`,
t11.`NAME` AS `MANAGER_NAME`,
t1.`NAME`,
t1.`SHORT_NAME`,
t1.`TELEPHONE`,
t1.`TYPE`,
t1.`WEBSITE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `res_company` t1 
LEFT JOIN `hr_employee` t11 ON t1.`MANAGER_ID` = t11.`ID` 

```


## [用户(RES_USERS)](module/base/res_users.md) :id=res_users

#### 数据查询(DEFAULT) :id=res_users-Default
```sql
SELECT
t1.`ACTIVE`,
t1.`COMPANY_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DISPLAY_NAME`,
t1.`ID`,
t1.`KARMA`,
t1.`LOGIN`,
t1.`ODOOBOT_FAILED`,
t1.`SHARE`,
t1.`TARGET_SALES_DONE`,
t1.`TARGET_SALES_INVOICED`,
t1.`TARGET_SALES_WON`,
t1.`TOUR_ENABLED`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `res_users` t1 

```

#### 默认（全部数据）(VIEW) :id=res_users-View
```sql
SELECT
t1.`ACTIVE`,
t1.`COMPANY_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DISPLAY_NAME`,
t1.`ID`,
t1.`KARMA`,
t1.`LOGIN`,
t1.`ODOOBOT_FAILED`,
t1.`SHARE`,
t1.`SIGNATURE`,
t1.`TARGET_SALES_DONE`,
t1.`TARGET_SALES_INVOICED`,
t1.`TARGET_SALES_WON`,
t1.`TOUR_ENABLED`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `res_users` t1 

```

