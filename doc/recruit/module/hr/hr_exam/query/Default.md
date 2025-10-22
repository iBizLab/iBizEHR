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






<el-dialog v-model="MYSQL5" title="MYSQL5">

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