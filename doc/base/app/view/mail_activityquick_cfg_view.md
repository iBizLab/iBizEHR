# 安排活动(mail_activityquick_cfg_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)


### 关联界面行为
  * [活动(MAIL_ACTIVITY)](module/mail/mail_activity) : [编辑界面_保存并退出操作](module/mail/mail_activity#界面行为)
  * [活动(MAIL_ACTIVITY)](module/mail/mail_activity) : [标记为完成](module/mail/mail_activity#界面行为)
  * [活动(MAIL_ACTIVITY)](module/mail/mail_activity) : [完成并安排下一个](module/mail/mail_activity#界面行为)

### 关联视图
  * [活动类型(mail_activity_typePickupView)](app/view/mail_activity_typePickupView)
  * [用户(res_usersPickupView)](app/view/res_usersPickupView)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>