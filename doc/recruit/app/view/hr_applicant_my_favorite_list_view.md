# 我关注的(hr_applicant_my_favorite_list_view)  <!-- {docsify-ignore-all} -->



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
  * [候选人申请(HR_APPLICANT)](module/hr/hr_applicant) : [查看候选人信息](module/hr/hr_applicant#界面行为)

### 关联视图
  * [候选人申请(hr_applicant_edit_view)](app/view/hr_applicant_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>