# 招聘流程设置(hr_recruitment_progress_grid_view)  <!-- {docsify-ignore-all} -->



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
  * [招聘流程(HR_RECRUITMENT_PROGRESS)](module/hr/hr_recruitment_progress) : [停用](module/hr/hr_recruitment_progress#界面行为)
  * [招聘流程(HR_RECRUITMENT_PROGRESS)](module/hr/hr_recruitment_progress) : [配置](module/hr/hr_recruitment_progress#界面行为)
  * [招聘流程(HR_RECRUITMENT_PROGRESS)](module/hr/hr_recruitment_progress) : [启用](module/hr/hr_recruitment_progress#界面行为)
  * [招聘流程(HR_RECRUITMENT_PROGRESS)](module/hr/hr_recruitment_progress) : [表格界面_新建操作](module/hr/hr_recruitment_progress#界面行为)

### 关联视图
  * [建立招聘流程(hr_recruitment_progress_quick_create_view)](app/view/hr_recruitment_progress_quick_create_view)
  * [招聘流程(hr_recruitment_progress_redirect_view)](app/view/hr_recruitment_progress_redirect_view)
  * [设计(psdemslogicmslogicdesign_modal)](app/view/psdemslogicmslogicdesign_modal)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>