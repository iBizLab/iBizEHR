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
> `NOTE(备注)`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACTIVE`,
t1.`COLOR`,
t1.`COMPANY_ID`,
t21.`NAME` AS `COMPANY_NAME`,
t1.`COMPLETE_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`NOTE`,
t1.`PARENT_ID`,
t11.`NAME` AS `PARENT_NAME`,
t1.`PARENT_PATH`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_department` t1 
LEFT JOIN `hr_department` t11 ON t1.`PARENT_ID` = t11.`ID` 
LEFT JOIN `res_company` t21 ON t1.`COMPANY_ID` = t21.`ID` 


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