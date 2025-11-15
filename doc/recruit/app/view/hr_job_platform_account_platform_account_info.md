# 招聘平台账号基础表格信息(hr_job_platform_account_platform_account_info)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [招聘平台账号(HR_JOB_PLATFORM_ACCOUNT)](module/hr/hr_job_platform_account) : [表格界面_编辑操作](module/hr/hr_job_platform_account#界面行为)
  * [招聘平台账号(HR_JOB_PLATFORM_ACCOUNT)](module/hr/hr_job_platform_account) : [表格界面_新建操作](module/hr/hr_job_platform_account#界面行为)
  * [招聘平台账号(HR_JOB_PLATFORM_ACCOUNT)](module/hr/hr_job_platform_account) : [表格界面_删除操作](module/hr/hr_job_platform_account#界面行为)

### 关联视图
  * [招聘平台账号(hr_job_platform_account_edit_view)](app/view/hr_job_platform_account_edit_view)
  * [招聘平台账号(hr_job_platform_account_redirect_view)](app/view/hr_job_platform_account_redirect_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>