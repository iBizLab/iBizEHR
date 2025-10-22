## manage(manage) <!-- {docsify-ignore-all} -->



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

(`CHECK_OUT(签离)` ISNOTNULL AND `CHECK_IN(签到)` ISNOTNULL)





<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`CHECK_IN`,
t1.`CHECK_OUT`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EMPLOYEE_ID`,
t11.`NAME` AS `EMPLOYEE_NAME`,
t1.`EXPECTED_HOURS`,
t1.`ID`,
t1.`IN_BROWSER`,
t1.`IN_CITY`,
t1.`IN_COUNTRY_NAME`,
t1.`IN_IP_ADDRESS`,
t1.`IN_LATITUDE`,
t1.`IN_LONGITUDE`,
t1.`IN_MODE`,
t1.`NAME`,
t1.`OUT_BROWSER`,
t1.`OUT_CITY`,
t1.`OUT_COUNTRY_NAME`,
t1.`OUT_IP_ADDRESS`,
t1.`OUT_LATITUDE`,
t1.`OUT_LONGITUDE`,
t1.`OUT_MODE`,
t1.`OVERTIME_HOURS`,
t1.`OVERTIME_STATUS`,
t1.`VALIDATED_OVERTIME_HOURS`,
t1.`WORKED_HOURS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_attendance` t1 
LEFT JOIN `hr_employee` t11 ON t1.`EMPLOYEE_ID` = t11.`ID` 

WHERE ( t1.`CHECK_OUT` IS NOT NULL  AND  t1.`CHECK_IN` IS NOT NULL )
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