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
t1.`CHANNEL_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`CUSTOM_CHANNEL_NAME`,
t1.`CUSTOM_NOTIFICATIONS`,
t1.`FETCHED_MESSAGE_ID`,
t1.`FOLD_STATE`,
t1.`GUEST_ID`,
t21.`NAME` AS `GUEST_NAME`,
t1.`ID`,
t1.`LAST_INTEREST_DT`,
t1.`LAST_SEEN_DT`,
t1.`MUTE_UNTIL_DT`,
t1.`NEW_MESSAGE_SEPARATOR`,
t1.`PARTNER_ID`,
t11.`NAME` AS `PARTNER_NAME`,
t1.`RTC_INVITING_SESSION_ID`,
t1.`SEEN_MESSAGE_ID`,
t1.`UNPIN_DT`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `discuss_channel_member` t1 
LEFT JOIN `res_partner` t11 ON t1.`PARTNER_ID` = t11.`ID` 
LEFT JOIN `mail_guest` t21 ON t1.`GUEST_ID` = t21.`ID` 


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