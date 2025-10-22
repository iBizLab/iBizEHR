## 默认（全部数据）(View) <!-- {docsify-ignore-all} -->



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

* `全部数据`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACTUAL_ATTENDANCE_DAYS`,
t1.`BILLABLE_HOURS`,
t1.`BILLABLE_TIME`,
t1.`CHECKIN_DATE`,
t1.`CHECKIN_MESSAGE`,
t1.`CHECKIN_MISSING_TIMES`,
t1.`CHECKIN_RESULT`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DEPT_ID`,
t1.`DEPT_NAME`,
t1.`ID`,
t1.`IS_BUSINESS_TRIP`,
t1.`IS_GO_OUT`,
t1.`IS_LEAVE`,
t1.`IS_OUT_WORK`,
t1.`IS_OVERTIME`,
t1.`IS_PAY_OVERTIME`,
t1.`IS_REST_OVERTIME`,
t1.`LATE_MINUTES`,
t1.`LATE_TIME`,
t1.`LATE_TIMES`,
t1.`LEAVE_DURATION`,
t1.`LEAVE_EARLY_MINUTES`,
t1.`LEAVE_EARLY_TIME`,
t1.`LEAVE_EARLY_TIMES`,
t1.`LEAVE_TYPE`,
t1.`MEMBER_ID`,
t1.`MEMBER_NAME`,
t1.`MEMBER_NUM`,
t1.`NAME`,
t1.`OFF_HOURS`,
t1.`ON_BUSINESS_DAYS`,
t1.`OUT_HOURS`,
t1.`OUT_TIME`,
t1.`OUT_WORK_HOURS`,
t1.`OUT_WORK_TIME`,
t1.`OVERTIME_HOURS`,
t1.`OVERTIME_TIME`,
t1.`RULE_ID`,
t11.`NAME` AS `RULE_NAME`,
t1.`SCHEDULE_TYPE`,
t1.`SHIFT_MESSAGE`,
t1.`SHOULD_ATTENDANCE_DAYS`,
t1.`SHOULD_ATTENDANCE_HOURS`,
t1.`SHOULD_ATTENDANCE_TIME`,
t1.`TITLE`,
t1.`WORKING_HOURS`,
t1.`WORKING_TIME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ATTENDANCE_RECORD` t1 
LEFT JOIN `ATTENDANCE_RULE` t11 ON t1.`RULE_ID` = t11.`ID` 


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