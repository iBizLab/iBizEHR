## 启用状态(enabled_status) <!-- {docsify-ignore-all} -->



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

(`STATUS(状态)` EQ `'1'`)





<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`COLOR`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`FOLD`,
t1.`HIRED_STAGE`,
t1.`ID`,
t1.`LEGEND_BLOCKED`,
t1.`LEGEND_DONE`,
t1.`LEGEND_NORMAL`,
t1.`NAME`,
t1.`SEQUENCE`,
t1.`STATUS`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_recruitment_stage` t1 

WHERE ( t1.`STATUS` = '1' )
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