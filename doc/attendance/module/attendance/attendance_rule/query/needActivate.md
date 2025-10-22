## 需激活的规则(needActivate) <!-- {docsify-ignore-all} -->



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



### 查询条件

(`IS_ACTIVATE(是否激活)` EQ `'0'` AND `EFFECT_TIME <= CURDATE()`)





<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`AUTO_MATCH`,
t1.`BIWEEKLY_CYCLE`,
t1.`CHECKIN_METHOD`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DEFAULT_FLAG`,
t1.`EFFECT_TIME`,
t1.`ELASTIC_MINUTES`,
t1.`ELASTIC_VALID`,
t1.`FREE_MIN_MINUTES`,
t1.`FREE_RATIO`,
t1.`HOLIDAY`,
t1.`ID`,
t1.`INVERSION_COUNT`,
t1.`INVERSION_CYCLE`,
t1.`INVERSION_DAYS`,
t1.`IS_ACTIVATE`,
t1.`NAME`,
t1.`REQUIREMENT`,
t1.`REST`,
t1.`SAME_RESTDAY`,
t1.`SCHEDULE_TYPE`,
t1.`WORK`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ATTENDANCE_RULE` t1 

WHERE ( t1.`IS_ACTIVATE` = 0  AND  EFFECT_TIME <= CURDATE() )
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