## 数据查询(Default) <!-- {docsify-ignore-all} -->



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
t1.`ACTIVE`,
t1.`COMPANY_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DISPLAY_NAME`,
t1.`ID`,
t1.`KARMA`,
t1.`LOGIN`,
t1.`ODOOBOT_FAILED`,
t1.`SHARE`,
t1.`TARGET_SALES_DONE`,
t1.`TARGET_SALES_INVOICED`,
t1.`TARGET_SALES_WON`,
t1.`TOUR_ENABLED`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `res_users` t1 


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