# 处理逻辑 <!-- {docsify-ignore-all} -->

## [头像混合(AVATAR_MIXIN)](module/base/avatar_mixin.md) :id=avatar_mixin

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[存储头像](module/base/avatar_mixin/logic/save_avater)|save_avater|无|||
|[计算头像](module/base/avatar_mixin/logic/compute_avatar)|compute_avatar|属性逻辑|||







## [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel.md) :id=discuss_channel

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[新建后加入频道](module/discuss/discuss_channel/logic/fill_default_member)|fill_default_member|无|||
|[添加邀请成员](module/discuss/discuss_channel/logic/add_members)|add_members|无|||
|[离开频道](module/discuss/discuss_channel/logic/unfollow)|unfollow|无||后续还需补充退订等逻辑|
|[计算是否是频道的成员](module/discuss/discuss_channel/logic/compute_is_member)|compute_is_member|属性逻辑|||









## [部门(HR_DEPARTMENT)](module/hr/hr_department.md) :id=hr_department

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[部门计数器](module/hr/hr_department/logic/department_counter)|department_counter|无|||


## [员工(HR_EMPLOYEE)](module/hr/hr_employee.md) :id=hr_employee

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[公司员工计数器](module/hr/hr_employee/logic/company_staff_counter)|company_staff_counter|无|||
|[准备默认用户数据对象](module/hr/hr_employee/logic/prepare_default_user)|prepare_default_user|无|||
|[员工计数器](module/hr/hr_employee/logic/emp_counter)|emp_counter|无|||
|[建立之前](module/hr/hr_employee/logic/before_create)|before_create|无|||
|[生成徽标 ID](module/hr/hr_employee/logic/generate_random_barcode)|generate_random_barcode|无|||
|[用户变更](module/hr/hr_employee/logic/onchange_user)|onchange_user|无|||






## [图片混合(IMAGE_MIXIN)](module/base/image_mixin.md) :id=image_mixin

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[图片属性存储至附件](module/base/image_mixin/logic/image_stored)|image_stored|无||暂不使用|








## [规则(IR_RULE)](module/base/ir_rule.md) :id=ir_rule

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[计算全局](module/base/ir_rule/logic/compute_global)|compute_global|属性逻辑|||




## [活动(MAIL_ACTIVITY)](module/mail/mail_activity.md) :id=mail_activity

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[compute_deadline_day](module/mail/mail_activity/logic/compute_deadline_day)|compute_deadline_day|属性逻辑|||
|[compute_state](module/mail/mail_activity/logic/compute_state)|compute_state|属性逻辑|||
|[完成活动](module/mail/mail_activity/logic/action_done)|action_done|无||1.根据活动类型的keep_done判断活动是归档还是删除;<br>2.生成活动完成消息到message；<br>3.活动关联的附件换绑：<br>由绑定活动改绑成绑定消息<br>4.当活动类型的链接类型=trigger,生成下一个活动<br>5.最后返回下一个活动的id,因为"完成并下一个界面行为"需要id来判断是否重新打开新建活动页面<br><br>|
|[延迟活动](module/mail/mail_activity/logic/action_snooze)|action_snooze|无|||


## [活动Mixin(MAIL_ACTIVITY_MIXIN)](module/mail/mail_activity_mixin.md) :id=mail_activity_mixin

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[处理活动状态](module/mail/mail_activity_mixin/logic/process_activities)|process_activities|属性逻辑|||


## [活动计划(MAIL_ACTIVITY_PLAN)](module/mail/mail_activity_plan.md) :id=mail_activity_plan

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[步数计数计算](module/mail/mail_activity_plan/logic/compute_steps_count)|compute_steps_count|属性逻辑|||



## [活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule.md) :id=mail_activity_schedule

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[nothing](module/mail/mail_activity_schedule/logic/nothing)|nothing|无|||
|[安排](module/mail/mail_activity_schedule/logic/action_schedule_activities)|action_schedule_activities|无|||
|[安排并标记完成](module/mail/mail_activity_schedule/logic/schedule_activities_done)|schedule_activities_done|无||1.新建活动；<br>2.活动标记完成，并且根据活动类型生成下一个活动；<br>3.返回下一个活动的id；|


