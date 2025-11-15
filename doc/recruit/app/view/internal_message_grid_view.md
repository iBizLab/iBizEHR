# 消息通知(internal_message_grid_view)  <!-- {docsify-ignore-all} -->



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
  * [消息通知(INTERNAL_MESSAGE)](module/extension/internal_message) : [表格界面_编辑操作](module/extension/internal_message#界面行为)
  * [消息通知(INTERNAL_MESSAGE)](module/extension/internal_message) : [表格界面_删除操作](module/extension/internal_message#界面行为)
  * [消息通知(INTERNAL_MESSAGE)](module/extension/internal_message) : [表格界面_新建操作](module/extension/internal_message#界面行为)

### 关联视图
  * [消息通知(internal_message_edit_view)](app/view/internal_message_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>