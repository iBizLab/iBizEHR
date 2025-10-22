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
> `DESCRIPTION(描述)`
>
> `INDEX_CONTENT(索引内容)`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACCESS_TOKEN`,
t1.`CHECKSUM`,
t1.`COMPANY_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DESCRIPTION`,
t1.`FILE_ID`,
t1.`FILE_SIZE`,
t1.`ID`,
t1.`INDEX_CONTENT`,
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