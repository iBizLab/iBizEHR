# 待创建的活动(mail_activity_plan_templateGridView)  <!-- {docsify-ignore-all} -->


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
  * [活动计划模板(MAIL_ACTIVITY_PLAN_TEMPLATE)](module/mail/mail_activity_plan_template) : [表格界面_新建操作](module/mail/mail_activity_plan_template#界面行为)
  * [活动计划模板(MAIL_ACTIVITY_PLAN_TEMPLATE)](module/mail/mail_activity_plan_template) : [表格界面_删除操作](module/mail/mail_activity_plan_template#界面行为)

### 关联视图
  * [活动计划模板(mail_activity_plan_templatequick_create_view)](app/view/mail_activity_plan_templatequick_create_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>