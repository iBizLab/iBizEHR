## 当前用户权限组(cur_user_ref) <!-- {docsify-ignore-all} -->



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

> [!ATTENTION|label:存在长文本属性]
>
> `COMMENT(评论)`




### 查询连接
* **?**<br>
连接关系：[DER1N_RES_GROUPS_USERS_REL_RES_GROUPS_GID](der/DER1N_RES_GROUPS_USERS_REL_RES_GROUPS_GID)<br>
连接实体：[权限组](module/base/res_groups)<br>
    * **RES_USERS相关N:1（INNER JOIN）DER1N_RES_GROUPS_USERS_REL_RES_USERS_USER_ID_9921DA**<br>
连接关系：[DER1N_RES_GROUPS_USERS_REL_RES_USERS_USER_ID](der/DER1N_RES_GROUPS_USERS_REL_RES_USERS_USER_ID)<br>
连接实体：[用户](module/base/res_users)<br>
连接条件：(`PARTNER_ID(相关合作伙伴)` EQ `用户上下文.srfpartnerid`)<br>




<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`API_KEY_DURATION`,
t1.`CATEGORY_ID`,
t11.`NAME` AS `CATEGORY_NAME`,
t1.`COLOR`,
t1.`COMMENT`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t1.`ID`,
t1.`NAME`,
t1.`SHARE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `res_groups` t1 
LEFT JOIN `ir_module_category` t11 ON t1.`CATEGORY_ID` = t11.`ID` 

WHERE EXISTS(SELECT * FROM `res_groups_users_rel` t21 
LEFT JOIN `res_users` t31 ON t21.`USER_ID` = t31.`ID` 
 WHERE 
 t1.`ID` = t21.`GID`  AND  ( t31.`PARTNER_ID` = #{ctx.sessioncontext.srfpartnerid} ) )
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