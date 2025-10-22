## 用人经理数据集(hm_myself) <!-- {docsify-ignore-all} -->



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

(`CREATE_UID(建立人)` EQ `用户上下文.srfuserid`)





<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t21.`ADDRESS`,
t21.`CANDIDATE_DISPLAY_NAME`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t21.`EDUCATION`,
t21.`EMAIL_FROM`,
t21.`EXPERIENCE`,
t1.`HR_OFFER_ID`,
t1.`ID`,
t11.`JOB_NAME`,
t31.`NAME` AS `JOB_PLATFORM_NAME`,
t21.`MOBILE_PHONE`,
t1.`NAME`,
t1.`PERIOD`,
t41.`NAME` AS `RES_COMPANY_NAME`,
t1.`STATUS`,
t1.`WFMEMO`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`
FROM `hr_offer_approval` t1 
LEFT JOIN `hr_offer` t11 ON t1.`HR_OFFER_ID` = t11.`ID` 
LEFT JOIN `hr_applicant` t21 ON t11.`APPLICANT_ID` = t21.`ID` 
LEFT JOIN `hr_job_platform` t31 ON t21.`JOB_PLATFORM_ID` = t31.`ID` 
LEFT JOIN `res_company` t41 ON t11.`RES_COMPANY_ID` = t41.`ID` 

WHERE ( t1.`CREATE_UID` = #{ctx.sessioncontext.srfuserid} )
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