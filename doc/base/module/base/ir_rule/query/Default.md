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

* `全部数据`

> [!ATTENTION|label:存在长文本属性]
>
> `DOMAIN_FORCE(域名)`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACTIVE`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DISPLAY_NAME`,
t1.`DOMAIN_FORCE`,
t1.`GLOBAL`,
t1.`ID`,
t1.`MODEL_ID`,
t1.`NAME`,
t1.`PERM_CREATE`,
t1.`PERM_READ`,
t1.`PERM_UNLINK`,
t1.`PERM_WRITE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ir_rule` t1 


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