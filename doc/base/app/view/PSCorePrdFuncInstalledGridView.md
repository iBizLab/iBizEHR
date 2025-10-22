# 已安装应用(PSCorePrdFuncInstalledGridView)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc) : [禁用](module/extension/PSCorePrdFunc#界面行为)
  * [核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc) : [打开卡片详情页面_界面逻辑](module/extension/PSCorePrdFunc#界面行为)

### 关联视图
  * [核心产品功能(PSCorePrdFuncInfoView)](app/view/PSCorePrdFuncInfoView)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>