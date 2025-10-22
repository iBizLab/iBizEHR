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
t1.`ACTIVE`,
t1.`ALLOCATION_NOTIF_SUBTYPE_ID`,
t1.`ALLOCATION_VALIDATION_TYPE`,
t1.`ALLOWS_NEGATIVE`,
t1.`COLOR`,
t1.`COMPANY_ID`,
t1.`CREATE_CALENDAR_MEETING`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EMPLOYEE_REQUESTS`,
t1.`ICON_ID`,
t1.`ID`,
t1.`INCLUDE_PUBLIC_HOLIDAYS_IN_DURATION`,
t1.`LEAVE_NOTIF_SUBTYPE_ID`,
t1.`LEAVE_VALIDATION_TYPE`,
t1.`MAX_ALLOWED_NEGATIVE`,
t1.`NAME`,
t1.`OVERTIME_DEDUCTIBLE`,
t1.`REQUEST_UNIT`,
t1.`REQUIRES_ALLOCATION`,
t1.`SEQUENCE`,
t1.`SHOW_ON_DASHBOARD`,
t1.`SUPPORT_DOCUMENT`,
t1.`TIME_TYPE`,
t1.`UNPAID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_leave_type` t1 


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