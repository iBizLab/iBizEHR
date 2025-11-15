# 组织(res_company_grid_view)  <!-- {docsify-ignore-all} -->



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
  * [组织(RES_COMPANY)](module/base/res_company) : [表格界面_新建操作](module/base/res_company#界面行为)
  * [组织(RES_COMPANY)](module/base/res_company) : [表格界面_删除操作](module/base/res_company#界面行为)
  * [组织(RES_COMPANY)](module/base/res_company) : [表格界面_编辑操作](module/base/res_company#界面行为)

### 关联视图
  * [组织(res_company_edit_view)](app/view/res_company_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>