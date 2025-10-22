## 职位发布情况(job_platform) <!-- {docsify-ignore-all} -->



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

* `是`

<p class="panel-title"><b>查询列级别</b></p>

* `默认（全部查询列）`



### 查询条件

(`TYPE(类型)` EQ `'1'`)





<el-dialog v-model="MYSQL5" title="MYSQL5">

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