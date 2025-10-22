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

* `全部数据`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`EARLIEST_CHECKIN`,
t1.`EARLY_FOR_ABSENTEEISM`,
t1.`EARLY_FOR_EARLY`,
t1.`END_BASE_TIME`,
t1.`ID`,
t1.`LATEST_CHECKOUT`,
t1.`LATE_FOR_ABSENTEEISM`,
t1.`LATE_FOR_LATE`,
t1.`NAME`,
t1.`NEXT_TAG`,
t1.`ORDER_VALUE`,
t1.`SHIFT_ID`,
t1.`SHIFT_NAME`,
t1.`START_BASE_TIME`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ATTENDANCE_SCOPE` t1 


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