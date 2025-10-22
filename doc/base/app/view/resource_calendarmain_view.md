# 工作时间表(resource_calendarmain_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 数据关系栏(drbar)
#### 编辑表单(form)
#### 工具栏(toolbar)
#### 工具栏(toolbar1)


### 关联界面行为
  * [资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar) : [取消变更](module/resource/resource_calendar#界面行为)
  * [资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar) : [编辑界面_保存操作](module/resource/resource_calendar#界面行为)
  * [资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar) : [编辑界面_保存并新建操作](module/resource/resource_calendar#界面行为)

### 关联视图
  * [公司(res_companyPickupView)](app/view/res_companyPickupView)
  * [工作细节(resource_calendar_attendancegrid_view_nested)](app/view/resource_calendar_attendancegrid_view_nested)
  * [资源(resource_resourcemulti_data_view)](app/view/resource_resourcemulti_data_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>