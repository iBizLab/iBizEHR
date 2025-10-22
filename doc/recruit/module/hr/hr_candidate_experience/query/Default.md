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
t1.`APPLICANT_ID`,
t1.`COMPANY`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DEPARTMENT`,
t1.`END_DATE`,
t1.`ID`,
t1.`INDUSTRY`,
t1.`JOB_NAME`,
t1.`LEADER`,
t1.`LOCATION`,
t1.`NAME`,
t1.`NOW`,
t1.`REASON_FOR_LEAVING`,
t1.`SALARY`,
t1.`START_DATE`,
t1.`SUMMARY`,
t1.`UNDERLING_NUMBER`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_candidate_experience` t1 


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