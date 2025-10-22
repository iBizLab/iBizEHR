## DEFAULT(Default) <!-- {docsify-ignore-all} -->



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
t1.`ACTIVE`,
t1.`ADDRESS_ID`,
t1.`COACH_ID`,
t1.`COLOR`,
t1.`COMPANY_ID`,
t1.`DEPARTMENT_ID`,
t1.`ID`,
t1.`IS_FLEXIBLE`,
t1.`IS_FULLY_FLEXIBLE`,
t1.`JOB_ID`,
t1.`JOB_TITLE`,
t1.`LEAVE_MANAGER_ID`,
t1.`MOBILE_PHONE`,
t1.`NAME`,
t1.`PARENT_ID`,
t1.`RESOURCE_CALENDAR_ID`,
t1.`RESOURCE_ID`,
t1.`USER_ID`,
t1.`WORK_CONTACT_ID`,
t1.`WORK_EMAIL`,
t1.`WORK_LOCATION_ID`,
t1.`WORK_PHONE`
FROM `` t1 


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