# 应用市场(PSCorePrdFuncTreeExpView)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 搜索栏(searchbar)
#### 树视图导航栏(treeexpbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联视图
  * [已安装应用(PSCorePrdFuncInstalledGridView)](app/view/PSCorePrdFuncInstalledGridView)
  * [应用市场(PSCorePrdFuncMarketApplicationView)](app/view/PSCorePrdFuncMarketApplicationView)
  * [核心产品(PSCorePrdMarketApplicationView)](app/view/PSCorePrdMarketApplicationView)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>