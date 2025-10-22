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
t1.`COLUMN1`,
t1.`COLUMN2`,
t1.`COMPANY_DEPENDENT`,
t1.`COMPLETE_NAME`,
t1.`COPIED`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`CURRENCY_FIELD`,
t1.`DEPENDS`,
t1.`DOMAIN`,
t1.`FIELD_DESCRIPTION`,
t1.`GROUP_EXPAND`,
t1.`ID`,
t1.`INDEX`,
t1.`MODEL`,
t1.`NAME`,
t1.`ON_DELETE`,
t1.`READONLY`,
t1.`RELATED`,
t1.`RELATION`,
t1.`RELATION_FIELD`,
t1.`RELATION_TABLE`,
t1.`REQUIRED`,
t1.`SANITIZE`,
t1.`SANITIZE_ATTRIBUTES`,
t1.`SANITIZE_FORM`,
t1.`SANITIZE_OVERRIDABLE`,
t1.`SANITIZE_STYLE`,
t1.`SANITIZE_TAGS`,
t1.`SELECTABLE`,
t1.`SIZE`,
t1.`STATE`,
t1.`STORE`,
t1.`STRIP_CLASSES`,
t1.`STRIP_STYLE`,
t1.`TRACKING`,
t1.`TRANSLATE`,
t1.`TTYPE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ir_model_fields` t1 


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