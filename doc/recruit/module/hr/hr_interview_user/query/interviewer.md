## 面试官(interviewer) <!-- {docsify-ignore-all} -->



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

(`USER_TYPE(面试参与者类型)` EQ `'1'`)





<el-dialog v-model="MYSQL5" title="MYSQL5">

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