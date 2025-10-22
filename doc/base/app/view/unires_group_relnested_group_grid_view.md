# 权限组关联统一资源(unires_group_relnested_group_grid_view)  <!-- {docsify-ignore-all} -->


系统自动添加



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
  * [权限组关联统一资源(UNIRES_GROUP_REL)](module/base_extend/unires_group_rel) : [表格界面_新建操作](module/base_extend/unires_group_rel#界面行为)
  * [权限组关联统一资源(UNIRES_GROUP_REL)](module/base_extend/unires_group_rel) : [表格界面_删除操作](module/base_extend/unires_group_rel#界面行为)

### 关联视图
  * [权限组关联统一资源(unires_group_relEditView)](app/view/unires_group_relEditView)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>