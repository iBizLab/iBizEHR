## 数据查询(Default) <!-- {docsify-ignore-all} -->



<p class="panel-title"><b>查看SQL语句</b></p>
<br>

<el-row>
&nbsp;<el-tag @click="MYSQL5 = true">MYSQL5</el-tag>
</el-row>

<br>
<p class="panel-title"><b>是否默认查询</b></p>

* `是`

<p class="panel-title"><b>是否权限使用</b></p>

* `否`

<p class="panel-title"><b>是否自定义SQL</b></p>

* `否`

<p class="panel-title"><b>查询列级别</b></p>

* `默认（全部查询列）`

> [!ATTENTION|label:存在长文本属性]
>
> `CONTENT(内容)`






<el-dialog v-model="MYSQL5" title="MYSQL5">

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