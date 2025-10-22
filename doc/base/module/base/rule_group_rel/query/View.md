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
t11.`DOMAIN_FORCE`,
t1.`GID`,
t21.`NAME` AS `GNAME`,
t1.`ID`,
t11.`MODEL_ID`,
t1.`NAME`,
t11.`PERM_CREATE`,
t11.`PERM_READ`,
t11.`PERM_UNLINK`,
t11.`PERM_WRITE`,
t1.`RULE_ID`,
t11.`NAME` AS `RULE_NAME`
FROM `rule_group_rel` t1 
LEFT JOIN `ir_rule` t11 ON t1.`RULE_ID` = t11.`ID` 
LEFT JOIN `res_groups` t21 ON t1.`GID` = t21.`ID` 


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