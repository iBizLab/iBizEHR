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

* `默认（全部查询列）`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`CHECKIN_IMAGE`,
t1.`CHECKIN_REMARK`,
t1.`CHECKIN_RESULT`,
t1.`CHECKIN_TIME`,
t1.`CHECKIN_TYPE`,
t1.`CLOCK_TYPE`,
t1.`CMD`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE`,
t1.`DEPT_ID`,
t1.`DEPT_NAME`,
t1.`DEVICE_NAME`,
t1.`DURATION_HOURS`,
t1.`ID`,
t1.`MEMBER_ID`,
t1.`MEMBER_NAME`,
t1.`MEMBER_NUM`,
t1.`NAME`,
t1.`SHOULD_CHECKIN_TIME`,
t1.`SOURCE`,
t1.`TERMINAL_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `ATTENDANCE_CLOCK_IN_RECORD` t1 


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