# 招聘职位(hr_job_list_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 列表(list)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [招聘职位(HR_JOB)](module/hr/hr_job) : [创建职位](module/hr/hr_job#界面行为)

### 关联视图
  * [招聘职位(hr_job_create_wizard_view)](app/view/hr_job_create_wizard_view)
  * [招聘职位(hr_job_edit_view)](app/view/hr_job_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>