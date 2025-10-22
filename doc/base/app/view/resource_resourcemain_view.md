# 资源(resource_resourcemain_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)


### 关联界面行为
  * [资源(RESOURCE_RESOURCE)](module/resource/resource_resource) : [编辑界面_保存操作](module/resource/resource_resource#界面行为)

### 关联视图
  * [公司(res_companyPickupView)](app/view/res_companyPickupView)
  * [用户(res_usersPickupView)](app/view/res_usersPickupView)
  * [资源工作时间(resource_calendarPickupView)](app/view/resource_calendarPickupView)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>