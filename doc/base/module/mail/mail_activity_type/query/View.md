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






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACTIVE`,
t1.`CATEGORY`,
t1.`CHAINING_TYPE`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DECORATION_TYPE`,
t1.`DEFAULT_NOTE`,
t1.`DEFAULT_USER_ID`,
t1.`DELAY_COUNT`,
t1.`DELAY_FROM`,
t1.`DELAY_UNIT`,
t1.`ICON`,
t1.`ID`,
t1.`KEEP_DONE`,
t1.`NAME`,
t1.`RES_MODEL`,
t1.`SEQUENCE`,
t1.`SUMMARY`,
t1.`TRIGGERED_NEXT_TYPE_ID`,
t11.`NAME` AS `TRIGGERED_NEXT_TYPE_NAME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `mail_activity_type` t1 
LEFT JOIN `mail_activity_type` t11 ON t1.`TRIGGERED_NEXT_TYPE_ID` = t11.`ID` 


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