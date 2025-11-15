# 筛选候选人明细(hr_candidate_filter_detail_filtered_opinion_list)  <!-- {docsify-ignore-all} -->



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
  * [筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail) : [表格界面_编辑操作](module/hr/hr_candidate_filter_detail#界面行为)
  * [筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail) : [表格界面_新建操作](module/hr/hr_candidate_filter_detail#界面行为)
  * [筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail) : [表格界面_删除操作](module/hr/hr_candidate_filter_detail#界面行为)

### 关联视图
  * [筛选候选人明细(hr_candidate_filter_detail_edit_view)](app/view/hr_candidate_filter_detail_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>