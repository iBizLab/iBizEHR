## Week3(Week3) <!-- {docsify-ignore-all} -->



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

((`DAY_NUMBER(日序号)` EQ `'15'` OR `DAY_NUMBER(日序号)` EQ `'16'` OR `DAY_NUMBER(日序号)` EQ `'17'` OR `DAY_NUMBER(日序号)` EQ `'18'` OR `DAY_NUMBER(日序号)` EQ `'19'` OR `DAY_NUMBER(日序号)` EQ `'20'` OR `DAY_NUMBER(日序号)` EQ `'21'`))





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

WHERE ( ( t1.`DAY_NUMBER` = 15  OR  t1.`DAY_NUMBER` = 16  OR  t1.`DAY_NUMBER` = 17  OR  t1.`DAY_NUMBER` = 18  OR  t1.`DAY_NUMBER` = 19  OR  t1.`DAY_NUMBER` = 20  OR  t1.`DAY_NUMBER` = 21 ) )
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