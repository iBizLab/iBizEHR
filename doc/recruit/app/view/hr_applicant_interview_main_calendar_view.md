# 面试安排日历视图(hr_applicant_interview_main_calendar_view)  <!-- {docsify-ignore-all} -->



## 控件
#### 工具栏(add_interview)
#### 日历部件(calendar)
#### CAPTIONBAR(captionbar)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [候选人申请与面试关系(HR_APPLICANT_INTERVIEW)](module/hr/hr_applicant_interview) : [预约面试](module/hr/hr_applicant_interview#界面行为)
  * [候选人申请与面试关系(HR_APPLICANT_INTERVIEW)](module/hr/hr_applicant_interview) : [添加面试](module/hr/hr_applicant_interview#界面行为)

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