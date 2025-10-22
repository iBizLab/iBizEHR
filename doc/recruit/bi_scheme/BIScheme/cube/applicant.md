# 候选人申请(applicant)  <!-- {docsify-ignore-all} -->


<br>
<p class="panel-title"><b>实体</b></p>

* [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)



<p class="panel-title"><b>数据集合</b></p>

* [bi_search](module/hr/hr_applicant/dataset/bi_search)

### 维度
##### 常规维度
|    名称col200   | 代码名col150      | 属性col350    |  备注col500  |
| --------  |------------| -----   |  --------|
|招聘平台|w_job_platform_name|招聘平台名称(JOB_PLATFORM_NAME)||
|招聘负责人|w_owner_name|招聘负责人名称(OWNER_NAME)||
|招聘阶段|w_stage_id|招聘阶段(STAGE_ID)||
|简历来源|w_resume_source|简历来源(RESUME_SOURCE)||
|职位|w_job_name|求职岗位名称(JOB_NAME)||

### 指标
##### 计算式指标
|    名称col200   | 代码名col150  |  计算公式col501   |  备注col500  |
| --------  |------------| -----   |  --------|
|申请数量|count|countif(1 = 1)||

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>