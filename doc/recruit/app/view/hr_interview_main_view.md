# 面试安排列表(hr_interview_main_view)  <!-- {docsify-ignore-all} -->



## 控件
#### 日历部件(calendar)
#### CAPTIONBAR(captionbar)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [面试(HR_INTERVIEW)](module/hr/hr_interview) : [添加面试](module/hr/hr_interview#界面行为)
  * [面试(HR_INTERVIEW)](module/hr/hr_interview) : [预约面试](module/hr/hr_interview#界面行为)

### 关联视图
  * [新建面试安排(hr_interview_schedule_create_option_view)](app/view/hr_interview_schedule_create_option_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>