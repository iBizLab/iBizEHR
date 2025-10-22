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
> `COMPANY_DETAILS(简介)`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`BUSINESS_PARENT_ID`,
t1.`BUSINESS_SORT`,
t1.`CATEGORY`,
t1.`CODE`,
t1.`COMPANY_CREATEDATE`,
t1.`COMPANY_DETAILS`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`HRBP_ID`,
t1.`ID`,
t1.`IDENTIFIER`,
t1.`IS_VIRTUAL`,
t1.`LEVEL`,
t1.`MANAGEMENT_PARENT_ID`,
t1.`MANAGEMENT_SORT`,
t1.`MANAGER_ID`,
t11.`NAME` AS `MANAGER_NAME`,
t1.`NAME`,
t1.`SHORT_NAME`,
t1.`TELEPHONE`,
t1.`TYPE`,
t1.`WEBSITE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `res_company` t1 
LEFT JOIN `hr_employee` t11 ON t1.`MANAGER_ID` = t11.`ID` 


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