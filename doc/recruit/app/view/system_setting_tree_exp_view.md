# 设置(system_setting_tree_exp_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 搜索栏(searchbar)
#### 树视图导航栏(treeexpbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联视图
  * [招聘平台账号基础表格信息(hr_job_platform_account_platform_account_info)](app/view/hr_job_platform_account_platform_account_info)
  * [招聘平台(hr_job_platform_platform_list_view)](app/view/hr_job_platform_platform_list_view)
  * [招聘流程设置(hr_recruitment_progress_grid_view)](app/view/hr_recruitment_progress_grid_view)
  * [招聘阶段设置(hr_recruitment_stage_grid_view)](app/view/hr_recruitment_stage_grid_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>