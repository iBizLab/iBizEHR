# 行为附加 <!-- {docsify-ignore-all} -->

## [头像混合(AVATAR_MIXIN)](module/base/avatar_mixin.md)  :id=avatar_mixin

#### [Create](module/base/avatar_mixin#行为) :id=avatar_mixin_Create



<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [存储头像(save_avater)](module/base/avatar_mixin/logic/save_avater.md)




#### [Update](module/base/avatar_mixin#行为) :id=avatar_mixin_Update



<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [存储头像(save_avater)](module/base/avatar_mixin/logic/save_avater.md)





## [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel.md)  :id=discuss_channel

#### [Create](module/discuss/discuss_channel#行为) :id=discuss_channel_Create




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建后加入频道(fill_default_member)](module/discuss/discuss_channel/logic/fill_default_member.md)



## [员工(HR_EMPLOYEE)](module/hr/hr_employee.md)  :id=hr_employee

#### [Create](module/hr/hr_employee#行为) :id=hr_employee_Create


<p class="panel-title"><b>数据准备</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [准备默认用户数据对象(prepare_default_user)](module/hr/hr_employee/logic/prepare_default_user.md)



<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [建立之前(before_create)](module/hr/hr_employee/logic/before_create.md)





## [消息(MAIL_MESSAGE)](module/mail/mail_message.md)  :id=mail_message

#### [Create](module/mail/mail_message#行为) :id=mail_message_Create




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建评论后通知(after_create_notify)](module/mail/mail_message/logic/after_create_notify.md)



## [EMail模板(MAIL_TEMPLATE)](module/mail/mail_template.md)  :id=mail_template

#### [Update](module/mail/mail_template#行为) :id=mail_template_Update




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [刷新消息模板缓存(refresh_cache)](module/mail/mail_template/logic/refresh_cache.md)



## [资源装饰(RESOURCE_MIXIN)](module/resource/resource_mixin.md)  :id=resource_mixin

#### [Create](module/resource/resource_mixin#行为) :id=resource_mixin_Create


<p class="panel-title"><b>数据准备</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建逻辑(prepare_create)](module/resource/resource_mixin/logic/prepare_create.md)






## [资源(RESOURCE_RESOURCE)](module/resource/resource_resource.md)  :id=resource_resource

#### [Create](module/resource/resource_resource#行为) :id=resource_resource_Create



<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [建立之前(before_create)](module/resource/resource_resource/logic/before_create.md)





## [用户(RES_USERS)](module/base/res_users.md)  :id=res_users

#### [Create](module/base/res_users#行为) :id=res_users_Create


<p class="panel-title"><b>数据准备</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [准备建立(prepare_create)](module/base/res_users/logic/prepare_create.md)




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [cloud用户同步(sync_cloud_user)](module/base/res_users/logic/sync_cloud_user.md)


#### [Remove](module/base/res_users#行为) :id=res_users_Remove




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [禁用cloud用户(invalid_cloud_user)](module/base/res_users/logic/invalid_cloud_user.md)


#### [Update](module/base/res_users#行为) :id=res_users_Update




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [cloud用户同步(sync_cloud_user)](module/base/res_users/logic/sync_cloud_user.md)


#### [修改密码(change_password)](module/base/res_users#行为) :id=res_users_change_password




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [修改cloud用户密码(change_cloud_user_pwd)](module/base/res_users/logic/change_cloud_user_pwd.md)









