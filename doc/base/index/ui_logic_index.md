# 界面逻辑 <!-- {docsify-ignore-all} -->
















## [员工(HR_EMPLOYEE)](module/hr/hr_employee.md) :id=hr_employee

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[打开员工基本信息视图](module/hr/hr_employee/uilogic/open_emp_info_view)|open_emp_info_view||







## [附件(IR_ATTACHMENT)](module/base/ir_attachment.md) :id=ir_attachment

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[删除附件数据](module/base/ir_attachment/uilogic/delete_attachment)|delete_attachment|调用附件删除行为，删除附件数据|
|[添加附件数据](module/base/ir_attachment/uilogic/add_attachment)|add_attachment|调用附件上传行为，添加附件数据|










## [活动(MAIL_ACTIVITY)](module/mail/mail_activity.md) :id=mail_activity

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[刷新活动列表](module/mail/mail_activity/uilogic/refresh_activity)|refresh_activity|刷新|
|[刷新活动和消息列表](module/mail/mail_activity/uilogic/refresh_activity_message)|refresh_activity_message|刷新|
|[完成并安排下一个](module/mail/mail_activity/uilogic/done_next)|done_next|如果执行活动安排标记完成实体行为返回下一个活动的id，则关闭弹窗,反之打开安排活动视图|





## [活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule.md) :id=mail_activity_schedule

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[刷新活动和消息列表](module/mail/mail_activity_schedule/uilogic/refresh_activity_message)|refresh_activity_message|刷新|
|[完成并安排下一个](module/mail/mail_activity_schedule/uilogic/done_next)|done_next|如果执行活动安排标记完成实体行为返回下一个活动的id，则关闭弹窗,反之刷新当前表单|





## [单据关注者(MAIL_FOLLOWERS)](module/mail/mail_followers.md) :id=mail_followers

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[关注人员更新(嵌入)](module/mail/mail_followers/uilogic/attention_personnel_update_emb)|attention_personnel_update_emb|获取关注人员信息，并根据类别更新|



## [消息(MAIL_MESSAGE)](module/mail/mail_message.md) :id=mail_message

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[刷新评论列表](module/mail/mail_message/uilogic/refresh_comment)|refresh_comment|刷新|
|[发送评论](module/mail/mail_message/uilogic/send_comment)|send_comment|发送评论，并关闭评论输入框|
|[回复评论](module/mail/mail_message/uilogic/reply_comment)|reply_comment|获取回复对象评论信息，并展开评论输入框，显示回复组件|
|[控制评论按钮显示](module/mail/mail_message/uilogic/comment_icon_show)|comment_icon_show|显示评论按钮|
|[控制评论按钮隐藏](module/mail/mail_message/uilogic/comment_icon_hidden)|comment_icon_hidden|获取部件状态信息，通过直接赋值，控制指定部件显示隐藏|
|[清空评论](module/mail/mail_message/uilogic/clear_comment)|clear_comment|清空当前输入框内已输入内容|
|[编辑评论](module/mail/mail_message/uilogic/edit_comment)|edit_comment|编辑评论，获取评论数据，展开评论输入框并赋值|








## [核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc.md) :id=PSCorePrdFunc

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[clone此应用](module/extension/PSCorePrdFunc/uilogic/clone_git)|clone_git||
|[初始化插件信息](module/extension/PSCorePrdFunc/uilogic/init_plugin_info)|init_plugin_info|进入扩展设置时，从setting中获取插件标识和插件库|
|[更新插件设置](module/extension/PSCorePrdFunc/uilogic/update_plugin_setting)|update_plugin_setting|插件库更改后，更新setting字段|
|[跳转gitlab](module/extension/PSCorePrdFunc/uilogic/skip_gitlab)|skip_gitlab||
|[跳转应用详情页面](module/extension/PSCorePrdFunc/uilogic/open_app_info)|open_app_info||
|[跳转设置页面](module/extension/PSCorePrdFunc/uilogic/skip_setting)|skip_setting||

















## [用户(RES_USERS)](module/base/res_users.md) :id=res_users

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[修改密码（表单）](module/base/res_users/uilogic/change_pas)|change_pas|修改密码|







