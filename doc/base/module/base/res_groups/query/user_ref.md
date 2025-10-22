## 用户归属组(user_ref) <!-- {docsify-ignore-all} -->



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
* **RES_GROUPS_USERS_REL存在1:N（EXISTS (SELECT)）DER1N_RES_GROUPS_USERS_REL_RES_GROUPS_GID_9921DA**<br>
连接关系：[DER1N_RES_GROUPS_USERS_REL_RES_GROUPS_GID](der/DER1N_RES_GROUPS_USERS_REL_RES_GROUPS_GID)<br>
连接实体：[权限组](module/base/res_groups)<br>
连接条件：(`USER_ID(用户)` EQ `数据上下文.user_id`)<br>




<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`API_KEY_DURATION`,
t1.`CATEGORY_ID`,
t11.`NAME` AS `CATEGORY_NAME`,
t1.`COLOR`,
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
 WHERE 
 t1.`ID` = t21.`GID`  AND  ( t21.`USER_ID` = #{ctx.datacontext.user_id} ) )
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