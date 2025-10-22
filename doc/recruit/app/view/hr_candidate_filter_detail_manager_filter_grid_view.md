# 筛选候选人明细(hr_candidate_filter_detail_manager_filter_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联视图
  * [筛选候选人明细(hr_candidate_filter_detail_edit_view)](app/view/hr_candidate_filter_detail_edit_view)
  * [筛选候选人明细(hr_candidate_filter_detail_redirect_view)](app/view/hr_candidate_filter_detail_redirect_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>