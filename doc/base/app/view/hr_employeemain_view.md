# 员工(hr_employeemain_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 单视图面板(control)
#### DATAINFOBAR(datainfobar)
#### 数据关系栏(drbar)
#### 编辑表单(form)
#### 工具栏(toolbar)
#### 工具栏(toolbar1)


### 关联界面行为
  * [邮件会话(MAIL_THREAD)](module/mail/mail_thread) : [清空评论](module/mail/mail_thread#界面行为)
  * [员工(HR_EMPLOYEE)](module/hr/hr_employee) : [编辑界面_保存并新建操作](module/hr/hr_employee#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [回复](module/mail/mail_message#界面行为)
  * [员工(HR_EMPLOYEE)](module/hr/hr_employee) : [编辑界面_保存操作](module/hr/hr_employee#界面行为)
  * [邮件会话(MAIL_THREAD)](module/mail/mail_thread) : [打开安排活动视图](module/mail/mail_thread#界面行为)
  * [邮件会话(MAIL_THREAD)](module/mail/mail_thread) : [添加附件](module/mail/mail_thread#界面行为)
  * [员工(HR_EMPLOYEE)](module/hr/hr_employee) : [取消变更](module/hr/hr_employee#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [编辑](module/mail/mail_message#界面行为)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [删除评论](module/mail/mail_message#界面行为)
  * [邮件会话(MAIL_THREAD)](module/mail/mail_thread) : [发送评论](module/mail/mail_thread#界面行为)
  * [附件(IR_ATTACHMENT)](module/base/ir_attachment) : [附件下载](module/base/ir_attachment#界面行为)

### 关联界面逻辑
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [控制评论按钮隐藏](module/mail/mail_message/uilogic/comment_icon_hidden)
  * [单据关注者(MAIL_FOLLOWERS)](module/mail/mail_followers) : [关注人员更新(嵌入)](module/mail/mail_followers/uilogic/attention_personnel_update_emb)
  * [消息(MAIL_MESSAGE)](module/mail/mail_message) : [控制评论按钮显示](module/mail/mail_message/uilogic/comment_icon_show)
  * [附件(IR_ATTACHMENT)](module/base/ir_attachment) : [删除附件数据](module/base/ir_attachment/uilogic/delete_attachment)

### 关联视图
  * [部门(hr_departmentPickupView)](app/view/hr_departmentPickupView)
  * [组织图表(hr_employeeorg_chart_view)](app/view/hr_employeeorg_chart_view)
  * [工作岗位(hr_jobPickupView)](app/view/hr_jobPickupView)
  * [工作地点(hr_work_locationPickupView)](app/view/hr_work_locationPickupView)
  * [安排活动(mail_activity_schedulequick_create_view)](app/view/mail_activity_schedulequick_create_view)
  * [邮件会话(mail_thread_component_view)](app/view/mail_thread_component_view)
  * [公司(res_companyPickupView)](app/view/res_companyPickupView)
  * [国家/地区(res_countryPickupView)](app/view/res_countryPickupView)
  * [联系人(res_partnerPickupView)](app/view/res_partnerPickupView)
  * [联系人(res_partnermain_view)](app/view/res_partnermain_view)
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