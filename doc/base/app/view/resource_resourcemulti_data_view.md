# 资源(resource_resourcemulti_data_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [资源(RESOURCE_RESOURCE)](module/resource/resource_resource) : [表格界面_新建操作](module/resource/resource_resource#界面行为)

### 关联视图
  * [资源(resource_resourcemain_view)](app/view/resource_resourcemain_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>