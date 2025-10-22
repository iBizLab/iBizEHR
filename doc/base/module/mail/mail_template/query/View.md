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
> `DESCRIPTION(模板描述)`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACTIVE`,
t1.`AUTO_DELETE`,
t1.`BODY_HTML`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DESCRIPTION`,
t1.`EMAIL_CC`,
t1.`EMAIL_FROM`,
t1.`EMAIL_LAYOUT_XMLID`,
t1.`EMAIL_TO`,
t1.`ID`,
t1.`LANG`,
t1.`NAME`,
t1.`PARTNER_TO`,
t1.`REPLY_TO`,
t1.`SCHEDULED_DATE`,
t1.`SUBJECT`,
t1.`TEMPLATE_FS`,
t1.`USER_ID`,
t1.`USE_DEFAULT_TO`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `mail_template` t1 


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