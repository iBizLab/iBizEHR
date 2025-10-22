# 招聘需求(hr_idea_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(tabtoolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [招聘需求(HR_IDEA)](module/hr/hr_idea) : [表格界面_新建操作](module/hr/hr_idea#界面行为)

### 关联视图
  * [招聘需求(hr_idea_edit_view)](app/view/hr_idea_edit_view)
  * [招聘需求(hr_idea_redirect_view)](app/view/hr_idea_redirect_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>