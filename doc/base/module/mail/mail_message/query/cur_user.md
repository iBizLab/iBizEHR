## 当前用户(cur_user) <!-- {docsify-ignore-all} -->



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




### 查询连接
* **MAIL_MESSAGE_RECIPIENT存在1:N（EXISTS (SELECT)）DER1N_MAIL_MESSAGE_RECIPIENT_MAIL_MESSAGE_MESSAGE_ID_39BFDB**<br>
连接关系：[DER1N_MAIL_MESSAGE_RECIPIENT_MAIL_MESSAGE_MESSAGE_ID](der/DER1N_MAIL_MESSAGE_RECIPIENT_MAIL_MESSAGE_MESSAGE_ID)<br>
连接实体：[消息](module/mail/mail_message)<br>
连接条件：(`PARTNER_ID(标识)` EQ `用户上下文.srfpartnerid`)<br>




<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`AUTHOR_GUEST_ID`,
t1.`AUTHOR_ID`,
t1.`BODY`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`DATE`,
t1.`EMAIL_ADD_SIGNATURE`,
t1.`EMAIL_FROM`,
t1.`EMAIL_LAYOUT_XMLID`,
t1.`ID`,
t1.`IS_INTERNAL`,
t1.`MAIL_ACTIVITY_TYPE_ID`,
t1.`MESSAGE_ID`,
t1.`MESSAGE_TYPE`,
t1.`MODEL`,
t11.`AUTHOR_ID` AS `PARENT_AUTHOR_ID`,
t11.`BODY` AS `PARENT_BODY`,
t1.`PARENT_ID`,
t1.`PINNED_AT`,
t1.`RECORD_ALIAS_DOMAIN_ID`,
t1.`RECORD_COMPANY_ID`,
t1.`RECORD_NAME`,
t1.`REPLY_TO`,
t1.`REPLY_TO_FORCE_NEW`,
t1.`RES_ID`,
t1.`SUBJECT`,
t1.`SUBTYPE_ID`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `mail_message` t1 
LEFT JOIN `mail_message` t11 ON t1.`PARENT_ID` = t11.`ID` 

WHERE EXISTS(SELECT * FROM `MAIL_MESSAGE_RECIPIENT` t21 
 WHERE 
 t1.`ID` = t21.`MESSAGE_ID`  AND  ( t21.`PARTNER_ID` = #{ctx.sessioncontext.srfpartnerid} ) )
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