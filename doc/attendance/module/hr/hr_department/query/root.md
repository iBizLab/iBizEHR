## 根部门(root) <!-- {docsify-ignore-all} -->



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

(`PARENT_ID(上级部门)` ISNULL)





<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACTIVE`,
t1.`COLOR`,
t1.`COMPLETE_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`MANAGER_ID`,
t11.`NAME` AS `MANAGER_NAME`,
t1.`MASTER_DEPARTMENT_ID`,
t1.`NAME`,
t1.`PARENT_ID`,
t21.`NAME` AS `PARENT_NAME`,
t1.`PARENT_PATH`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_department` t1 
LEFT JOIN `hr_employee` t11 ON t1.`MANAGER_ID` = t11.`ID` 
LEFT JOIN `hr_department` t21 ON t1.`PARENT_ID` = t21.`ID` 

WHERE ( t1.`PARENT_ID` IS NULL )
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