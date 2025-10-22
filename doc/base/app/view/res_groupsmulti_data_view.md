# 群组(res_groupsmulti_data_view)  <!-- {docsify-ignore-all} -->



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
  * [权限组(RES_GROUPS)](module/base/res_groups) : [表格界面_新建操作](module/base/res_groups#界面行为)

### 关联视图
  * [群组(res_groupsmain_view)](app/view/res_groupsmain_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>