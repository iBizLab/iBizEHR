## 常规(common) <!-- {docsify-ignore-all} -->



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

(`RES_MODEL(相关的单据模型名称)` EQ `数据上下文.srfmodelname`)





<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ID`,
t11.`NAME`,
t1.`PARTNER_ID`,
t1.`RES_ID`,
t1.`RES_MODEL`,
t1.`TYPE`
FROM `mail_followers` t1 
LEFT JOIN `res_partner` t11 ON t1.`PARTNER_ID` = t11.`ID` 

WHERE ( t1.`RES_MODEL` = #{ctx.datacontext.srfmodelname} )
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