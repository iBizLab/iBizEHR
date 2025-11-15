# 基础信息表格(hr_job_platform_info_grid_view)  <!-- {docsify-ignore-all} -->



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
  * [招聘平台(HR_JOB_PLATFORM)](module/hr/hr_job_platform) : [表格界面_编辑操作](module/hr/hr_job_platform#界面行为)
  * [招聘平台(HR_JOB_PLATFORM)](module/hr/hr_job_platform) : [表格界面_删除操作](module/hr/hr_job_platform#界面行为)
  * [招聘平台(HR_JOB_PLATFORM)](module/hr/hr_job_platform) : [表格界面_新建操作](module/hr/hr_job_platform#界面行为)

### 关联视图
  * [招聘平台(hr_job_platform_edit_view)](app/view/hr_job_platform_edit_view)
  * [招聘平台(hr_job_platform_redirect_view)](app/view/hr_job_platform_redirect_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>