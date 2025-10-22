## 小周(Week2) <!-- {docsify-ignore-all} -->



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

((`DAY_NUMBER(日序号)` EQ `'8'` OR `DAY_NUMBER(日序号)` EQ `'9'` OR `DAY_NUMBER(日序号)` EQ `'10'` OR `DAY_NUMBER(日序号)` EQ `'11'` OR `DAY_NUMBER(日序号)` EQ `'12'` OR `DAY_NUMBER(日序号)` EQ `'13'` OR `DAY_NUMBER(日序号)` EQ `'14'`))





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

WHERE ( ( t1.`DAY_NUMBER` = 8  OR  t1.`DAY_NUMBER` = 9  OR  t1.`DAY_NUMBER` = 10  OR  t1.`DAY_NUMBER` = 11  OR  t1.`DAY_NUMBER` = 12  OR  t1.`DAY_NUMBER` = 13  OR  t1.`DAY_NUMBER` = 14 ) )
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