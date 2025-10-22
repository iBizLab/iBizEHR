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
t1.`ACTIVE`,
t1.`ALLOW_PUBLIC_UPLOAD`,
t1.`CHANNEL_TYPE`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DEFAULT_DISPLAY_MODE`,
t1.`FROM_MESSAGE_ID`,
t1.`GROUP_PUBLIC_ID`,
t21.`NAME` AS `GROUP_PUBLIC_NAME`,
t1.`ID`,
t1.`LAST_INTEREST_DT`,
t1.`NAME`,
t1.`PARENT_CHANNEL_ID`,
t11.`NAME` AS `PARENT_CHANNEL_NAME`,
t1.`SFU_CHANNEL_UUID`,
t1.`SFU_SERVER_URL`,
t1.`UUID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `discuss_channel` t1 
LEFT JOIN `discuss_channel` t11 ON t1.`PARENT_CHANNEL_ID` = t11.`ID` 
LEFT JOIN `res_groups` t21 ON t1.`GROUP_PUBLIC_ID` = t21.`ID` 


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