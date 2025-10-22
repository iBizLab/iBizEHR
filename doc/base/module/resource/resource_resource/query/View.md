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
t1.`CALENDAR_ID`,
t41.`NAME` AS `CALENDAR_NAME`,
t1.`COMPANY_ID`,
t31.`NAME` AS `COMPANY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t21.`EMAIL`,
t1.`ID`,
t1.`NAME`,
t21.`PHONE`,
t1.`RESOURCE_TYPE`,
t11.`SHARE`,
t1.`TIME_EFFICIENCY`,
t1.`USER_ID`,
t21.`NAME` AS `USER_NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `resource_resource` t1 
LEFT JOIN `res_users` t11 ON t1.`USER_ID` = t11.`ID` 
LEFT JOIN `res_partner` t21 ON t11.`PARTNER_ID` = t21.`ID` 
LEFT JOIN `res_company` t31 ON t1.`COMPANY_ID` = t31.`ID` 
LEFT JOIN `resource_calendar` t41 ON t1.`CALENDAR_ID` = t41.`ID` 


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