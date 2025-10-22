## Week4(Week4) <!-- {docsify-ignore-all} -->



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

((`DAY_NUMBER(日序号)` EQ `'22'` OR `DAY_NUMBER(日序号)` EQ `'23'` OR `DAY_NUMBER(日序号)` EQ `'24'` OR `DAY_NUMBER(日序号)` EQ `'25'` OR `DAY_NUMBER(日序号)` EQ `'26'` OR `DAY_NUMBER(日序号)` EQ `'27'` OR `DAY_NUMBER(日序号)` EQ `'28'`))





<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DAY_NUMBER`,
t1.`ID`,
t1.`NAME`,
t1.`RULE_ID`,
t1.`SHIFT_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ATTENDANCE_WORKDAY` t1 

WHERE ( ( t1.`DAY_NUMBER` = 22  OR  t1.`DAY_NUMBER` = 23  OR  t1.`DAY_NUMBER` = 24  OR  t1.`DAY_NUMBER` = 25  OR  t1.`DAY_NUMBER` = 26  OR  t1.`DAY_NUMBER` = 27  OR  t1.`DAY_NUMBER` = 28 ) )
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