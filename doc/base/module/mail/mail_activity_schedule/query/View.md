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

> [!ATTENTION|label:存在长文本属性]
>
> `RES_IDS(文档 ID)`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACTIVITY_TYPE_ID`,
t11.`NAME` AS `ACTIVITY_TYPE_NAME`,
t1.`ACTIVITY_USER_ID`,
t31.`NAME` AS `ACTIVITY_USER_NAME`,
t11.`CHAINING_TYPE`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE_DEADLINE`,
t1.`ID`,
t1.`NOTE`,
t1.`PLAN_DATE`,
t1.`PLAN_ID`,
t1.`PLAN_ON_DEMAND_USER_ID`,
t1.`RES_IDS`,
t1.`RES_MODEL`,
t1.`SUMMARY`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `mail_activity_schedule` t1 
LEFT JOIN `mail_activity_type` t11 ON t1.`ACTIVITY_TYPE_ID` = t11.`ID` 
LEFT JOIN `res_users` t21 ON t1.`ACTIVITY_USER_ID` = t21.`ID` 
LEFT JOIN `res_partner` t31 ON t21.`PARTNER_ID` = t31.`ID` 


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