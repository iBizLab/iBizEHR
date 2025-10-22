# 面试(hr_interview_current_grid_view)  <!-- {docsify-ignore-all} -->



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
  * [面试(HR_INTERVIEW)](module/hr/hr_interview) : [查看面试](module/hr/hr_interview#界面行为)

### 关联视图
  * [面试(hr_interview_edit_view)](app/view/hr_interview_edit_view)
  * [面试(hr_interview_redirect_view)](app/view/hr_interview_redirect_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>