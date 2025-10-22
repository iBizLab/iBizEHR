```sql
SELECT
t1.`ACTIVE`,
(SELECT count(1) child_count  FROM `hr_department`  t  where t.PARENT_ID= t1.`ID` ) AS `CHILD_COUNT`,
t1.`COLOR`,
t1.`COMPANY_ID`,
t11.`NAME` AS `COMPANY_NAME`,
t1.`COMPLETE_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`MANAGER_ID`,
t21.`NAME` AS `MANAGER_NAME`,
t1.`MASTER_DEPARTMENT_ID`,
t1.`NAME`,
t1.`PARENT_ID`,
t31.`NAME` AS `PARENT_NAME`,
t1.`PARENT_PATH`,
(SELECT count(1) FROM `mail_activity_plan` t where t.DEPARTMENT_ID= t1.`ID`) AS `PLANS_COUNT`,
(SELECT count(1)  FROM `hr_employee` t where t.DEPARTMENT_ID= t1.`ID` ) AS `TOTAL_EMPLOYEE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_department` t1 
LEFT JOIN `res_company` t11 ON t1.`COMPANY_ID` = t11.`ID` 
LEFT JOIN `hr_employee` t21 ON t1.`MANAGER_ID` = t21.`ID` 
LEFT JOIN `hr_department` t31 ON t1.`PARENT_ID` = t31.`ID` 

WHERE ( ( t1.`ID` = #{ctx.datacontext.department}  OR  t1.`PARENT_ID` = #{ctx.datacontext.department}  OR  FIND_IN_SET(T1.ID,REPLACE(#{ctx.datacontext.parent_path},'/',',')) >0 ) )
```