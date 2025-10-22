## 大周(Week1) <!-- {docsify-ignore-all} -->



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

((`DAY_NUMBER(日序号)` EQ `'1'` OR `DAY_NUMBER(日序号)` EQ `'2'` OR `DAY_NUMBER(日序号)` EQ `'3'` OR `DAY_NUMBER(日序号)` EQ `'4'` OR `DAY_NUMBER(日序号)` EQ `'5'` OR `DAY_NUMBER(日序号)` EQ `'6'` OR `DAY_NUMBER(日序号)` EQ `'7'`))





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

WHERE ( ( t1.`DAY_NUMBER` = 1  OR  t1.`DAY_NUMBER` = 2  OR  t1.`DAY_NUMBER` = 3  OR  t1.`DAY_NUMBER` = 4  OR  t1.`DAY_NUMBER` = 5  OR  t1.`DAY_NUMBER` = 6  OR  t1.`DAY_NUMBER` = 7 ) )
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