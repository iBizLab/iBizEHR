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
t41.`CATEGORY_ID`,
t51.`NAME` AS `CATEGORY_NAME`,
t21.`NAME` AS `COMPANY_NAME`,
t1.`GID`,
t41.`NAME` AS `GROUP_NAME`,
t1.`ID`,
t11.`LOGIN`,
t1.`NAME`,
t1.`USER_ID`,
t31.`NAME` AS `USER_NAME`
FROM `res_groups_users_rel` t1 
LEFT JOIN `res_users` t11 ON t1.`USER_ID` = t11.`ID` 
LEFT JOIN `res_company` t21 ON t11.`COMPANY_ID` = t21.`ID` 
LEFT JOIN `res_partner` t31 ON t11.`PARTNER_ID` = t31.`ID` 
LEFT JOIN `res_groups` t41 ON t1.`GID` = t41.`ID` 
LEFT JOIN `ir_module_category` t51 ON t41.`CATEGORY_ID` = t51.`ID` 


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