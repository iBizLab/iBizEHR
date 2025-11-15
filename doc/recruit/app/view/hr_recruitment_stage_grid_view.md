# 招聘阶段设置(hr_recruitment_stage_grid_view)  <!-- {docsify-ignore-all} -->



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
  * [ 招聘阶段(HR_RECRUITMENT_STAGE)](module/hr/hr_recruitment_stage) : [表格界面_编辑操作](module/hr/hr_recruitment_stage#界面行为)
  * [ 招聘阶段(HR_RECRUITMENT_STAGE)](module/hr/hr_recruitment_stage) : [表格界面_新建操作](module/hr/hr_recruitment_stage#界面行为)
  * [ 招聘阶段(HR_RECRUITMENT_STAGE)](module/hr/hr_recruitment_stage) : [停用](module/hr/hr_recruitment_stage#界面行为)
  * [ 招聘阶段(HR_RECRUITMENT_STAGE)](module/hr/hr_recruitment_stage) : [启用](module/hr/hr_recruitment_stage#界面行为)

### 关联视图
  * [建立招聘阶段(hr_recruitment_stage_quick_create_view)](app/view/hr_recruitment_stage_quick_create_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>