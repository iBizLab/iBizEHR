## 面试安排(interview_list) <!-- {docsify-ignore-all} -->



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






<el-dialog v-model="MYSQL5" title="MYSQL5">

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