# 公共假期类型(public_leave_type_grid_view)  <!-- {docsify-ignore-all} -->



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
  * [公共假期类型(PUBLIC_LEAVE_TYPE)](module/resource/public_leave_type) : [表格界面_新建行](module/resource/public_leave_type#界面行为)
  * [公共假期类型(PUBLIC_LEAVE_TYPE)](module/resource/public_leave_type) : [表格界面_删除操作](module/resource/public_leave_type#界面行为)

### 关联视图
  * [公共假期类型(public_leave_type_edit_view)](app/view/public_leave_type_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>