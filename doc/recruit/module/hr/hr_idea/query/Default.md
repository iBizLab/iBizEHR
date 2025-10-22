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
t1.`ADDRESS_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_FROM`,
t1.`DATE_TO`,
t1.`DEPARTMENT_CODE`,
t1.`EDUCATION`,
t1.`ID`,
t1.`IDENTIFIER`,
t1.`JOB_NAME`,
t1.`JOB_TYPE`,
t1.`MANAGEMENT_RANK_IDS`,
t1.`MANAGER_EMPLOYEE_IDS`,
t1.`MAX_SALARY`,
t1.`MIN_SALARY`,
t1.`NAME`,
t1.`NEED_NUMBER`,
t1.`PAYMENTMETHOD`,
t1.`PAYPERIOD`,
t1.`PROFESSIONAL_RANK_IDS`,
t1.`SALARY_UNIT`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_idea` t1 


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