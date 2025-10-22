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
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`HR_OFFER_ID`,
t1.`HR_OFFER_IMP_RECID`,
t1.`HR_OFFER_IMP_RECNAME`,
t1.`IMP_DATE`,
t1.`IMP_STAGE`,
t1.`IMP_STATUS`,
t1.`NAME`,
t1.`OPERATOR`,
t1.`SYSTEM`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_offer_imp_rec` t1 


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