## [活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type.md) :id=mail_activity_type

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[获取到期日期](module/mail/mail_activity_type/logic/get_date_deadline)|get_date_deadline|无|||






## [消息(MAIL_MESSAGE)](module/mail/mail_message.md) :id=mail_message

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[删除评论](module/mail/mail_message/logic/delete)|delete|无||评论数据的删除，将评论内容重置为：该评论已删除|
|[取消置顶](module/mail/mail_message/logic/unpin)|unpin|无|||
|[新建评论后通知](module/mail/mail_message/logic/after_create_notify)|after_create_notify|无||发表评论后，发送通知消息至相应负责人员、关注人员|
|[置顶](module/mail/mail_message/logic/pin)|pin|无|||




## [EMail模板(MAIL_TEMPLATE)](module/mail/mail_template.md) :id=mail_template

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[刷新消息模板缓存](module/mail/mail_template/logic/refresh_cache)|refresh_cache|无|||


## [邮件会话(MAIL_THREAD)](module/mail/mail_thread.md) :id=mail_thread

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[message_post](module/mail/mail_thread/logic/message_post)|message_post|无||//TODO<br>待完善消息发送逻辑，目前简单构造消息并新建<br>注意忽略传入的<br>res_id、model等，由继承实体提取写入|
|[message_post_with_source](module/mail/mail_thread/logic/message_post_with_source)|message_post_with_source|无||//TODO<br>待完善带模板转换消息发送逻辑，目前简单构造消息并新建|
|[计算附件数](module/mail/mail_thread/logic/compute_attach_count)|compute_attach_count|属性逻辑|||





## [资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar.md) :id=resource_calendar

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[填充资源工作时间数据](module/resource/resource_calendar/logic/fill_data)|fill_data|无|||



## [资源装饰(RESOURCE_MIXIN)](module/resource/resource_mixin.md) :id=resource_mixin

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[新建逻辑](module/resource/resource_mixin/logic/prepare_create)|prepare_create|无|||


## [资源(RESOURCE_RESOURCE)](module/resource/resource_resource.md) :id=resource_resource

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[建立之前](module/resource/resource_resource/logic/before_create)|before_create|无|||







## [权限组(RES_GROUPS)](module/base/res_groups.md) :id=res_groups

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[组名称计算](module/base/res_groups/logic/compute_full_name)|compute_full_name|属性逻辑|||




## [联系人(RES_PARTNER)](module/base/res_partner.md) :id=res_partner

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[获取全名](module/base/res_partner/logic/get_complete_name)|get_complete_name|无|||
|[计算全名](module/base/res_partner/logic/compute_complete_name)|compute_complete_name|属性逻辑|||
|[计算公司类型](module/base/res_partner/logic/compute_company_type)|compute_company_type|属性逻辑|||
|[计算显示名称](module/base/res_partner/logic/compute_display_name)|compute_display_name|属性逻辑|||




## [用户(RES_USERS)](module/base/res_users.md) :id=res_users

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[cloud用户同步](module/base/res_users/logic/sync_cloud_user)|sync_cloud_user|无|||
|[修改cloud用户密码](module/base/res_users/logic/change_cloud_user_pwd)|change_cloud_user_pwd|无|||
|[修改密码](module/base/res_users/logic/change_password)|change_password|无|||
|[准备建立](module/base/res_users/logic/prepare_create)|prepare_create|无|||
|[当前登录人的user](module/base/res_users/logic/current_user)|current_user|无||根据srfpartnerid获取user信息|
|[禁用cloud用户](module/base/res_users/logic/invalid_cloud_user)|invalid_cloud_user|无|||
|[计算状态](module/base/res_users/logic/compute_state)|compute_state|属性逻辑|||







