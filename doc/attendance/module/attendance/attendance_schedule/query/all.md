## 全部(all) <!-- {docsify-ignore-all} -->



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
t1.`CHECKIN_DATE`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DEPT_ID`,
t1.`DEPT_NAME`,
t1.`ID`,
t1.`MANUAL`,
t1.`MANUAL_TYPE`,
t1.`MEMBER_ID`,
t1.`MEMBER_NAME`,
t1.`MEMBER_NUM`,
t1.`NAME`,
t1.`RULE_DATA`,
t1.`RULE_ID`,
t11.`NAME` AS `RULE_NAME`,
t11.`SCHEDULE_TYPE`,
t1.`SHIFT_DATA`,
t1.`TITLE`,
t1.`WORKDAY`,
t1.`WORK_TIME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ATTENDANCE_SCHEDULE` t1 
LEFT JOIN `ATTENDANCE_ACTIVATE_RULE` t11 ON t1.`RULE_ID` = t11.`ID` 


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