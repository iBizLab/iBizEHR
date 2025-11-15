# 安排活动(mail_activity_schedulequick_create_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 编辑表单(form)

##### 部件逻辑
* `onLoadDraftSuccess`
```
const app = ibiz.hub.getApp(context.srfappid);
const deService = await app.deService.getService(context, "ehrapp.mail_activity_type");
const result = await deService.fetchDefault(context);
const actType = result.data?.[0]; 

if (!actType) {
    console.log('Result is empty or not an array');
    return;
}

Object.assign(data[0], {
    activity_type_id: actType.id,
    summary: actType.summary,
    note: actType.default_note,
    chaining_type: actType.chaining_type,
});




```
#### 工具栏(toolbar)


### 关联界面行为
  * [活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule) : [安排并标记完成](module/mail/mail_activity_schedule#界面行为)
  * [活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule) : [完成并安排下一个](module/mail/mail_activity_schedule#界面行为)
  * [活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule) : [安排](module/mail/mail_activity_schedule#界面行为)

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