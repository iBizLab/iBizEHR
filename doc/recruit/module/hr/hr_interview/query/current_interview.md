## 今天的面试(current_interview) <!-- {docsify-ignore-all} -->



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

(`t11.start_date = current_date`)





<el-dialog v-model="MYSQL5" title="MYSQL5">

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