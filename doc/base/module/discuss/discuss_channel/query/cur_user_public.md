## 当前用户加入公共频道(cur_user_public) <!-- {docsify-ignore-all} -->



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

(`CHANNEL_TYPE(频道类型)` EQ `'channel'`)



### 查询连接
* **DISCUSS_CHANNEL_MEMBER存在1:N（EXISTS (SELECT)）DER1N_DISCUSS_CHANNEL_MEMBER_DISCUSS_CHANNEL_CHANNEL_ID_2BFB13**<br>
连接关系：[DER1N_DISCUSS_CHANNEL_MEMBER_DISCUSS_CHANNEL_CHANNEL_ID](der/DER1N_DISCUSS_CHANNEL_MEMBER_DISCUSS_CHANNEL_CHANNEL_ID)<br>
连接实体：[讨论频道](module/discuss/discuss_channel)<br>
连接条件：(`PARTNER_ID(合作伙伴)` EQ `用户上下文.srfpartnerid`)<br>




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

/*ALIAS.channel=t1*/
WHERE EXISTS(SELECT * FROM `discuss_channel_member` t31 
 WHERE 
 t1.`ID` = t31.`CHANNEL_ID`  AND  ( t31.`PARTNER_ID` = #{ctx.sessioncontext.srfpartnerid} ) ) AND ( t1.`CHANNEL_TYPE` = 'channel' )
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