## 今后的面试(after_interview) <!-- {docsify-ignore-all} -->



<p class="panel-title"><b>查看SQL语句</b></p>
<br>

<el-row>
&nbsp;<el-tag @click="MYSQL5 = true">MYSQL5</el-tag>
</el-row>

<br>
<p class="panel-title"><b>是否默认查询</b></p>

* `否`

<p class="panel-title"><b>是否权限使用</b></p>

* `否`

<p class="panel-title"><b>是否自定义SQL</b></p>

* `否`

<p class="panel-title"><b>查询列级别</b></p>

* `默认（全部查询列）`



### 查询条件

(`t41.start_date > current_date`)





<el-dialog v-model="MYSQL5" title="MYSQL5">

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

</el-dialog>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
                MYSQL5 : false
        
      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>