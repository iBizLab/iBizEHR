# 员工计划(mail_activity_planmulti_data_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 数据视图(dataview)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [活动计划(MAIL_ACTIVITY_PLAN)](module/mail/mail_activity_plan) : [表格界面_新建操作](module/mail/mail_activity_plan#界面行为)

### 关联视图
  * [员工计划(mail_activity_planmain_view)](app/view/mail_activity_planmain_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>