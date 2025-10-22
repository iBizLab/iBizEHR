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
t1.`ACTIVITY_TYPE_ID`,
t31.`NAME` AS `ACTIVITY_TYPE_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DELAY_COUNT`,
t1.`DELAY_FROM`,
t1.`DELAY_UNIT`,
t1.`ID`,
t1.`NOTE`,
t1.`PLAN_ID`,
t41.`NAME` AS `PLAN_NAME`,
t1.`RESPONSIBLE_ID`,
t21.`NAME` AS `RESPONSIBLE_NAME`,
t1.`RESPONSIBLE_TYPE`,
t1.`SEQUENCE`,
t1.`SUMMARY`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `mail_activity_plan_template` t1 
LEFT JOIN `res_users` t11 ON t1.`RESPONSIBLE_ID` = t11.`ID` 
LEFT JOIN `res_partner` t21 ON t11.`PARTNER_ID` = t21.`ID` 
LEFT JOIN `mail_activity_type` t31 ON t1.`ACTIVITY_TYPE_ID` = t31.`ID` 
LEFT JOIN `mail_activity_plan` t41 ON t1.`PLAN_ID` = t41.`ID` 


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