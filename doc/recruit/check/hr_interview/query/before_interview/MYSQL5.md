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