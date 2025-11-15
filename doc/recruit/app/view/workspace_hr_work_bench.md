# 重要事项(workspace_hr_work_bench)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 列表(list)
#### 列表(list1)
#### 列表(list2)
#### 列表(list3)
#### 列表(list4)
#### 列表(list5)
#### 列表(list6)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)


### 关联界面行为
  * [工作台(WORKSPACE)](module/base/workspace) : [打开候选人申请_沟通offer](module/base/workspace#界面行为)
  * [工作台(WORKSPACE)](module/base/workspace) : [打开候选人申请_复试](module/base/workspace#界面行为)
  * [工作台(WORKSPACE)](module/base/workspace) : [打开候选人申请_初试](module/base/workspace#界面行为)
  * [工作台(WORKSPACE)](module/base/workspace) : [打开候选人申请_初筛](module/base/workspace#界面行为)
  * [工作台(WORKSPACE)](module/base/workspace) : [打开我的面试](module/base/workspace#界面行为)
  * [工作台(WORKSPACE)](module/base/workspace) : [打开候选人申请_待入职](module/base/workspace#界面行为)

### 关联界面逻辑
  * [工作台(WORKSPACE)](module/base/workspace) : [提示](module/base/workspace/uilogic/message)

### 关联视图
  * [候选人管理(hr_applicant_list_view)](app/view/hr_applicant_list_view)
  * [面试安排(hr_interview_interview_list_calendar_view)](app/view/hr_interview_interview_list_calendar_view)
  * [面试安排(hr_interview_interview_list_grid_view)](app/view/hr_interview_interview_list_grid_view)
  * [面试安排(hr_interview_interview_list_tab_exp_view)](app/view/hr_interview_interview_list_tab_exp_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>