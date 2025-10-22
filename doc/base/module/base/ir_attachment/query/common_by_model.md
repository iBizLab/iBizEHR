## 常规(common_by_model) <!-- {docsify-ignore-all} -->



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

(`RES_MODEL(资源模型)` EQ `数据上下文.srfmodelname` AND `RES_FIELD(资源字段)` ISNULL)





<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACCESS_TOKEN`,
t1.`CHECKSUM`,
t1.`COMPANY_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`FILE_ID`,
t1.`FILE_SIZE`,
t1.`ID`,
t1.`MIMETYPE`,
t1.`NAME`,
t1.`ORIGINAL_ID`,
t1.`PUBLIC`,
t1.`RES_FIELD`,
t1.`RES_ID`,
t1.`RES_MODEL`,
t1.`STORE_FNAME`,
t1.`TYPE`,
t1.`URL`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ir_attachment` t1 

WHERE ( t1.`RES_MODEL` = #{ctx.datacontext.srfmodelname}  AND  t1.`RES_FIELD` IS NULL )
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