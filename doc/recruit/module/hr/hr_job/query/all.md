## 全部数据（含渠道信息）(all) <!-- {docsify-ignore-all} -->



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