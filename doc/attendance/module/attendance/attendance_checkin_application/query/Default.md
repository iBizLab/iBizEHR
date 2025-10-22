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
t1.`APPLICANT_ID`,
t1.`APPLICANT_NAME`,
t1.`APPLY_TYPE`,
t1.`APPROVER_ID`,
t1.`APPROVER_NAME`,
t1.`COPY_GIVE`,
t1.`COPY_GIVE_NAMES`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DAYS`,
t1.`DEPARTURE_CITY`,
t1.`DEPT_ID`,
t1.`DEPT_NAME`,
t1.`DESTINATION_CITY`,
t1.`EMPLOYEE_NUM`,
t1.`END_TIME`,
t1.`GO_OUT_PLACE`,
t1.`HOURS`,
t1.`ID`,
t1.`LEAVE_TYPE`,
t1.`MINUTES`,
t1.`NAME`,
t1.`OVERTIME_TYPE`,
t1.`REASON`,
t1.`REISSUE_DATE`,
t1.`REISSUE_TIME`,
t1.`START_TIME`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ATTENDANCE_CHECKIN_APPLICATION` t1 


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